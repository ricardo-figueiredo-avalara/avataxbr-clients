package io.swagger.model;

import io.swagger.model.IcmsTaxConf;
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

public class TaxConf  {
  
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

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxConf {\n");
    
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

