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

public class NRefRefNF  {
  
  @ApiModelProperty(example = "null", required = true, value = "State code of fiscal Document creator")
  private StateEnum stateCd = null;
  @ApiModelProperty(example = "null", required = true, value = "year and month of fiscal document creation")
  private String yymm = null;
  @ApiModelProperty(example = "null", required = true, value = "fiscal document creator federalTaxId")
  private String federalTaxId = null;
  @ApiModelProperty(example = "null", required = true, value = "fiscal document serie")
  private String serie = null;
  @ApiModelProperty(example = "null", required = true, value = "fiscal document number")
  private String number = null;

 /**
   * State code of fiscal Document creator
   * @return stateCd
  **/
  public StateEnum getStateCd() {
    return stateCd;
  }
  public void setStateCd(StateEnum stateCd) {
    this.stateCd = stateCd;
  }
 /**
   * year and month of fiscal document creation
   * @return yymm
  **/
  public String getYymm() {
    return yymm;
  }
  public void setYymm(String yymm) {
    this.yymm = yymm;
  }
 /**
   * fiscal document creator federalTaxId
   * @return federalTaxId
  **/
  public String getFederalTaxId() {
    return federalTaxId;
  }
  public void setFederalTaxId(String federalTaxId) {
    this.federalTaxId = federalTaxId;
  }
 /**
   * fiscal document serie
   * @return serie
  **/
  public String getSerie() {
    return serie;
  }
  public void setSerie(String serie) {
    this.serie = serie;
  }
 /**
   * fiscal document number
   * @return number
  **/
  public String getNumber() {
    return number;
  }
  public void setNumber(String number) {
    this.number = number;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

