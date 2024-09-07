package com.the_mgi.thinkific_sdk_java.base.exceptions;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.LinkedHashMap;

public class UnProcessableEntity extends BaseException {
  @JsonProperty("error")
  private LinkedHashMap<?, ?> map;

  public UnProcessableEntity() {
  }

  public UnProcessableEntity(LinkedHashMap<?, ?> map) {
    this.map = map;
  }

  @Override
  public int getStatus() {
    return 422;
  }

  @Override
  public Object getError() {
    return this.map;
  }
}
