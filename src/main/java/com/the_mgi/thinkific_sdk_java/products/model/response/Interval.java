package com.the_mgi.thinkific_sdk_java.products.model.response;

import lombok.Getter;

@Getter
public enum Interval {
  MONTH("month"),
  YEAR("year");

  private final String value;

  Interval(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "Interval{" +
      "value='" + value + '\'' +
      "} " + super.toString();
  }
}
