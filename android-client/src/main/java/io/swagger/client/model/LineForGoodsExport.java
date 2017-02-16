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

import io.swagger.client.model.LineForGoodsIndExport;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class LineForGoodsExport {
  
  @SerializedName("drawbackNumber")
  private String drawbackNumber = null;
  @SerializedName("indExport")
  private LineForGoodsIndExport indExport = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDrawbackNumber() {
    return drawbackNumber;
  }
  public void setDrawbackNumber(String drawbackNumber) {
    this.drawbackNumber = drawbackNumber;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public LineForGoodsIndExport getIndExport() {
    return indExport;
  }
  public void setIndExport(LineForGoodsIndExport indExport) {
    this.indExport = indExport;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineForGoodsExport lineForGoodsExport = (LineForGoodsExport) o;
    return (this.drawbackNumber == null ? lineForGoodsExport.drawbackNumber == null : this.drawbackNumber.equals(lineForGoodsExport.drawbackNumber)) &&
        (this.indExport == null ? lineForGoodsExport.indExport == null : this.indExport.equals(lineForGoodsExport.indExport));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.drawbackNumber == null ? 0: this.drawbackNumber.hashCode());
    result = 31 * result + (this.indExport == null ? 0: this.indExport.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineForGoodsExport {\n");
    
    sb.append("  drawbackNumber: ").append(drawbackNumber).append("\n");
    sb.append("  indExport: ").append(indExport).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}