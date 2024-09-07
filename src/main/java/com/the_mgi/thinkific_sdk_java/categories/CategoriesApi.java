package com.the_mgi.thinkific_sdk_java.categories;

import com.the_mgi.thinkific_sdk_java.base.model.ListResponse;
import com.the_mgi.thinkific_sdk_java.categories.model.response.CollectionResponse;

public interface CategoriesApi {
  /**
   * Get Collections
   *
   * @param page  The page within the collection to fetch - default value: 1
   * @param limit The number of items to be returned - default value: 25
   * @return Retrieves a list of Collections
   * @apiNote This endpoint will be renamed to /categories in future API versions.
   */
  ListResponse<CollectionResponse> getCollections(Integer page, Integer limit);
}
