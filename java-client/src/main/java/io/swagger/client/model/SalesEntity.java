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
 * SalesEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-06T17:54:07.550Z")
public class SalesEntity {
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

  /**
   * Entity Special Tax Regime  - 'MEM' # Microempresa municipal - 'EST' # Estimativa - 'SPR' # Sociedade de profissionais - 'COP' # Cooperativa - 'MEI' # Microempresário Individual (MEI) - 'MPP' # Microempresário e Empresa de Pequeno Porte (ME EPP) 
   */
  public enum SpecialTaxRegimeEnum {
    @SerializedName("MEM")
    MEM("MEM"),
    
    @SerializedName("EST")
    EST("EST"),
    
    @SerializedName("SPR")
    SPR("SPR"),
    
    @SerializedName("COP")
    COP("COP"),
    
    @SerializedName("MEI")
    MEI("MEI"),
    
    @SerializedName("MPP")
    MPP("MPP");

    private String value;

    SpecialTaxRegimeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("specialTaxRegime")
  private SpecialTaxRegimeEnum specialTaxRegime = null;

  @SerializedName("subjectToSRF1234")
  private Boolean subjectToSRF1234 = null;

  @SerializedName("requiredWithholdingISS")
  private Boolean requiredWithholdingISS = null;

  @SerializedName("art")
  private String art = null;

  @SerializedName("adminProcess")
  private String adminProcess = null;

  @SerializedName("buildCode")
  private String buildCode = null;

  public SalesEntity name(String name) {
    this.name = name;
    return this;
  }

   /**
   * SERVICE BUYER NAME OFFICIAL
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "SERVICE BUYER NAME OFFICIAL")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SalesEntity type(EntityType type) {
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

  public SalesEntity email(String email) {
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

  public SalesEntity cnpjcpf(String cnpjcpf) {
    this.cnpjcpf = cnpjcpf;
    return this;
  }

   /**
   * CNPJ/CPF of Sales Buyer, if CPF pattern is '[0-9]{11}' if CNPJ pattern is '[0-9]{14}'
   * @return cnpjcpf
  **/
  @ApiModelProperty(example = "null", value = "CNPJ/CPF of Sales Buyer, if CPF pattern is '[0-9]{11}' if CNPJ pattern is '[0-9]{14}'")
  public String getCnpjcpf() {
    return cnpjcpf;
  }

  public void setCnpjcpf(String cnpjcpf) {
    this.cnpjcpf = cnpjcpf;
  }

  public SalesEntity cityTaxId(String cityTaxId) {
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

  public SalesEntity stateTaxId(String stateTaxId) {
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

  public SalesEntity suframa(String suframa) {
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

  public SalesEntity phone(String phone) {
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

  public SalesEntity taxRegime(FederalTaxRegime taxRegime) {
    this.taxRegime = taxRegime;
    return this;
  }

   /**
   * Get taxRegime
   * @return taxRegime
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public FederalTaxRegime getTaxRegime() {
    return taxRegime;
  }

  public void setTaxRegime(FederalTaxRegime taxRegime) {
    this.taxRegime = taxRegime;
  }

  public SalesEntity specialTaxRegime(SpecialTaxRegimeEnum specialTaxRegime) {
    this.specialTaxRegime = specialTaxRegime;
    return this;
  }

   /**
   * Entity Special Tax Regime  - 'MEM' # Microempresa municipal - 'EST' # Estimativa - 'SPR' # Sociedade de profissionais - 'COP' # Cooperativa - 'MEI' # Microempresário Individual (MEI) - 'MPP' # Microempresário e Empresa de Pequeno Porte (ME EPP) 
   * @return specialTaxRegime
  **/
  @ApiModelProperty(example = "null", value = "Entity Special Tax Regime  - 'MEM' # Microempresa municipal - 'EST' # Estimativa - 'SPR' # Sociedade de profissionais - 'COP' # Cooperativa - 'MEI' # Microempresário Individual (MEI) - 'MPP' # Microempresário e Empresa de Pequeno Porte (ME EPP) ")
  public SpecialTaxRegimeEnum getSpecialTaxRegime() {
    return specialTaxRegime;
  }

  public void setSpecialTaxRegime(SpecialTaxRegimeEnum specialTaxRegime) {
    this.specialTaxRegime = specialTaxRegime;
  }

  public SalesEntity subjectToSRF1234(Boolean subjectToSRF1234) {
    this.subjectToSRF1234 = subjectToSRF1234;
    return this;
  }

   /**
   * Companies subject to rule follow same rule of Government
   * @return subjectToSRF1234
  **/
  @ApiModelProperty(example = "null", value = "Companies subject to rule follow same rule of Government")
  public Boolean getSubjectToSRF1234() {
    return subjectToSRF1234;
  }

  public void setSubjectToSRF1234(Boolean subjectToSRF1234) {
    this.subjectToSRF1234 = subjectToSRF1234;
  }

  public SalesEntity requiredWithholdingISS(Boolean requiredWithholdingISS) {
    this.requiredWithholdingISS = requiredWithholdingISS;
    return this;
  }

   /**
   * If Withholding ISS is required, independently the rules applied.
   * @return requiredWithholdingISS
  **/
  @ApiModelProperty(example = "null", value = "If Withholding ISS is required, independently the rules applied.")
  public Boolean getRequiredWithholdingISS() {
    return requiredWithholdingISS;
  }

  public void setRequiredWithholdingISS(Boolean requiredWithholdingISS) {
    this.requiredWithholdingISS = requiredWithholdingISS;
  }

  public SalesEntity art(String art) {
    this.art = art;
    return this;
  }

   /**
   * technical note. Anota\\u00e7\\u00e3o de Responsabilidade T\\u00e9cnica-ART, estabelece que todos os contratos referentes à  execu\\u00e7\\u00e3o de servi\\u00e7os ou obras de Engenharia, Agronomia, Geologia, Geografia ou Meteorologia dever\\u00e3o ser objeto de anota\\u00e7\\u00e3o no Conselho Regional de Engenharia e Agronomia
   * @return art
  **/
  @ApiModelProperty(example = "null", value = "technical note. Anota\\u00e7\\u00e3o de Responsabilidade T\\u00e9cnica-ART, estabelece que todos os contratos referentes à  execu\\u00e7\\u00e3o de servi\\u00e7os ou obras de Engenharia, Agronomia, Geologia, Geografia ou Meteorologia dever\\u00e3o ser objeto de anota\\u00e7\\u00e3o no Conselho Regional de Engenharia e Agronomia")
  public String getArt() {
    return art;
  }

  public void setArt(String art) {
    this.art = art;
  }

  public SalesEntity adminProcess(String adminProcess) {
    this.adminProcess = adminProcess;
    return this;
  }

   /**
   * PROCESS NUMBER TO ISS SUSPENDED FOR ADMINISTRATIVE PROCESS
   * @return adminProcess
  **/
  @ApiModelProperty(example = "null", value = "PROCESS NUMBER TO ISS SUSPENDED FOR ADMINISTRATIVE PROCESS")
  public String getAdminProcess() {
    return adminProcess;
  }

  public void setAdminProcess(String adminProcess) {
    this.adminProcess = adminProcess;
  }

  public SalesEntity buildCode(String buildCode) {
    this.buildCode = buildCode;
    return this;
  }

   /**
   * Business code. Código da obra OBRA
   * @return buildCode
  **/
  @ApiModelProperty(example = "null", value = "Business code. Código da obra OBRA")
  public String getBuildCode() {
    return buildCode;
  }

  public void setBuildCode(String buildCode) {
    this.buildCode = buildCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SalesEntity salesEntity = (SalesEntity) o;
    return Objects.equals(this.name, salesEntity.name) &&
        Objects.equals(this.type, salesEntity.type) &&
        Objects.equals(this.email, salesEntity.email) &&
        Objects.equals(this.cnpjcpf, salesEntity.cnpjcpf) &&
        Objects.equals(this.cityTaxId, salesEntity.cityTaxId) &&
        Objects.equals(this.stateTaxId, salesEntity.stateTaxId) &&
        Objects.equals(this.suframa, salesEntity.suframa) &&
        Objects.equals(this.phone, salesEntity.phone) &&
        Objects.equals(this.taxRegime, salesEntity.taxRegime) &&
        Objects.equals(this.specialTaxRegime, salesEntity.specialTaxRegime) &&
        Objects.equals(this.subjectToSRF1234, salesEntity.subjectToSRF1234) &&
        Objects.equals(this.requiredWithholdingISS, salesEntity.requiredWithholdingISS) &&
        Objects.equals(this.art, salesEntity.art) &&
        Objects.equals(this.adminProcess, salesEntity.adminProcess) &&
        Objects.equals(this.buildCode, salesEntity.buildCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, email, cnpjcpf, cityTaxId, stateTaxId, suframa, phone, taxRegime, specialTaxRegime, subjectToSRF1234, requiredWithholdingISS, art, adminProcess, buildCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesEntity {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    cnpjcpf: ").append(toIndentedString(cnpjcpf)).append("\n");
    sb.append("    cityTaxId: ").append(toIndentedString(cityTaxId)).append("\n");
    sb.append("    stateTaxId: ").append(toIndentedString(stateTaxId)).append("\n");
    sb.append("    suframa: ").append(toIndentedString(suframa)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    taxRegime: ").append(toIndentedString(taxRegime)).append("\n");
    sb.append("    specialTaxRegime: ").append(toIndentedString(specialTaxRegime)).append("\n");
    sb.append("    subjectToSRF1234: ").append(toIndentedString(subjectToSRF1234)).append("\n");
    sb.append("    requiredWithholdingISS: ").append(toIndentedString(requiredWithholdingISS)).append("\n");
    sb.append("    art: ").append(toIndentedString(art)).append("\n");
    sb.append("    adminProcess: ").append(toIndentedString(adminProcess)).append("\n");
    sb.append("    buildCode: ").append(toIndentedString(buildCode)).append("\n");
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

