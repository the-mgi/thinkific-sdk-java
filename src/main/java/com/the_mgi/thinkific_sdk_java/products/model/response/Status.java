package com.the_mgi.thinkific_sdk_java.products.model.response;

import lombok.Getter;

@Getter
public enum Status {
  PUBLISHED("published"),
  DRAFT("draft");

  private final String value;

  Status(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "Status{" +
      "value='" + value + '\'' +
      "} " + super.toString();
  }
}
