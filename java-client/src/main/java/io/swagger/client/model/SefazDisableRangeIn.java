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
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * SefazDisableRangeIn
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-06T17:54:07.550Z")
public class SefazDisableRangeIn {
  @SerializedName("companyLocation")
  private String companyLocation = null;

  /**
   * This string indicates the type of transaction for which tax should be calculated. - '55' # Nota Fiscal Eletrônica (NF-e) - '65' # Nota Fiscal Eletrônica ao-Consumidor Final (NFC-e) 
   */
  public enum TransactionModelEnum {
    @SerializedName("55")
    _55("55"),
    
    @SerializedName("65")
    _65("65");

    private String value;

    TransactionModelEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("transactionModel")
  private TransactionModelEnum transactionModel = null;

  @SerializedName("invoiceSerial")
  private Integer invoiceSerial = null;

  @SerializedName("year")
  private BigDecimal year = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("invoiceNumberInit")
  private BigDecimal invoiceNumberInit = null;

  @SerializedName("invoiceNumberEnd")
  private BigDecimal invoiceNumberEnd = null;

  public SefazDisableRangeIn companyLocation(String companyLocation) {
    this.companyLocation = companyLocation;
    return this;
  }

   /**
   * This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity
   * @return companyLocation
  **/
  @ApiModelProperty(example = "null", value = "This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity")
  public String getCompanyLocation() {
    return companyLocation;
  }

  public void setCompanyLocation(String companyLocation) {
    this.companyLocation = companyLocation;
  }

  public SefazDisableRangeIn transactionModel(TransactionModelEnum transactionModel) {
    this.transactionModel = transactionModel;
    return this;
  }

   /**
   * This string indicates the type of transaction for which tax should be calculated. - '55' # Nota Fiscal Eletrônica (NF-e) - '65' # Nota Fiscal Eletrônica ao-Consumidor Final (NFC-e) 
   * @return transactionModel
  **/
  @ApiModelProperty(example = "null", value = "This string indicates the type of transaction for which tax should be calculated. - '55' # Nota Fiscal Eletrônica (NF-e) - '65' # Nota Fiscal Eletrônica ao-Consumidor Final (NFC-e) ")
  public TransactionModelEnum getTransactionModel() {
    return transactionModel;
  }

  public void setTransactionModel(TransactionModelEnum transactionModel) {
    this.transactionModel = transactionModel;
  }

  public SefazDisableRangeIn invoiceSerial(Integer invoiceSerial) {
    this.invoiceSerial = invoiceSerial;
    return this;
  }

   /**
   * Invoice number, sequential unique by invoice serial (Número da nota fiscal) 
   * @return invoiceSerial
  **/
  @ApiModelProperty(example = "null", value = "Invoice number, sequential unique by invoice serial (Número da nota fiscal) ")
  public Integer getInvoiceSerial() {
    return invoiceSerial;
  }

  public void setInvoiceSerial(Integer invoiceSerial) {
    this.invoiceSerial = invoiceSerial;
  }

  public SefazDisableRangeIn year(BigDecimal year) {
    this.year = year;
    return this;
  }

   /**
   * Get year
   * @return year
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getYear() {
    return year;
  }

  public void setYear(BigDecimal year) {
    this.year = year;
  }

  public SefazDisableRangeIn message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public SefazDisableRangeIn invoiceNumberInit(BigDecimal invoiceNumberInit) {
    this.invoiceNumberInit = invoiceNumberInit;
    return this;
  }

   /**
   * First number of disable range.
   * @return invoiceNumberInit
  **/
  @ApiModelProperty(example = "null", value = "First number of disable range.")
  public BigDecimal getInvoiceNumberInit() {
    return invoiceNumberInit;
  }

  public void setInvoiceNumberInit(BigDecimal invoiceNumberInit) {
    this.invoiceNumberInit = invoiceNumberInit;
  }

  public SefazDisableRangeIn invoiceNumberEnd(BigDecimal invoiceNumberEnd) {
    this.invoiceNumberEnd = invoiceNumberEnd;
    return this;
  }

   /**
   * Last number of disable range.
   * @return invoiceNumberEnd
  **/
  @ApiModelProperty(example = "null", value = "Last number of disable range.")
  public BigDecimal getInvoiceNumberEnd() {
    return invoiceNumberEnd;
  }

  public void setInvoiceNumberEnd(BigDecimal invoiceNumberEnd) {
    this.invoiceNumberEnd = invoiceNumberEnd;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SefazDisableRangeIn sefazDisableRangeIn = (SefazDisableRangeIn) o;
    return Objects.equals(this.companyLocation, sefazDisableRangeIn.companyLocation) &&
        Objects.equals(this.transactionModel, sefazDisableRangeIn.transactionModel) &&
        Objects.equals(this.invoiceSerial, sefazDisableRangeIn.invoiceSerial) &&
        Objects.equals(this.year, sefazDisableRangeIn.year) &&
        Objects.equals(this.message, sefazDisableRangeIn.message) &&
        Objects.equals(this.invoiceNumberInit, sefazDisableRangeIn.invoiceNumberInit) &&
        Objects.equals(this.invoiceNumberEnd, sefazDisableRangeIn.invoiceNumberEnd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyLocation, transactionModel, invoiceSerial, year, message, invoiceNumberInit, invoiceNumberEnd);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

