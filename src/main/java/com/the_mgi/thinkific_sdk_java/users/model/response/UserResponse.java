package com.the_mgi.thinkific_sdk_java.users.model.response;

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
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
  /**
   * User's ID
   */
  @JsonProperty("id")
  private Integer id;

  /**
   * User's created date
   */
  @JsonProperty("created_at")
  private String createdAt;

  /**
   * The first name of the User.
   */
  @JsonProperty("first_name")
  private String firstName;

  /**
   * The last name of the User.
   */
  @JsonProperty("last_name")
  private String lastName;

  /**
   * The email of the User.
   */
  @JsonProperty("full_name")
  private String fullName;

  /**
   * The company of the User.
   */
  @JsonProperty("company")
  private String company;

  /**
   * User's email
   */
  @JsonProperty("email")
  private String email;

  /**
   * Any specific roles that the User should be placed in.
   * Possible roles are: affiliate, course_admin, group_analyst,
   * site_admin.
   */
  @JsonProperty("roles")
  private Role roles;

  /**
   * The fully-qualified avatar url of the User.
   */
  @JsonProperty("avatar_url")
  private String avatarUrl;

  /**
   * The bio of the User.
   */
  @JsonProperty("bio")
  private String bio;

  /**
   *The headline/title of the User.
   */
  @JsonProperty("headline")
  private String headline;

  /**
   *The affiliate code of the User. ** Required only if the User is an affiliate. **
   */
  @JsonProperty("affiliate_code")
  private String affiliateCode;

  /**
   *User's external source
   */
  @JsonProperty("external_source")
  private String externalSource;

  /**
   *The affiliate commission % of the User. ** Required only if the User is an affiliate.
   * This should be greater than 0 and less than or equal to 100. **
   */
  @JsonProperty("affiliate_commission")
  private Integer affiliateCommission;

  /**
   *
   */
  @JsonProperty("affiliate_commission_type")
  private String affiliateCommissionType;

  /**
   * The affiliate payout type, it can be either % (percentage, default) or $ (fixed amount).
   * ** Required only if the User is an affiliate. **
   */
  @JsonProperty("affiliate_payout_email")
  private String affiliatePayoutEmail;

  /**
   * The email of the User. ** Required only if the user is an affiliate. Used to pay the User out. **
   */
  @JsonProperty("administered_course_ids")
  private List<Integer> administeredCourseIds;

  /**
   * User's administered course ids
   */
  @JsonProperty("custom_profile_fields")
  private List<CustomProfileField> customProfileFields;

  @Override
  public String toString() {
    return "UserResponse{" +
      "id=" + id +
      ", createdAt='" + createdAt + '\'' +
      ", firstName='" + firstName + '\'' +
      ", lastName='" + lastName + '\'' +
      ", fullName='" + fullName + '\'' +
      ", company='" + company + '\'' +
      ", email='" + email + '\'' +
      ", roles=" + roles +
      ", avatarUrl='" + avatarUrl + '\'' +
      ", bio='" + bio + '\'' +
      ", headline='" + headline + '\'' +
      ", affiliateCode='" + affiliateCode + '\'' +
      ", externalSource='" + externalSource + '\'' +
      ", affiliateCommission=" + affiliateCommission +
      ", affiliateCommissionType='" + affiliateCommissionType + '\'' +
      ", affiliatePayoutEmail='" + affiliatePayoutEmail + '\'' +
      ", administeredCourseIds=" + administeredCourseIds +
      ", customProfileFields=" + customProfileFields +
      '}';
  }
}
