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

import io.swagger.client.model.Entity;
import io.swagger.client.model.EntityType;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class EntityForGoods {
  
  @SerializedName("name")
  private String name = null;
  public enum RoleEnum {
     transporter,  sender,  dispatcher,  receiver,  addressee,  other, 
  };
  @SerializedName("role")
  private RoleEnum role = null;
  @SerializedName("type")
  private EntityType type = null;
  @SerializedName("federalTaxId")
  private String federalTaxId = null;
  @SerializedName("cityTaxId")
  private String cityTaxId = null;
  @SerializedName("stateTaxId")
  private String stateTaxId = null;
  @SerializedName("suframa")
  private String suframa = null;
  @SerializedName("phone")
  private String phone = null;
  public enum TaxRegimeEnum {
     realProfit,  estimatedProfit,  simplified,  simplifiedOverGrossthreshold,  simplifiedEntrepreneur,  notApplicable,  individual, 
  };
  @SerializedName("taxRegime")
  private TaxRegimeEnum taxRegime = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("subjectToSRF1234")
  private Boolean subjectToSRF1234 = null;
  @SerializedName("icmsTaxPayer")
  private Boolean icmsTaxPayer = null;

  /**
   * Entity name, official name (Razão Social)
   **/
  @ApiModelProperty(value = "Entity name, official name (Razão Social)")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * - 'transporter' - 'sender' # REMETENTE - 'dispatcher' # EXPEDITOR - 'receiver' # RECEIVER - 'addressee' # DESTINATÁRIO - 'other' # OUTRO 
   **/
  @ApiModelProperty(value = "- 'transporter' - 'sender' # REMETENTE - 'dispatcher' # EXPEDITOR - 'receiver' # RECEIVER - 'addressee' # DESTINATÁRIO - 'other' # OUTRO ")
  public RoleEnum getRole() {
    return role;
  }
  public void setRole(RoleEnum role) {
    this.role = role;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EntityType getType() {
    return type;
  }
  public void setType(EntityType type) {
    this.type = type;
  }

  /**
   * CNPJ/CPF of Sales Buyer, if CPF pattern is '[0-9]{11}' if CNPJ pattern is '[0-9]{14}'
   **/
  @ApiModelProperty(required = true, value = "CNPJ/CPF of Sales Buyer, if CPF pattern is '[0-9]{11}' if CNPJ pattern is '[0-9]{14}'")
  public String getFederalTaxId() {
    return federalTaxId;
  }
  public void setFederalTaxId(String federalTaxId) {
    this.federalTaxId = federalTaxId;
  }

  /**
   * City Tax ID
   **/
  @ApiModelProperty(value = "City Tax ID")
  public String getCityTaxId() {
    return cityTaxId;
  }
  public void setCityTaxId(String cityTaxId) {
    this.cityTaxId = cityTaxId;
  }

  /**
   * State Tax ID
   **/
  @ApiModelProperty(value = "State Tax ID")
  public String getStateTaxId() {
    return stateTaxId;
  }
  public void setStateTaxId(String stateTaxId) {
    this.stateTaxId = stateTaxId;
  }

  /**
   * Suframa ID
   **/
  @ApiModelProperty(value = "Suframa ID")
  public String getSuframa() {
    return suframa;
  }
  public void setSuframa(String suframa) {
    this.suframa = suframa;
  }

  /**
   * Entity Phone
   **/
  @ApiModelProperty(value = "Entity Phone")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TaxRegimeEnum getTaxRegime() {
    return taxRegime;
  }
  public void setTaxRegime(TaxRegimeEnum taxRegime) {
    this.taxRegime = taxRegime;
  }

  /**
   * Entity Email
   **/
  @ApiModelProperty(value = "Entity Email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Companies subject to follow same rules of Government entities (Instrução Normativa: SRF1234)
   **/
  @ApiModelProperty(value = "Companies subject to follow same rules of Government entities (Instrução Normativa: SRF1234)")
  public Boolean getSubjectToSRF1234() {
    return subjectToSRF1234;
  }
  public void setSubjectToSRF1234(Boolean subjectToSRF1234) {
    this.subjectToSRF1234 = subjectToSRF1234;
  }

  /**
   * Inform if the entity is ICMS tax payer.
   **/
  @ApiModelProperty(value = "Inform if the entity is ICMS tax payer.")
  public Boolean getIcmsTaxPayer() {
    return icmsTaxPayer;
  }
  public void setIcmsTaxPayer(Boolean icmsTaxPayer) {
    this.icmsTaxPayer = icmsTaxPayer;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityForGoods entityForGoods = (EntityForGoods) o;
    return (this.name == null ? entityForGoods.name == null : this.name.equals(entityForGoods.name)) &&
        (this.role == null ? entityForGoods.role == null : this.role.equals(entityForGoods.role)) &&
        (this.type == null ? entityForGoods.type == null : this.type.equals(entityForGoods.type)) &&
        (this.federalTaxId == null ? entityForGoods.federalTaxId == null : this.federalTaxId.equals(entityForGoods.federalTaxId)) &&
        (this.cityTaxId == null ? entityForGoods.cityTaxId == null : this.cityTaxId.equals(entityForGoods.cityTaxId)) &&
        (this.stateTaxId == null ? entityForGoods.stateTaxId == null : this.stateTaxId.equals(entityForGoods.stateTaxId)) &&
        (this.suframa == null ? entityForGoods.suframa == null : this.suframa.equals(entityForGoods.suframa)) &&
        (this.phone == null ? entityForGoods.phone == null : this.phone.equals(entityForGoods.phone)) &&
        (this.taxRegime == null ? entityForGoods.taxRegime == null : this.taxRegime.equals(entityForGoods.taxRegime)) &&
        (this.email == null ? entityForGoods.email == null : this.email.equals(entityForGoods.email)) &&
        (this.subjectToSRF1234 == null ? entityForGoods.subjectToSRF1234 == null : this.subjectToSRF1234.equals(entityForGoods.subjectToSRF1234)) &&
        (this.icmsTaxPayer == null ? entityForGoods.icmsTaxPayer == null : this.icmsTaxPayer.equals(entityForGoods.icmsTaxPayer));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.role == null ? 0: this.role.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.federalTaxId == null ? 0: this.federalTaxId.hashCode());
    result = 31 * result + (this.cityTaxId == null ? 0: this.cityTaxId.hashCode());
    result = 31 * result + (this.stateTaxId == null ? 0: this.stateTaxId.hashCode());
    result = 31 * result + (this.suframa == null ? 0: this.suframa.hashCode());
    result = 31 * result + (this.phone == null ? 0: this.phone.hashCode());
    result = 31 * result + (this.taxRegime == null ? 0: this.taxRegime.hashCode());
    result = 31 * result + (this.email == null ? 0: this.email.hashCode());
    result = 31 * result + (this.subjectToSRF1234 == null ? 0: this.subjectToSRF1234.hashCode());
    result = 31 * result + (this.icmsTaxPayer == null ? 0: this.icmsTaxPayer.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityForGoods {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  role: ").append(role).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  federalTaxId: ").append(federalTaxId).append("\n");
    sb.append("  cityTaxId: ").append(cityTaxId).append("\n");
    sb.append("  stateTaxId: ").append(stateTaxId).append("\n");
    sb.append("  suframa: ").append(suframa).append("\n");
    sb.append("  phone: ").append(phone).append("\n");
    sb.append("  taxRegime: ").append(taxRegime).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  subjectToSRF1234: ").append(subjectToSRF1234).append("\n");
    sb.append("  icmsTaxPayer: ").append(icmsTaxPayer).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
