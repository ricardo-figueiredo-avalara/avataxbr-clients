/**
 * AvaTax Brazil
 * The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.client.model.StateEnum;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Address {
  
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
  private String countryCode = null;
  @SerializedName("country")
  private String country = null;

  /**
   * Street Name
   **/
  @ApiModelProperty(value = "Street Name")
  public String getStreet() {
    return street;
  }
  public void setStreet(String street) {
    this.street = street;
  }

  /**
   * Neighborhood Name
   **/
  @ApiModelProperty(value = "Neighborhood Name")
  public String getNeighborhood() {
    return neighborhood;
  }
  public void setNeighborhood(String neighborhood) {
    this.neighborhood = neighborhood;
  }

  /**
   * Brazilian Zip Code
   **/
  @ApiModelProperty(required = true, value = "Brazilian Zip Code")
  public String getZipcode() {
    return zipcode;
  }
  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }

  /**
   * City Code (IBGE)
   **/
  @ApiModelProperty(value = "City Code (IBGE)")
  public String getCityCode() {
    return cityCode;
  }
  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }

  /**
   * City Name
   **/
  @ApiModelProperty(value = "City Name")
  public String getCityName() {
    return cityName;
  }
  public void setCityName(String cityName) {
    this.cityName = cityName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  /**
   * Country Code
   **/
  @ApiModelProperty(value = "Country Code")
  public String getCountryCode() {
    return countryCode;
  }
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  /**
   * Use ISO 3166-1 alpha-3 codes
   **/
  @ApiModelProperty(value = "Use ISO 3166-1 alpha-3 codes")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return (this.street == null ? address.street == null : this.street.equals(address.street)) &&
        (this.neighborhood == null ? address.neighborhood == null : this.neighborhood.equals(address.neighborhood)) &&
        (this.zipcode == null ? address.zipcode == null : this.zipcode.equals(address.zipcode)) &&
        (this.cityCode == null ? address.cityCode == null : this.cityCode.equals(address.cityCode)) &&
        (this.cityName == null ? address.cityName == null : this.cityName.equals(address.cityName)) &&
        (this.state == null ? address.state == null : this.state.equals(address.state)) &&
        (this.countryCode == null ? address.countryCode == null : this.countryCode.equals(address.countryCode)) &&
        (this.country == null ? address.country == null : this.country.equals(address.country));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.street == null ? 0: this.street.hashCode());
    result = 31 * result + (this.neighborhood == null ? 0: this.neighborhood.hashCode());
    result = 31 * result + (this.zipcode == null ? 0: this.zipcode.hashCode());
    result = 31 * result + (this.cityCode == null ? 0: this.cityCode.hashCode());
    result = 31 * result + (this.cityName == null ? 0: this.cityName.hashCode());
    result = 31 * result + (this.state == null ? 0: this.state.hashCode());
    result = 31 * result + (this.countryCode == null ? 0: this.countryCode.hashCode());
    result = 31 * result + (this.country == null ? 0: this.country.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("  street: ").append(street).append("\n");
    sb.append("  neighborhood: ").append(neighborhood).append("\n");
    sb.append("  zipcode: ").append(zipcode).append("\n");
    sb.append("  cityCode: ").append(cityCode).append("\n");
    sb.append("  cityName: ").append(cityName).append("\n");
    sb.append("  state: ").append(state).append("\n");
    sb.append("  countryCode: ").append(countryCode).append("\n");
    sb.append("  country: ").append(country).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
