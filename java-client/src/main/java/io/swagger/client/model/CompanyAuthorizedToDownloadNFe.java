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
 * CompanyAuthorizedToDownloadNFe
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-24T19:47:57.099Z")
public class CompanyAuthorizedToDownloadNFe {
  @SerializedName("federalTaxId")
  private String federalTaxId = null;

  public CompanyAuthorizedToDownloadNFe federalTaxId(String federalTaxId) {
    this.federalTaxId = federalTaxId;
    return this;
  }

   /**
   * Federal tax id, CNPJ or CPF
   * @return federalTaxId
  **/
  @ApiModelProperty(example = "null", value = "Federal tax id, CNPJ or CPF")
  public String getFederalTaxId() {
    return federalTaxId;
  }

  public void setFederalTaxId(String federalTaxId) {
    this.federalTaxId = federalTaxId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyAuthorizedToDownloadNFe companyAuthorizedToDownloadNFe = (CompanyAuthorizedToDownloadNFe) o;
    return Objects.equals(this.federalTaxId, companyAuthorizedToDownloadNFe.federalTaxId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(federalTaxId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyAuthorizedToDownloadNFe {\n");
    
    sb.append("    federalTaxId: ").append(toIndentedString(federalTaxId)).append("\n");
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

