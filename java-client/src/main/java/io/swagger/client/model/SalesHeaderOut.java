/*
 * AvaTax Brazil
 * The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.
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

import org.joda.time.LocalDate;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * SalesHeaderOut
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-06T17:54:07.550Z")
public class SalesHeaderOut {
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

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("transactionDate")
  private LocalDate transactionDate = null;

  @SerializedName("taxCalculationDate")
  private LocalDate taxCalculationDate = null;

  @SerializedName("companyLocation")
  private String companyLocation = null;

  @SerializedName("purchaseOrderNumber")
  private String purchaseOrderNumber = null;

  @SerializedName("rpsNumber")
  private Integer rpsNumber = null;

  @SerializedName("rpsSerie")
  private String rpsSerie = "0";

  @SerializedName("discriminationIn")
  private String discriminationIn = null;

  @SerializedName("entity")
  private SalesEntity entity = null;

  @SerializedName("payment")
  private SalesHeaderOutPayment payment = null;

  @SerializedName("taxesConfig")
  private SalesTaxesConfig taxesConfig = null;

  @SerializedName("defaultLocations")
  private SalesDefaultLocations defaultLocations = null;

  @SerializedName("discriminationOut")
  private String discriminationOut = null;

  @SerializedName("xml")
  private String xml = null;

  /**
   * Service sales usually has a EDI integration with government to get Final document or Authorization. This is external process and the integration status is followed by this property. - 'STORED' - 'WAITING APPROVAL' - 'AUTHORIZED' - 'AUTHORIZED with NOTE' - 'ERROR' - 'CANCELED REPLACED' - 'CANCELED' - 'CANCELLATION REQUESTED' 
   */
  public enum EdiSyncStateEnum {
    @SerializedName("STORED")
    STORED("STORED"),
    
    @SerializedName("WAITING APPROVAL")
    WAITING_APPROVAL("WAITING APPROVAL"),
    
    @SerializedName("AUTHORIZED")
    AUTHORIZED("AUTHORIZED"),
    
    @SerializedName("AUTHORIZED with NOTE")
    AUTHORIZED_WITH_NOTE("AUTHORIZED with NOTE"),
    
    @SerializedName("ERROR")
    ERROR("ERROR"),
    
    @SerializedName("CANCELED REPLACED")
    CANCELED_REPLACED("CANCELED REPLACED"),
    
    @SerializedName("CANCELED")
    CANCELED("CANCELED"),
    
    @SerializedName("CANCELLATION REQUESTED")
    CANCELLATION_REQUESTED("CANCELLATION REQUESTED");

    private String value;

    EdiSyncStateEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("ediSyncState")
  private EdiSyncStateEnum ediSyncState = null;

  public SalesHeaderOut transactionType(TransactionTypeEnum transactionType) {
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

  public SalesHeaderOut documentCode(String documentCode) {
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

  public SalesHeaderOut currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * currency code / transactions must be in Brazilian Reais \"BRL\"
   * @return currency
  **/
  @ApiModelProperty(example = "null", value = "currency code / transactions must be in Brazilian Reais \"BRL\"")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public SalesHeaderOut transactionDate(LocalDate transactionDate) {
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

  public SalesHeaderOut taxCalculationDate(LocalDate taxCalculationDate) {
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

  public SalesHeaderOut companyLocation(String companyLocation) {
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

  public SalesHeaderOut purchaseOrderNumber(String purchaseOrderNumber) {
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

  public SalesHeaderOut rpsNumber(Integer rpsNumber) {
    this.rpsNumber = rpsNumber;
    return this;
  }

   /**
   * Provisional receipt services, sequencial number maintained by the client application, unique by serie
   * @return rpsNumber
  **/
  @ApiModelProperty(example = "null", value = "Provisional receipt services, sequencial number maintained by the client application, unique by serie")
  public Integer getRpsNumber() {
    return rpsNumber;
  }

  public void setRpsNumber(Integer rpsNumber) {
    this.rpsNumber = rpsNumber;
  }

  public SalesHeaderOut rpsSerie(String rpsSerie) {
    this.rpsSerie = rpsSerie;
    return this;
  }

   /**
   * set name identifier for rps number sequency.
   * @return rpsSerie
  **/
  @ApiModelProperty(example = "null", value = "set name identifier for rps number sequency.")
  public String getRpsSerie() {
    return rpsSerie;
  }

  public void setRpsSerie(String rpsSerie) {
    this.rpsSerie = rpsSerie;
  }

  public SalesHeaderOut discriminationIn(String discriminationIn) {
    this.discriminationIn = discriminationIn;
    return this;
  }

   /**
   * Service discrimination, free description about service
   * @return discriminationIn
  **/
  @ApiModelProperty(example = "null", value = "Service discrimination, free description about service")
  public String getDiscriminationIn() {
    return discriminationIn;
  }

  public void setDiscriminationIn(String discriminationIn) {
    this.discriminationIn = discriminationIn;
  }

  public SalesHeaderOut entity(SalesEntity entity) {
    this.entity = entity;
    return this;
  }

   /**
   * Get entity
   * @return entity
  **/
  @ApiModelProperty(example = "null", value = "")
  public SalesEntity getEntity() {
    return entity;
  }

  public void setEntity(SalesEntity entity) {
    this.entity = entity;
  }

  public SalesHeaderOut payment(SalesHeaderOutPayment payment) {
    this.payment = payment;
    return this;
  }

   /**
   * Get payment
   * @return payment
  **/
  @ApiModelProperty(example = "null", value = "")
  public SalesHeaderOutPayment getPayment() {
    return payment;
  }

  public void setPayment(SalesHeaderOutPayment payment) {
    this.payment = payment;
  }

  public SalesHeaderOut taxesConfig(SalesTaxesConfig taxesConfig) {
    this.taxesConfig = taxesConfig;
    return this;
  }

   /**
   * Get taxesConfig
   * @return taxesConfig
  **/
  @ApiModelProperty(example = "null", value = "")
  public SalesTaxesConfig getTaxesConfig() {
    return taxesConfig;
  }

  public void setTaxesConfig(SalesTaxesConfig taxesConfig) {
    this.taxesConfig = taxesConfig;
  }

  public SalesHeaderOut defaultLocations(SalesDefaultLocations defaultLocations) {
    this.defaultLocations = defaultLocations;
    return this;
  }

   /**
   * Get defaultLocations
   * @return defaultLocations
  **/
  @ApiModelProperty(example = "null", value = "")
  public SalesDefaultLocations getDefaultLocations() {
    return defaultLocations;
  }

  public void setDefaultLocations(SalesDefaultLocations defaultLocations) {
    this.defaultLocations = defaultLocations;
  }

  public SalesHeaderOut discriminationOut(String discriminationOut) {
    this.discriminationOut = discriminationOut;
    return this;
  }

   /**
   * Invoice discrimination, it is discriminationIn plus automatic messages
   * @return discriminationOut
  **/
  @ApiModelProperty(example = "null", value = "Invoice discrimination, it is discriminationIn plus automatic messages")
  public String getDiscriminationOut() {
    return discriminationOut;
  }

  public void setDiscriminationOut(String discriminationOut) {
    this.discriminationOut = discriminationOut;
  }

  public SalesHeaderOut xml(String xml) {
    this.xml = xml;
    return this;
  }

   /**
   * RPS XML or NFSe XML generated, when the client system doesn't have EDI with government then BR16 return RPS when transaction is created.
   * @return xml
  **/
  @ApiModelProperty(example = "null", value = "RPS XML or NFSe XML generated, when the client system doesn't have EDI with government then BR16 return RPS when transaction is created.")
  public String getXml() {
    return xml;
  }

  public void setXml(String xml) {
    this.xml = xml;
  }

  public SalesHeaderOut ediSyncState(EdiSyncStateEnum ediSyncState) {
    this.ediSyncState = ediSyncState;
    return this;
  }

   /**
   * Service sales usually has a EDI integration with government to get Final document or Authorization. This is external process and the integration status is followed by this property. - 'STORED' - 'WAITING APPROVAL' - 'AUTHORIZED' - 'AUTHORIZED with NOTE' - 'ERROR' - 'CANCELED REPLACED' - 'CANCELED' - 'CANCELLATION REQUESTED' 
   * @return ediSyncState
  **/
  @ApiModelProperty(example = "null", value = "Service sales usually has a EDI integration with government to get Final document or Authorization. This is external process and the integration status is followed by this property. - 'STORED' - 'WAITING APPROVAL' - 'AUTHORIZED' - 'AUTHORIZED with NOTE' - 'ERROR' - 'CANCELED REPLACED' - 'CANCELED' - 'CANCELLATION REQUESTED' ")
  public EdiSyncStateEnum getEdiSyncState() {
    return ediSyncState;
  }

  public void setEdiSyncState(EdiSyncStateEnum ediSyncState) {
    this.ediSyncState = ediSyncState;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SalesHeaderOut salesHeaderOut = (SalesHeaderOut) o;
    return Objects.equals(this.transactionType, salesHeaderOut.transactionType) &&
        Objects.equals(this.documentCode, salesHeaderOut.documentCode) &&
        Objects.equals(this.currency, salesHeaderOut.currency) &&
        Objects.equals(this.transactionDate, salesHeaderOut.transactionDate) &&
        Objects.equals(this.taxCalculationDate, salesHeaderOut.taxCalculationDate) &&
        Objects.equals(this.companyLocation, salesHeaderOut.companyLocation) &&
        Objects.equals(this.purchaseOrderNumber, salesHeaderOut.purchaseOrderNumber) &&
        Objects.equals(this.rpsNumber, salesHeaderOut.rpsNumber) &&
        Objects.equals(this.rpsSerie, salesHeaderOut.rpsSerie) &&
        Objects.equals(this.discriminationIn, salesHeaderOut.discriminationIn) &&
        Objects.equals(this.entity, salesHeaderOut.entity) &&
        Objects.equals(this.payment, salesHeaderOut.payment) &&
        Objects.equals(this.taxesConfig, salesHeaderOut.taxesConfig) &&
        Objects.equals(this.defaultLocations, salesHeaderOut.defaultLocations) &&
        Objects.equals(this.discriminationOut, salesHeaderOut.discriminationOut) &&
        Objects.equals(this.xml, salesHeaderOut.xml) &&
        Objects.equals(this.ediSyncState, salesHeaderOut.ediSyncState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionType, documentCode, currency, transactionDate, taxCalculationDate, companyLocation, purchaseOrderNumber, rpsNumber, rpsSerie, discriminationIn, entity, payment, taxesConfig, defaultLocations, discriminationOut, xml, ediSyncState);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesHeaderOut {\n");
    
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    documentCode: ").append(toIndentedString(documentCode)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
    sb.append("    taxCalculationDate: ").append(toIndentedString(taxCalculationDate)).append("\n");
    sb.append("    companyLocation: ").append(toIndentedString(companyLocation)).append("\n");
    sb.append("    purchaseOrderNumber: ").append(toIndentedString(purchaseOrderNumber)).append("\n");
    sb.append("    rpsNumber: ").append(toIndentedString(rpsNumber)).append("\n");
    sb.append("    rpsSerie: ").append(toIndentedString(rpsSerie)).append("\n");
    sb.append("    discriminationIn: ").append(toIndentedString(discriminationIn)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    taxesConfig: ").append(toIndentedString(taxesConfig)).append("\n");
    sb.append("    defaultLocations: ").append(toIndentedString(defaultLocations)).append("\n");
    sb.append("    discriminationOut: ").append(toIndentedString(discriminationOut)).append("\n");
    sb.append("    xml: ").append(toIndentedString(xml)).append("\n");
    sb.append("    ediSyncState: ").append(toIndentedString(ediSyncState)).append("\n");
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

