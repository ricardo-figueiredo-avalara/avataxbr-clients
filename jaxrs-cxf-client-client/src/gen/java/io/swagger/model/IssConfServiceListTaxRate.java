package io.swagger.model;

import io.swagger.model.IssConfServiceListTaxRateIbpt;
import io.swagger.model.ServiceItemTaxRate;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class IssConfServiceListTaxRate  {
  
  @ApiModelProperty(example = "null", value = "")
  private ServiceItemTaxRate ISS = null;
  @ApiModelProperty(example = "null", value = "")
  private ServiceItemTaxRate ISS_RF = null;
  @ApiModelProperty(example = "null", value = "")
  private ServiceItemTaxRate ISS_E = null;
  @ApiModelProperty(example = "null", value = "")
  private ServiceItemTaxRate ISS_I = null;
  @ApiModelProperty(example = "null", value = "")
  private IssConfServiceListTaxRateIbpt ibpt = null;

 /**
   * Get ISS
   * @return ISS
  **/
  public ServiceItemTaxRate getISS() {
    return ISS;
  }
  public void setISS(ServiceItemTaxRate ISS) {
    this.ISS = ISS;
  }
 /**
   * Get ISS_RF
   * @return ISS_RF
  **/
  public ServiceItemTaxRate getISSRF() {
    return ISS_RF;
  }
  public void setISSRF(ServiceItemTaxRate ISS_RF) {
    this.ISS_RF = ISS_RF;
  }
 /**
   * Get ISS_E
   * @return ISS_E
  **/
  public ServiceItemTaxRate getISSE() {
    return ISS_E;
  }
  public void setISSE(ServiceItemTaxRate ISS_E) {
    this.ISS_E = ISS_E;
  }
 /**
   * Get ISS_I
   * @return ISS_I
  **/
  public ServiceItemTaxRate getISSI() {
    return ISS_I;
  }
  public void setISSI(ServiceItemTaxRate ISS_I) {
    this.ISS_I = ISS_I;
  }
 /**
   * Get ibpt
   * @return ibpt
  **/
  public IssConfServiceListTaxRateIbpt getIbpt() {
    return ibpt;
  }
  public void setIbpt(IssConfServiceListTaxRateIbpt ibpt) {
    this.ibpt = ibpt;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssConfServiceListTaxRate {\n");
    
    sb.append("    ISS: ").append(toIndentedString(ISS)).append("\n");
    sb.append("    ISS_RF: ").append(toIndentedString(ISS_RF)).append("\n");
    sb.append("    ISS_E: ").append(toIndentedString(ISS_E)).append("\n");
    sb.append("    ISS_I: ").append(toIndentedString(ISS_I)).append("\n");
    sb.append("    ibpt: ").append(toIndentedString(ibpt)).append("\n");
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

