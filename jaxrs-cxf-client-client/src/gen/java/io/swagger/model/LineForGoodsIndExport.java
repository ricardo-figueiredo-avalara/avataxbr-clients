package io.swagger.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@ApiModel(description="indirect exportation")
public class LineForGoodsIndExport  {
  
  @ApiModelProperty(example = "null", required = true, value = "Exportation register number")
  private String registerNumber = null;
  @ApiModelProperty(example = "null", required = true, value = "invoice access key received to export")
  private String accessKey = null;
  @ApiModelProperty(example = "null", required = true, value = "This decimal 11 integers and 0 to 4 decimals, quantity exported in real")
  private Double quantity = null;

 /**
   * Exportation register number
   * @return registerNumber
  **/
  public String getRegisterNumber() {
    return registerNumber;
  }
  public void setRegisterNumber(String registerNumber) {
    this.registerNumber = registerNumber;
  }
 /**
   * invoice access key received to export
   * @return accessKey
  **/
  public String getAccessKey() {
    return accessKey;
  }
  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }
 /**
   * This decimal 11 integers and 0 to 4 decimals, quantity exported in real
   * @return quantity
  **/
  public Double getQuantity() {
    return quantity;
  }
  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineForGoodsIndExport {\n");
    
    sb.append("    registerNumber: ").append(toIndentedString(registerNumber)).append("\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

