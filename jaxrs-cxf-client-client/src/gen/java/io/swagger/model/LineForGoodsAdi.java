package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class LineForGoodsAdi  {
  
  @ApiModelProperty(example = "null", required = true, value = "aditional sequence number (1 to 100)")
  private Integer addNumber = null;
  @ApiModelProperty(example = "null", required = true, value = "sequential item number for this adi, sequence number (1 to 999)")
  private Integer sequentialNumber = null;
  @ApiModelProperty(example = "null", required = true, value = "Manufatorer erp internal code")
  private String manufacturerCode = null;
  @ApiModelProperty(example = "null", value = "This decimal 13 integers and 2 decimals, aditional adi discount")
  private Double adiDiscount = null;
  @ApiModelProperty(example = "null", value = "Drawback number")
  private String drawbackNumber = null;

 /**
   * aditional sequence number (1 to 100)
   * @return addNumber
  **/
  public Integer getAddNumber() {
    return addNumber;
  }
  public void setAddNumber(Integer addNumber) {
    this.addNumber = addNumber;
  }
 /**
   * sequential item number for this adi, sequence number (1 to 999)
   * @return sequentialNumber
  **/
  public Integer getSequentialNumber() {
    return sequentialNumber;
  }
  public void setSequentialNumber(Integer sequentialNumber) {
    this.sequentialNumber = sequentialNumber;
  }
 /**
   * Manufatorer erp internal code
   * @return manufacturerCode
  **/
  public String getManufacturerCode() {
    return manufacturerCode;
  }
  public void setManufacturerCode(String manufacturerCode) {
    this.manufacturerCode = manufacturerCode;
  }
 /**
   * This decimal 13 integers and 2 decimals, aditional adi discount
   * @return adiDiscount
  **/
  public Double getAdiDiscount() {
    return adiDiscount;
  }
  public void setAdiDiscount(Double adiDiscount) {
    this.adiDiscount = adiDiscount;
  }
 /**
   * Drawback number
   * @return drawbackNumber
  **/
  public String getDrawbackNumber() {
    return drawbackNumber;
  }
  public void setDrawbackNumber(String drawbackNumber) {
    this.drawbackNumber = drawbackNumber;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineForGoodsAdi {\n");
    
    sb.append("    addNumber: ").append(toIndentedString(addNumber)).append("\n");
    sb.append("    sequentialNumber: ").append(toIndentedString(sequentialNumber)).append("\n");
    sb.append("    manufacturerCode: ").append(toIndentedString(manufacturerCode)).append("\n");
    sb.append("    adiDiscount: ").append(toIndentedString(adiDiscount)).append("\n");
    sb.append("    drawbackNumber: ").append(toIndentedString(drawbackNumber)).append("\n");
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

