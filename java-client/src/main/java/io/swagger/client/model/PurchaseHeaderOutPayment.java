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
import io.swagger.client.model.InstallmentComplete;
import io.swagger.client.model.PaymentTerms;
import io.swagger.client.model.WithholdingMode;
import java.util.ArrayList;
import java.util.List;

/**
 * PurchaseHeaderOutPayment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-06T17:54:07.550Z")
public class PurchaseHeaderOutPayment {
  @SerializedName("terms")
  private PaymentTerms terms = null;

  @SerializedName("withholdingMode")
  private WithholdingMode withholdingMode = null;

  @SerializedName("installments")
  private List<InstallmentComplete> installments = new ArrayList<InstallmentComplete>();

  public PurchaseHeaderOutPayment terms(PaymentTerms terms) {
    this.terms = terms;
    return this;
  }

   /**
   * Get terms
   * @return terms
  **/
  @ApiModelProperty(example = "null", value = "")
  public PaymentTerms getTerms() {
    return terms;
  }

  public void setTerms(PaymentTerms terms) {
    this.terms = terms;
  }

  public PurchaseHeaderOutPayment withholdingMode(WithholdingMode withholdingMode) {
    this.withholdingMode = withholdingMode;
    return this;
  }

   /**
   * Get withholdingMode
   * @return withholdingMode
  **/
  @ApiModelProperty(example = "null", value = "")
  public WithholdingMode getWithholdingMode() {
    return withholdingMode;
  }

  public void setWithholdingMode(WithholdingMode withholdingMode) {
    this.withholdingMode = withholdingMode;
  }

  public PurchaseHeaderOutPayment installments(List<InstallmentComplete> installments) {
    this.installments = installments;
    return this;
  }

  public PurchaseHeaderOutPayment addInstallmentsItem(InstallmentComplete installmentsItem) {
    this.installments.add(installmentsItem);
    return this;
  }

   /**
   * installments
   * @return installments
  **/
  @ApiModelProperty(example = "null", value = "installments")
  public List<InstallmentComplete> getInstallments() {
    return installments;
  }

  public void setInstallments(List<InstallmentComplete> installments) {
    this.installments = installments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PurchaseHeaderOutPayment purchaseHeaderOutPayment = (PurchaseHeaderOutPayment) o;
    return Objects.equals(this.terms, purchaseHeaderOutPayment.terms) &&
        Objects.equals(this.withholdingMode, purchaseHeaderOutPayment.withholdingMode) &&
        Objects.equals(this.installments, purchaseHeaderOutPayment.installments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(terms, withholdingMode, installments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseHeaderOutPayment {\n");
    
    sb.append("    terms: ").append(toIndentedString(terms)).append("\n");
    sb.append("    withholdingMode: ").append(toIndentedString(withholdingMode)).append("\n");
    sb.append("    installments: ").append(toIndentedString(installments)).append("\n");
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
