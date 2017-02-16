package io.swagger.model;

import io.swagger.model.FuelCide;
import io.swagger.model.FuelPumpNumber;
import io.swagger.model.StateEnum;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class Fuel  {
  
  @ApiModelProperty(example = "null", required = true, value = "")
  private String prodANPCode = null;
  @ApiModelProperty(example = "null", value = "percentage of natural gas (GLP)")
  private Double perMixGN = null;
  @ApiModelProperty(example = "null", value = "")
  private String authorizationCodeCODIF = null;
  @ApiModelProperty(example = "null", value = "This decimal 12 integers and 0 to 4 decimals Quantidade de combustível faturada à temperatura ambiente. Informar quando a quantidade faturada informada no campo qCom (I10) tiver sido ajustada para uma temperatura diferente da ambiente. ")
  private Double quantityOnRoomTemperature = null;
  @ApiModelProperty(example = "null", required = true, value = "state where fuel was used")
  private StateEnum stateCodeOfUndUser = null;
  @ApiModelProperty(example = "null", value = "")
  private FuelCide cide = null;
  @ApiModelProperty(example = "null", value = "")
  private FuelPumpNumber pumpNumber = null;

 /**
   * Get prodANPCode
   * @return prodANPCode
  **/
  public String getProdANPCode() {
    return prodANPCode;
  }
  public void setProdANPCode(String prodANPCode) {
    this.prodANPCode = prodANPCode;
  }
 /**
   * percentage of natural gas (GLP)
   * @return perMixGN
  **/
  public Double getPerMixGN() {
    return perMixGN;
  }
  public void setPerMixGN(Double perMixGN) {
    this.perMixGN = perMixGN;
  }
 /**
   * Get authorizationCodeCODIF
   * @return authorizationCodeCODIF
  **/
  public String getAuthorizationCodeCODIF() {
    return authorizationCodeCODIF;
  }
  public void setAuthorizationCodeCODIF(String authorizationCodeCODIF) {
    this.authorizationCodeCODIF = authorizationCodeCODIF;
  }
 /**
   * This decimal 12 integers and 0 to 4 decimals Quantidade de combustível faturada à temperatura ambiente. Informar quando a quantidade faturada informada no campo qCom (I10) tiver sido ajustada para uma temperatura diferente da ambiente. 
   * @return quantityOnRoomTemperature
  **/
  public Double getQuantityOnRoomTemperature() {
    return quantityOnRoomTemperature;
  }
  public void setQuantityOnRoomTemperature(Double quantityOnRoomTemperature) {
    this.quantityOnRoomTemperature = quantityOnRoomTemperature;
  }
 /**
   * state where fuel was used
   * @return stateCodeOfUndUser
  **/
  public StateEnum getStateCodeOfUndUser() {
    return stateCodeOfUndUser;
  }
  public void setStateCodeOfUndUser(StateEnum stateCodeOfUndUser) {
    this.stateCodeOfUndUser = stateCodeOfUndUser;
  }
 /**
   * Get cide
   * @return cide
  **/
  public FuelCide getCide() {
    return cide;
  }
  public void setCide(FuelCide cide) {
    this.cide = cide;
  }
 /**
   * Get pumpNumber
   * @return pumpNumber
  **/
  public FuelPumpNumber getPumpNumber() {
    return pumpNumber;
  }
  public void setPumpNumber(FuelPumpNumber pumpNumber) {
    this.pumpNumber = pumpNumber;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fuel {\n");
    
    sb.append("    prodANPCode: ").append(toIndentedString(prodANPCode)).append("\n");
    sb.append("    perMixGN: ").append(toIndentedString(perMixGN)).append("\n");
    sb.append("    authorizationCodeCODIF: ").append(toIndentedString(authorizationCodeCODIF)).append("\n");
    sb.append("    quantityOnRoomTemperature: ").append(toIndentedString(quantityOnRoomTemperature)).append("\n");
    sb.append("    stateCodeOfUndUser: ").append(toIndentedString(stateCodeOfUndUser)).append("\n");
    sb.append("    cide: ").append(toIndentedString(cide)).append("\n");
    sb.append("    pumpNumber: ").append(toIndentedString(pumpNumber)).append("\n");
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

