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
 * PayRecLinesIn
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-06T17:54:07.550Z")
public class PayRecLinesIn {
  @SerializedName("lineCode")
  private Integer lineCode = null;

  /**
   * Gets or Sets lineType
   */
  public enum LineTypeEnum {
    @SerializedName("installment")
    INSTALLMENT("installment");

    private String value;

    LineTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("lineType")
  private LineTypeEnum lineType = null;

  @SerializedName("itemCode")
  private String itemCode = null;

  @SerializedName("itemDescription")
  private String itemDescription = null;

  @SerializedName("itemDocNumber")
  private String itemDocNumber = null;

  @SerializedName("lineUntaxedPenality")
  private Double lineUntaxedPenality = null;

  @SerializedName("lineUntaxedDiscount")
  private Double lineUntaxedDiscount = null;

  public PayRecLinesIn lineCode(Integer lineCode) {
    this.lineCode = lineCode;
    return this;
  }

   /**
   * Installment number in this document
   * @return lineCode
  **/
  @ApiModelProperty(example = "null", value = "Installment number in this document")
  public Integer getLineCode() {
    return lineCode;
  }

  public void setLineCode(Integer lineCode) {
    this.lineCode = lineCode;
  }

  public PayRecLinesIn lineType(LineTypeEnum lineType) {
    this.lineType = lineType;
    return this;
  }

   /**
   * Get lineType
   * @return lineType
  **/
  @ApiModelProperty(example = "null", value = "")
  public LineTypeEnum getLineType() {
    return lineType;
  }

  public void setLineType(LineTypeEnum lineType) {
    this.lineType = lineType;
  }

  public PayRecLinesIn itemCode(String itemCode) {
    this.itemCode = itemCode;
    return this;
  }

   /**
   * Bill transaction code This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc.
   * @return itemCode
  **/
  @ApiModelProperty(example = "null", required = true, value = "Bill transaction code This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc.")
  public String getItemCode() {
    return itemCode;
  }

  public void setItemCode(String itemCode) {
    this.itemCode = itemCode;
  }

  public PayRecLinesIn itemDescription(String itemDescription) {
    this.itemDescription = itemDescription;
    return this;
  }

   /**
   * Free description about this payment
   * @return itemDescription
  **/
  @ApiModelProperty(example = "null", value = "Free description about this payment")
  public String getItemDescription() {
    return itemDescription;
  }

  public void setItemDescription(String itemDescription) {
    this.itemDescription = itemDescription;
  }

  public PayRecLinesIn itemDocNumber(String itemDocNumber) {
    this.itemDocNumber = itemDocNumber;
    return this;
  }

   /**
   * Installment number, when paid AS IS
   * @return itemDocNumber
  **/
  @ApiModelProperty(example = "null", value = "Installment number, when paid AS IS")
  public String getItemDocNumber() {
    return itemDocNumber;
  }

  public void setItemDocNumber(String itemDocNumber) {
    this.itemDocNumber = itemDocNumber;
  }

  public PayRecLinesIn lineUntaxedPenality(Double lineUntaxedPenality) {
    this.lineUntaxedPenality = lineUntaxedPenality;
    return this;
  }

   /**
   * Penalty, usually because paid after due date
   * @return lineUntaxedPenality
  **/
  @ApiModelProperty(example = "null", value = "Penalty, usually because paid after due date")
  public Double getLineUntaxedPenality() {
    return lineUntaxedPenality;
  }

  public void setLineUntaxedPenality(Double lineUntaxedPenality) {
    this.lineUntaxedPenality = lineUntaxedPenality;
  }

  public PayRecLinesIn lineUntaxedDiscount(Double lineUntaxedDiscount) {
    this.lineUntaxedDiscount = lineUntaxedDiscount;
    return this;
  }

   /**
   * unconditional discounts
   * @return lineUntaxedDiscount
  **/
  @ApiModelProperty(example = "null", value = "unconditional discounts")
  public Double getLineUntaxedDiscount() {
    return lineUntaxedDiscount;
  }

  public void setLineUntaxedDiscount(Double lineUntaxedDiscount) {
    this.lineUntaxedDiscount = lineUntaxedDiscount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayRecLinesIn payRecLinesIn = (PayRecLinesIn) o;
    return Objects.equals(this.lineCode, payRecLinesIn.lineCode) &&
        Objects.equals(this.lineType, payRecLinesIn.lineType) &&
        Objects.equals(this.itemCode, payRecLinesIn.itemCode) &&
        Objects.equals(this.itemDescription, payRecLinesIn.itemDescription) &&
        Objects.equals(this.itemDocNumber, payRecLinesIn.itemDocNumber) &&
        Objects.equals(this.lineUntaxedPenality, payRecLinesIn.lineUntaxedPenality) &&
        Objects.equals(this.lineUntaxedDiscount, payRecLinesIn.lineUntaxedDiscount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineCode, lineType, itemCode, itemDescription, itemDocNumber, lineUntaxedPenality, lineUntaxedDiscount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayRecLinesIn {\n");
    
    sb.append("    lineCode: ").append(toIndentedString(lineCode)).append("\n");
    sb.append("    lineType: ").append(toIndentedString(lineType)).append("\n");
    sb.append("    itemCode: ").append(toIndentedString(itemCode)).append("\n");
    sb.append("    itemDescription: ").append(toIndentedString(itemDescription)).append("\n");
    sb.append("    itemDocNumber: ").append(toIndentedString(itemDocNumber)).append("\n");
    sb.append("    lineUntaxedPenality: ").append(toIndentedString(lineUntaxedPenality)).append("\n");
    sb.append("    lineUntaxedDiscount: ").append(toIndentedString(lineUntaxedDiscount)).append("\n");
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

