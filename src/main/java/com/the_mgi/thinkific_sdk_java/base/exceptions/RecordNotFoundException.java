package com.the_mgi.thinkific_sdk_java.base.exceptions;

import java.net.HttpURLConnection;

public class RecordNotFoundException extends PlainException {
  protected RecordNotFoundException(String error) {
    super(error);
  }

  public RecordNotFoundException() {
    super("Record not found.");
  }

  @Override
  public int getStatus() {
    return HttpURLConnection.HTTP_NOT_FOUND;
  }
}
