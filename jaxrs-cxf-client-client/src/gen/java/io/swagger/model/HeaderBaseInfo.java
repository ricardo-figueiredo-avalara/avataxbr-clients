package io.swagger.model;

import org.joda.time.LocalDate;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class HeaderBaseInfo  {
  
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

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeaderBaseInfo {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    companyCode: ").append(toIndentedString(companyCode)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    documentCode: ").append(toIndentedString(documentCode)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
    sb.append("    taxCalculationDate: ").append(toIndentedString(taxCalculationDate)).append("\n");
    sb.append("    companyLocation: ").append(toIndentedString(companyLocation)).append("\n");
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

