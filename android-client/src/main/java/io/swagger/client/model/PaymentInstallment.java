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
public class PaymentInstallment {
  
  @SerializedName("documentNumber")
  private String documentNumber = null;
  @SerializedName("date")
  private Date date = null;
  @SerializedName("grossValue")
  private Double grossValue = null;

  /**
   * Instalment number identifier
   **/
  @ApiModelProperty(value = "Instalment number identifier")
  public String getDocumentNumber() {
    return documentNumber;
  }
  public void setDocumentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
  }

  /**
   * Installment expiration date
   **/
  @ApiModelProperty(value = "Installment expiration date")
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }

  /**
   * Installment value
   **/
  @ApiModelProperty(required = true, value = "Installment value")
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
    PaymentInstallment paymentInstallment = (PaymentInstallment) o;
    return (this.documentNumber == null ? paymentInstallment.documentNumber == null : this.documentNumber.equals(paymentInstallment.documentNumber)) &&
        (this.date == null ? paymentInstallment.date == null : this.date.equals(paymentInstallment.date)) &&
        (this.grossValue == null ? paymentInstallment.grossValue == null : this.grossValue.equals(paymentInstallment.grossValue));
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
    sb.append("class PaymentInstallment {\n");
    
    sb.append("  documentNumber: ").append(documentNumber).append("\n");
    sb.append("  date: ").append(date).append("\n");
    sb.append("  grossValue: ").append(grossValue).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
