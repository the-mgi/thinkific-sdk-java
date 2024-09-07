package com.the_mgi.thinkific_sdk_java.base.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors
@NoArgsConstructor
@AllArgsConstructor
public class Meta {
  @JsonProperty("pagination")
  private Pagination pagination;

  @Override
  public String toString() {
    return "Meta{" +
      "pagination=" + pagination +
      '}';
  }
}
