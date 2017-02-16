package io.swagger.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@ApiModel(description="Filter this message application to specified tax cases. - taxtype - jurisdictionType ")
public class LegalReasonTaxScope  {
  

@XmlType(name="TaxTypeEnum")
@XmlEnum(String.class)
public enum TaxTypeEnum {

    @XmlEnumValue("NONE") NONE(String.valueOf("NONE")), @XmlEnumValue("INSS") INSS(String.valueOf("INSS")), @XmlEnumValue("IRRF") IRRF(String.valueOf("IRRF")), @XmlEnumValue("IRPJ") IRPJ(String.valueOf("IRPJ")), @XmlEnumValue("PIS") PIS(String.valueOf("PIS")), @XmlEnumValue("COFINS") COFINS(String.valueOf("COFINS")), @XmlEnumValue("CSLL") CSLL(String.valueOf("CSLL")), @XmlEnumValue("IPI") IPI(String.valueOf("IPI")), @XmlEnumValue("ICMS") ICMS(String.valueOf("ICMS")), @XmlEnumValue("II") II(String.valueOf("II")), @XmlEnumValue("IOF") IOF(String.valueOf("IOF")), @XmlEnumValue("ISS") ISS(String.valueOf("ISS")), @XmlEnumValue("APROXTOTALTAX") APROXTOTALTAX(String.valueOf("APROXTOTALTAX"));


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

  @ApiModelProperty(example = "null", required = true, value = "This is the Tax Type to apply legal messages. - 'NONE' - 'INSS' - 'IRRF' - 'IRPJ' - 'PIS' - 'COFINS' - 'CSLL' - 'IPI' - 'ICMS' - 'II' - 'IOF' - 'ISS' - 'APROXTOTALTAX' ")
  private TaxTypeEnum taxType = null;

@XmlType(name="SpecializedTaxTypeEnum")
@XmlEnum(String.class)
public enum SpecializedTaxTypeEnum {

    @XmlEnumValue("icms") ICMS(String.valueOf("icms")), @XmlEnumValue("icmsSt") ICMSST(String.valueOf("icmsSt")), @XmlEnumValue("icmsStSd") ICMSSTSD(String.valueOf("icmsStSd")), @XmlEnumValue("icmsPartOwn") ICMSPARTOWN(String.valueOf("icmsPartOwn")), @XmlEnumValue("icmsPartDest") ICMSPARTDEST(String.valueOf("icmsPartDest")), @XmlEnumValue("icmsDifaFCP") ICMSDIFAFCP(String.valueOf("icmsDifaFCP")), @XmlEnumValue("icmsDifaDest") ICMSDIFADEST(String.valueOf("icmsDifaDest")), @XmlEnumValue("icmsDifaRemet") ICMSDIFAREMET(String.valueOf("icmsDifaRemet")), @XmlEnumValue("icmsRf") ICMSRF(String.valueOf("icmsRf")), @XmlEnumValue("icmsDeson") ICMSDESON(String.valueOf("icmsDeson")), @XmlEnumValue("icmsCredsn") ICMSCREDSN(String.valueOf("icmsCredsn")), @XmlEnumValue("pis") PIS(String.valueOf("pis")), @XmlEnumValue("pisSt") PISST(String.valueOf("pisSt")), @XmlEnumValue("cofins") COFINS(String.valueOf("cofins")), @XmlEnumValue("cofinsSt") COFINSST(String.valueOf("cofinsSt")), @XmlEnumValue("ipi") IPI(String.valueOf("ipi")), @XmlEnumValue("ipiReturned") IPIRETURNED(String.valueOf("ipiReturned")), @XmlEnumValue("ii") II(String.valueOf("ii")), @XmlEnumValue("iof") IOF(String.valueOf("iof"));


    private String value;

    SpecializedTaxTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SpecializedTaxTypeEnum fromValue(String v) {
        for (SpecializedTaxTypeEnum b : SpecializedTaxTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "These are the specific tax types to which a message may be applied - 'icms' - 'icmsSt' - 'icmsStSd' - 'icmsPartOwn' - 'icmsPartDest' - 'icmsDifaFCP' - 'icmsDifaDest' - 'icmsDifaRemet' - 'icmsRf' - 'icmsDeson' - 'icmsCredsn' - 'pis' - 'pisSt' - 'cofins' - 'cofinsSt' - 'ipi' - 'ipiReturned' - 'ii' - 'iof' ")
  private SpecializedTaxTypeEnum specializedTaxType = null;

@XmlType(name="JurisdictionTypeEnum")
@XmlEnum(String.class)
public enum JurisdictionTypeEnum {

    @XmlEnumValue("NONE") NONE(String.valueOf("NONE")), @XmlEnumValue("City") CITY(String.valueOf("City")), @XmlEnumValue("State") STATE(String.valueOf("State")), @XmlEnumValue("Country") COUNTRY(String.valueOf("Country"));


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

  @ApiModelProperty(example = "null", required = true, value = "Types of jurisdiction - 'NONE' - 'City' - 'State' - 'Country' ")
  private JurisdictionTypeEnum jurisdictionType = null;
  @ApiModelProperty(example = "null", value = "Code to identify the Jurisdiction")
  private String jurisdictionIbgeCode = null;

 /**
   * This is the Tax Type to apply legal messages. - 'NONE' - 'INSS' - 'IRRF' - 'IRPJ' - 'PIS' - 'COFINS' - 'CSLL' - 'IPI' - 'ICMS' - 'II' - 'IOF' - 'ISS' - 'APROXTOTALTAX' 
   * @return taxType
  **/
  public TaxTypeEnum getTaxType() {
    return taxType;
  }
  public void setTaxType(TaxTypeEnum taxType) {
    this.taxType = taxType;
  }
 /**
   * These are the specific tax types to which a message may be applied - 'icms' - 'icmsSt' - 'icmsStSd' - 'icmsPartOwn' - 'icmsPartDest' - 'icmsDifaFCP' - 'icmsDifaDest' - 'icmsDifaRemet' - 'icmsRf' - 'icmsDeson' - 'icmsCredsn' - 'pis' - 'pisSt' - 'cofins' - 'cofinsSt' - 'ipi' - 'ipiReturned' - 'ii' - 'iof' 
   * @return specializedTaxType
  **/
  public SpecializedTaxTypeEnum getSpecializedTaxType() {
    return specializedTaxType;
  }
  public void setSpecializedTaxType(SpecializedTaxTypeEnum specializedTaxType) {
    this.specializedTaxType = specializedTaxType;
  }
 /**
   * Types of jurisdiction - 'NONE' - 'City' - 'State' - 'Country' 
   * @return jurisdictionType
  **/
  public JurisdictionTypeEnum getJurisdictionType() {
    return jurisdictionType;
  }
  public void setJurisdictionType(JurisdictionTypeEnum jurisdictionType) {
    this.jurisdictionType = jurisdictionType;
  }
 /**
   * Code to identify the Jurisdiction
   * @return jurisdictionIbgeCode
  **/
  public String getJurisdictionIbgeCode() {
    return jurisdictionIbgeCode;
  }
  public void setJurisdictionIbgeCode(String jurisdictionIbgeCode) {
    this.jurisdictionIbgeCode = jurisdictionIbgeCode;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegalReasonTaxScope {\n");
    
    sb.append("    taxType: ").append(toIndentedString(taxType)).append("\n");
    sb.append("    specializedTaxType: ").append(toIndentedString(specializedTaxType)).append("\n");
    sb.append("    jurisdictionType: ").append(toIndentedString(jurisdictionType)).append("\n");
    sb.append("    jurisdictionIbgeCode: ").append(toIndentedString(jurisdictionIbgeCode)).append("\n");
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

