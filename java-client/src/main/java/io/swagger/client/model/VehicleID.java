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

import io.swagger.annotations.ApiModelProperty;

/**
 * VehicleID
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-06T17:54:07.550Z")
public class VehicleID {
  @SerializedName("licensePlate")
  private String licensePlate = null;

  @SerializedName("stateCode")
  private StateEnum stateCode = null;

  @SerializedName("rtnc")
  private String rtnc = null;

  public VehicleID licensePlate(String licensePlate) {
    this.licensePlate = licensePlate;
    return this;
  }

   /**
   * Get licensePlate
   * @return licensePlate
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getLicensePlate() {
    return licensePlate;
  }

  public void setLicensePlate(String licensePlate) {
    this.licensePlate = licensePlate;
  }

  public VehicleID stateCode(StateEnum stateCode) {
    this.stateCode = stateCode;
    return this;
  }

   /**
   * Get stateCode
   * @return stateCode
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public StateEnum getStateCode() {
    return stateCode;
  }

  public void setStateCode(StateEnum stateCode) {
    this.stateCode = stateCode;
  }

  public VehicleID rtnc(String rtnc) {
    this.rtnc = rtnc;
    return this;
  }

   /**
   * Cargo Transport National Register, Registro Nacional de Transportador de Carga (ANTT)
   * @return rtnc
  **/
  @ApiModelProperty(example = "null", value = "Cargo Transport National Register, Registro Nacional de Transportador de Carga (ANTT)")
  public String getRtnc() {
    return rtnc;
  }

  public void setRtnc(String rtnc) {
    this.rtnc = rtnc;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleID vehicleID = (VehicleID) o;
    return Objects.equals(this.licensePlate, vehicleID.licensePlate) &&
        Objects.equals(this.stateCode, vehicleID.stateCode) &&
        Objects.equals(this.rtnc, vehicleID.rtnc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(licensePlate, stateCode, rtnc);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleID {\n");
    
    sb.append("    licensePlate: ").append(toIndentedString(licensePlate)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
    sb.append("    rtnc: ").append(toIndentedString(rtnc)).append("\n");
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

