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

import io.swagger.client.model.Agast;
import io.swagger.client.model.AgastCodeType;
import io.swagger.client.model.AgastIcmsConf;
import io.swagger.client.model.AgastWithholding;
import io.swagger.client.model.TaxTypeRate;
import java.util.*;
import java.util.UUID;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CustomAgast {
  
  @SerializedName("code")
  private String code = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("hsCode")
  private String hsCode = null;
  @SerializedName("ex")
  private Integer ex = null;
  @SerializedName("cest")
  private String cest = null;
  @SerializedName("cean")
  private String cean = null;
  @SerializedName("codeType")
  private AgastCodeType codeType = null;
  public enum CstIPIEnum {
     T,  Z,  E,  N,  I, 
  };
  @SerializedName("cstIPI")
  private CstIPIEnum cstIPI = null;
  @SerializedName("ipiLegalTaxClass")
  private String ipiLegalTaxClass = null;
  public enum PisCofinsTaxReportingEnum {
     cumulative,  noCumulative, 
  };
  @SerializedName("pisCofinsTaxReporting")
  private PisCofinsTaxReportingEnum pisCofinsTaxReporting = null;
  public enum AccruablePISTaxationEnum {
     T,  Z,  E,  H,  N, 
  };
  @SerializedName("accruablePISTaxation")
  private AccruablePISTaxationEnum accruablePISTaxation = null;
  @SerializedName("pisExemptLegalReasonCode")
  private String pisExemptLegalReasonCode = null;
  @SerializedName("pisExemptLegalReason")
  private String pisExemptLegalReason = null;
  public enum AccruableCOFINSTaxationEnum {
     T,  Z,  E,  H,  N, 
  };
  @SerializedName("accruableCOFINSTaxation")
  private AccruableCOFINSTaxationEnum accruableCOFINSTaxation = null;
  @SerializedName("cofinsExemptLegalReasonCode")
  private String cofinsExemptLegalReasonCode = null;
  @SerializedName("cofinsExemptLegalReason")
  private String cofinsExemptLegalReason = null;
  public enum AccruableCSLLTaxationEnum {
     T,  E, 
  };
  @SerializedName("accruableCSLLTaxation")
  private AccruableCSLLTaxationEnum accruableCSLLTaxation = null;
  @SerializedName("csllExemptLegalReason")
  private String csllExemptLegalReason = null;
  @SerializedName("csllExemptLegalReasonCode")
  private String csllExemptLegalReasonCode = null;
  @SerializedName("withholding")
  private AgastWithholding withholding = null;
  @SerializedName("issDueatDestination")
  private Boolean issDueatDestination = null;
  @SerializedName("pisCofinsCreditNotAllowed")
  private Boolean pisCofinsCreditNotAllowed = null;
  public enum IssTaxationEnum {
     T,  E,  F,  A,  L,  I, 
  };
  @SerializedName("issTaxation")
  private IssTaxationEnum issTaxation = null;
  @SerializedName("federalTaxRate")
  private List<TaxTypeRate> federalTaxRate = null;
  public enum SpecialProductClassEnum {
     OTHERS,  COMMUNICATION,  ENERGY,  TRANSPORT,  FUEL AND LUBRIFICANT,  VEHICLE,  ALCOHOLIC BEVERAGES,  WEAPONS,  AMMO,  PERFUME,  TOBACCO, 
  };
  @SerializedName("specialProductClass")
  private SpecialProductClassEnum specialProductClass = null;
  @SerializedName("icmsConf")
  private List<AgastIcmsConf> icmsConf = null;
  @SerializedName("companyId")
  private UUID companyId = null;

  /**
   * Agast Code. AGAST (Avalara Goods and Services Types) are preset products with default tax definitions available to be used as provided or copied to create an specific comapany item.
   **/
  @ApiModelProperty(required = true, value = "Agast Code. AGAST (Avalara Goods and Services Types) are preset products with default tax definitions available to be used as provided or copied to create an specific comapany item.")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  /**
   * Agast Description
   **/
  @ApiModelProperty(value = "Agast Description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * harmonized code, NCM or LC 116
   **/
  @ApiModelProperty(value = "harmonized code, NCM or LC 116")
  public String getHsCode() {
    return hsCode;
  }
  public void setHsCode(String hsCode) {
    this.hsCode = hsCode;
  }

  /**
   * hsCode Exception for IPI tax
   **/
  @ApiModelProperty(value = "hsCode Exception for IPI tax")
  public Integer getEx() {
    return ex;
  }
  public void setEx(Integer ex) {
    this.ex = ex;
  }

  /**
   * tax substitution code - Codigo especificador da Substuicao Tributaria
   **/
  @ApiModelProperty(value = "tax substitution code - Codigo especificador da Substuicao Tributaria")
  public String getCest() {
    return cest;
  }
  public void setCest(String cest) {
    this.cest = cest;
  }

  /**
   * GTIN NUMBER
   **/
  @ApiModelProperty(value = "GTIN NUMBER")
  public String getCean() {
    return cean;
  }
  public void setCean(String cean) {
    this.cean = cean;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public AgastCodeType getCodeType() {
    return codeType;
  }
  public void setCodeType(AgastCodeType codeType) {
    this.codeType = codeType;
  }

  /**
   * Inform if this process is subject to IPI taxation on output process - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'N'  # NO TAXABLE     - 'I'  # IMMUNE 
   **/
  @ApiModelProperty(value = "Inform if this process is subject to IPI taxation on output process - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'N'  # NO TAXABLE     - 'I'  # IMMUNE ")
  public CstIPIEnum getCstIPI() {
    return cstIPI;
  }
  public void setCstIPI(CstIPIEnum cstIPI) {
    this.cstIPI = cstIPI;
  }

  /**
   * Legal tax classificação for IPI (enquadramento tributário) When the process has CST IPI 52 or 54, it is mandatory to inform a Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo=mCnJajU4BKU= 
   **/
  @ApiModelProperty(value = "Legal tax classificação for IPI (enquadramento tributário) When the process has CST IPI 52 or 54, it is mandatory to inform a Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo=mCnJajU4BKU= ")
  public String getIpiLegalTaxClass() {
    return ipiLegalTaxClass;
  }
  public void setIpiLegalTaxClass(String ipiLegalTaxClass) {
    this.ipiLegalTaxClass = ipiLegalTaxClass;
  }

  /**
   * when the company is Real Profit inform if this item is cumulative or no cumulative by default
   **/
  @ApiModelProperty(value = "when the company is Real Profit inform if this item is cumulative or no cumulative by default")
  public PisCofinsTaxReportingEnum getPisCofinsTaxReporting() {
    return pisCofinsTaxReporting;
  }
  public void setPisCofinsTaxReporting(PisCofinsTaxReportingEnum pisCofinsTaxReporting) {
    this.pisCofinsTaxReporting = pisCofinsTaxReporting;
  }

  /**
   * Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE 
   **/
  @ApiModelProperty(value = "Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE ")
  public AccruablePISTaxationEnum getAccruablePISTaxation() {
    return accruablePISTaxation;
  }
  public void setAccruablePISTaxation(AccruablePISTaxationEnum accruablePISTaxation) {
    this.accruablePISTaxation = accruablePISTaxation;
  }

  /**
   * When exempt, taxable with zero rate, suspended, not taxable, this field informs the official code number for the exemption
   **/
  @ApiModelProperty(value = "When exempt, taxable with zero rate, suspended, not taxable, this field informs the official code number for the exemption")
  public String getPisExemptLegalReasonCode() {
    return pisExemptLegalReasonCode;
  }
  public void setPisExemptLegalReasonCode(String pisExemptLegalReasonCode) {
    this.pisExemptLegalReasonCode = pisExemptLegalReasonCode;
  }

  /**
   * When specified a reason, this field holds the reason's description
   **/
  @ApiModelProperty(value = "When specified a reason, this field holds the reason's description")
  public String getPisExemptLegalReason() {
    return pisExemptLegalReason;
  }
  public void setPisExemptLegalReason(String pisExemptLegalReason) {
    this.pisExemptLegalReason = pisExemptLegalReason;
  }

  /**
   * Inform if this item by nature is subject to COFINS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE 
   **/
  @ApiModelProperty(value = "Inform if this item by nature is subject to COFINS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE ")
  public AccruableCOFINSTaxationEnum getAccruableCOFINSTaxation() {
    return accruableCOFINSTaxation;
  }
  public void setAccruableCOFINSTaxation(AccruableCOFINSTaxationEnum accruableCOFINSTaxation) {
    this.accruableCOFINSTaxation = accruableCOFINSTaxation;
  }

  /**
   * When exempt, taxable with zero rate, suspended, not taxable, this field informs the official code number for the exemption
   **/
  @ApiModelProperty(value = "When exempt, taxable with zero rate, suspended, not taxable, this field informs the official code number for the exemption")
  public String getCofinsExemptLegalReasonCode() {
    return cofinsExemptLegalReasonCode;
  }
  public void setCofinsExemptLegalReasonCode(String cofinsExemptLegalReasonCode) {
    this.cofinsExemptLegalReasonCode = cofinsExemptLegalReasonCode;
  }

  /**
   * When specified a reason, this field holds the reason's description
   **/
  @ApiModelProperty(value = "When specified a reason, this field holds the reason's description")
  public String getCofinsExemptLegalReason() {
    return cofinsExemptLegalReason;
  }
  public void setCofinsExemptLegalReason(String cofinsExemptLegalReason) {
    this.cofinsExemptLegalReason = cofinsExemptLegalReason;
  }

  /**
   * Inform if this item by nature is subject to CSLL taxation or exempt - 'T' # TAXABLE - 'E' # EXEMPT 
   **/
  @ApiModelProperty(value = "Inform if this item by nature is subject to CSLL taxation or exempt - 'T' # TAXABLE - 'E' # EXEMPT ")
  public AccruableCSLLTaxationEnum getAccruableCSLLTaxation() {
    return accruableCSLLTaxation;
  }
  public void setAccruableCSLLTaxation(AccruableCSLLTaxationEnum accruableCSLLTaxation) {
    this.accruableCSLLTaxation = accruableCSLLTaxation;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCsllExemptLegalReason() {
    return csllExemptLegalReason;
  }
  public void setCsllExemptLegalReason(String csllExemptLegalReason) {
    this.csllExemptLegalReason = csllExemptLegalReason;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCsllExemptLegalReasonCode() {
    return csllExemptLegalReasonCode;
  }
  public void setCsllExemptLegalReasonCode(String csllExemptLegalReasonCode) {
    this.csllExemptLegalReasonCode = csllExemptLegalReasonCode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public AgastWithholding getWithholding() {
    return withholding;
  }
  public void setWithholding(AgastWithholding withholding) {
    this.withholding = withholding;
  }

  /**
   * for service items with City Jurisdiction, inform where the ISS tax is due
   **/
  @ApiModelProperty(value = "for service items with City Jurisdiction, inform where the ISS tax is due")
  public Boolean getIssDueatDestination() {
    return issDueatDestination;
  }
  public void setIssDueatDestination(Boolean issDueatDestination) {
    this.issDueatDestination = issDueatDestination;
  }

  /**
   * on Real Profit Purchase transaction, inform if this item allows tax credits when it is non-cumulative
   **/
  @ApiModelProperty(value = "on Real Profit Purchase transaction, inform if this item allows tax credits when it is non-cumulative")
  public Boolean getPisCofinsCreditNotAllowed() {
    return pisCofinsCreditNotAllowed;
  }
  public void setPisCofinsCreditNotAllowed(Boolean pisCofinsCreditNotAllowed) {
    this.pisCofinsCreditNotAllowed = pisCofinsCreditNotAllowed;
  }

  /**
   * - 'T' # TAXABLE - TRIBUTÁVEL INCLUSIVE PARA EXPORTAÇÃO' - 'E' # TAXABLE WITH EXEMPTION FOR EXPORTS - ISENTO PARA SERVIÇOS PRESTADOS AO EXTERIOR (DEFAULT) - 'F' # EXEMPT - 'A' # SUSPENDED FOR ADMINISTRATIVE REASON - 'L' # SUSPENDED FOR LEGAL DECISION - 'I' # IMMUNE 
   **/
  @ApiModelProperty(value = "- 'T' # TAXABLE - TRIBUTÁVEL INCLUSIVE PARA EXPORTAÇÃO' - 'E' # TAXABLE WITH EXEMPTION FOR EXPORTS - ISENTO PARA SERVIÇOS PRESTADOS AO EXTERIOR (DEFAULT) - 'F' # EXEMPT - 'A' # SUSPENDED FOR ADMINISTRATIVE REASON - 'L' # SUSPENDED FOR LEGAL DECISION - 'I' # IMMUNE ")
  public IssTaxationEnum getIssTaxation() {
    return issTaxation;
  }
  public void setIssTaxation(IssTaxationEnum issTaxation) {
    this.issTaxation = issTaxation;
  }

  /**
   * This is an array of tax object related to an agast.
   **/
  @ApiModelProperty(value = "This is an array of tax object related to an agast.")
  public List<TaxTypeRate> getFederalTaxRate() {
    return federalTaxRate;
  }
  public void setFederalTaxRate(List<TaxTypeRate> federalTaxRate) {
    this.federalTaxRate = federalTaxRate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public SpecialProductClassEnum getSpecialProductClass() {
    return specialProductClass;
  }
  public void setSpecialProductClass(SpecialProductClassEnum specialProductClass) {
    this.specialProductClass = specialProductClass;
  }

  /**
   * One per State
   **/
  @ApiModelProperty(value = "One per State")
  public List<AgastIcmsConf> getIcmsConf() {
    return icmsConf;
  }
  public void setIcmsConf(List<AgastIcmsConf> icmsConf) {
    this.icmsConf = icmsConf;
  }

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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomAgast customAgast = (CustomAgast) o;
    return (this.code == null ? customAgast.code == null : this.code.equals(customAgast.code)) &&
        (this.description == null ? customAgast.description == null : this.description.equals(customAgast.description)) &&
        (this.hsCode == null ? customAgast.hsCode == null : this.hsCode.equals(customAgast.hsCode)) &&
        (this.ex == null ? customAgast.ex == null : this.ex.equals(customAgast.ex)) &&
        (this.cest == null ? customAgast.cest == null : this.cest.equals(customAgast.cest)) &&
        (this.cean == null ? customAgast.cean == null : this.cean.equals(customAgast.cean)) &&
        (this.codeType == null ? customAgast.codeType == null : this.codeType.equals(customAgast.codeType)) &&
        (this.cstIPI == null ? customAgast.cstIPI == null : this.cstIPI.equals(customAgast.cstIPI)) &&
        (this.ipiLegalTaxClass == null ? customAgast.ipiLegalTaxClass == null : this.ipiLegalTaxClass.equals(customAgast.ipiLegalTaxClass)) &&
        (this.pisCofinsTaxReporting == null ? customAgast.pisCofinsTaxReporting == null : this.pisCofinsTaxReporting.equals(customAgast.pisCofinsTaxReporting)) &&
        (this.accruablePISTaxation == null ? customAgast.accruablePISTaxation == null : this.accruablePISTaxation.equals(customAgast.accruablePISTaxation)) &&
        (this.pisExemptLegalReasonCode == null ? customAgast.pisExemptLegalReasonCode == null : this.pisExemptLegalReasonCode.equals(customAgast.pisExemptLegalReasonCode)) &&
        (this.pisExemptLegalReason == null ? customAgast.pisExemptLegalReason == null : this.pisExemptLegalReason.equals(customAgast.pisExemptLegalReason)) &&
        (this.accruableCOFINSTaxation == null ? customAgast.accruableCOFINSTaxation == null : this.accruableCOFINSTaxation.equals(customAgast.accruableCOFINSTaxation)) &&
        (this.cofinsExemptLegalReasonCode == null ? customAgast.cofinsExemptLegalReasonCode == null : this.cofinsExemptLegalReasonCode.equals(customAgast.cofinsExemptLegalReasonCode)) &&
        (this.cofinsExemptLegalReason == null ? customAgast.cofinsExemptLegalReason == null : this.cofinsExemptLegalReason.equals(customAgast.cofinsExemptLegalReason)) &&
        (this.accruableCSLLTaxation == null ? customAgast.accruableCSLLTaxation == null : this.accruableCSLLTaxation.equals(customAgast.accruableCSLLTaxation)) &&
        (this.csllExemptLegalReason == null ? customAgast.csllExemptLegalReason == null : this.csllExemptLegalReason.equals(customAgast.csllExemptLegalReason)) &&
        (this.csllExemptLegalReasonCode == null ? customAgast.csllExemptLegalReasonCode == null : this.csllExemptLegalReasonCode.equals(customAgast.csllExemptLegalReasonCode)) &&
        (this.withholding == null ? customAgast.withholding == null : this.withholding.equals(customAgast.withholding)) &&
        (this.issDueatDestination == null ? customAgast.issDueatDestination == null : this.issDueatDestination.equals(customAgast.issDueatDestination)) &&
        (this.pisCofinsCreditNotAllowed == null ? customAgast.pisCofinsCreditNotAllowed == null : this.pisCofinsCreditNotAllowed.equals(customAgast.pisCofinsCreditNotAllowed)) &&
        (this.issTaxation == null ? customAgast.issTaxation == null : this.issTaxation.equals(customAgast.issTaxation)) &&
        (this.federalTaxRate == null ? customAgast.federalTaxRate == null : this.federalTaxRate.equals(customAgast.federalTaxRate)) &&
        (this.specialProductClass == null ? customAgast.specialProductClass == null : this.specialProductClass.equals(customAgast.specialProductClass)) &&
        (this.icmsConf == null ? customAgast.icmsConf == null : this.icmsConf.equals(customAgast.icmsConf)) &&
        (this.companyId == null ? customAgast.companyId == null : this.companyId.equals(customAgast.companyId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.code == null ? 0: this.code.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.hsCode == null ? 0: this.hsCode.hashCode());
    result = 31 * result + (this.ex == null ? 0: this.ex.hashCode());
    result = 31 * result + (this.cest == null ? 0: this.cest.hashCode());
    result = 31 * result + (this.cean == null ? 0: this.cean.hashCode());
    result = 31 * result + (this.codeType == null ? 0: this.codeType.hashCode());
    result = 31 * result + (this.cstIPI == null ? 0: this.cstIPI.hashCode());
    result = 31 * result + (this.ipiLegalTaxClass == null ? 0: this.ipiLegalTaxClass.hashCode());
    result = 31 * result + (this.pisCofinsTaxReporting == null ? 0: this.pisCofinsTaxReporting.hashCode());
    result = 31 * result + (this.accruablePISTaxation == null ? 0: this.accruablePISTaxation.hashCode());
    result = 31 * result + (this.pisExemptLegalReasonCode == null ? 0: this.pisExemptLegalReasonCode.hashCode());
    result = 31 * result + (this.pisExemptLegalReason == null ? 0: this.pisExemptLegalReason.hashCode());
    result = 31 * result + (this.accruableCOFINSTaxation == null ? 0: this.accruableCOFINSTaxation.hashCode());
    result = 31 * result + (this.cofinsExemptLegalReasonCode == null ? 0: this.cofinsExemptLegalReasonCode.hashCode());
    result = 31 * result + (this.cofinsExemptLegalReason == null ? 0: this.cofinsExemptLegalReason.hashCode());
    result = 31 * result + (this.accruableCSLLTaxation == null ? 0: this.accruableCSLLTaxation.hashCode());
    result = 31 * result + (this.csllExemptLegalReason == null ? 0: this.csllExemptLegalReason.hashCode());
    result = 31 * result + (this.csllExemptLegalReasonCode == null ? 0: this.csllExemptLegalReasonCode.hashCode());
    result = 31 * result + (this.withholding == null ? 0: this.withholding.hashCode());
    result = 31 * result + (this.issDueatDestination == null ? 0: this.issDueatDestination.hashCode());
    result = 31 * result + (this.pisCofinsCreditNotAllowed == null ? 0: this.pisCofinsCreditNotAllowed.hashCode());
    result = 31 * result + (this.issTaxation == null ? 0: this.issTaxation.hashCode());
    result = 31 * result + (this.federalTaxRate == null ? 0: this.federalTaxRate.hashCode());
    result = 31 * result + (this.specialProductClass == null ? 0: this.specialProductClass.hashCode());
    result = 31 * result + (this.icmsConf == null ? 0: this.icmsConf.hashCode());
    result = 31 * result + (this.companyId == null ? 0: this.companyId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomAgast {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  hsCode: ").append(hsCode).append("\n");
    sb.append("  ex: ").append(ex).append("\n");
    sb.append("  cest: ").append(cest).append("\n");
    sb.append("  cean: ").append(cean).append("\n");
    sb.append("  codeType: ").append(codeType).append("\n");
    sb.append("  cstIPI: ").append(cstIPI).append("\n");
    sb.append("  ipiLegalTaxClass: ").append(ipiLegalTaxClass).append("\n");
    sb.append("  pisCofinsTaxReporting: ").append(pisCofinsTaxReporting).append("\n");
    sb.append("  accruablePISTaxation: ").append(accruablePISTaxation).append("\n");
    sb.append("  pisExemptLegalReasonCode: ").append(pisExemptLegalReasonCode).append("\n");
    sb.append("  pisExemptLegalReason: ").append(pisExemptLegalReason).append("\n");
    sb.append("  accruableCOFINSTaxation: ").append(accruableCOFINSTaxation).append("\n");
    sb.append("  cofinsExemptLegalReasonCode: ").append(cofinsExemptLegalReasonCode).append("\n");
    sb.append("  cofinsExemptLegalReason: ").append(cofinsExemptLegalReason).append("\n");
    sb.append("  accruableCSLLTaxation: ").append(accruableCSLLTaxation).append("\n");
    sb.append("  csllExemptLegalReason: ").append(csllExemptLegalReason).append("\n");
    sb.append("  csllExemptLegalReasonCode: ").append(csllExemptLegalReasonCode).append("\n");
    sb.append("  withholding: ").append(withholding).append("\n");
    sb.append("  issDueatDestination: ").append(issDueatDestination).append("\n");
    sb.append("  pisCofinsCreditNotAllowed: ").append(pisCofinsCreditNotAllowed).append("\n");
    sb.append("  issTaxation: ").append(issTaxation).append("\n");
    sb.append("  federalTaxRate: ").append(federalTaxRate).append("\n");
    sb.append("  specialProductClass: ").append(specialProductClass).append("\n");
    sb.append("  icmsConf: ").append(icmsConf).append("\n");
    sb.append("  companyId: ").append(companyId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
