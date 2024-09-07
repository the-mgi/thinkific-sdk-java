package com.the_mgi.thinkific_sdk_java;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.Map;

@Getter
@Setter
@Accessors
@NoArgsConstructor
@AllArgsConstructor
public final class Providers {
  private Map<String, ProviderProperties> providers;
  private Integer connectionTimeoutMs;
  private Integer readTimeoutMs;
  private Boolean followRedirects;
}
