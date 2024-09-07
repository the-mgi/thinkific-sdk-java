package com.the_mgi.thinkific_sdk_java.base.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Pagination Metadata
 */
@Getter
@Setter
@Accessors
@NoArgsConstructor
@AllArgsConstructor
public class Pagination {
  /**
   * Current page number
   */
  @JsonProperty("current_page")
  private Integer currentPage;

  /**
   * Next page number
   */
  @JsonProperty("next_page")
  private Integer nextPage;

  /**
   * Previous page number
   */
  @JsonProperty("prev_page")
  private Integer prevPage;

  /**
   * Number of total pages
   */
  @JsonProperty("total_pages")
  private Integer totalPages;

  /**
   * Number of total items
   */
  @JsonProperty("total_items")
  private Integer totalItems;

  /**
   * Entries info ex. 1-10 of 10
   */
  @JsonProperty("entries_info")
  private String entriesInfo;

  @Override
  public String toString() {
    return "Pagination{" +
      "currentPage=" + currentPage +
      ", nextPage=" + nextPage +
      ", prevPage=" + prevPage +
      ", totalPages=" + totalPages +
      ", totalItems=" + totalItems +
      ", entriesInfo='" + entriesInfo + '\'' +
      '}';
  }
}
