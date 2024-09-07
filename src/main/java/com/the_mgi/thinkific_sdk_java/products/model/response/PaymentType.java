package com.the_mgi.thinkific_sdk_java.products.model.response;

import lombok.Getter;

@Getter
public enum PaymentType {
  FREE("free"),
  ONE_TIME("one-time"),
  SUBSCRIPTION("subscription"),
  PAYMENT_PLAN("payment-plan");

  private final String value;

  PaymentType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "PaymentType{" +
      "value='" + value + '\'' +
      "} " + super.toString();
  }
}
