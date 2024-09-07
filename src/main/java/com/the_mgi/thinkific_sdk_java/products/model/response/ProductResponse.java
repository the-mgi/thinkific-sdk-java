package com.the_mgi.thinkific_sdk_java.products.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import com.the_mgi.thinkific_sdk_java.base.model.BaseResponseModel;

import java.util.List;

@Getter
@Setter
@Accessors
@NoArgsConstructor
@AllArgsConstructor
public final class ProductResponse extends BaseResponseModel {
  /**
   * The ID of the Product as an integer.
   */
  @JsonProperty("id")
  private int id;

  /**
   * The date and time that the Product was created.
   */
  @JsonProperty("created_at")
  private String createdAt;

  /**
   * The ID of the Course or Bundle that is represented by the Product.
   */
  @JsonProperty("productable_id")
  private Integer productableId;

  /**
   * The type of item that the Product represents.
   */
  @JsonProperty("productable_type")
  private String productableType;

  /**
   * The price of the Product.
   *
   * @apiNote price will be deprecated in future versions of the API
   */
  @JsonProperty("price")
  private Double price;

  /**
   * The position of the Product within the site. Used for ordering.
   */
  @JsonProperty("position")
  private Integer position;

  /**
   * The status of the Product. Can be either 'published' or 'draft'.
   */
  @JsonProperty("status")
  private Status status;

  /**
   * The name of the Product.
   */
  @JsonProperty("name")
  private String name;

  /**
   * A boolean indicating whether the Product is private. When private,
   * a Product cannot be purchased. A user must be enrolled manually.
   */
  @JsonProperty("private")
  private boolean isPrivate;

  /**
   * A boolean indicating whether the Product is hidden. When hidden, the
   * Product will not appear on any site pages. It's landing page will be still
   * be accessible via a link, however.
   */
  @JsonProperty("hidden")
  private boolean hidden;

  /**
   * A boolean indicating whether the Product is a subscription or not.
   */
  @JsonProperty("subscription")
  private boolean subscription;

  /**
   * If access to a Product can end, this value controls how many days
   * access is granted for from the date of enrollment.
   */
  @JsonProperty("days_until_expire")
  private Integer daysUntilExpire;

  /**
   * A boolean indicating whether the Product has a certificate.
   */
  @JsonProperty("has_certificate")
  private boolean hasCertificate;

  /**
   * Keywords associated with the Product.
   */
  @JsonProperty("keywords")
  private String keywords;

  /**
   * The SEO title of the Product.
   */
  @JsonProperty("seo_title")
  private String seoTitle;

  /**
   * The SEO description of the Product.
   */
  @JsonProperty("seo_description")
  private String seoDescription;

  /**
   * The IDs of the Categories to which this Product belongs as integers.
   */
  @JsonProperty("collection_ids")
  private List<Integer> collectionIds;

  /**
   * The IDs of any related Products as integers.
   */
  @JsonProperty("related_product_ids")
  private List<Integer> relatedProductIds;

  /**
   * The description of the product (course or bundle)
   */
  @JsonProperty("description")
  private String description;

  /**
   * The card image URL for the product.
   */
  @JsonProperty("card_image_url")
  private String cardImageUrl;

  /**
   * The slug of the product
   */
  @JsonProperty("slug")
  private String slug;

  /**
   * The Product Price objects for the Product.
   */
  @JsonProperty("product_prices")
  private List<ProductPriceResponse> productPrices;

  @Override
  public String toString() {
    return "ProductResponse{" +
      "id=" + id +
      ", createdAt='" + createdAt + '\'' +
      ", productableId=" + productableId +
      ", productableType='" + productableType + '\'' +
      ", price=" + price +
      ", position=" + position +
      ", status=" + status +
      ", name='" + name + '\'' +
      ", isPrivate=" + isPrivate +
      ", hidden=" + hidden +
      ", subscription=" + subscription +
      ", daysUntilExpire=" + daysUntilExpire +
      ", hasCertificate=" + hasCertificate +
      ", keywords='" + keywords + '\'' +
      ", seoTitle='" + seoTitle + '\'' +
      ", seoDescription='" + seoDescription + '\'' +
      ", collectionIds=" + collectionIds +
      ", relatedProductIds=" + relatedProductIds +
      ", description='" + description + '\'' +
      ", cardImageUrl='" + cardImageUrl + '\'' +
      ", slug='" + slug + '\'' +
      ", productPrices=" + productPrices +
      '}';
  }
}
