package com.the_mgi.thinkific_sdk_java.bundles.model.response;

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
public final class BundleResponse extends BaseResponseModel {
  /**
   * The ID of the Bundle
   */
  @JsonProperty("id")
  private int id;

  /**
   * The name of the Bundle
   */
  @NotNull
  @JsonProperty("name")
  private String name;

  /**
   * The description on the Bundle
   */
  @JsonProperty("description")
  private String description;

  /**
   * The tagline for the Bundle (Deprecated)
   *
   * @deprecated
   */
  @JsonProperty("tag_line")
  private String tagLine;

  /**
   * The banner image url for the Bundle.
   *
   * @deprecated use {@link BundleResponse#bundleCardImageUrl} instead
   */
  @Deprecated
  @JsonProperty("banner_image_url")
  private String bannerImageUrl;

  /**
   * The IDs of the Courses in the Bundle
   */
  @NotNull
  @JsonProperty("course_ids")
  private List<Integer> courseIds;

  /**
   * The card image url for the Bundle
   */
  @JsonProperty("bundle_card_image_url")
  private String bundleCardImageUrl;

  @Override
  public String toString() {
    return "BundleResponse{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", description='" + description + '\'' +
      ", tagLine='" + tagLine + '\'' +
      ", bannerImageUrl='" + bannerImageUrl + '\'' +
      ", courseIds=" + courseIds +
      ", bundleCardImageUrl='" + bundleCardImageUrl + '\'' +
      '}';
  }
}
