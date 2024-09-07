package com.the_mgi.thinkific_sdk_java.enrollments.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.NotNull;
import com.the_mgi.thinkific_sdk_java.base.model.BaseResponseModel;

@Getter
@Setter
@Accessors
@NoArgsConstructor
@AllArgsConstructor
public final class EnrollmentResponse extends BaseResponseModel {
  /**
   * The ID of the Enrollment as an integer.
   */
  @JsonProperty("id")
  private int id;

  /**
   * The email of the User owning the Enrollment.
   */
  @NotNull
  @JsonProperty("user_email")
  private String userEmail;

  /**
   * The full name of the User owning the Enrollment.
   */
  @NotNull
  @JsonProperty("user_name")
  private String userName;

  /**
   * The ID of the User owning the Enrollment as an integer.
   */
  @JsonProperty("user_id")
  private int userId;

  /**
   * The name of the Course.
   */
  @NotNull
  @JsonProperty("course_name")
  private String courseName;

  /**
   * The ID of the Course as an integer.
   */
  @JsonProperty("course_id")
  private int courseId;

  /**
   * The percentage complete of the Enrollment. A number between 0.0 and 1.0.
   * For example, to represent a percentage complete of 75%, this value would be 0.75.
   */
  @JsonProperty("percentage_completed")
  private float percentageCompleted;

  /**
   * A boolean indicating whether the Enrollment is expired.
   */
  @JsonProperty("expired")
  private boolean expired;

  /**
   * A boolean indicating whether the Enrollment is a free trial.
   */
  @JsonProperty("is_free_trial")
  private boolean isFreeTrial;

  /**
   * A boolean indicating whether the Enrollment is complete.
   */
  @JsonProperty("completed")
  private boolean completed;

  /**
   * The date/time that the Enrollment started.
   */
  @NotNull
  @JsonProperty("started_at")
  private String startedAt;

  /**
   * The date/time that the Enrollment was activated.
   */
  @NotNull
  @JsonProperty("activated_at")
  private String activatedAt;

  /**
   * The date/time that the Enrollment was completed.
   */
  @NotNull
  @JsonProperty("completed_at")
  private String completedAt;

  /**
   * The date/time that the Enrollment was updated last.
   */
  @NotNull
  @JsonProperty("updated_at")
  private String updatedAt;

  /**
   * The date/time that the Enrollment expires.
   */
  @NotNull
  @JsonProperty("expiry_date")
  private String expiryDate;

  @Override
  public String toString() {
    return "EnrollmentResponse{" +
      "id=" + id +
      ", userEmail='" + userEmail + '\'' +
      ", userName='" + userName + '\'' +
      ", userId=" + userId +
      ", courseName='" + courseName + '\'' +
      ", courseId=" + courseId +
      ", percentageCompleted=" + percentageCompleted +
      ", expired=" + expired +
      ", isFreeTrial=" + isFreeTrial +
      ", completed=" + completed +
      ", startedAt='" + startedAt + '\'' +
      ", activatedAt='" + activatedAt + '\'' +
      ", completedAt='" + completedAt + '\'' +
      ", updatedAt='" + updatedAt + '\'' +
      ", expiryDate='" + expiryDate + '\'' +
      "} " + super.toString();
  }
}
