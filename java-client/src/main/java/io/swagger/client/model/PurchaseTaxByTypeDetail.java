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
 * PurchaseTaxByTypeDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-06T17:54:07.550Z")
public class PurchaseTaxByTypeDetail {
  @SerializedName("locationType")
  private String locationType = null;

  @SerializedName("jurisdictionName")
  private String jurisdictionName = null;

  /**
   * Type of jurisdiction - 'City' - 'State' - 'Country' 
   */
  public enum JurisdictionTypeEnum {
    @SerializedName("City")
    CITY("City"),
    
    @SerializedName("State")
    STATE("State"),
    
    @SerializedName("Country")
    COUNTRY("Country");

    private String value;

    JurisdictionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("jurisdictionType")
  private JurisdictionTypeEnum jurisdictionType = null;

  /**
   * Tax identificator - 'pis' - 'pisRf' - 'cofins' - 'cofinsRf' - 'csll' - 'csllRf' - 'irrf' - 'inssAr' - 'inssRf' - 'issRf' 
   */
  public enum TaxTypeEnum {
    @SerializedName("pis")
    PIS("pis"),
    
    @SerializedName("pisRf")
    PISRF("pisRf"),
    
    @SerializedName("cofins")
    COFINS("cofins"),
    
    @SerializedName("cofinsRf")
    COFINSRF("cofinsRf"),
    
    @SerializedName("csll")
    CSLL("csll"),
    
    @SerializedName("csllRf")
    CSLLRF("csllRf"),
    
    @SerializedName("irrf")
    IRRF("irrf"),
    
    @SerializedName("inssAr")
    INSSAR("inssAr"),
    
    @SerializedName("inssRf")
    INSSRF("inssRf"),
    
    @SerializedName("issRf")
    ISSRF("issRf");

    private String value;

    TaxTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("taxType")
  private TaxTypeEnum taxType = null;

  @SerializedName("rateType")
  private String rateType = null;

  @SerializedName("scenario")
  private String scenario = null;

  @SerializedName("subtotalTaxable")
  private Double subtotalTaxable = null;

  @SerializedName("rate")
  private Double rate = null;

  @SerializedName("tax")
  private Double tax = null;

  @SerializedName("exemptionCode")
  private String exemptionCode = null;

  @SerializedName("significantLocations")
  private List<String> significantLocations = new ArrayList<String>();

  /**
   * This string with type of rule - 'SELLER' - 'BUYER' - 'TRANSACTION' - 'ITEM' - 'TAX' 
   */
  public enum TaxRuleTypeEnum {
    @SerializedName("SELLER")
    SELLER("SELLER"),
    
    @SerializedName("BUYER")
    BUYER("BUYER"),
    
    @SerializedName("TRANSACTION")
    TRANSACTION("TRANSACTION"),
    
    @SerializedName("ITEM")
    ITEM("ITEM"),
    
    @SerializedName("TAX")
    TAX("TAX");

    private String value;

    TaxRuleTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("taxRuleType")
  private TaxRuleTypeEnum taxRuleType = null;

  public PurchaseTaxByTypeDetail locationType(String locationType) {
    this.locationType = locationType;
    return this;
  }

   /**
   * This string captures the applicable location type. Location used for calc. Buyer or Seller
   * @return locationType
  **/
  @ApiModelProperty(example = "null", value = "This string captures the applicable location type. Location used for calc. Buyer or Seller")
  public String getLocationType() {
    return locationType;
  }

  public void setLocationType(String locationType) {
    this.locationType = locationType;
  }

  public PurchaseTaxByTypeDetail jurisdictionName(String jurisdictionName) {
    this.jurisdictionName = jurisdictionName;
    return this;
  }

   /**
   * Jurisdiction used for calctax amount
   * @return jurisdictionName
  **/
  @ApiModelProperty(example = "null", value = "Jurisdiction used for calctax amount")
  public String getJurisdictionName() {
    return jurisdictionName;
  }

  public void setJurisdictionName(String jurisdictionName) {
    this.jurisdictionName = jurisdictionName;
  }

  public PurchaseTaxByTypeDetail jurisdictionType(JurisdictionTypeEnum jurisdictionType) {
    this.jurisdictionType = jurisdictionType;
    return this;
  }

   /**
   * Type of jurisdiction - 'City' - 'State' - 'Country' 
   * @return jurisdictionType
  **/
  @ApiModelProperty(example = "null", value = "Type of jurisdiction - 'City' - 'State' - 'Country' ")
  public JurisdictionTypeEnum getJurisdictionType() {
    return jurisdictionType;
  }

  public void setJurisdictionType(JurisdictionTypeEnum jurisdictionType) {
    this.jurisdictionType = jurisdictionType;
  }

  public PurchaseTaxByTypeDetail taxType(TaxTypeEnum taxType) {
    this.taxType = taxType;
    return this;
  }

   /**
   * Tax identificator - 'pis' - 'pisRf' - 'cofins' - 'cofinsRf' - 'csll' - 'csllRf' - 'irrf' - 'inssAr' - 'inssRf' - 'issRf' 
   * @return taxType
  **/
  @ApiModelProperty(example = "null", value = "Tax identificator - 'pis' - 'pisRf' - 'cofins' - 'cofinsRf' - 'csll' - 'csllRf' - 'irrf' - 'inssAr' - 'inssRf' - 'issRf' ")
  public TaxTypeEnum getTaxType() {
    return taxType;
  }

  public void setTaxType(TaxTypeEnum taxType) {
    this.taxType = taxType;
  }

  public PurchaseTaxByTypeDetail rateType(String rateType) {
    this.rateType = rateType;
    return this;
  }

   /**
   * Name of configuration rate
   * @return rateType
  **/
  @ApiModelProperty(example = "null", value = "Name of configuration rate")
  public String getRateType() {
    return rateType;
  }

  public void setRateType(String rateType) {
    this.rateType = rateType;
  }

  public PurchaseTaxByTypeDetail scenario(String scenario) {
    this.scenario = scenario;
    return this;
  }

   /**
   * This string captures the transaction scenario used to calculate the tax for this tax type. Scenarios are specific to the tax type. This field provides information about how the tax engine interpreted the transaction information that was passed in.
   * @return scenario
  **/
  @ApiModelProperty(example = "null", value = "This string captures the transaction scenario used to calculate the tax for this tax type. Scenarios are specific to the tax type. This field provides information about how the tax engine interpreted the transaction information that was passed in.")
  public String getScenario() {
    return scenario;
  }

  public void setScenario(String scenario) {
    this.scenario = scenario;
  }

  public PurchaseTaxByTypeDetail subtotalTaxable(Double subtotalTaxable) {
    this.subtotalTaxable = subtotalTaxable;
    return this;
  }

   /**
   * This decimal captures how much of the lineAmount was taxable by this tax, calc base
   * @return subtotalTaxable
  **/
  @ApiModelProperty(example = "null", value = "This decimal captures how much of the lineAmount was taxable by this tax, calc base")
  public Double getSubtotalTaxable() {
    return subtotalTaxable;
  }

  public void setSubtotalTaxable(Double subtotalTaxable) {
    this.subtotalTaxable = subtotalTaxable;
  }

  public PurchaseTaxByTypeDetail rate(Double rate) {
    this.rate = rate;
    return this;
  }

   /**
   * This decimal captures the tax rate for this tax.3.00 (3%)
   * @return rate
  **/
  @ApiModelProperty(example = "null", value = "This decimal captures the tax rate for this tax.3.00 (3%)")
  public Double getRate() {
    return rate;
  }

  public void setRate(Double rate) {
    this.rate = rate;
  }

  public PurchaseTaxByTypeDetail tax(Double tax) {
    this.tax = tax;
    return this;
  }

   /**
   * This decimal captures how much of the lineAmount was taxable by this tax
   * @return tax
  **/
  @ApiModelProperty(example = "null", value = "This decimal captures how much of the lineAmount was taxable by this tax")
  public Double getTax() {
    return tax;
  }

  public void setTax(Double tax) {
    this.tax = tax;
  }

  public PurchaseTaxByTypeDetail exemptionCode(String exemptionCode) {
    this.exemptionCode = exemptionCode;
    return this;
  }

   /**
   * This string is required if is exempt
   * @return exemptionCode
  **/
  @ApiModelProperty(example = "null", value = "This string is required if is exempt")
  public String getExemptionCode() {
    return exemptionCode;
  }

  public void setExemptionCode(String exemptionCode) {
    this.exemptionCode = exemptionCode;
  }

  public PurchaseTaxByTypeDetail significantLocations(List<String> significantLocations) {
    this.significantLocations = significantLocations;
    return this;
  }

  public PurchaseTaxByTypeDetail addSignificantLocationsItem(String significantLocationsItem) {
    this.significantLocations.add(significantLocationsItem);
    return this;
  }

   /**
   * This element captures the list of locations that contributed to the tax determination. for BR16 Service is Buyer and Seller Address
   * @return significantLocations
  **/
  @ApiModelProperty(example = "null", value = "This element captures the list of locations that contributed to the tax determination. for BR16 Service is Buyer and Seller Address")
  public List<String> getSignificantLocations() {
    return significantLocations;
  }

  public void setSignificantLocations(List<String> significantLocations) {
    this.significantLocations = significantLocations;
  }

  public PurchaseTaxByTypeDetail taxRuleType(TaxRuleTypeEnum taxRuleType) {
    this.taxRuleType = taxRuleType;
    return this;
  }

   /**
   * This string with type of rule - 'SELLER' - 'BUYER' - 'TRANSACTION' - 'ITEM' - 'TAX' 
   * @return taxRuleType
  **/
  @ApiModelProperty(example = "null", value = "This string with type of rule - 'SELLER' - 'BUYER' - 'TRANSACTION' - 'ITEM' - 'TAX' ")
  public TaxRuleTypeEnum getTaxRuleType() {
    return taxRuleType;
  }

  public void setTaxRuleType(TaxRuleTypeEnum taxRuleType) {
    this.taxRuleType = taxRuleType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PurchaseTaxByTypeDetail purchaseTaxByTypeDetail = (PurchaseTaxByTypeDetail) o;
    return Objects.equals(this.locationType, purchaseTaxByTypeDetail.locationType) &&
        Objects.equals(this.jurisdictionName, purchaseTaxByTypeDetail.jurisdictionName) &&
        Objects.equals(this.jurisdictionType, purchaseTaxByTypeDetail.jurisdictionType) &&
        Objects.equals(this.taxType, purchaseTaxByTypeDetail.taxType) &&
        Objects.equals(this.rateType, purchaseTaxByTypeDetail.rateType) &&
        Objects.equals(this.scenario, purchaseTaxByTypeDetail.scenario) &&
        Objects.equals(this.subtotalTaxable, purchaseTaxByTypeDetail.subtotalTaxable) &&
        Objects.equals(this.rate, purchaseTaxByTypeDetail.rate) &&
        Objects.equals(this.tax, purchaseTaxByTypeDetail.tax) &&
        Objects.equals(this.exemptionCode, purchaseTaxByTypeDetail.exemptionCode) &&
        Objects.equals(this.significantLocations, purchaseTaxByTypeDetail.significantLocations) &&
        Objects.equals(this.taxRuleType, purchaseTaxByTypeDetail.taxRuleType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationType, jurisdictionName, jurisdictionType, taxType, rateType, scenario, subtotalTaxable, rate, tax, exemptionCode, significantLocations, taxRuleType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseTaxByTypeDetail {\n");
    
    sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
    sb.append("    jurisdictionName: ").append(toIndentedString(jurisdictionName)).append("\n");
    sb.append("    jurisdictionType: ").append(toIndentedString(jurisdictionType)).append("\n");
    sb.append("    taxType: ").append(toIndentedString(taxType)).append("\n");
    sb.append("    rateType: ").append(toIndentedString(rateType)).append("\n");
    sb.append("    scenario: ").append(toIndentedString(scenario)).append("\n");
    sb.append("    subtotalTaxable: ").append(toIndentedString(subtotalTaxable)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    exemptionCode: ").append(toIndentedString(exemptionCode)).append("\n");
    sb.append("    significantLocations: ").append(toIndentedString(significantLocations)).append("\n");
    sb.append("    taxRuleType: ").append(toIndentedString(taxRuleType)).append("\n");
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

