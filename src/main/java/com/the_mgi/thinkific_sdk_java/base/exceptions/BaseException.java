package com.the_mgi.thinkific_sdk_java.base.exceptions;

public abstract class BaseException extends RuntimeException {
  protected BaseException() {
  }

  public abstract int getStatus();

  public abstract Object getError();
}
