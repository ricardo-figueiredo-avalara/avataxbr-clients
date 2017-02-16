package io.swagger.model;

import io.swagger.model.ProcessingInfo;
import io.swagger.model.PurchaseCalculatedTaxSummaryForService;
import io.swagger.model.PurchaseHeaderOut;
import io.swagger.model.PurchaseLinesOut;
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

public class PurchaseTransactionOut  {
  
  @ApiModelProperty(example = "null", required = true, value = "")
  private PurchaseHeaderOut header = null;
  @ApiModelProperty(example = "null", required = true, value = "")
  private List<PurchaseLinesOut> lines = new ArrayList<PurchaseLinesOut>();
  @ApiModelProperty(example = "null", required = true, value = "")
  private PurchaseCalculatedTaxSummaryForService calculatedTaxSummary = null;
  @ApiModelProperty(example = "null", required = true, value = "")
  private ProcessingInfo processingInfo = null;

 /**
   * Get header
   * @return header
  **/
  public PurchaseHeaderOut getHeader() {
    return header;
  }
  public void setHeader(PurchaseHeaderOut header) {
    this.header = header;
  }
 /**
   * Get lines
   * @return lines
  **/
  public List<PurchaseLinesOut> getLines() {
    return lines;
  }
  public void setLines(List<PurchaseLinesOut> lines) {
    this.lines = lines;
  }
 /**
   * Get calculatedTaxSummary
   * @return calculatedTaxSummary
  **/
  public PurchaseCalculatedTaxSummaryForService getCalculatedTaxSummary() {
    return calculatedTaxSummary;
  }
  public void setCalculatedTaxSummary(PurchaseCalculatedTaxSummaryForService calculatedTaxSummary) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

