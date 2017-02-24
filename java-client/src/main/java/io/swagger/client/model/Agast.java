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
import io.swagger.client.model.AgastCodeType;
import io.swagger.client.model.AgastIcmsConf;
import io.swagger.client.model.AgastWithholding;
import io.swagger.client.model.TaxTypeRate;
import java.util.ArrayList;
import java.util.List;

/**
 * Agast
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-24T19:47:57.099Z")
public class Agast {
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

  /**
   * Inform if this process is subject to IPI taxation on output process - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'N'  # NO TAXABLE     - 'I'  # IMMUNE 
   */
  public enum CstIPIEnum {
    @SerializedName("T")
    T("T"),
    
    @SerializedName("Z")
    Z("Z"),
    
    @SerializedName("E")
    E("E"),
    
    @SerializedName("N")
    N("N"),
    
    @SerializedName("I")
    I("I");

    private String value;

    CstIPIEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("cstIPI")
  private CstIPIEnum cstIPI = null;

  @SerializedName("ipiLegalTaxClass")
  private String ipiLegalTaxClass = null;

  /**
   * when the company is Real Profit inform if this item is cumulative or no cumulative by default
   */
  public enum PisCofinsTaxReportingEnum {
    @SerializedName("cumulative")
    CUMULATIVE("cumulative"),
    
    @SerializedName("noCumulative")
    NOCUMULATIVE("noCumulative");

    private String value;

    PisCofinsTaxReportingEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("pisCofinsTaxReporting")
  private PisCofinsTaxReportingEnum pisCofinsTaxReporting = null;

  /**
   * Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE 
   */
  public enum AccruablePISTaxationEnum {
    @SerializedName("T")
    T("T"),
    
    @SerializedName("Z")
    Z("Z"),
    
    @SerializedName("E")
    E("E"),
    
    @SerializedName("H")
    H("H"),
    
    @SerializedName("N")
    N("N");

    private String value;

    AccruablePISTaxationEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("accruablePISTaxation")
  private AccruablePISTaxationEnum accruablePISTaxation = null;

  @SerializedName("pisExemptLegalReasonCode")
  private String pisExemptLegalReasonCode = null;

  @SerializedName("pisExemptLegalReason")
  private String pisExemptLegalReason = null;

  /**
   * Inform if this item by nature is subject to COFINS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE 
   */
  public enum AccruableCOFINSTaxationEnum {
    @SerializedName("T")
    T("T"),
    
    @SerializedName("Z")
    Z("Z"),
    
    @SerializedName("E")
    E("E"),
    
    @SerializedName("H")
    H("H"),
    
    @SerializedName("N")
    N("N");

    private String value;

    AccruableCOFINSTaxationEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("accruableCOFINSTaxation")
  private AccruableCOFINSTaxationEnum accruableCOFINSTaxation = null;

  @SerializedName("cofinsExemptLegalReasonCode")
  private String cofinsExemptLegalReasonCode = null;

  @SerializedName("cofinsExemptLegalReason")
  private String cofinsExemptLegalReason = null;

  /**
   * Inform if this item by nature is subject to CSLL taxation or exempt - 'T' # TAXABLE - 'E' # EXEMPT 
   */
  public enum AccruableCSLLTaxationEnum {
    @SerializedName("T")
    T("T"),
    
    @SerializedName("E")
    E("E");

    private String value;

    AccruableCSLLTaxationEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

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

  /**
   * - 'T' # TAXABLE - TRIBUTÁVEL INCLUSIVE PARA EXPORTAÇÃO' - 'E' # TAXABLE WITH EXEMPTION FOR EXPORTS - ISENTO PARA SERVIÇOS PRESTADOS AO EXTERIOR (DEFAULT) - 'F' # EXEMPT - 'A' # SUSPENDED FOR ADMINISTRATIVE REASON - 'L' # SUSPENDED FOR LEGAL DECISION - 'I' # IMMUNE 
   */
  public enum IssTaxationEnum {
    @SerializedName("T")
    T("T"),
    
    @SerializedName("E")
    E("E"),
    
    @SerializedName("F")
    F("F"),
    
    @SerializedName("A")
    A("A"),
    
    @SerializedName("L")
    L("L"),
    
    @SerializedName("I")
    I("I");

    private String value;

    IssTaxationEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("issTaxation")
  private IssTaxationEnum issTaxation = null;

  @SerializedName("federalTaxRate")
  private List<TaxTypeRate> federalTaxRate = new ArrayList<TaxTypeRate>();

  /**
   * Gets or Sets specialProductClass
   */
  public enum SpecialProductClassEnum {
    @SerializedName("OTHERS")
    OTHERS("OTHERS"),
    
    @SerializedName("COMMUNICATION")
    COMMUNICATION("COMMUNICATION"),
    
    @SerializedName("ENERGY")
    ENERGY("ENERGY"),
    
    @SerializedName("TRANSPORT")
    TRANSPORT("TRANSPORT"),
    
    @SerializedName("FUEL AND LUBRIFICANT")
    FUEL_AND_LUBRIFICANT("FUEL AND LUBRIFICANT"),
    
    @SerializedName("VEHICLE")
    VEHICLE("VEHICLE"),
    
    @SerializedName("ALCOHOLIC BEVERAGES")
    ALCOHOLIC_BEVERAGES("ALCOHOLIC BEVERAGES"),
    
    @SerializedName("WEAPONS")
    WEAPONS("WEAPONS"),
    
    @SerializedName("AMMO")
    AMMO("AMMO"),
    
    @SerializedName("PERFUME")
    PERFUME("PERFUME"),
    
    @SerializedName("TOBACCO")
    TOBACCO("TOBACCO");

    private String value;

    SpecialProductClassEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("specialProductClass")
  private SpecialProductClassEnum specialProductClass = null;

  @SerializedName("icmsConf")
  private List<AgastIcmsConf> icmsConf = new ArrayList<AgastIcmsConf>();

  public Agast code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Agast Code. AGAST (Avalara Goods and Services Types) are preset products with default tax definitions available to be used as provided or copied to create an specific comapany item.
   * @return code
  **/
  @ApiModelProperty(example = "null", required = true, value = "Agast Code. AGAST (Avalara Goods and Services Types) are preset products with default tax definitions available to be used as provided or copied to create an specific comapany item.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Agast description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Agast Description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "Agast Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Agast hsCode(String hsCode) {
    this.hsCode = hsCode;
    return this;
  }

   /**
   * harmonized code, NCM or LC 116
   * @return hsCode
  **/
  @ApiModelProperty(example = "null", value = "harmonized code, NCM or LC 116")
  public String getHsCode() {
    return hsCode;
  }

  public void setHsCode(String hsCode) {
    this.hsCode = hsCode;
  }

  public Agast ex(Integer ex) {
    this.ex = ex;
    return this;
  }

   /**
   * hsCode Exception for IPI tax
   * @return ex
  **/
  @ApiModelProperty(example = "null", value = "hsCode Exception for IPI tax")
  public Integer getEx() {
    return ex;
  }

  public void setEx(Integer ex) {
    this.ex = ex;
  }

  public Agast cest(String cest) {
    this.cest = cest;
    return this;
  }

   /**
   * tax substitution code - Codigo especificador da Substuicao Tributaria
   * @return cest
  **/
  @ApiModelProperty(example = "null", value = "tax substitution code - Codigo especificador da Substuicao Tributaria")
  public String getCest() {
    return cest;
  }

  public void setCest(String cest) {
    this.cest = cest;
  }

  public Agast cean(String cean) {
    this.cean = cean;
    return this;
  }

   /**
   * GTIN NUMBER
   * @return cean
  **/
  @ApiModelProperty(example = "null", value = "GTIN NUMBER")
  public String getCean() {
    return cean;
  }

  public void setCean(String cean) {
    this.cean = cean;
  }

  public Agast codeType(AgastCodeType codeType) {
    this.codeType = codeType;
    return this;
  }

   /**
   * Get codeType
   * @return codeType
  **/
  @ApiModelProperty(example = "null", value = "")
  public AgastCodeType getCodeType() {
    return codeType;
  }

  public void setCodeType(AgastCodeType codeType) {
    this.codeType = codeType;
  }

  public Agast cstIPI(CstIPIEnum cstIPI) {
    this.cstIPI = cstIPI;
    return this;
  }

   /**
   * Inform if this process is subject to IPI taxation on output process - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'N'  # NO TAXABLE     - 'I'  # IMMUNE 
   * @return cstIPI
  **/
  @ApiModelProperty(example = "null", value = "Inform if this process is subject to IPI taxation on output process - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'N'  # NO TAXABLE     - 'I'  # IMMUNE ")
  public CstIPIEnum getCstIPI() {
    return cstIPI;
  }

  public void setCstIPI(CstIPIEnum cstIPI) {
    this.cstIPI = cstIPI;
  }

  public Agast ipiLegalTaxClass(String ipiLegalTaxClass) {
    this.ipiLegalTaxClass = ipiLegalTaxClass;
    return this;
  }

   /**
   * Legal tax classificação for IPI (enquadramento tributário) When the process has CST IPI 52 or 54, it is mandatory to inform a Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo=mCnJajU4BKU= 
   * @return ipiLegalTaxClass
  **/
  @ApiModelProperty(example = "null", value = "Legal tax classificação for IPI (enquadramento tributário) When the process has CST IPI 52 or 54, it is mandatory to inform a Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo=mCnJajU4BKU= ")
  public String getIpiLegalTaxClass() {
    return ipiLegalTaxClass;
  }

  public void setIpiLegalTaxClass(String ipiLegalTaxClass) {
    this.ipiLegalTaxClass = ipiLegalTaxClass;
  }

  public Agast pisCofinsTaxReporting(PisCofinsTaxReportingEnum pisCofinsTaxReporting) {
    this.pisCofinsTaxReporting = pisCofinsTaxReporting;
    return this;
  }

   /**
   * when the company is Real Profit inform if this item is cumulative or no cumulative by default
   * @return pisCofinsTaxReporting
  **/
  @ApiModelProperty(example = "null", value = "when the company is Real Profit inform if this item is cumulative or no cumulative by default")
  public PisCofinsTaxReportingEnum getPisCofinsTaxReporting() {
    return pisCofinsTaxReporting;
  }

  public void setPisCofinsTaxReporting(PisCofinsTaxReportingEnum pisCofinsTaxReporting) {
    this.pisCofinsTaxReporting = pisCofinsTaxReporting;
  }

  public Agast accruablePISTaxation(AccruablePISTaxationEnum accruablePISTaxation) {
    this.accruablePISTaxation = accruablePISTaxation;
    return this;
  }

   /**
   * Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE 
   * @return accruablePISTaxation
  **/
  @ApiModelProperty(example = "null", value = "Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE ")
  public AccruablePISTaxationEnum getAccruablePISTaxation() {
    return accruablePISTaxation;
  }

  public void setAccruablePISTaxation(AccruablePISTaxationEnum accruablePISTaxation) {
    this.accruablePISTaxation = accruablePISTaxation;
  }

  public Agast pisExemptLegalReasonCode(String pisExemptLegalReasonCode) {
    this.pisExemptLegalReasonCode = pisExemptLegalReasonCode;
    return this;
  }

   /**
   * When exempt, taxable with zero rate, suspended, not taxable, this field informs the official code number for the exemption
   * @return pisExemptLegalReasonCode
  **/
  @ApiModelProperty(example = "null", value = "When exempt, taxable with zero rate, suspended, not taxable, this field informs the official code number for the exemption")
  public String getPisExemptLegalReasonCode() {
    return pisExemptLegalReasonCode;
  }

  public void setPisExemptLegalReasonCode(String pisExemptLegalReasonCode) {
    this.pisExemptLegalReasonCode = pisExemptLegalReasonCode;
  }

  public Agast pisExemptLegalReason(String pisExemptLegalReason) {
    this.pisExemptLegalReason = pisExemptLegalReason;
    return this;
  }

   /**
   * When specified a reason, this field holds the reason's description
   * @return pisExemptLegalReason
  **/
  @ApiModelProperty(example = "null", value = "When specified a reason, this field holds the reason's description")
  public String getPisExemptLegalReason() {
    return pisExemptLegalReason;
  }

  public void setPisExemptLegalReason(String pisExemptLegalReason) {
    this.pisExemptLegalReason = pisExemptLegalReason;
  }

  public Agast accruableCOFINSTaxation(AccruableCOFINSTaxationEnum accruableCOFINSTaxation) {
    this.accruableCOFINSTaxation = accruableCOFINSTaxation;
    return this;
  }

   /**
   * Inform if this item by nature is subject to COFINS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE 
   * @return accruableCOFINSTaxation
  **/
  @ApiModelProperty(example = "null", value = "Inform if this item by nature is subject to COFINS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE ")
  public AccruableCOFINSTaxationEnum getAccruableCOFINSTaxation() {
    return accruableCOFINSTaxation;
  }

  public void setAccruableCOFINSTaxation(AccruableCOFINSTaxationEnum accruableCOFINSTaxation) {
    this.accruableCOFINSTaxation = accruableCOFINSTaxation;
  }

  public Agast cofinsExemptLegalReasonCode(String cofinsExemptLegalReasonCode) {
    this.cofinsExemptLegalReasonCode = cofinsExemptLegalReasonCode;
    return this;
  }

   /**
   * When exempt, taxable with zero rate, suspended, not taxable, this field informs the official code number for the exemption
   * @return cofinsExemptLegalReasonCode
  **/
  @ApiModelProperty(example = "null", value = "When exempt, taxable with zero rate, suspended, not taxable, this field informs the official code number for the exemption")
  public String getCofinsExemptLegalReasonCode() {
    return cofinsExemptLegalReasonCode;
  }

  public void setCofinsExemptLegalReasonCode(String cofinsExemptLegalReasonCode) {
    this.cofinsExemptLegalReasonCode = cofinsExemptLegalReasonCode;
  }

  public Agast cofinsExemptLegalReason(String cofinsExemptLegalReason) {
    this.cofinsExemptLegalReason = cofinsExemptLegalReason;
    return this;
  }

   /**
   * When specified a reason, this field holds the reason's description
   * @return cofinsExemptLegalReason
  **/
  @ApiModelProperty(example = "null", value = "When specified a reason, this field holds the reason's description")
  public String getCofinsExemptLegalReason() {
    return cofinsExemptLegalReason;
  }

  public void setCofinsExemptLegalReason(String cofinsExemptLegalReason) {
    this.cofinsExemptLegalReason = cofinsExemptLegalReason;
  }

  public Agast accruableCSLLTaxation(AccruableCSLLTaxationEnum accruableCSLLTaxation) {
    this.accruableCSLLTaxation = accruableCSLLTaxation;
    return this;
  }

   /**
   * Inform if this item by nature is subject to CSLL taxation or exempt - 'T' # TAXABLE - 'E' # EXEMPT 
   * @return accruableCSLLTaxation
  **/
  @ApiModelProperty(example = "null", value = "Inform if this item by nature is subject to CSLL taxation or exempt - 'T' # TAXABLE - 'E' # EXEMPT ")
  public AccruableCSLLTaxationEnum getAccruableCSLLTaxation() {
    return accruableCSLLTaxation;
  }

  public void setAccruableCSLLTaxation(AccruableCSLLTaxationEnum accruableCSLLTaxation) {
    this.accruableCSLLTaxation = accruableCSLLTaxation;
  }

  public Agast csllExemptLegalReason(String csllExemptLegalReason) {
    this.csllExemptLegalReason = csllExemptLegalReason;
    return this;
  }

   /**
   * Get csllExemptLegalReason
   * @return csllExemptLegalReason
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCsllExemptLegalReason() {
    return csllExemptLegalReason;
  }

  public void setCsllExemptLegalReason(String csllExemptLegalReason) {
    this.csllExemptLegalReason = csllExemptLegalReason;
  }

  public Agast csllExemptLegalReasonCode(String csllExemptLegalReasonCode) {
    this.csllExemptLegalReasonCode = csllExemptLegalReasonCode;
    return this;
  }

   /**
   * Get csllExemptLegalReasonCode
   * @return csllExemptLegalReasonCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCsllExemptLegalReasonCode() {
    return csllExemptLegalReasonCode;
  }

  public void setCsllExemptLegalReasonCode(String csllExemptLegalReasonCode) {
    this.csllExemptLegalReasonCode = csllExemptLegalReasonCode;
  }

  public Agast withholding(AgastWithholding withholding) {
    this.withholding = withholding;
    return this;
  }

   /**
   * Get withholding
   * @return withholding
  **/
  @ApiModelProperty(example = "null", value = "")
  public AgastWithholding getWithholding() {
    return withholding;
  }

  public void setWithholding(AgastWithholding withholding) {
    this.withholding = withholding;
  }

  public Agast issDueatDestination(Boolean issDueatDestination) {
    this.issDueatDestination = issDueatDestination;
    return this;
  }

   /**
   * for service items with City Jurisdiction, inform where the ISS tax is due
   * @return issDueatDestination
  **/
  @ApiModelProperty(example = "null", value = "for service items with City Jurisdiction, inform where the ISS tax is due")
  public Boolean getIssDueatDestination() {
    return issDueatDestination;
  }

  public void setIssDueatDestination(Boolean issDueatDestination) {
    this.issDueatDestination = issDueatDestination;
  }

  public Agast pisCofinsCreditNotAllowed(Boolean pisCofinsCreditNotAllowed) {
    this.pisCofinsCreditNotAllowed = pisCofinsCreditNotAllowed;
    return this;
  }

   /**
   * on Real Profit Purchase transaction, inform if this item allows tax credits when it is non-cumulative
   * @return pisCofinsCreditNotAllowed
  **/
  @ApiModelProperty(example = "null", value = "on Real Profit Purchase transaction, inform if this item allows tax credits when it is non-cumulative")
  public Boolean getPisCofinsCreditNotAllowed() {
    return pisCofinsCreditNotAllowed;
  }

  public void setPisCofinsCreditNotAllowed(Boolean pisCofinsCreditNotAllowed) {
    this.pisCofinsCreditNotAllowed = pisCofinsCreditNotAllowed;
  }

  public Agast issTaxation(IssTaxationEnum issTaxation) {
    this.issTaxation = issTaxation;
    return this;
  }

   /**
   * - 'T' # TAXABLE - TRIBUTÁVEL INCLUSIVE PARA EXPORTAÇÃO' - 'E' # TAXABLE WITH EXEMPTION FOR EXPORTS - ISENTO PARA SERVIÇOS PRESTADOS AO EXTERIOR (DEFAULT) - 'F' # EXEMPT - 'A' # SUSPENDED FOR ADMINISTRATIVE REASON - 'L' # SUSPENDED FOR LEGAL DECISION - 'I' # IMMUNE 
   * @return issTaxation
  **/
  @ApiModelProperty(example = "null", value = "- 'T' # TAXABLE - TRIBUTÁVEL INCLUSIVE PARA EXPORTAÇÃO' - 'E' # TAXABLE WITH EXEMPTION FOR EXPORTS - ISENTO PARA SERVIÇOS PRESTADOS AO EXTERIOR (DEFAULT) - 'F' # EXEMPT - 'A' # SUSPENDED FOR ADMINISTRATIVE REASON - 'L' # SUSPENDED FOR LEGAL DECISION - 'I' # IMMUNE ")
  public IssTaxationEnum getIssTaxation() {
    return issTaxation;
  }

  public void setIssTaxation(IssTaxationEnum issTaxation) {
    this.issTaxation = issTaxation;
  }

  public Agast federalTaxRate(List<TaxTypeRate> federalTaxRate) {
    this.federalTaxRate = federalTaxRate;
    return this;
  }

  public Agast addFederalTaxRateItem(TaxTypeRate federalTaxRateItem) {
    this.federalTaxRate.add(federalTaxRateItem);
    return this;
  }

   /**
   * This is an array of tax object related to an agast.
   * @return federalTaxRate
  **/
  @ApiModelProperty(example = "null", value = "This is an array of tax object related to an agast.")
  public List<TaxTypeRate> getFederalTaxRate() {
    return federalTaxRate;
  }

  public void setFederalTaxRate(List<TaxTypeRate> federalTaxRate) {
    this.federalTaxRate = federalTaxRate;
  }

  public Agast specialProductClass(SpecialProductClassEnum specialProductClass) {
    this.specialProductClass = specialProductClass;
    return this;
  }

   /**
   * Get specialProductClass
   * @return specialProductClass
  **/
  @ApiModelProperty(example = "null", value = "")
  public SpecialProductClassEnum getSpecialProductClass() {
    return specialProductClass;
  }

  public void setSpecialProductClass(SpecialProductClassEnum specialProductClass) {
    this.specialProductClass = specialProductClass;
  }

  public Agast icmsConf(List<AgastIcmsConf> icmsConf) {
    this.icmsConf = icmsConf;
    return this;
  }

  public Agast addIcmsConfItem(AgastIcmsConf icmsConfItem) {
    this.icmsConf.add(icmsConfItem);
    return this;
  }

   /**
   * One per State
   * @return icmsConf
  **/
  @ApiModelProperty(example = "null", value = "One per State")
  public List<AgastIcmsConf> getIcmsConf() {
    return icmsConf;
  }

  public void setIcmsConf(List<AgastIcmsConf> icmsConf) {
    this.icmsConf = icmsConf;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Agast agast = (Agast) o;
    return Objects.equals(this.code, agast.code) &&
        Objects.equals(this.description, agast.description) &&
        Objects.equals(this.hsCode, agast.hsCode) &&
        Objects.equals(this.ex, agast.ex) &&
        Objects.equals(this.cest, agast.cest) &&
        Objects.equals(this.cean, agast.cean) &&
        Objects.equals(this.codeType, agast.codeType) &&
        Objects.equals(this.cstIPI, agast.cstIPI) &&
        Objects.equals(this.ipiLegalTaxClass, agast.ipiLegalTaxClass) &&
        Objects.equals(this.pisCofinsTaxReporting, agast.pisCofinsTaxReporting) &&
        Objects.equals(this.accruablePISTaxation, agast.accruablePISTaxation) &&
        Objects.equals(this.pisExemptLegalReasonCode, agast.pisExemptLegalReasonCode) &&
        Objects.equals(this.pisExemptLegalReason, agast.pisExemptLegalReason) &&
        Objects.equals(this.accruableCOFINSTaxation, agast.accruableCOFINSTaxation) &&
        Objects.equals(this.cofinsExemptLegalReasonCode, agast.cofinsExemptLegalReasonCode) &&
        Objects.equals(this.cofinsExemptLegalReason, agast.cofinsExemptLegalReason) &&
        Objects.equals(this.accruableCSLLTaxation, agast.accruableCSLLTaxation) &&
        Objects.equals(this.csllExemptLegalReason, agast.csllExemptLegalReason) &&
        Objects.equals(this.csllExemptLegalReasonCode, agast.csllExemptLegalReasonCode) &&
        Objects.equals(this.withholding, agast.withholding) &&
        Objects.equals(this.issDueatDestination, agast.issDueatDestination) &&
        Objects.equals(this.pisCofinsCreditNotAllowed, agast.pisCofinsCreditNotAllowed) &&
        Objects.equals(this.issTaxation, agast.issTaxation) &&
        Objects.equals(this.federalTaxRate, agast.federalTaxRate) &&
        Objects.equals(this.specialProductClass, agast.specialProductClass) &&
        Objects.equals(this.icmsConf, agast.icmsConf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description, hsCode, ex, cest, cean, codeType, cstIPI, ipiLegalTaxClass, pisCofinsTaxReporting, accruablePISTaxation, pisExemptLegalReasonCode, pisExemptLegalReason, accruableCOFINSTaxation, cofinsExemptLegalReasonCode, cofinsExemptLegalReason, accruableCSLLTaxation, csllExemptLegalReason, csllExemptLegalReasonCode, withholding, issDueatDestination, pisCofinsCreditNotAllowed, issTaxation, federalTaxRate, specialProductClass, icmsConf);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Agast {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hsCode: ").append(toIndentedString(hsCode)).append("\n");
    sb.append("    ex: ").append(toIndentedString(ex)).append("\n");
    sb.append("    cest: ").append(toIndentedString(cest)).append("\n");
    sb.append("    cean: ").append(toIndentedString(cean)).append("\n");
    sb.append("    codeType: ").append(toIndentedString(codeType)).append("\n");
    sb.append("    cstIPI: ").append(toIndentedString(cstIPI)).append("\n");
    sb.append("    ipiLegalTaxClass: ").append(toIndentedString(ipiLegalTaxClass)).append("\n");
    sb.append("    pisCofinsTaxReporting: ").append(toIndentedString(pisCofinsTaxReporting)).append("\n");
    sb.append("    accruablePISTaxation: ").append(toIndentedString(accruablePISTaxation)).append("\n");
    sb.append("    pisExemptLegalReasonCode: ").append(toIndentedString(pisExemptLegalReasonCode)).append("\n");
    sb.append("    pisExemptLegalReason: ").append(toIndentedString(pisExemptLegalReason)).append("\n");
    sb.append("    accruableCOFINSTaxation: ").append(toIndentedString(accruableCOFINSTaxation)).append("\n");
    sb.append("    cofinsExemptLegalReasonCode: ").append(toIndentedString(cofinsExemptLegalReasonCode)).append("\n");
    sb.append("    cofinsExemptLegalReason: ").append(toIndentedString(cofinsExemptLegalReason)).append("\n");
    sb.append("    accruableCSLLTaxation: ").append(toIndentedString(accruableCSLLTaxation)).append("\n");
    sb.append("    csllExemptLegalReason: ").append(toIndentedString(csllExemptLegalReason)).append("\n");
    sb.append("    csllExemptLegalReasonCode: ").append(toIndentedString(csllExemptLegalReasonCode)).append("\n");
    sb.append("    withholding: ").append(toIndentedString(withholding)).append("\n");
    sb.append("    issDueatDestination: ").append(toIndentedString(issDueatDestination)).append("\n");
    sb.append("    pisCofinsCreditNotAllowed: ").append(toIndentedString(pisCofinsCreditNotAllowed)).append("\n");
    sb.append("    issTaxation: ").append(toIndentedString(issTaxation)).append("\n");
    sb.append("    federalTaxRate: ").append(toIndentedString(federalTaxRate)).append("\n");
    sb.append("    specialProductClass: ").append(toIndentedString(specialProductClass)).append("\n");
    sb.append("    icmsConf: ").append(toIndentedString(icmsConf)).append("\n");
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

