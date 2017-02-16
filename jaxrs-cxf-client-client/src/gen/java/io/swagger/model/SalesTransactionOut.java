package io.swagger.model;

import io.swagger.model.ProcessingInfo;
import io.swagger.model.SalesCalculatedTaxSummaryForService;
import io.swagger.model.SalesHeaderOut;
import io.swagger.model.SalesLinesOut;
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

public class SalesTransactionOut  {
  
  @ApiModelProperty(example = "null", required = true, value = "")
  private SalesHeaderOut header = null;
  @ApiModelProperty(example = "null", required = true, value = "")
  private List<SalesLinesOut> lines = new ArrayList<SalesLinesOut>();
  @ApiModelProperty(example = "null", required = true, value = "")
  private SalesCalculatedTaxSummaryForService calculatedTaxSummary = null;
  @ApiModelProperty(example = "null", required = true, value = "")
  private ProcessingInfo processingInfo = null;

 /**
   * Get header
   * @return header
  **/
  public SalesHeaderOut getHeader() {
    return header;
  }
  public void setHeader(SalesHeaderOut header) {
    this.header = header;
  }
 /**
   * Get lines
   * @return lines
  **/
  public List<SalesLinesOut> getLines() {
    return lines;
  }
  public void setLines(List<SalesLinesOut> lines) {
    this.lines = lines;
  }
 /**
   * Get calculatedTaxSummary
   * @return calculatedTaxSummary
  **/
  public SalesCalculatedTaxSummaryForService getCalculatedTaxSummary() {
    return calculatedTaxSummary;
  }
  public void setCalculatedTaxSummary(SalesCalculatedTaxSummaryForService calculatedTaxSummary) {
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
    sb.append("class SalesTransactionOut {\n");
    
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

