package io.swagger.model;

import io.swagger.model.LineForGoodsIndExport;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class LineForGoodsExport  {
  
  @ApiModelProperty(example = "null", value = "")
  private String drawbackNumber = null;
  @ApiModelProperty(example = "null", value = "")
  private LineForGoodsIndExport indExport = null;

 /**
   * Get drawbackNumber
   * @return drawbackNumber
  **/
  public String getDrawbackNumber() {
    return drawbackNumber;
  }
  public void setDrawbackNumber(String drawbackNumber) {
    this.drawbackNumber = drawbackNumber;
  }
 /**
   * Get indExport
   * @return indExport
  **/
  public LineForGoodsIndExport getIndExport() {
    return indExport;
  }
  public void setIndExport(LineForGoodsIndExport indExport) {
    this.indExport = indExport;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineForGoodsExport {\n");
    
    sb.append("    drawbackNumber: ").append(toIndentedString(drawbackNumber)).append("\n");
    sb.append("    indExport: ").append(toIndentedString(indExport)).append("\n");
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

