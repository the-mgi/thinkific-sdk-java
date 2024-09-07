package com.the_mgi.thinkific_sdk_java;

import com.the_mgi.thinkific_sdk_java.bundles.BundlesApi;
import com.the_mgi.thinkific_sdk_java.categories.CategoriesApi;
import feign.Feign;
import feign.Request;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import lombok.extern.slf4j.Slf4j;

import java.time.Duration;

import static java.util.Objects.isNull;
import static java.util.Optional.ofNullable;

@Slf4j
public final class AppService {
  private static final int defaultConnectionTimeoutMs = 60_000;
  private static final int defaultReadTimeoutMs = 120_000;
  private static final boolean defaultFollowRedirects = true;

  private final Feign feign;

  private final ProviderProperties properties;
  private BundlesApi bundlesApi;
  private CategoriesApi categoriesApi;

  public AppService(String subdomain) {
    Providers providers = BuildEnvironment.getInstance().getProviders();

    if (!providers.getProviders().containsKey(subdomain))
      throw new IllegalArgumentException("subdomain not found in config");

    this.properties = providers.getProviders().get(subdomain);

    feign = Feign.builder()
      .encoder(new JacksonEncoder())
      .decoder(new JacksonDecoder())
      .requestInterceptor(template -> template
        .header("Accept", "application/json")
        .header("Content-Type", "application/json")
      )
      .options(new Request.Options(Duration.ofMillis(
        ofNullable(this.properties.getConnectionTimeoutMs())
          .or(() -> ofNullable(providers.getConnectionTimeoutMs()))
          .orElse(defaultConnectionTimeoutMs)
      ), Duration.ofMillis(
        ofNullable(this.properties.getReadTimeoutMs())
          .or(() -> ofNullable(providers.getReadTimeoutMs()))
          .orElse(defaultReadTimeoutMs)
      ), ofNullable(this.properties.getFollowRedirects())
        .or(() -> ofNullable(providers.getFollowRedirects()))
        .orElse(defaultFollowRedirects)
      ))
      .errorDecoder(new ThinkificErrorDecoder())
      .build();
  }

  public BundlesApi getBundlesApi() {
    if (isNull(bundlesApi)) {
      loggerFactory.info("initializing BundlesApi");
      bundlesApi = this.feign.newInstance(new AppTarget<>(this.properties, BundlesApi.class));
    }
    return bundlesApi;
  }

  public CategoriesApi getCategoriesApi() {
    if (isNull(categoriesApi)) {
      loggerFactory.info("initializing CategoriesApi");
      categoriesApi = this.feign.newInstance(new AppTarget<>(this.properties, CategoriesApi.class));
    }
    return categoriesApi;
  }
}
