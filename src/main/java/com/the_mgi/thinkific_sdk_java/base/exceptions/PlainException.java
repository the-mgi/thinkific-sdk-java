package com.the_mgi.thinkific_sdk_java.base.exceptions;

public abstract class PlainException extends BaseException {
  private final String error;

  public PlainException(String error) {
    this.error = error;
  }

  @Override
  public String getError() {
    return error;
  }
}
