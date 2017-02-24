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
import io.swagger.client.model.TaxType;

/**
 * TaxTypeRate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-24T19:47:57.099Z")
public class TaxTypeRate {
  @SerializedName("taxType")
  private TaxType taxType = null;

  /**
   * Tax can be calculated by rate or by quantity
   */
  public enum TaxModelEnum {
    @SerializedName("rate")
    RATE("rate"),
    
    @SerializedName("srf")
    SRF("srf");

    private String value;

    TaxModelEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("taxModel")
  private TaxModelEnum taxModel = null;

  @SerializedName("rate")
  private Double rate = null;

  @SerializedName("srvAmount")
  private Double srvAmount = null;

  @SerializedName("quantityUnidBase")
  private String quantityUnidBase = null;

  /**
   * Gets or Sets specializationType
   */
  public enum SpecializationTypeEnum {
    @SerializedName("basic")
    BASIC("basic"),
    
    @SerializedName("monophase")
    MONOPHASE("monophase"),
    
    @SerializedName("taxSubstitution")
    TAXSUBSTITUTION("taxSubstitution");

    private String value;

    SpecializationTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("specializationType")
  private SpecializationTypeEnum specializationType = null;

  public TaxTypeRate taxType(TaxType taxType) {
    this.taxType = taxType;
    return this;
  }

   /**
   * Get taxType
   * @return taxType
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public TaxType getTaxType() {
    return taxType;
  }

  public void setTaxType(TaxType taxType) {
    this.taxType = taxType;
  }

  public TaxTypeRate taxModel(TaxModelEnum taxModel) {
    this.taxModel = taxModel;
    return this;
  }

   /**
   * Tax can be calculated by rate or by quantity
   * @return taxModel
  **/
  @ApiModelProperty(example = "null", required = true, value = "Tax can be calculated by rate or by quantity")
  public TaxModelEnum getTaxModel() {
    return taxModel;
  }

  public void setTaxModel(TaxModelEnum taxModel) {
    this.taxModel = taxModel;
  }

  public TaxTypeRate rate(Double rate) {
    this.rate = rate;
    return this;
  }

   /**
   * Specific tax rate ex 3.5 (3.5%)
   * @return rate
  **/
  @ApiModelProperty(example = "null", value = "Specific tax rate ex 3.5 (3.5%)")
  public Double getRate() {
    return rate;
  }

  public void setRate(Double rate) {
    this.rate = rate;
  }

  public TaxTypeRate srvAmount(Double srvAmount) {
    this.srvAmount = srvAmount;
    return this;
  }

   /**
   * Specific tax rate ex 3.5 (3.5%)
   * @return srvAmount
  **/
  @ApiModelProperty(example = "null", value = "Specific tax rate ex 3.5 (3.5%)")
  public Double getSrvAmount() {
    return srvAmount;
  }

  public void setSrvAmount(Double srvAmount) {
    this.srvAmount = srvAmount;
  }

  public TaxTypeRate quantityUnidBase(String quantityUnidBase) {
    this.quantityUnidBase = quantityUnidBase;
    return this;
  }

   /**
   * Get quantityUnidBase
   * @return quantityUnidBase
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getQuantityUnidBase() {
    return quantityUnidBase;
  }

  public void setQuantityUnidBase(String quantityUnidBase) {
    this.quantityUnidBase = quantityUnidBase;
  }

  public TaxTypeRate specializationType(SpecializationTypeEnum specializationType) {
    this.specializationType = specializationType;
    return this;
  }

   /**
   * Get specializationType
   * @return specializationType
  **/
  @ApiModelProperty(example = "null", value = "")
  public SpecializationTypeEnum getSpecializationType() {
    return specializationType;
  }

  public void setSpecializationType(SpecializationTypeEnum specializationType) {
    this.specializationType = specializationType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxTypeRate taxTypeRate = (TaxTypeRate) o;
    return Objects.equals(this.taxType, taxTypeRate.taxType) &&
        Objects.equals(this.taxModel, taxTypeRate.taxModel) &&
        Objects.equals(this.rate, taxTypeRate.rate) &&
        Objects.equals(this.srvAmount, taxTypeRate.srvAmount) &&
        Objects.equals(this.quantityUnidBase, taxTypeRate.quantityUnidBase) &&
        Objects.equals(this.specializationType, taxTypeRate.specializationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxType, taxModel, rate, srvAmount, quantityUnidBase, specializationType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxTypeRate {\n");
    
    sb.append("    taxType: ").append(toIndentedString(taxType)).append("\n");
    sb.append("    taxModel: ").append(toIndentedString(taxModel)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    srvAmount: ").append(toIndentedString(srvAmount)).append("\n");
    sb.append("    quantityUnidBase: ").append(toIndentedString(quantityUnidBase)).append("\n");
    sb.append("    specializationType: ").append(toIndentedString(specializationType)).append("\n");
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

