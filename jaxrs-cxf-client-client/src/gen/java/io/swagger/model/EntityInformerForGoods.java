package io.swagger.model;

import io.swagger.model.Address;
import io.swagger.model.EntityInformerForGoodsFederalTaxRegime;
import io.swagger.model.EntityType;
import io.swagger.model.FederalTaxRegime;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class EntityInformerForGoods  {
  
  @ApiModelProperty(example = "null", value = "")
  private EntityType type = null;
  @ApiModelProperty(example = "null", value = "")
  private FederalTaxRegime taxRegime = null;
  @ApiModelProperty(example = "null", value = "")
  private EntityInformerForGoodsFederalTaxRegime federalTaxRegime = null;
  @ApiModelProperty(example = "null", value = "")
  private String cityCode = null;
  @ApiModelProperty(example = "null", value = "")
  private Address address = null;
  @ApiModelProperty(example = "null", value = "")
  private Object details = null;
  @ApiModelProperty(example = "null", value = "")
  private Boolean icmsTaxPayer = null;

 /**
   * Get type
   * @return type
  **/
  public EntityType getType() {
    return type;
  }
  public void setType(EntityType type) {
    this.type = type;
  }
 /**
   * Get taxRegime
   * @return taxRegime
  **/
  public FederalTaxRegime getTaxRegime() {
    return taxRegime;
  }
  public void setTaxRegime(FederalTaxRegime taxRegime) {
    this.taxRegime = taxRegime;
  }
 /**
   * Get federalTaxRegime
   * @return federalTaxRegime
  **/
  public EntityInformerForGoodsFederalTaxRegime getFederalTaxRegime() {
    return federalTaxRegime;
  }
  public void setFederalTaxRegime(EntityInformerForGoodsFederalTaxRegime federalTaxRegime) {
    this.federalTaxRegime = federalTaxRegime;
  }
 /**
   * Get cityCode
   * @return cityCode
  **/
  public String getCityCode() {
    return cityCode;
  }
  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }
 /**
   * Get address
   * @return address
  **/
  public Address getAddress() {
    return address;
  }
  public void setAddress(Address address) {
    this.address = address;
  }
 /**
   * Get details
   * @return details
  **/
  public Object getDetails() {
    return details;
  }
  public void setDetails(Object details) {
    this.details = details;
  }
 /**
   * Get icmsTaxPayer
   * @return icmsTaxPayer
  **/
  public Boolean getIcmsTaxPayer() {
    return icmsTaxPayer;
  }
  public void setIcmsTaxPayer(Boolean icmsTaxPayer) {
    this.icmsTaxPayer = icmsTaxPayer;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityInformerForGoods {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    taxRegime: ").append(toIndentedString(taxRegime)).append("\n");
    sb.append("    federalTaxRegime: ").append(toIndentedString(federalTaxRegime)).append("\n");
    sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    icmsTaxPayer: ").append(toIndentedString(icmsTaxPayer)).append("\n");
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

