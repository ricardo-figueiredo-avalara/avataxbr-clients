package io.swagger.model;

import io.swagger.model.CalculatedTaxSummaryForGoods;
import io.swagger.model.HeaderForGoods;
import io.swagger.model.LineForGoods;
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

public class TransactionForGoodsOut  {
  
  @ApiModelProperty(example = "null", value = "")
  private HeaderForGoods header = null;
  @ApiModelProperty(example = "null", value = "")
  private List<LineForGoods> lines = new ArrayList<LineForGoods>();
  @ApiModelProperty(example = "null", value = "")
  private CalculatedTaxSummaryForGoods calculatedTaxSummary = null;
  @ApiModelProperty(example = "null", value = "")
  private ProcessingInfo processingInfo = null;

 /**
   * Get header
   * @return header
  **/
  public HeaderForGoods getHeader() {
    return header;
  }
  public void setHeader(HeaderForGoods header) {
    this.header = header;
  }
 /**
   * Get lines
   * @return lines
  **/
  public List<LineForGoods> getLines() {
    return lines;
  }
  public void setLines(List<LineForGoods> lines) {
    this.lines = lines;
  }
 /**
   * Get calculatedTaxSummary
   * @return calculatedTaxSummary
  **/
  public CalculatedTaxSummaryForGoods getCalculatedTaxSummary() {
    return calculatedTaxSummary;
  }
  public void setCalculatedTaxSummary(CalculatedTaxSummaryForGoods calculatedTaxSummary) {
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
    sb.append("class TransactionForGoodsOut {\n");
    
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

