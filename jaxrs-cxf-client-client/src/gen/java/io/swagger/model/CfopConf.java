package io.swagger.model;

import io.swagger.model.CstIcmsEnum;
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

public class CfopConf  {
  
  @ApiModelProperty(example = "null", required = true, value = "main unique identificator")
  private String code = null;
  @ApiModelProperty(example = "null", value = "Inform that the process has inventory impact.")
  private Boolean stockImpact = null;
  @ApiModelProperty(example = "null", value = "Inform that the process has financial impact.")
  private Boolean financialImpact = null;

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
  @ApiModelProperty(example = "null", value = "Legal tax classificação for IPI (enquadramento) When the processo has CST IPI 52 or 54, is mandatory inform Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo=mCnJajU4BKU= ")
  private String ipiLegalTaxClass = null;

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
  @ApiModelProperty(example = "null", value = "When exempt, taxable with zero, suspended, not taxable, this field holds the official code number")
  private String pisExemptLegalReasonCode = null;
  @ApiModelProperty(example = "null", value = "When specifi reason, this field has the description")
  private String pisExemptLegalReason = null;

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
  @ApiModelProperty(example = "null", value = "When exempt, taxable with zero, suspended, not taxable, this field holds the official code number")
  private String cofinsExemptLegalReasonCode = null;
  @ApiModelProperty(example = "null", value = "When specifi reason, this field has the description")
  private String cofinsExemptLegalReason = null;
  @ApiModelProperty(example = "null", value = "Inform that the process allow IPI credit to Input process")
  private Boolean allowIPIcreditWhenInGoing = null;
  @ApiModelProperty(example = "null", value = "the map key is state code")
  private List<IcmsTaxConf> icmsConf = new ArrayList<IcmsTaxConf>();
  @ApiModelProperty(example = "null", required = true, value = "")
  private String name = null;
  @ApiModelProperty(example = "null", value = "")
  private String description = null;

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

  @ApiModelProperty(example = "null", value = "inform if the transaction is an operation to internalizing item or value")
  private WayTypeEnum wayType = null;
  @ApiModelProperty(example = "null", value = "CFOP code (tax code operation) when the transactions are within the same state.")
  private Integer codInState = null;
  @ApiModelProperty(example = "null", value = "CFOP code (tax code operation) when the transactions are to another state.")
  private Integer codOtherState = null;
  @ApiModelProperty(example = "null", value = "CFOP code (tax code operation) when the transactions are to another country.")
  private Integer codOtherCountry = null;
  @ApiModelProperty(example = "null", value = "")
  private CstIcmsEnum cstICMSSameState = null;
  @ApiModelProperty(example = "null", value = "")
  private CstIcmsEnum cstICMSOtherState = null;
  @ApiModelProperty(example = "null", value = "")
  private CstIcmsEnum cstICMSOtherCountry = null;

@XmlType(name="ProductTypeEnum")
@XmlEnum(String.class)
public enum ProductTypeEnum {

    @XmlEnumValue("FOR PRODUCT") FOR_PRODUCT(String.valueOf("FOR PRODUCT")), @XmlEnumValue("FOR MERCHANDISE") FOR_MERCHANDISE(String.valueOf("FOR MERCHANDISE")), @XmlEnumValue("NO RESTRICTION") NO_RESTRICTION(String.valueOf("NO RESTRICTION"));


    private String value;

    ProductTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ProductTypeEnum fromValue(String v) {
        for (ProductTypeEnum b : ProductTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "this field is used to define right CFOP, one operation type can be specialized to item product, item merchandise or generic")
  private ProductTypeEnum productType = null;
  @ApiModelProperty(example = "null", value = "field used to indicate an operation to ICMS tax payer")
  private Boolean operationToTaxPayerOtherState = null;
  @ApiModelProperty(example = "null", value = "field used to indicate an operation to items sibject to ICMS-ST")
  private Boolean operationWithST = null;
  @ApiModelProperty(example = "null", value = "field used to indicate an operation to free zone")
  private Boolean operationToFreeZone = null;

@XmlType(name="SpecificForProductClassEnum")
@XmlEnum(String.class)
public enum SpecificForProductClassEnum {

    @XmlEnumValue("OTHERS") OTHERS(String.valueOf("OTHERS")), @XmlEnumValue("COMMUNICATION") COMMUNICATION(String.valueOf("COMMUNICATION")), @XmlEnumValue("ENERGY") ENERGY(String.valueOf("ENERGY")), @XmlEnumValue("TRANSPORT") TRANSPORT(String.valueOf("TRANSPORT")), @XmlEnumValue("FUEL AND LUBRIFICANT") FUEL_AND_LUBRIFICANT(String.valueOf("FUEL AND LUBRIFICANT")), @XmlEnumValue("VEHICLE") VEHICLE(String.valueOf("VEHICLE")), @XmlEnumValue("ALCOHOLIC BEVERAGES") ALCOHOLIC_BEVERAGES(String.valueOf("ALCOHOLIC BEVERAGES")), @XmlEnumValue("WEAPONS") WEAPONS(String.valueOf("WEAPONS")), @XmlEnumValue("AMMO") AMMO(String.valueOf("AMMO")), @XmlEnumValue("PERFUM") PERFUM(String.valueOf("PERFUM")), @XmlEnumValue("TOBACCO") TOBACCO(String.valueOf("TOBACCO"));


    private String value;

    SpecificForProductClassEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SpecificForProductClassEnum fromValue(String v) {
        for (SpecificForProductClassEnum b : SpecificForProductClassEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "field used to indicate an operation to some product class specifically")
  private SpecificForProductClassEnum specificForProductClass = null;

 /**
   * main unique identificator
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
   * Get name
   * @return name
  **/
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
 /**
   * Get description
   * @return description
  **/
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
 /**
   * inform if the transaction is an operation to internalizing item or value
   * @return wayType
  **/
  public WayTypeEnum getWayType() {
    return wayType;
  }
  public void setWayType(WayTypeEnum wayType) {
    this.wayType = wayType;
  }
 /**
   * CFOP code (tax code operation) when the transactions are within the same state.
   * @return codInState
  **/
  public Integer getCodInState() {
    return codInState;
  }
  public void setCodInState(Integer codInState) {
    this.codInState = codInState;
  }
 /**
   * CFOP code (tax code operation) when the transactions are to another state.
   * @return codOtherState
  **/
  public Integer getCodOtherState() {
    return codOtherState;
  }
  public void setCodOtherState(Integer codOtherState) {
    this.codOtherState = codOtherState;
  }
 /**
   * CFOP code (tax code operation) when the transactions are to another country.
   * @return codOtherCountry
  **/
  public Integer getCodOtherCountry() {
    return codOtherCountry;
  }
  public void setCodOtherCountry(Integer codOtherCountry) {
    this.codOtherCountry = codOtherCountry;
  }
 /**
   * Get cstICMSSameState
   * @return cstICMSSameState
  **/
  public CstIcmsEnum getCstICMSSameState() {
    return cstICMSSameState;
  }
  public void setCstICMSSameState(CstIcmsEnum cstICMSSameState) {
    this.cstICMSSameState = cstICMSSameState;
  }
 /**
   * Get cstICMSOtherState
   * @return cstICMSOtherState
  **/
  public CstIcmsEnum getCstICMSOtherState() {
    return cstICMSOtherState;
  }
  public void setCstICMSOtherState(CstIcmsEnum cstICMSOtherState) {
    this.cstICMSOtherState = cstICMSOtherState;
  }
 /**
   * Get cstICMSOtherCountry
   * @return cstICMSOtherCountry
  **/
  public CstIcmsEnum getCstICMSOtherCountry() {
    return cstICMSOtherCountry;
  }
  public void setCstICMSOtherCountry(CstIcmsEnum cstICMSOtherCountry) {
    this.cstICMSOtherCountry = cstICMSOtherCountry;
  }
 /**
   * this field is used to define right CFOP, one operation type can be specialized to item product, item merchandise or generic
   * @return productType
  **/
  public ProductTypeEnum getProductType() {
    return productType;
  }
  public void setProductType(ProductTypeEnum productType) {
    this.productType = productType;
  }
 /**
   * field used to indicate an operation to ICMS tax payer
   * @return operationToTaxPayerOtherState
  **/
  public Boolean getOperationToTaxPayerOtherState() {
    return operationToTaxPayerOtherState;
  }
  public void setOperationToTaxPayerOtherState(Boolean operationToTaxPayerOtherState) {
    this.operationToTaxPayerOtherState = operationToTaxPayerOtherState;
  }
 /**
   * field used to indicate an operation to items sibject to ICMS-ST
   * @return operationWithST
  **/
  public Boolean getOperationWithST() {
    return operationWithST;
  }
  public void setOperationWithST(Boolean operationWithST) {
    this.operationWithST = operationWithST;
  }
 /**
   * field used to indicate an operation to free zone
   * @return operationToFreeZone
  **/
  public Boolean getOperationToFreeZone() {
    return operationToFreeZone;
  }
  public void setOperationToFreeZone(Boolean operationToFreeZone) {
    this.operationToFreeZone = operationToFreeZone;
  }
 /**
   * field used to indicate an operation to some product class specifically
   * @return specificForProductClass
  **/
  public SpecificForProductClassEnum getSpecificForProductClass() {
    return specificForProductClass;
  }
  public void setSpecificForProductClass(SpecificForProductClassEnum specificForProductClass) {
    this.specificForProductClass = specificForProductClass;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

