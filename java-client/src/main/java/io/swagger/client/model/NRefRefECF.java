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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * NRefRefECF
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-24T19:47:57.099Z")
public class NRefRefECF {
  @SerializedName("nECF")
  private String nECF = null;

  @SerializedName("nCOO")
  private String nCOO = null;

  /**
   * Fiscal document model - '2B' # coupon tax not ECF - '2C' # PDV coupon tax - '2D' # ECF coupon tax 
   */
  public enum ModECFEnum {
    @SerializedName("2B")
    _2B("2B"),
    
    @SerializedName("2C")
    _2C("2C"),
    
    @SerializedName("2D")
    _2D("2D");

    private String value;

    ModECFEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("modECF")
  private ModECFEnum modECF = null;

  public NRefRefECF nECF(String nECF) {
    this.nECF = nECF;
    return this;
  }

   /**
   * ECF Sequential number that generated Cupom attached to NFe informar o número de ordem seqüencial do ECF que emitiu o Cupom Fiscal vinculado à NF-e 
   * @return nECF
  **/
  @ApiModelProperty(example = "null", required = true, value = "ECF Sequential number that generated Cupom attached to NFe informar o número de ordem seqüencial do ECF que emitiu o Cupom Fiscal vinculado à NF-e ")
  public String getNECF() {
    return nECF;
  }

  public void setNECF(String nECF) {
    this.nECF = nECF;
  }

  public NRefRefECF nCOO(String nCOO) {
    this.nCOO = nCOO;
    return this;
  }

   /**
   * Operational counter number attached to NFe Informar o Número do Contador de Ordem de Operação - COO vinculado à NF-e 
   * @return nCOO
  **/
  @ApiModelProperty(example = "null", required = true, value = "Operational counter number attached to NFe Informar o Número do Contador de Ordem de Operação - COO vinculado à NF-e ")
  public String getNCOO() {
    return nCOO;
  }

  public void setNCOO(String nCOO) {
    this.nCOO = nCOO;
  }

  public NRefRefECF modECF(ModECFEnum modECF) {
    this.modECF = modECF;
    return this;
  }

   /**
   * Fiscal document model - '2B' # coupon tax not ECF - '2C' # PDV coupon tax - '2D' # ECF coupon tax 
   * @return modECF
  **/
  @ApiModelProperty(example = "null", required = true, value = "Fiscal document model - '2B' # coupon tax not ECF - '2C' # PDV coupon tax - '2D' # ECF coupon tax ")
  public ModECFEnum getModECF() {
    return modECF;
  }

  public void setModECF(ModECFEnum modECF) {
    this.modECF = modECF;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NRefRefECF nrefRefECF = (NRefRefECF) o;
    return Objects.equals(this.nECF, nrefRefECF.nECF) &&
        Objects.equals(this.nCOO, nrefRefECF.nCOO) &&
        Objects.equals(this.modECF, nrefRefECF.modECF);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nECF, nCOO, modECF);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NRefRefECF {\n");
    
    sb.append("    nECF: ").append(toIndentedString(nECF)).append("\n");
    sb.append("    nCOO: ").append(toIndentedString(nCOO)).append("\n");
    sb.append("    modECF: ").append(toIndentedString(modECF)).append("\n");
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

