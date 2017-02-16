/**
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

import io.swagger.client.model.StateEnum;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
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

  /**
   * State code of fiscal Document creator
   **/
  @ApiModelProperty(required = true, value = "State code of fiscal Document creator")
  public StateEnum getStateCd() {
    return stateCd;
  }
  public void setStateCd(StateEnum stateCd) {
    this.stateCd = stateCd;
  }

  /**
   * year and month of fiscal document creation
   **/
  @ApiModelProperty(required = true, value = "year and month of fiscal document creation")
  public String getYymm() {
    return yymm;
  }
  public void setYymm(String yymm) {
    this.yymm = yymm;
  }

  /**
   * fiscal document creator federalTaxId
   **/
  @ApiModelProperty(required = true, value = "fiscal document creator federalTaxId")
  public String getFederalTaxId() {
    return federalTaxId;
  }
  public void setFederalTaxId(String federalTaxId) {
    this.federalTaxId = federalTaxId;
  }

  /**
   * fiscal document serie
   **/
  @ApiModelProperty(required = true, value = "fiscal document serie")
  public String getSerie() {
    return serie;
  }
  public void setSerie(String serie) {
    this.serie = serie;
  }

  /**
   * fiscal document number
   **/
  @ApiModelProperty(required = true, value = "fiscal document number")
  public String getNumber() {
    return number;
  }
  public void setNumber(String number) {
    this.number = number;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NRefRefNF nRefRefNF = (NRefRefNF) o;
    return (this.stateCd == null ? nRefRefNF.stateCd == null : this.stateCd.equals(nRefRefNF.stateCd)) &&
        (this.yymm == null ? nRefRefNF.yymm == null : this.yymm.equals(nRefRefNF.yymm)) &&
        (this.federalTaxId == null ? nRefRefNF.federalTaxId == null : this.federalTaxId.equals(nRefRefNF.federalTaxId)) &&
        (this.serie == null ? nRefRefNF.serie == null : this.serie.equals(nRefRefNF.serie)) &&
        (this.number == null ? nRefRefNF.number == null : this.number.equals(nRefRefNF.number));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.stateCd == null ? 0: this.stateCd.hashCode());
    result = 31 * result + (this.yymm == null ? 0: this.yymm.hashCode());
    result = 31 * result + (this.federalTaxId == null ? 0: this.federalTaxId.hashCode());
    result = 31 * result + (this.serie == null ? 0: this.serie.hashCode());
    result = 31 * result + (this.number == null ? 0: this.number.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NRefRefNF {\n");
    
    sb.append("  stateCd: ").append(stateCd).append("\n");
    sb.append("  yymm: ").append(yymm).append("\n");
    sb.append("  federalTaxId: ").append(federalTaxId).append("\n");
    sb.append("  serie: ").append(serie).append("\n");
    sb.append("  number: ").append(number).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}