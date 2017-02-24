/**
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

import io.swagger.client.model.TaxByTypeTax;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Object with summary of all taxes returned by engine
 **/
@ApiModel(description = "Object with summary of all taxes returned by engine")
public class SalesTaxByType {
  
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
  @SerializedName("pis")
  private TaxByTypeTax pis = null;
  @SerializedName("cofins")
  private TaxByTypeTax cofins = null;
  @SerializedName("csll")
  private TaxByTypeTax csll = null;
  @SerializedName("issRf")
  private TaxByTypeTax issRf = null;
  @SerializedName("iss")
  private TaxByTypeTax iss = null;
  @SerializedName("aproxtribCity")
  private TaxByTypeTax aproxtribCity = null;
  @SerializedName("aproxtribFed")
  private TaxByTypeTax aproxtribFed = null;
  @SerializedName("irpj")
  private TaxByTypeTax irpj = null;
  @SerializedName("inss")
  private TaxByTypeTax inss = null;

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

  /**
   **/
  @ApiModelProperty(value = "")
  public TaxByTypeTax getCsll() {
    return csll;
  }
  public void setCsll(TaxByTypeTax csll) {
    this.csll = csll;
  }

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
  public TaxByTypeTax getIss() {
    return iss;
  }
  public void setIss(TaxByTypeTax iss) {
    this.iss = iss;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TaxByTypeTax getAproxtribCity() {
    return aproxtribCity;
  }
  public void setAproxtribCity(TaxByTypeTax aproxtribCity) {
    this.aproxtribCity = aproxtribCity;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TaxByTypeTax getAproxtribFed() {
    return aproxtribFed;
  }
  public void setAproxtribFed(TaxByTypeTax aproxtribFed) {
    this.aproxtribFed = aproxtribFed;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TaxByTypeTax getIrpj() {
    return irpj;
  }
  public void setIrpj(TaxByTypeTax irpj) {
    this.irpj = irpj;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TaxByTypeTax getInss() {
    return inss;
  }
  public void setInss(TaxByTypeTax inss) {
    this.inss = inss;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SalesTaxByType salesTaxByType = (SalesTaxByType) o;
    return (this.pisRf == null ? salesTaxByType.pisRf == null : this.pisRf.equals(salesTaxByType.pisRf)) &&
        (this.cofinsRf == null ? salesTaxByType.cofinsRf == null : this.cofinsRf.equals(salesTaxByType.cofinsRf)) &&
        (this.csllRf == null ? salesTaxByType.csllRf == null : this.csllRf.equals(salesTaxByType.csllRf)) &&
        (this.irrf == null ? salesTaxByType.irrf == null : this.irrf.equals(salesTaxByType.irrf)) &&
        (this.inssRf == null ? salesTaxByType.inssRf == null : this.inssRf.equals(salesTaxByType.inssRf)) &&
        (this.pis == null ? salesTaxByType.pis == null : this.pis.equals(salesTaxByType.pis)) &&
        (this.cofins == null ? salesTaxByType.cofins == null : this.cofins.equals(salesTaxByType.cofins)) &&
        (this.csll == null ? salesTaxByType.csll == null : this.csll.equals(salesTaxByType.csll)) &&
        (this.issRf == null ? salesTaxByType.issRf == null : this.issRf.equals(salesTaxByType.issRf)) &&
        (this.iss == null ? salesTaxByType.iss == null : this.iss.equals(salesTaxByType.iss)) &&
        (this.aproxtribCity == null ? salesTaxByType.aproxtribCity == null : this.aproxtribCity.equals(salesTaxByType.aproxtribCity)) &&
        (this.aproxtribFed == null ? salesTaxByType.aproxtribFed == null : this.aproxtribFed.equals(salesTaxByType.aproxtribFed)) &&
        (this.irpj == null ? salesTaxByType.irpj == null : this.irpj.equals(salesTaxByType.irpj)) &&
        (this.inss == null ? salesTaxByType.inss == null : this.inss.equals(salesTaxByType.inss));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pisRf == null ? 0: this.pisRf.hashCode());
    result = 31 * result + (this.cofinsRf == null ? 0: this.cofinsRf.hashCode());
    result = 31 * result + (this.csllRf == null ? 0: this.csllRf.hashCode());
    result = 31 * result + (this.irrf == null ? 0: this.irrf.hashCode());
    result = 31 * result + (this.inssRf == null ? 0: this.inssRf.hashCode());
    result = 31 * result + (this.pis == null ? 0: this.pis.hashCode());
    result = 31 * result + (this.cofins == null ? 0: this.cofins.hashCode());
    result = 31 * result + (this.csll == null ? 0: this.csll.hashCode());
    result = 31 * result + (this.issRf == null ? 0: this.issRf.hashCode());
    result = 31 * result + (this.iss == null ? 0: this.iss.hashCode());
    result = 31 * result + (this.aproxtribCity == null ? 0: this.aproxtribCity.hashCode());
    result = 31 * result + (this.aproxtribFed == null ? 0: this.aproxtribFed.hashCode());
    result = 31 * result + (this.irpj == null ? 0: this.irpj.hashCode());
    result = 31 * result + (this.inss == null ? 0: this.inss.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesTaxByType {\n");
    
    sb.append("  pisRf: ").append(pisRf).append("\n");
    sb.append("  cofinsRf: ").append(cofinsRf).append("\n");
    sb.append("  csllRf: ").append(csllRf).append("\n");
    sb.append("  irrf: ").append(irrf).append("\n");
    sb.append("  inssRf: ").append(inssRf).append("\n");
    sb.append("  pis: ").append(pis).append("\n");
    sb.append("  cofins: ").append(cofins).append("\n");
    sb.append("  csll: ").append(csll).append("\n");
    sb.append("  issRf: ").append(issRf).append("\n");
    sb.append("  iss: ").append(iss).append("\n");
    sb.append("  aproxtribCity: ").append(aproxtribCity).append("\n");
    sb.append("  aproxtribFed: ").append(aproxtribFed).append("\n");
    sb.append("  irpj: ").append(irpj).append("\n");
    sb.append("  inss: ").append(inss).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
