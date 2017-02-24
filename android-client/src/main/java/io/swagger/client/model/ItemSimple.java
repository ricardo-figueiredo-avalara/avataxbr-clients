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

import java.util.UUID;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ItemSimple {
  
  @SerializedName("companyId")
  private UUID companyId = null;
  @SerializedName("code")
  private String code = null;
  @SerializedName("agast")
  private String agast = null;
  @SerializedName("description")
  private String description = null;

  /**
   * Company ID
   **/
  @ApiModelProperty(required = true, value = "Company ID")
  public UUID getCompanyId() {
    return companyId;
  }
  public void setCompanyId(UUID companyId) {
    this.companyId = companyId;
  }

  /**
   * ERP Code
   **/
  @ApiModelProperty(required = true, value = "ERP Code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  /**
   * Agast Code
   **/
  @ApiModelProperty(required = true, value = "Agast Code")
  public String getAgast() {
    return agast;
  }
  public void setAgast(String agast) {
    this.agast = agast;
  }

  /**
   * Item Description
   **/
  @ApiModelProperty(value = "Item Description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemSimple itemSimple = (ItemSimple) o;
    return (this.companyId == null ? itemSimple.companyId == null : this.companyId.equals(itemSimple.companyId)) &&
        (this.code == null ? itemSimple.code == null : this.code.equals(itemSimple.code)) &&
        (this.agast == null ? itemSimple.agast == null : this.agast.equals(itemSimple.agast)) &&
        (this.description == null ? itemSimple.description == null : this.description.equals(itemSimple.description));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.companyId == null ? 0: this.companyId.hashCode());
    result = 31 * result + (this.code == null ? 0: this.code.hashCode());
    result = 31 * result + (this.agast == null ? 0: this.agast.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemSimple {\n");
    
    sb.append("  companyId: ").append(companyId).append("\n");
    sb.append("  code: ").append(code).append("\n");
    sb.append("  agast: ").append(agast).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
