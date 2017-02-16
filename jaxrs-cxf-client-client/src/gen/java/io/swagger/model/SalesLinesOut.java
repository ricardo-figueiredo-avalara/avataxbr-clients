package io.swagger.model;

import io.swagger.model.SalesCalculatedTax;
import io.swagger.model.SalesLinesIn;
import io.swagger.model.SalesLinesOutTaxDeductions;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class SalesLinesOut  {
  
  @ApiModelProperty(example = "null", value = "This string is a unique identifier for this line in the transaction")
  private Integer lineCode = null;
  @ApiModelProperty(example = "null", required = true, value = "This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU and is required for SST states.")
  private String itemCode = null;
  @ApiModelProperty(example = "null", value = "This decimal captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1")
  private Double numberOfItems = 1.0d;
  @ApiModelProperty(example = "null", value = "This decimal captures the total cost of this line. In its simplest form lineAmount = (item price * numberOfItems).")
  private Double lineAmount = null;
  @ApiModelProperty(example = "null", value = "This string captures the description of the item represented by this line, will be used LC 116")
  private String itemDescription = null;
  @ApiModelProperty(example = "null", value = "Conditional discount")
  private Double lineTaxedDiscount = null;
  @ApiModelProperty(example = "null", value = "Unconditional discount")
  private Double lineUntaxedDiscount = null;
  @ApiModelProperty(example = "null", value = "")
  private SalesLinesOutTaxDeductions taxDeductions = null;
  @ApiModelProperty(example = "null", value = "AGAST CODE for itemCode")
  private String avalaraGoodsAndServicesType = null;
  @ApiModelProperty(example = "null", value = "This decimal captures the total cost of this line. In its simplest form lineNetValue = (lineAmount - discountTaxable - sum of whithholdings).")
  private Double lineNetValue = null;

@XmlType(name="CstEnum")
@XmlEnum(String.class)
public enum CstEnum {

    @XmlEnumValue("01") _01(String.valueOf("01")), @XmlEnumValue("02") _02(String.valueOf("02")), @XmlEnumValue("03") _03(String.valueOf("03")), @XmlEnumValue("04") _04(String.valueOf("04")), @XmlEnumValue("05") _05(String.valueOf("05")), @XmlEnumValue("21") _21(String.valueOf("21")), @XmlEnumValue("22") _22(String.valueOf("22")), @XmlEnumValue("23") _23(String.valueOf("23")), @XmlEnumValue("24") _24(String.valueOf("24")), @XmlEnumValue("25") _25(String.valueOf("25")), @XmlEnumValue("40") _40(String.valueOf("40"));


    private String value;

    CstEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CstEnum fromValue(String v) {
        for (CstEnum b : CstEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "- '01' # ORIGIN MODE - '02' # ORIGIN MODE BUT EXEMPT - '03' # ORIGIN MODE BUT IMMUNE - '04' # ORIGIN MODE BUT SUSPENDED FOR LEGAL REASON - '05' # ORIGIN MODE BUT SUSPENDED FOR ADMINISTRATIVE REASON - '21' # DESTINATION MODE - '22' # DESTINATION MODE BUT EXEMPT - '23' # DESTINATION MODE BUT IMMUNE - '24' # DESTINATION MODE BUT SUSPENDED - '25' # DESTINATION MODE BUT SUSPENDED - '40' # FOREIGN IMMUNE MODE ")
  private CstEnum cst = null;

@XmlType(name="CstRfEnum")
@XmlEnum(String.class)
public enum CstRfEnum {

    @XmlEnumValue("61") _61(String.valueOf("61")), @XmlEnumValue("62") _62(String.valueOf("62")), @XmlEnumValue("63") _63(String.valueOf("63")), @XmlEnumValue("64") _64(String.valueOf("64")), @XmlEnumValue("65") _65(String.valueOf("65")), @XmlEnumValue("66") _66(String.valueOf("66")), @XmlEnumValue("67") _67(String.valueOf("67")), @XmlEnumValue("68") _68(String.valueOf("68")), @XmlEnumValue("69") _69(String.valueOf("69")), @XmlEnumValue("70") _70(String.valueOf("70")), @XmlEnumValue("71") _71(String.valueOf("71")), @XmlEnumValue("72") _72(String.valueOf("72"));


    private String value;

    CstRfEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CstRfEnum fromValue(String v) {
        for (CstRfEnum b : CstRfEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "- '61' # WITHHOLD NORMAL MODE - '62' # WITHHOLD NORMAL MODE BUT EXEMPT - '63' # WITHHOLD NORMAL MODE BUT IMMUNE - '64' # WITHHOLD NORMAL MODE BUT SUSPENDED FOR LEGAL REASON - '65' # WITHHOLD NORMAL MODE BUT SUSPENDED FOR ADMINISTRATIVE REASON - '66' # WITHHOLD FORCED MODE - '67' # WITHHOLD FORCED MODE BUT EXEMPT - '68' # WITHHOLD FORCED MODE BUT IMMUNE - '69' # WITHHOLD FORCED MODE BUT SUSPENDED FOR LEGAL REASON - '70' # WITHHOLD FORCED MODE BUT SUSPENDED FOR ADMINISTRATIVE PROCESS - '71' # NO WITHHOLD MODE - '72' # NO WITHHOLD FOREIGN MODE ")
  private CstRfEnum cstRf = null;
  @ApiModelProperty(example = "null", value = "")
  private SalesCalculatedTax calculatedTax = null;

 /**
   * This string is a unique identifier for this line in the transaction
   * @return lineCode
  **/
  public Integer getLineCode() {
    return lineCode;
  }
  public void setLineCode(Integer lineCode) {
    this.lineCode = lineCode;
  }
 /**
   * This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU and is required for SST states.
   * @return itemCode
  **/
  public String getItemCode() {
    return itemCode;
  }
  public void setItemCode(String itemCode) {
    this.itemCode = itemCode;
  }
 /**
   * This decimal captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1
   * @return numberOfItems
  **/
  public Double getNumberOfItems() {
    return numberOfItems;
  }
  public void setNumberOfItems(Double numberOfItems) {
    this.numberOfItems = numberOfItems;
  }
 /**
   * This decimal captures the total cost of this line. In its simplest form lineAmount = (item price * numberOfItems).
   * @return lineAmount
  **/
  public Double getLineAmount() {
    return lineAmount;
  }
  public void setLineAmount(Double lineAmount) {
    this.lineAmount = lineAmount;
  }
 /**
   * This string captures the description of the item represented by this line, will be used LC 116
   * @return itemDescription
  **/
  public String getItemDescription() {
    return itemDescription;
  }
  public void setItemDescription(String itemDescription) {
    this.itemDescription = itemDescription;
  }
 /**
   * Conditional discount
   * @return lineTaxedDiscount
  **/
  public Double getLineTaxedDiscount() {
    return lineTaxedDiscount;
  }
  public void setLineTaxedDiscount(Double lineTaxedDiscount) {
    this.lineTaxedDiscount = lineTaxedDiscount;
  }
 /**
   * Unconditional discount
   * @return lineUntaxedDiscount
  **/
  public Double getLineUntaxedDiscount() {
    return lineUntaxedDiscount;
  }
  public void setLineUntaxedDiscount(Double lineUntaxedDiscount) {
    this.lineUntaxedDiscount = lineUntaxedDiscount;
  }
 /**
   * Get taxDeductions
   * @return taxDeductions
  **/
  public SalesLinesOutTaxDeductions getTaxDeductions() {
    return taxDeductions;
  }
  public void setTaxDeductions(SalesLinesOutTaxDeductions taxDeductions) {
    this.taxDeductions = taxDeductions;
  }
 /**
   * AGAST CODE for itemCode
   * @return avalaraGoodsAndServicesType
  **/
  public String getAvalaraGoodsAndServicesType() {
    return avalaraGoodsAndServicesType;
  }
  public void setAvalaraGoodsAndServicesType(String avalaraGoodsAndServicesType) {
    this.avalaraGoodsAndServicesType = avalaraGoodsAndServicesType;
  }
 /**
   * This decimal captures the total cost of this line. In its simplest form lineNetValue = (lineAmount - discountTaxable - sum of whithholdings).
   * @return lineNetValue
  **/
  public Double getLineNetValue() {
    return lineNetValue;
  }
  public void setLineNetValue(Double lineNetValue) {
    this.lineNetValue = lineNetValue;
  }
 /**
   * - '01' # ORIGIN MODE - '02' # ORIGIN MODE BUT EXEMPT - '03' # ORIGIN MODE BUT IMMUNE - '04' # ORIGIN MODE BUT SUSPENDED FOR LEGAL REASON - '05' # ORIGIN MODE BUT SUSPENDED FOR ADMINISTRATIVE REASON - '21' # DESTINATION MODE - '22' # DESTINATION MODE BUT EXEMPT - '23' # DESTINATION MODE BUT IMMUNE - '24' # DESTINATION MODE BUT SUSPENDED - '25' # DESTINATION MODE BUT SUSPENDED - '40' # FOREIGN IMMUNE MODE 
   * @return cst
  **/
  public CstEnum getCst() {
    return cst;
  }
  public void setCst(CstEnum cst) {
    this.cst = cst;
  }
 /**
   * - '61' # WITHHOLD NORMAL MODE - '62' # WITHHOLD NORMAL MODE BUT EXEMPT - '63' # WITHHOLD NORMAL MODE BUT IMMUNE - '64' # WITHHOLD NORMAL MODE BUT SUSPENDED FOR LEGAL REASON - '65' # WITHHOLD NORMAL MODE BUT SUSPENDED FOR ADMINISTRATIVE REASON - '66' # WITHHOLD FORCED MODE - '67' # WITHHOLD FORCED MODE BUT EXEMPT - '68' # WITHHOLD FORCED MODE BUT IMMUNE - '69' # WITHHOLD FORCED MODE BUT SUSPENDED FOR LEGAL REASON - '70' # WITHHOLD FORCED MODE BUT SUSPENDED FOR ADMINISTRATIVE PROCESS - '71' # NO WITHHOLD MODE - '72' # NO WITHHOLD FOREIGN MODE 
   * @return cstRf
  **/
  public CstRfEnum getCstRf() {
    return cstRf;
  }
  public void setCstRf(CstRfEnum cstRf) {
    this.cstRf = cstRf;
  }
 /**
   * Get calculatedTax
   * @return calculatedTax
  **/
  public SalesCalculatedTax getCalculatedTax() {
    return calculatedTax;
  }
  public void setCalculatedTax(SalesCalculatedTax calculatedTax) {
    this.calculatedTax = calculatedTax;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

