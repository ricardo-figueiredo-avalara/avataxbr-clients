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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.SefazInvoiceStatus;

/**
 * SefazPostOut
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-06T17:54:07.550Z")
public class SefazPostOut {
  @SerializedName("key")
  private String key = null;

  @SerializedName("documentCode")
  private String documentCode = null;

  @SerializedName("status")
  private SefazInvoiceStatus status = null;

  public SefazPostOut key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public SefazPostOut documentCode(String documentCode) {
    this.documentCode = documentCode;
    return this;
  }

   /**
   * Get documentCode
   * @return documentCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDocumentCode() {
    return documentCode;
  }

  public void setDocumentCode(String documentCode) {
    this.documentCode = documentCode;
  }

  public SefazPostOut status(SefazInvoiceStatus status) {
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
    SefazPostOut sefazPostOut = (SefazPostOut) o;
    return Objects.equals(this.key, sefazPostOut.key) &&
        Objects.equals(this.documentCode, sefazPostOut.documentCode) &&
        Objects.equals(this.status, sefazPostOut.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, documentCode, status);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

