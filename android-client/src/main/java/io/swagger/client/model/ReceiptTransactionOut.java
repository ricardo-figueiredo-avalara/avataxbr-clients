/**
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

import io.swagger.client.model.PayRecCalculatedTaxSummaryForService;
import io.swagger.client.model.PayRecHeader;
import io.swagger.client.model.PayRecLinesOut;
import io.swagger.client.model.ProcessingInfo;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ReceiptTransactionOut {
  
  @SerializedName("header")
  private PayRecHeader header = null;
  @SerializedName("lines")
  private List<PayRecLinesOut> lines = null;
  @SerializedName("calculatedTaxSummary")
  private PayRecCalculatedTaxSummaryForService calculatedTaxSummary = null;
  @SerializedName("processingInfo")
  private ProcessingInfo processingInfo = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public PayRecHeader getHeader() {
    return header;
  }
  public void setHeader(PayRecHeader header) {
    this.header = header;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<PayRecLinesOut> getLines() {
    return lines;
  }
  public void setLines(List<PayRecLinesOut> lines) {
    this.lines = lines;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public PayRecCalculatedTaxSummaryForService getCalculatedTaxSummary() {
    return calculatedTaxSummary;
  }
  public void setCalculatedTaxSummary(PayRecCalculatedTaxSummaryForService calculatedTaxSummary) {
    this.calculatedTaxSummary = calculatedTaxSummary;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public ProcessingInfo getProcessingInfo() {
    return processingInfo;
  }
  public void setProcessingInfo(ProcessingInfo processingInfo) {
    this.processingInfo = processingInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReceiptTransactionOut receiptTransactionOut = (ReceiptTransactionOut) o;
    return (this.header == null ? receiptTransactionOut.header == null : this.header.equals(receiptTransactionOut.header)) &&
        (this.lines == null ? receiptTransactionOut.lines == null : this.lines.equals(receiptTransactionOut.lines)) &&
        (this.calculatedTaxSummary == null ? receiptTransactionOut.calculatedTaxSummary == null : this.calculatedTaxSummary.equals(receiptTransactionOut.calculatedTaxSummary)) &&
        (this.processingInfo == null ? receiptTransactionOut.processingInfo == null : this.processingInfo.equals(receiptTransactionOut.processingInfo));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.header == null ? 0: this.header.hashCode());
    result = 31 * result + (this.lines == null ? 0: this.lines.hashCode());
    result = 31 * result + (this.calculatedTaxSummary == null ? 0: this.calculatedTaxSummary.hashCode());
    result = 31 * result + (this.processingInfo == null ? 0: this.processingInfo.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceiptTransactionOut {\n");
    
    sb.append("  header: ").append(header).append("\n");
    sb.append("  lines: ").append(lines).append("\n");
    sb.append("  calculatedTaxSummary: ").append(calculatedTaxSummary).append("\n");
    sb.append("  processingInfo: ").append(processingInfo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}