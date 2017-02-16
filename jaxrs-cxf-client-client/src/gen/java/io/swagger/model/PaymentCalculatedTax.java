package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.PaymentTaxByType;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@ApiModel(description="Structure with value for each tax withhold value of this line")
public class PaymentCalculatedTax  {
  
  @ApiModelProperty(example = "null", value = "")
  private PaymentTaxByType taxByType = null;
  @ApiModelProperty(example = "null", value = "Sum of tax type not VAT (Value Added Tax)")
  private Double tax = null;

 /**
   * Get taxByType
   * @return taxByType
  **/
  public PaymentTaxByType getTaxByType() {
    return taxByType;
  }
  public void setTaxByType(PaymentTaxByType taxByType) {
    this.taxByType = taxByType;
  }
 /**
   * Sum of tax type not VAT (Value Added Tax)
   * @return tax
  **/
  public Double getTax() {
    return tax;
  }
  public void setTax(Double tax) {
    this.tax = tax;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentCalculatedTax {\n");
    
    sb.append("    taxByType: ").append(toIndentedString(taxByType)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
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

