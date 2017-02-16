package io.swagger.model;

import io.swagger.model.EntityType;
import io.swagger.model.FederalTaxRegime;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class SalesEntity  {
  
  @ApiModelProperty(example = "null", value = "SERVICE BUYER NAME OFFICIAL")
  private String name = null;
  @ApiModelProperty(example = "null", required = true, value = "")
  private EntityType type = null;
  @ApiModelProperty(example = "null", value = "Entity Email")
  private String email = null;
  @ApiModelProperty(example = "null", value = "CNPJ/CPF of Sales Buyer, if CPF pattern is '[0-9]{11}' if CNPJ pattern is '[0-9]{14}'")
  private String cnpjcpf = null;
  @ApiModelProperty(example = "null", value = "City Tax ID")
  private String cityTaxId = null;
  @ApiModelProperty(example = "null", value = "State Tax ID")
  private String stateTaxId = null;
  @ApiModelProperty(example = "null", value = "Suframa ID")
  private String suframa = null;
  @ApiModelProperty(example = "null", value = "Entity Phone")
  private String phone = null;
  @ApiModelProperty(example = "null", required = true, value = "")
  private FederalTaxRegime taxRegime = null;

@XmlType(name="SpecialTaxRegimeEnum")
@XmlEnum(String.class)
public enum SpecialTaxRegimeEnum {

    @XmlEnumValue("MEM") MEM(String.valueOf("MEM")), @XmlEnumValue("EST") EST(String.valueOf("EST")), @XmlEnumValue("SPR") SPR(String.valueOf("SPR")), @XmlEnumValue("COP") COP(String.valueOf("COP")), @XmlEnumValue("MEI") MEI(String.valueOf("MEI")), @XmlEnumValue("MPP") MPP(String.valueOf("MPP"));


    private String value;

    SpecialTaxRegimeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SpecialTaxRegimeEnum fromValue(String v) {
        for (SpecialTaxRegimeEnum b : SpecialTaxRegimeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "Entity Special Tax Regime  - 'MEM' # Microempresa municipal - 'EST' # Estimativa - 'SPR' # Sociedade de profissionais - 'COP' # Cooperativa - 'MEI' # Microempresário Individual (MEI) - 'MPP' # Microempresário e Empresa de Pequeno Porte (ME EPP) ")
  private SpecialTaxRegimeEnum specialTaxRegime = null;
  @ApiModelProperty(example = "null", value = "Companies subject to rule follow same rule of Government")
  private Boolean subjectToSRF1234 = null;
  @ApiModelProperty(example = "null", value = "If Withholding ISS is required, independently the rules applied.")
  private Boolean requiredWithholdingISS = null;
  @ApiModelProperty(example = "null", value = "technical note. Anota\\u00e7\\u00e3o de Responsabilidade T\\u00e9cnica-ART, estabelece que todos os contratos referentes à  execu\\u00e7\\u00e3o de servi\\u00e7os ou obras de Engenharia, Agronomia, Geologia, Geografia ou Meteorologia dever\\u00e3o ser objeto de anota\\u00e7\\u00e3o no Conselho Regional de Engenharia e Agronomia")
  private String art = null;
  @ApiModelProperty(example = "null", value = "PROCESS NUMBER TO ISS SUSPENDED FOR ADMINISTRATIVE PROCESS")
  private String adminProcess = null;
  @ApiModelProperty(example = "null", value = "Business code. Código da obra OBRA")
  private String buildCode = null;

 /**
   * SERVICE BUYER NAME OFFICIAL
   * @return name
  **/
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
 /**
   * Get type
   * @return type
  **/
  public EntityType getType() {
    return type;
  }
  public void setType(EntityType type) {
    this.type = type;
  }
 /**
   * Entity Email
   * @return email
  **/
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
 /**
   * CNPJ/CPF of Sales Buyer, if CPF pattern is '[0-9]{11}' if CNPJ pattern is '[0-9]{14}'
   * @return cnpjcpf
  **/
  public String getCnpjcpf() {
    return cnpjcpf;
  }
  public void setCnpjcpf(String cnpjcpf) {
    this.cnpjcpf = cnpjcpf;
  }
 /**
   * City Tax ID
   * @return cityTaxId
  **/
  public String getCityTaxId() {
    return cityTaxId;
  }
  public void setCityTaxId(String cityTaxId) {
    this.cityTaxId = cityTaxId;
  }
 /**
   * State Tax ID
   * @return stateTaxId
  **/
  public String getStateTaxId() {
    return stateTaxId;
  }
  public void setStateTaxId(String stateTaxId) {
    this.stateTaxId = stateTaxId;
  }
 /**
   * Suframa ID
   * @return suframa
  **/
  public String getSuframa() {
    return suframa;
  }
  public void setSuframa(String suframa) {
    this.suframa = suframa;
  }
 /**
   * Entity Phone
   * @return phone
  **/
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }
 /**
   * Get taxRegime
   * @return taxRegime
  **/
  public FederalTaxRegime getTaxRegime() {
    return taxRegime;
  }
  public void setTaxRegime(FederalTaxRegime taxRegime) {
    this.taxRegime = taxRegime;
  }
 /**
   * Entity Special Tax Regime  - 'MEM' # Microempresa municipal - 'EST' # Estimativa - 'SPR' # Sociedade de profissionais - 'COP' # Cooperativa - 'MEI' # Microempresário Individual (MEI) - 'MPP' # Microempresário e Empresa de Pequeno Porte (ME EPP) 
   * @return specialTaxRegime
  **/
  public SpecialTaxRegimeEnum getSpecialTaxRegime() {
    return specialTaxRegime;
  }
  public void setSpecialTaxRegime(SpecialTaxRegimeEnum specialTaxRegime) {
    this.specialTaxRegime = specialTaxRegime;
  }
 /**
   * Companies subject to rule follow same rule of Government
   * @return subjectToSRF1234
  **/
  public Boolean getSubjectToSRF1234() {
    return subjectToSRF1234;
  }
  public void setSubjectToSRF1234(Boolean subjectToSRF1234) {
    this.subjectToSRF1234 = subjectToSRF1234;
  }
 /**
   * If Withholding ISS is required, independently the rules applied.
   * @return requiredWithholdingISS
  **/
  public Boolean getRequiredWithholdingISS() {
    return requiredWithholdingISS;
  }
  public void setRequiredWithholdingISS(Boolean requiredWithholdingISS) {
    this.requiredWithholdingISS = requiredWithholdingISS;
  }
 /**
   * technical note. Anota\\u00e7\\u00e3o de Responsabilidade T\\u00e9cnica-ART, estabelece que todos os contratos referentes à  execu\\u00e7\\u00e3o de servi\\u00e7os ou obras de Engenharia, Agronomia, Geologia, Geografia ou Meteorologia dever\\u00e3o ser objeto de anota\\u00e7\\u00e3o no Conselho Regional de Engenharia e Agronomia
   * @return art
  **/
  public String getArt() {
    return art;
  }
  public void setArt(String art) {
    this.art = art;
  }
 /**
   * PROCESS NUMBER TO ISS SUSPENDED FOR ADMINISTRATIVE PROCESS
   * @return adminProcess
  **/
  public String getAdminProcess() {
    return adminProcess;
  }
  public void setAdminProcess(String adminProcess) {
    this.adminProcess = adminProcess;
  }
 /**
   * Business code. Código da obra OBRA
   * @return buildCode
  **/
  public String getBuildCode() {
    return buildCode;
  }
  public void setBuildCode(String buildCode) {
    this.buildCode = buildCode;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

