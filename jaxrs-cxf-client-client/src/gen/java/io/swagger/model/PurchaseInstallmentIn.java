package io.swagger.model;

import org.joda.time.LocalDate;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class PurchaseInstallmentIn  {
  
  @ApiModelProperty(example = "null", required = true, value = "DOCNUMBER, ID OF THIS DOCUMENT FOR THIS transaction")
  private String documentNumber = null;
  @ApiModelProperty(example = "null", required = true, value = "installment, Due Date")
  private LocalDate date = null;
  @ApiModelProperty(example = "null", required = true, value = "Intallment value, fraction of  ∑(lineAmount - lineTaxedDiscount)")
  private Double grossValue = null;

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
   * installment, Due Date
   * @return date
  **/
  public LocalDate getDate() {
    return date;
  }
  public void setDate(LocalDate date) {
    this.date = date;
  }
 /**
   * Intallment value, fraction of  ∑(lineAmount - lineTaxedDiscount)
   * @return grossValue
  **/
  public Double getGrossValue() {
    return grossValue;
  }
  public void setGrossValue(Double grossValue) {
    this.grossValue = grossValue;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseInstallmentIn {\n");
    
    sb.append("    documentNumber: ").append(toIndentedString(documentNumber)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    grossValue: ").append(toIndentedString(grossValue)).append("\n");
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

