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

public class DetailsCalculatedTax  {
  
  @ApiModelProperty(example = "null", value = "This string captures the applicable location type. Location used for calc. Buyer or Seller")
  private String locationType = null;
  @ApiModelProperty(example = "null", value = "Jurisdiction used for calctax amount")
  private String jurisdictionName = null;

@XmlType(name="JurisdictionTypeEnum")
@XmlEnum(String.class)
public enum JurisdictionTypeEnum {

    @XmlEnumValue("city") CITY(String.valueOf("city")), @XmlEnumValue("state") STATE(String.valueOf("state")), @XmlEnumValue("country") COUNTRY(String.valueOf("country"));


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

  @ApiModelProperty(example = "null", value = "Type of jurisdiction")
  private JurisdictionTypeEnum jurisdictionType = null;

@XmlType(name="TaxTypeEnum")
@XmlEnum(String.class)
public enum TaxTypeEnum {

    @XmlEnumValue("icms") ICMS(String.valueOf("icms")), @XmlEnumValue("icmsSt") ICMSST(String.valueOf("icmsSt")), @XmlEnumValue("icmsStSd") ICMSSTSD(String.valueOf("icmsStSd")), @XmlEnumValue("icmsPartOwn") ICMSPARTOWN(String.valueOf("icmsPartOwn")), @XmlEnumValue("icmsPartDest") ICMSPARTDEST(String.valueOf("icmsPartDest")), @XmlEnumValue("icmsDifaFCP") ICMSDIFAFCP(String.valueOf("icmsDifaFCP")), @XmlEnumValue("icmsDifaDest") ICMSDIFADEST(String.valueOf("icmsDifaDest")), @XmlEnumValue("icmsDifaRemet") ICMSDIFAREMET(String.valueOf("icmsDifaRemet")), @XmlEnumValue("icmsRf") ICMSRF(String.valueOf("icmsRf")), @XmlEnumValue("icmsDeson") ICMSDESON(String.valueOf("icmsDeson")), @XmlEnumValue("icmsCredsn") ICMSCREDSN(String.valueOf("icmsCredsn")), @XmlEnumValue("pis") PIS(String.valueOf("pis")), @XmlEnumValue("pisSt") PISST(String.valueOf("pisSt")), @XmlEnumValue("cofins") COFINS(String.valueOf("cofins")), @XmlEnumValue("cofinsSt") COFINSST(String.valueOf("cofinsSt")), @XmlEnumValue("ipi") IPI(String.valueOf("ipi")), @XmlEnumValue("ipiReturned") IPIRETURNED(String.valueOf("ipiReturned")), @XmlEnumValue("ii") II(String.valueOf("ii")), @XmlEnumValue("iof") IOF(String.valueOf("iof")), @XmlEnumValue("aproxtribState") APROXTRIBSTATE(String.valueOf("aproxtribState")), @XmlEnumValue("aproxtribFed") APROXTRIBFED(String.valueOf("aproxtribFed")), @XmlEnumValue("aproxtrib") APROXTRIB(String.valueOf("aproxtrib"));


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

  @ApiModelProperty(example = "null", value = "Tax identificator")
  private TaxTypeEnum taxType = null;
  @ApiModelProperty(example = "null", value = "Name of configuration rate")
  private String rateType = null;
  @ApiModelProperty(example = "null", value = "This string captures the transaction scenario used to calculate the tax for this tax type. Scenarios are specific to the tax type. This field provides information about how the tax engine interpreted the transaction information that was passed in.")
  private String scenario = null;
  @ApiModelProperty(example = "null", value = "This decimal captures how much of the lineAmount was taxable by this tax, calc base")
  private Double subtotalTaxable = null;
  @ApiModelProperty(example = "null", value = "This decimal captures the tax rate for this tax.3.00 (3%)")
  private Double rate = null;
  @ApiModelProperty(example = "null", value = "This decimal captures how much of the lineAmount was taxable by this tax")
  private Double tax = null;
  @ApiModelProperty(example = "null", value = "This string is required if is exempt")
  private String exemptionCode = null;
  @ApiModelProperty(example = "null", value = "This element captures the list of locations that contributed to the tax determination. for Service is Buyer and Seller Address")
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

  @ApiModelProperty(example = "null", value = "This string with type of rule")
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
   * Type of jurisdiction
   * @return jurisdictionType
  **/
  public JurisdictionTypeEnum getJurisdictionType() {
    return jurisdictionType;
  }
  public void setJurisdictionType(JurisdictionTypeEnum jurisdictionType) {
    this.jurisdictionType = jurisdictionType;
  }
 /**
   * Tax identificator
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
   * This element captures the list of locations that contributed to the tax determination. for Service is Buyer and Seller Address
   * @return significantLocations
  **/
  public List<String> getSignificantLocations() {
    return significantLocations;
  }
  public void setSignificantLocations(List<String> significantLocations) {
    this.significantLocations = significantLocations;
  }
 /**
   * This string with type of rule
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
    sb.append("class DetailsCalculatedTax {\n");
    
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

