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
import io.swagger.client.model.SalesLinesInTaxDeductions;

/**
 * SalesLinesIn
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-16T18:26:15.214Z")
public class SalesLinesIn {
  @SerializedName("lineCode")
  private Integer lineCode = null;

  @SerializedName("itemCode")
  private String itemCode = null;

  @SerializedName("numberOfItems")
  private Double numberOfItems = 1.0d;

  @SerializedName("lineAmount")
  private Double lineAmount = null;

  @SerializedName("itemDescription")
  private String itemDescription = null;

  @SerializedName("lineTaxedDiscount")
  private Double lineTaxedDiscount = null;

  @SerializedName("lineUntaxedDiscount")
  private Double lineUntaxedDiscount = null;

  @SerializedName("taxDeductions")
  private SalesLinesInTaxDeductions taxDeductions = null;

  public SalesLinesIn lineCode(Integer lineCode) {
    this.lineCode = lineCode;
    return this;
  }

   /**
   * This string is a unique identifier for this line in the transaction
   * @return lineCode
  **/
  @ApiModelProperty(example = "null", value = "This string is a unique identifier for this line in the transaction")
  public Integer getLineCode() {
    return lineCode;
  }

  public void setLineCode(Integer lineCode) {
    this.lineCode = lineCode;
  }

  public SalesLinesIn itemCode(String itemCode) {
    this.itemCode = itemCode;
    return this;
  }

   /**
   * This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU and is required for SST states.
   * @return itemCode
  **/
  @ApiModelProperty(example = "null", required = true, value = "This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU and is required for SST states.")
  public String getItemCode() {
    return itemCode;
  }

  public void setItemCode(String itemCode) {
    this.itemCode = itemCode;
  }

  public SalesLinesIn numberOfItems(Double numberOfItems) {
    this.numberOfItems = numberOfItems;
    return this;
  }

   /**
   * This decimal captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1
   * @return numberOfItems
  **/
  @ApiModelProperty(example = "null", value = "This decimal captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1")
  public Double getNumberOfItems() {
    return numberOfItems;
  }

  public void setNumberOfItems(Double numberOfItems) {
    this.numberOfItems = numberOfItems;
  }

  public SalesLinesIn lineAmount(Double lineAmount) {
    this.lineAmount = lineAmount;
    return this;
  }

   /**
   * This decimal captures the total cost of this line. In its simplest form lineAmount = (item price * numberOfItems).
   * @return lineAmount
  **/
  @ApiModelProperty(example = "null", value = "This decimal captures the total cost of this line. In its simplest form lineAmount = (item price * numberOfItems).")
  public Double getLineAmount() {
    return lineAmount;
  }

  public void setLineAmount(Double lineAmount) {
    this.lineAmount = lineAmount;
  }

  public SalesLinesIn itemDescription(String itemDescription) {
    this.itemDescription = itemDescription;
    return this;
  }

   /**
   * This string captures the description of the item represented by this line, will be used LC 116
   * @return itemDescription
  **/
  @ApiModelProperty(example = "null", value = "This string captures the description of the item represented by this line, will be used LC 116")
  public String getItemDescription() {
    return itemDescription;
  }

  public void setItemDescription(String itemDescription) {
    this.itemDescription = itemDescription;
  }

  public SalesLinesIn lineTaxedDiscount(Double lineTaxedDiscount) {
    this.lineTaxedDiscount = lineTaxedDiscount;
    return this;
  }

   /**
   * Conditional discount
   * @return lineTaxedDiscount
  **/
  @ApiModelProperty(example = "null", value = "Conditional discount")
  public Double getLineTaxedDiscount() {
    return lineTaxedDiscount;
  }

  public void setLineTaxedDiscount(Double lineTaxedDiscount) {
    this.lineTaxedDiscount = lineTaxedDiscount;
  }

  public SalesLinesIn lineUntaxedDiscount(Double lineUntaxedDiscount) {
    this.lineUntaxedDiscount = lineUntaxedDiscount;
    return this;
  }

   /**
   * Unconditional discount
   * @return lineUntaxedDiscount
  **/
  @ApiModelProperty(example = "null", value = "Unconditional discount")
  public Double getLineUntaxedDiscount() {
    return lineUntaxedDiscount;
  }

  public void setLineUntaxedDiscount(Double lineUntaxedDiscount) {
    this.lineUntaxedDiscount = lineUntaxedDiscount;
  }

  public SalesLinesIn taxDeductions(SalesLinesInTaxDeductions taxDeductions) {
    this.taxDeductions = taxDeductions;
    return this;
  }

   /**
   * Get taxDeductions
   * @return taxDeductions
  **/
  @ApiModelProperty(example = "null", value = "")
  public SalesLinesInTaxDeductions getTaxDeductions() {
    return taxDeductions;
  }

  public void setTaxDeductions(SalesLinesInTaxDeductions taxDeductions) {
    this.taxDeductions = taxDeductions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SalesLinesIn salesLinesIn = (SalesLinesIn) o;
    return Objects.equals(this.lineCode, salesLinesIn.lineCode) &&
        Objects.equals(this.itemCode, salesLinesIn.itemCode) &&
        Objects.equals(this.numberOfItems, salesLinesIn.numberOfItems) &&
        Objects.equals(this.lineAmount, salesLinesIn.lineAmount) &&
        Objects.equals(this.itemDescription, salesLinesIn.itemDescription) &&
        Objects.equals(this.lineTaxedDiscount, salesLinesIn.lineTaxedDiscount) &&
        Objects.equals(this.lineUntaxedDiscount, salesLinesIn.lineUntaxedDiscount) &&
        Objects.equals(this.taxDeductions, salesLinesIn.taxDeductions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineCode, itemCode, numberOfItems, lineAmount, itemDescription, lineTaxedDiscount, lineUntaxedDiscount, taxDeductions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesLinesIn {\n");
    
    sb.append("    lineCode: ").append(toIndentedString(lineCode)).append("\n");
    sb.append("    itemCode: ").append(toIndentedString(itemCode)).append("\n");
    sb.append("    numberOfItems: ").append(toIndentedString(numberOfItems)).append("\n");
    sb.append("    lineAmount: ").append(toIndentedString(lineAmount)).append("\n");
    sb.append("    itemDescription: ").append(toIndentedString(itemDescription)).append("\n");
    sb.append("    lineTaxedDiscount: ").append(toIndentedString(lineTaxedDiscount)).append("\n");
    sb.append("    lineUntaxedDiscount: ").append(toIndentedString(lineUntaxedDiscount)).append("\n");
    sb.append("    taxDeductions: ").append(toIndentedString(taxDeductions)).append("\n");
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
