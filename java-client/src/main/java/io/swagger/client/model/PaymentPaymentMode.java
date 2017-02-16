/*
 * BR16 - API
 * This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PaymentPaymentMode
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-16T18:26:15.214Z")
public class PaymentPaymentMode {
  /**
   * Payment mode - '01' # Dinheiro - '02' # Cheque - '03' # Cartão de Crédito - '04' # Cartão de Débito - '05' # Crédito Loja - '10' # Vale Alimentação - '11' # Vale Refeição - '12' # Vale Presente - '13' # Vale Combustível - '99' # Outros 
   */
  public enum ModeEnum {
    @SerializedName("01")
    _01("01"),
    
    @SerializedName("02")
    _02("02"),
    
    @SerializedName("03")
    _03("03"),
    
    @SerializedName("04")
    _04("04"),
    
    @SerializedName("05")
    _05("05"),
    
    @SerializedName("10")
    _10("10"),
    
    @SerializedName("11")
    _11("11"),
    
    @SerializedName("12")
    _12("12"),
    
    @SerializedName("13")
    _13("13"),
    
    @SerializedName("99")
    _99("99");

    private String value;

    ModeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("mode")
  private ModeEnum mode = null;

  @SerializedName("value")
  private Double value = null;

  /**
   * - '1' # Payment integrated with system, - '2' # Payment not integrated with system 
   */
  public enum CardTpIntegrationEnum {
    @SerializedName("1")
    _1("1"),
    
    @SerializedName("2")
    _2("2");

    private String value;

    CardTpIntegrationEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("cardTpIntegration")
  private CardTpIntegrationEnum cardTpIntegration = null;

  @SerializedName("cardCNPJ")
  private String cardCNPJ = null;

  /**
   * card brand - '01' # Visa - '02' # Mastercard - '03' # American Express - '04' # Sorocred - '99' # Other 
   */
  public enum CardBrandEnum {
    @SerializedName("01")
    _01("01"),
    
    @SerializedName("02")
    _02("02"),
    
    @SerializedName("03")
    _03("03"),
    
    @SerializedName("04")
    _04("04"),
    
    @SerializedName("99")
    _99("99");

    private String value;

    CardBrandEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("cardBrand")
  private CardBrandEnum cardBrand = null;

  @SerializedName("cardAuthorization")
  private String cardAuthorization = null;

  public PaymentPaymentMode mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Payment mode - '01' # Dinheiro - '02' # Cheque - '03' # Cartão de Crédito - '04' # Cartão de Débito - '05' # Crédito Loja - '10' # Vale Alimentação - '11' # Vale Refeição - '12' # Vale Presente - '13' # Vale Combustível - '99' # Outros 
   * @return mode
  **/
  @ApiModelProperty(example = "null", required = true, value = "Payment mode - '01' # Dinheiro - '02' # Cheque - '03' # Cartão de Crédito - '04' # Cartão de Débito - '05' # Crédito Loja - '10' # Vale Alimentação - '11' # Vale Refeição - '12' # Vale Presente - '13' # Vale Combustível - '99' # Outros ")
  public ModeEnum getMode() {
    return mode;
  }

  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }

  public PaymentPaymentMode value(Double value) {
    this.value = value;
    return this;
  }

   /**
   * payment value
   * @return value
  **/
  @ApiModelProperty(example = "null", required = true, value = "payment value")
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }

  public PaymentPaymentMode cardTpIntegration(CardTpIntegrationEnum cardTpIntegration) {
    this.cardTpIntegration = cardTpIntegration;
    return this;
  }

   /**
   * - '1' # Payment integrated with system, - '2' # Payment not integrated with system 
   * @return cardTpIntegration
  **/
  @ApiModelProperty(example = "null", value = "- '1' # Payment integrated with system, - '2' # Payment not integrated with system ")
  public CardTpIntegrationEnum getCardTpIntegration() {
    return cardTpIntegration;
  }

  public void setCardTpIntegration(CardTpIntegrationEnum cardTpIntegration) {
    this.cardTpIntegration = cardTpIntegration;
  }

  public PaymentPaymentMode cardCNPJ(String cardCNPJ) {
    this.cardCNPJ = cardCNPJ;
    return this;
  }

   /**
   * Federal tax id of accrediting card (credenciadora do cartão)
   * @return cardCNPJ
  **/
  @ApiModelProperty(example = "null", value = "Federal tax id of accrediting card (credenciadora do cartão)")
  public String getCardCNPJ() {
    return cardCNPJ;
  }

  public void setCardCNPJ(String cardCNPJ) {
    this.cardCNPJ = cardCNPJ;
  }

  public PaymentPaymentMode cardBrand(CardBrandEnum cardBrand) {
    this.cardBrand = cardBrand;
    return this;
  }

   /**
   * card brand - '01' # Visa - '02' # Mastercard - '03' # American Express - '04' # Sorocred - '99' # Other 
   * @return cardBrand
  **/
  @ApiModelProperty(example = "null", value = "card brand - '01' # Visa - '02' # Mastercard - '03' # American Express - '04' # Sorocred - '99' # Other ")
  public CardBrandEnum getCardBrand() {
    return cardBrand;
  }

  public void setCardBrand(CardBrandEnum cardBrand) {
    this.cardBrand = cardBrand;
  }

  public PaymentPaymentMode cardAuthorization(String cardAuthorization) {
    this.cardAuthorization = cardAuthorization;
    return this;
  }

   /**
   * transaction authorization number
   * @return cardAuthorization
  **/
  @ApiModelProperty(example = "null", value = "transaction authorization number")
  public String getCardAuthorization() {
    return cardAuthorization;
  }

  public void setCardAuthorization(String cardAuthorization) {
    this.cardAuthorization = cardAuthorization;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentPaymentMode paymentPaymentMode = (PaymentPaymentMode) o;
    return Objects.equals(this.mode, paymentPaymentMode.mode) &&
        Objects.equals(this.value, paymentPaymentMode.value) &&
        Objects.equals(this.cardTpIntegration, paymentPaymentMode.cardTpIntegration) &&
        Objects.equals(this.cardCNPJ, paymentPaymentMode.cardCNPJ) &&
        Objects.equals(this.cardBrand, paymentPaymentMode.cardBrand) &&
        Objects.equals(this.cardAuthorization, paymentPaymentMode.cardAuthorization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mode, value, cardTpIntegration, cardCNPJ, cardBrand, cardAuthorization);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

