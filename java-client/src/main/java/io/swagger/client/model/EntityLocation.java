/*
 * BR16 - API
 * This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.StateEnum;

/**
 * EntityLocation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-16T18:26:15.214Z")
public class EntityLocation {
  @SerializedName("street")
  private String street = null;

  @SerializedName("neighborhood")
  private String neighborhood = null;

  @SerializedName("zipcode")
  private String zipcode = null;

  @SerializedName("cityCode")
  private String cityCode = null;

  @SerializedName("cityName")
  private String cityName = null;

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("countryCode")
  private String countryCode = "0";

  @SerializedName("country")
  private String country = "BRA";

  public EntityLocation street(String street) {
    this.street = street;
    return this;
  }

   /**
   * Street Name
   * @return street
  **/
  @ApiModelProperty(example = "null", value = "Street Name")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public EntityLocation neighborhood(String neighborhood) {
    this.neighborhood = neighborhood;
    return this;
  }

   /**
   * Neighborhood Name
   * @return neighborhood
  **/
  @ApiModelProperty(example = "null", value = "Neighborhood Name")
  public String getNeighborhood() {
    return neighborhood;
  }

  public void setNeighborhood(String neighborhood) {
    this.neighborhood = neighborhood;
  }

  public EntityLocation zipcode(String zipcode) {
    this.zipcode = zipcode;
    return this;
  }

   /**
   * Brazilian Zip Code
   * @return zipcode
  **/
  @ApiModelProperty(example = "null", required = true, value = "Brazilian Zip Code")
  public String getZipcode() {
    return zipcode;
  }

  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }

  public EntityLocation cityCode(String cityCode) {
    this.cityCode = cityCode;
    return this;
  }

   /**
   * City Code (IBGE)
   * @return cityCode
  **/
  @ApiModelProperty(example = "null", value = "City Code (IBGE)")
  public String getCityCode() {
    return cityCode;
  }

  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }

  public EntityLocation cityName(String cityName) {
    this.cityName = cityName;
    return this;
  }

   /**
   * City Name
   * @return cityName
  **/
  @ApiModelProperty(example = "null", value = "City Name")
  public String getCityName() {
    return cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }

  public EntityLocation state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(example = "null", value = "")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public EntityLocation countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Country Code
   * @return countryCode
  **/
  @ApiModelProperty(example = "null", value = "Country Code")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public EntityLocation country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Use ISO 3166-1 alpha-3 codes
   * @return country
  **/
  @ApiModelProperty(example = "null", value = "Use ISO 3166-1 alpha-3 codes")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityLocation entityLocation = (EntityLocation) o;
    return Objects.equals(this.street, entityLocation.street) &&
        Objects.equals(this.neighborhood, entityLocation.neighborhood) &&
        Objects.equals(this.zipcode, entityLocation.zipcode) &&
        Objects.equals(this.cityCode, entityLocation.cityCode) &&
        Objects.equals(this.cityName, entityLocation.cityName) &&
        Objects.equals(this.state, entityLocation.state) &&
        Objects.equals(this.countryCode, entityLocation.countryCode) &&
        Objects.equals(this.country, entityLocation.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(street, neighborhood, zipcode, cityCode, cityName, state, countryCode, country);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityLocation {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

