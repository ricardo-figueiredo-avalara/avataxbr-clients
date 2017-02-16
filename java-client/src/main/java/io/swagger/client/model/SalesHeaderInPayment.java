/*
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

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.PaymentTerms;
import io.swagger.client.model.SalesInstallmentIn;
import java.util.ArrayList;
import java.util.List;

/**
 * SalesHeaderInPayment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-16T18:26:15.214Z")
public class SalesHeaderInPayment {
  @SerializedName("terms")
  private PaymentTerms terms = null;

  @SerializedName("installments")
  private List<SalesInstallmentIn> installments = new ArrayList<SalesInstallmentIn>();

  public SalesHeaderInPayment terms(PaymentTerms terms) {
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

  public SalesHeaderInPayment installments(List<SalesInstallmentIn> installments) {
    this.installments = installments;
    return this;
  }

  public SalesHeaderInPayment addInstallmentsItem(SalesInstallmentIn installmentsItem) {
    this.installments.add(installmentsItem);
    return this;
  }

   /**
   * installments
   * @return installments
  **/
  @ApiModelProperty(example = "null", value = "installments")
  public List<SalesInstallmentIn> getInstallments() {
    return installments;
  }

  public void setInstallments(List<SalesInstallmentIn> installments) {
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
    SalesHeaderInPayment salesHeaderInPayment = (SalesHeaderInPayment) o;
    return Objects.equals(this.terms, salesHeaderInPayment.terms) &&
        Objects.equals(this.installments, salesHeaderInPayment.installments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(terms, installments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesHeaderInPayment {\n");
    
    sb.append("    terms: ").append(toIndentedString(terms)).append("\n");
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
