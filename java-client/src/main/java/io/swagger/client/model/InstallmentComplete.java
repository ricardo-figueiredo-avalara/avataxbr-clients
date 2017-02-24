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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.WithholdingMode;
import org.joda.time.DateTime;

/**
 * InstallmentComplete
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-24T19:47:57.099Z")
public class InstallmentComplete {
  @SerializedName("documentNumber")
  private String documentNumber = null;

  @SerializedName("date")
  private DateTime date = null;

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

  public InstallmentComplete documentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
    return this;
  }

   /**
   * DOCNUMBER, ID OF THIS DOCUMENT FOR THIS transaction
   * @return documentNumber
  **/
  @ApiModelProperty(example = "null", required = true, value = "DOCNUMBER, ID OF THIS DOCUMENT FOR THIS transaction")
  public String getDocumentNumber() {
    return documentNumber;
  }

  public void setDocumentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
  }

  public InstallmentComplete date(DateTime date) {
    this.date = date;
    return this;
  }

   /**
   * installment Due Date
   * @return date
  **/
  @ApiModelProperty(example = "null", required = true, value = "installment Due Date")
  public DateTime getDate() {
    return date;
  }

  public void setDate(DateTime date) {
    this.date = date;
  }

  public InstallmentComplete grossValue(Double grossValue) {
    this.grossValue = grossValue;
    return this;
  }

   /**
   * Intallment amount, fraction of  ∑(lineAmount - lineTaxedDiscount)
   * @return grossValue
  **/
  @ApiModelProperty(example = "null", required = true, value = "Intallment amount, fraction of  ∑(lineAmount - lineTaxedDiscount)")
  public Double getGrossValue() {
    return grossValue;
  }

  public void setGrossValue(Double grossValue) {
    this.grossValue = grossValue;
  }

  public InstallmentComplete netValue(Double netValue) {
    this.netValue = netValue;
    return this;
  }

   /**
   * net amount due for this installment, grossValue - ∑ (withhold amounts)
   * @return netValue
  **/
  @ApiModelProperty(example = "null", value = "net amount due for this installment, grossValue - ∑ (withhold amounts)")
  public Double getNetValue() {
    return netValue;
  }

  public void setNetValue(Double netValue) {
    this.netValue = netValue;
  }

  public InstallmentComplete withholdingMode(WithholdingMode withholdingMode) {
    this.withholdingMode = withholdingMode;
    return this;
  }

   /**
   * Inform if this payment is subject to Pis, Cofins or CSLL
   * @return withholdingMode
  **/
  @ApiModelProperty(example = "null", value = "Inform if this payment is subject to Pis, Cofins or CSLL")
  public WithholdingMode getWithholdingMode() {
    return withholdingMode;
  }

  public void setWithholdingMode(WithholdingMode withholdingMode) {
    this.withholdingMode = withholdingMode;
  }

  public InstallmentComplete withholdingPIS(Double withholdingPIS) {
    this.withholdingPIS = withholdingPIS;
    return this;
  }

   /**
   * calculated PIS-RF tax for this payment
   * @return withholdingPIS
  **/
  @ApiModelProperty(example = "null", value = "calculated PIS-RF tax for this payment")
  public Double getWithholdingPIS() {
    return withholdingPIS;
  }

  public void setWithholdingPIS(Double withholdingPIS) {
    this.withholdingPIS = withholdingPIS;
  }

  public InstallmentComplete withholdingCOFINS(Double withholdingCOFINS) {
    this.withholdingCOFINS = withholdingCOFINS;
    return this;
  }

   /**
   * calculated COFINS-RF tax for this payment
   * @return withholdingCOFINS
  **/
  @ApiModelProperty(example = "null", value = "calculated COFINS-RF tax for this payment")
  public Double getWithholdingCOFINS() {
    return withholdingCOFINS;
  }

  public void setWithholdingCOFINS(Double withholdingCOFINS) {
    this.withholdingCOFINS = withholdingCOFINS;
  }

  public InstallmentComplete withholdingCSLL(Double withholdingCSLL) {
    this.withholdingCSLL = withholdingCSLL;
    return this;
  }

   /**
   * calculated CSLL-RF tax for this payment
   * @return withholdingCSLL
  **/
  @ApiModelProperty(example = "null", value = "calculated CSLL-RF tax for this payment")
  public Double getWithholdingCSLL() {
    return withholdingCSLL;
  }

  public void setWithholdingCSLL(Double withholdingCSLL) {
    this.withholdingCSLL = withholdingCSLL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstallmentComplete installmentComplete = (InstallmentComplete) o;
    return Objects.equals(this.documentNumber, installmentComplete.documentNumber) &&
        Objects.equals(this.date, installmentComplete.date) &&
        Objects.equals(this.grossValue, installmentComplete.grossValue) &&
        Objects.equals(this.netValue, installmentComplete.netValue) &&
        Objects.equals(this.withholdingMode, installmentComplete.withholdingMode) &&
        Objects.equals(this.withholdingPIS, installmentComplete.withholdingPIS) &&
        Objects.equals(this.withholdingCOFINS, installmentComplete.withholdingCOFINS) &&
        Objects.equals(this.withholdingCSLL, installmentComplete.withholdingCSLL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentNumber, date, grossValue, netValue, withholdingMode, withholdingPIS, withholdingCOFINS, withholdingCSLL);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

