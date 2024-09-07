package com.the_mgi.thinkific_sdk_java.base.exceptions;

import java.net.HttpURLConnection;

public class AccessForbiddenException extends PlainException {

  public AccessForbiddenException(String error) {
    super(error);
  }

  public AccessForbiddenException() {
    super("Access to Apps is not available on your plan. Upgrade to gain access");
  }

  @Override
  public int getStatus() {
    return HttpURLConnection.HTTP_FORBIDDEN;
  }
}
