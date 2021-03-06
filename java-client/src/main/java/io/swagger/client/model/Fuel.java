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
 * Fuel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-06T17:54:07.550Z")
public class Fuel {
  @SerializedName("prodANPCode")
  private String prodANPCode = null;

  @SerializedName("perMixGN")
  private Double perMixGN = null;

  @SerializedName("authorizationCodeCODIF")
  private String authorizationCodeCODIF = null;

  @SerializedName("quantityOnRoomTemperature")
  private Double quantityOnRoomTemperature = null;

  @SerializedName("stateCodeOfUndUser")
  private StateEnum stateCodeOfUndUser = null;

  @SerializedName("cide")
  private FuelCide cide = null;

  @SerializedName("pumpNumber")
  private FuelPumpNumber pumpNumber = null;

  public Fuel prodANPCode(String prodANPCode) {
    this.prodANPCode = prodANPCode;
    return this;
  }

   /**
   * Get prodANPCode
   * @return prodANPCode
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getProdANPCode() {
    return prodANPCode;
  }

  public void setProdANPCode(String prodANPCode) {
    this.prodANPCode = prodANPCode;
  }

  public Fuel perMixGN(Double perMixGN) {
    this.perMixGN = perMixGN;
    return this;
  }

   /**
   * percentage of natural gas (GLP)
   * @return perMixGN
  **/
  @ApiModelProperty(example = "null", value = "percentage of natural gas (GLP)")
  public Double getPerMixGN() {
    return perMixGN;
  }

  public void setPerMixGN(Double perMixGN) {
    this.perMixGN = perMixGN;
  }

  public Fuel authorizationCodeCODIF(String authorizationCodeCODIF) {
    this.authorizationCodeCODIF = authorizationCodeCODIF;
    return this;
  }

   /**
   * Get authorizationCodeCODIF
   * @return authorizationCodeCODIF
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAuthorizationCodeCODIF() {
    return authorizationCodeCODIF;
  }

  public void setAuthorizationCodeCODIF(String authorizationCodeCODIF) {
    this.authorizationCodeCODIF = authorizationCodeCODIF;
  }

  public Fuel quantityOnRoomTemperature(Double quantityOnRoomTemperature) {
    this.quantityOnRoomTemperature = quantityOnRoomTemperature;
    return this;
  }

   /**
   * This decimal 12 integers and 0 to 4 decimals Quantidade de combustível faturada à temperatura ambiente. Informar quando a quantidade faturada informada no campo qCom (I10) tiver sido ajustada para uma temperatura diferente da ambiente. 
   * @return quantityOnRoomTemperature
  **/
  @ApiModelProperty(example = "null", value = "This decimal 12 integers and 0 to 4 decimals Quantidade de combustível faturada à temperatura ambiente. Informar quando a quantidade faturada informada no campo qCom (I10) tiver sido ajustada para uma temperatura diferente da ambiente. ")
  public Double getQuantityOnRoomTemperature() {
    return quantityOnRoomTemperature;
  }

  public void setQuantityOnRoomTemperature(Double quantityOnRoomTemperature) {
    this.quantityOnRoomTemperature = quantityOnRoomTemperature;
  }

  public Fuel stateCodeOfUndUser(StateEnum stateCodeOfUndUser) {
    this.stateCodeOfUndUser = stateCodeOfUndUser;
    return this;
  }

   /**
   * state where fuel was used
   * @return stateCodeOfUndUser
  **/
  @ApiModelProperty(example = "null", required = true, value = "state where fuel was used")
  public StateEnum getStateCodeOfUndUser() {
    return stateCodeOfUndUser;
  }

  public void setStateCodeOfUndUser(StateEnum stateCodeOfUndUser) {
    this.stateCodeOfUndUser = stateCodeOfUndUser;
  }

  public Fuel cide(FuelCide cide) {
    this.cide = cide;
    return this;
  }

   /**
   * Get cide
   * @return cide
  **/
  @ApiModelProperty(example = "null", value = "")
  public FuelCide getCide() {
    return cide;
  }

  public void setCide(FuelCide cide) {
    this.cide = cide;
  }

  public Fuel pumpNumber(FuelPumpNumber pumpNumber) {
    this.pumpNumber = pumpNumber;
    return this;
  }

   /**
   * Get pumpNumber
   * @return pumpNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public FuelPumpNumber getPumpNumber() {
    return pumpNumber;
  }

  public void setPumpNumber(FuelPumpNumber pumpNumber) {
    this.pumpNumber = pumpNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Fuel fuel = (Fuel) o;
    return Objects.equals(this.prodANPCode, fuel.prodANPCode) &&
        Objects.equals(this.perMixGN, fuel.perMixGN) &&
        Objects.equals(this.authorizationCodeCODIF, fuel.authorizationCodeCODIF) &&
        Objects.equals(this.quantityOnRoomTemperature, fuel.quantityOnRoomTemperature) &&
        Objects.equals(this.stateCodeOfUndUser, fuel.stateCodeOfUndUser) &&
        Objects.equals(this.cide, fuel.cide) &&
        Objects.equals(this.pumpNumber, fuel.pumpNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prodANPCode, perMixGN, authorizationCodeCODIF, quantityOnRoomTemperature, stateCodeOfUndUser, cide, pumpNumber);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

