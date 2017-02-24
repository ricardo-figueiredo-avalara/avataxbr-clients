package io.swagger.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@ApiModel(description="inform if this item is subject to withholding COFINS on service Transactions, by entity type, default true")
public class AgastWithholdingCOFINS  {
  
  @ApiModelProperty(example = "null", value = "")
  private String legalReason = null;
  @ApiModelProperty(example = "null", value = "")
  private Boolean business = null;
  @ApiModelProperty(example = "null", value = "reference id to TaxLegalReason")
  private String businessLegalReason = null;
  @ApiModelProperty(example = "null", value = "")
  private Boolean federalGovernment = null;
  @ApiModelProperty(example = "null", value = "reference id to TaxLegalReason")
  private String federalGovernmentLegalReason = null;
  @ApiModelProperty(example = "null", value = "")
  private Boolean stateGovernment = null;
  @ApiModelProperty(example = "null", value = "reference id to TaxLegalReason")
  private String stateGovernmentLegalReason = null;
  @ApiModelProperty(example = "null", value = "")
  private Boolean cityGovernment = null;
  @ApiModelProperty(example = "null", value = "reference id to TaxLegalReason")
  private String cityGovernmentLegalReason = null;

 /**
   * Get legalReason
   * @return legalReason
  **/
  public String getLegalReason() {
    return legalReason;
  }
  public void setLegalReason(String legalReason) {
    this.legalReason = legalReason;
  }
 /**
   * Get business
   * @return business
  **/
  public Boolean getBusiness() {
    return business;
  }
  public void setBusiness(Boolean business) {
    this.business = business;
  }
 /**
   * reference id to TaxLegalReason
   * @return businessLegalReason
  **/
  public String getBusinessLegalReason() {
    return businessLegalReason;
  }
  public void setBusinessLegalReason(String businessLegalReason) {
    this.businessLegalReason = businessLegalReason;
  }
 /**
   * Get federalGovernment
   * @return federalGovernment
  **/
  public Boolean getFederalGovernment() {
    return federalGovernment;
  }
  public void setFederalGovernment(Boolean federalGovernment) {
    this.federalGovernment = federalGovernment;
  }
 /**
   * reference id to TaxLegalReason
   * @return federalGovernmentLegalReason
  **/
  public String getFederalGovernmentLegalReason() {
    return federalGovernmentLegalReason;
  }
  public void setFederalGovernmentLegalReason(String federalGovernmentLegalReason) {
    this.federalGovernmentLegalReason = federalGovernmentLegalReason;
  }
 /**
   * Get stateGovernment
   * @return stateGovernment
  **/
  public Boolean getStateGovernment() {
    return stateGovernment;
  }
  public void setStateGovernment(Boolean stateGovernment) {
    this.stateGovernment = stateGovernment;
  }
 /**
   * reference id to TaxLegalReason
   * @return stateGovernmentLegalReason
  **/
  public String getStateGovernmentLegalReason() {
    return stateGovernmentLegalReason;
  }
  public void setStateGovernmentLegalReason(String stateGovernmentLegalReason) {
    this.stateGovernmentLegalReason = stateGovernmentLegalReason;
  }
 /**
   * Get cityGovernment
   * @return cityGovernment
  **/
  public Boolean getCityGovernment() {
    return cityGovernment;
  }
  public void setCityGovernment(Boolean cityGovernment) {
    this.cityGovernment = cityGovernment;
  }
 /**
   * reference id to TaxLegalReason
   * @return cityGovernmentLegalReason
  **/
  public String getCityGovernmentLegalReason() {
    return cityGovernmentLegalReason;
  }
  public void setCityGovernmentLegalReason(String cityGovernmentLegalReason) {
    this.cityGovernmentLegalReason = cityGovernmentLegalReason;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgastWithholdingCOFINS {\n");
    
    sb.append("    legalReason: ").append(toIndentedString(legalReason)).append("\n");
    sb.append("    business: ").append(toIndentedString(business)).append("\n");
    sb.append("    businessLegalReason: ").append(toIndentedString(businessLegalReason)).append("\n");
    sb.append("    federalGovernment: ").append(toIndentedString(federalGovernment)).append("\n");
    sb.append("    federalGovernmentLegalReason: ").append(toIndentedString(federalGovernmentLegalReason)).append("\n");
    sb.append("    stateGovernment: ").append(toIndentedString(stateGovernment)).append("\n");
    sb.append("    stateGovernmentLegalReason: ").append(toIndentedString(stateGovernmentLegalReason)).append("\n");
    sb.append("    cityGovernment: ").append(toIndentedString(cityGovernment)).append("\n");
    sb.append("    cityGovernmentLegalReason: ").append(toIndentedString(cityGovernmentLegalReason)).append("\n");
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

