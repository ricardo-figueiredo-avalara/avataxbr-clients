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
 * SalesLinesOutTaxDeductions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-24T19:47:57.099Z")
public class SalesLinesOutTaxDeductions {
  @SerializedName("iss")
  private Double iss = null;

  public SalesLinesOutTaxDeductions iss(Double iss) {
    this.iss = iss;
    return this;
  }

   /**
   * Deduction amount not ISS taxable. Example Building material
   * @return iss
  **/
  @ApiModelProperty(example = "null", value = "Deduction amount not ISS taxable. Example Building material")
  public Double getIss() {
    return iss;
  }

  public void setIss(Double iss) {
    this.iss = iss;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SalesLinesOutTaxDeductions salesLinesOutTaxDeductions = (SalesLinesOutTaxDeductions) o;
    return Objects.equals(this.iss, salesLinesOutTaxDeductions.iss);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iss);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesLinesOutTaxDeductions {\n");
    
    sb.append("    iss: ").append(toIndentedString(iss)).append("\n");
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

