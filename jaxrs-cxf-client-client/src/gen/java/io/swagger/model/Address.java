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

public class Address  {
  
  @ApiModelProperty(example = "null", value = "Street Name")
  private String street = null;
  @ApiModelProperty(example = "null", value = "Neighborhood Name")
  private String neighborhood = null;
  @ApiModelProperty(example = "null", required = true, value = "Brazilian Zip Code")
  private String zipcode = null;
  @ApiModelProperty(example = "null", value = "City Code (IBGE)")
  private String cityCode = null;
  @ApiModelProperty(example = "null", value = "City Name")
  private String cityName = null;
  @ApiModelProperty(example = "null", value = "")
  private StateEnum state = null;
  @ApiModelProperty(example = "null", value = "Country Code")
  private String countryCode = "0";
  @ApiModelProperty(example = "null", value = "Use ISO 3166-1 alpha-3 codes")
  private String country = "BRA";

 /**
   * Street Name
   * @return street
  **/
  public String getStreet() {
    return street;
  }
  public void setStreet(String street) {
    this.street = street;
  }
 /**
   * Neighborhood Name
   * @return neighborhood
  **/
  public String getNeighborhood() {
    return neighborhood;
  }
  public void setNeighborhood(String neighborhood) {
    this.neighborhood = neighborhood;
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
   * City Code (IBGE)
   * @return cityCode
  **/
  public String getCityCode() {
    return cityCode;
  }
  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }
 /**
   * City Name
   * @return cityName
  **/
  public String getCityName() {
    return cityName;
  }
  public void setCityName(String cityName) {
    this.cityName = cityName;
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
   * Country Code
   * @return countryCode
  **/
  public String getCountryCode() {
    return countryCode;
  }
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
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
    sb.append("class Address {\n");
    
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    neighborhood: ").append(toIndentedString(neighborhood)).append("\n");
    sb.append("    zipcode: ").append(toIndentedString(zipcode)).append("\n");
    sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
    sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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

