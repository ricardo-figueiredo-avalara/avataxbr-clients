package io.swagger.model;

import io.swagger.model.PaymentTerms;
import io.swagger.model.SalesInstallmentIn;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class SalesHeaderInPayment  {
  
  @ApiModelProperty(example = "null", value = "")
  private PaymentTerms terms = null;
  @ApiModelProperty(example = "null", value = "installments")
  private List<SalesInstallmentIn> installments = new ArrayList<SalesInstallmentIn>();

 /**
   * Get terms
   * @return terms
  **/
  public PaymentTerms getTerms() {
    return terms;
  }
  public void setTerms(PaymentTerms terms) {
    this.terms = terms;
  }
 /**
   * installments
   * @return installments
  **/
  public List<SalesInstallmentIn> getInstallments() {
    return installments;
  }
  public void setInstallments(List<SalesInstallmentIn> installments) {
    this.installments = installments;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

