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
import io.swagger.client.model.PurchaseHeaderIn;
import io.swagger.client.model.PurchaseLinesIn;
import java.util.ArrayList;
import java.util.List;

/**
 * PurchaseTransactionIn
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-06T17:54:07.550Z")
public class PurchaseTransactionIn {
  @SerializedName("header")
  private PurchaseHeaderIn header = null;

  @SerializedName("lines")
  private List<PurchaseLinesIn> lines = new ArrayList<PurchaseLinesIn>();

  public PurchaseTransactionIn header(PurchaseHeaderIn header) {
    this.header = header;
    return this;
  }

   /**
   * Get header
   * @return header
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public PurchaseHeaderIn getHeader() {
    return header;
  }

  public void setHeader(PurchaseHeaderIn header) {
    this.header = header;
  }

  public PurchaseTransactionIn lines(List<PurchaseLinesIn> lines) {
    this.lines = lines;
    return this;
  }

  public PurchaseTransactionIn addLinesItem(PurchaseLinesIn linesItem) {
    this.lines.add(linesItem);
    return this;
  }

   /**
   * Get lines
   * @return lines
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<PurchaseLinesIn> getLines() {
    return lines;
  }

  public void setLines(List<PurchaseLinesIn> lines) {
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
    PurchaseTransactionIn purchaseTransactionIn = (PurchaseTransactionIn) o;
    return Objects.equals(this.header, purchaseTransactionIn.header) &&
        Objects.equals(this.lines, purchaseTransactionIn.lines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, lines);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseTransactionIn {\n");
    
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

