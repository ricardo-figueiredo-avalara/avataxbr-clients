package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class IssConfServiceListTaxRateIbpt  {
  
  @ApiModelProperty(example = "null", value = "")
  private Double nationalFedTax = null;
  @ApiModelProperty(example = "null", value = "")
  private Double cityTax = null;

 /**
   * Get nationalFedTax
   * @return nationalFedTax
  **/
  public Double getNationalFedTax() {
    return nationalFedTax;
  }
  public void setNationalFedTax(Double nationalFedTax) {
    this.nationalFedTax = nationalFedTax;
  }
 /**
   * Get cityTax
   * @return cityTax
  **/
  public Double getCityTax() {
    return cityTax;
  }
  public void setCityTax(Double cityTax) {
    this.cityTax = cityTax;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssConfServiceListTaxRateIbpt {\n");
    
    sb.append("    nationalFedTax: ").append(toIndentedString(nationalFedTax)).append("\n");
    sb.append("    cityTax: ").append(toIndentedString(cityTax)).append("\n");
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

