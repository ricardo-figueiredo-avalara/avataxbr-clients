package io.swagger.model;

import io.swagger.model.PurchaseCalculatedTaxSummaryForServiceTaxByType;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class PurchaseCalculatedTaxSummaryForService  {
  
  @ApiModelProperty(example = "null", value = "Count of lines")
  private Integer numberOfLines = null;
  @ApiModelProperty(example = "null", value = "sum of all line tax attribute")
  private Double subtotal = null;
  @ApiModelProperty(example = "null", value = "sum of all line lineAmount attribute")
  private Double totalTax = null;
  @ApiModelProperty(example = "null", value = "sum of all line lineAmount attribute - sum of all line tax attribute - sum of all line lineTaxedDiscount attribute")
  private Double grandTotal = null;
  @ApiModelProperty(example = "null", value = "")
  private PurchaseCalculatedTaxSummaryForServiceTaxByType taxByType = null;

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
   * sum of all line tax attribute
   * @return subtotal
  **/
  public Double getSubtotal() {
    return subtotal;
  }
  public void setSubtotal(Double subtotal) {
    this.subtotal = subtotal;
  }
 /**
   * sum of all line lineAmount attribute
   * @return totalTax
  **/
  public Double getTotalTax() {
    return totalTax;
  }
  public void setTotalTax(Double totalTax) {
    this.totalTax = totalTax;
  }
 /**
   * sum of all line lineAmount attribute - sum of all line tax attribute - sum of all line lineTaxedDiscount attribute
   * @return grandTotal
  **/
  public Double getGrandTotal() {
    return grandTotal;
  }
  public void setGrandTotal(Double grandTotal) {
    this.grandTotal = grandTotal;
  }
 /**
   * Get taxByType
   * @return taxByType
  **/
  public PurchaseCalculatedTaxSummaryForServiceTaxByType getTaxByType() {
    return taxByType;
  }
  public void setTaxByType(PurchaseCalculatedTaxSummaryForServiceTaxByType taxByType) {
    this.taxByType = taxByType;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseCalculatedTaxSummaryForService {\n");
    
    sb.append("    numberOfLines: ").append(toIndentedString(numberOfLines)).append("\n");
    sb.append("    subtotal: ").append(toIndentedString(subtotal)).append("\n");
    sb.append("    totalTax: ").append(toIndentedString(totalTax)).append("\n");
    sb.append("    grandTotal: ").append(toIndentedString(grandTotal)).append("\n");
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

