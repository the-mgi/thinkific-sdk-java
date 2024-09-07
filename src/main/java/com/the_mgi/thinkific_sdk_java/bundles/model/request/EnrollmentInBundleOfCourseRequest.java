package com.the_mgi.thinkific_sdk_java.bundles.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors
@AllArgsConstructor
public final class EnrollmentInBundleOfCourseRequest {
  @JsonProperty("user_id")
  private int userId;

  /**
   * The date/time at which the Enrollment is to be activated. If not provided,
   * the Enrollment will only provide access to free preview content within the Courses.
   * Provide full access to courses by setting this value to the current date/time.
   */
  @JsonProperty("activated_at")
  private String activatedAt;

  /**
   * The date/time at which the Enrollment should be expired. If not provided,
   * the Enrollment does not expire.
   */
  @JsonProperty("expiry_date")
  private String expiryDate;

  public EnrollmentInBundleOfCourseRequest(int userId) {
    this.userId = userId;
  }

  @Override
  public String toString() {
    return "EnrollmentInBundleOfCourse{" +
      "userId=" + userId +
      ", activatedAt='" + activatedAt + '\'' +
      ", expiryDate='" + expiryDate + '\'' +
      '}';
  }
}
