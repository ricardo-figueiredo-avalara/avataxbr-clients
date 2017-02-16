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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class NRefRefECF {
  
  @SerializedName("nECF")
  private String nECF = null;
  @SerializedName("nCOO")
  private String nCOO = null;
  public enum ModECFEnum {
     2B,  2C,  2D, 
  };
  @SerializedName("modECF")
  private ModECFEnum modECF = null;

  /**
   * ECF Sequential number that generated Cupom attached to NFe informar o número de ordem seqüencial do ECF que emitiu o Cupom Fiscal vinculado à NF-e 
   **/
  @ApiModelProperty(required = true, value = "ECF Sequential number that generated Cupom attached to NFe informar o número de ordem seqüencial do ECF que emitiu o Cupom Fiscal vinculado à NF-e ")
  public String getNECF() {
    return nECF;
  }
  public void setNECF(String nECF) {
    this.nECF = nECF;
  }

  /**
   * Operational counter number attached to NFe Informar o Número do Contador de Ordem de Operação - COO vinculado à NF-e 
   **/
  @ApiModelProperty(required = true, value = "Operational counter number attached to NFe Informar o Número do Contador de Ordem de Operação - COO vinculado à NF-e ")
  public String getNCOO() {
    return nCOO;
  }
  public void setNCOO(String nCOO) {
    this.nCOO = nCOO;
  }

  /**
   * Fiscal document model - '2B' # coupon tax not ECF - '2C' # PDV coupon tax - '2D' # ECF coupon tax 
   **/
  @ApiModelProperty(required = true, value = "Fiscal document model - '2B' # coupon tax not ECF - '2C' # PDV coupon tax - '2D' # ECF coupon tax ")
  public ModECFEnum getModECF() {
    return modECF;
  }
  public void setModECF(ModECFEnum modECF) {
    this.modECF = modECF;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NRefRefECF nRefRefECF = (NRefRefECF) o;
    return (this.nECF == null ? nRefRefECF.nECF == null : this.nECF.equals(nRefRefECF.nECF)) &&
        (this.nCOO == null ? nRefRefECF.nCOO == null : this.nCOO.equals(nRefRefECF.nCOO)) &&
        (this.modECF == null ? nRefRefECF.modECF == null : this.modECF.equals(nRefRefECF.modECF));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.nECF == null ? 0: this.nECF.hashCode());
    result = 31 * result + (this.nCOO == null ? 0: this.nCOO.hashCode());
    result = 31 * result + (this.modECF == null ? 0: this.modECF.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NRefRefECF {\n");
    
    sb.append("  nECF: ").append(nECF).append("\n");
    sb.append("  nCOO: ").append(nCOO).append("\n");
    sb.append("  modECF: ").append(modECF).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
