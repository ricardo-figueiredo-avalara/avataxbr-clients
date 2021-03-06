/*
 * AvaTax Brazil
 * The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * ServiceItemTaxRate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-06T17:54:07.550Z")
public class ServiceItemTaxRate {
  @SerializedName("taxType")
  private String taxType = null;

  @SerializedName("rateType")
  private String rateType = null;

  @SerializedName("rate")
  private Double rate = null;

  @SerializedName("isExempt")
  private Boolean isExempt = null;

  @SerializedName("discount")
  private Double discount = null;

  @SerializedName("zone1")
  private Integer zone1 = null;

  @SerializedName("zone2")
  private Integer zone2 = null;

  @SerializedName("period")
  private ServiceItemTaxRatePeriod period = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("message")
  private String message = null;

  public ServiceItemTaxRate taxType(String taxType) {
    this.taxType = taxType;
    return this;
  }

   /**
   * Get taxType
   * @return taxType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTaxType() {
    return taxType;
  }

  public void setTaxType(String taxType) {
    this.taxType = taxType;
  }

  public ServiceItemTaxRate rateType(String rateType) {
    this.rateType = rateType;
    return this;
  }

   /**
   * Get rateType
   * @return rateType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRateType() {
    return rateType;
  }

  public void setRateType(String rateType) {
    this.rateType = rateType;
  }

  public ServiceItemTaxRate rate(Double rate) {
    this.rate = rate;
    return this;
  }

   /**
   * Get rate
   * @return rate
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getRate() {
    return rate;
  }

  public void setRate(Double rate) {
    this.rate = rate;
  }

  public ServiceItemTaxRate isExempt(Boolean isExempt) {
    this.isExempt = isExempt;
    return this;
  }

   /**
   * Get isExempt
   * @return isExempt
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIsExempt() {
    return isExempt;
  }

  public void setIsExempt(Boolean isExempt) {
    this.isExempt = isExempt;
  }

  public ServiceItemTaxRate discount(Double discount) {
    this.discount = discount;
    return this;
  }

   /**
   * Get discount
   * @return discount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getDiscount() {
    return discount;
  }

  public void setDiscount(Double discount) {
    this.discount = discount;
  }

  public ServiceItemTaxRate zone1(Integer zone1) {
    this.zone1 = zone1;
    return this;
  }

   /**
   * Get zone1
   * @return zone1
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getZone1() {
    return zone1;
  }

  public void setZone1(Integer zone1) {
    this.zone1 = zone1;
  }

  public ServiceItemTaxRate zone2(Integer zone2) {
    this.zone2 = zone2;
    return this;
  }

   /**
   * Get zone2
   * @return zone2
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getZone2() {
    return zone2;
  }

  public void setZone2(Integer zone2) {
    this.zone2 = zone2;
  }

  public ServiceItemTaxRate period(ServiceItemTaxRatePeriod period) {
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @ApiModelProperty(example = "null", value = "")
  public ServiceItemTaxRatePeriod getPeriod() {
    return period;
  }

  public void setPeriod(ServiceItemTaxRatePeriod period) {
    this.period = period;
  }

  public ServiceItemTaxRate reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public ServiceItemTaxRate message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceItemTaxRate serviceItemTaxRate = (ServiceItemTaxRate) o;
    return Objects.equals(this.taxType, serviceItemTaxRate.taxType) &&
        Objects.equals(this.rateType, serviceItemTaxRate.rateType) &&
        Objects.equals(this.rate, serviceItemTaxRate.rate) &&
        Objects.equals(this.isExempt, serviceItemTaxRate.isExempt) &&
        Objects.equals(this.discount, serviceItemTaxRate.discount) &&
        Objects.equals(this.zone1, serviceItemTaxRate.zone1) &&
        Objects.equals(this.zone2, serviceItemTaxRate.zone2) &&
        Objects.equals(this.period, serviceItemTaxRate.period) &&
        Objects.equals(this.reason, serviceItemTaxRate.reason) &&
        Objects.equals(this.message, serviceItemTaxRate.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxType, rateType, rate, isExempt, discount, zone1, zone2, period, reason, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceItemTaxRate {\n");
    
    sb.append("    taxType: ").append(toIndentedString(taxType)).append("\n");
    sb.append("    rateType: ").append(toIndentedString(rateType)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    isExempt: ").append(toIndentedString(isExempt)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    zone1: ").append(toIndentedString(zone1)).append("\n");
    sb.append("    zone2: ").append(toIndentedString(zone2)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

