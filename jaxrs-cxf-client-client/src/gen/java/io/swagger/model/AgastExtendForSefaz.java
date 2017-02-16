package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class AgastExtendForSefaz  {
  
  @ApiModelProperty(example = "null", value = "harmonized code, NCM or LC 116")
  private String hsCode = null;
  @ApiModelProperty(example = "null", value = "hsCode Exception for IPI tax")
  private Integer ex = null;
  @ApiModelProperty(example = "null", value = "tax substitution code - Codigo especificador da Substuicao Tributaria")
  private String cest = null;
  @ApiModelProperty(example = "null", value = "GTIN NUMBER")
  private String cean = null;
  @ApiModelProperty(example = "null", value = "Nomenclatura de Valor aduaneio e Estatístico - NCM extension code")
  private String nve = null;
  @ApiModelProperty(example = "null", value = "Sales Unit")
  private String unit = null;
  @ApiModelProperty(example = "null", value = "Sales Taxable Unit")
  private String unitTaxable = null;
  @ApiModelProperty(example = "null", value = "Importation content form number (Número de controle da FCI - Ficha de Conteúdo de Importação)")
  private String nFCI = null;

 /**
   * harmonized code, NCM or LC 116
   * @return hsCode
  **/
  public String getHsCode() {
    return hsCode;
  }
  public void setHsCode(String hsCode) {
    this.hsCode = hsCode;
  }
 /**
   * hsCode Exception for IPI tax
   * @return ex
  **/
  public Integer getEx() {
    return ex;
  }
  public void setEx(Integer ex) {
    this.ex = ex;
  }
 /**
   * tax substitution code - Codigo especificador da Substuicao Tributaria
   * @return cest
  **/
  public String getCest() {
    return cest;
  }
  public void setCest(String cest) {
    this.cest = cest;
  }
 /**
   * GTIN NUMBER
   * @return cean
  **/
  public String getCean() {
    return cean;
  }
  public void setCean(String cean) {
    this.cean = cean;
  }
 /**
   * Nomenclatura de Valor aduaneio e Estatístico - NCM extension code
   * @return nve
  **/
  public String getNve() {
    return nve;
  }
  public void setNve(String nve) {
    this.nve = nve;
  }
 /**
   * Sales Unit
   * @return unit
  **/
  public String getUnit() {
    return unit;
  }
  public void setUnit(String unit) {
    this.unit = unit;
  }
 /**
   * Sales Taxable Unit
   * @return unitTaxable
  **/
  public String getUnitTaxable() {
    return unitTaxable;
  }
  public void setUnitTaxable(String unitTaxable) {
    this.unitTaxable = unitTaxable;
  }
 /**
   * Importation content form number (Número de controle da FCI - Ficha de Conteúdo de Importação)
   * @return nFCI
  **/
  public String getNFCI() {
    return nFCI;
  }
  public void setNFCI(String nFCI) {
    this.nFCI = nFCI;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgastExtendForSefaz {\n");
    
    sb.append("    hsCode: ").append(toIndentedString(hsCode)).append("\n");
    sb.append("    ex: ").append(toIndentedString(ex)).append("\n");
    sb.append("    cest: ").append(toIndentedString(cest)).append("\n");
    sb.append("    cean: ").append(toIndentedString(cean)).append("\n");
    sb.append("    nve: ").append(toIndentedString(nve)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    unitTaxable: ").append(toIndentedString(unitTaxable)).append("\n");
    sb.append("    nFCI: ").append(toIndentedString(nFCI)).append("\n");
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

