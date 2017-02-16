package io.swagger.model;

import io.swagger.model.CalculatedTaxSummaryForGoods;
import io.swagger.model.HeaderForGoods;
import io.swagger.model.LineForSefazGoods;
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

public class TransactionForSefazGoods  {
  
  @ApiModelProperty(example = "null", value = "")
  private HeaderForGoods header = null;
  @ApiModelProperty(example = "null", value = "")
  private List<LineForSefazGoods> lines = new ArrayList<LineForSefazGoods>();
  @ApiModelProperty(example = "null", value = "")
  private CalculatedTaxSummaryForGoods calculatedTaxSummary = null;

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
  public List<LineForSefazGoods> getLines() {
    return lines;
  }
  public void setLines(List<LineForSefazGoods> lines) {
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

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionForSefazGoods {\n");
    
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    calculatedTaxSummary: ").append(toIndentedString(calculatedTaxSummary)).append("\n");
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

