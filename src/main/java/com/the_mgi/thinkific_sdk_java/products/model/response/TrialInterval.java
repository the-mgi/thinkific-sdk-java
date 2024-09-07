package com.the_mgi.thinkific_sdk_java.products.model.response;

import lombok.Getter;

@Getter
public enum TrialInterval {
  DAY("day"),
  MONTH("month");

  private final String value;

  TrialInterval(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "TrialInterval{" +
      "value='" + value + '\'' +
      "} " + super.toString();
  }
}
