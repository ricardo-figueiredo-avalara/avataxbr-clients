package io.swagger.model;

import io.swagger.model.CalculatedTaxSummaryForGoodsTaxByType;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class CalculatedTaxSummaryForGoods  {
  
  @ApiModelProperty(example = "null", value = "Count of lines")
  private Integer numberOfLines = null;
  @ApiModelProperty(example = "null", value = "sum of all line taxed discounts")
  private Double taxedDiscount = null;
  @ApiModelProperty(example = "null", value = "sum of all line untaxed discounts")
  private Double untaxedDiscount = null;
  @ApiModelProperty(example = "null", value = "sum of all line lineAmount attribute")
  private Double subtotal = null;
  @ApiModelProperty(example = "null", value = "sum of all line tax attribute")
  private Double totalTax = null;
  @ApiModelProperty(example = "null", value = "sum of all line lineAmount attribute + sum of all line tax attribute not VAT - sum of all line lineTaxedDiscount attribute")
  private Double grandTotal = null;
  @ApiModelProperty(example = "null", value = "")
  private CalculatedTaxSummaryForGoodsTaxByType taxByType = null;

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
   * sum of all line taxed discounts
   * @return taxedDiscount
  **/
  public Double getTaxedDiscount() {
    return taxedDiscount;
  }
  public void setTaxedDiscount(Double taxedDiscount) {
    this.taxedDiscount = taxedDiscount;
  }
 /**
   * sum of all line untaxed discounts
   * @return untaxedDiscount
  **/
  public Double getUntaxedDiscount() {
    return untaxedDiscount;
  }
  public void setUntaxedDiscount(Double untaxedDiscount) {
    this.untaxedDiscount = untaxedDiscount;
  }
 /**
   * sum of all line lineAmount attribute
   * @return subtotal
  **/
  public Double getSubtotal() {
    return subtotal;
  }
  public void setSubtotal(Double subtotal) {
    this.subtotal = subtotal;
  }
 /**
   * sum of all line tax attribute
   * @return totalTax
  **/
  public Double getTotalTax() {
    return totalTax;
  }
  public void setTotalTax(Double totalTax) {
    this.totalTax = totalTax;
  }
 /**
   * sum of all line lineAmount attribute + sum of all line tax attribute not VAT - sum of all line lineTaxedDiscount attribute
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
  public CalculatedTaxSummaryForGoodsTaxByType getTaxByType() {
    return taxByType;
  }
  public void setTaxByType(CalculatedTaxSummaryForGoodsTaxByType taxByType) {
    this.taxByType = taxByType;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalculatedTaxSummaryForGoods {\n");
    
    sb.append("    numberOfLines: ").append(toIndentedString(numberOfLines)).append("\n");
    sb.append("    taxedDiscount: ").append(toIndentedString(taxedDiscount)).append("\n");
    sb.append("    untaxedDiscount: ").append(toIndentedString(untaxedDiscount)).append("\n");
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

