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
import io.swagger.client.model.EntityType;
import io.swagger.client.model.FederalTaxRegime;

/**
 * PurchaseEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-24T19:47:57.099Z")
public class PurchaseEntity {
  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private EntityType type = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("cnpjcpf")
  private String cnpjcpf = null;

  @SerializedName("cityTaxId")
  private String cityTaxId = null;

  @SerializedName("stateTaxId")
  private String stateTaxId = null;

  @SerializedName("suframa")
  private String suframa = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("taxRegime")
  private FederalTaxRegime taxRegime = null;

  @SerializedName("hasCpom")
  private Boolean hasCpom = null;

  @SerializedName("subjectWithholdingIrrf")
  private Boolean subjectWithholdingIrrf = null;

  @SerializedName("inssPreviousContrib")
  private Double inssPreviousContrib = null;

  @SerializedName("inssBasisDiscount")
  private Double inssBasisDiscount = null;

  @SerializedName("issRfRate")
  private Double issRfRate = null;

  public PurchaseEntity name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Legal Name of Service buyer.
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Legal Name of Service buyer.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PurchaseEntity type(EntityType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public EntityType getType() {
    return type;
  }

  public void setType(EntityType type) {
    this.type = type;
  }

  public PurchaseEntity email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Entity Email
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "Entity Email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public PurchaseEntity cnpjcpf(String cnpjcpf) {
    this.cnpjcpf = cnpjcpf;
    return this;
  }

   /**
   * CNPJ/CPF of Sales Buyer. If CPF, pattern is '[0-9]{11}' if CNPJ, pattern is '[0-9]{14}'
   * @return cnpjcpf
  **/
  @ApiModelProperty(example = "null", value = "CNPJ/CPF of Sales Buyer. If CPF, pattern is '[0-9]{11}' if CNPJ, pattern is '[0-9]{14}'")
  public String getCnpjcpf() {
    return cnpjcpf;
  }

  public void setCnpjcpf(String cnpjcpf) {
    this.cnpjcpf = cnpjcpf;
  }

  public PurchaseEntity cityTaxId(String cityTaxId) {
    this.cityTaxId = cityTaxId;
    return this;
  }

   /**
   * City Tax ID
   * @return cityTaxId
  **/
  @ApiModelProperty(example = "null", value = "City Tax ID")
  public String getCityTaxId() {
    return cityTaxId;
  }

  public void setCityTaxId(String cityTaxId) {
    this.cityTaxId = cityTaxId;
  }

  public PurchaseEntity stateTaxId(String stateTaxId) {
    this.stateTaxId = stateTaxId;
    return this;
  }

   /**
   * State Tax ID
   * @return stateTaxId
  **/
  @ApiModelProperty(example = "null", value = "State Tax ID")
  public String getStateTaxId() {
    return stateTaxId;
  }

  public void setStateTaxId(String stateTaxId) {
    this.stateTaxId = stateTaxId;
  }

  public PurchaseEntity suframa(String suframa) {
    this.suframa = suframa;
    return this;
  }

   /**
   * Suframa ID
   * @return suframa
  **/
  @ApiModelProperty(example = "null", value = "Suframa ID")
  public String getSuframa() {
    return suframa;
  }

  public void setSuframa(String suframa) {
    this.suframa = suframa;
  }

  public PurchaseEntity phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Entity Phone
   * @return phone
  **/
  @ApiModelProperty(example = "null", value = "Entity Phone")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public PurchaseEntity taxRegime(FederalTaxRegime taxRegime) {
    this.taxRegime = taxRegime;
    return this;
  }

   /**
   * Get taxRegime
   * @return taxRegime
  **/
  @ApiModelProperty(example = "null", value = "")
  public FederalTaxRegime getTaxRegime() {
    return taxRegime;
  }

  public void setTaxRegime(FederalTaxRegime taxRegime) {
    this.taxRegime = taxRegime;
  }

  public PurchaseEntity hasCpom(Boolean hasCpom) {
    this.hasCpom = hasCpom;
    return this;
  }

   /**
   * Some cities require PURCHASE.Buyers to withhold ISS (City Tax) from PURCHASE.Sellers stablished in different cities. In case the PURCHASE.Seller has acquired a Tax Registration in this destination city, by providing this information in the service invoice, this withholding obligation is lifted.
   * @return hasCpom
  **/
  @ApiModelProperty(example = "null", value = "Some cities require PURCHASE.Buyers to withhold ISS (City Tax) from PURCHASE.Sellers stablished in different cities. In case the PURCHASE.Seller has acquired a Tax Registration in this destination city, by providing this information in the service invoice, this withholding obligation is lifted.")
  public Boolean getHasCpom() {
    return hasCpom;
  }

  public void setHasCpom(Boolean hasCpom) {
    this.hasCpom = hasCpom;
  }

  public PurchaseEntity subjectWithholdingIrrf(Boolean subjectWithholdingIrrf) {
    this.subjectWithholdingIrrf = subjectWithholdingIrrf;
    return this;
  }

   /**
   * These are the federal taxes attributes that determine whether withholding of taxes should take place. In special cases where the PURCHASE.Seller is exempt of one or more of these taxes the withholding follows the same rules. The Business type may also dictate these rules as well.
   * @return subjectWithholdingIrrf
  **/
  @ApiModelProperty(example = "null", value = "These are the federal taxes attributes that determine whether withholding of taxes should take place. In special cases where the PURCHASE.Seller is exempt of one or more of these taxes the withholding follows the same rules. The Business type may also dictate these rules as well.")
  public Boolean getSubjectWithholdingIrrf() {
    return subjectWithholdingIrrf;
  }

  public void setSubjectWithholdingIrrf(Boolean subjectWithholdingIrrf) {
    this.subjectWithholdingIrrf = subjectWithholdingIrrf;
  }

  public PurchaseEntity inssPreviousContrib(Double inssPreviousContrib) {
    this.inssPreviousContrib = inssPreviousContrib;
    return this;
  }

   /**
   * The INSS contribution is capped at a maximum limit (amount of actual retired payment available in the country).  Individuals sellers subject to INSS withholding can provide the amount already tax by other transactions (with the same buyer or different ones) to deduct to the tax basis. This amount is to be provided to the Seller in a form of a signed document.
   * @return inssPreviousContrib
  **/
  @ApiModelProperty(example = "null", value = "The INSS contribution is capped at a maximum limit (amount of actual retired payment available in the country).  Individuals sellers subject to INSS withholding can provide the amount already tax by other transactions (with the same buyer or different ones) to deduct to the tax basis. This amount is to be provided to the Seller in a form of a signed document.")
  public Double getInssPreviousContrib() {
    return inssPreviousContrib;
  }

  public void setInssPreviousContrib(Double inssPreviousContrib) {
    this.inssPreviousContrib = inssPreviousContrib;
  }

  public PurchaseEntity inssBasisDiscount(Double inssBasisDiscount) {
    this.inssBasisDiscount = inssBasisDiscount;
    return this;
  }

   /**
   * The INSS contribution is applicable only to the labor amount in a service contract.  There are several items that may be deducted from the service invoice total to arrive at the INSS taxable amount. This amount is to be provided to the Seller in the body of the Invoice or calculated during the transaction input.
   * @return inssBasisDiscount
  **/
  @ApiModelProperty(example = "null", value = "The INSS contribution is applicable only to the labor amount in a service contract.  There are several items that may be deducted from the service invoice total to arrive at the INSS taxable amount. This amount is to be provided to the Seller in the body of the Invoice or calculated during the transaction input.")
  public Double getInssBasisDiscount() {
    return inssBasisDiscount;
  }

  public void setInssBasisDiscount(Double inssBasisDiscount) {
    this.inssBasisDiscount = inssBasisDiscount;
  }

  public PurchaseEntity issRfRate(Double issRfRate) {
    this.issRfRate = issRfRate;
    return this;
  }

   /**
   * When Seller is Simples regime, the seller needs send RF rate.
   * @return issRfRate
  **/
  @ApiModelProperty(example = "null", value = "When Seller is Simples regime, the seller needs send RF rate.")
  public Double getIssRfRate() {
    return issRfRate;
  }

  public void setIssRfRate(Double issRfRate) {
    this.issRfRate = issRfRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PurchaseEntity purchaseEntity = (PurchaseEntity) o;
    return Objects.equals(this.name, purchaseEntity.name) &&
        Objects.equals(this.type, purchaseEntity.type) &&
        Objects.equals(this.email, purchaseEntity.email) &&
        Objects.equals(this.cnpjcpf, purchaseEntity.cnpjcpf) &&
        Objects.equals(this.cityTaxId, purchaseEntity.cityTaxId) &&
        Objects.equals(this.stateTaxId, purchaseEntity.stateTaxId) &&
        Objects.equals(this.suframa, purchaseEntity.suframa) &&
        Objects.equals(this.phone, purchaseEntity.phone) &&
        Objects.equals(this.taxRegime, purchaseEntity.taxRegime) &&
        Objects.equals(this.hasCpom, purchaseEntity.hasCpom) &&
        Objects.equals(this.subjectWithholdingIrrf, purchaseEntity.subjectWithholdingIrrf) &&
        Objects.equals(this.inssPreviousContrib, purchaseEntity.inssPreviousContrib) &&
        Objects.equals(this.inssBasisDiscount, purchaseEntity.inssBasisDiscount) &&
        Objects.equals(this.issRfRate, purchaseEntity.issRfRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, email, cnpjcpf, cityTaxId, stateTaxId, suframa, phone, taxRegime, hasCpom, subjectWithholdingIrrf, inssPreviousContrib, inssBasisDiscount, issRfRate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseEntity {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    cnpjcpf: ").append(toIndentedString(cnpjcpf)).append("\n");
    sb.append("    cityTaxId: ").append(toIndentedString(cityTaxId)).append("\n");
    sb.append("    stateTaxId: ").append(toIndentedString(stateTaxId)).append("\n");
    sb.append("    suframa: ").append(toIndentedString(suframa)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    taxRegime: ").append(toIndentedString(taxRegime)).append("\n");
    sb.append("    hasCpom: ").append(toIndentedString(hasCpom)).append("\n");
    sb.append("    subjectWithholdingIrrf: ").append(toIndentedString(subjectWithholdingIrrf)).append("\n");
    sb.append("    inssPreviousContrib: ").append(toIndentedString(inssPreviousContrib)).append("\n");
    sb.append("    inssBasisDiscount: ").append(toIndentedString(inssBasisDiscount)).append("\n");
    sb.append("    issRfRate: ").append(toIndentedString(issRfRate)).append("\n");
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

