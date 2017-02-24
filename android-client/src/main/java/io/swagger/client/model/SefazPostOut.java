/**
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

import io.swagger.client.model.SefazInvoiceStatus;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class SefazPostOut {
  
  @SerializedName("key")
  private String key = null;
  @SerializedName("documentCode")
  private String documentCode = null;
  @SerializedName("status")
  private SefazInvoiceStatus status = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDocumentCode() {
    return documentCode;
  }
  public void setDocumentCode(String documentCode) {
    this.documentCode = documentCode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public SefazInvoiceStatus getStatus() {
    return status;
  }
  public void setStatus(SefazInvoiceStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SefazPostOut sefazPostOut = (SefazPostOut) o;
    return (this.key == null ? sefazPostOut.key == null : this.key.equals(sefazPostOut.key)) &&
        (this.documentCode == null ? sefazPostOut.documentCode == null : this.documentCode.equals(sefazPostOut.documentCode)) &&
        (this.status == null ? sefazPostOut.status == null : this.status.equals(sefazPostOut.status));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.key == null ? 0: this.key.hashCode());
    result = 31 * result + (this.documentCode == null ? 0: this.documentCode.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SefazPostOut {\n");
    
    sb.append("  key: ").append(key).append("\n");
    sb.append("  documentCode: ").append(documentCode).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
