package io.swagger.model;

import io.swagger.model.SefazInvoiceStatus;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class SefazItGetOut  {
  
  @ApiModelProperty(example = "null", value = "Invoice Access Key")
  private String key = null;
  @ApiModelProperty(example = "null", value = "XML Signed")
  private String xml = null;
  @ApiModelProperty(example = "null", value = "")
  private SefazInvoiceStatus status = null;

 /**
   * Invoice Access Key
   * @return key
  **/
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }
 /**
   * XML Signed
   * @return xml
  **/
  public String getXml() {
    return xml;
  }
  public void setXml(String xml) {
    this.xml = xml;
  }
 /**
   * Get status
   * @return status
  **/
  public SefazInvoiceStatus getStatus() {
    return status;
  }
  public void setStatus(SefazInvoiceStatus status) {
    this.status = status;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SefazItGetOut {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    xml: ").append(toIndentedString(xml)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

