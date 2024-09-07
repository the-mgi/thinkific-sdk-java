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
public final class CourseResponse extends BaseResponseModel {
  /**
   * The ID of the course
   */
  @JsonProperty("id")
  private int id;

  /**
   * The name of the course
   */
  @NotNull
  @JsonProperty("name")
  private String name;

  /**
   * URL-friendly version of the course name. Used to construct URL for course Landing Pages & Course Player.
   */
  @JsonProperty("slug")
  private String slug;

  /**
   * @deprecated Used in legacy themes to display the subtitle of the Course.
   */
  @JsonProperty("subtitle")
  private String subtitle;

  /**
   * The Course's Product ID
   */
  @JsonProperty("product_id")
  private int productId;

  /**
   * The description of the Course(V2 themes currently don't have that info)
   */
  @JsonProperty("description")
  private String description;

  /**
   * Used in legacy themes to populate the text for a Course card.
   *
   * @deprecated use {@link CourseResponse#description} instead
   */
  @JsonProperty("course_card_text")
  private String courseCardText;

  /**
   * @deprecated Used in legacy themes to designate an intro video from Youtube.
   */
  @JsonProperty("intro_video_youtube")
  private String introVideoYoutube;

  /**
   * @deprecated The contact information of the Course.
   */
  @JsonProperty("contact_information")
  private String contactInformation;

  /**
   * The keywords of the Course
   */
  @JsonProperty("keywords")
  private String keywords;

  /**
   * @deprecated Used in legacy themes to display the duration of the Course.
   */
  @JsonProperty("duration")
  private String duration;

  /**
   * The landing page banner image url of the Course.
   *
   * @deprecated use {@link CourseResponse#courseCardImageUrl} instead.
   */
  @JsonProperty("banner_image_url")
  private String bannerImageUrl;

  /**
   * The card image url of the Course
   */
  @JsonProperty("course_card_image_url")
  private String courseCardImageUrl;

  /**
   * @deprecated Used in legacy themes to designate an intro video from Wistia.
   */
  @JsonProperty("intro_video_wistia_identifier")
  private String introVideoWistiaIdentifier;

  /**
   * The IDs of the Users that can administer the Course as integers
   */
  @JsonProperty("administrator_user_ids")
  private List<Integer> administratorUserIds;

  /**
   * The IDs of the Chapters in the Course as integers
   */
  @NotNull
  @JsonProperty("chapter_ids")
  private List<Integer> chapterIds;

  /**
   * A boolean indicating whether reviews are enabled for the Course
   */
  @JsonProperty("reviews_enabled")
  private boolean reviewsEnabled;

  /**
   * The ID of the User that created the Course
   */
  @JsonProperty("user_id")
  private Integer userId;

  /**
   * The ID of the Instructor of the Course
   */
  @JsonProperty("instructor_id")
  private int instructorId;

  @Override
  public String toString() {
    return "CourseResponse{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", slug='" + slug + '\'' +
      ", subtitle='" + subtitle + '\'' +
      ", productId=" + productId +
      ", description='" + description + '\'' +
      ", courseCardText='" + courseCardText + '\'' +
      ", introVideoYoutube='" + introVideoYoutube + '\'' +
      ", contactInformation='" + contactInformation + '\'' +
      ", keywords='" + keywords + '\'' +
      ", duration='" + duration + '\'' +
      ", bannerImageUrl='" + bannerImageUrl + '\'' +
      ", courseCardImageUrl='" + courseCardImageUrl + '\'' +
      ", introVideoWistiaIdentifier='" + introVideoWistiaIdentifier + '\'' +
      ", administratorUserIds=" + administratorUserIds +
      ", chapterIds=" + chapterIds +
      ", reviewsEnabled=" + reviewsEnabled +
      ", userId=" + userId +
      ", instructorId=" + instructorId +
      "} " + super.toString();
  }
}
