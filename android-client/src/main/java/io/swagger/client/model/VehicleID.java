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
public class VehicleID {
  
  @SerializedName("licensePlate")
  private String licensePlate = null;
  @SerializedName("stateCode")
  private StateEnum stateCode = null;
  @SerializedName("rtnc")
  private String rtnc = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getLicensePlate() {
    return licensePlate;
  }
  public void setLicensePlate(String licensePlate) {
    this.licensePlate = licensePlate;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public StateEnum getStateCode() {
    return stateCode;
  }
  public void setStateCode(StateEnum stateCode) {
    this.stateCode = stateCode;
  }

  /**
   * Cargo Transport National Register, Registro Nacional de Transportador de Carga (ANTT)
   **/
  @ApiModelProperty(value = "Cargo Transport National Register, Registro Nacional de Transportador de Carga (ANTT)")
  public String getRtnc() {
    return rtnc;
  }
  public void setRtnc(String rtnc) {
    this.rtnc = rtnc;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleID vehicleID = (VehicleID) o;
    return (this.licensePlate == null ? vehicleID.licensePlate == null : this.licensePlate.equals(vehicleID.licensePlate)) &&
        (this.stateCode == null ? vehicleID.stateCode == null : this.stateCode.equals(vehicleID.stateCode)) &&
        (this.rtnc == null ? vehicleID.rtnc == null : this.rtnc.equals(vehicleID.rtnc));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.licensePlate == null ? 0: this.licensePlate.hashCode());
    result = 31 * result + (this.stateCode == null ? 0: this.stateCode.hashCode());
    result = 31 * result + (this.rtnc == null ? 0: this.rtnc.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleID {\n");
    
    sb.append("  licensePlate: ").append(licensePlate).append("\n");
    sb.append("  stateCode: ").append(stateCode).append("\n");
    sb.append("  rtnc: ").append(rtnc).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
