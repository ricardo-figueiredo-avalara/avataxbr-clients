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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * summary of all taxes
 */
@ApiModel(description = "summary of all taxes")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-06T17:54:07.550Z")
public class TaxByTypeSummaryForGoods {
  @SerializedName("calcbase")
  private Double calcbase = null;

  @SerializedName("tax")
  private Double tax = null;

  @SerializedName("jurisdictions")
  private List<TaxByTypeSummaryJurisdictionForGoods> jurisdictions = new ArrayList<TaxByTypeSummaryJurisdictionForGoods>();

  public TaxByTypeSummaryForGoods calcbase(Double calcbase) {
    this.calcbase = calcbase;
    return this;
  }

   /**
   * sum of all lines calcbase
   * @return calcbase
  **/
  @ApiModelProperty(example = "null", value = "sum of all lines calcbase")
  public Double getCalcbase() {
    return calcbase;
  }

  public void setCalcbase(Double calcbase) {
    this.calcbase = calcbase;
  }

  public TaxByTypeSummaryForGoods tax(Double tax) {
    this.tax = tax;
    return this;
  }

   /**
   * sum of referenced tax value
   * @return tax
  **/
  @ApiModelProperty(example = "null", value = "sum of referenced tax value")
  public Double getTax() {
    return tax;
  }

  public void setTax(Double tax) {
    this.tax = tax;
  }

  public TaxByTypeSummaryForGoods jurisdictions(List<TaxByTypeSummaryJurisdictionForGoods> jurisdictions) {
    this.jurisdictions = jurisdictions;
    return this;
  }

  public TaxByTypeSummaryForGoods addJurisdictionsItem(TaxByTypeSummaryJurisdictionForGoods jurisdictionsItem) {
    this.jurisdictions.add(jurisdictionsItem);
    return this;
  }

   /**
   * Get jurisdictions
   * @return jurisdictions
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<TaxByTypeSummaryJurisdictionForGoods> getJurisdictions() {
    return jurisdictions;
  }

  public void setJurisdictions(List<TaxByTypeSummaryJurisdictionForGoods> jurisdictions) {
    this.jurisdictions = jurisdictions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxByTypeSummaryForGoods taxByTypeSummaryForGoods = (TaxByTypeSummaryForGoods) o;
    return Objects.equals(this.calcbase, taxByTypeSummaryForGoods.calcbase) &&
        Objects.equals(this.tax, taxByTypeSummaryForGoods.tax) &&
        Objects.equals(this.jurisdictions, taxByTypeSummaryForGoods.jurisdictions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calcbase, tax, jurisdictions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxByTypeSummaryForGoods {\n");
    
    sb.append("    calcbase: ").append(toIndentedString(calcbase)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    jurisdictions: ").append(toIndentedString(jurisdictions)).append("\n");
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

