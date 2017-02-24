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
  

@XmlType(name="ReasonCodeEnum")
@XmlEnum(String.class)
public enum ReasonCodeEnum {

    @XmlEnumValue("1") _1(String.valueOf("1")), @XmlEnumValue("3") _3(String.valueOf("3")), @XmlEnumValue("4") _4(String.valueOf("4")), @XmlEnumValue("5") _5(String.valueOf("5")), @XmlEnumValue("6") _6(String.valueOf("6")), @XmlEnumValue("7") _7(String.valueOf("7")), @XmlEnumValue("8") _8(String.valueOf("8")), @XmlEnumValue("9") _9(String.valueOf("9")), @XmlEnumValue("10") _10(String.valueOf("10")), @XmlEnumValue("11") _11(String.valueOf("11")), @XmlEnumValue("12") _12(String.valueOf("12")), @XmlEnumValue("16") _16(String.valueOf("16"));


    private String value;

    ReasonCodeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ReasonCodeEnum fromValue(String v) {
        for (ReasonCodeEnum b : ReasonCodeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", required = true, value = "When item transaction subject to desoneration, this is the reason code - '1' # Táxi; - '3' # Produtor Agropecuário; - '4' # Frotista/Locadora; - '5' # Diplomático/Consular; - '6' # Utilitários e Motocicletas da Amazônia Ocidental e Áreas de Livre Comércio (Resolução 714/88 e 790/94 – CONTRAN e suas alterações); - '7' # SUFRAMA; - '8' # Venda a órgão Público; - '9' # Outros - '10' # Deficiente Condutor - '11' # Deficiente não condutor - '12' # Fomento agropecuário - '16' # Olimpíadas Rio 2016 ")
  private ReasonCodeEnum reasonCode = null;
  @ApiModelProperty(example = "null", value = "ICMS Tax base rate discount  (desconto na base do ICMS referetne a desoneração)")
  private Double taxBaseDiscount = null;
  @ApiModelProperty(example = "null", value = "Amount for Icms Relief (desoneração)")
  private Double taxAmount = null;

 /**
   * When item transaction subject to desoneration, this is the reason code - '1' # Táxi; - '3' # Produtor Agropecuário; - '4' # Frotista/Locadora; - '5' # Diplomático/Consular; - '6' # Utilitários e Motocicletas da Amazônia Ocidental e Áreas de Livre Comércio (Resolução 714/88 e 790/94 – CONTRAN e suas alterações); - '7' # SUFRAMA; - '8' # Venda a órgão Público; - '9' # Outros - '10' # Deficiente Condutor - '11' # Deficiente não condutor - '12' # Fomento agropecuário - '16' # Olimpíadas Rio 2016 
   * @return reasonCode
  **/
  public ReasonCodeEnum getReasonCode() {
    return reasonCode;
  }
  public void setReasonCode(ReasonCodeEnum reasonCode) {
    this.reasonCode = reasonCode;
  }
 /**
   * ICMS Tax base rate discount  (desconto na base do ICMS referetne a desoneração)
   * @return taxBaseDiscount
  **/
  public Double getTaxBaseDiscount() {
    return taxBaseDiscount;
  }
  public void setTaxBaseDiscount(Double taxBaseDiscount) {
    this.taxBaseDiscount = taxBaseDiscount;
  }
 /**
   * Amount for Icms Relief (desoneração)
   * @return taxAmount
  **/
  public Double getTaxAmount() {
    return taxAmount;
  }
  public void setTaxAmount(Double taxAmount) {
    this.taxAmount = taxAmount;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineForGoodsIcmsTaxRelief {\n");
    
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    taxBaseDiscount: ").append(toIndentedString(taxBaseDiscount)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
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

