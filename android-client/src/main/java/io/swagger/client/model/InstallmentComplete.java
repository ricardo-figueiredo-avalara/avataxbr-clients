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

import io.swagger.client.model.WithholdingMode;
import java.util.Date;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class InstallmentComplete {
  
  @SerializedName("documentNumber")
  private String documentNumber = null;
  @SerializedName("date")
  private Date date = null;
  @SerializedName("grossValue")
  private Double grossValue = null;
  @SerializedName("netValue")
  private Double netValue = null;
  @SerializedName("withholdingMode")
  private WithholdingMode withholdingMode = null;
  @SerializedName("withholdingPIS")
  private Double withholdingPIS = null;
  @SerializedName("withholdingCOFINS")
  private Double withholdingCOFINS = null;
  @SerializedName("withholdingCSLL")
  private Double withholdingCSLL = null;

  /**
   * DOCNUMBER, ID OF THIS DOCUMENT FOR THIS transaction
   **/
  @ApiModelProperty(required = true, value = "DOCNUMBER, ID OF THIS DOCUMENT FOR THIS transaction")
  public String getDocumentNumber() {
    return documentNumber;
  }
  public void setDocumentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
  }

  /**
   * installment Due Date
   **/
  @ApiModelProperty(required = true, value = "installment Due Date")
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }

  /**
   * Intallment amount, fraction of  ∑(lineAmount - lineTaxedDiscount)
   **/
  @ApiModelProperty(required = true, value = "Intallment amount, fraction of  ∑(lineAmount - lineTaxedDiscount)")
  public Double getGrossValue() {
    return grossValue;
  }
  public void setGrossValue(Double grossValue) {
    this.grossValue = grossValue;
  }

  /**
   * net amount due for this installment, grossValue - ∑ (withhold amounts)
   **/
  @ApiModelProperty(value = "net amount due for this installment, grossValue - ∑ (withhold amounts)")
  public Double getNetValue() {
    return netValue;
  }
  public void setNetValue(Double netValue) {
    this.netValue = netValue;
  }

  /**
   * Inform if this payment is subject to Pis, Cofins or CSLL
   **/
  @ApiModelProperty(value = "Inform if this payment is subject to Pis, Cofins or CSLL")
  public WithholdingMode getWithholdingMode() {
    return withholdingMode;
  }
  public void setWithholdingMode(WithholdingMode withholdingMode) {
    this.withholdingMode = withholdingMode;
  }

  /**
   * calculated PIS-RF tax for this payment
   **/
  @ApiModelProperty(value = "calculated PIS-RF tax for this payment")
  public Double getWithholdingPIS() {
    return withholdingPIS;
  }
  public void setWithholdingPIS(Double withholdingPIS) {
    this.withholdingPIS = withholdingPIS;
  }

  /**
   * calculated COFINS-RF tax for this payment
   **/
  @ApiModelProperty(value = "calculated COFINS-RF tax for this payment")
  public Double getWithholdingCOFINS() {
    return withholdingCOFINS;
  }
  public void setWithholdingCOFINS(Double withholdingCOFINS) {
    this.withholdingCOFINS = withholdingCOFINS;
  }

  /**
   * calculated CSLL-RF tax for this payment
   **/
  @ApiModelProperty(value = "calculated CSLL-RF tax for this payment")
  public Double getWithholdingCSLL() {
    return withholdingCSLL;
  }
  public void setWithholdingCSLL(Double withholdingCSLL) {
    this.withholdingCSLL = withholdingCSLL;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstallmentComplete installmentComplete = (InstallmentComplete) o;
    return (this.documentNumber == null ? installmentComplete.documentNumber == null : this.documentNumber.equals(installmentComplete.documentNumber)) &&
        (this.date == null ? installmentComplete.date == null : this.date.equals(installmentComplete.date)) &&
        (this.grossValue == null ? installmentComplete.grossValue == null : this.grossValue.equals(installmentComplete.grossValue)) &&
        (this.netValue == null ? installmentComplete.netValue == null : this.netValue.equals(installmentComplete.netValue)) &&
        (this.withholdingMode == null ? installmentComplete.withholdingMode == null : this.withholdingMode.equals(installmentComplete.withholdingMode)) &&
        (this.withholdingPIS == null ? installmentComplete.withholdingPIS == null : this.withholdingPIS.equals(installmentComplete.withholdingPIS)) &&
        (this.withholdingCOFINS == null ? installmentComplete.withholdingCOFINS == null : this.withholdingCOFINS.equals(installmentComplete.withholdingCOFINS)) &&
        (this.withholdingCSLL == null ? installmentComplete.withholdingCSLL == null : this.withholdingCSLL.equals(installmentComplete.withholdingCSLL));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.documentNumber == null ? 0: this.documentNumber.hashCode());
    result = 31 * result + (this.date == null ? 0: this.date.hashCode());
    result = 31 * result + (this.grossValue == null ? 0: this.grossValue.hashCode());
    result = 31 * result + (this.netValue == null ? 0: this.netValue.hashCode());
    result = 31 * result + (this.withholdingMode == null ? 0: this.withholdingMode.hashCode());
    result = 31 * result + (this.withholdingPIS == null ? 0: this.withholdingPIS.hashCode());
    result = 31 * result + (this.withholdingCOFINS == null ? 0: this.withholdingCOFINS.hashCode());
    result = 31 * result + (this.withholdingCSLL == null ? 0: this.withholdingCSLL.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstallmentComplete {\n");
    
    sb.append("  documentNumber: ").append(documentNumber).append("\n");
    sb.append("  date: ").append(date).append("\n");
    sb.append("  grossValue: ").append(grossValue).append("\n");
    sb.append("  netValue: ").append(netValue).append("\n");
    sb.append("  withholdingMode: ").append(withholdingMode).append("\n");
    sb.append("  withholdingPIS: ").append(withholdingPIS).append("\n");
    sb.append("  withholdingCOFINS: ").append(withholdingCOFINS).append("\n");
    sb.append("  withholdingCSLL: ").append(withholdingCSLL).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
