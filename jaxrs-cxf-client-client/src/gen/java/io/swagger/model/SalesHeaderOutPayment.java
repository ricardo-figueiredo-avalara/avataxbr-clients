package io.swagger.model;

import io.swagger.model.InstallmentComplete;
import io.swagger.model.PaymentTerms;
import io.swagger.model.WithholdingMode;
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

public class SalesHeaderOutPayment  {
  
  @ApiModelProperty(example = "null", value = "")
  private PaymentTerms terms = null;
  @ApiModelProperty(example = "null", value = "To avoid having to verify multiple attributes from a Invoice at the time of funds collection which subject to Tax Withholding, this attribute will allow a referenced Invoice to be quickly checked for withholdings during the cash transaction. This is an SALES.Transaction attribute to be consisted in the Tax Engine that can be used during the receivable process. The values are enumeration where each letter identify if that tax has been withheld PCC,xxx, PCx, PxC ...")
  private WithholdingMode withholdingMode = null;
  @ApiModelProperty(example = "null", value = "installments")
  private List<InstallmentComplete> installments = new ArrayList<InstallmentComplete>();

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
   * To avoid having to verify multiple attributes from a Invoice at the time of funds collection which subject to Tax Withholding, this attribute will allow a referenced Invoice to be quickly checked for withholdings during the cash transaction. This is an SALES.Transaction attribute to be consisted in the Tax Engine that can be used during the receivable process. The values are enumeration where each letter identify if that tax has been withheld PCC,xxx, PCx, PxC ...
   * @return withholdingMode
  **/
  public WithholdingMode getWithholdingMode() {
    return withholdingMode;
  }
  public void setWithholdingMode(WithholdingMode withholdingMode) {
    this.withholdingMode = withholdingMode;
  }
 /**
   * installments
   * @return installments
  **/
  public List<InstallmentComplete> getInstallments() {
    return installments;
  }
  public void setInstallments(List<InstallmentComplete> installments) {
    this.installments = installments;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesHeaderOutPayment {\n");
    
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

