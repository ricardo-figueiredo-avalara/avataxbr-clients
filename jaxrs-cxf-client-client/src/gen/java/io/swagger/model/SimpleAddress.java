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

public class SimpleAddress  {
  
  @ApiModelProperty(example = "null", required = true, value = "Address")
  private String line1 = null;
  @ApiModelProperty(example = "null", required = true, value = "Number")
  private String line2 = null;
  @ApiModelProperty(example = "null", required = true, value = "District")
  private String line3 = null;
  @ApiModelProperty(example = "null", value = "")
  private String city = null;
  @ApiModelProperty(example = "null", required = true, value = "Brazilian Zip Code")
  private String zipcode = null;
  @ApiModelProperty(example = "null", value = "")
  private StateEnum state = null;
  @ApiModelProperty(example = "null", required = true, value = "Use ISO 3166-1 alpha-3 codes")
  private String country = "BRA";

 /**
   * Address
   * @return line1
  **/
  public String getLine1() {
    return line1;
  }
  public void setLine1(String line1) {
    this.line1 = line1;
  }
 /**
   * Number
   * @return line2
  **/
  public String getLine2() {
    return line2;
  }
  public void setLine2(String line2) {
    this.line2 = line2;
  }
 /**
   * District
   * @return line3
  **/
  public String getLine3() {
    return line3;
  }
  public void setLine3(String line3) {
    this.line3 = line3;
  }
 /**
   * Get city
   * @return city
  **/
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }
 /**
   * Brazilian Zip Code
   * @return zipcode
  **/
  public String getZipcode() {
    return zipcode;
  }
  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }
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
   * Use ISO 3166-1 alpha-3 codes
   * @return country
  **/
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleAddress {\n");
    
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
    sb.append("    line2: ").append(toIndentedString(line2)).append("\n");
    sb.append("    line3: ").append(toIndentedString(line3)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    zipcode: ").append(toIndentedString(zipcode)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

