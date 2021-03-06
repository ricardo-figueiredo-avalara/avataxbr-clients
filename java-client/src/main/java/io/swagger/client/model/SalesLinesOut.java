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

import io.swagger.annotations.ApiModelProperty;

/**
 * SalesLinesOut
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-06T17:54:07.550Z")
public class SalesLinesOut {
  @SerializedName("lineCode")
  private Integer lineCode = null;

  @SerializedName("itemCode")
  private String itemCode = null;

  @SerializedName("numberOfItems")
  private Double numberOfItems = 1.0d;

  @SerializedName("lineAmount")
  private Double lineAmount = null;

  @SerializedName("itemDescription")
  private String itemDescription = null;

  @SerializedName("lineTaxedDiscount")
  private Double lineTaxedDiscount = null;

  @SerializedName("lineUntaxedDiscount")
  private Double lineUntaxedDiscount = null;

  @SerializedName("taxDeductions")
  private SalesLinesOutTaxDeductions taxDeductions = null;

  @SerializedName("avalaraGoodsAndServicesType")
  private String avalaraGoodsAndServicesType = null;

  @SerializedName("lineNetValue")
  private Double lineNetValue = null;

  /**
   * - '01' # ORIGIN MODE - '02' # ORIGIN MODE BUT EXEMPT - '03' # ORIGIN MODE BUT IMMUNE - '04' # ORIGIN MODE BUT SUSPENDED FOR LEGAL REASON - '05' # ORIGIN MODE BUT SUSPENDED FOR ADMINISTRATIVE REASON - '21' # DESTINATION MODE - '22' # DESTINATION MODE BUT EXEMPT - '23' # DESTINATION MODE BUT IMMUNE - '24' # DESTINATION MODE BUT SUSPENDED - '25' # DESTINATION MODE BUT SUSPENDED - '40' # FOREIGN IMMUNE MODE 
   */
  public enum CstEnum {
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
    
    @SerializedName("21")
    _21("21"),
    
    @SerializedName("22")
    _22("22"),
    
    @SerializedName("23")
    _23("23"),
    
    @SerializedName("24")
    _24("24"),
    
    @SerializedName("25")
    _25("25"),
    
    @SerializedName("40")
    _40("40");

    private String value;

    CstEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("cst")
  private CstEnum cst = null;

  /**
   * - '61' # WITHHOLD NORMAL MODE - '62' # WITHHOLD NORMAL MODE BUT EXEMPT - '63' # WITHHOLD NORMAL MODE BUT IMMUNE - '64' # WITHHOLD NORMAL MODE BUT SUSPENDED FOR LEGAL REASON - '65' # WITHHOLD NORMAL MODE BUT SUSPENDED FOR ADMINISTRATIVE REASON - '66' # WITHHOLD FORCED MODE - '67' # WITHHOLD FORCED MODE BUT EXEMPT - '68' # WITHHOLD FORCED MODE BUT IMMUNE - '69' # WITHHOLD FORCED MODE BUT SUSPENDED FOR LEGAL REASON - '70' # WITHHOLD FORCED MODE BUT SUSPENDED FOR ADMINISTRATIVE PROCESS - '71' # NO WITHHOLD MODE - '72' # NO WITHHOLD FOREIGN MODE 
   */
  public enum CstRfEnum {
    @SerializedName("61")
    _61("61"),
    
    @SerializedName("62")
    _62("62"),
    
    @SerializedName("63")
    _63("63"),
    
    @SerializedName("64")
    _64("64"),
    
    @SerializedName("65")
    _65("65"),
    
    @SerializedName("66")
    _66("66"),
    
    @SerializedName("67")
    _67("67"),
    
    @SerializedName("68")
    _68("68"),
    
    @SerializedName("69")
    _69("69"),
    
    @SerializedName("70")
    _70("70"),
    
    @SerializedName("71")
    _71("71"),
    
    @SerializedName("72")
    _72("72");

    private String value;

    CstRfEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("cstRf")
  private CstRfEnum cstRf = null;

  @SerializedName("calculatedTax")
  private SalesCalculatedTax calculatedTax = null;

  public SalesLinesOut lineCode(Integer lineCode) {
    this.lineCode = lineCode;
    return this;
  }

   /**
   * This string is a unique identifier for this line in the transaction
   * @return lineCode
  **/
  @ApiModelProperty(example = "null", value = "This string is a unique identifier for this line in the transaction")
  public Integer getLineCode() {
    return lineCode;
  }

  public void setLineCode(Integer lineCode) {
    this.lineCode = lineCode;
  }

  public SalesLinesOut itemCode(String itemCode) {
    this.itemCode = itemCode;
    return this;
  }

   /**
   * This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU and is required for SST states.
   * @return itemCode
  **/
  @ApiModelProperty(example = "null", required = true, value = "This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU and is required for SST states.")
  public String getItemCode() {
    return itemCode;
  }

  public void setItemCode(String itemCode) {
    this.itemCode = itemCode;
  }

  public SalesLinesOut numberOfItems(Double numberOfItems) {
    this.numberOfItems = numberOfItems;
    return this;
  }

   /**
   * This decimal captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1
   * @return numberOfItems
  **/
  @ApiModelProperty(example = "null", value = "This decimal captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1")
  public Double getNumberOfItems() {
    return numberOfItems;
  }

  public void setNumberOfItems(Double numberOfItems) {
    this.numberOfItems = numberOfItems;
  }

  public SalesLinesOut lineAmount(Double lineAmount) {
    this.lineAmount = lineAmount;
    return this;
  }

   /**
   * This decimal captures the total cost of this line. In its simplest form lineAmount = (item price * numberOfItems).
   * @return lineAmount
  **/
  @ApiModelProperty(example = "null", value = "This decimal captures the total cost of this line. In its simplest form lineAmount = (item price * numberOfItems).")
  public Double getLineAmount() {
    return lineAmount;
  }

  public void setLineAmount(Double lineAmount) {
    this.lineAmount = lineAmount;
  }

  public SalesLinesOut itemDescription(String itemDescription) {
    this.itemDescription = itemDescription;
    return this;
  }

   /**
   * This string captures the description of the item represented by this line, will be used LC 116
   * @return itemDescription
  **/
  @ApiModelProperty(example = "null", value = "This string captures the description of the item represented by this line, will be used LC 116")
  public String getItemDescription() {
    return itemDescription;
  }

  public void setItemDescription(String itemDescription) {
    this.itemDescription = itemDescription;
  }

  public SalesLinesOut lineTaxedDiscount(Double lineTaxedDiscount) {
    this.lineTaxedDiscount = lineTaxedDiscount;
    return this;
  }

   /**
   * Conditional discount
   * @return lineTaxedDiscount
  **/
  @ApiModelProperty(example = "null", value = "Conditional discount")
  public Double getLineTaxedDiscount() {
    return lineTaxedDiscount;
  }

  public void setLineTaxedDiscount(Double lineTaxedDiscount) {
    this.lineTaxedDiscount = lineTaxedDiscount;
  }

  public SalesLinesOut lineUntaxedDiscount(Double lineUntaxedDiscount) {
    this.lineUntaxedDiscount = lineUntaxedDiscount;
    return this;
  }

   /**
   * Unconditional discount
   * @return lineUntaxedDiscount
  **/
  @ApiModelProperty(example = "null", value = "Unconditional discount")
  public Double getLineUntaxedDiscount() {
    return lineUntaxedDiscount;
  }

  public void setLineUntaxedDiscount(Double lineUntaxedDiscount) {
    this.lineUntaxedDiscount = lineUntaxedDiscount;
  }

  public SalesLinesOut taxDeductions(SalesLinesOutTaxDeductions taxDeductions) {
    this.taxDeductions = taxDeductions;
    return this;
  }

   /**
   * Get taxDeductions
   * @return taxDeductions
  **/
  @ApiModelProperty(example = "null", value = "")
  public SalesLinesOutTaxDeductions getTaxDeductions() {
    return taxDeductions;
  }

  public void setTaxDeductions(SalesLinesOutTaxDeductions taxDeductions) {
    this.taxDeductions = taxDeductions;
  }

  public SalesLinesOut avalaraGoodsAndServicesType(String avalaraGoodsAndServicesType) {
    this.avalaraGoodsAndServicesType = avalaraGoodsAndServicesType;
    return this;
  }

   /**
   * AGAST CODE for itemCode
   * @return avalaraGoodsAndServicesType
  **/
  @ApiModelProperty(example = "null", value = "AGAST CODE for itemCode")
  public String getAvalaraGoodsAndServicesType() {
    return avalaraGoodsAndServicesType;
  }

  public void setAvalaraGoodsAndServicesType(String avalaraGoodsAndServicesType) {
    this.avalaraGoodsAndServicesType = avalaraGoodsAndServicesType;
  }

  public SalesLinesOut lineNetValue(Double lineNetValue) {
    this.lineNetValue = lineNetValue;
    return this;
  }

   /**
   * This decimal captures the total cost of this line. In its simplest form lineNetValue = (lineAmount - discountTaxable - sum of whithholdings).
   * @return lineNetValue
  **/
  @ApiModelProperty(example = "null", value = "This decimal captures the total cost of this line. In its simplest form lineNetValue = (lineAmount - discountTaxable - sum of whithholdings).")
  public Double getLineNetValue() {
    return lineNetValue;
  }

  public void setLineNetValue(Double lineNetValue) {
    this.lineNetValue = lineNetValue;
  }

  public SalesLinesOut cst(CstEnum cst) {
    this.cst = cst;
    return this;
  }

   /**
   * - '01' # ORIGIN MODE - '02' # ORIGIN MODE BUT EXEMPT - '03' # ORIGIN MODE BUT IMMUNE - '04' # ORIGIN MODE BUT SUSPENDED FOR LEGAL REASON - '05' # ORIGIN MODE BUT SUSPENDED FOR ADMINISTRATIVE REASON - '21' # DESTINATION MODE - '22' # DESTINATION MODE BUT EXEMPT - '23' # DESTINATION MODE BUT IMMUNE - '24' # DESTINATION MODE BUT SUSPENDED - '25' # DESTINATION MODE BUT SUSPENDED - '40' # FOREIGN IMMUNE MODE 
   * @return cst
  **/
  @ApiModelProperty(example = "null", value = "- '01' # ORIGIN MODE - '02' # ORIGIN MODE BUT EXEMPT - '03' # ORIGIN MODE BUT IMMUNE - '04' # ORIGIN MODE BUT SUSPENDED FOR LEGAL REASON - '05' # ORIGIN MODE BUT SUSPENDED FOR ADMINISTRATIVE REASON - '21' # DESTINATION MODE - '22' # DESTINATION MODE BUT EXEMPT - '23' # DESTINATION MODE BUT IMMUNE - '24' # DESTINATION MODE BUT SUSPENDED - '25' # DESTINATION MODE BUT SUSPENDED - '40' # FOREIGN IMMUNE MODE ")
  public CstEnum getCst() {
    return cst;
  }

  public void setCst(CstEnum cst) {
    this.cst = cst;
  }

  public SalesLinesOut cstRf(CstRfEnum cstRf) {
    this.cstRf = cstRf;
    return this;
  }

   /**
   * - '61' # WITHHOLD NORMAL MODE - '62' # WITHHOLD NORMAL MODE BUT EXEMPT - '63' # WITHHOLD NORMAL MODE BUT IMMUNE - '64' # WITHHOLD NORMAL MODE BUT SUSPENDED FOR LEGAL REASON - '65' # WITHHOLD NORMAL MODE BUT SUSPENDED FOR ADMINISTRATIVE REASON - '66' # WITHHOLD FORCED MODE - '67' # WITHHOLD FORCED MODE BUT EXEMPT - '68' # WITHHOLD FORCED MODE BUT IMMUNE - '69' # WITHHOLD FORCED MODE BUT SUSPENDED FOR LEGAL REASON - '70' # WITHHOLD FORCED MODE BUT SUSPENDED FOR ADMINISTRATIVE PROCESS - '71' # NO WITHHOLD MODE - '72' # NO WITHHOLD FOREIGN MODE 
   * @return cstRf
  **/
  @ApiModelProperty(example = "null", value = "- '61' # WITHHOLD NORMAL MODE - '62' # WITHHOLD NORMAL MODE BUT EXEMPT - '63' # WITHHOLD NORMAL MODE BUT IMMUNE - '64' # WITHHOLD NORMAL MODE BUT SUSPENDED FOR LEGAL REASON - '65' # WITHHOLD NORMAL MODE BUT SUSPENDED FOR ADMINISTRATIVE REASON - '66' # WITHHOLD FORCED MODE - '67' # WITHHOLD FORCED MODE BUT EXEMPT - '68' # WITHHOLD FORCED MODE BUT IMMUNE - '69' # WITHHOLD FORCED MODE BUT SUSPENDED FOR LEGAL REASON - '70' # WITHHOLD FORCED MODE BUT SUSPENDED FOR ADMINISTRATIVE PROCESS - '71' # NO WITHHOLD MODE - '72' # NO WITHHOLD FOREIGN MODE ")
  public CstRfEnum getCstRf() {
    return cstRf;
  }

  public void setCstRf(CstRfEnum cstRf) {
    this.cstRf = cstRf;
  }

  public SalesLinesOut calculatedTax(SalesCalculatedTax calculatedTax) {
    this.calculatedTax = calculatedTax;
    return this;
  }

   /**
   * Get calculatedTax
   * @return calculatedTax
  **/
  @ApiModelProperty(example = "null", value = "")
  public SalesCalculatedTax getCalculatedTax() {
    return calculatedTax;
  }

  public void setCalculatedTax(SalesCalculatedTax calculatedTax) {
    this.calculatedTax = calculatedTax;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SalesLinesOut salesLinesOut = (SalesLinesOut) o;
    return Objects.equals(this.lineCode, salesLinesOut.lineCode) &&
        Objects.equals(this.itemCode, salesLinesOut.itemCode) &&
        Objects.equals(this.numberOfItems, salesLinesOut.numberOfItems) &&
        Objects.equals(this.lineAmount, salesLinesOut.lineAmount) &&
        Objects.equals(this.itemDescription, salesLinesOut.itemDescription) &&
        Objects.equals(this.lineTaxedDiscount, salesLinesOut.lineTaxedDiscount) &&
        Objects.equals(this.lineUntaxedDiscount, salesLinesOut.lineUntaxedDiscount) &&
        Objects.equals(this.taxDeductions, salesLinesOut.taxDeductions) &&
        Objects.equals(this.avalaraGoodsAndServicesType, salesLinesOut.avalaraGoodsAndServicesType) &&
        Objects.equals(this.lineNetValue, salesLinesOut.lineNetValue) &&
        Objects.equals(this.cst, salesLinesOut.cst) &&
        Objects.equals(this.cstRf, salesLinesOut.cstRf) &&
        Objects.equals(this.calculatedTax, salesLinesOut.calculatedTax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineCode, itemCode, numberOfItems, lineAmount, itemDescription, lineTaxedDiscount, lineUntaxedDiscount, taxDeductions, avalaraGoodsAndServicesType, lineNetValue, cst, cstRf, calculatedTax);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesLinesOut {\n");
    
    sb.append("    lineCode: ").append(toIndentedString(lineCode)).append("\n");
    sb.append("    itemCode: ").append(toIndentedString(itemCode)).append("\n");
    sb.append("    numberOfItems: ").append(toIndentedString(numberOfItems)).append("\n");
    sb.append("    lineAmount: ").append(toIndentedString(lineAmount)).append("\n");
    sb.append("    itemDescription: ").append(toIndentedString(itemDescription)).append("\n");
    sb.append("    lineTaxedDiscount: ").append(toIndentedString(lineTaxedDiscount)).append("\n");
    sb.append("    lineUntaxedDiscount: ").append(toIndentedString(lineUntaxedDiscount)).append("\n");
    sb.append("    taxDeductions: ").append(toIndentedString(taxDeductions)).append("\n");
    sb.append("    avalaraGoodsAndServicesType: ").append(toIndentedString(avalaraGoodsAndServicesType)).append("\n");
    sb.append("    lineNetValue: ").append(toIndentedString(lineNetValue)).append("\n");
    sb.append("    cst: ").append(toIndentedString(cst)).append("\n");
    sb.append("    cstRf: ").append(toIndentedString(cstRf)).append("\n");
    sb.append("    calculatedTax: ").append(toIndentedString(calculatedTax)).append("\n");
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

