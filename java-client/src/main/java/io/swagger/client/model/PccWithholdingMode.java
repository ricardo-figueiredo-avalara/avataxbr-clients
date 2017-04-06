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
 * PccWithholdingMode
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-06T17:54:07.550Z")
public class PccWithholdingMode {
  /**
   * Inform if this group of tax are calculated considering the threashold by PCC or Individualy (each tax separately)
   */
  public enum TypeEnum {
    @SerializedName("CSRF")
    CSRF("CSRF"),
    
    @SerializedName("individual")
    INDIVIDUAL("individual");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

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

  public PccWithholdingMode type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Inform if this group of tax are calculated considering the threashold by PCC or Individualy (each tax separately)
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "Inform if this group of tax are calculated considering the threashold by PCC or Individualy (each tax separately)")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public PccWithholdingMode totalTax(Double totalTax) {
    this.totalTax = totalTax;
    return this;
  }

   /**
   * this attribute occurs only for CSRF type, When CRSF mode, this is sum of pisRf, CofinsRf and CsllRf
   * @return totalTax
  **/
  @ApiModelProperty(example = "null", value = "this attribute occurs only for CSRF type, When CRSF mode, this is sum of pisRf, CofinsRf and CsllRf")
  public Double getTotalTax() {
    return totalTax;
  }

  public void setTotalTax(Double totalTax) {
    this.totalTax = totalTax;
  }

  public PccWithholdingMode pisRf(TaxByTypeTax pisRf) {
    this.pisRf = pisRf;
    return this;
  }

   /**
   * Get pisRf
   * @return pisRf
  **/
  @ApiModelProperty(example = "null", value = "")
  public TaxByTypeTax getPisRf() {
    return pisRf;
  }

  public void setPisRf(TaxByTypeTax pisRf) {
    this.pisRf = pisRf;
  }

  public PccWithholdingMode cofinsRf(TaxByTypeTax cofinsRf) {
    this.cofinsRf = cofinsRf;
    return this;
  }

   /**
   * Get cofinsRf
   * @return cofinsRf
  **/
  @ApiModelProperty(example = "null", value = "")
  public TaxByTypeTax getCofinsRf() {
    return cofinsRf;
  }

  public void setCofinsRf(TaxByTypeTax cofinsRf) {
    this.cofinsRf = cofinsRf;
  }

  public PccWithholdingMode csllRf(TaxByTypeTax csllRf) {
    this.csllRf = csllRf;
    return this;
  }

   /**
   * Get csllRf
   * @return csllRf
  **/
  @ApiModelProperty(example = "null", value = "")
  public TaxByTypeTax getCsllRf() {
    return csllRf;
  }

  public void setCsllRf(TaxByTypeTax csllRf) {
    this.csllRf = csllRf;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PccWithholdingMode pccWithholdingMode = (PccWithholdingMode) o;
    return Objects.equals(this.type, pccWithholdingMode.type) &&
        Objects.equals(this.totalTax, pccWithholdingMode.totalTax) &&
        Objects.equals(this.pisRf, pccWithholdingMode.pisRf) &&
        Objects.equals(this.cofinsRf, pccWithholdingMode.cofinsRf) &&
        Objects.equals(this.csllRf, pccWithholdingMode.csllRf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, totalTax, pisRf, cofinsRf, csllRf);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PccWithholdingMode {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    totalTax: ").append(toIndentedString(totalTax)).append("\n");
    sb.append("    pisRf: ").append(toIndentedString(pisRf)).append("\n");
    sb.append("    cofinsRf: ").append(toIndentedString(cofinsRf)).append("\n");
    sb.append("    csllRf: ").append(toIndentedString(csllRf)).append("\n");
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

