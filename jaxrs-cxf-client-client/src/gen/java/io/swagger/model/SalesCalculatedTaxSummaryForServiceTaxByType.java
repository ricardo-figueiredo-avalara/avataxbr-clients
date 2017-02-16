package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.TaxByTypeSummaryForService;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@ApiModel(description="Object with summary of all taxes returned by engine")
public class SalesCalculatedTaxSummaryForServiceTaxByType  {
  
  @ApiModelProperty(example = "null", value = "")
  private TaxByTypeSummaryForService pisRf = null;
  @ApiModelProperty(example = "null", value = "")
  private TaxByTypeSummaryForService cofinsRf = null;
  @ApiModelProperty(example = "null", value = "")
  private TaxByTypeSummaryForService csllRf = null;
  @ApiModelProperty(example = "null", value = "")
  private TaxByTypeSummaryForService irrf = null;
  @ApiModelProperty(example = "null", value = "")
  private TaxByTypeSummaryForService inssRf = null;
  @ApiModelProperty(example = "null", value = "")
  private TaxByTypeSummaryForService pis = null;
  @ApiModelProperty(example = "null", value = "")
  private TaxByTypeSummaryForService cofins = null;
  @ApiModelProperty(example = "null", value = "")
  private TaxByTypeSummaryForService csll = null;
  @ApiModelProperty(example = "null", value = "")
  private TaxByTypeSummaryForService issRf = null;
  @ApiModelProperty(example = "null", value = "")
  private TaxByTypeSummaryForService iss = null;
  @ApiModelProperty(example = "null", value = "")
  private TaxByTypeSummaryForService aproxtribCity = null;
  @ApiModelProperty(example = "null", value = "")
  private TaxByTypeSummaryForService aproxtribFed = null;
  @ApiModelProperty(example = "null", value = "")
  private TaxByTypeSummaryForService irpj = null;
  @ApiModelProperty(example = "null", value = "")
  private TaxByTypeSummaryForService inss = null;

 /**
   * Get pisRf
   * @return pisRf
  **/
  public TaxByTypeSummaryForService getPisRf() {
    return pisRf;
  }
  public void setPisRf(TaxByTypeSummaryForService pisRf) {
    this.pisRf = pisRf;
  }
 /**
   * Get cofinsRf
   * @return cofinsRf
  **/
  public TaxByTypeSummaryForService getCofinsRf() {
    return cofinsRf;
  }
  public void setCofinsRf(TaxByTypeSummaryForService cofinsRf) {
    this.cofinsRf = cofinsRf;
  }
 /**
   * Get csllRf
   * @return csllRf
  **/
  public TaxByTypeSummaryForService getCsllRf() {
    return csllRf;
  }
  public void setCsllRf(TaxByTypeSummaryForService csllRf) {
    this.csllRf = csllRf;
  }
 /**
   * Get irrf
   * @return irrf
  **/
  public TaxByTypeSummaryForService getIrrf() {
    return irrf;
  }
  public void setIrrf(TaxByTypeSummaryForService irrf) {
    this.irrf = irrf;
  }
 /**
   * Get inssRf
   * @return inssRf
  **/
  public TaxByTypeSummaryForService getInssRf() {
    return inssRf;
  }
  public void setInssRf(TaxByTypeSummaryForService inssRf) {
    this.inssRf = inssRf;
  }
 /**
   * Get pis
   * @return pis
  **/
  public TaxByTypeSummaryForService getPis() {
    return pis;
  }
  public void setPis(TaxByTypeSummaryForService pis) {
    this.pis = pis;
  }
 /**
   * Get cofins
   * @return cofins
  **/
  public TaxByTypeSummaryForService getCofins() {
    return cofins;
  }
  public void setCofins(TaxByTypeSummaryForService cofins) {
    this.cofins = cofins;
  }
 /**
   * Get csll
   * @return csll
  **/
  public TaxByTypeSummaryForService getCsll() {
    return csll;
  }
  public void setCsll(TaxByTypeSummaryForService csll) {
    this.csll = csll;
  }
 /**
   * Get issRf
   * @return issRf
  **/
  public TaxByTypeSummaryForService getIssRf() {
    return issRf;
  }
  public void setIssRf(TaxByTypeSummaryForService issRf) {
    this.issRf = issRf;
  }
 /**
   * Get iss
   * @return iss
  **/
  public TaxByTypeSummaryForService getIss() {
    return iss;
  }
  public void setIss(TaxByTypeSummaryForService iss) {
    this.iss = iss;
  }
 /**
   * Get aproxtribCity
   * @return aproxtribCity
  **/
  public TaxByTypeSummaryForService getAproxtribCity() {
    return aproxtribCity;
  }
  public void setAproxtribCity(TaxByTypeSummaryForService aproxtribCity) {
    this.aproxtribCity = aproxtribCity;
  }
 /**
   * Get aproxtribFed
   * @return aproxtribFed
  **/
  public TaxByTypeSummaryForService getAproxtribFed() {
    return aproxtribFed;
  }
  public void setAproxtribFed(TaxByTypeSummaryForService aproxtribFed) {
    this.aproxtribFed = aproxtribFed;
  }
 /**
   * Get irpj
   * @return irpj
  **/
  public TaxByTypeSummaryForService getIrpj() {
    return irpj;
  }
  public void setIrpj(TaxByTypeSummaryForService irpj) {
    this.irpj = irpj;
  }
 /**
   * Get inss
   * @return inss
  **/
  public TaxByTypeSummaryForService getInss() {
    return inss;
  }
  public void setInss(TaxByTypeSummaryForService inss) {
    this.inss = inss;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesCalculatedTaxSummaryForServiceTaxByType {\n");
    
    sb.append("    pisRf: ").append(toIndentedString(pisRf)).append("\n");
    sb.append("    cofinsRf: ").append(toIndentedString(cofinsRf)).append("\n");
    sb.append("    csllRf: ").append(toIndentedString(csllRf)).append("\n");
    sb.append("    irrf: ").append(toIndentedString(irrf)).append("\n");
    sb.append("    inssRf: ").append(toIndentedString(inssRf)).append("\n");
    sb.append("    pis: ").append(toIndentedString(pis)).append("\n");
    sb.append("    cofins: ").append(toIndentedString(cofins)).append("\n");
    sb.append("    csll: ").append(toIndentedString(csll)).append("\n");
    sb.append("    issRf: ").append(toIndentedString(issRf)).append("\n");
    sb.append("    iss: ").append(toIndentedString(iss)).append("\n");
    sb.append("    aproxtribCity: ").append(toIndentedString(aproxtribCity)).append("\n");
    sb.append("    aproxtribFed: ").append(toIndentedString(aproxtribFed)).append("\n");
    sb.append("    irpj: ").append(toIndentedString(irpj)).append("\n");
    sb.append("    inss: ").append(toIndentedString(inss)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

