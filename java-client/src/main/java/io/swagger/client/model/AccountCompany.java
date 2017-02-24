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

/**
 * AccountCompany
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-24T19:47:57.099Z")
public class AccountCompany {
  @SerializedName("companyId")
  private String companyId = null;

  @SerializedName("companyCode")
  private String companyCode = null;

  @SerializedName("companyName")
  private String companyName = null;

  public AccountCompany companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

   /**
   * Get companyId
   * @return companyId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public AccountCompany companyCode(String companyCode) {
    this.companyCode = companyCode;
    return this;
  }

   /**
   * Get companyCode
   * @return companyCode
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getCompanyCode() {
    return companyCode;
  }

  public void setCompanyCode(String companyCode) {
    this.companyCode = companyCode;
  }

  public AccountCompany companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Get companyName
   * @return companyName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountCompany accountCompany = (AccountCompany) o;
    return Objects.equals(this.companyId, accountCompany.companyId) &&
        Objects.equals(this.companyCode, accountCompany.companyCode) &&
        Objects.equals(this.companyName, accountCompany.companyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, companyCode, companyName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountCompany {\n");
    
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    companyCode: ").append(toIndentedString(companyCode)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
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

