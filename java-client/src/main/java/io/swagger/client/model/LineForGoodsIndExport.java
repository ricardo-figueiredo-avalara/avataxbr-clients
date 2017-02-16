/*
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

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * indirect exportation
 */
@ApiModel(description = "indirect exportation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-16T18:26:15.214Z")
public class LineForGoodsIndExport {
  @SerializedName("registerNumber")
  private String registerNumber = null;

  @SerializedName("accessKey")
  private String accessKey = null;

  @SerializedName("quantity")
  private Double quantity = null;

  public LineForGoodsIndExport registerNumber(String registerNumber) {
    this.registerNumber = registerNumber;
    return this;
  }

   /**
   * Exportation register number
   * @return registerNumber
  **/
  @ApiModelProperty(example = "null", required = true, value = "Exportation register number")
  public String getRegisterNumber() {
    return registerNumber;
  }

  public void setRegisterNumber(String registerNumber) {
    this.registerNumber = registerNumber;
  }

  public LineForGoodsIndExport accessKey(String accessKey) {
    this.accessKey = accessKey;
    return this;
  }

   /**
   * invoice access key received to export
   * @return accessKey
  **/
  @ApiModelProperty(example = "null", required = true, value = "invoice access key received to export")
  public String getAccessKey() {
    return accessKey;
  }

  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }

  public LineForGoodsIndExport quantity(Double quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * This decimal 11 integers and 0 to 4 decimals, quantity exported in real
   * @return quantity
  **/
  @ApiModelProperty(example = "null", required = true, value = "This decimal 11 integers and 0 to 4 decimals, quantity exported in real")
  public Double getQuantity() {
    return quantity;
  }

  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineForGoodsIndExport lineForGoodsIndExport = (LineForGoodsIndExport) o;
    return Objects.equals(this.registerNumber, lineForGoodsIndExport.registerNumber) &&
        Objects.equals(this.accessKey, lineForGoodsIndExport.accessKey) &&
        Objects.equals(this.quantity, lineForGoodsIndExport.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registerNumber, accessKey, quantity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineForGoodsIndExport {\n");
    
    sb.append("    registerNumber: ").append(toIndentedString(registerNumber)).append("\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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
