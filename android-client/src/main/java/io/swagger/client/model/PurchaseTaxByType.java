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

import io.swagger.client.model.TaxByTypeTax;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Object with summary of all taxes returned by engine
 **/
@ApiModel(description = "Object with summary of all taxes returned by engine")
public class PurchaseTaxByType {
  
  @SerializedName("issRf")
  private TaxByTypeTax issRf = null;
  @SerializedName("pisRf")
  private TaxByTypeTax pisRf = null;
  @SerializedName("cofinsRf")
  private TaxByTypeTax cofinsRf = null;
  @SerializedName("csllRf")
  private TaxByTypeTax csllRf = null;
  @SerializedName("irrf")
  private TaxByTypeTax irrf = null;
  @SerializedName("inssRf")
  private TaxByTypeTax inssRf = null;
  @SerializedName("inssAr")
  private TaxByTypeTax inssAr = null;
  @SerializedName("pis")
  private TaxByTypeTax pis = null;
  @SerializedName("cofins")
  private TaxByTypeTax cofins = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public TaxByTypeTax getIssRf() {
    return issRf;
  }
  public void setIssRf(TaxByTypeTax issRf) {
    this.issRf = issRf;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TaxByTypeTax getPisRf() {
    return pisRf;
  }
  public void setPisRf(TaxByTypeTax pisRf) {
    this.pisRf = pisRf;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TaxByTypeTax getCofinsRf() {
    return cofinsRf;
  }
  public void setCofinsRf(TaxByTypeTax cofinsRf) {
    this.cofinsRf = cofinsRf;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TaxByTypeTax getCsllRf() {
    return csllRf;
  }
  public void setCsllRf(TaxByTypeTax csllRf) {
    this.csllRf = csllRf;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TaxByTypeTax getIrrf() {
    return irrf;
  }
  public void setIrrf(TaxByTypeTax irrf) {
    this.irrf = irrf;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TaxByTypeTax getInssRf() {
    return inssRf;
  }
  public void setInssRf(TaxByTypeTax inssRf) {
    this.inssRf = inssRf;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TaxByTypeTax getInssAr() {
    return inssAr;
  }
  public void setInssAr(TaxByTypeTax inssAr) {
    this.inssAr = inssAr;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TaxByTypeTax getPis() {
    return pis;
  }
  public void setPis(TaxByTypeTax pis) {
    this.pis = pis;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TaxByTypeTax getCofins() {
    return cofins;
  }
  public void setCofins(TaxByTypeTax cofins) {
    this.cofins = cofins;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PurchaseTaxByType purchaseTaxByType = (PurchaseTaxByType) o;
    return (this.issRf == null ? purchaseTaxByType.issRf == null : this.issRf.equals(purchaseTaxByType.issRf)) &&
        (this.pisRf == null ? purchaseTaxByType.pisRf == null : this.pisRf.equals(purchaseTaxByType.pisRf)) &&
        (this.cofinsRf == null ? purchaseTaxByType.cofinsRf == null : this.cofinsRf.equals(purchaseTaxByType.cofinsRf)) &&
        (this.csllRf == null ? purchaseTaxByType.csllRf == null : this.csllRf.equals(purchaseTaxByType.csllRf)) &&
        (this.irrf == null ? purchaseTaxByType.irrf == null : this.irrf.equals(purchaseTaxByType.irrf)) &&
        (this.inssRf == null ? purchaseTaxByType.inssRf == null : this.inssRf.equals(purchaseTaxByType.inssRf)) &&
        (this.inssAr == null ? purchaseTaxByType.inssAr == null : this.inssAr.equals(purchaseTaxByType.inssAr)) &&
        (this.pis == null ? purchaseTaxByType.pis == null : this.pis.equals(purchaseTaxByType.pis)) &&
        (this.cofins == null ? purchaseTaxByType.cofins == null : this.cofins.equals(purchaseTaxByType.cofins));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.issRf == null ? 0: this.issRf.hashCode());
    result = 31 * result + (this.pisRf == null ? 0: this.pisRf.hashCode());
    result = 31 * result + (this.cofinsRf == null ? 0: this.cofinsRf.hashCode());
    result = 31 * result + (this.csllRf == null ? 0: this.csllRf.hashCode());
    result = 31 * result + (this.irrf == null ? 0: this.irrf.hashCode());
    result = 31 * result + (this.inssRf == null ? 0: this.inssRf.hashCode());
    result = 31 * result + (this.inssAr == null ? 0: this.inssAr.hashCode());
    result = 31 * result + (this.pis == null ? 0: this.pis.hashCode());
    result = 31 * result + (this.cofins == null ? 0: this.cofins.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseTaxByType {\n");
    
    sb.append("  issRf: ").append(issRf).append("\n");
    sb.append("  pisRf: ").append(pisRf).append("\n");
    sb.append("  cofinsRf: ").append(cofinsRf).append("\n");
    sb.append("  csllRf: ").append(csllRf).append("\n");
    sb.append("  irrf: ").append(irrf).append("\n");
    sb.append("  inssRf: ").append(inssRf).append("\n");
    sb.append("  inssAr: ").append(inssAr).append("\n");
    sb.append("  pis: ").append(pis).append("\n");
    sb.append("  cofins: ").append(cofins).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
