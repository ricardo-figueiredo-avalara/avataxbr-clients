package io.swagger.model;

import java.math.BigDecimal;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class SefazDisableRangeIn  {
  
  @ApiModelProperty(example = "null", value = "This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity")
  private String companyLocation = null;

@XmlType(name="TransactionModelEnum")
@XmlEnum(String.class)
public enum TransactionModelEnum {

    @XmlEnumValue("55") _55(String.valueOf("55")), @XmlEnumValue("65") _65(String.valueOf("65"));


    private String value;

    TransactionModelEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TransactionModelEnum fromValue(String v) {
        for (TransactionModelEnum b : TransactionModelEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "This string indicates the type of transaction for which tax should be calculated. - '55' # Nota Fiscal Eletrônica (NF-e) - '65' # Nota Fiscal Eletrônica ao-Consumidor Final (NFC-e) ")
  private TransactionModelEnum transactionModel = null;
  @ApiModelProperty(example = "null", value = "Invoice number, sequential unique by invoice serial (Número da nota fiscal) ")
  private Integer invoiceSerial = null;
  @ApiModelProperty(example = "null", value = "")
  private BigDecimal year = null;
  @ApiModelProperty(example = "null", value = "")
  private String message = null;
  @ApiModelProperty(example = "null", value = "First number of disable range.")
  private BigDecimal invoiceNumberInit = null;
  @ApiModelProperty(example = "null", value = "Last number of disable range.")
  private BigDecimal invoiceNumberEnd = null;

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
   * This string indicates the type of transaction for which tax should be calculated. - '55' # Nota Fiscal Eletrônica (NF-e) - '65' # Nota Fiscal Eletrônica ao-Consumidor Final (NFC-e) 
   * @return transactionModel
  **/
  public TransactionModelEnum getTransactionModel() {
    return transactionModel;
  }
  public void setTransactionModel(TransactionModelEnum transactionModel) {
    this.transactionModel = transactionModel;
  }
 /**
   * Invoice number, sequential unique by invoice serial (Número da nota fiscal) 
   * @return invoiceSerial
  **/
  public Integer getInvoiceSerial() {
    return invoiceSerial;
  }
  public void setInvoiceSerial(Integer invoiceSerial) {
    this.invoiceSerial = invoiceSerial;
  }
 /**
   * Get year
   * @return year
  **/
  public BigDecimal getYear() {
    return year;
  }
  public void setYear(BigDecimal year) {
    this.year = year;
  }
 /**
   * Get message
   * @return message
  **/
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }
 /**
   * First number of disable range.
   * @return invoiceNumberInit
  **/
  public BigDecimal getInvoiceNumberInit() {
    return invoiceNumberInit;
  }
  public void setInvoiceNumberInit(BigDecimal invoiceNumberInit) {
    this.invoiceNumberInit = invoiceNumberInit;
  }
 /**
   * Last number of disable range.
   * @return invoiceNumberEnd
  **/
  public BigDecimal getInvoiceNumberEnd() {
    return invoiceNumberEnd;
  }
  public void setInvoiceNumberEnd(BigDecimal invoiceNumberEnd) {
    this.invoiceNumberEnd = invoiceNumberEnd;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SefazDisableRangeIn {\n");
    
    sb.append("    companyLocation: ").append(toIndentedString(companyLocation)).append("\n");
    sb.append("    transactionModel: ").append(toIndentedString(transactionModel)).append("\n");
    sb.append("    invoiceSerial: ").append(toIndentedString(invoiceSerial)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    invoiceNumberInit: ").append(toIndentedString(invoiceNumberInit)).append("\n");
    sb.append("    invoiceNumberEnd: ").append(toIndentedString(invoiceNumberEnd)).append("\n");
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

