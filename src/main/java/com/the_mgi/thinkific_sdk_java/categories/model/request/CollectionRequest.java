package com.the_mgi.thinkific_sdk_java.categories.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.NotNull;

@Getter
@Setter
@Accessors
@NoArgsConstructor
@AllArgsConstructor
public final class CollectionRequest {
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
   * The slug of the Category.
   */
  @NotNull
  @JsonProperty("slug")
  private String slug;

  @Override
  public String toString() {
    return "CollectionRequest{" +
      "name='" + name + '\'' +
      ", description='" + description + '\'' +
      ", slug='" + slug + '\'' +
      '}';
  }
}
