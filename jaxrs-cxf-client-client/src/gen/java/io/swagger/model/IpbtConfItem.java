package io.swagger.model;

import io.swagger.model.StateEnum;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class IpbtConfItem  {
  
  @ApiModelProperty(example = "null", value = "")
  private StateEnum state = null;
  @ApiModelProperty(example = "null", value = "")
  private Double federalTax = null;
  @ApiModelProperty(example = "null", value = "")
  private Double importTax = null;
  @ApiModelProperty(example = "null", value = "")
  private Double stateTax = null;
  @ApiModelProperty(example = "null", value = "")
  private Double cityTax = null;
  @ApiModelProperty(example = "null", value = "")
  private String source = null;

 /**
   * Get state
   * @return state
  **/
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }
 /**
   * Get federalTax
   * @return federalTax
  **/
  public Double getFederalTax() {
    return federalTax;
  }
  public void setFederalTax(Double federalTax) {
    this.federalTax = federalTax;
  }
 /**
   * Get importTax
   * @return importTax
  **/
  public Double getImportTax() {
    return importTax;
  }
  public void setImportTax(Double importTax) {
    this.importTax = importTax;
  }
 /**
   * Get stateTax
   * @return stateTax
  **/
  public Double getStateTax() {
    return stateTax;
  }
  public void setStateTax(Double stateTax) {
    this.stateTax = stateTax;
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
 /**
   * Get source
   * @return source
  **/
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpbtConfItem {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    federalTax: ").append(toIndentedString(federalTax)).append("\n");
    sb.append("    importTax: ").append(toIndentedString(importTax)).append("\n");
    sb.append("    stateTax: ").append(toIndentedString(stateTax)).append("\n");
    sb.append("    cityTax: ").append(toIndentedString(cityTax)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

