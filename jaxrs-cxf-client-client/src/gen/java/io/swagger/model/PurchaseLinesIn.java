package io.swagger.model;

import io.swagger.model.SalesLinesOutTaxDeductions;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class PurchaseLinesIn  {
  
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

@XmlType(name="UseTypeEnum")
@XmlEnum(String.class)
public enum UseTypeEnum {

    @XmlEnumValue("resale") RESALE(String.valueOf("resale")), @XmlEnumValue("production") PRODUCTION(String.valueOf("production")), @XmlEnumValue("use or consumption") USE_OR_CONSUMPTION(String.valueOf("use or consumption")), @XmlEnumValue("fixed assets") FIXED_ASSETS(String.valueOf("fixed assets"));


    private String value;

    UseTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static UseTypeEnum fromValue(String v) {
        for (UseTypeEnum b : UseTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "Type of entity use associated with this line - 'resale' - 'production' - 'use or consumption' - 'fixed assets' ")
  private UseTypeEnum useType = null;
  @ApiModelProperty(example = "null", value = "")
  private SalesLinesOutTaxDeductions taxDeductions = null;

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
   * Type of entity use associated with this line - 'resale' - 'production' - 'use or consumption' - 'fixed assets' 
   * @return useType
  **/
  public UseTypeEnum getUseType() {
    return useType;
  }
  public void setUseType(UseTypeEnum useType) {
    this.useType = useType;
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

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseLinesIn {\n");
    
    sb.append("    lineCode: ").append(toIndentedString(lineCode)).append("\n");
    sb.append("    itemCode: ").append(toIndentedString(itemCode)).append("\n");
    sb.append("    numberOfItems: ").append(toIndentedString(numberOfItems)).append("\n");
    sb.append("    lineAmount: ").append(toIndentedString(lineAmount)).append("\n");
    sb.append("    itemDescription: ").append(toIndentedString(itemDescription)).append("\n");
    sb.append("    lineTaxedDiscount: ").append(toIndentedString(lineTaxedDiscount)).append("\n");
    sb.append("    lineUntaxedDiscount: ").append(toIndentedString(lineUntaxedDiscount)).append("\n");
    sb.append("    useType: ").append(toIndentedString(useType)).append("\n");
    sb.append("    taxDeductions: ").append(toIndentedString(taxDeductions)).append("\n");
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

