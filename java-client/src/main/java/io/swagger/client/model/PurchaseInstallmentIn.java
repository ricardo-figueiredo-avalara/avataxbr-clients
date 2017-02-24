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
import org.joda.time.LocalDate;

/**
 * PurchaseInstallmentIn
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-24T19:47:57.099Z")
public class PurchaseInstallmentIn {
  @SerializedName("documentNumber")
  private String documentNumber = null;

  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("grossValue")
  private Double grossValue = null;

  public PurchaseInstallmentIn documentNumber(String documentNumber) {
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

  public PurchaseInstallmentIn date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * installment, Due Date
   * @return date
  **/
  @ApiModelProperty(example = "null", required = true, value = "installment, Due Date")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public PurchaseInstallmentIn grossValue(Double grossValue) {
    this.grossValue = grossValue;
    return this;
  }

   /**
   * Intallment value, fraction of  ∑(lineAmount - lineTaxedDiscount)
   * @return grossValue
  **/
  @ApiModelProperty(example = "null", required = true, value = "Intallment value, fraction of  ∑(lineAmount - lineTaxedDiscount)")
  public Double getGrossValue() {
    return grossValue;
  }

  public void setGrossValue(Double grossValue) {
    this.grossValue = grossValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PurchaseInstallmentIn purchaseInstallmentIn = (PurchaseInstallmentIn) o;
    return Objects.equals(this.documentNumber, purchaseInstallmentIn.documentNumber) &&
        Objects.equals(this.date, purchaseInstallmentIn.date) &&
        Objects.equals(this.grossValue, purchaseInstallmentIn.grossValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentNumber, date, grossValue);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

