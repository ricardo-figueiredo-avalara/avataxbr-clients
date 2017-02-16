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

import io.swagger.client.model.InstallmentComplete;
import io.swagger.client.model.PaymentTerms;
import io.swagger.client.model.WithholdingMode;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class PurchaseHeaderOutPayment {
  
  @SerializedName("terms")
  private PaymentTerms terms = null;
  @SerializedName("withholdingMode")
  private WithholdingMode withholdingMode = null;
  @SerializedName("installments")
  private List<InstallmentComplete> installments = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public PaymentTerms getTerms() {
    return terms;
  }
  public void setTerms(PaymentTerms terms) {
    this.terms = terms;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public WithholdingMode getWithholdingMode() {
    return withholdingMode;
  }
  public void setWithholdingMode(WithholdingMode withholdingMode) {
    this.withholdingMode = withholdingMode;
  }

  /**
   * installments
   **/
  @ApiModelProperty(value = "installments")
  public List<InstallmentComplete> getInstallments() {
    return installments;
  }
  public void setInstallments(List<InstallmentComplete> installments) {
    this.installments = installments;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PurchaseHeaderOutPayment purchaseHeaderOutPayment = (PurchaseHeaderOutPayment) o;
    return (this.terms == null ? purchaseHeaderOutPayment.terms == null : this.terms.equals(purchaseHeaderOutPayment.terms)) &&
        (this.withholdingMode == null ? purchaseHeaderOutPayment.withholdingMode == null : this.withholdingMode.equals(purchaseHeaderOutPayment.withholdingMode)) &&
        (this.installments == null ? purchaseHeaderOutPayment.installments == null : this.installments.equals(purchaseHeaderOutPayment.installments));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.terms == null ? 0: this.terms.hashCode());
    result = 31 * result + (this.withholdingMode == null ? 0: this.withholdingMode.hashCode());
    result = 31 * result + (this.installments == null ? 0: this.installments.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseHeaderOutPayment {\n");
    
    sb.append("  terms: ").append(terms).append("\n");
    sb.append("  withholdingMode: ").append(withholdingMode).append("\n");
    sb.append("  installments: ").append(installments).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
