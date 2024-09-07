package com.the_mgi.thinkific_sdk_java;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import feign.Response;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.Contract;

@Slf4j
public final class UtilFunction {

  @Contract(pure = true)
  public static <T> T ifExceptionOrElse(Response.Body body, T otherwise) {

    try {
      ObjectMapper mapper = new ObjectMapper();
      return mapper.readValue(body.asInputStream(), new TypeReference<>() {
      });

    } catch (Exception exception) {
      loggerFactory.warn("exception occurred: {}", exception.getMessage());
    }

    return otherwise;
  }

}
