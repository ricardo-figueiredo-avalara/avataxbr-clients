/**
 * BR16 - API
 * This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class LineForGoodsAdi {
  
  @SerializedName("addNumber")
  private Integer addNumber = null;
  @SerializedName("sequentialNumber")
  private Integer sequentialNumber = null;
  @SerializedName("manufacturerCode")
  private String manufacturerCode = null;
  @SerializedName("adiDiscount")
  private Double adiDiscount = null;
  @SerializedName("drawbackNumber")
  private String drawbackNumber = null;

  /**
   * aditional sequence number (1 to 100)
   **/
  @ApiModelProperty(required = true, value = "aditional sequence number (1 to 100)")
  public Integer getAddNumber() {
    return addNumber;
  }
  public void setAddNumber(Integer addNumber) {
    this.addNumber = addNumber;
  }

  /**
   * sequential item number for this adi, sequence number (1 to 999)
   **/
  @ApiModelProperty(required = true, value = "sequential item number for this adi, sequence number (1 to 999)")
  public Integer getSequentialNumber() {
    return sequentialNumber;
  }
  public void setSequentialNumber(Integer sequentialNumber) {
    this.sequentialNumber = sequentialNumber;
  }

  /**
   * Manufatorer erp internal code
   **/
  @ApiModelProperty(required = true, value = "Manufatorer erp internal code")
  public String getManufacturerCode() {
    return manufacturerCode;
  }
  public void setManufacturerCode(String manufacturerCode) {
    this.manufacturerCode = manufacturerCode;
  }

  /**
   * This decimal 13 integers and 2 decimals, aditional adi discount
   **/
  @ApiModelProperty(value = "This decimal 13 integers and 2 decimals, aditional adi discount")
  public Double getAdiDiscount() {
    return adiDiscount;
  }
  public void setAdiDiscount(Double adiDiscount) {
    this.adiDiscount = adiDiscount;
  }

  /**
   * Drawback number
   **/
  @ApiModelProperty(value = "Drawback number")
  public String getDrawbackNumber() {
    return drawbackNumber;
  }
  public void setDrawbackNumber(String drawbackNumber) {
    this.drawbackNumber = drawbackNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineForGoodsAdi lineForGoodsAdi = (LineForGoodsAdi) o;
    return (this.addNumber == null ? lineForGoodsAdi.addNumber == null : this.addNumber.equals(lineForGoodsAdi.addNumber)) &&
        (this.sequentialNumber == null ? lineForGoodsAdi.sequentialNumber == null : this.sequentialNumber.equals(lineForGoodsAdi.sequentialNumber)) &&
        (this.manufacturerCode == null ? lineForGoodsAdi.manufacturerCode == null : this.manufacturerCode.equals(lineForGoodsAdi.manufacturerCode)) &&
        (this.adiDiscount == null ? lineForGoodsAdi.adiDiscount == null : this.adiDiscount.equals(lineForGoodsAdi.adiDiscount)) &&
        (this.drawbackNumber == null ? lineForGoodsAdi.drawbackNumber == null : this.drawbackNumber.equals(lineForGoodsAdi.drawbackNumber));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.addNumber == null ? 0: this.addNumber.hashCode());
    result = 31 * result + (this.sequentialNumber == null ? 0: this.sequentialNumber.hashCode());
    result = 31 * result + (this.manufacturerCode == null ? 0: this.manufacturerCode.hashCode());
    result = 31 * result + (this.adiDiscount == null ? 0: this.adiDiscount.hashCode());
    result = 31 * result + (this.drawbackNumber == null ? 0: this.drawbackNumber.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineForGoodsAdi {\n");
    
    sb.append("  addNumber: ").append(addNumber).append("\n");
    sb.append("  sequentialNumber: ").append(sequentialNumber).append("\n");
    sb.append("  manufacturerCode: ").append(manufacturerCode).append("\n");
    sb.append("  adiDiscount: ").append(adiDiscount).append("\n");
    sb.append("  drawbackNumber: ").append(drawbackNumber).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}