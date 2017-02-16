/**
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

import io.swagger.client.model.PurchaseDefaultLocations;
import io.swagger.client.model.PurchaseEntity;
import io.swagger.client.model.PurchaseHeaderIn;
import io.swagger.client.model.PurchaseHeaderOutPayment;
import io.swagger.client.model.PurchaseTaxesConfig;
import java.util.Date;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class PurchaseHeaderOut {
  
  @SerializedName("accountId")
  private String accountId = null;
  @SerializedName("companyCode")
  private String companyCode = null;
  public enum TransactionTypeEnum {
     Sale,  Purchase,  Payment,  Receipt, 
  };
  @SerializedName("transactionType")
  private TransactionTypeEnum transactionType = null;
  @SerializedName("documentCode")
  private String documentCode = null;
  public enum CurrencyEnum {
     BRL, 
  };
  @SerializedName("currency")
  private CurrencyEnum currency = null;
  @SerializedName("transactionDate")
  private Date transactionDate = null;
  @SerializedName("taxCalculationDate")
  private Date taxCalculationDate = null;
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

  /**
   * This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line.
   **/
  @ApiModelProperty(required = true, value = "This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line.")
  public String getAccountId() {
    return accountId;
  }
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  /**
   * This string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company
   **/
  @ApiModelProperty(required = true, value = "This string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company")
  public String getCompanyCode() {
    return companyCode;
  }
  public void setCompanyCode(String companyCode) {
    this.companyCode = companyCode;
  }

  /**
   * This string indicates the type of transaction for which tax should be calculated. - 'Sale' - 'Purchase' - 'Payment' - 'Receipt' 
   **/
  @ApiModelProperty(required = true, value = "This string indicates the type of transaction for which tax should be calculated. - 'Sale' - 'Purchase' - 'Payment' - 'Receipt' ")
  public TransactionTypeEnum getTransactionType() {
    return transactionType;
  }
  public void setTransactionType(TransactionTypeEnum transactionType) {
    this.transactionType = transactionType;
  }

  /**
   * This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored
   **/
  @ApiModelProperty(value = "This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored")
  public String getDocumentCode() {
    return documentCode;
  }
  public void setDocumentCode(String documentCode) {
    this.documentCode = documentCode;
  }

  /**
   * currency code / transactions must be in Brazilian Reais \"BRL\"
   **/
  @ApiModelProperty(required = true, value = "currency code / transactions must be in Brazilian Reais \"BRL\"")
  public CurrencyEnum getCurrency() {
    return currency;
  }
  public void setCurrency(CurrencyEnum currency) {
    this.currency = currency;
  }

  /**
   * This string is the transaction date in ISO 8601 format (which may be different from the date the tax calculation is performed)
   **/
  @ApiModelProperty(required = true, value = "This string is the transaction date in ISO 8601 format (which may be different from the date the tax calculation is performed)")
  public Date getTransactionDate() {
    return transactionDate;
  }
  public void setTransactionDate(Date transactionDate) {
    this.transactionDate = transactionDate;
  }

  /**
   * accrual date, This string is the date, in ISO 8601 format, on which tax is to be calculated for this transaction (normally tax is calculated on the date the transaction is performed as captured in the transactionDate field). This is useful for layaways and other deferred transactions.
   **/
  @ApiModelProperty(value = "accrual date, This string is the date, in ISO 8601 format, on which tax is to be calculated for this transaction (normally tax is calculated on the date the transaction is performed as captured in the transactionDate field). This is useful for layaways and other deferred transactions.")
  public Date getTaxCalculationDate() {
    return taxCalculationDate;
  }
  public void setTaxCalculationDate(Date taxCalculationDate) {
    this.taxCalculationDate = taxCalculationDate;
  }

  /**
   * This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity
   **/
  @ApiModelProperty(required = true, value = "This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity")
  public String getCompanyLocation() {
    return companyLocation;
  }
  public void setCompanyLocation(String companyLocation) {
    this.companyLocation = companyLocation;
  }

  /**
   * This string is a code maintained by the client application to uniquely identify the party with whom the company (identified by companyCode) is transacting. It is unique within the context of an Account.
   **/
  @ApiModelProperty(required = true, value = "This string is a code maintained by the client application to uniquely identify the party with whom the company (identified by companyCode) is transacting. It is unique within the context of an Account.")
  public String getVendorCode() {
    return vendorCode;
  }
  public void setVendorCode(String vendorCode) {
    this.vendorCode = vendorCode;
  }

  /**
   * The number of Purchase Order
   **/
  @ApiModelProperty(value = "The number of Purchase Order")
  public String getPurchaseOrderNumber() {
    return purchaseOrderNumber;
  }
  public void setPurchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public PurchaseEntity getEntity() {
    return entity;
  }
  public void setEntity(PurchaseEntity entity) {
    this.entity = entity;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public PurchaseHeaderOutPayment getPayment() {
    return payment;
  }
  public void setPayment(PurchaseHeaderOutPayment payment) {
    this.payment = payment;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public PurchaseTaxesConfig getTaxesConfig() {
    return taxesConfig;
  }
  public void setTaxesConfig(PurchaseTaxesConfig taxesConfig) {
    this.taxesConfig = taxesConfig;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public PurchaseDefaultLocations getDefaultLocations() {
    return defaultLocations;
  }
  public void setDefaultLocations(PurchaseDefaultLocations defaultLocations) {
    this.defaultLocations = defaultLocations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PurchaseHeaderOut purchaseHeaderOut = (PurchaseHeaderOut) o;
    return (this.accountId == null ? purchaseHeaderOut.accountId == null : this.accountId.equals(purchaseHeaderOut.accountId)) &&
        (this.companyCode == null ? purchaseHeaderOut.companyCode == null : this.companyCode.equals(purchaseHeaderOut.companyCode)) &&
        (this.transactionType == null ? purchaseHeaderOut.transactionType == null : this.transactionType.equals(purchaseHeaderOut.transactionType)) &&
        (this.documentCode == null ? purchaseHeaderOut.documentCode == null : this.documentCode.equals(purchaseHeaderOut.documentCode)) &&
        (this.currency == null ? purchaseHeaderOut.currency == null : this.currency.equals(purchaseHeaderOut.currency)) &&
        (this.transactionDate == null ? purchaseHeaderOut.transactionDate == null : this.transactionDate.equals(purchaseHeaderOut.transactionDate)) &&
        (this.taxCalculationDate == null ? purchaseHeaderOut.taxCalculationDate == null : this.taxCalculationDate.equals(purchaseHeaderOut.taxCalculationDate)) &&
        (this.companyLocation == null ? purchaseHeaderOut.companyLocation == null : this.companyLocation.equals(purchaseHeaderOut.companyLocation)) &&
        (this.vendorCode == null ? purchaseHeaderOut.vendorCode == null : this.vendorCode.equals(purchaseHeaderOut.vendorCode)) &&
        (this.purchaseOrderNumber == null ? purchaseHeaderOut.purchaseOrderNumber == null : this.purchaseOrderNumber.equals(purchaseHeaderOut.purchaseOrderNumber)) &&
        (this.entity == null ? purchaseHeaderOut.entity == null : this.entity.equals(purchaseHeaderOut.entity)) &&
        (this.payment == null ? purchaseHeaderOut.payment == null : this.payment.equals(purchaseHeaderOut.payment)) &&
        (this.taxesConfig == null ? purchaseHeaderOut.taxesConfig == null : this.taxesConfig.equals(purchaseHeaderOut.taxesConfig)) &&
        (this.defaultLocations == null ? purchaseHeaderOut.defaultLocations == null : this.defaultLocations.equals(purchaseHeaderOut.defaultLocations));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.accountId == null ? 0: this.accountId.hashCode());
    result = 31 * result + (this.companyCode == null ? 0: this.companyCode.hashCode());
    result = 31 * result + (this.transactionType == null ? 0: this.transactionType.hashCode());
    result = 31 * result + (this.documentCode == null ? 0: this.documentCode.hashCode());
    result = 31 * result + (this.currency == null ? 0: this.currency.hashCode());
    result = 31 * result + (this.transactionDate == null ? 0: this.transactionDate.hashCode());
    result = 31 * result + (this.taxCalculationDate == null ? 0: this.taxCalculationDate.hashCode());
    result = 31 * result + (this.companyLocation == null ? 0: this.companyLocation.hashCode());
    result = 31 * result + (this.vendorCode == null ? 0: this.vendorCode.hashCode());
    result = 31 * result + (this.purchaseOrderNumber == null ? 0: this.purchaseOrderNumber.hashCode());
    result = 31 * result + (this.entity == null ? 0: this.entity.hashCode());
    result = 31 * result + (this.payment == null ? 0: this.payment.hashCode());
    result = 31 * result + (this.taxesConfig == null ? 0: this.taxesConfig.hashCode());
    result = 31 * result + (this.defaultLocations == null ? 0: this.defaultLocations.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseHeaderOut {\n");
    
    sb.append("  accountId: ").append(accountId).append("\n");
    sb.append("  companyCode: ").append(companyCode).append("\n");
    sb.append("  transactionType: ").append(transactionType).append("\n");
    sb.append("  documentCode: ").append(documentCode).append("\n");
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  transactionDate: ").append(transactionDate).append("\n");
    sb.append("  taxCalculationDate: ").append(taxCalculationDate).append("\n");
    sb.append("  companyLocation: ").append(companyLocation).append("\n");
    sb.append("  vendorCode: ").append(vendorCode).append("\n");
    sb.append("  purchaseOrderNumber: ").append(purchaseOrderNumber).append("\n");
    sb.append("  entity: ").append(entity).append("\n");
    sb.append("  payment: ").append(payment).append("\n");
    sb.append("  taxesConfig: ").append(taxesConfig).append("\n");
    sb.append("  defaultLocations: ").append(defaultLocations).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
