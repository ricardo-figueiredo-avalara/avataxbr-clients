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
 * NRefRefFarmerNF
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-06T17:54:07.550Z")
public class NRefRefFarmerNF {
  @SerializedName("stateCd")
  private StateEnum stateCd = null;

  @SerializedName("yymm")
  private String yymm = null;

  @SerializedName("federalTaxId")
  private String federalTaxId = null;

  @SerializedName("stateTaxId")
  private String stateTaxId = null;

  /**
   * Document Fiscal model - '04' # FARMER DOCUMENT - '01' # DETACHED DOCUMENT - AVULSO 
   */
  public enum ModelEnum {
    @SerializedName("04")
    _04("04"),
    
    @SerializedName("01")
    _01("01");

    private String value;

    ModelEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("model")
  private ModelEnum model = null;

  @SerializedName("serie")
  private String serie = null;

  @SerializedName("number")
  private String number = null;

  public NRefRefFarmerNF stateCd(StateEnum stateCd) {
    this.stateCd = stateCd;
    return this;
  }

   /**
   * State code of fiscal Document creator, farmer
   * @return stateCd
  **/
  @ApiModelProperty(example = "null", required = true, value = "State code of fiscal Document creator, farmer")
  public StateEnum getStateCd() {
    return stateCd;
  }

  public void setStateCd(StateEnum stateCd) {
    this.stateCd = stateCd;
  }

  public NRefRefFarmerNF yymm(String yymm) {
    this.yymm = yymm;
    return this;
  }

   /**
   * year and month of fiscal document creation
   * @return yymm
  **/
  @ApiModelProperty(example = "null", required = true, value = "year and month of fiscal document creation")
  public String getYymm() {
    return yymm;
  }

  public void setYymm(String yymm) {
    this.yymm = yymm;
  }

  public NRefRefFarmerNF federalTaxId(String federalTaxId) {
    this.federalTaxId = federalTaxId;
    return this;
  }

   /**
   * fiscal document creator farmer federalTaxId
   * @return federalTaxId
  **/
  @ApiModelProperty(example = "null", required = true, value = "fiscal document creator farmer federalTaxId")
  public String getFederalTaxId() {
    return federalTaxId;
  }

  public void setFederalTaxId(String federalTaxId) {
    this.federalTaxId = federalTaxId;
  }

  public NRefRefFarmerNF stateTaxId(String stateTaxId) {
    this.stateTaxId = stateTaxId;
    return this;
  }

   /**
   * fiscal document creator, farmer stateTaxId
   * @return stateTaxId
  **/
  @ApiModelProperty(example = "null", required = true, value = "fiscal document creator, farmer stateTaxId")
  public String getStateTaxId() {
    return stateTaxId;
  }

  public void setStateTaxId(String stateTaxId) {
    this.stateTaxId = stateTaxId;
  }

  public NRefRefFarmerNF model(ModelEnum model) {
    this.model = model;
    return this;
  }

   /**
   * Document Fiscal model - '04' # FARMER DOCUMENT - '01' # DETACHED DOCUMENT - AVULSO 
   * @return model
  **/
  @ApiModelProperty(example = "null", required = true, value = "Document Fiscal model - '04' # FARMER DOCUMENT - '01' # DETACHED DOCUMENT - AVULSO ")
  public ModelEnum getModel() {
    return model;
  }

  public void setModel(ModelEnum model) {
    this.model = model;
  }

  public NRefRefFarmerNF serie(String serie) {
    this.serie = serie;
    return this;
  }

   /**
   * fiscal document serie
   * @return serie
  **/
  @ApiModelProperty(example = "null", required = true, value = "fiscal document serie")
  public String getSerie() {
    return serie;
  }

  public void setSerie(String serie) {
    this.serie = serie;
  }

  public NRefRefFarmerNF number(String number) {
    this.number = number;
    return this;
  }

   /**
   * fiscal document number
   * @return number
  **/
  @ApiModelProperty(example = "null", required = true, value = "fiscal document number")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NRefRefFarmerNF nrefRefFarmerNF = (NRefRefFarmerNF) o;
    return Objects.equals(this.stateCd, nrefRefFarmerNF.stateCd) &&
        Objects.equals(this.yymm, nrefRefFarmerNF.yymm) &&
        Objects.equals(this.federalTaxId, nrefRefFarmerNF.federalTaxId) &&
        Objects.equals(this.stateTaxId, nrefRefFarmerNF.stateTaxId) &&
        Objects.equals(this.model, nrefRefFarmerNF.model) &&
        Objects.equals(this.serie, nrefRefFarmerNF.serie) &&
        Objects.equals(this.number, nrefRefFarmerNF.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stateCd, yymm, federalTaxId, stateTaxId, model, serie, number);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NRefRefFarmerNF {\n");
    
    sb.append("    stateCd: ").append(toIndentedString(stateCd)).append("\n");
    sb.append("    yymm: ").append(toIndentedString(yymm)).append("\n");
    sb.append("    federalTaxId: ").append(toIndentedString(federalTaxId)).append("\n");
    sb.append("    stateTaxId: ").append(toIndentedString(stateTaxId)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    serie: ").append(toIndentedString(serie)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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

