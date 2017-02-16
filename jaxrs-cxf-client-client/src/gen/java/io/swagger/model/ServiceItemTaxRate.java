package io.swagger.model;

import io.swagger.model.ServiceItemTaxRatePeriod;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class ServiceItemTaxRate  {
  
  @ApiModelProperty(example = "null", value = "")
  private String taxType = null;
  @ApiModelProperty(example = "null", value = "")
  private String rateType = null;
  @ApiModelProperty(example = "null", value = "")
  private Double rate = null;
  @ApiModelProperty(example = "null", value = "")
  private Boolean isExempt = null;
  @ApiModelProperty(example = "null", value = "")
  private Double discount = null;
  @ApiModelProperty(example = "null", value = "")
  private Integer zone1 = null;
  @ApiModelProperty(example = "null", value = "")
  private Integer zone2 = null;
  @ApiModelProperty(example = "null", value = "")
  private ServiceItemTaxRatePeriod period = null;
  @ApiModelProperty(example = "null", value = "")
  private String reason = null;
  @ApiModelProperty(example = "null", value = "")
  private String message = null;

 /**
   * Get taxType
   * @return taxType
  **/
  public String getTaxType() {
    return taxType;
  }
  public void setTaxType(String taxType) {
    this.taxType = taxType;
  }
 /**
   * Get rateType
   * @return rateType
  **/
  public String getRateType() {
    return rateType;
  }
  public void setRateType(String rateType) {
    this.rateType = rateType;
  }
 /**
   * Get rate
   * @return rate
  **/
  public Double getRate() {
    return rate;
  }
  public void setRate(Double rate) {
    this.rate = rate;
  }
 /**
   * Get isExempt
   * @return isExempt
  **/
  public Boolean getIsExempt() {
    return isExempt;
  }
  public void setIsExempt(Boolean isExempt) {
    this.isExempt = isExempt;
  }
 /**
   * Get discount
   * @return discount
  **/
  public Double getDiscount() {
    return discount;
  }
  public void setDiscount(Double discount) {
    this.discount = discount;
  }
 /**
   * Get zone1
   * @return zone1
  **/
  public Integer getZone1() {
    return zone1;
  }
  public void setZone1(Integer zone1) {
    this.zone1 = zone1;
  }
 /**
   * Get zone2
   * @return zone2
  **/
  public Integer getZone2() {
    return zone2;
  }
  public void setZone2(Integer zone2) {
    this.zone2 = zone2;
  }
 /**
   * Get period
   * @return period
  **/
  public ServiceItemTaxRatePeriod getPeriod() {
    return period;
  }
  public void setPeriod(ServiceItemTaxRatePeriod period) {
    this.period = period;
  }
 /**
   * Get reason
   * @return reason
  **/
  public String getReason() {
    return reason;
  }
  public void setReason(String reason) {
    this.reason = reason;
  }
 /**
   * Get message
   * @return message
  **/
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

