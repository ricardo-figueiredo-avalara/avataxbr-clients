package io.swagger.model;

import io.swagger.model.PaymentBill;
import io.swagger.model.PaymentInstallment;
import io.swagger.model.PaymentPaymentMode;
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

public class Payment  {
  
  @ApiModelProperty(example = "null", value = "Installment terms - 0 # cash - 1 # on terms - 2 # other ")
  private Integer installmentsTerms = null;
  @ApiModelProperty(example = "null", value = "")
  private PaymentBill bill = null;
  @ApiModelProperty(example = "null", value = "")
  private List<PaymentInstallment> installment = new ArrayList<PaymentInstallment>();
  @ApiModelProperty(example = "null", value = "")
  private List<PaymentPaymentMode> paymentMode = new ArrayList<PaymentPaymentMode>();

 /**
   * Installment terms - 0 # cash - 1 # on terms - 2 # other 
   * @return installmentsTerms
  **/
  public Integer getInstallmentsTerms() {
    return installmentsTerms;
  }
  public void setInstallmentsTerms(Integer installmentsTerms) {
    this.installmentsTerms = installmentsTerms;
  }
 /**
   * Get bill
   * @return bill
  **/
  public PaymentBill getBill() {
    return bill;
  }
  public void setBill(PaymentBill bill) {
    this.bill = bill;
  }
 /**
   * Get installment
   * @return installment
  **/
  public List<PaymentInstallment> getInstallment() {
    return installment;
  }
  public void setInstallment(List<PaymentInstallment> installment) {
    this.installment = installment;
  }
 /**
   * Get paymentMode
   * @return paymentMode
  **/
  public List<PaymentPaymentMode> getPaymentMode() {
    return paymentMode;
  }
  public void setPaymentMode(List<PaymentPaymentMode> paymentMode) {
    this.paymentMode = paymentMode;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payment {\n");
    
    sb.append("    installmentsTerms: ").append(toIndentedString(installmentsTerms)).append("\n");
    sb.append("    bill: ").append(toIndentedString(bill)).append("\n");
    sb.append("    installment: ").append(toIndentedString(installment)).append("\n");
    sb.append("    paymentMode: ").append(toIndentedString(paymentMode)).append("\n");
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

