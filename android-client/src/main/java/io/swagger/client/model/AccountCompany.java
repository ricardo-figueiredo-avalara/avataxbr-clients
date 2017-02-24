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
public class AccountCompany {
  
  @SerializedName("companyId")
  private UUID companyId = null;
  @SerializedName("companyCode")
  private String companyCode = null;
  @SerializedName("companyName")
  private String companyName = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public UUID getCompanyId() {
    return companyId;
  }
  public void setCompanyId(UUID companyId) {
    this.companyId = companyId;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getCompanyCode() {
    return companyCode;
  }
  public void setCompanyCode(String companyCode) {
    this.companyCode = companyCode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCompanyName() {
    return companyName;
  }
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountCompany accountCompany = (AccountCompany) o;
    return (this.companyId == null ? accountCompany.companyId == null : this.companyId.equals(accountCompany.companyId)) &&
        (this.companyCode == null ? accountCompany.companyCode == null : this.companyCode.equals(accountCompany.companyCode)) &&
        (this.companyName == null ? accountCompany.companyName == null : this.companyName.equals(accountCompany.companyName));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.companyId == null ? 0: this.companyId.hashCode());
    result = 31 * result + (this.companyCode == null ? 0: this.companyCode.hashCode());
    result = 31 * result + (this.companyName == null ? 0: this.companyName.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountCompany {\n");
    
    sb.append("  companyId: ").append(companyId).append("\n");
    sb.append("  companyCode: ").append(companyCode).append("\n");
    sb.append("  companyName: ").append(companyName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
