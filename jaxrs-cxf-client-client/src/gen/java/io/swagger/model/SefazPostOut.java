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

public class SefazPostOut  {
  
  @ApiModelProperty(example = "null", value = "")
  private String key = null;
  @ApiModelProperty(example = "null", value = "")
  private String documentCode = null;
  @ApiModelProperty(example = "null", value = "")
  private SefazInvoiceStatus status = null;

 /**
   * Get key
   * @return key
  **/
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }
 /**
   * Get documentCode
   * @return documentCode
  **/
  public String getDocumentCode() {
    return documentCode;
  }
  public void setDocumentCode(String documentCode) {
    this.documentCode = documentCode;
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
    sb.append("class SefazPostOut {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    documentCode: ").append(toIndentedString(documentCode)).append("\n");
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

