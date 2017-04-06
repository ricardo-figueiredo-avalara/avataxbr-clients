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
import io.swagger.client.model.LineForGoodsIndExport;

/**
 * LineForGoodsExport
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-06T17:54:07.550Z")
public class LineForGoodsExport {
  @SerializedName("drawbackNumber")
  private String drawbackNumber = null;

  @SerializedName("indExport")
  private LineForGoodsIndExport indExport = null;

  public LineForGoodsExport drawbackNumber(String drawbackNumber) {
    this.drawbackNumber = drawbackNumber;
    return this;
  }

   /**
   * Get drawbackNumber
   * @return drawbackNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDrawbackNumber() {
    return drawbackNumber;
  }

  public void setDrawbackNumber(String drawbackNumber) {
    this.drawbackNumber = drawbackNumber;
  }

  public LineForGoodsExport indExport(LineForGoodsIndExport indExport) {
    this.indExport = indExport;
    return this;
  }

   /**
   * Get indExport
   * @return indExport
  **/
  @ApiModelProperty(example = "null", value = "")
  public LineForGoodsIndExport getIndExport() {
    return indExport;
  }

  public void setIndExport(LineForGoodsIndExport indExport) {
    this.indExport = indExport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineForGoodsExport lineForGoodsExport = (LineForGoodsExport) o;
    return Objects.equals(this.drawbackNumber, lineForGoodsExport.drawbackNumber) &&
        Objects.equals(this.indExport, lineForGoodsExport.indExport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(drawbackNumber, indExport);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineForGoodsExport {\n");
    
    sb.append("    drawbackNumber: ").append(toIndentedString(drawbackNumber)).append("\n");
    sb.append("    indExport: ").append(toIndentedString(indExport)).append("\n");
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
