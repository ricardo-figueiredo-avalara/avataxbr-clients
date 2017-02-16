package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class PaymentPaymentMode  {
  

@XmlType(name="ModeEnum")
@XmlEnum(String.class)
public enum ModeEnum {

    @XmlEnumValue("01") _01(String.valueOf("01")), @XmlEnumValue("02") _02(String.valueOf("02")), @XmlEnumValue("03") _03(String.valueOf("03")), @XmlEnumValue("04") _04(String.valueOf("04")), @XmlEnumValue("05") _05(String.valueOf("05")), @XmlEnumValue("10") _10(String.valueOf("10")), @XmlEnumValue("11") _11(String.valueOf("11")), @XmlEnumValue("12") _12(String.valueOf("12")), @XmlEnumValue("13") _13(String.valueOf("13")), @XmlEnumValue("99") _99(String.valueOf("99"));


    private String value;

    ModeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ModeEnum fromValue(String v) {
        for (ModeEnum b : ModeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", required = true, value = "Payment mode - '01' # Dinheiro - '02' # Cheque - '03' # Cartão de Crédito - '04' # Cartão de Débito - '05' # Crédito Loja - '10' # Vale Alimentação - '11' # Vale Refeição - '12' # Vale Presente - '13' # Vale Combustível - '99' # Outros ")
  private ModeEnum mode = null;
  @ApiModelProperty(example = "null", required = true, value = "payment value")
  private Double value = null;

@XmlType(name="CardTpIntegrationEnum")
@XmlEnum(String.class)
public enum CardTpIntegrationEnum {

    @XmlEnumValue("1") _1(String.valueOf("1")), @XmlEnumValue("2") _2(String.valueOf("2"));


    private String value;

    CardTpIntegrationEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CardTpIntegrationEnum fromValue(String v) {
        for (CardTpIntegrationEnum b : CardTpIntegrationEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "- '1' # Payment integrated with system, - '2' # Payment not integrated with system ")
  private CardTpIntegrationEnum cardTpIntegration = null;
  @ApiModelProperty(example = "null", value = "Federal tax id of accrediting card (credenciadora do cartão)")
  private String cardCNPJ = null;

@XmlType(name="CardBrandEnum")
@XmlEnum(String.class)
public enum CardBrandEnum {

    @XmlEnumValue("01") _01(String.valueOf("01")), @XmlEnumValue("02") _02(String.valueOf("02")), @XmlEnumValue("03") _03(String.valueOf("03")), @XmlEnumValue("04") _04(String.valueOf("04")), @XmlEnumValue("99") _99(String.valueOf("99"));


    private String value;

    CardBrandEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CardBrandEnum fromValue(String v) {
        for (CardBrandEnum b : CardBrandEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "card brand - '01' # Visa - '02' # Mastercard - '03' # American Express - '04' # Sorocred - '99' # Other ")
  private CardBrandEnum cardBrand = null;
  @ApiModelProperty(example = "null", value = "transaction authorization number")
  private String cardAuthorization = null;

 /**
   * Payment mode - '01' # Dinheiro - '02' # Cheque - '03' # Cartão de Crédito - '04' # Cartão de Débito - '05' # Crédito Loja - '10' # Vale Alimentação - '11' # Vale Refeição - '12' # Vale Presente - '13' # Vale Combustível - '99' # Outros 
   * @return mode
  **/
  public ModeEnum getMode() {
    return mode;
  }
  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }
 /**
   * payment value
   * @return value
  **/
  public Double getValue() {
    return value;
  }
  public void setValue(Double value) {
    this.value = value;
  }
 /**
   * - '1' # Payment integrated with system, - '2' # Payment not integrated with system 
   * @return cardTpIntegration
  **/
  public CardTpIntegrationEnum getCardTpIntegration() {
    return cardTpIntegration;
  }
  public void setCardTpIntegration(CardTpIntegrationEnum cardTpIntegration) {
    this.cardTpIntegration = cardTpIntegration;
  }
 /**
   * Federal tax id of accrediting card (credenciadora do cartão)
   * @return cardCNPJ
  **/
  public String getCardCNPJ() {
    return cardCNPJ;
  }
  public void setCardCNPJ(String cardCNPJ) {
    this.cardCNPJ = cardCNPJ;
  }
 /**
   * card brand - '01' # Visa - '02' # Mastercard - '03' # American Express - '04' # Sorocred - '99' # Other 
   * @return cardBrand
  **/
  public CardBrandEnum getCardBrand() {
    return cardBrand;
  }
  public void setCardBrand(CardBrandEnum cardBrand) {
    this.cardBrand = cardBrand;
  }
 /**
   * transaction authorization number
   * @return cardAuthorization
  **/
  public String getCardAuthorization() {
    return cardAuthorization;
  }
  public void setCardAuthorization(String cardAuthorization) {
    this.cardAuthorization = cardAuthorization;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentPaymentMode {\n");
    
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    cardTpIntegration: ").append(toIndentedString(cardTpIntegration)).append("\n");
    sb.append("    cardCNPJ: ").append(toIndentedString(cardCNPJ)).append("\n");
    sb.append("    cardBrand: ").append(toIndentedString(cardBrand)).append("\n");
    sb.append("    cardAuthorization: ").append(toIndentedString(cardAuthorization)).append("\n");
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

