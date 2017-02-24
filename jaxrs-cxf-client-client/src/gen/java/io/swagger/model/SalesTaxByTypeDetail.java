package io.swagger.model;

import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class SalesTaxByTypeDetail  {
  
  @ApiModelProperty(example = "null", value = "This string captures the applicable location type. Location used for calc. Buyer or Seller")
  private String locationType = null;
  @ApiModelProperty(example = "null", value = "Jurisdiction used for calctax amount")
  private String jurisdictionName = null;

@XmlType(name="JurisdictionTypeEnum")
@XmlEnum(String.class)
public enum JurisdictionTypeEnum {

    @XmlEnumValue("City") CITY(String.valueOf("City")), @XmlEnumValue("State") STATE(String.valueOf("State")), @XmlEnumValue("Country") COUNTRY(String.valueOf("Country"));


    private String value;

    JurisdictionTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static JurisdictionTypeEnum fromValue(String v) {
        for (JurisdictionTypeEnum b : JurisdictionTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "Type of jurisdiction - 'City' - 'State' - 'Country' ")
  private JurisdictionTypeEnum jurisdictionType = null;

@XmlType(name="TaxTypeEnum")
@XmlEnum(String.class)
public enum TaxTypeEnum {

    @XmlEnumValue("aproxtribCity") APROXTRIBCITY(String.valueOf("aproxtribCity")), @XmlEnumValue("aproxtribFed") APROXTRIBFED(String.valueOf("aproxtribFed")), @XmlEnumValue("pis") PIS(String.valueOf("pis")), @XmlEnumValue("pisRf") PISRF(String.valueOf("pisRf")), @XmlEnumValue("cofins") COFINS(String.valueOf("cofins")), @XmlEnumValue("cofinsRf") COFINSRF(String.valueOf("cofinsRf")), @XmlEnumValue("csll") CSLL(String.valueOf("csll")), @XmlEnumValue("csllRf") CSLLRF(String.valueOf("csllRf")), @XmlEnumValue("irrf") IRRF(String.valueOf("irrf")), @XmlEnumValue("inss") INSS(String.valueOf("inss")), @XmlEnumValue("inssRf") INSSRF(String.valueOf("inssRf")), @XmlEnumValue("iss") ISS(String.valueOf("iss")), @XmlEnumValue("issRf") ISSRF(String.valueOf("issRf")), @XmlEnumValue("irpj") IRPJ(String.valueOf("irpj"));


    private String value;

    TaxTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TaxTypeEnum fromValue(String v) {
        for (TaxTypeEnum b : TaxTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "Tax identificator - 'aproxtribCity' - 'aproxtribFed' - 'pis' - 'pisRf' - 'cofins' - 'cofinsRf' - 'csll' - 'csllRf' - 'irrf' - 'inss' - 'inssRf' - 'iss' - 'issRf' - 'irpj' ")
  private TaxTypeEnum taxType = null;
  @ApiModelProperty(example = "null", value = "Name of configuration rate")
  private String rateType = null;
  @ApiModelProperty(example = "null", value = "This string captures the transaction scenario used to calculate the tax for this tax type. Scenarios are specific to the tax type. This field provides information about how the tax engine interpreted the transaction information that was passed in.")
  private String scenario = null;
  @ApiModelProperty(example = "null", value = "This decimal captures how much of the lineAmount was taxable by this tax, calc base")
  private Double subtotalTaxable = null;
  @ApiModelProperty(example = "null", value = "This decimal captures how much of the lineAmount was non-taxed. This is simply the line amount minus the taxable.")
  private Double subtotalExempt = null;
  @ApiModelProperty(example = "null", value = "This decimal captures the tax rate for this tax.3.00 (3%)")
  private Double rate = null;
  @ApiModelProperty(example = "null", value = "This decimal captures how much of the lineAmount was taxable by this tax")
  private Double tax = null;
  @ApiModelProperty(example = "null", value = "This string is required if is exempt")
  private String exemptionCode = null;
  @ApiModelProperty(example = "null", value = "This element captures the list of locations that contributed to the tax determination. for BR16 Service is Buyer and Seller Address")
  private List<String> significantLocations = new ArrayList<String>();

@XmlType(name="TaxRuleTypeEnum")
@XmlEnum(String.class)
public enum TaxRuleTypeEnum {

    @XmlEnumValue("SELLER") SELLER(String.valueOf("SELLER")), @XmlEnumValue("BUYER") BUYER(String.valueOf("BUYER")), @XmlEnumValue("TRANSACTION") TRANSACTION(String.valueOf("TRANSACTION")), @XmlEnumValue("ITEM") ITEM(String.valueOf("ITEM")), @XmlEnumValue("TAX") TAX(String.valueOf("TAX"));


    private String value;

    TaxRuleTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TaxRuleTypeEnum fromValue(String v) {
        for (TaxRuleTypeEnum b : TaxRuleTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "This string with type of rule - 'SELLER' - 'BUYER' - 'TRANSACTION' - 'ITEM' - 'TAX' ")
  private TaxRuleTypeEnum taxRuleType = null;

 /**
   * This string captures the applicable location type. Location used for calc. Buyer or Seller
   * @return locationType
  **/
  public String getLocationType() {
    return locationType;
  }
  public void setLocationType(String locationType) {
    this.locationType = locationType;
  }
 /**
   * Jurisdiction used for calctax amount
   * @return jurisdictionName
  **/
  public String getJurisdictionName() {
    return jurisdictionName;
  }
  public void setJurisdictionName(String jurisdictionName) {
    this.jurisdictionName = jurisdictionName;
  }
 /**
   * Type of jurisdiction - 'City' - 'State' - 'Country' 
   * @return jurisdictionType
  **/
  public JurisdictionTypeEnum getJurisdictionType() {
    return jurisdictionType;
  }
  public void setJurisdictionType(JurisdictionTypeEnum jurisdictionType) {
    this.jurisdictionType = jurisdictionType;
  }
 /**
   * Tax identificator - 'aproxtribCity' - 'aproxtribFed' - 'pis' - 'pisRf' - 'cofins' - 'cofinsRf' - 'csll' - 'csllRf' - 'irrf' - 'inss' - 'inssRf' - 'iss' - 'issRf' - 'irpj' 
   * @return taxType
  **/
  public TaxTypeEnum getTaxType() {
    return taxType;
  }
  public void setTaxType(TaxTypeEnum taxType) {
    this.taxType = taxType;
  }
 /**
   * Name of configuration rate
   * @return rateType
  **/
  public String getRateType() {
    return rateType;
  }
  public void setRateType(String rateType) {
    this.rateType = rateType;
  }
 /**
   * This string captures the transaction scenario used to calculate the tax for this tax type. Scenarios are specific to the tax type. This field provides information about how the tax engine interpreted the transaction information that was passed in.
   * @return scenario
  **/
  public String getScenario() {
    return scenario;
  }
  public void setScenario(String scenario) {
    this.scenario = scenario;
  }
 /**
   * This decimal captures how much of the lineAmount was taxable by this tax, calc base
   * @return subtotalTaxable
  **/
  public Double getSubtotalTaxable() {
    return subtotalTaxable;
  }
  public void setSubtotalTaxable(Double subtotalTaxable) {
    this.subtotalTaxable = subtotalTaxable;
  }
 /**
   * This decimal captures how much of the lineAmount was non-taxed. This is simply the line amount minus the taxable.
   * @return subtotalExempt
  **/
  public Double getSubtotalExempt() {
    return subtotalExempt;
  }
  public void setSubtotalExempt(Double subtotalExempt) {
    this.subtotalExempt = subtotalExempt;
  }
 /**
   * This decimal captures the tax rate for this tax.3.00 (3%)
   * @return rate
  **/
  public Double getRate() {
    return rate;
  }
  public void setRate(Double rate) {
    this.rate = rate;
  }
 /**
   * This decimal captures how much of the lineAmount was taxable by this tax
   * @return tax
  **/
  public Double getTax() {
    return tax;
  }
  public void setTax(Double tax) {
    this.tax = tax;
  }
 /**
   * This string is required if is exempt
   * @return exemptionCode
  **/
  public String getExemptionCode() {
    return exemptionCode;
  }
  public void setExemptionCode(String exemptionCode) {
    this.exemptionCode = exemptionCode;
  }
 /**
   * This element captures the list of locations that contributed to the tax determination. for BR16 Service is Buyer and Seller Address
   * @return significantLocations
  **/
  public List<String> getSignificantLocations() {
    return significantLocations;
  }
  public void setSignificantLocations(List<String> significantLocations) {
    this.significantLocations = significantLocations;
  }
 /**
   * This string with type of rule - 'SELLER' - 'BUYER' - 'TRANSACTION' - 'ITEM' - 'TAX' 
   * @return taxRuleType
  **/
  public TaxRuleTypeEnum getTaxRuleType() {
    return taxRuleType;
  }
  public void setTaxRuleType(TaxRuleTypeEnum taxRuleType) {
    this.taxRuleType = taxRuleType;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesTaxByTypeDetail {\n");
    
    sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
    sb.append("    jurisdictionName: ").append(toIndentedString(jurisdictionName)).append("\n");
    sb.append("    jurisdictionType: ").append(toIndentedString(jurisdictionType)).append("\n");
    sb.append("    taxType: ").append(toIndentedString(taxType)).append("\n");
    sb.append("    rateType: ").append(toIndentedString(rateType)).append("\n");
    sb.append("    scenario: ").append(toIndentedString(scenario)).append("\n");
    sb.append("    subtotalTaxable: ").append(toIndentedString(subtotalTaxable)).append("\n");
    sb.append("    subtotalExempt: ").append(toIndentedString(subtotalExempt)).append("\n");
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

