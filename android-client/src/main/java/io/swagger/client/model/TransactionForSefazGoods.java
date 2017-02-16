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

import io.swagger.client.model.CalculatedTaxSummaryForGoods;
import io.swagger.client.model.HeaderForGoods;
import io.swagger.client.model.LineForSefazGoods;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class TransactionForSefazGoods {
  
  @SerializedName("header")
  private HeaderForGoods header = null;
  @SerializedName("lines")
  private List<LineForSefazGoods> lines = null;
  @SerializedName("calculatedTaxSummary")
  private CalculatedTaxSummaryForGoods calculatedTaxSummary = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public HeaderForGoods getHeader() {
    return header;
  }
  public void setHeader(HeaderForGoods header) {
    this.header = header;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<LineForSefazGoods> getLines() {
    return lines;
  }
  public void setLines(List<LineForSefazGoods> lines) {
    this.lines = lines;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public CalculatedTaxSummaryForGoods getCalculatedTaxSummary() {
    return calculatedTaxSummary;
  }
  public void setCalculatedTaxSummary(CalculatedTaxSummaryForGoods calculatedTaxSummary) {
    this.calculatedTaxSummary = calculatedTaxSummary;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionForSefazGoods transactionForSefazGoods = (TransactionForSefazGoods) o;
    return (this.header == null ? transactionForSefazGoods.header == null : this.header.equals(transactionForSefazGoods.header)) &&
        (this.lines == null ? transactionForSefazGoods.lines == null : this.lines.equals(transactionForSefazGoods.lines)) &&
        (this.calculatedTaxSummary == null ? transactionForSefazGoods.calculatedTaxSummary == null : this.calculatedTaxSummary.equals(transactionForSefazGoods.calculatedTaxSummary));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.header == null ? 0: this.header.hashCode());
    result = 31 * result + (this.lines == null ? 0: this.lines.hashCode());
    result = 31 * result + (this.calculatedTaxSummary == null ? 0: this.calculatedTaxSummary.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionForSefazGoods {\n");
    
    sb.append("  header: ").append(header).append("\n");
    sb.append("  lines: ").append(lines).append("\n");
    sb.append("  calculatedTaxSummary: ").append(calculatedTaxSummary).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
