package com.the_mgi.thinkific_sdk_java.products.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.the_mgi.thinkific_sdk_java.base.model.BaseResponseModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * The Product Price objects for the Product.
 */
@Getter
@Setter
@Accessors
@NoArgsConstructor
@AllArgsConstructor
public final class ProductPriceResponse extends BaseResponseModel {
  /**
   * The ID of the Product Price as an integer.
   */
  @JsonProperty("id")
  private Integer id;

  /**
   * A boolean indicating whether the Product Price is the default.
   */
  @JsonProperty("is_primary")
  private boolean isPrimary;

  /**
   * The type of payment. Must be one of 'free', 'one-time', 'subscription', or 'payment-plan'.
   */
  @JsonProperty("payment_type")
  private PaymentType paymentType;

  /**
   * The amount in dollars to be charged.
   */
  @JsonProperty("label")
  private String label;

  /**
   * The number of days, after purchase, that a student will be enrolled in the course.
   */
  @JsonProperty("price")
  private Double price;

  /**
   *
   */
  @JsonProperty("days_until_expire")
  private String daysUntilExpire;

  /**
   * This text that is displayed on the Buy Button on the course card and the course landing page.
   */
  @JsonProperty("pay_button_text")
  private String payButtonText;

  /**
   * The number of recurring payments for a Product Price with payment_type of 'payment-plan'.
   */
  @JsonProperty("number_of_payments")
  private Integer numberOfPayments;

  /**
   * The billing frequency. Must be one of 'month' or 'year'.
   */
  @JsonProperty("interval")
  private Interval interval;

  /**
   * The number of intervals between billings. For example, if interval is 'month' and
   * interval_count is '1', the billing frequency is once every month.
   */
  @JsonProperty("interval_count")
  private String intervalCount;

  /**
   * The interval for the trial period. Must be one of 'day' or 'month'.
   */
  @JsonProperty("trial_interval")
  private TrialInterval trialInterval;

  /**
   * The number of intervals for the trial period. For example, if trial_interval
   * is 'month' and trial_interval_count is '6', the free trial will end
   * (and regular payments will begin) in 6 months.
   */
  @JsonProperty("trial_interval_count")
  private String trialIntervalCount;

  /**
   * Students pay this amount for the first payment period of the subscription.
   */
  @JsonProperty("custom_first_price")
  private String customFirstPrice;

  /**
   * The name of the Product Price. If is_primary is true, returns the name of the product,
   * otherwise returns "{Product name} - {Product Price label}".
   */
  @JsonProperty("price_name")
  private String priceName;

  /**
   * The three-letter ISO currency code of the Product Price. Must be a supported currency.
   */
  @JsonProperty("currency")
  private String currency;

  @Override
  public String toString() {
    return "ProductPriceResponse{" +
      "id=" + id +
      ", isPrimary=" + isPrimary +
      ", paymentType=" + paymentType +
      ", label='" + label + '\'' +
      ", price=" + price +
      ", daysUntilExpire='" + daysUntilExpire + '\'' +
      ", payButtonText='" + payButtonText + '\'' +
      ", numberOfPayments=" + numberOfPayments +
      ", interval=" + interval +
      ", intervalCount='" + intervalCount + '\'' +
      ", trialInterval=" + trialInterval +
      ", trialIntervalCount='" + trialIntervalCount + '\'' +
      ", customFirstPrice='" + customFirstPrice + '\'' +
      ", priceName='" + priceName + '\'' +
      ", currency='" + currency + '\'' +
      '}';
  }
}
