package com.the_mgi.thinkific_sdk_java;

import com.the_mgi.thinkific_sdk_java.base.exceptions.AccessForbiddenException;
import com.the_mgi.thinkific_sdk_java.base.exceptions.RecordNotFoundException;
import com.the_mgi.thinkific_sdk_java.base.exceptions.UnProcessableEntity;
import feign.Response;
import feign.codec.ErrorDecoder;

import java.net.HttpURLConnection;

import static com.the_mgi.thinkific_sdk_java.UtilFunction.ifExceptionOrElse;

public final class ThinkificErrorDecoder implements ErrorDecoder {
  @Override
  public Exception decode(String methodKey, Response response) {
    return switch (response.status()) {
      case HttpURLConnection.HTTP_FORBIDDEN -> ifExceptionOrElse(response.body(), new AccessForbiddenException());
      case HttpURLConnection.HTTP_NOT_FOUND -> ifExceptionOrElse(response.body(), new RecordNotFoundException());
      case 422 -> ifExceptionOrElse(response.body(), new UnProcessableEntity());
      default -> new RuntimeException(response.toString());
    };
  }
}
