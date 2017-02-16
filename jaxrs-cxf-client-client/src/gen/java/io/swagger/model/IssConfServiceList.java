package io.swagger.model;

import io.swagger.model.IssConfServiceListTaxRate;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class IssConfServiceList  {
  
  @ApiModelProperty(example = "null", value = "")
  private String agast = null;
  @ApiModelProperty(example = "null", value = "")
  private String cityServiceCode = null;
  @ApiModelProperty(example = "null", value = "")
  private IssConfServiceListTaxRate taxRate = null;

 /**
   * Get agast
   * @return agast
  **/
  public String getAgast() {
    return agast;
  }
  public void setAgast(String agast) {
    this.agast = agast;
  }
 /**
   * Get cityServiceCode
   * @return cityServiceCode
  **/
  public String getCityServiceCode() {
    return cityServiceCode;
  }
  public void setCityServiceCode(String cityServiceCode) {
    this.cityServiceCode = cityServiceCode;
  }
 /**
   * Get taxRate
   * @return taxRate
  **/
  public IssConfServiceListTaxRate getTaxRate() {
    return taxRate;
  }
  public void setTaxRate(IssConfServiceListTaxRate taxRate) {
    this.taxRate = taxRate;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssConfServiceList {\n");
    
    sb.append("    agast: ").append(toIndentedString(agast)).append("\n");
    sb.append("    cityServiceCode: ").append(toIndentedString(cityServiceCode)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
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

