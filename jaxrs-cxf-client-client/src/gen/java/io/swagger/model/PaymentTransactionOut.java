package io.swagger.model;

import io.swagger.model.PayRecCalculatedTaxSummaryForService;
import io.swagger.model.PayRecHeader;
import io.swagger.model.PayRecLinesOut;
import io.swagger.model.ProcessingInfo;
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

public class PaymentTransactionOut  {
  
  @ApiModelProperty(example = "null", value = "")
  private PayRecHeader header = null;
  @ApiModelProperty(example = "null", value = "")
  private List<PayRecLinesOut> lines = new ArrayList<PayRecLinesOut>();
  @ApiModelProperty(example = "null", value = "")
  private PayRecCalculatedTaxSummaryForService calculatedTaxSummary = null;
  @ApiModelProperty(example = "null", value = "")
  private ProcessingInfo processingInfo = null;

 /**
   * Get header
   * @return header
  **/
  public PayRecHeader getHeader() {
    return header;
  }
  public void setHeader(PayRecHeader header) {
    this.header = header;
  }
 /**
   * Get lines
   * @return lines
  **/
  public List<PayRecLinesOut> getLines() {
    return lines;
  }
  public void setLines(List<PayRecLinesOut> lines) {
    this.lines = lines;
  }
 /**
   * Get calculatedTaxSummary
   * @return calculatedTaxSummary
  **/
  public PayRecCalculatedTaxSummaryForService getCalculatedTaxSummary() {
    return calculatedTaxSummary;
  }
  public void setCalculatedTaxSummary(PayRecCalculatedTaxSummaryForService calculatedTaxSummary) {
    this.calculatedTaxSummary = calculatedTaxSummary;
  }
 /**
   * Get processingInfo
   * @return processingInfo
  **/
  public ProcessingInfo getProcessingInfo() {
    return processingInfo;
  }
  public void setProcessingInfo(ProcessingInfo processingInfo) {
    this.processingInfo = processingInfo;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTransactionOut {\n");
    
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

