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

import io.swagger.annotations.ApiModelProperty;

/**
 * LineForGoodsCalculatedTaxTaxByType
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-06T17:54:07.550Z")
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

  @SerializedName("ii")
  private TaxByTypeTax ii = null;

  @SerializedName("iof")
  private TaxByTypeTax iof = null;

  @SerializedName("aproxtribState")
  private TaxByTypeTax aproxtribState = null;

  @SerializedName("aproxtribFed")
  private TaxByTypeTax aproxtribFed = null;

  public LineForGoodsCalculatedTaxTaxByType icms(TaxByTypeTax icms) {
    this.icms = icms;
    return this;
  }

   /**
   * Get icms
   * @return icms
  **/
  @ApiModelProperty(example = "null", value = "")
  public TaxByTypeTax getIcms() {
    return icms;
  }

  public void setIcms(TaxByTypeTax icms) {
    this.icms = icms;
  }

  public LineForGoodsCalculatedTaxTaxByType icmsSt(TaxByTypeTax icmsSt) {
    this.icmsSt = icmsSt;
    return this;
  }

   /**
   * Get icmsSt
   * @return icmsSt
  **/
  @ApiModelProperty(example = "null", value = "")
  public TaxByTypeTax getIcmsSt() {
    return icmsSt;
  }

  public void setIcmsSt(TaxByTypeTax icmsSt) {
    this.icmsSt = icmsSt;
  }

  public LineForGoodsCalculatedTaxTaxByType icmsStSd(TaxByTypeTax icmsStSd) {
    this.icmsStSd = icmsStSd;
    return this;
  }

   /**
   * Get icmsStSd
   * @return icmsStSd
  **/
  @ApiModelProperty(example = "null", value = "")
  public TaxByTypeTax getIcmsStSd() {
    return icmsStSd;
  }

  public void setIcmsStSd(TaxByTypeTax icmsStSd) {
    this.icmsStSd = icmsStSd;
  }

  public LineForGoodsCalculatedTaxTaxByType icmsPartOwn(TaxByTypeTax icmsPartOwn) {
    this.icmsPartOwn = icmsPartOwn;
    return this;
  }

   /**
   * Get icmsPartOwn
   * @return icmsPartOwn
  **/
  @ApiModelProperty(example = "null", value = "")
  public TaxByTypeTax getIcmsPartOwn() {
    return icmsPartOwn;
  }

  public void setIcmsPartOwn(TaxByTypeTax icmsPartOwn) {
    this.icmsPartOwn = icmsPartOwn;
  }

  public LineForGoodsCalculatedTaxTaxByType icmsPartDest(TaxByTypeTax icmsPartDest) {
    this.icmsPartDest = icmsPartDest;
    return this;
  }

   /**
   * Get icmsPartDest
   * @return icmsPartDest
  **/
  @ApiModelProperty(example = "null", value = "")
  public TaxByTypeTax getIcmsPartDest() {
    return icmsPartDest;
  }

  public void setIcmsPartDest(TaxByTypeTax icmsPartDest) {
    this.icmsPartDest = icmsPartDest;
  }

  public LineForGoodsCalculatedTaxTaxByType icmsDifaFCP(TaxByTypeTax icmsDifaFCP) {
    this.icmsDifaFCP = icmsDifaFCP;
    return this;
  }

   /**
   * Get icmsDifaFCP
   * @return icmsDifaFCP
  **/
  @ApiModelProperty(example = "null", value = "")
  public TaxByTypeTax getIcmsDifaFCP() {
    return icmsDifaFCP;
  }

  public void setIcmsDifaFCP(TaxByTypeTax icmsDifaFCP) {
    this.icmsDifaFCP = icmsDifaFCP;
  }

  public LineForGoodsCalculatedTaxTaxByType icmsDifaDest(TaxByTypeTax icmsDifaDest) {
    this.icmsDifaDest = icmsDifaDest;
    return this;
  }

   /**
   * Get icmsDifaDest
   * @return icmsDifaDest
  **/
  @ApiModelProperty(example = "null", value = "")
  public TaxByTypeTax getIcmsDifaDest() {
    return icmsDifaDest;
  }

  public void setIcmsDifaDest(TaxByTypeTax icmsDifaDest) {
    this.icmsDifaDest = icmsDifaDest;
  }

  public LineForGoodsCalculatedTaxTaxByType icmsDifaRemet(TaxByTypeTax icmsDifaRemet) {
    this.icmsDifaRemet = icmsDifaRemet;
    return this;
  }

   /**
   * Get icmsDifaRemet
   * @return icmsDifaRemet
  **/
  @ApiModelProperty(example = "null", value = "")
  public TaxByTypeTax getIcmsDifaRemet() {
    return icmsDifaRemet;
  }

  public void setIcmsDifaRemet(TaxByTypeTax icmsDifaRemet) {
    this.icmsDifaRemet = icmsDifaRemet;
  }

  public LineForGoodsCalculatedTaxTaxByType icmsRf(TaxByTypeTax icmsRf) {
    this.icmsRf = icmsRf;
    return this;
  }

   /**
   * Get icmsRf
   * @return icmsRf
  **/
  @ApiModelProperty(example = "null", value = "")
  public TaxByTypeTax getIcmsRf() {
    return icmsRf;
  }

  public void setIcmsRf(TaxByTypeTax icmsRf) {
    this.icmsRf = icmsRf;
  }

  public LineForGoodsCalculatedTaxTaxByType icmsDeson(TaxByTypeTax icmsDeson) {
    this.icmsDeson = icmsDeson;
    return this;
  }

   /**
   * Get icmsDeson
   * @return icmsDeson
  **/
  @ApiModelProperty(example = "null", value = "")
  public TaxByTypeTax getIcmsDeson() {
    return icmsDeson;
  }

  public void setIcmsDeson(TaxByTypeTax icmsDeson) {
    this.icmsDeson = icmsDeson;
  }

  public LineForGoodsCalculatedTaxTaxByType icmsCredsn(TaxByTypeTax icmsCredsn) {
    this.icmsCredsn = icmsCredsn;
    return this;
  }

   /**
   * Get icmsCredsn
   * @return icmsCredsn
  **/
  @ApiModelProperty(example = "null", value = "")
  public TaxByTypeTax getIcmsCredsn() {
    return icmsCredsn;
  }

  public void setIcmsCredsn(TaxByTypeTax icmsCredsn) {
    this.icmsCredsn = icmsCredsn;
  }

  public LineForGoodsCalculatedTaxTaxByType pis(TaxByTypeTax pis) {
    this.pis = pis;
    return this;
  }

   /**
   * Get pis
   * @return pis
  **/
  @ApiModelProperty(example = "null", value = "")
  public TaxByTypeTax getPis() {
    return pis;
  }

  public void setPis(TaxByTypeTax pis) {
    this.pis = pis;
  }

  public LineForGoodsCalculatedTaxTaxByType pisSt(TaxByTypeTax pisSt) {
    this.pisSt = pisSt;
    return this;
  }

   /**
   * Get pisSt
   * @return pisSt
  **/
  @ApiModelProperty(example = "null", value = "")
  public TaxByTypeTax getPisSt() {
    return pisSt;
  }

  public void setPisSt(TaxByTypeTax pisSt) {
    this.pisSt = pisSt;
  }

  public LineForGoodsCalculatedTaxTaxByType cofins(TaxByTypeTax cofins) {
    this.cofins = cofins;
    return this;
  }

   /**
   * Get cofins
   * @return cofins
  **/
  @ApiModelProperty(example = "null", value = "")
  public TaxByTypeTax getCofins() {
    return cofins;
  }

  public void setCofins(TaxByTypeTax cofins) {
    this.cofins = cofins;
  }

  public LineForGoodsCalculatedTaxTaxByType cofinsSt(TaxByTypeTax cofinsSt) {
    this.cofinsSt = cofinsSt;
    return this;
  }

   /**
   * Get cofinsSt
   * @return cofinsSt
  **/
  @ApiModelProperty(example = "null", value = "")
  public TaxByTypeTax getCofinsSt() {
    return cofinsSt;
  }

  public void setCofinsSt(TaxByTypeTax cofinsSt) {
    this.cofinsSt = cofinsSt;
  }

  public LineForGoodsCalculatedTaxTaxByType ipi(TaxByTypeTax ipi) {
    this.ipi = ipi;
    return this;
  }

   /**
   * Get ipi
   * @return ipi
  **/
  @ApiModelProperty(example = "null", value = "")
  public TaxByTypeTax getIpi() {
    return ipi;
  }

  public void setIpi(TaxByTypeTax ipi) {
    this.ipi = ipi;
  }

  public LineForGoodsCalculatedTaxTaxByType ii(TaxByTypeTax ii) {
    this.ii = ii;
    return this;
  }

   /**
   * Get ii
   * @return ii
  **/
  @ApiModelProperty(example = "null", value = "")
  public TaxByTypeTax getIi() {
    return ii;
  }

  public void setIi(TaxByTypeTax ii) {
    this.ii = ii;
  }

  public LineForGoodsCalculatedTaxTaxByType iof(TaxByTypeTax iof) {
    this.iof = iof;
    return this;
  }

   /**
   * Get iof
   * @return iof
  **/
  @ApiModelProperty(example = "null", value = "")
  public TaxByTypeTax getIof() {
    return iof;
  }

  public void setIof(TaxByTypeTax iof) {
    this.iof = iof;
  }

  public LineForGoodsCalculatedTaxTaxByType aproxtribState(TaxByTypeTax aproxtribState) {
    this.aproxtribState = aproxtribState;
    return this;
  }

   /**
   * Get aproxtribState
   * @return aproxtribState
  **/
  @ApiModelProperty(example = "null", value = "")
  public TaxByTypeTax getAproxtribState() {
    return aproxtribState;
  }

  public void setAproxtribState(TaxByTypeTax aproxtribState) {
    this.aproxtribState = aproxtribState;
  }

  public LineForGoodsCalculatedTaxTaxByType aproxtribFed(TaxByTypeTax aproxtribFed) {
    this.aproxtribFed = aproxtribFed;
    return this;
  }

   /**
   * Get aproxtribFed
   * @return aproxtribFed
  **/
  @ApiModelProperty(example = "null", value = "")
  public TaxByTypeTax getAproxtribFed() {
    return aproxtribFed;
  }

  public void setAproxtribFed(TaxByTypeTax aproxtribFed) {
    this.aproxtribFed = aproxtribFed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineForGoodsCalculatedTaxTaxByType lineForGoodsCalculatedTaxTaxByType = (LineForGoodsCalculatedTaxTaxByType) o;
    return Objects.equals(this.icms, lineForGoodsCalculatedTaxTaxByType.icms) &&
        Objects.equals(this.icmsSt, lineForGoodsCalculatedTaxTaxByType.icmsSt) &&
        Objects.equals(this.icmsStSd, lineForGoodsCalculatedTaxTaxByType.icmsStSd) &&
        Objects.equals(this.icmsPartOwn, lineForGoodsCalculatedTaxTaxByType.icmsPartOwn) &&
        Objects.equals(this.icmsPartDest, lineForGoodsCalculatedTaxTaxByType.icmsPartDest) &&
        Objects.equals(this.icmsDifaFCP, lineForGoodsCalculatedTaxTaxByType.icmsDifaFCP) &&
        Objects.equals(this.icmsDifaDest, lineForGoodsCalculatedTaxTaxByType.icmsDifaDest) &&
        Objects.equals(this.icmsDifaRemet, lineForGoodsCalculatedTaxTaxByType.icmsDifaRemet) &&
        Objects.equals(this.icmsRf, lineForGoodsCalculatedTaxTaxByType.icmsRf) &&
        Objects.equals(this.icmsDeson, lineForGoodsCalculatedTaxTaxByType.icmsDeson) &&
        Objects.equals(this.icmsCredsn, lineForGoodsCalculatedTaxTaxByType.icmsCredsn) &&
        Objects.equals(this.pis, lineForGoodsCalculatedTaxTaxByType.pis) &&
        Objects.equals(this.pisSt, lineForGoodsCalculatedTaxTaxByType.pisSt) &&
        Objects.equals(this.cofins, lineForGoodsCalculatedTaxTaxByType.cofins) &&
        Objects.equals(this.cofinsSt, lineForGoodsCalculatedTaxTaxByType.cofinsSt) &&
        Objects.equals(this.ipi, lineForGoodsCalculatedTaxTaxByType.ipi) &&
        Objects.equals(this.ii, lineForGoodsCalculatedTaxTaxByType.ii) &&
        Objects.equals(this.iof, lineForGoodsCalculatedTaxTaxByType.iof) &&
        Objects.equals(this.aproxtribState, lineForGoodsCalculatedTaxTaxByType.aproxtribState) &&
        Objects.equals(this.aproxtribFed, lineForGoodsCalculatedTaxTaxByType.aproxtribFed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(icms, icmsSt, icmsStSd, icmsPartOwn, icmsPartDest, icmsDifaFCP, icmsDifaDest, icmsDifaRemet, icmsRf, icmsDeson, icmsCredsn, pis, pisSt, cofins, cofinsSt, ipi, ii, iof, aproxtribState, aproxtribFed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineForGoodsCalculatedTaxTaxByType {\n");
    
    sb.append("    icms: ").append(toIndentedString(icms)).append("\n");
    sb.append("    icmsSt: ").append(toIndentedString(icmsSt)).append("\n");
    sb.append("    icmsStSd: ").append(toIndentedString(icmsStSd)).append("\n");
    sb.append("    icmsPartOwn: ").append(toIndentedString(icmsPartOwn)).append("\n");
    sb.append("    icmsPartDest: ").append(toIndentedString(icmsPartDest)).append("\n");
    sb.append("    icmsDifaFCP: ").append(toIndentedString(icmsDifaFCP)).append("\n");
    sb.append("    icmsDifaDest: ").append(toIndentedString(icmsDifaDest)).append("\n");
    sb.append("    icmsDifaRemet: ").append(toIndentedString(icmsDifaRemet)).append("\n");
    sb.append("    icmsRf: ").append(toIndentedString(icmsRf)).append("\n");
    sb.append("    icmsDeson: ").append(toIndentedString(icmsDeson)).append("\n");
    sb.append("    icmsCredsn: ").append(toIndentedString(icmsCredsn)).append("\n");
    sb.append("    pis: ").append(toIndentedString(pis)).append("\n");
    sb.append("    pisSt: ").append(toIndentedString(pisSt)).append("\n");
    sb.append("    cofins: ").append(toIndentedString(cofins)).append("\n");
    sb.append("    cofinsSt: ").append(toIndentedString(cofinsSt)).append("\n");
    sb.append("    ipi: ").append(toIndentedString(ipi)).append("\n");
    sb.append("    ii: ").append(toIndentedString(ii)).append("\n");
    sb.append("    iof: ").append(toIndentedString(iof)).append("\n");
    sb.append("    aproxtribState: ").append(toIndentedString(aproxtribState)).append("\n");
    sb.append("    aproxtribFed: ").append(toIndentedString(aproxtribFed)).append("\n");
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

