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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class IssConfServiceListTaxRateIbpt {
  
  @SerializedName("nationalFedTax")
  private Double nationalFedTax = null;
  @SerializedName("cityTax")
  private Double cityTax = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getNationalFedTax() {
    return nationalFedTax;
  }
  public void setNationalFedTax(Double nationalFedTax) {
    this.nationalFedTax = nationalFedTax;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getCityTax() {
    return cityTax;
  }
  public void setCityTax(Double cityTax) {
    this.cityTax = cityTax;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssConfServiceListTaxRateIbpt issConfServiceListTaxRateIbpt = (IssConfServiceListTaxRateIbpt) o;
    return (this.nationalFedTax == null ? issConfServiceListTaxRateIbpt.nationalFedTax == null : this.nationalFedTax.equals(issConfServiceListTaxRateIbpt.nationalFedTax)) &&
        (this.cityTax == null ? issConfServiceListTaxRateIbpt.cityTax == null : this.cityTax.equals(issConfServiceListTaxRateIbpt.cityTax));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.nationalFedTax == null ? 0: this.nationalFedTax.hashCode());
    result = 31 * result + (this.cityTax == null ? 0: this.cityTax.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssConfServiceListTaxRateIbpt {\n");
    
    sb.append("  nationalFedTax: ").append(nationalFedTax).append("\n");
    sb.append("  cityTax: ").append(cityTax).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
