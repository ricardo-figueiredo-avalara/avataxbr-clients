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
import io.swagger.client.model.DetailsCalculatedTaxItem;
import io.swagger.client.model.LineForGoodsCalculatedTaxTaxByType;
import java.util.ArrayList;
import java.util.List;

/**
 * LineForGoodsCalculatedTax
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-06T17:54:07.550Z")
public class LineForGoodsCalculatedTax {
  @SerializedName("taxByType")
  private LineForGoodsCalculatedTaxTaxByType taxByType = null;

  @SerializedName("tax")
  private Double tax = null;

  @SerializedName("details")
  private List<DetailsCalculatedTaxItem> details = new ArrayList<DetailsCalculatedTaxItem>();

  public LineForGoodsCalculatedTax taxByType(LineForGoodsCalculatedTaxTaxByType taxByType) {
    this.taxByType = taxByType;
    return this;
  }

   /**
   * Get taxByType
   * @return taxByType
  **/
  @ApiModelProperty(example = "null", value = "")
  public LineForGoodsCalculatedTaxTaxByType getTaxByType() {
    return taxByType;
  }

  public void setTaxByType(LineForGoodsCalculatedTaxTaxByType taxByType) {
    this.taxByType = taxByType;
  }

  public LineForGoodsCalculatedTax tax(Double tax) {
    this.tax = tax;
    return this;
  }

   /**
   * Get tax
   * @return tax
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getTax() {
    return tax;
  }

  public void setTax(Double tax) {
    this.tax = tax;
  }

  public LineForGoodsCalculatedTax details(List<DetailsCalculatedTaxItem> details) {
    this.details = details;
    return this;
  }

  public LineForGoodsCalculatedTax addDetailsItem(DetailsCalculatedTaxItem detailsItem) {
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<DetailsCalculatedTaxItem> getDetails() {
    return details;
  }

  public void setDetails(List<DetailsCalculatedTaxItem> details) {
    this.details = details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineForGoodsCalculatedTax lineForGoodsCalculatedTax = (LineForGoodsCalculatedTax) o;
    return Objects.equals(this.taxByType, lineForGoodsCalculatedTax.taxByType) &&
        Objects.equals(this.tax, lineForGoodsCalculatedTax.tax) &&
        Objects.equals(this.details, lineForGoodsCalculatedTax.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxByType, tax, details);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineForGoodsCalculatedTax {\n");
    
    sb.append("    taxByType: ").append(toIndentedString(taxByType)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

