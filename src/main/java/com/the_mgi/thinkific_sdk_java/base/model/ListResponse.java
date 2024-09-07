package com.the_mgi.thinkific_sdk_java.base.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Getter
@Setter
@Accessors
@NoArgsConstructor
@AllArgsConstructor
public final class ListResponse<T extends BaseResponseModel> {
  @JsonProperty("items")
  private List<T> items;

  @JsonProperty("meta")
  private Meta meta;

  @Override
  public String toString() {
    return "ListResponse{" +
      "items=" + items +
      ", meta=" + meta +
      '}';
  }
}
