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
import io.swagger.client.model.IssConfServiceListTaxRateIbpt;
import io.swagger.client.model.ServiceItemTaxRate;

/**
 * IssConfServiceListTaxRate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-24T19:47:57.099Z")
public class IssConfServiceListTaxRate {
  @SerializedName("ISS")
  private ServiceItemTaxRate ISS = null;

  @SerializedName("ISS_RF")
  private ServiceItemTaxRate ISS_RF = null;

  @SerializedName("ISS_E")
  private ServiceItemTaxRate ISS_E = null;

  @SerializedName("ISS_I")
  private ServiceItemTaxRate ISS_I = null;

  @SerializedName("ibpt")
  private IssConfServiceListTaxRateIbpt ibpt = null;

  public IssConfServiceListTaxRate ISS(ServiceItemTaxRate ISS) {
    this.ISS = ISS;
    return this;
  }

   /**
   * Get ISS
   * @return ISS
  **/
  @ApiModelProperty(example = "null", value = "")
  public ServiceItemTaxRate getISS() {
    return ISS;
  }

  public void setISS(ServiceItemTaxRate ISS) {
    this.ISS = ISS;
  }

  public IssConfServiceListTaxRate ISS_RF(ServiceItemTaxRate ISS_RF) {
    this.ISS_RF = ISS_RF;
    return this;
  }

   /**
   * Get ISS_RF
   * @return ISS_RF
  **/
  @ApiModelProperty(example = "null", value = "")
  public ServiceItemTaxRate getISSRF() {
    return ISS_RF;
  }

  public void setISSRF(ServiceItemTaxRate ISS_RF) {
    this.ISS_RF = ISS_RF;
  }

  public IssConfServiceListTaxRate ISS_E(ServiceItemTaxRate ISS_E) {
    this.ISS_E = ISS_E;
    return this;
  }

   /**
   * Get ISS_E
   * @return ISS_E
  **/
  @ApiModelProperty(example = "null", value = "")
  public ServiceItemTaxRate getISSE() {
    return ISS_E;
  }

  public void setISSE(ServiceItemTaxRate ISS_E) {
    this.ISS_E = ISS_E;
  }

  public IssConfServiceListTaxRate ISS_I(ServiceItemTaxRate ISS_I) {
    this.ISS_I = ISS_I;
    return this;
  }

   /**
   * Get ISS_I
   * @return ISS_I
  **/
  @ApiModelProperty(example = "null", value = "")
  public ServiceItemTaxRate getISSI() {
    return ISS_I;
  }

  public void setISSI(ServiceItemTaxRate ISS_I) {
    this.ISS_I = ISS_I;
  }

  public IssConfServiceListTaxRate ibpt(IssConfServiceListTaxRateIbpt ibpt) {
    this.ibpt = ibpt;
    return this;
  }

   /**
   * Get ibpt
   * @return ibpt
  **/
  @ApiModelProperty(example = "null", value = "")
  public IssConfServiceListTaxRateIbpt getIbpt() {
    return ibpt;
  }

  public void setIbpt(IssConfServiceListTaxRateIbpt ibpt) {
    this.ibpt = ibpt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssConfServiceListTaxRate issConfServiceListTaxRate = (IssConfServiceListTaxRate) o;
    return Objects.equals(this.ISS, issConfServiceListTaxRate.ISS) &&
        Objects.equals(this.ISS_RF, issConfServiceListTaxRate.ISS_RF) &&
        Objects.equals(this.ISS_E, issConfServiceListTaxRate.ISS_E) &&
        Objects.equals(this.ISS_I, issConfServiceListTaxRate.ISS_I) &&
        Objects.equals(this.ibpt, issConfServiceListTaxRate.ibpt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ISS, ISS_RF, ISS_E, ISS_I, ibpt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssConfServiceListTaxRate {\n");
    
    sb.append("    ISS: ").append(toIndentedString(ISS)).append("\n");
    sb.append("    ISS_RF: ").append(toIndentedString(ISS_RF)).append("\n");
    sb.append("    ISS_E: ").append(toIndentedString(ISS_E)).append("\n");
    sb.append("    ISS_I: ").append(toIndentedString(ISS_I)).append("\n");
    sb.append("    ibpt: ").append(toIndentedString(ibpt)).append("\n");
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

