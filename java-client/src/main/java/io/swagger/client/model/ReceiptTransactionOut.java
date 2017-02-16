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
import io.swagger.client.model.PayRecCalculatedTaxSummaryForService;
import io.swagger.client.model.PayRecHeader;
import io.swagger.client.model.PayRecLinesOut;
import io.swagger.client.model.ProcessingInfo;
import java.util.ArrayList;
import java.util.List;

/**
 * ReceiptTransactionOut
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-16T18:26:15.214Z")
public class ReceiptTransactionOut {
  @SerializedName("header")
  private PayRecHeader header = null;

  @SerializedName("lines")
  private List<PayRecLinesOut> lines = new ArrayList<PayRecLinesOut>();

  @SerializedName("calculatedTaxSummary")
  private PayRecCalculatedTaxSummaryForService calculatedTaxSummary = null;

  @SerializedName("processingInfo")
  private ProcessingInfo processingInfo = null;

  public ReceiptTransactionOut header(PayRecHeader header) {
    this.header = header;
    return this;
  }

   /**
   * Get header
   * @return header
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public PayRecHeader getHeader() {
    return header;
  }

  public void setHeader(PayRecHeader header) {
    this.header = header;
  }

  public ReceiptTransactionOut lines(List<PayRecLinesOut> lines) {
    this.lines = lines;
    return this;
  }

  public ReceiptTransactionOut addLinesItem(PayRecLinesOut linesItem) {
    this.lines.add(linesItem);
    return this;
  }

   /**
   * Get lines
   * @return lines
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<PayRecLinesOut> getLines() {
    return lines;
  }

  public void setLines(List<PayRecLinesOut> lines) {
    this.lines = lines;
  }

  public ReceiptTransactionOut calculatedTaxSummary(PayRecCalculatedTaxSummaryForService calculatedTaxSummary) {
    this.calculatedTaxSummary = calculatedTaxSummary;
    return this;
  }

   /**
   * Get calculatedTaxSummary
   * @return calculatedTaxSummary
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public PayRecCalculatedTaxSummaryForService getCalculatedTaxSummary() {
    return calculatedTaxSummary;
  }

  public void setCalculatedTaxSummary(PayRecCalculatedTaxSummaryForService calculatedTaxSummary) {
    this.calculatedTaxSummary = calculatedTaxSummary;
  }

  public ReceiptTransactionOut processingInfo(ProcessingInfo processingInfo) {
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
    ReceiptTransactionOut receiptTransactionOut = (ReceiptTransactionOut) o;
    return Objects.equals(this.header, receiptTransactionOut.header) &&
        Objects.equals(this.lines, receiptTransactionOut.lines) &&
        Objects.equals(this.calculatedTaxSummary, receiptTransactionOut.calculatedTaxSummary) &&
        Objects.equals(this.processingInfo, receiptTransactionOut.processingInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, lines, calculatedTaxSummary, processingInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceiptTransactionOut {\n");
    
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

