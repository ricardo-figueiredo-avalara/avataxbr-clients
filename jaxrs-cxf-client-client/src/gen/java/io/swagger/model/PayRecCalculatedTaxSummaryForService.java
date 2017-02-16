package io.swagger.model;

import io.swagger.model.PayRecCalculatedTaxSummaryForServiceTaxByType;
import io.swagger.model.PccWithholdingMode;
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

public class PayRecCalculatedTaxSummaryForService  {
  
  @ApiModelProperty(example = "null", value = "Count of lines")
  private Integer numberOfLines = null;
  @ApiModelProperty(example = "null", value = "Sum of grossvalues")
  private Double subtotal = null;
  @ApiModelProperty(example = "null", value = "Sum of all withholding values")
  private Double totalTax = null;
  @ApiModelProperty(example = "null", value = "Sum all NetValues")
  private Double grandTotal = null;
  @ApiModelProperty(example = "null", value = "")
  private List<PccWithholdingMode> pccWithholdingModes = new ArrayList<PccWithholdingMode>();
  @ApiModelProperty(example = "null", value = "")
  private PayRecCalculatedTaxSummaryForServiceTaxByType taxByType = null;

 /**
   * Count of lines
   * @return numberOfLines
  **/
  public Integer getNumberOfLines() {
    return numberOfLines;
  }
  public void setNumberOfLines(Integer numberOfLines) {
    this.numberOfLines = numberOfLines;
  }
 /**
   * Sum of grossvalues
   * @return subtotal
  **/
  public Double getSubtotal() {
    return subtotal;
  }
  public void setSubtotal(Double subtotal) {
    this.subtotal = subtotal;
  }
 /**
   * Sum of all withholding values
   * @return totalTax
  **/
  public Double getTotalTax() {
    return totalTax;
  }
  public void setTotalTax(Double totalTax) {
    this.totalTax = totalTax;
  }
 /**
   * Sum all NetValues
   * @return grandTotal
  **/
  public Double getGrandTotal() {
    return grandTotal;
  }
  public void setGrandTotal(Double grandTotal) {
    this.grandTotal = grandTotal;
  }
 /**
   * Get pccWithholdingModes
   * @return pccWithholdingModes
  **/
  public List<PccWithholdingMode> getPccWithholdingModes() {
    return pccWithholdingModes;
  }
  public void setPccWithholdingModes(List<PccWithholdingMode> pccWithholdingModes) {
    this.pccWithholdingModes = pccWithholdingModes;
  }
 /**
   * Get taxByType
   * @return taxByType
  **/
  public PayRecCalculatedTaxSummaryForServiceTaxByType getTaxByType() {
    return taxByType;
  }
  public void setTaxByType(PayRecCalculatedTaxSummaryForServiceTaxByType taxByType) {
    this.taxByType = taxByType;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayRecCalculatedTaxSummaryForService {\n");
    
    sb.append("    numberOfLines: ").append(toIndentedString(numberOfLines)).append("\n");
    sb.append("    subtotal: ").append(toIndentedString(subtotal)).append("\n");
    sb.append("    totalTax: ").append(toIndentedString(totalTax)).append("\n");
    sb.append("    grandTotal: ").append(toIndentedString(grandTotal)).append("\n");
    sb.append("    pccWithholdingModes: ").append(toIndentedString(pccWithholdingModes)).append("\n");
    sb.append("    taxByType: ").append(toIndentedString(taxByType)).append("\n");
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

