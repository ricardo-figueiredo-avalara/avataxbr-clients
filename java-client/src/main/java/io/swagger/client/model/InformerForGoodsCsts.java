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
 * InformerForGoodsCsts
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-06T17:54:07.550Z")
public class InformerForGoodsCsts {
  @SerializedName("icms")
  private String icms = null;

  @SerializedName("ipi")
  private String ipi = null;

  @SerializedName("pisCofins")
  private String pisCofins = null;

  public InformerForGoodsCsts icms(String icms) {
    this.icms = icms;
    return this;
  }

   /**
   * CST-B
   * @return icms
  **/
  @ApiModelProperty(example = "null", value = "CST-B")
  public String getIcms() {
    return icms;
  }

  public void setIcms(String icms) {
    this.icms = icms;
  }

  public InformerForGoodsCsts ipi(String ipi) {
    this.ipi = ipi;
    return this;
  }

   /**
   * CST-IPI
   * @return ipi
  **/
  @ApiModelProperty(example = "null", value = "CST-IPI")
  public String getIpi() {
    return ipi;
  }

  public void setIpi(String ipi) {
    this.ipi = ipi;
  }

  public InformerForGoodsCsts pisCofins(String pisCofins) {
    this.pisCofins = pisCofins;
    return this;
  }

   /**
   * CST PIS/COFINS
   * @return pisCofins
  **/
  @ApiModelProperty(example = "null", value = "CST PIS/COFINS")
  public String getPisCofins() {
    return pisCofins;
  }

  public void setPisCofins(String pisCofins) {
    this.pisCofins = pisCofins;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InformerForGoodsCsts informerForGoodsCsts = (InformerForGoodsCsts) o;
    return Objects.equals(this.icms, informerForGoodsCsts.icms) &&
        Objects.equals(this.ipi, informerForGoodsCsts.ipi) &&
        Objects.equals(this.pisCofins, informerForGoodsCsts.pisCofins);
  }

  @Override
  public int hashCode() {
    return Objects.hash(icms, ipi, pisCofins);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InformerForGoodsCsts {\n");
    
    sb.append("    icms: ").append(toIndentedString(icms)).append("\n");
    sb.append("    ipi: ").append(toIndentedString(ipi)).append("\n");
    sb.append("    pisCofins: ").append(toIndentedString(pisCofins)).append("\n");
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

