package io.swagger.model;

import io.swagger.model.WithholdingMode;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class InstallmentComplete  {
  
  @ApiModelProperty(example = "null", required = true, value = "DOCNUMBER, ID OF THIS DOCUMENT FOR THIS transaction")
  private String documentNumber = null;
  @ApiModelProperty(example = "null", required = true, value = "installment Due Date")
  private javax.xml.datatype.XMLGregorianCalendar date = null;
  @ApiModelProperty(example = "null", required = true, value = "Intallment amount, fraction of  ∑(lineAmount - lineTaxedDiscount)")
  private Double grossValue = null;
  @ApiModelProperty(example = "null", value = "net amount due for this installment, grossValue - ∑ (withhold amounts)")
  private Double netValue = null;
  @ApiModelProperty(example = "null", value = "Inform if this payment is subject to Pis, Cofins or CSLL")
  private WithholdingMode withholdingMode = null;
  @ApiModelProperty(example = "null", value = "calculated PIS-RF tax for this payment")
  private Double withholdingPIS = null;
  @ApiModelProperty(example = "null", value = "calculated COFINS-RF tax for this payment")
  private Double withholdingCOFINS = null;
  @ApiModelProperty(example = "null", value = "calculated CSLL-RF tax for this payment")
  private Double withholdingCSLL = null;

 /**
   * DOCNUMBER, ID OF THIS DOCUMENT FOR THIS transaction
   * @return documentNumber
  **/
  public String getDocumentNumber() {
    return documentNumber;
  }
  public void setDocumentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
  }
 /**
   * installment Due Date
   * @return date
  **/
  public javax.xml.datatype.XMLGregorianCalendar getDate() {
    return date;
  }
  public void setDate(javax.xml.datatype.XMLGregorianCalendar date) {
    this.date = date;
  }
 /**
   * Intallment amount, fraction of  ∑(lineAmount - lineTaxedDiscount)
   * @return grossValue
  **/
  public Double getGrossValue() {
    return grossValue;
  }
  public void setGrossValue(Double grossValue) {
    this.grossValue = grossValue;
  }
 /**
   * net amount due for this installment, grossValue - ∑ (withhold amounts)
   * @return netValue
  **/
  public Double getNetValue() {
    return netValue;
  }
  public void setNetValue(Double netValue) {
    this.netValue = netValue;
  }
 /**
   * Inform if this payment is subject to Pis, Cofins or CSLL
   * @return withholdingMode
  **/
  public WithholdingMode getWithholdingMode() {
    return withholdingMode;
  }
  public void setWithholdingMode(WithholdingMode withholdingMode) {
    this.withholdingMode = withholdingMode;
  }
 /**
   * calculated PIS-RF tax for this payment
   * @return withholdingPIS
  **/
  public Double getWithholdingPIS() {
    return withholdingPIS;
  }
  public void setWithholdingPIS(Double withholdingPIS) {
    this.withholdingPIS = withholdingPIS;
  }
 /**
   * calculated COFINS-RF tax for this payment
   * @return withholdingCOFINS
  **/
  public Double getWithholdingCOFINS() {
    return withholdingCOFINS;
  }
  public void setWithholdingCOFINS(Double withholdingCOFINS) {
    this.withholdingCOFINS = withholdingCOFINS;
  }
 /**
   * calculated CSLL-RF tax for this payment
   * @return withholdingCSLL
  **/
  public Double getWithholdingCSLL() {
    return withholdingCSLL;
  }
  public void setWithholdingCSLL(Double withholdingCSLL) {
    this.withholdingCSLL = withholdingCSLL;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstallmentComplete {\n");
    
    sb.append("    documentNumber: ").append(toIndentedString(documentNumber)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    grossValue: ").append(toIndentedString(grossValue)).append("\n");
    sb.append("    netValue: ").append(toIndentedString(netValue)).append("\n");
    sb.append("    withholdingMode: ").append(toIndentedString(withholdingMode)).append("\n");
    sb.append("    withholdingPIS: ").append(toIndentedString(withholdingPIS)).append("\n");
    sb.append("    withholdingCOFINS: ").append(toIndentedString(withholdingCOFINS)).append("\n");
    sb.append("    withholdingCSLL: ").append(toIndentedString(withholdingCSLL)).append("\n");
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

