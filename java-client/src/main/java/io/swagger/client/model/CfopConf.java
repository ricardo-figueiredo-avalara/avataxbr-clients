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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * CfopConf
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-06T17:54:07.550Z")
public class CfopConf {
  @SerializedName("code")
  private String code = null;

  @SerializedName("stockImpact")
  private Boolean stockImpact = null;

  @SerializedName("financialImpact")
  private Boolean financialImpact = null;

  /**
   * Inform if this process is subject to IPI taxation on output process - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'H'  # SUSPENDED - 'N'  # NO TAXABLE     - 'I'  # IMMUNE - 'O'  # OTHER - 'OZ' # OTHER AND ZERO VALUES 
   */
  public enum CstIPIEnum {
    @SerializedName("T")
    T("T"),
    
    @SerializedName("Z")
    Z("Z"),
    
    @SerializedName("E")
    E("E"),
    
    @SerializedName("H")
    H("H"),
    
    @SerializedName("N")
    N("N"),
    
    @SerializedName("I")
    I("I"),
    
    @SerializedName("O")
    O("O"),
    
    @SerializedName("OZ")
    OZ("OZ");

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
   * Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE - 'O' # OTHER - 'OZ'# OTHER AND ZERO VALUES 
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
    N("N"),
    
    @SerializedName("O")
    O("O"),
    
    @SerializedName("OZ")
    OZ("OZ");

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
   * Inform if this item by nature is subject to COFINS taxation or exempt - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'H'  # SUSPENDED - 'N'  # NO TAXABLE     - 'O'  # OTHER - 'OZ' # OTHER AND ZERO VALUES 
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
    N("N"),
    
    @SerializedName("O")
    O("O"),
    
    @SerializedName("OZ")
    OZ("OZ");

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

  @SerializedName("allowIPIcreditWhenInGoing")
  private Boolean allowIPIcreditWhenInGoing = null;

  @SerializedName("icmsConf")
  private List<IcmsTaxConf> icmsConf = new ArrayList<IcmsTaxConf>();

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  /**
   * inform if the transaction is an operation to internalizing item or value
   */
  public enum WayTypeEnum {
    @SerializedName("in")
    IN("in"),
    
    @SerializedName("out")
    OUT("out");

    private String value;

    WayTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("wayType")
  private WayTypeEnum wayType = null;

  @SerializedName("codInState")
  private Integer codInState = null;

  @SerializedName("codOtherState")
  private Integer codOtherState = null;

  @SerializedName("codOtherCountry")
  private Integer codOtherCountry = null;

  @SerializedName("cstICMSSameState")
  private CstIcmsEnum cstICMSSameState = null;

  @SerializedName("cstICMSOtherState")
  private CstIcmsEnum cstICMSOtherState = null;

  @SerializedName("cstICMSOtherCountry")
  private CstIcmsEnum cstICMSOtherCountry = null;

  /**
   * this field is used to define right CFOP, one operation type can be specialized to item product, item merchandise or generic
   */
  public enum ProductTypeEnum {
    @SerializedName("FOR PRODUCT")
    FOR_PRODUCT("FOR PRODUCT"),
    
    @SerializedName("FOR MERCHANDISE")
    FOR_MERCHANDISE("FOR MERCHANDISE"),
    
    @SerializedName("NO RESTRICTION")
    NO_RESTRICTION("NO RESTRICTION");

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

  @SerializedName("operationToTaxPayerOtherState")
  private Boolean operationToTaxPayerOtherState = null;

  @SerializedName("operationWithST")
  private Boolean operationWithST = null;

  @SerializedName("operationToFreeZone")
  private Boolean operationToFreeZone = null;

  /**
   * field used to indicate an operation to some product class specifically
   */
  public enum SpecificForProductClassEnum {
    @SerializedName("OTHERS")
    OTHERS("OTHERS"),
    
    @SerializedName("COMMUNICATION")
    COMMUNICATION("COMMUNICATION"),
    
    @SerializedName("ENERGY")
    ENERGY("ENERGY"),
    
    @SerializedName("TRANSPORT")
    TRANSPORT("TRANSPORT"),
    
    @SerializedName("FUEL AND LUBRICANT")
    FUEL_AND_LUBRICANT("FUEL AND LUBRICANT"),
    
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

    SpecificForProductClassEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("specificForProductClass")
  private SpecificForProductClassEnum specificForProductClass = null;

  public CfopConf code(String code) {
    this.code = code;
    return this;
  }

   /**
   * main unique identificator
   * @return code
  **/
  @ApiModelProperty(example = "null", required = true, value = "main unique identificator")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public CfopConf stockImpact(Boolean stockImpact) {
    this.stockImpact = stockImpact;
    return this;
  }

   /**
   * Inform that the process has inventory impact.
   * @return stockImpact
  **/
  @ApiModelProperty(example = "null", value = "Inform that the process has inventory impact.")
  public Boolean getStockImpact() {
    return stockImpact;
  }

  public void setStockImpact(Boolean stockImpact) {
    this.stockImpact = stockImpact;
  }

  public CfopConf financialImpact(Boolean financialImpact) {
    this.financialImpact = financialImpact;
    return this;
  }

   /**
   * Inform that the process has financial impact.
   * @return financialImpact
  **/
  @ApiModelProperty(example = "null", value = "Inform that the process has financial impact.")
  public Boolean getFinancialImpact() {
    return financialImpact;
  }

  public void setFinancialImpact(Boolean financialImpact) {
    this.financialImpact = financialImpact;
  }

  public CfopConf cstIPI(CstIPIEnum cstIPI) {
    this.cstIPI = cstIPI;
    return this;
  }

   /**
   * Inform if this process is subject to IPI taxation on output process - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'H'  # SUSPENDED - 'N'  # NO TAXABLE     - 'I'  # IMMUNE - 'O'  # OTHER - 'OZ' # OTHER AND ZERO VALUES 
   * @return cstIPI
  **/
  @ApiModelProperty(example = "null", value = "Inform if this process is subject to IPI taxation on output process - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'H'  # SUSPENDED - 'N'  # NO TAXABLE     - 'I'  # IMMUNE - 'O'  # OTHER - 'OZ' # OTHER AND ZERO VALUES ")
  public CstIPIEnum getCstIPI() {
    return cstIPI;
  }

  public void setCstIPI(CstIPIEnum cstIPI) {
    this.cstIPI = cstIPI;
  }

  public CfopConf ipiLegalTaxClass(String ipiLegalTaxClass) {
    this.ipiLegalTaxClass = ipiLegalTaxClass;
    return this;
  }

   /**
   * Legal tax classificação for IPI (enquadramento) When the processo has CST IPI 52 or 54, is mandatory inform Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo=mCnJajU4BKU= 
   * @return ipiLegalTaxClass
  **/
  @ApiModelProperty(example = "null", value = "Legal tax classificação for IPI (enquadramento) When the processo has CST IPI 52 or 54, is mandatory inform Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo=mCnJajU4BKU= ")
  public String getIpiLegalTaxClass() {
    return ipiLegalTaxClass;
  }

  public void setIpiLegalTaxClass(String ipiLegalTaxClass) {
    this.ipiLegalTaxClass = ipiLegalTaxClass;
  }

  public CfopConf accruablePISTaxation(AccruablePISTaxationEnum accruablePISTaxation) {
    this.accruablePISTaxation = accruablePISTaxation;
    return this;
  }

   /**
   * Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE - 'O' # OTHER - 'OZ'# OTHER AND ZERO VALUES 
   * @return accruablePISTaxation
  **/
  @ApiModelProperty(example = "null", value = "Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE - 'O' # OTHER - 'OZ'# OTHER AND ZERO VALUES ")
  public AccruablePISTaxationEnum getAccruablePISTaxation() {
    return accruablePISTaxation;
  }

  public void setAccruablePISTaxation(AccruablePISTaxationEnum accruablePISTaxation) {
    this.accruablePISTaxation = accruablePISTaxation;
  }

  public CfopConf pisExemptLegalReasonCode(String pisExemptLegalReasonCode) {
    this.pisExemptLegalReasonCode = pisExemptLegalReasonCode;
    return this;
  }

   /**
   * Reference to a tax reason record ID.
   * @return pisExemptLegalReasonCode
  **/
  @ApiModelProperty(example = "null", value = "Reference to a tax reason record ID.")
  public String getPisExemptLegalReasonCode() {
    return pisExemptLegalReasonCode;
  }

  public void setPisExemptLegalReasonCode(String pisExemptLegalReasonCode) {
    this.pisExemptLegalReasonCode = pisExemptLegalReasonCode;
  }

  public CfopConf pisExemptLegalReason(String pisExemptLegalReason) {
    this.pisExemptLegalReason = pisExemptLegalReason;
    return this;
  }

   /**
   * When specifi reason, this field has the description
   * @return pisExemptLegalReason
  **/
  @ApiModelProperty(example = "null", value = "When specifi reason, this field has the description")
  public String getPisExemptLegalReason() {
    return pisExemptLegalReason;
  }

  public void setPisExemptLegalReason(String pisExemptLegalReason) {
    this.pisExemptLegalReason = pisExemptLegalReason;
  }

  public CfopConf accruableCOFINSTaxation(AccruableCOFINSTaxationEnum accruableCOFINSTaxation) {
    this.accruableCOFINSTaxation = accruableCOFINSTaxation;
    return this;
  }

   /**
   * Inform if this item by nature is subject to COFINS taxation or exempt - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'H'  # SUSPENDED - 'N'  # NO TAXABLE     - 'O'  # OTHER - 'OZ' # OTHER AND ZERO VALUES 
   * @return accruableCOFINSTaxation
  **/
  @ApiModelProperty(example = "null", value = "Inform if this item by nature is subject to COFINS taxation or exempt - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'H'  # SUSPENDED - 'N'  # NO TAXABLE     - 'O'  # OTHER - 'OZ' # OTHER AND ZERO VALUES ")
  public AccruableCOFINSTaxationEnum getAccruableCOFINSTaxation() {
    return accruableCOFINSTaxation;
  }

  public void setAccruableCOFINSTaxation(AccruableCOFINSTaxationEnum accruableCOFINSTaxation) {
    this.accruableCOFINSTaxation = accruableCOFINSTaxation;
  }

  public CfopConf cofinsExemptLegalReasonCode(String cofinsExemptLegalReasonCode) {
    this.cofinsExemptLegalReasonCode = cofinsExemptLegalReasonCode;
    return this;
  }

   /**
   * When exempt, taxable with zero, suspended, not taxable, this field holds the official code number
   * @return cofinsExemptLegalReasonCode
  **/
  @ApiModelProperty(example = "null", value = "When exempt, taxable with zero, suspended, not taxable, this field holds the official code number")
  public String getCofinsExemptLegalReasonCode() {
    return cofinsExemptLegalReasonCode;
  }

  public void setCofinsExemptLegalReasonCode(String cofinsExemptLegalReasonCode) {
    this.cofinsExemptLegalReasonCode = cofinsExemptLegalReasonCode;
  }

  public CfopConf cofinsExemptLegalReason(String cofinsExemptLegalReason) {
    this.cofinsExemptLegalReason = cofinsExemptLegalReason;
    return this;
  }

   /**
   * When specifi reason, this field has the description
   * @return cofinsExemptLegalReason
  **/
  @ApiModelProperty(example = "null", value = "When specifi reason, this field has the description")
  public String getCofinsExemptLegalReason() {
    return cofinsExemptLegalReason;
  }

  public void setCofinsExemptLegalReason(String cofinsExemptLegalReason) {
    this.cofinsExemptLegalReason = cofinsExemptLegalReason;
  }

  public CfopConf allowIPIcreditWhenInGoing(Boolean allowIPIcreditWhenInGoing) {
    this.allowIPIcreditWhenInGoing = allowIPIcreditWhenInGoing;
    return this;
  }

   /**
   * Inform that the process allow IPI credit to Input process
   * @return allowIPIcreditWhenInGoing
  **/
  @ApiModelProperty(example = "null", value = "Inform that the process allow IPI credit to Input process")
  public Boolean getAllowIPIcreditWhenInGoing() {
    return allowIPIcreditWhenInGoing;
  }

  public void setAllowIPIcreditWhenInGoing(Boolean allowIPIcreditWhenInGoing) {
    this.allowIPIcreditWhenInGoing = allowIPIcreditWhenInGoing;
  }

  public CfopConf icmsConf(List<IcmsTaxConf> icmsConf) {
    this.icmsConf = icmsConf;
    return this;
  }

  public CfopConf addIcmsConfItem(IcmsTaxConf icmsConfItem) {
    this.icmsConf.add(icmsConfItem);
    return this;
  }

   /**
   * the map key is state code
   * @return icmsConf
  **/
  @ApiModelProperty(example = "null", value = "the map key is state code")
  public List<IcmsTaxConf> getIcmsConf() {
    return icmsConf;
  }

  public void setIcmsConf(List<IcmsTaxConf> icmsConf) {
    this.icmsConf = icmsConf;
  }

  public CfopConf name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CfopConf description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CfopConf wayType(WayTypeEnum wayType) {
    this.wayType = wayType;
    return this;
  }

   /**
   * inform if the transaction is an operation to internalizing item or value
   * @return wayType
  **/
  @ApiModelProperty(example = "null", value = "inform if the transaction is an operation to internalizing item or value")
  public WayTypeEnum getWayType() {
    return wayType;
  }

  public void setWayType(WayTypeEnum wayType) {
    this.wayType = wayType;
  }

  public CfopConf codInState(Integer codInState) {
    this.codInState = codInState;
    return this;
  }

   /**
   * CFOP code (tax code operation) when the transactions are within the same state.
   * @return codInState
  **/
  @ApiModelProperty(example = "null", value = "CFOP code (tax code operation) when the transactions are within the same state.")
  public Integer getCodInState() {
    return codInState;
  }

  public void setCodInState(Integer codInState) {
    this.codInState = codInState;
  }

  public CfopConf codOtherState(Integer codOtherState) {
    this.codOtherState = codOtherState;
    return this;
  }

   /**
   * CFOP code (tax code operation) when the transactions are to another state.
   * @return codOtherState
  **/
  @ApiModelProperty(example = "null", value = "CFOP code (tax code operation) when the transactions are to another state.")
  public Integer getCodOtherState() {
    return codOtherState;
  }

  public void setCodOtherState(Integer codOtherState) {
    this.codOtherState = codOtherState;
  }

  public CfopConf codOtherCountry(Integer codOtherCountry) {
    this.codOtherCountry = codOtherCountry;
    return this;
  }

   /**
   * CFOP code (tax code operation) when the transactions are to another country.
   * @return codOtherCountry
  **/
  @ApiModelProperty(example = "null", value = "CFOP code (tax code operation) when the transactions are to another country.")
  public Integer getCodOtherCountry() {
    return codOtherCountry;
  }

  public void setCodOtherCountry(Integer codOtherCountry) {
    this.codOtherCountry = codOtherCountry;
  }

  public CfopConf cstICMSSameState(CstIcmsEnum cstICMSSameState) {
    this.cstICMSSameState = cstICMSSameState;
    return this;
  }

   /**
   * Get cstICMSSameState
   * @return cstICMSSameState
  **/
  @ApiModelProperty(example = "null", value = "")
  public CstIcmsEnum getCstICMSSameState() {
    return cstICMSSameState;
  }

  public void setCstICMSSameState(CstIcmsEnum cstICMSSameState) {
    this.cstICMSSameState = cstICMSSameState;
  }

  public CfopConf cstICMSOtherState(CstIcmsEnum cstICMSOtherState) {
    this.cstICMSOtherState = cstICMSOtherState;
    return this;
  }

   /**
   * Get cstICMSOtherState
   * @return cstICMSOtherState
  **/
  @ApiModelProperty(example = "null", value = "")
  public CstIcmsEnum getCstICMSOtherState() {
    return cstICMSOtherState;
  }

  public void setCstICMSOtherState(CstIcmsEnum cstICMSOtherState) {
    this.cstICMSOtherState = cstICMSOtherState;
  }

  public CfopConf cstICMSOtherCountry(CstIcmsEnum cstICMSOtherCountry) {
    this.cstICMSOtherCountry = cstICMSOtherCountry;
    return this;
  }

   /**
   * Get cstICMSOtherCountry
   * @return cstICMSOtherCountry
  **/
  @ApiModelProperty(example = "null", value = "")
  public CstIcmsEnum getCstICMSOtherCountry() {
    return cstICMSOtherCountry;
  }

  public void setCstICMSOtherCountry(CstIcmsEnum cstICMSOtherCountry) {
    this.cstICMSOtherCountry = cstICMSOtherCountry;
  }

  public CfopConf productType(ProductTypeEnum productType) {
    this.productType = productType;
    return this;
  }

   /**
   * this field is used to define right CFOP, one operation type can be specialized to item product, item merchandise or generic
   * @return productType
  **/
  @ApiModelProperty(example = "null", value = "this field is used to define right CFOP, one operation type can be specialized to item product, item merchandise or generic")
  public ProductTypeEnum getProductType() {
    return productType;
  }

  public void setProductType(ProductTypeEnum productType) {
    this.productType = productType;
  }

  public CfopConf operationToTaxPayerOtherState(Boolean operationToTaxPayerOtherState) {
    this.operationToTaxPayerOtherState = operationToTaxPayerOtherState;
    return this;
  }

   /**
   * field used to indicate an operation to ICMS tax payer
   * @return operationToTaxPayerOtherState
  **/
  @ApiModelProperty(example = "null", value = "field used to indicate an operation to ICMS tax payer")
  public Boolean getOperationToTaxPayerOtherState() {
    return operationToTaxPayerOtherState;
  }

  public void setOperationToTaxPayerOtherState(Boolean operationToTaxPayerOtherState) {
    this.operationToTaxPayerOtherState = operationToTaxPayerOtherState;
  }

  public CfopConf operationWithST(Boolean operationWithST) {
    this.operationWithST = operationWithST;
    return this;
  }

   /**
   * field used to indicate an operation to items sibject to ICMS-ST
   * @return operationWithST
  **/
  @ApiModelProperty(example = "null", value = "field used to indicate an operation to items sibject to ICMS-ST")
  public Boolean getOperationWithST() {
    return operationWithST;
  }

  public void setOperationWithST(Boolean operationWithST) {
    this.operationWithST = operationWithST;
  }

  public CfopConf operationToFreeZone(Boolean operationToFreeZone) {
    this.operationToFreeZone = operationToFreeZone;
    return this;
  }

   /**
   * field used to indicate an operation to free zone
   * @return operationToFreeZone
  **/
  @ApiModelProperty(example = "null", value = "field used to indicate an operation to free zone")
  public Boolean getOperationToFreeZone() {
    return operationToFreeZone;
  }

  public void setOperationToFreeZone(Boolean operationToFreeZone) {
    this.operationToFreeZone = operationToFreeZone;
  }

  public CfopConf specificForProductClass(SpecificForProductClassEnum specificForProductClass) {
    this.specificForProductClass = specificForProductClass;
    return this;
  }

   /**
   * field used to indicate an operation to some product class specifically
   * @return specificForProductClass
  **/
  @ApiModelProperty(example = "null", value = "field used to indicate an operation to some product class specifically")
  public SpecificForProductClassEnum getSpecificForProductClass() {
    return specificForProductClass;
  }

  public void setSpecificForProductClass(SpecificForProductClassEnum specificForProductClass) {
    this.specificForProductClass = specificForProductClass;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CfopConf cfopConf = (CfopConf) o;
    return Objects.equals(this.code, cfopConf.code) &&
        Objects.equals(this.stockImpact, cfopConf.stockImpact) &&
        Objects.equals(this.financialImpact, cfopConf.financialImpact) &&
        Objects.equals(this.cstIPI, cfopConf.cstIPI) &&
        Objects.equals(this.ipiLegalTaxClass, cfopConf.ipiLegalTaxClass) &&
        Objects.equals(this.accruablePISTaxation, cfopConf.accruablePISTaxation) &&
        Objects.equals(this.pisExemptLegalReasonCode, cfopConf.pisExemptLegalReasonCode) &&
        Objects.equals(this.pisExemptLegalReason, cfopConf.pisExemptLegalReason) &&
        Objects.equals(this.accruableCOFINSTaxation, cfopConf.accruableCOFINSTaxation) &&
        Objects.equals(this.cofinsExemptLegalReasonCode, cfopConf.cofinsExemptLegalReasonCode) &&
        Objects.equals(this.cofinsExemptLegalReason, cfopConf.cofinsExemptLegalReason) &&
        Objects.equals(this.allowIPIcreditWhenInGoing, cfopConf.allowIPIcreditWhenInGoing) &&
        Objects.equals(this.icmsConf, cfopConf.icmsConf) &&
        Objects.equals(this.name, cfopConf.name) &&
        Objects.equals(this.description, cfopConf.description) &&
        Objects.equals(this.wayType, cfopConf.wayType) &&
        Objects.equals(this.codInState, cfopConf.codInState) &&
        Objects.equals(this.codOtherState, cfopConf.codOtherState) &&
        Objects.equals(this.codOtherCountry, cfopConf.codOtherCountry) &&
        Objects.equals(this.cstICMSSameState, cfopConf.cstICMSSameState) &&
        Objects.equals(this.cstICMSOtherState, cfopConf.cstICMSOtherState) &&
        Objects.equals(this.cstICMSOtherCountry, cfopConf.cstICMSOtherCountry) &&
        Objects.equals(this.productType, cfopConf.productType) &&
        Objects.equals(this.operationToTaxPayerOtherState, cfopConf.operationToTaxPayerOtherState) &&
        Objects.equals(this.operationWithST, cfopConf.operationWithST) &&
        Objects.equals(this.operationToFreeZone, cfopConf.operationToFreeZone) &&
        Objects.equals(this.specificForProductClass, cfopConf.specificForProductClass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, stockImpact, financialImpact, cstIPI, ipiLegalTaxClass, accruablePISTaxation, pisExemptLegalReasonCode, pisExemptLegalReason, accruableCOFINSTaxation, cofinsExemptLegalReasonCode, cofinsExemptLegalReason, allowIPIcreditWhenInGoing, icmsConf, name, description, wayType, codInState, codOtherState, codOtherCountry, cstICMSSameState, cstICMSOtherState, cstICMSOtherCountry, productType, operationToTaxPayerOtherState, operationWithST, operationToFreeZone, specificForProductClass);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CfopConf {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    stockImpact: ").append(toIndentedString(stockImpact)).append("\n");
    sb.append("    financialImpact: ").append(toIndentedString(financialImpact)).append("\n");
    sb.append("    cstIPI: ").append(toIndentedString(cstIPI)).append("\n");
    sb.append("    ipiLegalTaxClass: ").append(toIndentedString(ipiLegalTaxClass)).append("\n");
    sb.append("    accruablePISTaxation: ").append(toIndentedString(accruablePISTaxation)).append("\n");
    sb.append("    pisExemptLegalReasonCode: ").append(toIndentedString(pisExemptLegalReasonCode)).append("\n");
    sb.append("    pisExemptLegalReason: ").append(toIndentedString(pisExemptLegalReason)).append("\n");
    sb.append("    accruableCOFINSTaxation: ").append(toIndentedString(accruableCOFINSTaxation)).append("\n");
    sb.append("    cofinsExemptLegalReasonCode: ").append(toIndentedString(cofinsExemptLegalReasonCode)).append("\n");
    sb.append("    cofinsExemptLegalReason: ").append(toIndentedString(cofinsExemptLegalReason)).append("\n");
    sb.append("    allowIPIcreditWhenInGoing: ").append(toIndentedString(allowIPIcreditWhenInGoing)).append("\n");
    sb.append("    icmsConf: ").append(toIndentedString(icmsConf)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    wayType: ").append(toIndentedString(wayType)).append("\n");
    sb.append("    codInState: ").append(toIndentedString(codInState)).append("\n");
    sb.append("    codOtherState: ").append(toIndentedString(codOtherState)).append("\n");
    sb.append("    codOtherCountry: ").append(toIndentedString(codOtherCountry)).append("\n");
    sb.append("    cstICMSSameState: ").append(toIndentedString(cstICMSSameState)).append("\n");
    sb.append("    cstICMSOtherState: ").append(toIndentedString(cstICMSOtherState)).append("\n");
    sb.append("    cstICMSOtherCountry: ").append(toIndentedString(cstICMSOtherCountry)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    operationToTaxPayerOtherState: ").append(toIndentedString(operationToTaxPayerOtherState)).append("\n");
    sb.append("    operationWithST: ").append(toIndentedString(operationWithST)).append("\n");
    sb.append("    operationToFreeZone: ").append(toIndentedString(operationToFreeZone)).append("\n");
    sb.append("    specificForProductClass: ").append(toIndentedString(specificForProductClass)).append("\n");
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

