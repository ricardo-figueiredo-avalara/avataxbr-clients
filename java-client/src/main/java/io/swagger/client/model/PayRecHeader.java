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
import org.joda.time.LocalDate;

/**
 * PayRecHeader
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-16T18:26:15.214Z")
public class PayRecHeader {
  @SerializedName("accountId")
  private String accountId = null;

  @SerializedName("companyCode")
  private String companyCode = null;

  /**
   * This string indicates the type of transaction for which tax should be calculated. - 'Sale' - 'Purchase' - 'Payment' - 'Receipt' 
   */
  public enum TransactionTypeEnum {
    @SerializedName("Sale")
    SALE("Sale"),
    
    @SerializedName("Purchase")
    PURCHASE("Purchase"),
    
    @SerializedName("Payment")
    PAYMENT("Payment"),
    
    @SerializedName("Receipt")
    RECEIPT("Receipt");

    private String value;

    TransactionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("transactionType")
  private TransactionTypeEnum transactionType = null;

  @SerializedName("documentCode")
  private String documentCode = null;

  /**
   * currency code. 'BRL' for Brazilian Reais.
   */
  public enum CurrencyEnum {
    @SerializedName("BRL")
    BRL("BRL");

    private String value;

    CurrencyEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("currency")
  private CurrencyEnum currency = null;

  @SerializedName("transactionDate")
  private LocalDate transactionDate = null;

  @SerializedName("taxCalculationDate")
  private LocalDate taxCalculationDate = null;

  @SerializedName("vendorCode")
  private String vendorCode = null;

  /**
   * - 'CALCULATE' - 'ASIS' When ASIS, the transaction is stored without executing tax determination (no Calculation). 
   */
  public enum PaymentModeEnum {
    @SerializedName("CALCULATE")
    CALCULATE("CALCULATE"),
    
    @SerializedName("ASIS")
    ASIS("ASIS");

    private String value;

    PaymentModeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("paymentMode")
  private PaymentModeEnum paymentMode = null;

  public PayRecHeader accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line.
   * @return accountId
  **/
  @ApiModelProperty(example = "null", required = true, value = "This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line.")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public PayRecHeader companyCode(String companyCode) {
    this.companyCode = companyCode;
    return this;
  }

   /**
   * This string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company
   * @return companyCode
  **/
  @ApiModelProperty(example = "null", required = true, value = "This string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company")
  public String getCompanyCode() {
    return companyCode;
  }

  public void setCompanyCode(String companyCode) {
    this.companyCode = companyCode;
  }

  public PayRecHeader transactionType(TransactionTypeEnum transactionType) {
    this.transactionType = transactionType;
    return this;
  }

   /**
   * This string indicates the type of transaction for which tax should be calculated. - 'Sale' - 'Purchase' - 'Payment' - 'Receipt' 
   * @return transactionType
  **/
  @ApiModelProperty(example = "null", required = true, value = "This string indicates the type of transaction for which tax should be calculated. - 'Sale' - 'Purchase' - 'Payment' - 'Receipt' ")
  public TransactionTypeEnum getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(TransactionTypeEnum transactionType) {
    this.transactionType = transactionType;
  }

  public PayRecHeader documentCode(String documentCode) {
    this.documentCode = documentCode;
    return this;
  }

   /**
   * This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored
   * @return documentCode
  **/
  @ApiModelProperty(example = "null", value = "This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored")
  public String getDocumentCode() {
    return documentCode;
  }

  public void setDocumentCode(String documentCode) {
    this.documentCode = documentCode;
  }

  public PayRecHeader currency(CurrencyEnum currency) {
    this.currency = currency;
    return this;
  }

   /**
   * currency code. 'BRL' for Brazilian Reais.
   * @return currency
  **/
  @ApiModelProperty(example = "null", required = true, value = "currency code. 'BRL' for Brazilian Reais.")
  public CurrencyEnum getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyEnum currency) {
    this.currency = currency;
  }

  public PayRecHeader transactionDate(LocalDate transactionDate) {
    this.transactionDate = transactionDate;
    return this;
  }

   /**
   * This string is the transaction date in ISO 8601 format (which may be different from the date the tax calculation is performed)
   * @return transactionDate
  **/
  @ApiModelProperty(example = "null", required = true, value = "This string is the transaction date in ISO 8601 format (which may be different from the date the tax calculation is performed)")
  public LocalDate getTransactionDate() {
    return transactionDate;
  }

  public void setTransactionDate(LocalDate transactionDate) {
    this.transactionDate = transactionDate;
  }

  public PayRecHeader taxCalculationDate(LocalDate taxCalculationDate) {
    this.taxCalculationDate = taxCalculationDate;
    return this;
  }

   /**
   * accrual date, This string is the date, in ISO 8601 format, on which tax is to be calculated for this transaction (normally tax is calculated on the date the transaction is performed as captured in the transactionDate field). This is useful for layaways and other deferred transactions.
   * @return taxCalculationDate
  **/
  @ApiModelProperty(example = "null", value = "accrual date, This string is the date, in ISO 8601 format, on which tax is to be calculated for this transaction (normally tax is calculated on the date the transaction is performed as captured in the transactionDate field). This is useful for layaways and other deferred transactions.")
  public LocalDate getTaxCalculationDate() {
    return taxCalculationDate;
  }

  public void setTaxCalculationDate(LocalDate taxCalculationDate) {
    this.taxCalculationDate = taxCalculationDate;
  }

  public PayRecHeader vendorCode(String vendorCode) {
    this.vendorCode = vendorCode;
    return this;
  }

   /**
   * This string is a code maintained by the client application to uniquely identify the party with whom the company (identified by companyCode) is transacting. It is unique within the context of an Account.
   * @return vendorCode
  **/
  @ApiModelProperty(example = "null", required = true, value = "This string is a code maintained by the client application to uniquely identify the party with whom the company (identified by companyCode) is transacting. It is unique within the context of an Account.")
  public String getVendorCode() {
    return vendorCode;
  }

  public void setVendorCode(String vendorCode) {
    this.vendorCode = vendorCode;
  }

  public PayRecHeader paymentMode(PaymentModeEnum paymentMode) {
    this.paymentMode = paymentMode;
    return this;
  }

   /**
   * - 'CALCULATE' - 'ASIS' When ASIS, the transaction is stored without executing tax determination (no Calculation). 
   * @return paymentMode
  **/
  @ApiModelProperty(example = "null", required = true, value = "- 'CALCULATE' - 'ASIS' When ASIS, the transaction is stored without executing tax determination (no Calculation). ")
  public PaymentModeEnum getPaymentMode() {
    return paymentMode;
  }

  public void setPaymentMode(PaymentModeEnum paymentMode) {
    this.paymentMode = paymentMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayRecHeader payRecHeader = (PayRecHeader) o;
    return Objects.equals(this.accountId, payRecHeader.accountId) &&
        Objects.equals(this.companyCode, payRecHeader.companyCode) &&
        Objects.equals(this.transactionType, payRecHeader.transactionType) &&
        Objects.equals(this.documentCode, payRecHeader.documentCode) &&
        Objects.equals(this.currency, payRecHeader.currency) &&
        Objects.equals(this.transactionDate, payRecHeader.transactionDate) &&
        Objects.equals(this.taxCalculationDate, payRecHeader.taxCalculationDate) &&
        Objects.equals(this.vendorCode, payRecHeader.vendorCode) &&
        Objects.equals(this.paymentMode, payRecHeader.paymentMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, companyCode, transactionType, documentCode, currency, transactionDate, taxCalculationDate, vendorCode, paymentMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayRecHeader {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    companyCode: ").append(toIndentedString(companyCode)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    documentCode: ").append(toIndentedString(documentCode)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
    sb.append("    taxCalculationDate: ").append(toIndentedString(taxCalculationDate)).append("\n");
    sb.append("    vendorCode: ").append(toIndentedString(vendorCode)).append("\n");
    sb.append("    paymentMode: ").append(toIndentedString(paymentMode)).append("\n");
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

