/*
 * AvaTax Brazil
 * The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * SefazItGetOut
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-06T17:54:07.550Z")
public class SefazItGetOut {
  @SerializedName("key")
  private String key = null;

  @SerializedName("xml")
  private String xml = null;

  @SerializedName("status")
  private SefazInvoiceStatus status = null;

  public SefazItGetOut key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Invoice Access Key
   * @return key
  **/
  @ApiModelProperty(example = "null", value = "Invoice Access Key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public SefazItGetOut xml(String xml) {
    this.xml = xml;
    return this;
  }

   /**
   * XML Signed
   * @return xml
  **/
  @ApiModelProperty(example = "null", value = "XML Signed")
  public String getXml() {
    return xml;
  }

  public void setXml(String xml) {
    this.xml = xml;
  }

  public SefazItGetOut status(SefazInvoiceStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "")
  public SefazInvoiceStatus getStatus() {
    return status;
  }

  public void setStatus(SefazInvoiceStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SefazItGetOut sefazItGetOut = (SefazItGetOut) o;
    return Objects.equals(this.key, sefazItGetOut.key) &&
        Objects.equals(this.xml, sefazItGetOut.xml) &&
        Objects.equals(this.status, sefazItGetOut.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, xml, status);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

