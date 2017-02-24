/**
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

import java.util.Date;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class PurchaseInstallmentIn {
  
  @SerializedName("documentNumber")
  private String documentNumber = null;
  @SerializedName("date")
  private Date date = null;
  @SerializedName("grossValue")
  private Double grossValue = null;

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
   * installment, Due Date
   **/
  @ApiModelProperty(required = true, value = "installment, Due Date")
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }

  /**
   * Intallment value, fraction of  ∑(lineAmount - lineTaxedDiscount)
   **/
  @ApiModelProperty(required = true, value = "Intallment value, fraction of  ∑(lineAmount - lineTaxedDiscount)")
  public Double getGrossValue() {
    return grossValue;
  }
  public void setGrossValue(Double grossValue) {
    this.grossValue = grossValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PurchaseInstallmentIn purchaseInstallmentIn = (PurchaseInstallmentIn) o;
    return (this.documentNumber == null ? purchaseInstallmentIn.documentNumber == null : this.documentNumber.equals(purchaseInstallmentIn.documentNumber)) &&
        (this.date == null ? purchaseInstallmentIn.date == null : this.date.equals(purchaseInstallmentIn.date)) &&
        (this.grossValue == null ? purchaseInstallmentIn.grossValue == null : this.grossValue.equals(purchaseInstallmentIn.grossValue));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.documentNumber == null ? 0: this.documentNumber.hashCode());
    result = 31 * result + (this.date == null ? 0: this.date.hashCode());
    result = 31 * result + (this.grossValue == null ? 0: this.grossValue.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseInstallmentIn {\n");
    
    sb.append("  documentNumber: ").append(documentNumber).append("\n");
    sb.append("  date: ").append(date).append("\n");
    sb.append("  grossValue: ").append(grossValue).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
