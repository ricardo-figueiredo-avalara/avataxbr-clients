package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class LineForGoodsIcmsTaxRelief  {
  
  @ApiModelProperty(example = "null", required = true, value = "When item transaction subject to desoneration, this is the reason code - 1 # Táxi; - 3 # Produtor Agropecuário; - 4 # Frotista/Locadora; - 5 # Diplomático/Consular; - 6 # Utilitários e Motocicletas da Amazônia Ocidental e Áreas de Livre Comércio (Resolução 714/88 e 790/94 – CONTRAN e suas alterações); - 7 # SUFRAMA; - 8 # Venda a órgão Público; - 9 # Outros - 10 # Deficiente Condutor - 11 # Deficiente não condutor - 12 # Fomento agropecuário - 16 # Olimpíadas Rio 2016 ")
  private Integer icmsTaxReliefReasonCode = null;
  @ApiModelProperty(example = "null", value = "ICMS Tax base rate discount  (desconto na base do ICMS referetne a desoneração)")
  private Double icmsReliefTaxRate = null;
  @ApiModelProperty(example = "null", value = "Amount for Icms Relief (desoneração)")
  private Double icmsReliefTaxAmount = null;

 /**
   * When item transaction subject to desoneration, this is the reason code - 1 # Táxi; - 3 # Produtor Agropecuário; - 4 # Frotista/Locadora; - 5 # Diplomático/Consular; - 6 # Utilitários e Motocicletas da Amazônia Ocidental e Áreas de Livre Comércio (Resolução 714/88 e 790/94 – CONTRAN e suas alterações); - 7 # SUFRAMA; - 8 # Venda a órgão Público; - 9 # Outros - 10 # Deficiente Condutor - 11 # Deficiente não condutor - 12 # Fomento agropecuário - 16 # Olimpíadas Rio 2016 
   * @return icmsTaxReliefReasonCode
  **/
  public Integer getIcmsTaxReliefReasonCode() {
    return icmsTaxReliefReasonCode;
  }
  public void setIcmsTaxReliefReasonCode(Integer icmsTaxReliefReasonCode) {
    this.icmsTaxReliefReasonCode = icmsTaxReliefReasonCode;
  }
 /**
   * ICMS Tax base rate discount  (desconto na base do ICMS referetne a desoneração)
   * @return icmsReliefTaxRate
  **/
  public Double getIcmsReliefTaxRate() {
    return icmsReliefTaxRate;
  }
  public void setIcmsReliefTaxRate(Double icmsReliefTaxRate) {
    this.icmsReliefTaxRate = icmsReliefTaxRate;
  }
 /**
   * Amount for Icms Relief (desoneração)
   * @return icmsReliefTaxAmount
  **/
  public Double getIcmsReliefTaxAmount() {
    return icmsReliefTaxAmount;
  }
  public void setIcmsReliefTaxAmount(Double icmsReliefTaxAmount) {
    this.icmsReliefTaxAmount = icmsReliefTaxAmount;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineForGoodsIcmsTaxRelief {\n");
    
    sb.append("    icmsTaxReliefReasonCode: ").append(toIndentedString(icmsTaxReliefReasonCode)).append("\n");
    sb.append("    icmsReliefTaxRate: ").append(toIndentedString(icmsReliefTaxRate)).append("\n");
    sb.append("    icmsReliefTaxAmount: ").append(toIndentedString(icmsReliefTaxAmount)).append("\n");
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

