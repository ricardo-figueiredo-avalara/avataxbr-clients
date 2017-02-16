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
import io.swagger.client.model.StateEnum;

/**
 * NRefRefNF
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-16T18:26:15.214Z")
public class NRefRefNF {
  @SerializedName("stateCd")
  private StateEnum stateCd = null;

  @SerializedName("yymm")
  private String yymm = null;

  @SerializedName("federalTaxId")
  private String federalTaxId = null;

  @SerializedName("serie")
  private String serie = null;

  @SerializedName("number")
  private String number = null;

  public NRefRefNF stateCd(StateEnum stateCd) {
    this.stateCd = stateCd;
    return this;
  }

   /**
   * State code of fiscal Document creator
   * @return stateCd
  **/
  @ApiModelProperty(example = "null", required = true, value = "State code of fiscal Document creator")
  public StateEnum getStateCd() {
    return stateCd;
  }

  public void setStateCd(StateEnum stateCd) {
    this.stateCd = stateCd;
  }

  public NRefRefNF yymm(String yymm) {
    this.yymm = yymm;
    return this;
  }

   /**
   * year and month of fiscal document creation
   * @return yymm
  **/
  @ApiModelProperty(example = "null", required = true, value = "year and month of fiscal document creation")
  public String getYymm() {
    return yymm;
  }

  public void setYymm(String yymm) {
    this.yymm = yymm;
  }

  public NRefRefNF federalTaxId(String federalTaxId) {
    this.federalTaxId = federalTaxId;
    return this;
  }

   /**
   * fiscal document creator federalTaxId
   * @return federalTaxId
  **/
  @ApiModelProperty(example = "null", required = true, value = "fiscal document creator federalTaxId")
  public String getFederalTaxId() {
    return federalTaxId;
  }

  public void setFederalTaxId(String federalTaxId) {
    this.federalTaxId = federalTaxId;
  }

  public NRefRefNF serie(String serie) {
    this.serie = serie;
    return this;
  }

   /**
   * fiscal document serie
   * @return serie
  **/
  @ApiModelProperty(example = "null", required = true, value = "fiscal document serie")
  public String getSerie() {
    return serie;
  }

  public void setSerie(String serie) {
    this.serie = serie;
  }

  public NRefRefNF number(String number) {
    this.number = number;
    return this;
  }

   /**
   * fiscal document number
   * @return number
  **/
  @ApiModelProperty(example = "null", required = true, value = "fiscal document number")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NRefRefNF nrefRefNF = (NRefRefNF) o;
    return Objects.equals(this.stateCd, nrefRefNF.stateCd) &&
        Objects.equals(this.yymm, nrefRefNF.yymm) &&
        Objects.equals(this.federalTaxId, nrefRefNF.federalTaxId) &&
        Objects.equals(this.serie, nrefRefNF.serie) &&
        Objects.equals(this.number, nrefRefNF.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stateCd, yymm, federalTaxId, serie, number);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NRefRefNF {\n");
    
    sb.append("    stateCd: ").append(toIndentedString(stateCd)).append("\n");
    sb.append("    yymm: ").append(toIndentedString(yymm)).append("\n");
    sb.append("    federalTaxId: ").append(toIndentedString(federalTaxId)).append("\n");
    sb.append("    serie: ").append(toIndentedString(serie)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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

