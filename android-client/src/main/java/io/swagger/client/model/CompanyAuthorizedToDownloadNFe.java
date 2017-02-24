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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CompanyAuthorizedToDownloadNFe {
  
  @SerializedName("federalTaxId")
  private String federalTaxId = null;

  /**
   * Federal tax id, CNPJ or CPF
   **/
  @ApiModelProperty(value = "Federal tax id, CNPJ or CPF")
  public String getFederalTaxId() {
    return federalTaxId;
  }
  public void setFederalTaxId(String federalTaxId) {
    this.federalTaxId = federalTaxId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyAuthorizedToDownloadNFe companyAuthorizedToDownloadNFe = (CompanyAuthorizedToDownloadNFe) o;
    return (this.federalTaxId == null ? companyAuthorizedToDownloadNFe.federalTaxId == null : this.federalTaxId.equals(companyAuthorizedToDownloadNFe.federalTaxId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.federalTaxId == null ? 0: this.federalTaxId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyAuthorizedToDownloadNFe {\n");
    
    sb.append("  federalTaxId: ").append(federalTaxId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
