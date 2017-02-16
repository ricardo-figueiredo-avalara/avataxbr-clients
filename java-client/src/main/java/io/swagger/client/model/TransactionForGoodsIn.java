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
import io.swagger.client.model.HeaderForGoods;
import io.swagger.client.model.LineForGoods;
import java.util.ArrayList;
import java.util.List;

/**
 * TransactionForGoodsIn
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-16T18:26:15.214Z")
public class TransactionForGoodsIn {
  @SerializedName("header")
  private HeaderForGoods header = null;

  @SerializedName("lines")
  private List<LineForGoods> lines = new ArrayList<LineForGoods>();

  public TransactionForGoodsIn header(HeaderForGoods header) {
    this.header = header;
    return this;
  }

   /**
   * Get header
   * @return header
  **/
  @ApiModelProperty(example = "null", value = "")
  public HeaderForGoods getHeader() {
    return header;
  }

  public void setHeader(HeaderForGoods header) {
    this.header = header;
  }

  public TransactionForGoodsIn lines(List<LineForGoods> lines) {
    this.lines = lines;
    return this;
  }

  public TransactionForGoodsIn addLinesItem(LineForGoods linesItem) {
    this.lines.add(linesItem);
    return this;
  }

   /**
   * Get lines
   * @return lines
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<LineForGoods> getLines() {
    return lines;
  }

  public void setLines(List<LineForGoods> lines) {
    this.lines = lines;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionForGoodsIn transactionForGoodsIn = (TransactionForGoodsIn) o;
    return Objects.equals(this.header, transactionForGoodsIn.header) &&
        Objects.equals(this.lines, transactionForGoodsIn.lines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, lines);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionForGoodsIn {\n");
    
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
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
