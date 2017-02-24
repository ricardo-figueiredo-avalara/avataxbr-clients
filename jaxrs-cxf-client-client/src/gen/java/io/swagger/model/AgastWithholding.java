package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.AgastWithholdingCOFINS;
import io.swagger.model.AgastWithholdingCSLL;
import io.swagger.model.AgastWithholdingPIS;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@ApiModel(description="inform if this item is subject to withholding tax on service Transactions, default true")
public class AgastWithholding  {
  
  @ApiModelProperty(example = "null", value = "")
  private Boolean IRRF = null;
  @ApiModelProperty(example = "null", value = "reference id to TaxLegalReason")
  private String irRFLegalReason = null;
  @ApiModelProperty(example = "null", value = "Item subjecto to payroll discharge Item sujeto à desoneraçãode folha de pagamento ")
  private Boolean inSSSubjectToDischarge = null;
  @ApiModelProperty(example = "null", value = "")
  private Boolean INSS = null;
  @ApiModelProperty(example = "null", value = "reference id to TaxLegalReason")
  private String inSSLegalReason = null;
  @ApiModelProperty(example = "null", value = "")
  private Boolean inSsForSimples = null;
  @ApiModelProperty(example = "null", value = "reference id to TaxLegalReason")
  private String inSSForSimplesLegalReason = null;
  @ApiModelProperty(example = "null", value = "")
  private AgastWithholdingPIS PIS = null;
  @ApiModelProperty(example = "null", value = "")
  private AgastWithholdingCOFINS COFINS = null;
  @ApiModelProperty(example = "null", value = "")
  private AgastWithholdingCSLL CSLL = null;

 /**
   * Get IRRF
   * @return IRRF
  **/
  public Boolean getIRRF() {
    return IRRF;
  }
  public void setIRRF(Boolean IRRF) {
    this.IRRF = IRRF;
  }
 /**
   * reference id to TaxLegalReason
   * @return irRFLegalReason
  **/
  public String getIrRFLegalReason() {
    return irRFLegalReason;
  }
  public void setIrRFLegalReason(String irRFLegalReason) {
    this.irRFLegalReason = irRFLegalReason;
  }
 /**
   * Item subjecto to payroll discharge Item sujeto à desoneraçãode folha de pagamento 
   * @return inSSSubjectToDischarge
  **/
  public Boolean getInSSSubjectToDischarge() {
    return inSSSubjectToDischarge;
  }
  public void setInSSSubjectToDischarge(Boolean inSSSubjectToDischarge) {
    this.inSSSubjectToDischarge = inSSSubjectToDischarge;
  }
 /**
   * Get INSS
   * @return INSS
  **/
  public Boolean getINSS() {
    return INSS;
  }
  public void setINSS(Boolean INSS) {
    this.INSS = INSS;
  }
 /**
   * reference id to TaxLegalReason
   * @return inSSLegalReason
  **/
  public String getInSSLegalReason() {
    return inSSLegalReason;
  }
  public void setInSSLegalReason(String inSSLegalReason) {
    this.inSSLegalReason = inSSLegalReason;
  }
 /**
   * Get inSsForSimples
   * @return inSsForSimples
  **/
  public Boolean getInSsForSimples() {
    return inSsForSimples;
  }
  public void setInSsForSimples(Boolean inSsForSimples) {
    this.inSsForSimples = inSsForSimples;
  }
 /**
   * reference id to TaxLegalReason
   * @return inSSForSimplesLegalReason
  **/
  public String getInSSForSimplesLegalReason() {
    return inSSForSimplesLegalReason;
  }
  public void setInSSForSimplesLegalReason(String inSSForSimplesLegalReason) {
    this.inSSForSimplesLegalReason = inSSForSimplesLegalReason;
  }
 /**
   * Get PIS
   * @return PIS
  **/
  public AgastWithholdingPIS getPIS() {
    return PIS;
  }
  public void setPIS(AgastWithholdingPIS PIS) {
    this.PIS = PIS;
  }
 /**
   * Get COFINS
   * @return COFINS
  **/
  public AgastWithholdingCOFINS getCOFINS() {
    return COFINS;
  }
  public void setCOFINS(AgastWithholdingCOFINS COFINS) {
    this.COFINS = COFINS;
  }
 /**
   * Get CSLL
   * @return CSLL
  **/
  public AgastWithholdingCSLL getCSLL() {
    return CSLL;
  }
  public void setCSLL(AgastWithholdingCSLL CSLL) {
    this.CSLL = CSLL;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgastWithholding {\n");
    
    sb.append("    IRRF: ").append(toIndentedString(IRRF)).append("\n");
    sb.append("    irRFLegalReason: ").append(toIndentedString(irRFLegalReason)).append("\n");
    sb.append("    inSSSubjectToDischarge: ").append(toIndentedString(inSSSubjectToDischarge)).append("\n");
    sb.append("    INSS: ").append(toIndentedString(INSS)).append("\n");
    sb.append("    inSSLegalReason: ").append(toIndentedString(inSSLegalReason)).append("\n");
    sb.append("    inSsForSimples: ").append(toIndentedString(inSsForSimples)).append("\n");
    sb.append("    inSSForSimplesLegalReason: ").append(toIndentedString(inSSForSimplesLegalReason)).append("\n");
    sb.append("    PIS: ").append(toIndentedString(PIS)).append("\n");
    sb.append("    COFINS: ").append(toIndentedString(COFINS)).append("\n");
    sb.append("    CSLL: ").append(toIndentedString(CSLL)).append("\n");
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

