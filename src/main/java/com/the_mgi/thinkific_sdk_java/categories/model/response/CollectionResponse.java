package com.the_mgi.thinkific_sdk_java.categories.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.NotNull;
import com.the_mgi.thinkific_sdk_java.base.model.BaseResponseModel;

import java.util.List;

@Getter
@Setter
@Accessors
@NoArgsConstructor
@AllArgsConstructor
public final class CollectionResponse extends BaseResponseModel {
  /**
   * The ID of the Category as an integer
   */
  @JsonProperty("id")
  private int id;

  /**
   * The name of the Category
   */
  @NotNull
  @JsonProperty("name")
  private String name;

  /**
   * The description of the Category
   */
  @NotNull
  @JsonProperty("description")
  private String description;

  /**
   * courses (string, required) - The slug of the Category
   */
  @JsonProperty("slug")
  private String slug;

  /**
   * The date and time when the Category was created
   */
  @NotNull
  @JsonProperty("created_at")
  private String createdAt;

  /**
   * The IDs of the Products contained within the Category
   */
  @NotNull
  @JsonProperty("product_ids")
  private List<Integer> productIds;

  /**
   * A boolean indicating whether the Category is the default
   */
  @JsonProperty("default")
  private boolean isDefault;

  @Override
  public String toString() {
    return "CollectionResponse{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", description='" + description + '\'' +
      ", slug='" + slug + '\'' +
      ", createdAt='" + createdAt + '\'' +
      ", productIds=" + productIds +
      ", isDefault=" + isDefault +
      "} " + super.toString();
  }
}
