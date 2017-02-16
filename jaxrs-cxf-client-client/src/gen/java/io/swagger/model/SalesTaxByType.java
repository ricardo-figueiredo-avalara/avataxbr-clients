package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.TaxByTypeTax;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@ApiModel(description="Object with summary of all taxes returned by engine")
public class SalesTaxByType  {
  
  @ApiModelProperty(example = "null", value = "")
  private TaxByTypeTax pisRf = null;
  @ApiModelProperty(example = "null", value = "")
  private TaxByTypeTax cofinsRf = null;
  @ApiModelProperty(example = "null", value = "")
  private TaxByTypeTax csllRf = null;
  @ApiModelProperty(example = "null", value = "")
  private TaxByTypeTax irrf = null;
  @ApiModelProperty(example = "null", value = "")
  private TaxByTypeTax inssRf = null;
  @ApiModelProperty(example = "null", value = "")
  private TaxByTypeTax pis = null;
  @ApiModelProperty(example = "null", value = "")
  private TaxByTypeTax cofins = null;
  @ApiModelProperty(example = "null", value = "")
  private TaxByTypeTax csll = null;
  @ApiModelProperty(example = "null", value = "")
  private TaxByTypeTax issRf = null;
  @ApiModelProperty(example = "null", value = "")
  private TaxByTypeTax iss = null;
  @ApiModelProperty(example = "null", value = "")
  private TaxByTypeTax aproxtribCity = null;
  @ApiModelProperty(example = "null", value = "")
  private TaxByTypeTax aproxtribFed = null;
  @ApiModelProperty(example = "null", value = "")
  private TaxByTypeTax irpj = null;
  @ApiModelProperty(example = "null", value = "")
  private TaxByTypeTax inss = null;

 /**
   * Get pisRf
   * @return pisRf
  **/
  public TaxByTypeTax getPisRf() {
    return pisRf;
  }
  public void setPisRf(TaxByTypeTax pisRf) {
    this.pisRf = pisRf;
  }
 /**
   * Get cofinsRf
   * @return cofinsRf
  **/
  public TaxByTypeTax getCofinsRf() {
    return cofinsRf;
  }
  public void setCofinsRf(TaxByTypeTax cofinsRf) {
    this.cofinsRf = cofinsRf;
  }
 /**
   * Get csllRf
   * @return csllRf
  **/
  public TaxByTypeTax getCsllRf() {
    return csllRf;
  }
  public void setCsllRf(TaxByTypeTax csllRf) {
    this.csllRf = csllRf;
  }
 /**
   * Get irrf
   * @return irrf
  **/
  public TaxByTypeTax getIrrf() {
    return irrf;
  }
  public void setIrrf(TaxByTypeTax irrf) {
    this.irrf = irrf;
  }
 /**
   * Get inssRf
   * @return inssRf
  **/
  public TaxByTypeTax getInssRf() {
    return inssRf;
  }
  public void setInssRf(TaxByTypeTax inssRf) {
    this.inssRf = inssRf;
  }
 /**
   * Get pis
   * @return pis
  **/
  public TaxByTypeTax getPis() {
    return pis;
  }
  public void setPis(TaxByTypeTax pis) {
    this.pis = pis;
  }
 /**
   * Get cofins
   * @return cofins
  **/
  public TaxByTypeTax getCofins() {
    return cofins;
  }
  public void setCofins(TaxByTypeTax cofins) {
    this.cofins = cofins;
  }
 /**
   * Get csll
   * @return csll
  **/
  public TaxByTypeTax getCsll() {
    return csll;
  }
  public void setCsll(TaxByTypeTax csll) {
    this.csll = csll;
  }
 /**
   * Get issRf
   * @return issRf
  **/
  public TaxByTypeTax getIssRf() {
    return issRf;
  }
  public void setIssRf(TaxByTypeTax issRf) {
    this.issRf = issRf;
  }
 /**
   * Get iss
   * @return iss
  **/
  public TaxByTypeTax getIss() {
    return iss;
  }
  public void setIss(TaxByTypeTax iss) {
    this.iss = iss;
  }
 /**
   * Get aproxtribCity
   * @return aproxtribCity
  **/
  public TaxByTypeTax getAproxtribCity() {
    return aproxtribCity;
  }
  public void setAproxtribCity(TaxByTypeTax aproxtribCity) {
    this.aproxtribCity = aproxtribCity;
  }
 /**
   * Get aproxtribFed
   * @return aproxtribFed
  **/
  public TaxByTypeTax getAproxtribFed() {
    return aproxtribFed;
  }
  public void setAproxtribFed(TaxByTypeTax aproxtribFed) {
    this.aproxtribFed = aproxtribFed;
  }
 /**
   * Get irpj
   * @return irpj
  **/
  public TaxByTypeTax getIrpj() {
    return irpj;
  }
  public void setIrpj(TaxByTypeTax irpj) {
    this.irpj = irpj;
  }
 /**
   * Get inss
   * @return inss
  **/
  public TaxByTypeTax getInss() {
    return inss;
  }
  public void setInss(TaxByTypeTax inss) {
    this.inss = inss;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesTaxByType {\n");
    
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

