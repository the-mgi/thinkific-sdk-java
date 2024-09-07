package com.the_mgi.thinkific_sdk_java;

import feign.Request;
import feign.RequestTemplate;
import feign.Target;

import java.util.Objects;

public final class AppTarget<T> implements Target<T> {
  private static final String BASE_URL = "https://api.thinkific.com/api/public/v1/";

  private final ProviderProperties providerProperties;
  private final Class<T> type;

  public AppTarget(
    ProviderProperties providerProperties,
    Class<T> type
  ) {
    this.providerProperties = providerProperties;
    this.type = type;
  }

  @Override
  public Class<T> type() {
    return this.type;
  }

  @Override
  public String name() {
    return this.type.getName();
  }

  @Override
  public String url() {
    return BASE_URL;
  }

  @Override
  public Request apply(RequestTemplate input) {
    input
      .target(this.url())
      .header("Content-Type", "application/json")
      .header("Accept", "application/json")
      .header("X-Auth-API-Key", this.providerProperties.getApiKey())
      .header("X-Auth-Subdomain", this.providerProperties.getSubdomain());

    return input.request();
  }

  @Override
  public final boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof AppTarget<?> appTarget)) return false;

    return Objects.equals(type, appTarget.type) && Objects.equals(this.url(), appTarget.url());
  }

  @Override
  public int hashCode() {
    int result = Objects.hashCode(type);
    result = 31 * result + Objects.hashCode(this.url());
    return result;
  }
}
