package com.the_mgi.thinkific_sdk_java;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors
@NoArgsConstructor
@AllArgsConstructor
public final class ProviderProperties {
  private String apiKey;
  private String clientId;
  private String clientSecret;
  private String subdomain;
  private String externalId;

  private Integer connectionTimeoutMs;
  private Integer readTimeoutMs;
  private Boolean followRedirects;
}