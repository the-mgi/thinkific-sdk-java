package com.the_mgi.thinkific_sdk_java.bundles;

import com.the_mgi.thinkific_sdk_java.base.model.ListResponse;
import com.the_mgi.thinkific_sdk_java.bundles.model.request.EnrollmentInBundleOfCourseRequest;
import com.the_mgi.thinkific_sdk_java.bundles.model.response.BundleResponse;
import com.the_mgi.thinkific_sdk_java.categories.model.response.CourseResponse;
import feign.Param;
import feign.RequestLine;

public interface BundlesApi {
  /**
   * List a bundle
   *
   * @param bundleId ID of the Bundle in the form of an integer
   * @return Retrieves the Bundle identified by the provided id
   */
  @RequestLine("GET /bundles/{id}")
  BundleResponse listABundle(@Param("id") int bundleId);

  /**
   * List courses by bundle id
   *
   * @param bundleId ID of the Bundle in the form of an integer
   * @param page     The page within the collection to fetch - default value:  1
   * @param limit    The number of items to be returned - default value: 25
   * @return Retrieves the Courses within the Bundle identified by the provided id
   */
  @RequestLine("GET /bundles/{id}/courses")
  ListResponse<CourseResponse> listCoursesByBundleId(
    @Param("bundleId") int bundleId,
    Integer page,
    Integer limit
  );

  /**
   * Create an enrollment in a Bundle of Courses. This endpoint enrolls a
   * User in a Bundle and each of the Courses contained within the Bundle
   *
   * @param bundleId ID of the bundle in a form of integer
   * @param request  body to post
   */
  @RequestLine("POST /bundles/{id}/enrollments")
  void createEnrollmentInABundleOfCourse(
    @Param("id") int bundleId,
    EnrollmentInBundleOfCourseRequest request
  );

  /**
   * Update enrollment in a bundle. This endpoint updates a User’s
   * Enrollment in a Bundle and each of the Courses contained within the Bundle.
   *
   * @param bundleId ID of the bundle in a form of integer
   * @param request  body to put
   */
  @RequestLine("PUT /bundles/{id}/enrollments")
  void updateEnrollmentBundle(
    @Param("id") int bundleId,
    EnrollmentInBundleOfCourseRequest request
  );
}
