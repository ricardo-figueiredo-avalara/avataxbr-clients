package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.WithholdDef;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@ApiModel(description="Assign an empty object for simple withholding, null (no key) for no withholding. Detailed behaviors for specific targets may be set by using the available optional keys. ")
public class TaxTypeRateWithholding  {
  
  @ApiModelProperty(example = "null", value = "")
  private WithholdDef all = null;
  @ApiModelProperty(example = "null", value = "")
  private WithholdDef business = null;
  @ApiModelProperty(example = "null", value = "")
  private WithholdDef federalGovernment = null;
  @ApiModelProperty(example = "null", value = "")
  private WithholdDef stateGovernment = null;
  @ApiModelProperty(example = "null", value = "")
  private WithholdDef cityGovernment = null;

 /**
   * Get all
   * @return all
  **/
  public WithholdDef getAll() {
    return all;
  }
  public void setAll(WithholdDef all) {
    this.all = all;
  }
 /**
   * Get business
   * @return business
  **/
  public WithholdDef getBusiness() {
    return business;
  }
  public void setBusiness(WithholdDef business) {
    this.business = business;
  }
 /**
   * Get federalGovernment
   * @return federalGovernment
  **/
  public WithholdDef getFederalGovernment() {
    return federalGovernment;
  }
  public void setFederalGovernment(WithholdDef federalGovernment) {
    this.federalGovernment = federalGovernment;
  }
 /**
   * Get stateGovernment
   * @return stateGovernment
  **/
  public WithholdDef getStateGovernment() {
    return stateGovernment;
  }
  public void setStateGovernment(WithholdDef stateGovernment) {
    this.stateGovernment = stateGovernment;
  }
 /**
   * Get cityGovernment
   * @return cityGovernment
  **/
  public WithholdDef getCityGovernment() {
    return cityGovernment;
  }
  public void setCityGovernment(WithholdDef cityGovernment) {
    this.cityGovernment = cityGovernment;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxTypeRateWithholding {\n");
    
    sb.append("    all: ").append(toIndentedString(all)).append("\n");
    sb.append("    business: ").append(toIndentedString(business)).append("\n");
    sb.append("    federalGovernment: ").append(toIndentedString(federalGovernment)).append("\n");
    sb.append("    stateGovernment: ").append(toIndentedString(stateGovernment)).append("\n");
    sb.append("    cityGovernment: ").append(toIndentedString(cityGovernment)).append("\n");
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

