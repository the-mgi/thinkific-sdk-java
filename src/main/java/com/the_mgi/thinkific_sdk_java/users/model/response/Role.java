package com.the_mgi.thinkific_sdk_java.users.model.response;

import lombok.Getter;

@Getter
public enum Role {
  AFFILIATE("affiliate"),
  COURSE_ADMIN("course_admin"),
  GROUP_ANALYST("group_analyst"),
  SITE_ADMIN("site_admin");

  private final String value;

  Role(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "Role{" +
      "value='" + value + '\'' +
      "} " + super.toString();
  }
}
