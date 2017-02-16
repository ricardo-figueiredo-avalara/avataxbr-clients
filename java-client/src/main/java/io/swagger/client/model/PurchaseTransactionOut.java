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
import io.swagger.client.model.ProcessingInfo;
import io.swagger.client.model.PurchaseCalculatedTaxSummaryForService;
import io.swagger.client.model.PurchaseHeaderOut;
import io.swagger.client.model.PurchaseLinesOut;
import java.util.ArrayList;
import java.util.List;

/**
 * PurchaseTransactionOut
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-16T18:26:15.214Z")
public class PurchaseTransactionOut {
  @SerializedName("header")
  private PurchaseHeaderOut header = null;

  @SerializedName("lines")
  private List<PurchaseLinesOut> lines = new ArrayList<PurchaseLinesOut>();

  @SerializedName("calculatedTaxSummary")
  private PurchaseCalculatedTaxSummaryForService calculatedTaxSummary = null;

  @SerializedName("processingInfo")
  private ProcessingInfo processingInfo = null;

  public PurchaseTransactionOut header(PurchaseHeaderOut header) {
    this.header = header;
    return this;
  }

   /**
   * Get header
   * @return header
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public PurchaseHeaderOut getHeader() {
    return header;
  }

  public void setHeader(PurchaseHeaderOut header) {
    this.header = header;
  }

  public PurchaseTransactionOut lines(List<PurchaseLinesOut> lines) {
    this.lines = lines;
    return this;
  }

  public PurchaseTransactionOut addLinesItem(PurchaseLinesOut linesItem) {
    this.lines.add(linesItem);
    return this;
  }

   /**
   * Get lines
   * @return lines
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<PurchaseLinesOut> getLines() {
    return lines;
  }

  public void setLines(List<PurchaseLinesOut> lines) {
    this.lines = lines;
  }

  public PurchaseTransactionOut calculatedTaxSummary(PurchaseCalculatedTaxSummaryForService calculatedTaxSummary) {
    this.calculatedTaxSummary = calculatedTaxSummary;
    return this;
  }

   /**
   * Get calculatedTaxSummary
   * @return calculatedTaxSummary
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public PurchaseCalculatedTaxSummaryForService getCalculatedTaxSummary() {
    return calculatedTaxSummary;
  }

  public void setCalculatedTaxSummary(PurchaseCalculatedTaxSummaryForService calculatedTaxSummary) {
    this.calculatedTaxSummary = calculatedTaxSummary;
  }

  public PurchaseTransactionOut processingInfo(ProcessingInfo processingInfo) {
    this.processingInfo = processingInfo;
    return this;
  }

   /**
   * Get processingInfo
   * @return processingInfo
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ProcessingInfo getProcessingInfo() {
    return processingInfo;
  }

  public void setProcessingInfo(ProcessingInfo processingInfo) {
    this.processingInfo = processingInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PurchaseTransactionOut purchaseTransactionOut = (PurchaseTransactionOut) o;
    return Objects.equals(this.header, purchaseTransactionOut.header) &&
        Objects.equals(this.lines, purchaseTransactionOut.lines) &&
        Objects.equals(this.calculatedTaxSummary, purchaseTransactionOut.calculatedTaxSummary) &&
        Objects.equals(this.processingInfo, purchaseTransactionOut.processingInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, lines, calculatedTaxSummary, processingInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseTransactionOut {\n");
    
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    calculatedTaxSummary: ").append(toIndentedString(calculatedTaxSummary)).append("\n");
    sb.append("    processingInfo: ").append(toIndentedString(processingInfo)).append("\n");
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

