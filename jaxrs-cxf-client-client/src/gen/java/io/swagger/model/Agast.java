package io.swagger.model;

import io.swagger.model.AgastCodeType;
import io.swagger.model.AgastIcmsConf;
import io.swagger.model.TaxTypeRate;
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

public class Agast  {
  
  @ApiModelProperty(example = "null", required = true, value = "Agast Code. AGAST (Avalara Goods and Services Types) are preset products with default tax definitions available to be used as provided or copied to create an specific comapany item.")
  private String code = null;
  @ApiModelProperty(example = "null", value = "Agast Description")
  private String description = null;
  @ApiModelProperty(example = "null", value = "harmonized code, NCM or LC 116")
  private String hsCode = null;
  @ApiModelProperty(example = "null", value = "hsCode Exception for IPI tax")
  private Integer ex = null;
  @ApiModelProperty(example = "null", value = "tax substitution code - Codigo especificador da Substuicao Tributaria")
  private String cest = null;
  @ApiModelProperty(example = "null", value = "GTIN NUMBER")
  private String cean = null;
  @ApiModelProperty(example = "null", value = "")
  private AgastCodeType codeType = null;

@XmlType(name="CstIPIEnum")
@XmlEnum(String.class)
public enum CstIPIEnum {

    @XmlEnumValue("50") _50(String.valueOf("50")), @XmlEnumValue("51") _51(String.valueOf("51")), @XmlEnumValue("52") _52(String.valueOf("52")), @XmlEnumValue("53") _53(String.valueOf("53")), @XmlEnumValue("54") _54(String.valueOf("54"));


    private String value;

    CstIPIEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CstIPIEnum fromValue(String v) {
        for (CstIPIEnum b : CstIPIEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "Inform if this process is subject to IPI taxation on output process - '50' # Saída Tributada - '51' # Saída Tributável com Alíquota Zero - '52' # Saída Isenta - '53' # Saída Não-Tributada - '54' # Saída Imune ")
  private CstIPIEnum cstIPI = null;
  @ApiModelProperty(example = "null", value = "Legal tax classificação for IPI (enquadramento tributário) When the process has CST IPI 52 or 54, it is mandatory to inform a Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo=mCnJajU4BKU= ")
  private String ipiLegalTaxClass = null;

@XmlType(name="PisCofinsTaxReportingEnum")
@XmlEnum(String.class)
public enum PisCofinsTaxReportingEnum {

    @XmlEnumValue("cumulative") CUMULATIVE(String.valueOf("cumulative")), @XmlEnumValue("noCumulative") NOCUMULATIVE(String.valueOf("noCumulative"));


    private String value;

    PisCofinsTaxReportingEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PisCofinsTaxReportingEnum fromValue(String v) {
        for (PisCofinsTaxReportingEnum b : PisCofinsTaxReportingEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "when the company is Real Profit inform if this item is cumulative or no cumulative by default")
  private PisCofinsTaxReportingEnum pisCofinsTaxReporting = null;

@XmlType(name="AccruablePISTaxationEnum")
@XmlEnum(String.class)
public enum AccruablePISTaxationEnum {

    @XmlEnumValue("T") T(String.valueOf("T")), @XmlEnumValue("Z") Z(String.valueOf("Z")), @XmlEnumValue("E") E(String.valueOf("E")), @XmlEnumValue("H") H(String.valueOf("H")), @XmlEnumValue("N") N(String.valueOf("N"));


    private String value;

    AccruablePISTaxationEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AccruablePISTaxationEnum fromValue(String v) {
        for (AccruablePISTaxationEnum b : AccruablePISTaxationEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE ")
  private AccruablePISTaxationEnum accruablePISTaxation = null;

@XmlType(name="AccruableCOFINSTaxationEnum")
@XmlEnum(String.class)
public enum AccruableCOFINSTaxationEnum {

    @XmlEnumValue("T") T(String.valueOf("T")), @XmlEnumValue("Z") Z(String.valueOf("Z")), @XmlEnumValue("E") E(String.valueOf("E")), @XmlEnumValue("H") H(String.valueOf("H")), @XmlEnumValue("N") N(String.valueOf("N"));


    private String value;

    AccruableCOFINSTaxationEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AccruableCOFINSTaxationEnum fromValue(String v) {
        for (AccruableCOFINSTaxationEnum b : AccruableCOFINSTaxationEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "Inform if this item by nature is subject to COFINS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE ")
  private AccruableCOFINSTaxationEnum accruableCOFINSTaxation = null;

@XmlType(name="AccruableCSLLTaxationEnum")
@XmlEnum(String.class)
public enum AccruableCSLLTaxationEnum {

    @XmlEnumValue("T") T(String.valueOf("T")), @XmlEnumValue("E") E(String.valueOf("E"));


    private String value;

    AccruableCSLLTaxationEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AccruableCSLLTaxationEnum fromValue(String v) {
        for (AccruableCSLLTaxationEnum b : AccruableCSLLTaxationEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "Inform if this item by nature is subject to CSLL taxation or exempt - 'T' # TAXABLE - 'E' # EXEMPT ")
  private AccruableCSLLTaxationEnum accruableCSLLTaxation = null;
  @ApiModelProperty(example = "null", value = "for service items with City Jurisdiction, inform where the ISS tax is due")
  private Boolean issDueatDestination = null;
  @ApiModelProperty(example = "null", value = "on Real Profit Purchase transaction, inform if this item allows tax credits when it is non-cumulative")
  private Boolean pisCofinsCreditNotAllowed = null;

@XmlType(name="IssTaxationEnum")
@XmlEnum(String.class)
public enum IssTaxationEnum {

    @XmlEnumValue("T") T(String.valueOf("T")), @XmlEnumValue("E") E(String.valueOf("E")), @XmlEnumValue("F") F(String.valueOf("F")), @XmlEnumValue("A") A(String.valueOf("A")), @XmlEnumValue("L") L(String.valueOf("L")), @XmlEnumValue("I") I(String.valueOf("I"));


    private String value;

    IssTaxationEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static IssTaxationEnum fromValue(String v) {
        for (IssTaxationEnum b : IssTaxationEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "- 'T' # TAXABLE - TRIBUTÁVEL INCLUSIVE PARA EXPORTAÇÃO' - 'E' # TAXABLE WITH EXEMPTION FOR EXPORTS - ISENTO PARA SERVIÇOS PRESTADOS AO EXTERIOR (DEFAULT) - 'F' # EXEMPT - 'A' # SUSPENDED FOR ADMINISTRATIVE REASON - 'L' # SUSPENDED FOR LEGAL DECISION - 'I' # IMMUNE ")
  private IssTaxationEnum issTaxation = null;
  @ApiModelProperty(example = "null", value = "This is an array of tax object related to an agast.")
  private List<TaxTypeRate> federalTaxRate = new ArrayList<TaxTypeRate>();

@XmlType(name="SpecialProductClassEnum")
@XmlEnum(String.class)
public enum SpecialProductClassEnum {

    @XmlEnumValue("OTHERS") OTHERS(String.valueOf("OTHERS")), @XmlEnumValue("COMMUNICATION") COMMUNICATION(String.valueOf("COMMUNICATION")), @XmlEnumValue("ENERGY") ENERGY(String.valueOf("ENERGY")), @XmlEnumValue("TRANSPORT") TRANSPORT(String.valueOf("TRANSPORT")), @XmlEnumValue("FUEL AND LUBRIFICANT") FUEL_AND_LUBRIFICANT(String.valueOf("FUEL AND LUBRIFICANT")), @XmlEnumValue("VEHICLE") VEHICLE(String.valueOf("VEHICLE")), @XmlEnumValue("ALCOHOLIC BEVERAGES") ALCOHOLIC_BEVERAGES(String.valueOf("ALCOHOLIC BEVERAGES")), @XmlEnumValue("WEAPONS") WEAPONS(String.valueOf("WEAPONS")), @XmlEnumValue("AMMO") AMMO(String.valueOf("AMMO")), @XmlEnumValue("PERFUME") PERFUME(String.valueOf("PERFUME")), @XmlEnumValue("TOBACCO") TOBACCO(String.valueOf("TOBACCO"));


    private String value;

    SpecialProductClassEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SpecialProductClassEnum fromValue(String v) {
        for (SpecialProductClassEnum b : SpecialProductClassEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "")
  private SpecialProductClassEnum specialProductClass = null;
  @ApiModelProperty(example = "null", value = "One per State")
  private List<AgastIcmsConf> icmsConf = new ArrayList<AgastIcmsConf>();

 /**
   * Agast Code. AGAST (Avalara Goods and Services Types) are preset products with default tax definitions available to be used as provided or copied to create an specific comapany item.
   * @return code
  **/
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }
 /**
   * Agast Description
   * @return description
  **/
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
 /**
   * harmonized code, NCM or LC 116
   * @return hsCode
  **/
  public String getHsCode() {
    return hsCode;
  }
  public void setHsCode(String hsCode) {
    this.hsCode = hsCode;
  }
 /**
   * hsCode Exception for IPI tax
   * @return ex
  **/
  public Integer getEx() {
    return ex;
  }
  public void setEx(Integer ex) {
    this.ex = ex;
  }
 /**
   * tax substitution code - Codigo especificador da Substuicao Tributaria
   * @return cest
  **/
  public String getCest() {
    return cest;
  }
  public void setCest(String cest) {
    this.cest = cest;
  }
 /**
   * GTIN NUMBER
   * @return cean
  **/
  public String getCean() {
    return cean;
  }
  public void setCean(String cean) {
    this.cean = cean;
  }
 /**
   * Get codeType
   * @return codeType
  **/
  public AgastCodeType getCodeType() {
    return codeType;
  }
  public void setCodeType(AgastCodeType codeType) {
    this.codeType = codeType;
  }
 /**
   * Inform if this process is subject to IPI taxation on output process - '50' # Saída Tributada - '51' # Saída Tributável com Alíquota Zero - '52' # Saída Isenta - '53' # Saída Não-Tributada - '54' # Saída Imune 
   * @return cstIPI
  **/
  public CstIPIEnum getCstIPI() {
    return cstIPI;
  }
  public void setCstIPI(CstIPIEnum cstIPI) {
    this.cstIPI = cstIPI;
  }
 /**
   * Legal tax classificação for IPI (enquadramento tributário) When the process has CST IPI 52 or 54, it is mandatory to inform a Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo=mCnJajU4BKU= 
   * @return ipiLegalTaxClass
  **/
  public String getIpiLegalTaxClass() {
    return ipiLegalTaxClass;
  }
  public void setIpiLegalTaxClass(String ipiLegalTaxClass) {
    this.ipiLegalTaxClass = ipiLegalTaxClass;
  }
 /**
   * when the company is Real Profit inform if this item is cumulative or no cumulative by default
   * @return pisCofinsTaxReporting
  **/
  public PisCofinsTaxReportingEnum getPisCofinsTaxReporting() {
    return pisCofinsTaxReporting;
  }
  public void setPisCofinsTaxReporting(PisCofinsTaxReportingEnum pisCofinsTaxReporting) {
    this.pisCofinsTaxReporting = pisCofinsTaxReporting;
  }
 /**
   * Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE 
   * @return accruablePISTaxation
  **/
  public AccruablePISTaxationEnum getAccruablePISTaxation() {
    return accruablePISTaxation;
  }
  public void setAccruablePISTaxation(AccruablePISTaxationEnum accruablePISTaxation) {
    this.accruablePISTaxation = accruablePISTaxation;
  }
 /**
   * Inform if this item by nature is subject to COFINS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE 
   * @return accruableCOFINSTaxation
  **/
  public AccruableCOFINSTaxationEnum getAccruableCOFINSTaxation() {
    return accruableCOFINSTaxation;
  }
  public void setAccruableCOFINSTaxation(AccruableCOFINSTaxationEnum accruableCOFINSTaxation) {
    this.accruableCOFINSTaxation = accruableCOFINSTaxation;
  }
 /**
   * Inform if this item by nature is subject to CSLL taxation or exempt - 'T' # TAXABLE - 'E' # EXEMPT 
   * @return accruableCSLLTaxation
  **/
  public AccruableCSLLTaxationEnum getAccruableCSLLTaxation() {
    return accruableCSLLTaxation;
  }
  public void setAccruableCSLLTaxation(AccruableCSLLTaxationEnum accruableCSLLTaxation) {
    this.accruableCSLLTaxation = accruableCSLLTaxation;
  }
 /**
   * for service items with City Jurisdiction, inform where the ISS tax is due
   * @return issDueatDestination
  **/
  public Boolean getIssDueatDestination() {
    return issDueatDestination;
  }
  public void setIssDueatDestination(Boolean issDueatDestination) {
    this.issDueatDestination = issDueatDestination;
  }
 /**
   * on Real Profit Purchase transaction, inform if this item allows tax credits when it is non-cumulative
   * @return pisCofinsCreditNotAllowed
  **/
  public Boolean getPisCofinsCreditNotAllowed() {
    return pisCofinsCreditNotAllowed;
  }
  public void setPisCofinsCreditNotAllowed(Boolean pisCofinsCreditNotAllowed) {
    this.pisCofinsCreditNotAllowed = pisCofinsCreditNotAllowed;
  }
 /**
   * - 'T' # TAXABLE - TRIBUTÁVEL INCLUSIVE PARA EXPORTAÇÃO' - 'E' # TAXABLE WITH EXEMPTION FOR EXPORTS - ISENTO PARA SERVIÇOS PRESTADOS AO EXTERIOR (DEFAULT) - 'F' # EXEMPT - 'A' # SUSPENDED FOR ADMINISTRATIVE REASON - 'L' # SUSPENDED FOR LEGAL DECISION - 'I' # IMMUNE 
   * @return issTaxation
  **/
  public IssTaxationEnum getIssTaxation() {
    return issTaxation;
  }
  public void setIssTaxation(IssTaxationEnum issTaxation) {
    this.issTaxation = issTaxation;
  }
 /**
   * This is an array of tax object related to an agast.
   * @return federalTaxRate
  **/
  public List<TaxTypeRate> getFederalTaxRate() {
    return federalTaxRate;
  }
  public void setFederalTaxRate(List<TaxTypeRate> federalTaxRate) {
    this.federalTaxRate = federalTaxRate;
  }
 /**
   * Get specialProductClass
   * @return specialProductClass
  **/
  public SpecialProductClassEnum getSpecialProductClass() {
    return specialProductClass;
  }
  public void setSpecialProductClass(SpecialProductClassEnum specialProductClass) {
    this.specialProductClass = specialProductClass;
  }
 /**
   * One per State
   * @return icmsConf
  **/
  public List<AgastIcmsConf> getIcmsConf() {
    return icmsConf;
  }
  public void setIcmsConf(List<AgastIcmsConf> icmsConf) {
    this.icmsConf = icmsConf;
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
    sb.append("    accruableCOFINSTaxation: ").append(toIndentedString(accruableCOFINSTaxation)).append("\n");
    sb.append("    accruableCSLLTaxation: ").append(toIndentedString(accruableCSLLTaxation)).append("\n");
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

