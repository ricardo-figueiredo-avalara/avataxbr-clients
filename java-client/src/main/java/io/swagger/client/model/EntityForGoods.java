/*
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

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Entity;
import io.swagger.client.model.EntityType;

/**
 * EntityForGoods
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-16T18:26:15.214Z")
public class EntityForGoods {
  @SerializedName("name")
  private String name = null;

  /**
   * - 'transporter' - 'sender' # REMETENTE - 'dispatcher' # EXPEDITOR - 'receiver' # RECEIVER - 'addressee' # DESTINATÁRIO - 'other' # OUTRO 
   */
  public enum RoleEnum {
    @SerializedName("transporter")
    TRANSPORTER("transporter"),
    
    @SerializedName("sender")
    SENDER("sender"),
    
    @SerializedName("dispatcher")
    DISPATCHER("dispatcher"),
    
    @SerializedName("receiver")
    RECEIVER("receiver"),
    
    @SerializedName("addressee")
    ADDRESSEE("addressee"),
    
    @SerializedName("other")
    OTHER("other");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

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

  /**
   * Gets or Sets taxRegime
   */
  public enum TaxRegimeEnum {
    @SerializedName("realProfit")
    REALPROFIT("realProfit"),
    
    @SerializedName("estimatedProfit")
    ESTIMATEDPROFIT("estimatedProfit"),
    
    @SerializedName("simplified")
    SIMPLIFIED("simplified"),
    
    @SerializedName("simplifiedOverGrossthreshold")
    SIMPLIFIEDOVERGROSSTHRESHOLD("simplifiedOverGrossthreshold"),
    
    @SerializedName("simplifiedEntrepreneur")
    SIMPLIFIEDENTREPRENEUR("simplifiedEntrepreneur"),
    
    @SerializedName("notApplicable")
    NOTAPPLICABLE("notApplicable"),
    
    @SerializedName("individual")
    INDIVIDUAL("individual");

    private String value;

    TaxRegimeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("taxRegime")
  private TaxRegimeEnum taxRegime = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("subjectToSRF1234")
  private Boolean subjectToSRF1234 = null;

  @SerializedName("icmsTaxPayer")
  private Boolean icmsTaxPayer = null;

  public EntityForGoods name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Entity name, official name (Razão Social)
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Entity name, official name (Razão Social)")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EntityForGoods role(RoleEnum role) {
    this.role = role;
    return this;
  }

   /**
   * - 'transporter' - 'sender' # REMETENTE - 'dispatcher' # EXPEDITOR - 'receiver' # RECEIVER - 'addressee' # DESTINATÁRIO - 'other' # OUTRO 
   * @return role
  **/
  @ApiModelProperty(example = "null", value = "- 'transporter' - 'sender' # REMETENTE - 'dispatcher' # EXPEDITOR - 'receiver' # RECEIVER - 'addressee' # DESTINATÁRIO - 'other' # OUTRO ")
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public EntityForGoods type(EntityType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public EntityType getType() {
    return type;
  }

  public void setType(EntityType type) {
    this.type = type;
  }

  public EntityForGoods federalTaxId(String federalTaxId) {
    this.federalTaxId = federalTaxId;
    return this;
  }

   /**
   * CNPJ/CPF of Sales Buyer, if CPF pattern is '[0-9]{11}' if CNPJ pattern is '[0-9]{14}'
   * @return federalTaxId
  **/
  @ApiModelProperty(example = "null", required = true, value = "CNPJ/CPF of Sales Buyer, if CPF pattern is '[0-9]{11}' if CNPJ pattern is '[0-9]{14}'")
  public String getFederalTaxId() {
    return federalTaxId;
  }

  public void setFederalTaxId(String federalTaxId) {
    this.federalTaxId = federalTaxId;
  }

  public EntityForGoods cityTaxId(String cityTaxId) {
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

  public EntityForGoods stateTaxId(String stateTaxId) {
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

  public EntityForGoods suframa(String suframa) {
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

  public EntityForGoods phone(String phone) {
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

  public EntityForGoods taxRegime(TaxRegimeEnum taxRegime) {
    this.taxRegime = taxRegime;
    return this;
  }

   /**
   * Get taxRegime
   * @return taxRegime
  **/
  @ApiModelProperty(example = "null", value = "")
  public TaxRegimeEnum getTaxRegime() {
    return taxRegime;
  }

  public void setTaxRegime(TaxRegimeEnum taxRegime) {
    this.taxRegime = taxRegime;
  }

  public EntityForGoods email(String email) {
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

  public EntityForGoods subjectToSRF1234(Boolean subjectToSRF1234) {
    this.subjectToSRF1234 = subjectToSRF1234;
    return this;
  }

   /**
   * Companies subject to follow same rules of Government entities (Instrução Normativa: SRF1234)
   * @return subjectToSRF1234
  **/
  @ApiModelProperty(example = "null", value = "Companies subject to follow same rules of Government entities (Instrução Normativa: SRF1234)")
  public Boolean getSubjectToSRF1234() {
    return subjectToSRF1234;
  }

  public void setSubjectToSRF1234(Boolean subjectToSRF1234) {
    this.subjectToSRF1234 = subjectToSRF1234;
  }

  public EntityForGoods icmsTaxPayer(Boolean icmsTaxPayer) {
    this.icmsTaxPayer = icmsTaxPayer;
    return this;
  }

   /**
   * Inform if the entity is ICMS tax payer.
   * @return icmsTaxPayer
  **/
  @ApiModelProperty(example = "null", value = "Inform if the entity is ICMS tax payer.")
  public Boolean getIcmsTaxPayer() {
    return icmsTaxPayer;
  }

  public void setIcmsTaxPayer(Boolean icmsTaxPayer) {
    this.icmsTaxPayer = icmsTaxPayer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityForGoods entityForGoods = (EntityForGoods) o;
    return Objects.equals(this.name, entityForGoods.name) &&
        Objects.equals(this.role, entityForGoods.role) &&
        Objects.equals(this.type, entityForGoods.type) &&
        Objects.equals(this.federalTaxId, entityForGoods.federalTaxId) &&
        Objects.equals(this.cityTaxId, entityForGoods.cityTaxId) &&
        Objects.equals(this.stateTaxId, entityForGoods.stateTaxId) &&
        Objects.equals(this.suframa, entityForGoods.suframa) &&
        Objects.equals(this.phone, entityForGoods.phone) &&
        Objects.equals(this.taxRegime, entityForGoods.taxRegime) &&
        Objects.equals(this.email, entityForGoods.email) &&
        Objects.equals(this.subjectToSRF1234, entityForGoods.subjectToSRF1234) &&
        Objects.equals(this.icmsTaxPayer, entityForGoods.icmsTaxPayer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, role, type, federalTaxId, cityTaxId, stateTaxId, suframa, phone, taxRegime, email, subjectToSRF1234, icmsTaxPayer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityForGoods {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    federalTaxId: ").append(toIndentedString(federalTaxId)).append("\n");
    sb.append("    cityTaxId: ").append(toIndentedString(cityTaxId)).append("\n");
    sb.append("    stateTaxId: ").append(toIndentedString(stateTaxId)).append("\n");
    sb.append("    suframa: ").append(toIndentedString(suframa)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    taxRegime: ").append(toIndentedString(taxRegime)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    subjectToSRF1234: ").append(toIndentedString(subjectToSRF1234)).append("\n");
    sb.append("    icmsTaxPayer: ").append(toIndentedString(icmsTaxPayer)).append("\n");
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

