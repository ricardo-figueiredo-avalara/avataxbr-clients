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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class AgastExtendForSefaz {
  
  @SerializedName("hsCode")
  private String hsCode = null;
  @SerializedName("ex")
  private Integer ex = null;
  @SerializedName("cest")
  private String cest = null;
  @SerializedName("cean")
  private String cean = null;
  @SerializedName("nve")
  private String nve = null;
  @SerializedName("unit")
  private String unit = null;
  @SerializedName("unitTaxable")
  private String unitTaxable = null;
  @SerializedName("nFCI")
  private String nFCI = null;

  /**
   * harmonized code, NCM or LC 116
   **/
  @ApiModelProperty(value = "harmonized code, NCM or LC 116")
  public String getHsCode() {
    return hsCode;
  }
  public void setHsCode(String hsCode) {
    this.hsCode = hsCode;
  }

  /**
   * hsCode Exception for IPI tax
   **/
  @ApiModelProperty(value = "hsCode Exception for IPI tax")
  public Integer getEx() {
    return ex;
  }
  public void setEx(Integer ex) {
    this.ex = ex;
  }

  /**
   * tax substitution code - Codigo especificador da Substuicao Tributaria
   **/
  @ApiModelProperty(value = "tax substitution code - Codigo especificador da Substuicao Tributaria")
  public String getCest() {
    return cest;
  }
  public void setCest(String cest) {
    this.cest = cest;
  }

  /**
   * GTIN NUMBER
   **/
  @ApiModelProperty(value = "GTIN NUMBER")
  public String getCean() {
    return cean;
  }
  public void setCean(String cean) {
    this.cean = cean;
  }

  /**
   * Nomenclatura de Valor aduaneio e Estatístico - NCM extension code
   **/
  @ApiModelProperty(value = "Nomenclatura de Valor aduaneio e Estatístico - NCM extension code")
  public String getNve() {
    return nve;
  }
  public void setNve(String nve) {
    this.nve = nve;
  }

  /**
   * Sales Unit
   **/
  @ApiModelProperty(value = "Sales Unit")
  public String getUnit() {
    return unit;
  }
  public void setUnit(String unit) {
    this.unit = unit;
  }

  /**
   * Sales Taxable Unit
   **/
  @ApiModelProperty(value = "Sales Taxable Unit")
  public String getUnitTaxable() {
    return unitTaxable;
  }
  public void setUnitTaxable(String unitTaxable) {
    this.unitTaxable = unitTaxable;
  }

  /**
   * Importation content form number (Número de controle da FCI - Ficha de Conteúdo de Importação)
   **/
  @ApiModelProperty(value = "Importation content form number (Número de controle da FCI - Ficha de Conteúdo de Importação)")
  public String getNFCI() {
    return nFCI;
  }
  public void setNFCI(String nFCI) {
    this.nFCI = nFCI;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgastExtendForSefaz agastExtendForSefaz = (AgastExtendForSefaz) o;
    return (this.hsCode == null ? agastExtendForSefaz.hsCode == null : this.hsCode.equals(agastExtendForSefaz.hsCode)) &&
        (this.ex == null ? agastExtendForSefaz.ex == null : this.ex.equals(agastExtendForSefaz.ex)) &&
        (this.cest == null ? agastExtendForSefaz.cest == null : this.cest.equals(agastExtendForSefaz.cest)) &&
        (this.cean == null ? agastExtendForSefaz.cean == null : this.cean.equals(agastExtendForSefaz.cean)) &&
        (this.nve == null ? agastExtendForSefaz.nve == null : this.nve.equals(agastExtendForSefaz.nve)) &&
        (this.unit == null ? agastExtendForSefaz.unit == null : this.unit.equals(agastExtendForSefaz.unit)) &&
        (this.unitTaxable == null ? agastExtendForSefaz.unitTaxable == null : this.unitTaxable.equals(agastExtendForSefaz.unitTaxable)) &&
        (this.nFCI == null ? agastExtendForSefaz.nFCI == null : this.nFCI.equals(agastExtendForSefaz.nFCI));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.hsCode == null ? 0: this.hsCode.hashCode());
    result = 31 * result + (this.ex == null ? 0: this.ex.hashCode());
    result = 31 * result + (this.cest == null ? 0: this.cest.hashCode());
    result = 31 * result + (this.cean == null ? 0: this.cean.hashCode());
    result = 31 * result + (this.nve == null ? 0: this.nve.hashCode());
    result = 31 * result + (this.unit == null ? 0: this.unit.hashCode());
    result = 31 * result + (this.unitTaxable == null ? 0: this.unitTaxable.hashCode());
    result = 31 * result + (this.nFCI == null ? 0: this.nFCI.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgastExtendForSefaz {\n");
    
    sb.append("  hsCode: ").append(hsCode).append("\n");
    sb.append("  ex: ").append(ex).append("\n");
    sb.append("  cest: ").append(cest).append("\n");
    sb.append("  cean: ").append(cean).append("\n");
    sb.append("  nve: ").append(nve).append("\n");
    sb.append("  unit: ").append(unit).append("\n");
    sb.append("  unitTaxable: ").append(unitTaxable).append("\n");
    sb.append("  nFCI: ").append(nFCI).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
