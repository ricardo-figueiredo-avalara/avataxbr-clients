package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class PayRecLinesIn  {
  
  @ApiModelProperty(example = "null", value = "Installment number in this document")
  private Integer lineCode = null;

@XmlType(name="LineTypeEnum")
@XmlEnum(String.class)
public enum LineTypeEnum {

    @XmlEnumValue("installment") INSTALLMENT(String.valueOf("installment"));


    private String value;

    LineTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static LineTypeEnum fromValue(String v) {
        for (LineTypeEnum b : LineTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "")
  private LineTypeEnum lineType = null;
  @ApiModelProperty(example = "null", required = true, value = "Bill transaction code This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc.")
  private String itemCode = null;
  @ApiModelProperty(example = "null", value = "Free description about this payment")
  private String itemDescription = null;
  @ApiModelProperty(example = "null", value = "Installment number, when paid AS IS")
  private String itemDocNumber = null;
  @ApiModelProperty(example = "null", value = "Penalty, usually because paid after due date")
  private Double lineUntaxedPenality = null;
  @ApiModelProperty(example = "null", value = "unconditional discounts")
  private Double lineUntaxedDiscount = null;

 /**
   * Installment number in this document
   * @return lineCode
  **/
  public Integer getLineCode() {
    return lineCode;
  }
  public void setLineCode(Integer lineCode) {
    this.lineCode = lineCode;
  }
 /**
   * Get lineType
   * @return lineType
  **/
  public LineTypeEnum getLineType() {
    return lineType;
  }
  public void setLineType(LineTypeEnum lineType) {
    this.lineType = lineType;
  }
 /**
   * Bill transaction code This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc.
   * @return itemCode
  **/
  public String getItemCode() {
    return itemCode;
  }
  public void setItemCode(String itemCode) {
    this.itemCode = itemCode;
  }
 /**
   * Free description about this payment
   * @return itemDescription
  **/
  public String getItemDescription() {
    return itemDescription;
  }
  public void setItemDescription(String itemDescription) {
    this.itemDescription = itemDescription;
  }
 /**
   * Installment number, when paid AS IS
   * @return itemDocNumber
  **/
  public String getItemDocNumber() {
    return itemDocNumber;
  }
  public void setItemDocNumber(String itemDocNumber) {
    this.itemDocNumber = itemDocNumber;
  }
 /**
   * Penalty, usually because paid after due date
   * @return lineUntaxedPenality
  **/
  public Double getLineUntaxedPenality() {
    return lineUntaxedPenality;
  }
  public void setLineUntaxedPenality(Double lineUntaxedPenality) {
    this.lineUntaxedPenality = lineUntaxedPenality;
  }
 /**
   * unconditional discounts
   * @return lineUntaxedDiscount
  **/
  public Double getLineUntaxedDiscount() {
    return lineUntaxedDiscount;
  }
  public void setLineUntaxedDiscount(Double lineUntaxedDiscount) {
    this.lineUntaxedDiscount = lineUntaxedDiscount;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

