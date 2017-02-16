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
import io.swagger.client.model.PurchaseDefaultLocations;
import io.swagger.client.model.PurchaseEntity;
import io.swagger.client.model.PurchaseHeaderIn;
import io.swagger.client.model.PurchaseHeaderOutPayment;
import io.swagger.client.model.PurchaseTaxesConfig;
import org.joda.time.LocalDate;

/**
 * PurchaseHeaderOut
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-16T18:26:15.214Z")
public class PurchaseHeaderOut {
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
   * currency code / transactions must be in Brazilian Reais \"BRL\"
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

  @SerializedName("companyLocation")
  private String companyLocation = null;

  @SerializedName("vendorCode")
  private String vendorCode = null;

  @SerializedName("purchaseOrderNumber")
  private String purchaseOrderNumber = null;

  @SerializedName("entity")
  private PurchaseEntity entity = null;

  @SerializedName("payment")
  private PurchaseHeaderOutPayment payment = null;

  @SerializedName("taxesConfig")
  private PurchaseTaxesConfig taxesConfig = null;

  @SerializedName("defaultLocations")
  private PurchaseDefaultLocations defaultLocations = null;

  public PurchaseHeaderOut accountId(String accountId) {
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

  public PurchaseHeaderOut companyCode(String companyCode) {
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

  public PurchaseHeaderOut transactionType(TransactionTypeEnum transactionType) {
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

  public PurchaseHeaderOut documentCode(String documentCode) {
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

  public PurchaseHeaderOut currency(CurrencyEnum currency) {
    this.currency = currency;
    return this;
  }

   /**
   * currency code / transactions must be in Brazilian Reais \"BRL\"
   * @return currency
  **/
  @ApiModelProperty(example = "null", required = true, value = "currency code / transactions must be in Brazilian Reais \"BRL\"")
  public CurrencyEnum getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyEnum currency) {
    this.currency = currency;
  }

  public PurchaseHeaderOut transactionDate(LocalDate transactionDate) {
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

  public PurchaseHeaderOut taxCalculationDate(LocalDate taxCalculationDate) {
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

  public PurchaseHeaderOut companyLocation(String companyLocation) {
    this.companyLocation = companyLocation;
    return this;
  }

   /**
   * This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity
   * @return companyLocation
  **/
  @ApiModelProperty(example = "null", required = true, value = "This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity")
  public String getCompanyLocation() {
    return companyLocation;
  }

  public void setCompanyLocation(String companyLocation) {
    this.companyLocation = companyLocation;
  }

  public PurchaseHeaderOut vendorCode(String vendorCode) {
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

  public PurchaseHeaderOut purchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
    return this;
  }

   /**
   * The number of Purchase Order
   * @return purchaseOrderNumber
  **/
  @ApiModelProperty(example = "null", value = "The number of Purchase Order")
  public String getPurchaseOrderNumber() {
    return purchaseOrderNumber;
  }

  public void setPurchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
  }

  public PurchaseHeaderOut entity(PurchaseEntity entity) {
    this.entity = entity;
    return this;
  }

   /**
   * Get entity
   * @return entity
  **/
  @ApiModelProperty(example = "null", value = "")
  public PurchaseEntity getEntity() {
    return entity;
  }

  public void setEntity(PurchaseEntity entity) {
    this.entity = entity;
  }

  public PurchaseHeaderOut payment(PurchaseHeaderOutPayment payment) {
    this.payment = payment;
    return this;
  }

   /**
   * Get payment
   * @return payment
  **/
  @ApiModelProperty(example = "null", value = "")
  public PurchaseHeaderOutPayment getPayment() {
    return payment;
  }

  public void setPayment(PurchaseHeaderOutPayment payment) {
    this.payment = payment;
  }

  public PurchaseHeaderOut taxesConfig(PurchaseTaxesConfig taxesConfig) {
    this.taxesConfig = taxesConfig;
    return this;
  }

   /**
   * Get taxesConfig
   * @return taxesConfig
  **/
  @ApiModelProperty(example = "null", value = "")
  public PurchaseTaxesConfig getTaxesConfig() {
    return taxesConfig;
  }

  public void setTaxesConfig(PurchaseTaxesConfig taxesConfig) {
    this.taxesConfig = taxesConfig;
  }

  public PurchaseHeaderOut defaultLocations(PurchaseDefaultLocations defaultLocations) {
    this.defaultLocations = defaultLocations;
    return this;
  }

   /**
   * Get defaultLocations
   * @return defaultLocations
  **/
  @ApiModelProperty(example = "null", value = "")
  public PurchaseDefaultLocations getDefaultLocations() {
    return defaultLocations;
  }

  public void setDefaultLocations(PurchaseDefaultLocations defaultLocations) {
    this.defaultLocations = defaultLocations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PurchaseHeaderOut purchaseHeaderOut = (PurchaseHeaderOut) o;
    return Objects.equals(this.accountId, purchaseHeaderOut.accountId) &&
        Objects.equals(this.companyCode, purchaseHeaderOut.companyCode) &&
        Objects.equals(this.transactionType, purchaseHeaderOut.transactionType) &&
        Objects.equals(this.documentCode, purchaseHeaderOut.documentCode) &&
        Objects.equals(this.currency, purchaseHeaderOut.currency) &&
        Objects.equals(this.transactionDate, purchaseHeaderOut.transactionDate) &&
        Objects.equals(this.taxCalculationDate, purchaseHeaderOut.taxCalculationDate) &&
        Objects.equals(this.companyLocation, purchaseHeaderOut.companyLocation) &&
        Objects.equals(this.vendorCode, purchaseHeaderOut.vendorCode) &&
        Objects.equals(this.purchaseOrderNumber, purchaseHeaderOut.purchaseOrderNumber) &&
        Objects.equals(this.entity, purchaseHeaderOut.entity) &&
        Objects.equals(this.payment, purchaseHeaderOut.payment) &&
        Objects.equals(this.taxesConfig, purchaseHeaderOut.taxesConfig) &&
        Objects.equals(this.defaultLocations, purchaseHeaderOut.defaultLocations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, companyCode, transactionType, documentCode, currency, transactionDate, taxCalculationDate, companyLocation, vendorCode, purchaseOrderNumber, entity, payment, taxesConfig, defaultLocations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseHeaderOut {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    companyCode: ").append(toIndentedString(companyCode)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    documentCode: ").append(toIndentedString(documentCode)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
    sb.append("    taxCalculationDate: ").append(toIndentedString(taxCalculationDate)).append("\n");
    sb.append("    companyLocation: ").append(toIndentedString(companyLocation)).append("\n");
    sb.append("    vendorCode: ").append(toIndentedString(vendorCode)).append("\n");
    sb.append("    purchaseOrderNumber: ").append(toIndentedString(purchaseOrderNumber)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    taxesConfig: ").append(toIndentedString(taxesConfig)).append("\n");
    sb.append("    defaultLocations: ").append(toIndentedString(defaultLocations)).append("\n");
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
