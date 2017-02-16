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

/**
 * FuelCide
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-16T18:26:15.214Z")
public class FuelCide {
  @SerializedName("baseCalcCIDE")
  private Double baseCalcCIDE = null;

  @SerializedName("rateCIDE")
  private Double rateCIDE = null;

  @SerializedName("valueCIDE")
  private Double valueCIDE = null;

  public FuelCide baseCalcCIDE(Double baseCalcCIDE) {
    this.baseCalcCIDE = baseCalcCIDE;
    return this;
  }

   /**
   * percentage of natural gas (GLP), this decimal 12 integers and 0 to 4 decimals
   * @return baseCalcCIDE
  **/
  @ApiModelProperty(example = "null", required = true, value = "percentage of natural gas (GLP), this decimal 12 integers and 0 to 4 decimals")
  public Double getBaseCalcCIDE() {
    return baseCalcCIDE;
  }

  public void setBaseCalcCIDE(Double baseCalcCIDE) {
    this.baseCalcCIDE = baseCalcCIDE;
  }

  public FuelCide rateCIDE(Double rateCIDE) {
    this.rateCIDE = rateCIDE;
    return this;
  }

   /**
   * percentage of natural gas (GLP), this decimal 11 integers and 0 to 4 decimals - R$
   * @return rateCIDE
  **/
  @ApiModelProperty(example = "null", required = true, value = "percentage of natural gas (GLP), this decimal 11 integers and 0 to 4 decimals - R$")
  public Double getRateCIDE() {
    return rateCIDE;
  }

  public void setRateCIDE(Double rateCIDE) {
    this.rateCIDE = rateCIDE;
  }

  public FuelCide valueCIDE(Double valueCIDE) {
    this.valueCIDE = valueCIDE;
    return this;
  }

   /**
   * percentage of natural gas (GLP), this decimal 13 integers and 2 decimals - R$
   * @return valueCIDE
  **/
  @ApiModelProperty(example = "null", required = true, value = "percentage of natural gas (GLP), this decimal 13 integers and 2 decimals - R$")
  public Double getValueCIDE() {
    return valueCIDE;
  }

  public void setValueCIDE(Double valueCIDE) {
    this.valueCIDE = valueCIDE;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FuelCide fuelCide = (FuelCide) o;
    return Objects.equals(this.baseCalcCIDE, fuelCide.baseCalcCIDE) &&
        Objects.equals(this.rateCIDE, fuelCide.rateCIDE) &&
        Objects.equals(this.valueCIDE, fuelCide.valueCIDE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseCalcCIDE, rateCIDE, valueCIDE);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FuelCide {\n");
    
    sb.append("    baseCalcCIDE: ").append(toIndentedString(baseCalcCIDE)).append("\n");
    sb.append("    rateCIDE: ").append(toIndentedString(rateCIDE)).append("\n");
    sb.append("    valueCIDE: ").append(toIndentedString(valueCIDE)).append("\n");
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

