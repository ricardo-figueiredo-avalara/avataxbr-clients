package io.swagger.model;

import io.swagger.model.SalesDefaultLocations;
import io.swagger.model.SalesEntity;
import io.swagger.model.SalesHeaderIn;
import io.swagger.model.SalesHeaderOutPayment;
import io.swagger.model.SalesTaxesConfig;
import org.joda.time.LocalDate;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class SalesHeaderOut  {
  
  @ApiModelProperty(example = "null", required = true, value = "This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line.")
  private String accountId = null;
  @ApiModelProperty(example = "null", required = true, value = "This string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company")
  private String companyCode = null;

@XmlType(name="TransactionTypeEnum")
@XmlEnum(String.class)
public enum TransactionTypeEnum {

    @XmlEnumValue("Sale") SALE(String.valueOf("Sale")), @XmlEnumValue("Purchase") PURCHASE(String.valueOf("Purchase")), @XmlEnumValue("Payment") PAYMENT(String.valueOf("Payment")), @XmlEnumValue("Receipt") RECEIPT(String.valueOf("Receipt"));


    private String value;

    TransactionTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TransactionTypeEnum fromValue(String v) {
        for (TransactionTypeEnum b : TransactionTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", required = true, value = "This string indicates the type of transaction for which tax should be calculated. - 'Sale' - 'Purchase' - 'Payment' - 'Receipt' ")
  private TransactionTypeEnum transactionType = null;
  @ApiModelProperty(example = "null", value = "This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored")
  private String documentCode = null;

@XmlType(name="CurrencyEnum")
@XmlEnum(String.class)
public enum CurrencyEnum {

    @XmlEnumValue("BRL") BRL(String.valueOf("BRL"));


    private String value;

    CurrencyEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CurrencyEnum fromValue(String v) {
        for (CurrencyEnum b : CurrencyEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", required = true, value = "currency code / transactions must be in Brazilian Reais \"BRL\"")
  private CurrencyEnum currency = null;
  @ApiModelProperty(example = "null", required = true, value = "This string is the transaction date in ISO 8601 format (which may be different from the date the tax calculation is performed)")
  private LocalDate transactionDate = null;
  @ApiModelProperty(example = "null", value = "accrual date, This string is the date, in ISO 8601 format, on which tax is to be calculated for this transaction (normally tax is calculated on the date the transaction is performed as captured in the transactionDate field). This is useful for layaways and other deferred transactions.")
  private LocalDate taxCalculationDate = null;
  @ApiModelProperty(example = "null", required = true, value = "This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity")
  private String companyLocation = null;
  @ApiModelProperty(example = "null", required = true, value = "This string is a code maintained by the client application and recorded in Customer Portal to uniquely identify the party with whom the company (identified by companyCode) is transacting. It is unique within the context of a Company.")
  private String customerCode = null;
  @ApiModelProperty(example = "null", value = "The number of Purchase Order")
  private String purchaseOrderNumber = null;
  @ApiModelProperty(example = "null", value = "Provisional receipt services, sequencial number maintained by the client application, unique by serie")
  private Integer rpsNumber = null;
  @ApiModelProperty(example = "null", value = "set name identifier for rps number sequency.")
  private String rpsSerie = "0";
  @ApiModelProperty(example = "null", value = "Service discrimination, free description about service")
  private String discriminationIn = null;
  @ApiModelProperty(example = "null", value = "")
  private SalesEntity entity = null;
  @ApiModelProperty(example = "null", value = "")
  private SalesHeaderOutPayment payment = null;
  @ApiModelProperty(example = "null", value = "")
  private SalesTaxesConfig taxesConfig = null;
  @ApiModelProperty(example = "null", value = "")
  private SalesDefaultLocations defaultLocations = null;
  @ApiModelProperty(example = "null", value = "Invoice discrimination, it is discriminationIn plus automatic messages")
  private String discriminationOut = null;
  @ApiModelProperty(example = "null", value = "RPS XML or NFSe XML generated, when the client system doesn't have EDI with government then BR16 return RPS when transaction is created.")
  private String xml = null;

@XmlType(name="EdiSyncStateEnum")
@XmlEnum(String.class)
public enum EdiSyncStateEnum {

    @XmlEnumValue("STORED") STORED(String.valueOf("STORED")), @XmlEnumValue("WAITING APPROVAL") WAITING_APPROVAL(String.valueOf("WAITING APPROVAL")), @XmlEnumValue("AUTHORIZED") AUTHORIZED(String.valueOf("AUTHORIZED")), @XmlEnumValue("AUTHORIZED with NOTE") AUTHORIZED_WITH_NOTE(String.valueOf("AUTHORIZED with NOTE")), @XmlEnumValue("ERROR") ERROR(String.valueOf("ERROR")), @XmlEnumValue("CANCELED REPLACED") CANCELED_REPLACED(String.valueOf("CANCELED REPLACED")), @XmlEnumValue("CANCELED") CANCELED(String.valueOf("CANCELED")), @XmlEnumValue("CANCELLATION REQUESTED") CANCELLATION_REQUESTED(String.valueOf("CANCELLATION REQUESTED"));


    private String value;

    EdiSyncStateEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static EdiSyncStateEnum fromValue(String v) {
        for (EdiSyncStateEnum b : EdiSyncStateEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "Service sales usually has a EDI integration with government to get Final document or Authorization. This is external process and the integration status is followed by this property. - 'STORED' - 'WAITING APPROVAL' - 'AUTHORIZED' - 'AUTHORIZED with NOTE' - 'ERROR' - 'CANCELED REPLACED' - 'CANCELED' - 'CANCELLATION REQUESTED' ")
  private EdiSyncStateEnum ediSyncState = null;

 /**
   * This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line.
   * @return accountId
  **/
  public String getAccountId() {
    return accountId;
  }
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }
 /**
   * This string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company
   * @return companyCode
  **/
  public String getCompanyCode() {
    return companyCode;
  }
  public void setCompanyCode(String companyCode) {
    this.companyCode = companyCode;
  }
 /**
   * This string indicates the type of transaction for which tax should be calculated. - 'Sale' - 'Purchase' - 'Payment' - 'Receipt' 
   * @return transactionType
  **/
  public TransactionTypeEnum getTransactionType() {
    return transactionType;
  }
  public void setTransactionType(TransactionTypeEnum transactionType) {
    this.transactionType = transactionType;
  }
 /**
   * This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored
   * @return documentCode
  **/
  public String getDocumentCode() {
    return documentCode;
  }
  public void setDocumentCode(String documentCode) {
    this.documentCode = documentCode;
  }
 /**
   * currency code / transactions must be in Brazilian Reais \"BRL\"
   * @return currency
  **/
  public CurrencyEnum getCurrency() {
    return currency;
  }
  public void setCurrency(CurrencyEnum currency) {
    this.currency = currency;
  }
 /**
   * This string is the transaction date in ISO 8601 format (which may be different from the date the tax calculation is performed)
   * @return transactionDate
  **/
  public LocalDate getTransactionDate() {
    return transactionDate;
  }
  public void setTransactionDate(LocalDate transactionDate) {
    this.transactionDate = transactionDate;
  }
 /**
   * accrual date, This string is the date, in ISO 8601 format, on which tax is to be calculated for this transaction (normally tax is calculated on the date the transaction is performed as captured in the transactionDate field). This is useful for layaways and other deferred transactions.
   * @return taxCalculationDate
  **/
  public LocalDate getTaxCalculationDate() {
    return taxCalculationDate;
  }
  public void setTaxCalculationDate(LocalDate taxCalculationDate) {
    this.taxCalculationDate = taxCalculationDate;
  }
 /**
   * This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity
   * @return companyLocation
  **/
  public String getCompanyLocation() {
    return companyLocation;
  }
  public void setCompanyLocation(String companyLocation) {
    this.companyLocation = companyLocation;
  }
 /**
   * This string is a code maintained by the client application and recorded in Customer Portal to uniquely identify the party with whom the company (identified by companyCode) is transacting. It is unique within the context of a Company.
   * @return customerCode
  **/
  public String getCustomerCode() {
    return customerCode;
  }
  public void setCustomerCode(String customerCode) {
    this.customerCode = customerCode;
  }
 /**
   * The number of Purchase Order
   * @return purchaseOrderNumber
  **/
  public String getPurchaseOrderNumber() {
    return purchaseOrderNumber;
  }
  public void setPurchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
  }
 /**
   * Provisional receipt services, sequencial number maintained by the client application, unique by serie
   * @return rpsNumber
  **/
  public Integer getRpsNumber() {
    return rpsNumber;
  }
  public void setRpsNumber(Integer rpsNumber) {
    this.rpsNumber = rpsNumber;
  }
 /**
   * set name identifier for rps number sequency.
   * @return rpsSerie
  **/
  public String getRpsSerie() {
    return rpsSerie;
  }
  public void setRpsSerie(String rpsSerie) {
    this.rpsSerie = rpsSerie;
  }
 /**
   * Service discrimination, free description about service
   * @return discriminationIn
  **/
  public String getDiscriminationIn() {
    return discriminationIn;
  }
  public void setDiscriminationIn(String discriminationIn) {
    this.discriminationIn = discriminationIn;
  }
 /**
   * Get entity
   * @return entity
  **/
  public SalesEntity getEntity() {
    return entity;
  }
  public void setEntity(SalesEntity entity) {
    this.entity = entity;
  }
 /**
   * Get payment
   * @return payment
  **/
  public SalesHeaderOutPayment getPayment() {
    return payment;
  }
  public void setPayment(SalesHeaderOutPayment payment) {
    this.payment = payment;
  }
 /**
   * Get taxesConfig
   * @return taxesConfig
  **/
  public SalesTaxesConfig getTaxesConfig() {
    return taxesConfig;
  }
  public void setTaxesConfig(SalesTaxesConfig taxesConfig) {
    this.taxesConfig = taxesConfig;
  }
 /**
   * Get defaultLocations
   * @return defaultLocations
  **/
  public SalesDefaultLocations getDefaultLocations() {
    return defaultLocations;
  }
  public void setDefaultLocations(SalesDefaultLocations defaultLocations) {
    this.defaultLocations = defaultLocations;
  }
 /**
   * Invoice discrimination, it is discriminationIn plus automatic messages
   * @return discriminationOut
  **/
  public String getDiscriminationOut() {
    return discriminationOut;
  }
  public void setDiscriminationOut(String discriminationOut) {
    this.discriminationOut = discriminationOut;
  }
 /**
   * RPS XML or NFSe XML generated, when the client system doesn't have EDI with government then BR16 return RPS when transaction is created.
   * @return xml
  **/
  public String getXml() {
    return xml;
  }
  public void setXml(String xml) {
    this.xml = xml;
  }
 /**
   * Service sales usually has a EDI integration with government to get Final document or Authorization. This is external process and the integration status is followed by this property. - 'STORED' - 'WAITING APPROVAL' - 'AUTHORIZED' - 'AUTHORIZED with NOTE' - 'ERROR' - 'CANCELED REPLACED' - 'CANCELED' - 'CANCELLATION REQUESTED' 
   * @return ediSyncState
  **/
  public EdiSyncStateEnum getEdiSyncState() {
    return ediSyncState;
  }
  public void setEdiSyncState(EdiSyncStateEnum ediSyncState) {
    this.ediSyncState = ediSyncState;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesHeaderOut {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    companyCode: ").append(toIndentedString(companyCode)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    documentCode: ").append(toIndentedString(documentCode)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
    sb.append("    taxCalculationDate: ").append(toIndentedString(taxCalculationDate)).append("\n");
    sb.append("    companyLocation: ").append(toIndentedString(companyLocation)).append("\n");
    sb.append("    customerCode: ").append(toIndentedString(customerCode)).append("\n");
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

