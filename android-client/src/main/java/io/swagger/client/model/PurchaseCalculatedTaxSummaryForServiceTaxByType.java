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

import io.swagger.client.model.TaxByTypeSummaryForService;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Object with summary of all taxes returned by engine
 **/
@ApiModel(description = "Object with summary of all taxes returned by engine")
public class PurchaseCalculatedTaxSummaryForServiceTaxByType {
  
  @SerializedName("issRf")
  private TaxByTypeSummaryForService issRf = null;
  @SerializedName("pisRf")
  private TaxByTypeSummaryForService pisRf = null;
  @SerializedName("cofinsRf")
  private TaxByTypeSummaryForService cofinsRf = null;
  @SerializedName("csllRf")
  private TaxByTypeSummaryForService csllRf = null;
  @SerializedName("irrf")
  private TaxByTypeSummaryForService irrf = null;
  @SerializedName("inssRf")
  private TaxByTypeSummaryForService inssRf = null;
  @SerializedName("inssAr")
  private TaxByTypeSummaryForService inssAr = null;
  @SerializedName("pis")
  private TaxByTypeSummaryForService pis = null;
  @SerializedName("cofins")
  private TaxByTypeSummaryForService cofins = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public TaxByTypeSummaryForService getIssRf() {
    return issRf;
  }
  public void setIssRf(TaxByTypeSummaryForService issRf) {
    this.issRf = issRf;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TaxByTypeSummaryForService getPisRf() {
    return pisRf;
  }
  public void setPisRf(TaxByTypeSummaryForService pisRf) {
    this.pisRf = pisRf;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TaxByTypeSummaryForService getCofinsRf() {
    return cofinsRf;
  }
  public void setCofinsRf(TaxByTypeSummaryForService cofinsRf) {
    this.cofinsRf = cofinsRf;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TaxByTypeSummaryForService getCsllRf() {
    return csllRf;
  }
  public void setCsllRf(TaxByTypeSummaryForService csllRf) {
    this.csllRf = csllRf;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TaxByTypeSummaryForService getIrrf() {
    return irrf;
  }
  public void setIrrf(TaxByTypeSummaryForService irrf) {
    this.irrf = irrf;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TaxByTypeSummaryForService getInssRf() {
    return inssRf;
  }
  public void setInssRf(TaxByTypeSummaryForService inssRf) {
    this.inssRf = inssRf;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TaxByTypeSummaryForService getInssAr() {
    return inssAr;
  }
  public void setInssAr(TaxByTypeSummaryForService inssAr) {
    this.inssAr = inssAr;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TaxByTypeSummaryForService getPis() {
    return pis;
  }
  public void setPis(TaxByTypeSummaryForService pis) {
    this.pis = pis;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TaxByTypeSummaryForService getCofins() {
    return cofins;
  }
  public void setCofins(TaxByTypeSummaryForService cofins) {
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
    PurchaseCalculatedTaxSummaryForServiceTaxByType purchaseCalculatedTaxSummaryForServiceTaxByType = (PurchaseCalculatedTaxSummaryForServiceTaxByType) o;
    return (this.issRf == null ? purchaseCalculatedTaxSummaryForServiceTaxByType.issRf == null : this.issRf.equals(purchaseCalculatedTaxSummaryForServiceTaxByType.issRf)) &&
        (this.pisRf == null ? purchaseCalculatedTaxSummaryForServiceTaxByType.pisRf == null : this.pisRf.equals(purchaseCalculatedTaxSummaryForServiceTaxByType.pisRf)) &&
        (this.cofinsRf == null ? purchaseCalculatedTaxSummaryForServiceTaxByType.cofinsRf == null : this.cofinsRf.equals(purchaseCalculatedTaxSummaryForServiceTaxByType.cofinsRf)) &&
        (this.csllRf == null ? purchaseCalculatedTaxSummaryForServiceTaxByType.csllRf == null : this.csllRf.equals(purchaseCalculatedTaxSummaryForServiceTaxByType.csllRf)) &&
        (this.irrf == null ? purchaseCalculatedTaxSummaryForServiceTaxByType.irrf == null : this.irrf.equals(purchaseCalculatedTaxSummaryForServiceTaxByType.irrf)) &&
        (this.inssRf == null ? purchaseCalculatedTaxSummaryForServiceTaxByType.inssRf == null : this.inssRf.equals(purchaseCalculatedTaxSummaryForServiceTaxByType.inssRf)) &&
        (this.inssAr == null ? purchaseCalculatedTaxSummaryForServiceTaxByType.inssAr == null : this.inssAr.equals(purchaseCalculatedTaxSummaryForServiceTaxByType.inssAr)) &&
        (this.pis == null ? purchaseCalculatedTaxSummaryForServiceTaxByType.pis == null : this.pis.equals(purchaseCalculatedTaxSummaryForServiceTaxByType.pis)) &&
        (this.cofins == null ? purchaseCalculatedTaxSummaryForServiceTaxByType.cofins == null : this.cofins.equals(purchaseCalculatedTaxSummaryForServiceTaxByType.cofins));
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
    sb.append("class PurchaseCalculatedTaxSummaryForServiceTaxByType {\n");
    
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
