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

public class VehicleID  {
  
  @ApiModelProperty(example = "null", required = true, value = "")
  private String licensePlate = null;
  @ApiModelProperty(example = "null", required = true, value = "")
  private StateEnum stateCode = null;
  @ApiModelProperty(example = "null", value = "Cargo Transport National Register, Registro Nacional de Transportador de Carga (ANTT)")
  private String rtnc = null;

 /**
   * Get licensePlate
   * @return licensePlate
  **/
  public String getLicensePlate() {
    return licensePlate;
  }
  public void setLicensePlate(String licensePlate) {
    this.licensePlate = licensePlate;
  }
 /**
   * Get stateCode
   * @return stateCode
  **/
  public StateEnum getStateCode() {
    return stateCode;
  }
  public void setStateCode(StateEnum stateCode) {
    this.stateCode = stateCode;
  }
 /**
   * Cargo Transport National Register, Registro Nacional de Transportador de Carga (ANTT)
   * @return rtnc
  **/
  public String getRtnc() {
    return rtnc;
  }
  public void setRtnc(String rtnc) {
    this.rtnc = rtnc;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

