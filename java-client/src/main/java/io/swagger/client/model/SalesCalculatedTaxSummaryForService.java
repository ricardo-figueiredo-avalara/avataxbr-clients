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
import io.swagger.client.model.SalesCalculatedTaxSummaryForServiceTaxByType;

/**
 * SalesCalculatedTaxSummaryForService
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-24T19:47:57.099Z")
public class SalesCalculatedTaxSummaryForService {
  @SerializedName("numberOfLines")
  private Integer numberOfLines = null;

  @SerializedName("subtotal")
  private Double subtotal = null;

  @SerializedName("totalTax")
  private Double totalTax = null;

  @SerializedName("grandTotal")
  private Double grandTotal = null;

  @SerializedName("taxByType")
  private SalesCalculatedTaxSummaryForServiceTaxByType taxByType = null;

  public SalesCalculatedTaxSummaryForService numberOfLines(Integer numberOfLines) {
    this.numberOfLines = numberOfLines;
    return this;
  }

   /**
   * Count of lines
   * @return numberOfLines
  **/
  @ApiModelProperty(example = "null", value = "Count of lines")
  public Integer getNumberOfLines() {
    return numberOfLines;
  }

  public void setNumberOfLines(Integer numberOfLines) {
    this.numberOfLines = numberOfLines;
  }

  public SalesCalculatedTaxSummaryForService subtotal(Double subtotal) {
    this.subtotal = subtotal;
    return this;
  }

   /**
   * sum of all line tax attribute
   * @return subtotal
  **/
  @ApiModelProperty(example = "null", value = "sum of all line tax attribute")
  public Double getSubtotal() {
    return subtotal;
  }

  public void setSubtotal(Double subtotal) {
    this.subtotal = subtotal;
  }

  public SalesCalculatedTaxSummaryForService totalTax(Double totalTax) {
    this.totalTax = totalTax;
    return this;
  }

   /**
   * sum of all line lineAmount attribute
   * @return totalTax
  **/
  @ApiModelProperty(example = "null", value = "sum of all line lineAmount attribute")
  public Double getTotalTax() {
    return totalTax;
  }

  public void setTotalTax(Double totalTax) {
    this.totalTax = totalTax;
  }

  public SalesCalculatedTaxSummaryForService grandTotal(Double grandTotal) {
    this.grandTotal = grandTotal;
    return this;
  }

   /**
   * sum of all line lineAmount attribute - sum of all line tax attribute - sum of all line lineTaxedDiscount attribute
   * @return grandTotal
  **/
  @ApiModelProperty(example = "null", value = "sum of all line lineAmount attribute - sum of all line tax attribute - sum of all line lineTaxedDiscount attribute")
  public Double getGrandTotal() {
    return grandTotal;
  }

  public void setGrandTotal(Double grandTotal) {
    this.grandTotal = grandTotal;
  }

  public SalesCalculatedTaxSummaryForService taxByType(SalesCalculatedTaxSummaryForServiceTaxByType taxByType) {
    this.taxByType = taxByType;
    return this;
  }

   /**
   * Get taxByType
   * @return taxByType
  **/
  @ApiModelProperty(example = "null", value = "")
  public SalesCalculatedTaxSummaryForServiceTaxByType getTaxByType() {
    return taxByType;
  }

  public void setTaxByType(SalesCalculatedTaxSummaryForServiceTaxByType taxByType) {
    this.taxByType = taxByType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SalesCalculatedTaxSummaryForService salesCalculatedTaxSummaryForService = (SalesCalculatedTaxSummaryForService) o;
    return Objects.equals(this.numberOfLines, salesCalculatedTaxSummaryForService.numberOfLines) &&
        Objects.equals(this.subtotal, salesCalculatedTaxSummaryForService.subtotal) &&
        Objects.equals(this.totalTax, salesCalculatedTaxSummaryForService.totalTax) &&
        Objects.equals(this.grandTotal, salesCalculatedTaxSummaryForService.grandTotal) &&
        Objects.equals(this.taxByType, salesCalculatedTaxSummaryForService.taxByType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfLines, subtotal, totalTax, grandTotal, taxByType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesCalculatedTaxSummaryForService {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

