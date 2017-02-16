package io.swagger.model;

import io.swagger.model.PayRecHeader;
import io.swagger.model.PaymentLinesIn;
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

public class ReceiptTransactionIn  {
  
  @ApiModelProperty(example = "null", required = true, value = "")
  private PayRecHeader header = null;
  @ApiModelProperty(example = "null", required = true, value = "")
  private List<PaymentLinesIn> lines = new ArrayList<PaymentLinesIn>();

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
  public List<PaymentLinesIn> getLines() {
    return lines;
  }
  public void setLines(List<PaymentLinesIn> lines) {
    this.lines = lines;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceiptTransactionIn {\n");
    
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
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

