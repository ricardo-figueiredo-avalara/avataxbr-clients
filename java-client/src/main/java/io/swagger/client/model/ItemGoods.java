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
import java.util.UUID;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * ItemGoods
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-06T17:54:07.550Z")
public class ItemGoods {
  @SerializedName("companyId")
  private UUID companyId = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("agast")
  private String agast = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("isLaborCession")
  private Boolean isLaborCession = null;

  @SerializedName("sealCode")
  private String sealCode = null;

  @SerializedName("nFCI")
  private String nFCI = null;

  @SerializedName("isIcmsStSubstitute")
  private Boolean isIcmsStSubstitute = null;

  /**
   * - '0' # National goods - except those treated in codes 3,4, 5 and 8 - '1' # Foreign goods - Imported directly by seller, except those in code 6 - '2' # Foreign goods - Acquired in the internal market (inside Brazil), except those in code 7 - '3' # National goods - Merchandise or goods with imported content above 40% and with less than or equal to 70% - '4' # National goods from production following 'standard basic processes' as stablished by legislation (standard basic processes are devised to separate simple assembly from manufaturing processes) - '5' # National goods - Merchandise or goods with imported content equal or below 40% - '6' # Foreign goods - Directly imported by Seller, without a National Equivalent as listed by Comex and natural gas - '7' # Foreign goods - Acquired inside Brazil, without a National Equivalent  as listed by Comex and natural gas - '8' # National goods - Merchandise or goods with imported content above 70% 
   */
  public enum SourceEnum {
    @SerializedName("0")
    _0("0"),
    
    @SerializedName("1")
    _1("1"),
    
    @SerializedName("2")
    _2("2"),
    
    @SerializedName("3")
    _3("3"),
    
    @SerializedName("4")
    _4("4"),
    
    @SerializedName("5")
    _5("5"),
    
    @SerializedName("6")
    _6("6"),
    
    @SerializedName("7")
    _7("7"),
    
    @SerializedName("8")
    _8("8");

    private String value;

    SourceEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("source")
  private SourceEnum source = null;

  /**
   * Gets or Sets productType
   */
  public enum ProductTypeEnum {
    @SerializedName("FOR PRODUCT")
    FOR_PRODUCT("FOR PRODUCT"),
    
    @SerializedName("FOR MERCHANDISE")
    FOR_MERCHANDISE("FOR MERCHANDISE"),
    
    @SerializedName("NO RESTRICTION")
    NO_RESTRICTION("NO RESTRICTION"),
    
    @SerializedName("SERVICE")
    SERVICE("SERVICE"),
    
    @SerializedName("FEEDSTOCK")
    FEEDSTOCK("FEEDSTOCK"),
    
    @SerializedName("FIXED ASSETS")
    FIXED_ASSETS("FIXED ASSETS");

    private String value;

    ProductTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("productType")
  private ProductTypeEnum productType = null;

  @SerializedName("manufacturerEquivalent")
  private Boolean manufacturerEquivalent = null;

  @SerializedName("appropriateIPIcreditWhenInGoing")
  private Boolean appropriateIPIcreditWhenInGoing = null;

  @SerializedName("usuallyAppropriatePISCOFINSCredit")
  private Boolean usuallyAppropriatePISCOFINSCredit = null;

  @SerializedName("isPisCofinsEstimatedCredit")
  private Boolean isPisCofinsEstimatedCredit = null;

  /**
   * - '01' # Vinculada Exclusivamente a Receita Tributada no Mercado Interno - '02' # Exclusivamente a Receita Não Tributada no Mercado Interno - '03' # Exclusivamente a Receita de Exportação - '04' # Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno - '05' # Vinculada a Receitas Tributadas no Mercado Interno e de Exportação - '06' # Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação - '07' # Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação 
   */
  public enum PiscofinsRevenueTypeEnum {
    @SerializedName("01")
    _01("01"),
    
    @SerializedName("02")
    _02("02"),
    
    @SerializedName("03")
    _03("03"),
    
    @SerializedName("04")
    _04("04"),
    
    @SerializedName("05")
    _05("05"),
    
    @SerializedName("06")
    _06("06"),
    
    @SerializedName("07")
    _07("07");

    private String value;

    PiscofinsRevenueTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("piscofinsRevenueType")
  private PiscofinsRevenueTypeEnum piscofinsRevenueType = null;

  @SerializedName("icmsBaseDiscountForMonoPhaseSocialContr")
  private Double icmsBaseDiscountForMonoPhaseSocialContr = null;

  @SerializedName("cean")
  private String cean = null;

  @SerializedName("nve")
  private String nve = null;

  @SerializedName("salesUnit")
  private String salesUnit = null;

  @SerializedName("salesUnitIPIfactor")
  private Double salesUnitIPIfactor = null;

  @SerializedName("salesUnitIcmsfactor")
  private Double salesUnitIcmsfactor = null;

  @SerializedName("salesUnitIcmsStfactor")
  private Double salesUnitIcmsStfactor = null;

  @SerializedName("salesUnitPisCofinsfactor")
  private Double salesUnitPisCofinsfactor = null;

  @SerializedName("purchaseUnit")
  private String purchaseUnit = null;

  @SerializedName("purchaseUnitIPIfactor")
  private Double purchaseUnitIPIfactor = null;

  @SerializedName("purchaseUnitIcmsfactor")
  private Double purchaseUnitIcmsfactor = null;

  @SerializedName("purchaseUnitIcmsStfactor")
  private Double purchaseUnitIcmsStfactor = null;

  @SerializedName("purchaseUnitPisCofinsfactor")
  private Double purchaseUnitPisCofinsfactor = null;

  @SerializedName("firstUse")
  private Boolean firstUse = null;

  public ItemGoods companyId(UUID companyId) {
    this.companyId = companyId;
    return this;
  }

   /**
   * Company ID
   * @return companyId
  **/
  @ApiModelProperty(example = "null", required = true, value = "Company ID")
  public UUID getCompanyId() {
    return companyId;
  }

  public void setCompanyId(UUID companyId) {
    this.companyId = companyId;
  }

  public ItemGoods code(String code) {
    this.code = code;
    return this;
  }

   /**
   * ERP Code
   * @return code
  **/
  @ApiModelProperty(example = "null", required = true, value = "ERP Code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ItemGoods agast(String agast) {
    this.agast = agast;
    return this;
  }

   /**
   * Agast Code
   * @return agast
  **/
  @ApiModelProperty(example = "null", required = true, value = "Agast Code")
  public String getAgast() {
    return agast;
  }

  public void setAgast(String agast) {
    this.agast = agast;
  }

  public ItemGoods description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Item Description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "Item Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ItemGoods isLaborCession(Boolean isLaborCession) {
    this.isLaborCession = isLaborCession;
    return this;
  }

   /**
   * Applies the \"is Labor Cession\" tax scenario. (Cessão de mão de obra). 
   * @return isLaborCession
  **/
  @ApiModelProperty(example = "null", value = "Applies the \"is Labor Cession\" tax scenario. (Cessão de mão de obra). ")
  public Boolean getIsLaborCession() {
    return isLaborCession;
  }

  public void setIsLaborCession(Boolean isLaborCession) {
    this.isLaborCession = isLaborCession;
  }

  public ItemGoods sealCode(String sealCode) {
    this.sealCode = sealCode;
    return this;
  }

   /**
   * Seal Code for ipi tax control (código do selo para controle de IPI)
   * @return sealCode
  **/
  @ApiModelProperty(example = "null", required = true, value = "Seal Code for ipi tax control (código do selo para controle de IPI)")
  public String getSealCode() {
    return sealCode;
  }

  public void setSealCode(String sealCode) {
    this.sealCode = sealCode;
  }

  public ItemGoods nFCI(String nFCI) {
    this.nFCI = nFCI;
    return this;
  }

   /**
   * Importation content form number (Número de controle da FCI - Ficha de Conteúdo de Importação)
   * @return nFCI
  **/
  @ApiModelProperty(example = "null", value = "Importation content form number (Número de controle da FCI - Ficha de Conteúdo de Importação)")
  public String getNFCI() {
    return nFCI;
  }

  public void setNFCI(String nFCI) {
    this.nFCI = nFCI;
  }

  public ItemGoods isIcmsStSubstitute(Boolean isIcmsStSubstitute) {
    this.isIcmsStSubstitute = isIcmsStSubstitute;
    return this;
  }

   /**
   * this field inform that this merchandise or product is ICMS Substitute Must be used when the item is for resale and the company will assume the role of ICMS Substitute (wholesaler, retailer, distributor). Example: when Importing some product the company does not pay IcmsSt at the time of customs clearance but when selling sale the item. Deverá ser utilizado quando a empresa que irá vender a mercadoria sujeita ao ICMS ST for o SUBSTITUTO TRIBUTÁRIO (Distribuidor, atacadista e varejista), como por exemplo das mercadorias IMPORTADAS, neste sentido, a empresa não irá pagar o ICMS ST no desembaraço aduaneiro e irá recolher quando for vender as mesmas. 
   * @return isIcmsStSubstitute
  **/
  @ApiModelProperty(example = "null", value = "this field inform that this merchandise or product is ICMS Substitute Must be used when the item is for resale and the company will assume the role of ICMS Substitute (wholesaler, retailer, distributor). Example: when Importing some product the company does not pay IcmsSt at the time of customs clearance but when selling sale the item. Deverá ser utilizado quando a empresa que irá vender a mercadoria sujeita ao ICMS ST for o SUBSTITUTO TRIBUTÁRIO (Distribuidor, atacadista e varejista), como por exemplo das mercadorias IMPORTADAS, neste sentido, a empresa não irá pagar o ICMS ST no desembaraço aduaneiro e irá recolher quando for vender as mesmas. ")
  public Boolean getIsIcmsStSubstitute() {
    return isIcmsStSubstitute;
  }

  public void setIsIcmsStSubstitute(Boolean isIcmsStSubstitute) {
    this.isIcmsStSubstitute = isIcmsStSubstitute;
  }

  public ItemGoods source(SourceEnum source) {
    this.source = source;
    return this;
  }

   /**
   * - '0' # National goods - except those treated in codes 3,4, 5 and 8 - '1' # Foreign goods - Imported directly by seller, except those in code 6 - '2' # Foreign goods - Acquired in the internal market (inside Brazil), except those in code 7 - '3' # National goods - Merchandise or goods with imported content above 40% and with less than or equal to 70% - '4' # National goods from production following 'standard basic processes' as stablished by legislation (standard basic processes are devised to separate simple assembly from manufaturing processes) - '5' # National goods - Merchandise or goods with imported content equal or below 40% - '6' # Foreign goods - Directly imported by Seller, without a National Equivalent as listed by Comex and natural gas - '7' # Foreign goods - Acquired inside Brazil, without a National Equivalent  as listed by Comex and natural gas - '8' # National goods - Merchandise or goods with imported content above 70% 
   * @return source
  **/
  @ApiModelProperty(example = "null", value = "- '0' # National goods - except those treated in codes 3,4, 5 and 8 - '1' # Foreign goods - Imported directly by seller, except those in code 6 - '2' # Foreign goods - Acquired in the internal market (inside Brazil), except those in code 7 - '3' # National goods - Merchandise or goods with imported content above 40% and with less than or equal to 70% - '4' # National goods from production following 'standard basic processes' as stablished by legislation (standard basic processes are devised to separate simple assembly from manufaturing processes) - '5' # National goods - Merchandise or goods with imported content equal or below 40% - '6' # Foreign goods - Directly imported by Seller, without a National Equivalent as listed by Comex and natural gas - '7' # Foreign goods - Acquired inside Brazil, without a National Equivalent  as listed by Comex and natural gas - '8' # National goods - Merchandise or goods with imported content above 70% ")
  public SourceEnum getSource() {
    return source;
  }

  public void setSource(SourceEnum source) {
    this.source = source;
  }

  public ItemGoods productType(ProductTypeEnum productType) {
    this.productType = productType;
    return this;
  }

   /**
   * Get productType
   * @return productType
  **/
  @ApiModelProperty(example = "null", value = "")
  public ProductTypeEnum getProductType() {
    return productType;
  }

  public void setProductType(ProductTypeEnum productType) {
    this.productType = productType;
  }

  public ItemGoods manufacturerEquivalent(Boolean manufacturerEquivalent) {
    this.manufacturerEquivalent = manufacturerEquivalent;
    return this;
  }

   /**
   * Item is merchandise but will be considered product
   * @return manufacturerEquivalent
  **/
  @ApiModelProperty(example = "null", value = "Item is merchandise but will be considered product")
  public Boolean getManufacturerEquivalent() {
    return manufacturerEquivalent;
  }

  public void setManufacturerEquivalent(Boolean manufacturerEquivalent) {
    this.manufacturerEquivalent = manufacturerEquivalent;
  }

  public ItemGoods appropriateIPIcreditWhenInGoing(Boolean appropriateIPIcreditWhenInGoing) {
    this.appropriateIPIcreditWhenInGoing = appropriateIPIcreditWhenInGoing;
    return this;
  }

   /**
   * Inform that this item will have rights to aprropriate IPI credit
   * @return appropriateIPIcreditWhenInGoing
  **/
  @ApiModelProperty(example = "null", value = "Inform that this item will have rights to aprropriate IPI credit")
  public Boolean getAppropriateIPIcreditWhenInGoing() {
    return appropriateIPIcreditWhenInGoing;
  }

  public void setAppropriateIPIcreditWhenInGoing(Boolean appropriateIPIcreditWhenInGoing) {
    this.appropriateIPIcreditWhenInGoing = appropriateIPIcreditWhenInGoing;
  }

  public ItemGoods usuallyAppropriatePISCOFINSCredit(Boolean usuallyAppropriatePISCOFINSCredit) {
    this.usuallyAppropriatePISCOFINSCredit = usuallyAppropriatePISCOFINSCredit;
    return this;
  }

   /**
   * Subject to appropriate PIS/COFINS credit, when NO CUMULATIVE
   * @return usuallyAppropriatePISCOFINSCredit
  **/
  @ApiModelProperty(example = "null", value = "Subject to appropriate PIS/COFINS credit, when NO CUMULATIVE")
  public Boolean getUsuallyAppropriatePISCOFINSCredit() {
    return usuallyAppropriatePISCOFINSCredit;
  }

  public void setUsuallyAppropriatePISCOFINSCredit(Boolean usuallyAppropriatePISCOFINSCredit) {
    this.usuallyAppropriatePISCOFINSCredit = usuallyAppropriatePISCOFINSCredit;
  }

  public ItemGoods isPisCofinsEstimatedCredit(Boolean isPisCofinsEstimatedCredit) {
    this.isPisCofinsEstimatedCredit = isPisCofinsEstimatedCredit;
    return this;
  }

   /**
   * The credit PIS/COFINS is subject to purchase form companies, but exist some exceptions, when the credit will be a estimated amount
   * @return isPisCofinsEstimatedCredit
  **/
  @ApiModelProperty(example = "null", value = "The credit PIS/COFINS is subject to purchase form companies, but exist some exceptions, when the credit will be a estimated amount")
  public Boolean getIsPisCofinsEstimatedCredit() {
    return isPisCofinsEstimatedCredit;
  }

  public void setIsPisCofinsEstimatedCredit(Boolean isPisCofinsEstimatedCredit) {
    this.isPisCofinsEstimatedCredit = isPisCofinsEstimatedCredit;
  }

  public ItemGoods piscofinsRevenueType(PiscofinsRevenueTypeEnum piscofinsRevenueType) {
    this.piscofinsRevenueType = piscofinsRevenueType;
    return this;
  }

   /**
   * - '01' # Vinculada Exclusivamente a Receita Tributada no Mercado Interno - '02' # Exclusivamente a Receita Não Tributada no Mercado Interno - '03' # Exclusivamente a Receita de Exportação - '04' # Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno - '05' # Vinculada a Receitas Tributadas no Mercado Interno e de Exportação - '06' # Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação - '07' # Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação 
   * @return piscofinsRevenueType
  **/
  @ApiModelProperty(example = "null", value = "- '01' # Vinculada Exclusivamente a Receita Tributada no Mercado Interno - '02' # Exclusivamente a Receita Não Tributada no Mercado Interno - '03' # Exclusivamente a Receita de Exportação - '04' # Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno - '05' # Vinculada a Receitas Tributadas no Mercado Interno e de Exportação - '06' # Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação - '07' # Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação ")
  public PiscofinsRevenueTypeEnum getPiscofinsRevenueType() {
    return piscofinsRevenueType;
  }

  public void setPiscofinsRevenueType(PiscofinsRevenueTypeEnum piscofinsRevenueType) {
    this.piscofinsRevenueType = piscofinsRevenueType;
  }

  public ItemGoods icmsBaseDiscountForMonoPhaseSocialContr(Double icmsBaseDiscountForMonoPhaseSocialContr) {
    this.icmsBaseDiscountForMonoPhaseSocialContr = icmsBaseDiscountForMonoPhaseSocialContr;
    return this;
  }

   /**
   * Discount allowed on icms base when PIS/COFINS are Monophase
   * @return icmsBaseDiscountForMonoPhaseSocialContr
  **/
  @ApiModelProperty(example = "null", value = "Discount allowed on icms base when PIS/COFINS are Monophase")
  public Double getIcmsBaseDiscountForMonoPhaseSocialContr() {
    return icmsBaseDiscountForMonoPhaseSocialContr;
  }

  public void setIcmsBaseDiscountForMonoPhaseSocialContr(Double icmsBaseDiscountForMonoPhaseSocialContr) {
    this.icmsBaseDiscountForMonoPhaseSocialContr = icmsBaseDiscountForMonoPhaseSocialContr;
  }

  public ItemGoods cean(String cean) {
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

  public ItemGoods nve(String nve) {
    this.nve = nve;
    return this;
  }

   /**
   * Nomenclatura de Valor aduaneio e Estatístico - NCM extension code
   * @return nve
  **/
  @ApiModelProperty(example = "null", value = "Nomenclatura de Valor aduaneio e Estatístico - NCM extension code")
  public String getNve() {
    return nve;
  }

  public void setNve(String nve) {
    this.nve = nve;
  }

  public ItemGoods salesUnit(String salesUnit) {
    this.salesUnit = salesUnit;
    return this;
  }

   /**
   * Get salesUnit
   * @return salesUnit
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSalesUnit() {
    return salesUnit;
  }

  public void setSalesUnit(String salesUnit) {
    this.salesUnit = salesUnit;
  }

  public ItemGoods salesUnitIPIfactor(Double salesUnitIPIfactor) {
    this.salesUnitIPIfactor = salesUnitIPIfactor;
    return this;
  }

   /**
   * factor to convert sales quantity to IPI taxable quantity when it is by SRF Statutory Retail Price (Pauta)
   * @return salesUnitIPIfactor
  **/
  @ApiModelProperty(example = "null", value = "factor to convert sales quantity to IPI taxable quantity when it is by SRF Statutory Retail Price (Pauta)")
  public Double getSalesUnitIPIfactor() {
    return salesUnitIPIfactor;
  }

  public void setSalesUnitIPIfactor(Double salesUnitIPIfactor) {
    this.salesUnitIPIfactor = salesUnitIPIfactor;
  }

  public ItemGoods salesUnitIcmsfactor(Double salesUnitIcmsfactor) {
    this.salesUnitIcmsfactor = salesUnitIcmsfactor;
    return this;
  }

   /**
   * factor to convert sales quantity to ICMS taxable quantity when it is by SRF Statutory Retail Price (Pauta)
   * @return salesUnitIcmsfactor
  **/
  @ApiModelProperty(example = "null", value = "factor to convert sales quantity to ICMS taxable quantity when it is by SRF Statutory Retail Price (Pauta)")
  public Double getSalesUnitIcmsfactor() {
    return salesUnitIcmsfactor;
  }

  public void setSalesUnitIcmsfactor(Double salesUnitIcmsfactor) {
    this.salesUnitIcmsfactor = salesUnitIcmsfactor;
  }

  public ItemGoods salesUnitIcmsStfactor(Double salesUnitIcmsStfactor) {
    this.salesUnitIcmsStfactor = salesUnitIcmsStfactor;
    return this;
  }

   /**
   * factor to convert sales quantity to ICMS-ST taxable quantity when it is by SRF Statutory Retail Price (Pauta)
   * @return salesUnitIcmsStfactor
  **/
  @ApiModelProperty(example = "null", value = "factor to convert sales quantity to ICMS-ST taxable quantity when it is by SRF Statutory Retail Price (Pauta)")
  public Double getSalesUnitIcmsStfactor() {
    return salesUnitIcmsStfactor;
  }

  public void setSalesUnitIcmsStfactor(Double salesUnitIcmsStfactor) {
    this.salesUnitIcmsStfactor = salesUnitIcmsStfactor;
  }

  public ItemGoods salesUnitPisCofinsfactor(Double salesUnitPisCofinsfactor) {
    this.salesUnitPisCofinsfactor = salesUnitPisCofinsfactor;
    return this;
  }

   /**
   * factor to convert sales quantity to PIS/COFINS taxable quantity when it is by SRF Statutory Retail Price (Pauta)
   * @return salesUnitPisCofinsfactor
  **/
  @ApiModelProperty(example = "null", value = "factor to convert sales quantity to PIS/COFINS taxable quantity when it is by SRF Statutory Retail Price (Pauta)")
  public Double getSalesUnitPisCofinsfactor() {
    return salesUnitPisCofinsfactor;
  }

  public void setSalesUnitPisCofinsfactor(Double salesUnitPisCofinsfactor) {
    this.salesUnitPisCofinsfactor = salesUnitPisCofinsfactor;
  }

  public ItemGoods purchaseUnit(String purchaseUnit) {
    this.purchaseUnit = purchaseUnit;
    return this;
  }

   /**
   * Get purchaseUnit
   * @return purchaseUnit
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPurchaseUnit() {
    return purchaseUnit;
  }

  public void setPurchaseUnit(String purchaseUnit) {
    this.purchaseUnit = purchaseUnit;
  }

  public ItemGoods purchaseUnitIPIfactor(Double purchaseUnitIPIfactor) {
    this.purchaseUnitIPIfactor = purchaseUnitIPIfactor;
    return this;
  }

   /**
   * factor to convert purchase quantity to IPI taxable quantity when it is by SRF Statutory Retail Price (Pauta)
   * @return purchaseUnitIPIfactor
  **/
  @ApiModelProperty(example = "null", value = "factor to convert purchase quantity to IPI taxable quantity when it is by SRF Statutory Retail Price (Pauta)")
  public Double getPurchaseUnitIPIfactor() {
    return purchaseUnitIPIfactor;
  }

  public void setPurchaseUnitIPIfactor(Double purchaseUnitIPIfactor) {
    this.purchaseUnitIPIfactor = purchaseUnitIPIfactor;
  }

  public ItemGoods purchaseUnitIcmsfactor(Double purchaseUnitIcmsfactor) {
    this.purchaseUnitIcmsfactor = purchaseUnitIcmsfactor;
    return this;
  }

   /**
   * factor to convert purchase quantity to ICMS taxable quantity when it is by SRF Statutory Retail Price (Pauta)
   * @return purchaseUnitIcmsfactor
  **/
  @ApiModelProperty(example = "null", value = "factor to convert purchase quantity to ICMS taxable quantity when it is by SRF Statutory Retail Price (Pauta)")
  public Double getPurchaseUnitIcmsfactor() {
    return purchaseUnitIcmsfactor;
  }

  public void setPurchaseUnitIcmsfactor(Double purchaseUnitIcmsfactor) {
    this.purchaseUnitIcmsfactor = purchaseUnitIcmsfactor;
  }

  public ItemGoods purchaseUnitIcmsStfactor(Double purchaseUnitIcmsStfactor) {
    this.purchaseUnitIcmsStfactor = purchaseUnitIcmsStfactor;
    return this;
  }

   /**
   * factor to convert purchase quantity to ICMS-ST taxable quantity when it is by SRF Statutory Retail Price (Pauta)
   * @return purchaseUnitIcmsStfactor
  **/
  @ApiModelProperty(example = "null", value = "factor to convert purchase quantity to ICMS-ST taxable quantity when it is by SRF Statutory Retail Price (Pauta)")
  public Double getPurchaseUnitIcmsStfactor() {
    return purchaseUnitIcmsStfactor;
  }

  public void setPurchaseUnitIcmsStfactor(Double purchaseUnitIcmsStfactor) {
    this.purchaseUnitIcmsStfactor = purchaseUnitIcmsStfactor;
  }

  public ItemGoods purchaseUnitPisCofinsfactor(Double purchaseUnitPisCofinsfactor) {
    this.purchaseUnitPisCofinsfactor = purchaseUnitPisCofinsfactor;
    return this;
  }

   /**
   * factor to convert purchase quantity to PIS/COFINS taxable quantity when it is by SRF Statutory Retail Price (Pauta)
   * @return purchaseUnitPisCofinsfactor
  **/
  @ApiModelProperty(example = "null", value = "factor to convert purchase quantity to PIS/COFINS taxable quantity when it is by SRF Statutory Retail Price (Pauta)")
  public Double getPurchaseUnitPisCofinsfactor() {
    return purchaseUnitPisCofinsfactor;
  }

  public void setPurchaseUnitPisCofinsfactor(Double purchaseUnitPisCofinsfactor) {
    this.purchaseUnitPisCofinsfactor = purchaseUnitPisCofinsfactor;
  }

  public ItemGoods firstUse(Boolean firstUse) {
    this.firstUse = firstUse;
    return this;
  }

   /**
   * When the product is new, and will be retail, firt time that it exit it is subject to IPI
   * @return firstUse
  **/
  @ApiModelProperty(example = "null", value = "When the product is new, and will be retail, firt time that it exit it is subject to IPI")
  public Boolean getFirstUse() {
    return firstUse;
  }

  public void setFirstUse(Boolean firstUse) {
    this.firstUse = firstUse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemGoods itemGoods = (ItemGoods) o;
    return Objects.equals(this.companyId, itemGoods.companyId) &&
        Objects.equals(this.code, itemGoods.code) &&
        Objects.equals(this.agast, itemGoods.agast) &&
        Objects.equals(this.description, itemGoods.description) &&
        Objects.equals(this.isLaborCession, itemGoods.isLaborCession) &&
        Objects.equals(this.sealCode, itemGoods.sealCode) &&
        Objects.equals(this.nFCI, itemGoods.nFCI) &&
        Objects.equals(this.isIcmsStSubstitute, itemGoods.isIcmsStSubstitute) &&
        Objects.equals(this.source, itemGoods.source) &&
        Objects.equals(this.productType, itemGoods.productType) &&
        Objects.equals(this.manufacturerEquivalent, itemGoods.manufacturerEquivalent) &&
        Objects.equals(this.appropriateIPIcreditWhenInGoing, itemGoods.appropriateIPIcreditWhenInGoing) &&
        Objects.equals(this.usuallyAppropriatePISCOFINSCredit, itemGoods.usuallyAppropriatePISCOFINSCredit) &&
        Objects.equals(this.isPisCofinsEstimatedCredit, itemGoods.isPisCofinsEstimatedCredit) &&
        Objects.equals(this.piscofinsRevenueType, itemGoods.piscofinsRevenueType) &&
        Objects.equals(this.icmsBaseDiscountForMonoPhaseSocialContr, itemGoods.icmsBaseDiscountForMonoPhaseSocialContr) &&
        Objects.equals(this.cean, itemGoods.cean) &&
        Objects.equals(this.nve, itemGoods.nve) &&
        Objects.equals(this.salesUnit, itemGoods.salesUnit) &&
        Objects.equals(this.salesUnitIPIfactor, itemGoods.salesUnitIPIfactor) &&
        Objects.equals(this.salesUnitIcmsfactor, itemGoods.salesUnitIcmsfactor) &&
        Objects.equals(this.salesUnitIcmsStfactor, itemGoods.salesUnitIcmsStfactor) &&
        Objects.equals(this.salesUnitPisCofinsfactor, itemGoods.salesUnitPisCofinsfactor) &&
        Objects.equals(this.purchaseUnit, itemGoods.purchaseUnit) &&
        Objects.equals(this.purchaseUnitIPIfactor, itemGoods.purchaseUnitIPIfactor) &&
        Objects.equals(this.purchaseUnitIcmsfactor, itemGoods.purchaseUnitIcmsfactor) &&
        Objects.equals(this.purchaseUnitIcmsStfactor, itemGoods.purchaseUnitIcmsStfactor) &&
        Objects.equals(this.purchaseUnitPisCofinsfactor, itemGoods.purchaseUnitPisCofinsfactor) &&
        Objects.equals(this.firstUse, itemGoods.firstUse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, code, agast, description, isLaborCession, sealCode, nFCI, isIcmsStSubstitute, source, productType, manufacturerEquivalent, appropriateIPIcreditWhenInGoing, usuallyAppropriatePISCOFINSCredit, isPisCofinsEstimatedCredit, piscofinsRevenueType, icmsBaseDiscountForMonoPhaseSocialContr, cean, nve, salesUnit, salesUnitIPIfactor, salesUnitIcmsfactor, salesUnitIcmsStfactor, salesUnitPisCofinsfactor, purchaseUnit, purchaseUnitIPIfactor, purchaseUnitIcmsfactor, purchaseUnitIcmsStfactor, purchaseUnitPisCofinsfactor, firstUse);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemGoods {\n");
    
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    agast: ").append(toIndentedString(agast)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isLaborCession: ").append(toIndentedString(isLaborCession)).append("\n");
    sb.append("    sealCode: ").append(toIndentedString(sealCode)).append("\n");
    sb.append("    nFCI: ").append(toIndentedString(nFCI)).append("\n");
    sb.append("    isIcmsStSubstitute: ").append(toIndentedString(isIcmsStSubstitute)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    manufacturerEquivalent: ").append(toIndentedString(manufacturerEquivalent)).append("\n");
    sb.append("    appropriateIPIcreditWhenInGoing: ").append(toIndentedString(appropriateIPIcreditWhenInGoing)).append("\n");
    sb.append("    usuallyAppropriatePISCOFINSCredit: ").append(toIndentedString(usuallyAppropriatePISCOFINSCredit)).append("\n");
    sb.append("    isPisCofinsEstimatedCredit: ").append(toIndentedString(isPisCofinsEstimatedCredit)).append("\n");
    sb.append("    piscofinsRevenueType: ").append(toIndentedString(piscofinsRevenueType)).append("\n");
    sb.append("    icmsBaseDiscountForMonoPhaseSocialContr: ").append(toIndentedString(icmsBaseDiscountForMonoPhaseSocialContr)).append("\n");
    sb.append("    cean: ").append(toIndentedString(cean)).append("\n");
    sb.append("    nve: ").append(toIndentedString(nve)).append("\n");
    sb.append("    salesUnit: ").append(toIndentedString(salesUnit)).append("\n");
    sb.append("    salesUnitIPIfactor: ").append(toIndentedString(salesUnitIPIfactor)).append("\n");
    sb.append("    salesUnitIcmsfactor: ").append(toIndentedString(salesUnitIcmsfactor)).append("\n");
    sb.append("    salesUnitIcmsStfactor: ").append(toIndentedString(salesUnitIcmsStfactor)).append("\n");
    sb.append("    salesUnitPisCofinsfactor: ").append(toIndentedString(salesUnitPisCofinsfactor)).append("\n");
    sb.append("    purchaseUnit: ").append(toIndentedString(purchaseUnit)).append("\n");
    sb.append("    purchaseUnitIPIfactor: ").append(toIndentedString(purchaseUnitIPIfactor)).append("\n");
    sb.append("    purchaseUnitIcmsfactor: ").append(toIndentedString(purchaseUnitIcmsfactor)).append("\n");
    sb.append("    purchaseUnitIcmsStfactor: ").append(toIndentedString(purchaseUnitIcmsStfactor)).append("\n");
    sb.append("    purchaseUnitPisCofinsfactor: ").append(toIndentedString(purchaseUnitPisCofinsfactor)).append("\n");
    sb.append("    firstUse: ").append(toIndentedString(firstUse)).append("\n");
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

