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

@ApiModel(description = "")
public class PccWithholdingMode {
  
  public enum TypeEnum {
     CSRF,  individual, 
  };
  @SerializedName("type")
  private TypeEnum type = null;
  @SerializedName("totalTax")
  private Double totalTax = null;
  @SerializedName("pisRf")
  private TaxByTypeTax pisRf = null;
  @SerializedName("cofinsRf")
  private TaxByTypeTax cofinsRf = null;
  @SerializedName("csllRf")
  private TaxByTypeTax csllRf = null;

  /**
   * Inform if this group of tax are calculated considering the threashold by PCC or Individualy (each tax separately)
   **/
  @ApiModelProperty(value = "Inform if this group of tax are calculated considering the threashold by PCC or Individualy (each tax separately)")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * this attribute occurs only for CSRF type, When CRSF mode, this is sum of pisRf, CofinsRf and CsllRf
   **/
  @ApiModelProperty(value = "this attribute occurs only for CSRF type, When CRSF mode, this is sum of pisRf, CofinsRf and CsllRf")
  public Double getTotalTax() {
    return totalTax;
  }
  public void setTotalTax(Double totalTax) {
    this.totalTax = totalTax;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PccWithholdingMode pccWithholdingMode = (PccWithholdingMode) o;
    return (this.type == null ? pccWithholdingMode.type == null : this.type.equals(pccWithholdingMode.type)) &&
        (this.totalTax == null ? pccWithholdingMode.totalTax == null : this.totalTax.equals(pccWithholdingMode.totalTax)) &&
        (this.pisRf == null ? pccWithholdingMode.pisRf == null : this.pisRf.equals(pccWithholdingMode.pisRf)) &&
        (this.cofinsRf == null ? pccWithholdingMode.cofinsRf == null : this.cofinsRf.equals(pccWithholdingMode.cofinsRf)) &&
        (this.csllRf == null ? pccWithholdingMode.csllRf == null : this.csllRf.equals(pccWithholdingMode.csllRf));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.totalTax == null ? 0: this.totalTax.hashCode());
    result = 31 * result + (this.pisRf == null ? 0: this.pisRf.hashCode());
    result = 31 * result + (this.cofinsRf == null ? 0: this.cofinsRf.hashCode());
    result = 31 * result + (this.csllRf == null ? 0: this.csllRf.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PccWithholdingMode {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  totalTax: ").append(totalTax).append("\n");
    sb.append("  pisRf: ").append(pisRf).append("\n");
    sb.append("  cofinsRf: ").append(cofinsRf).append("\n");
    sb.append("  csllRf: ").append(csllRf).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}