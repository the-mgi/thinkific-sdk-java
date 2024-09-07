package com.the_mgi.thinkific_sdk_java.users.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors
@AllArgsConstructor
@NoArgsConstructor
public class CustomProfileField {
  /**
   * Custom profile field ID
   */
  @JsonProperty("id")
  private Integer id;

  /**
   *
   */
  @JsonProperty("value")
  private String value;

  /**
   * Custom profile field value
   */
  @JsonProperty("label")
  private String label;

  /**
   * Custom profile field definition ID
   */
  @JsonProperty("custom_profile_definition_id")
  private Integer customProfileDefinitionId;

  @Override
  public String toString() {
    return "CustomProfileField{" +
      "id=" + id +
      ", value='" + value + '\'' +
      ", label='" + label + '\'' +
      ", customProfileDefinitionId=" + customProfileDefinitionId +
      '}';
  }
}
