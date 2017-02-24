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

@ApiModel(description = "")
public class LineForGoodsCalculatedTaxTaxByType {
  
  @SerializedName("icms")
  private TaxByTypeTax icms = null;
  @SerializedName("icmsSt")
  private TaxByTypeTax icmsSt = null;
  @SerializedName("icmsStSd")
  private TaxByTypeTax icmsStSd = null;
  @SerializedName("icmsPartOwn")
  private TaxByTypeTax icmsPartOwn = null;
  @SerializedName("icmsPartDest")
  private TaxByTypeTax icmsPartDest = null;
  @SerializedName("icmsDifaFCP")
  private TaxByTypeTax icmsDifaFCP = null;
  @SerializedName("icmsDifaDest")
  private TaxByTypeTax icmsDifaDest = null;
  @SerializedName("icmsDifaRemet")
  private TaxByTypeTax icmsDifaRemet = null;
  @SerializedName("icmsRf")
  private TaxByTypeTax icmsRf = null;
  @SerializedName("icmsDeson")
  private TaxByTypeTax icmsDeson = null;
  @SerializedName("icmsCredsn")
  private TaxByTypeTax icmsCredsn = null;
  @SerializedName("pis")
  private TaxByTypeTax pis = null;
  @SerializedName("pisSt")
  private TaxByTypeTax pisSt = null;
  @SerializedName("cofins")
  private TaxByTypeTax cofins = null;
  @SerializedName("cofinsSt")
  private TaxByTypeTax cofinsSt = null;
  @SerializedName("ipi")
  private TaxByTypeTax ipi = null;
  @SerializedName("ipiReturned")
  private TaxByTypeTax ipiReturned = null;
  @SerializedName("ii")
  private TaxByTypeTax ii = null;
  @SerializedName("iof")
  private TaxByTypeTax iof = null;
  @SerializedName("aproxtribState")
  private TaxByTypeTax aproxtribState = null;
  @SerializedName("aproxtribFed")
  private TaxByTypeTax aproxtribFed = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public TaxByTypeTax getIcms() {
    return icms;
  }
  public void setIcms(TaxByTypeTax icms) {
    this.icms = icms;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TaxByTypeTax getIcmsSt() {
    return icmsSt;
  }
  public void setIcmsSt(TaxByTypeTax icmsSt) {
    this.icmsSt = icmsSt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TaxByTypeTax getIcmsStSd() {
    return icmsStSd;
  }
  public void setIcmsStSd(TaxByTypeTax icmsStSd) {
    this.icmsStSd = icmsStSd;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TaxByTypeTax getIcmsPartOwn() {
    return icmsPartOwn;
  }
  public void setIcmsPartOwn(TaxByTypeTax icmsPartOwn) {
    this.icmsPartOwn = icmsPartOwn;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TaxByTypeTax getIcmsPartDest() {
    return icmsPartDest;
  }
  public void setIcmsPartDest(TaxByTypeTax icmsPartDest) {
    this.icmsPartDest = icmsPartDest;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TaxByTypeTax getIcmsDifaFCP() {
    return icmsDifaFCP;
  }
  public void setIcmsDifaFCP(TaxByTypeTax icmsDifaFCP) {
    this.icmsDifaFCP = icmsDifaFCP;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TaxByTypeTax getIcmsDifaDest() {
    return icmsDifaDest;
  }
  public void setIcmsDifaDest(TaxByTypeTax icmsDifaDest) {
    this.icmsDifaDest = icmsDifaDest;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TaxByTypeTax getIcmsDifaRemet() {
    return icmsDifaRemet;
  }
  public void setIcmsDifaRemet(TaxByTypeTax icmsDifaRemet) {
    this.icmsDifaRemet = icmsDifaRemet;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TaxByTypeTax getIcmsRf() {
    return icmsRf;
  }
  public void setIcmsRf(TaxByTypeTax icmsRf) {
    this.icmsRf = icmsRf;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TaxByTypeTax getIcmsDeson() {
    return icmsDeson;
  }
  public void setIcmsDeson(TaxByTypeTax icmsDeson) {
    this.icmsDeson = icmsDeson;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TaxByTypeTax getIcmsCredsn() {
    return icmsCredsn;
  }
  public void setIcmsCredsn(TaxByTypeTax icmsCredsn) {
    this.icmsCredsn = icmsCredsn;
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
  public TaxByTypeTax getPisSt() {
    return pisSt;
  }
  public void setPisSt(TaxByTypeTax pisSt) {
    this.pisSt = pisSt;
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
  public TaxByTypeTax getCofinsSt() {
    return cofinsSt;
  }
  public void setCofinsSt(TaxByTypeTax cofinsSt) {
    this.cofinsSt = cofinsSt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TaxByTypeTax getIpi() {
    return ipi;
  }
  public void setIpi(TaxByTypeTax ipi) {
    this.ipi = ipi;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TaxByTypeTax getIpiReturned() {
    return ipiReturned;
  }
  public void setIpiReturned(TaxByTypeTax ipiReturned) {
    this.ipiReturned = ipiReturned;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TaxByTypeTax getIi() {
    return ii;
  }
  public void setIi(TaxByTypeTax ii) {
    this.ii = ii;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TaxByTypeTax getIof() {
    return iof;
  }
  public void setIof(TaxByTypeTax iof) {
    this.iof = iof;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TaxByTypeTax getAproxtribState() {
    return aproxtribState;
  }
  public void setAproxtribState(TaxByTypeTax aproxtribState) {
    this.aproxtribState = aproxtribState;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineForGoodsCalculatedTaxTaxByType lineForGoodsCalculatedTaxTaxByType = (LineForGoodsCalculatedTaxTaxByType) o;
    return (this.icms == null ? lineForGoodsCalculatedTaxTaxByType.icms == null : this.icms.equals(lineForGoodsCalculatedTaxTaxByType.icms)) &&
        (this.icmsSt == null ? lineForGoodsCalculatedTaxTaxByType.icmsSt == null : this.icmsSt.equals(lineForGoodsCalculatedTaxTaxByType.icmsSt)) &&
        (this.icmsStSd == null ? lineForGoodsCalculatedTaxTaxByType.icmsStSd == null : this.icmsStSd.equals(lineForGoodsCalculatedTaxTaxByType.icmsStSd)) &&
        (this.icmsPartOwn == null ? lineForGoodsCalculatedTaxTaxByType.icmsPartOwn == null : this.icmsPartOwn.equals(lineForGoodsCalculatedTaxTaxByType.icmsPartOwn)) &&
        (this.icmsPartDest == null ? lineForGoodsCalculatedTaxTaxByType.icmsPartDest == null : this.icmsPartDest.equals(lineForGoodsCalculatedTaxTaxByType.icmsPartDest)) &&
        (this.icmsDifaFCP == null ? lineForGoodsCalculatedTaxTaxByType.icmsDifaFCP == null : this.icmsDifaFCP.equals(lineForGoodsCalculatedTaxTaxByType.icmsDifaFCP)) &&
        (this.icmsDifaDest == null ? lineForGoodsCalculatedTaxTaxByType.icmsDifaDest == null : this.icmsDifaDest.equals(lineForGoodsCalculatedTaxTaxByType.icmsDifaDest)) &&
        (this.icmsDifaRemet == null ? lineForGoodsCalculatedTaxTaxByType.icmsDifaRemet == null : this.icmsDifaRemet.equals(lineForGoodsCalculatedTaxTaxByType.icmsDifaRemet)) &&
        (this.icmsRf == null ? lineForGoodsCalculatedTaxTaxByType.icmsRf == null : this.icmsRf.equals(lineForGoodsCalculatedTaxTaxByType.icmsRf)) &&
        (this.icmsDeson == null ? lineForGoodsCalculatedTaxTaxByType.icmsDeson == null : this.icmsDeson.equals(lineForGoodsCalculatedTaxTaxByType.icmsDeson)) &&
        (this.icmsCredsn == null ? lineForGoodsCalculatedTaxTaxByType.icmsCredsn == null : this.icmsCredsn.equals(lineForGoodsCalculatedTaxTaxByType.icmsCredsn)) &&
        (this.pis == null ? lineForGoodsCalculatedTaxTaxByType.pis == null : this.pis.equals(lineForGoodsCalculatedTaxTaxByType.pis)) &&
        (this.pisSt == null ? lineForGoodsCalculatedTaxTaxByType.pisSt == null : this.pisSt.equals(lineForGoodsCalculatedTaxTaxByType.pisSt)) &&
        (this.cofins == null ? lineForGoodsCalculatedTaxTaxByType.cofins == null : this.cofins.equals(lineForGoodsCalculatedTaxTaxByType.cofins)) &&
        (this.cofinsSt == null ? lineForGoodsCalculatedTaxTaxByType.cofinsSt == null : this.cofinsSt.equals(lineForGoodsCalculatedTaxTaxByType.cofinsSt)) &&
        (this.ipi == null ? lineForGoodsCalculatedTaxTaxByType.ipi == null : this.ipi.equals(lineForGoodsCalculatedTaxTaxByType.ipi)) &&
        (this.ipiReturned == null ? lineForGoodsCalculatedTaxTaxByType.ipiReturned == null : this.ipiReturned.equals(lineForGoodsCalculatedTaxTaxByType.ipiReturned)) &&
        (this.ii == null ? lineForGoodsCalculatedTaxTaxByType.ii == null : this.ii.equals(lineForGoodsCalculatedTaxTaxByType.ii)) &&
        (this.iof == null ? lineForGoodsCalculatedTaxTaxByType.iof == null : this.iof.equals(lineForGoodsCalculatedTaxTaxByType.iof)) &&
        (this.aproxtribState == null ? lineForGoodsCalculatedTaxTaxByType.aproxtribState == null : this.aproxtribState.equals(lineForGoodsCalculatedTaxTaxByType.aproxtribState)) &&
        (this.aproxtribFed == null ? lineForGoodsCalculatedTaxTaxByType.aproxtribFed == null : this.aproxtribFed.equals(lineForGoodsCalculatedTaxTaxByType.aproxtribFed));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.icms == null ? 0: this.icms.hashCode());
    result = 31 * result + (this.icmsSt == null ? 0: this.icmsSt.hashCode());
    result = 31 * result + (this.icmsStSd == null ? 0: this.icmsStSd.hashCode());
    result = 31 * result + (this.icmsPartOwn == null ? 0: this.icmsPartOwn.hashCode());
    result = 31 * result + (this.icmsPartDest == null ? 0: this.icmsPartDest.hashCode());
    result = 31 * result + (this.icmsDifaFCP == null ? 0: this.icmsDifaFCP.hashCode());
    result = 31 * result + (this.icmsDifaDest == null ? 0: this.icmsDifaDest.hashCode());
    result = 31 * result + (this.icmsDifaRemet == null ? 0: this.icmsDifaRemet.hashCode());
    result = 31 * result + (this.icmsRf == null ? 0: this.icmsRf.hashCode());
    result = 31 * result + (this.icmsDeson == null ? 0: this.icmsDeson.hashCode());
    result = 31 * result + (this.icmsCredsn == null ? 0: this.icmsCredsn.hashCode());
    result = 31 * result + (this.pis == null ? 0: this.pis.hashCode());
    result = 31 * result + (this.pisSt == null ? 0: this.pisSt.hashCode());
    result = 31 * result + (this.cofins == null ? 0: this.cofins.hashCode());
    result = 31 * result + (this.cofinsSt == null ? 0: this.cofinsSt.hashCode());
    result = 31 * result + (this.ipi == null ? 0: this.ipi.hashCode());
    result = 31 * result + (this.ipiReturned == null ? 0: this.ipiReturned.hashCode());
    result = 31 * result + (this.ii == null ? 0: this.ii.hashCode());
    result = 31 * result + (this.iof == null ? 0: this.iof.hashCode());
    result = 31 * result + (this.aproxtribState == null ? 0: this.aproxtribState.hashCode());
    result = 31 * result + (this.aproxtribFed == null ? 0: this.aproxtribFed.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineForGoodsCalculatedTaxTaxByType {\n");
    
    sb.append("  icms: ").append(icms).append("\n");
    sb.append("  icmsSt: ").append(icmsSt).append("\n");
    sb.append("  icmsStSd: ").append(icmsStSd).append("\n");
    sb.append("  icmsPartOwn: ").append(icmsPartOwn).append("\n");
    sb.append("  icmsPartDest: ").append(icmsPartDest).append("\n");
    sb.append("  icmsDifaFCP: ").append(icmsDifaFCP).append("\n");
    sb.append("  icmsDifaDest: ").append(icmsDifaDest).append("\n");
    sb.append("  icmsDifaRemet: ").append(icmsDifaRemet).append("\n");
    sb.append("  icmsRf: ").append(icmsRf).append("\n");
    sb.append("  icmsDeson: ").append(icmsDeson).append("\n");
    sb.append("  icmsCredsn: ").append(icmsCredsn).append("\n");
    sb.append("  pis: ").append(pis).append("\n");
    sb.append("  pisSt: ").append(pisSt).append("\n");
    sb.append("  cofins: ").append(cofins).append("\n");
    sb.append("  cofinsSt: ").append(cofinsSt).append("\n");
    sb.append("  ipi: ").append(ipi).append("\n");
    sb.append("  ipiReturned: ").append(ipiReturned).append("\n");
    sb.append("  ii: ").append(ii).append("\n");
    sb.append("  iof: ").append(iof).append("\n");
    sb.append("  aproxtribState: ").append(aproxtribState).append("\n");
    sb.append("  aproxtribFed: ").append(aproxtribFed).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
