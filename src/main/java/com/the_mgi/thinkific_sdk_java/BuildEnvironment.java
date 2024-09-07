package com.the_mgi.thinkific_sdk_java;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.InputStream;

import static java.util.Objects.isNull;

@Getter
@Slf4j
public final class BuildEnvironment {
  private static final String filename = "thinkific.yaml";
  private static BuildEnvironment buildEnvironment = null;

  private Providers providers;

  private BuildEnvironment() {
  }

  public static BuildEnvironment getInstance() {
    if (isNull(buildEnvironment)) buildEnvironment = new BuildEnvironment();

    try (InputStream stream = BuildEnvironment.class.getClassLoader().getResourceAsStream(filename)) {

      buildEnvironment.providers = new ObjectMapper(new YAMLFactory())
        .setPropertyNamingStrategy(PropertyNamingStrategies.KEBAB_CASE)
        .readValue(stream, new TypeReference<>() {
        });

    } catch (IOException e) {
      loggerFactory.error("cannot read file");
      throw new RuntimeException(e);
    }

    return buildEnvironment;
  }
}
