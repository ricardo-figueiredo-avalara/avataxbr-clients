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
import io.swagger.client.model.AgastWithholdingCOFINS;
import io.swagger.client.model.AgastWithholdingCSLL;
import io.swagger.client.model.AgastWithholdingPIS;

/**
 * inform if this item is subject to withholding tax on service Transactions, default true
 */
@ApiModel(description = "inform if this item is subject to withholding tax on service Transactions, default true")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-06T17:54:07.550Z")
public class AgastWithholding {
  @SerializedName("IRRF")
  private Boolean IRRF = null;

  @SerializedName("IRRFLegalReason")
  private String irRFLegalReason = null;

  @SerializedName("INSSSubjectToDischarge")
  private Boolean inSSSubjectToDischarge = null;

  @SerializedName("INSS")
  private Boolean INSS = null;

  @SerializedName("INSSLegalReason")
  private String inSSLegalReason = null;

  @SerializedName("INSsForSimples")
  private Boolean inSsForSimples = null;

  @SerializedName("INSSForSimplesLegalReason")
  private String inSSForSimplesLegalReason = null;

  @SerializedName("PIS")
  private AgastWithholdingPIS PIS = null;

  @SerializedName("COFINS")
  private AgastWithholdingCOFINS COFINS = null;

  @SerializedName("CSLL")
  private AgastWithholdingCSLL CSLL = null;

  public AgastWithholding IRRF(Boolean IRRF) {
    this.IRRF = IRRF;
    return this;
  }

   /**
   * Get IRRF
   * @return IRRF
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIRRF() {
    return IRRF;
  }

  public void setIRRF(Boolean IRRF) {
    this.IRRF = IRRF;
  }

  public AgastWithholding irRFLegalReason(String irRFLegalReason) {
    this.irRFLegalReason = irRFLegalReason;
    return this;
  }

   /**
   * reference id to TaxLegalReason
   * @return irRFLegalReason
  **/
  @ApiModelProperty(example = "null", value = "reference id to TaxLegalReason")
  public String getIrRFLegalReason() {
    return irRFLegalReason;
  }

  public void setIrRFLegalReason(String irRFLegalReason) {
    this.irRFLegalReason = irRFLegalReason;
  }

  public AgastWithholding inSSSubjectToDischarge(Boolean inSSSubjectToDischarge) {
    this.inSSSubjectToDischarge = inSSSubjectToDischarge;
    return this;
  }

   /**
   * Item subjecto to payroll discharge Item sujeto à desoneraçãode folha de pagamento 
   * @return inSSSubjectToDischarge
  **/
  @ApiModelProperty(example = "null", value = "Item subjecto to payroll discharge Item sujeto à desoneraçãode folha de pagamento ")
  public Boolean getInSSSubjectToDischarge() {
    return inSSSubjectToDischarge;
  }

  public void setInSSSubjectToDischarge(Boolean inSSSubjectToDischarge) {
    this.inSSSubjectToDischarge = inSSSubjectToDischarge;
  }

  public AgastWithholding INSS(Boolean INSS) {
    this.INSS = INSS;
    return this;
  }

   /**
   * Get INSS
   * @return INSS
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getINSS() {
    return INSS;
  }

  public void setINSS(Boolean INSS) {
    this.INSS = INSS;
  }

  public AgastWithholding inSSLegalReason(String inSSLegalReason) {
    this.inSSLegalReason = inSSLegalReason;
    return this;
  }

   /**
   * reference id to TaxLegalReason
   * @return inSSLegalReason
  **/
  @ApiModelProperty(example = "null", value = "reference id to TaxLegalReason")
  public String getInSSLegalReason() {
    return inSSLegalReason;
  }

  public void setInSSLegalReason(String inSSLegalReason) {
    this.inSSLegalReason = inSSLegalReason;
  }

  public AgastWithholding inSsForSimples(Boolean inSsForSimples) {
    this.inSsForSimples = inSsForSimples;
    return this;
  }

   /**
   * Get inSsForSimples
   * @return inSsForSimples
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getInSsForSimples() {
    return inSsForSimples;
  }

  public void setInSsForSimples(Boolean inSsForSimples) {
    this.inSsForSimples = inSsForSimples;
  }

  public AgastWithholding inSSForSimplesLegalReason(String inSSForSimplesLegalReason) {
    this.inSSForSimplesLegalReason = inSSForSimplesLegalReason;
    return this;
  }

   /**
   * reference id to TaxLegalReason
   * @return inSSForSimplesLegalReason
  **/
  @ApiModelProperty(example = "null", value = "reference id to TaxLegalReason")
  public String getInSSForSimplesLegalReason() {
    return inSSForSimplesLegalReason;
  }

  public void setInSSForSimplesLegalReason(String inSSForSimplesLegalReason) {
    this.inSSForSimplesLegalReason = inSSForSimplesLegalReason;
  }

  public AgastWithholding PIS(AgastWithholdingPIS PIS) {
    this.PIS = PIS;
    return this;
  }

   /**
   * Get PIS
   * @return PIS
  **/
  @ApiModelProperty(example = "null", value = "")
  public AgastWithholdingPIS getPIS() {
    return PIS;
  }

  public void setPIS(AgastWithholdingPIS PIS) {
    this.PIS = PIS;
  }

  public AgastWithholding COFINS(AgastWithholdingCOFINS COFINS) {
    this.COFINS = COFINS;
    return this;
  }

   /**
   * Get COFINS
   * @return COFINS
  **/
  @ApiModelProperty(example = "null", value = "")
  public AgastWithholdingCOFINS getCOFINS() {
    return COFINS;
  }

  public void setCOFINS(AgastWithholdingCOFINS COFINS) {
    this.COFINS = COFINS;
  }

  public AgastWithholding CSLL(AgastWithholdingCSLL CSLL) {
    this.CSLL = CSLL;
    return this;
  }

   /**
   * Get CSLL
   * @return CSLL
  **/
  @ApiModelProperty(example = "null", value = "")
  public AgastWithholdingCSLL getCSLL() {
    return CSLL;
  }

  public void setCSLL(AgastWithholdingCSLL CSLL) {
    this.CSLL = CSLL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgastWithholding agastWithholding = (AgastWithholding) o;
    return Objects.equals(this.IRRF, agastWithholding.IRRF) &&
        Objects.equals(this.irRFLegalReason, agastWithholding.irRFLegalReason) &&
        Objects.equals(this.inSSSubjectToDischarge, agastWithholding.inSSSubjectToDischarge) &&
        Objects.equals(this.INSS, agastWithholding.INSS) &&
        Objects.equals(this.inSSLegalReason, agastWithholding.inSSLegalReason) &&
        Objects.equals(this.inSsForSimples, agastWithholding.inSsForSimples) &&
        Objects.equals(this.inSSForSimplesLegalReason, agastWithholding.inSSForSimplesLegalReason) &&
        Objects.equals(this.PIS, agastWithholding.PIS) &&
        Objects.equals(this.COFINS, agastWithholding.COFINS) &&
        Objects.equals(this.CSLL, agastWithholding.CSLL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(IRRF, irRFLegalReason, inSSSubjectToDischarge, INSS, inSSLegalReason, inSsForSimples, inSSForSimplesLegalReason, PIS, COFINS, CSLL);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgastWithholding {\n");
    
    sb.append("    IRRF: ").append(toIndentedString(IRRF)).append("\n");
    sb.append("    irRFLegalReason: ").append(toIndentedString(irRFLegalReason)).append("\n");
    sb.append("    inSSSubjectToDischarge: ").append(toIndentedString(inSSSubjectToDischarge)).append("\n");
    sb.append("    INSS: ").append(toIndentedString(INSS)).append("\n");
    sb.append("    inSSLegalReason: ").append(toIndentedString(inSSLegalReason)).append("\n");
    sb.append("    inSsForSimples: ").append(toIndentedString(inSsForSimples)).append("\n");
    sb.append("    inSSForSimplesLegalReason: ").append(toIndentedString(inSSForSimplesLegalReason)).append("\n");
    sb.append("    PIS: ").append(toIndentedString(PIS)).append("\n");
    sb.append("    COFINS: ").append(toIndentedString(COFINS)).append("\n");
    sb.append("    CSLL: ").append(toIndentedString(CSLL)).append("\n");
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

