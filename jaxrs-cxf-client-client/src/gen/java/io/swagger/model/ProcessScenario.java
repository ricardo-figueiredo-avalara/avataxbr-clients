package io.swagger.model;

import io.swagger.model.CfopConf;
import io.swagger.model.IcmsTaxConf;
import io.swagger.model.TaxConf;
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

public class ProcessScenario  {
  
  @ApiModelProperty(example = "null", required = true, value = "Process code to Identify this configuration, its is unique by Accounty Id or when standard, its has priority when the code match with the standard code.")
  private String code = null;
  @ApiModelProperty(example = "null", value = "Inform that the process has inventory impact.")
  private Boolean stockImpact = null;
  @ApiModelProperty(example = "null", value = "Inform that the process has financial impact.")
  private Boolean financialImpact = null;

@XmlType(name="CstIPIEnum")
@XmlEnum(String.class)
public enum CstIPIEnum {

    @XmlEnumValue("T") T(String.valueOf("T")), @XmlEnumValue("Z") Z(String.valueOf("Z")), @XmlEnumValue("E") E(String.valueOf("E")), @XmlEnumValue("H") H(String.valueOf("H")), @XmlEnumValue("N") N(String.valueOf("N")), @XmlEnumValue("I") I(String.valueOf("I")), @XmlEnumValue("O") O(String.valueOf("O")), @XmlEnumValue("OZ") OZ(String.valueOf("OZ"));


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

  @ApiModelProperty(example = "null", value = "Inform if this process is subject to IPI taxation on output process - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'H'  # SUSPENDED - 'N'  # NO TAXABLE     - 'I'  # IMMUNE - 'O'  # OTHER - 'OZ' # OTHER AND ZERO VALUES ")
  private CstIPIEnum cstIPI = null;
  @ApiModelProperty(example = "null", value = "Legal tax classificação for IPI (enquadramento) When the processo has CST IPI 52 or 54, is mandatory inform Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo=mCnJajU4BKU= ")
  private String ipiLegalTaxClass = null;

@XmlType(name="AccruablePISTaxationEnum")
@XmlEnum(String.class)
public enum AccruablePISTaxationEnum {

    @XmlEnumValue("T") T(String.valueOf("T")), @XmlEnumValue("Z") Z(String.valueOf("Z")), @XmlEnumValue("E") E(String.valueOf("E")), @XmlEnumValue("H") H(String.valueOf("H")), @XmlEnumValue("N") N(String.valueOf("N")), @XmlEnumValue("O") O(String.valueOf("O")), @XmlEnumValue("OZ") OZ(String.valueOf("OZ"));


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

  @ApiModelProperty(example = "null", value = "Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE - 'O' # OTHER - 'OZ'# OTHER AND ZERO VALUES ")
  private AccruablePISTaxationEnum accruablePISTaxation = null;
  @ApiModelProperty(example = "null", value = "When exempt, taxable with zero, suspended, not taxable, this field holds the official code number")
  private String pisExemptLegalReasonCode = null;
  @ApiModelProperty(example = "null", value = "When specifi reason, this field has the description")
  private String pisExemptLegalReason = null;

@XmlType(name="AccruableCOFINSTaxationEnum")
@XmlEnum(String.class)
public enum AccruableCOFINSTaxationEnum {

    @XmlEnumValue("T") T(String.valueOf("T")), @XmlEnumValue("Z") Z(String.valueOf("Z")), @XmlEnumValue("E") E(String.valueOf("E")), @XmlEnumValue("H") H(String.valueOf("H")), @XmlEnumValue("N") N(String.valueOf("N")), @XmlEnumValue("O") O(String.valueOf("O")), @XmlEnumValue("OZ") OZ(String.valueOf("OZ"));


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

  @ApiModelProperty(example = "null", value = "Inform if this item by nature is subject to COFINS taxation or exempt - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'H'  # SUSPENDED - 'N'  # NO TAXABLE     - 'O'  # OTHER - 'OZ' # OTHER AND ZERO VALUES ")
  private AccruableCOFINSTaxationEnum accruableCOFINSTaxation = null;
  @ApiModelProperty(example = "null", value = "When exempt, taxable with zero, suspended, not taxable, this field holds the official code number")
  private String cofinsExemptLegalReasonCode = null;
  @ApiModelProperty(example = "null", value = "When specifi reason, this field has the description")
  private String cofinsExemptLegalReason = null;
  @ApiModelProperty(example = "null", value = "Inform that the process allow IPI credit to Input process")
  private Boolean allowIPIcreditWhenInGoing = null;
  @ApiModelProperty(example = "null", value = "the map key is state code")
  private List<IcmsTaxConf> icmsConf = new ArrayList<IcmsTaxConf>();
  @ApiModelProperty(example = "null", required = true, value = "Process name to Identify this configuration")
  private String name = null;

@XmlType(name="TypeEnum")
@XmlEnum(String.class)
public enum TypeEnum {

    @XmlEnumValue("SALES") SALES(String.valueOf("SALES")), @XmlEnumValue("PURCHASE") PURCHASE(String.valueOf("PURCHASE")), @XmlEnumValue("SALES_RETURN") SALES_RETURN(String.valueOf("SALES_RETURN")), @XmlEnumValue("PURCHASE_RETURN") PURCHASE_RETURN(String.valueOf("PURCHASE_RETURN")), @XmlEnumValue("TRANSFER_RETURN") TRANSFER_RETURN(String.valueOf("TRANSFER_RETURN")), @XmlEnumValue("SHIPPING") SHIPPING(String.valueOf("SHIPPING")), @XmlEnumValue("SHIPPING_RETURN") SHIPPING_RETURN(String.valueOf("SHIPPING_RETURN")), @XmlEnumValue("TRANSFER") TRANSFER(String.valueOf("TRANSFER")), @XmlEnumValue("RECEIPT_AJUSTE") RECEIPT_AJUSTE(String.valueOf("RECEIPT_AJUSTE")), @XmlEnumValue("TRANSFER_AJUSTE") TRANSFER_AJUSTE(String.valueOf("TRANSFER_AJUSTE"));


    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TypeEnum fromValue(String v) {
        for (TypeEnum b : TypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "")
  private TypeEnum type = null;

@XmlType(name="WayTypeEnum")
@XmlEnum(String.class)
public enum WayTypeEnum {

    @XmlEnumValue("in") IN(String.valueOf("in")), @XmlEnumValue("out") OUT(String.valueOf("out"));


    private String value;

    WayTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static WayTypeEnum fromValue(String v) {
        for (WayTypeEnum b : WayTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "inform if the transaction is an operation to internalizing (receive) item or value")
  private WayTypeEnum wayType = null;

@XmlType(name="GoalEnum")
@XmlEnum(String.class)
public enum GoalEnum {

    @XmlEnumValue("Normal") NORMAL(String.valueOf("Normal")), @XmlEnumValue("Complementary") COMPLEMENTARY(String.valueOf("Complementary")), @XmlEnumValue("Voided") VOIDED(String.valueOf("Voided")), @XmlEnumValue("Replacement") REPLACEMENT(String.valueOf("Replacement")), @XmlEnumValue("Return") RETURN(String.valueOf("Return")), @XmlEnumValue("Adjustment") ADJUSTMENT(String.valueOf("Adjustment"));


    private String value;

    GoalEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static GoalEnum fromValue(String v) {
        for (GoalEnum b : GoalEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "")
  private GoalEnum goal = null;
  @ApiModelProperty(example = "null", value = "inform that the configuration process overwrites the cfop configuration.")
  private Boolean overWriteCFOP = null;
  @ApiModelProperty(example = "null", value = "")
  private List<CfopConf> cfops = new ArrayList<CfopConf>();

 /**
   * Process code to Identify this configuration, its is unique by Accounty Id or when standard, its has priority when the code match with the standard code.
   * @return code
  **/
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }
 /**
   * Inform that the process has inventory impact.
   * @return stockImpact
  **/
  public Boolean getStockImpact() {
    return stockImpact;
  }
  public void setStockImpact(Boolean stockImpact) {
    this.stockImpact = stockImpact;
  }
 /**
   * Inform that the process has financial impact.
   * @return financialImpact
  **/
  public Boolean getFinancialImpact() {
    return financialImpact;
  }
  public void setFinancialImpact(Boolean financialImpact) {
    this.financialImpact = financialImpact;
  }
 /**
   * Inform if this process is subject to IPI taxation on output process - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'H'  # SUSPENDED - 'N'  # NO TAXABLE     - 'I'  # IMMUNE - 'O'  # OTHER - 'OZ' # OTHER AND ZERO VALUES 
   * @return cstIPI
  **/
  public CstIPIEnum getCstIPI() {
    return cstIPI;
  }
  public void setCstIPI(CstIPIEnum cstIPI) {
    this.cstIPI = cstIPI;
  }
 /**
   * Legal tax classificação for IPI (enquadramento) When the processo has CST IPI 52 or 54, is mandatory inform Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo=mCnJajU4BKU= 
   * @return ipiLegalTaxClass
  **/
  public String getIpiLegalTaxClass() {
    return ipiLegalTaxClass;
  }
  public void setIpiLegalTaxClass(String ipiLegalTaxClass) {
    this.ipiLegalTaxClass = ipiLegalTaxClass;
  }
 /**
   * Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE - 'O' # OTHER - 'OZ'# OTHER AND ZERO VALUES 
   * @return accruablePISTaxation
  **/
  public AccruablePISTaxationEnum getAccruablePISTaxation() {
    return accruablePISTaxation;
  }
  public void setAccruablePISTaxation(AccruablePISTaxationEnum accruablePISTaxation) {
    this.accruablePISTaxation = accruablePISTaxation;
  }
 /**
   * When exempt, taxable with zero, suspended, not taxable, this field holds the official code number
   * @return pisExemptLegalReasonCode
  **/
  public String getPisExemptLegalReasonCode() {
    return pisExemptLegalReasonCode;
  }
  public void setPisExemptLegalReasonCode(String pisExemptLegalReasonCode) {
    this.pisExemptLegalReasonCode = pisExemptLegalReasonCode;
  }
 /**
   * When specifi reason, this field has the description
   * @return pisExemptLegalReason
  **/
  public String getPisExemptLegalReason() {
    return pisExemptLegalReason;
  }
  public void setPisExemptLegalReason(String pisExemptLegalReason) {
    this.pisExemptLegalReason = pisExemptLegalReason;
  }
 /**
   * Inform if this item by nature is subject to COFINS taxation or exempt - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'H'  # SUSPENDED - 'N'  # NO TAXABLE     - 'O'  # OTHER - 'OZ' # OTHER AND ZERO VALUES 
   * @return accruableCOFINSTaxation
  **/
  public AccruableCOFINSTaxationEnum getAccruableCOFINSTaxation() {
    return accruableCOFINSTaxation;
  }
  public void setAccruableCOFINSTaxation(AccruableCOFINSTaxationEnum accruableCOFINSTaxation) {
    this.accruableCOFINSTaxation = accruableCOFINSTaxation;
  }
 /**
   * When exempt, taxable with zero, suspended, not taxable, this field holds the official code number
   * @return cofinsExemptLegalReasonCode
  **/
  public String getCofinsExemptLegalReasonCode() {
    return cofinsExemptLegalReasonCode;
  }
  public void setCofinsExemptLegalReasonCode(String cofinsExemptLegalReasonCode) {
    this.cofinsExemptLegalReasonCode = cofinsExemptLegalReasonCode;
  }
 /**
   * When specifi reason, this field has the description
   * @return cofinsExemptLegalReason
  **/
  public String getCofinsExemptLegalReason() {
    return cofinsExemptLegalReason;
  }
  public void setCofinsExemptLegalReason(String cofinsExemptLegalReason) {
    this.cofinsExemptLegalReason = cofinsExemptLegalReason;
  }
 /**
   * Inform that the process allow IPI credit to Input process
   * @return allowIPIcreditWhenInGoing
  **/
  public Boolean getAllowIPIcreditWhenInGoing() {
    return allowIPIcreditWhenInGoing;
  }
  public void setAllowIPIcreditWhenInGoing(Boolean allowIPIcreditWhenInGoing) {
    this.allowIPIcreditWhenInGoing = allowIPIcreditWhenInGoing;
  }
 /**
   * the map key is state code
   * @return icmsConf
  **/
  public List<IcmsTaxConf> getIcmsConf() {
    return icmsConf;
  }
  public void setIcmsConf(List<IcmsTaxConf> icmsConf) {
    this.icmsConf = icmsConf;
  }
 /**
   * Process name to Identify this configuration
   * @return name
  **/
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
 /**
   * Get type
   * @return type
  **/
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }
 /**
   * inform if the transaction is an operation to internalizing (receive) item or value
   * @return wayType
  **/
  public WayTypeEnum getWayType() {
    return wayType;
  }
  public void setWayType(WayTypeEnum wayType) {
    this.wayType = wayType;
  }
 /**
   * Get goal
   * @return goal
  **/
  public GoalEnum getGoal() {
    return goal;
  }
  public void setGoal(GoalEnum goal) {
    this.goal = goal;
  }
 /**
   * inform that the configuration process overwrites the cfop configuration.
   * @return overWriteCFOP
  **/
  public Boolean getOverWriteCFOP() {
    return overWriteCFOP;
  }
  public void setOverWriteCFOP(Boolean overWriteCFOP) {
    this.overWriteCFOP = overWriteCFOP;
  }
 /**
   * Get cfops
   * @return cfops
  **/
  public List<CfopConf> getCfops() {
    return cfops;
  }
  public void setCfops(List<CfopConf> cfops) {
    this.cfops = cfops;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessScenario {\n");
    
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
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    wayType: ").append(toIndentedString(wayType)).append("\n");
    sb.append("    goal: ").append(toIndentedString(goal)).append("\n");
    sb.append("    overWriteCFOP: ").append(toIndentedString(overWriteCFOP)).append("\n");
    sb.append("    cfops: ").append(toIndentedString(cfops)).append("\n");
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

