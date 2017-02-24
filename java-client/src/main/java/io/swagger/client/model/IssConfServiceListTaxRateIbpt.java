/*
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

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * IssConfServiceListTaxRateIbpt
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-24T19:47:57.099Z")
public class IssConfServiceListTaxRateIbpt {
  @SerializedName("nationalFedTax")
  private Double nationalFedTax = null;

  @SerializedName("cityTax")
  private Double cityTax = null;

  public IssConfServiceListTaxRateIbpt nationalFedTax(Double nationalFedTax) {
    this.nationalFedTax = nationalFedTax;
    return this;
  }

   /**
   * Get nationalFedTax
   * @return nationalFedTax
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getNationalFedTax() {
    return nationalFedTax;
  }

  public void setNationalFedTax(Double nationalFedTax) {
    this.nationalFedTax = nationalFedTax;
  }

  public IssConfServiceListTaxRateIbpt cityTax(Double cityTax) {
    this.cityTax = cityTax;
    return this;
  }

   /**
   * Get cityTax
   * @return cityTax
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getCityTax() {
    return cityTax;
  }

  public void setCityTax(Double cityTax) {
    this.cityTax = cityTax;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssConfServiceListTaxRateIbpt issConfServiceListTaxRateIbpt = (IssConfServiceListTaxRateIbpt) o;
    return Objects.equals(this.nationalFedTax, issConfServiceListTaxRateIbpt.nationalFedTax) &&
        Objects.equals(this.cityTax, issConfServiceListTaxRateIbpt.cityTax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nationalFedTax, cityTax);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

