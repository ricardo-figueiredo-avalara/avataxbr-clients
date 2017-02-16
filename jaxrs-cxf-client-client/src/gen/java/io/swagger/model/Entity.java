package io.swagger.model;

import io.swagger.model.EntityType;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class Entity  {
  
  @ApiModelProperty(example = "null", value = "Entity name, official name (Razão Social)")
  private String name = null;

@XmlType(name="RoleEnum")
@XmlEnum(String.class)
public enum RoleEnum {

    @XmlEnumValue("transporter") TRANSPORTER(String.valueOf("transporter")), @XmlEnumValue("sender") SENDER(String.valueOf("sender")), @XmlEnumValue("dispatcher") DISPATCHER(String.valueOf("dispatcher")), @XmlEnumValue("receiver") RECEIVER(String.valueOf("receiver")), @XmlEnumValue("addressee") ADDRESSEE(String.valueOf("addressee")), @XmlEnumValue("other") OTHER(String.valueOf("other"));


    private String value;

    RoleEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static RoleEnum fromValue(String v) {
        for (RoleEnum b : RoleEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "- 'transporter' - 'sender' # REMETENTE - 'dispatcher' # EXPEDITOR - 'receiver' # RECEIVER - 'addressee' # DESTINATÁRIO - 'other' # OUTRO ")
  private RoleEnum role = null;
  @ApiModelProperty(example = "null", required = true, value = "")
  private EntityType type = null;
  @ApiModelProperty(example = "null", required = true, value = "CNPJ/CPF of Sales Buyer, if CPF pattern is '[0-9]{11}' if CNPJ pattern is '[0-9]{14}'")
  private String federalTaxId = null;
  @ApiModelProperty(example = "null", value = "City Tax ID")
  private String cityTaxId = null;
  @ApiModelProperty(example = "null", value = "State Tax ID")
  private String stateTaxId = null;
  @ApiModelProperty(example = "null", value = "Suframa ID")
  private String suframa = null;
  @ApiModelProperty(example = "null", value = "Entity Phone")
  private String phone = null;

@XmlType(name="TaxRegimeEnum")
@XmlEnum(String.class)
public enum TaxRegimeEnum {

    @XmlEnumValue("realProfit") REALPROFIT(String.valueOf("realProfit")), @XmlEnumValue("estimatedProfit") ESTIMATEDPROFIT(String.valueOf("estimatedProfit")), @XmlEnumValue("simplified") SIMPLIFIED(String.valueOf("simplified")), @XmlEnumValue("simplifiedOverGrossthreshold") SIMPLIFIEDOVERGROSSTHRESHOLD(String.valueOf("simplifiedOverGrossthreshold")), @XmlEnumValue("simplifiedEntrepreneur") SIMPLIFIEDENTREPRENEUR(String.valueOf("simplifiedEntrepreneur")), @XmlEnumValue("notApplicable") NOTAPPLICABLE(String.valueOf("notApplicable")), @XmlEnumValue("individual") INDIVIDUAL(String.valueOf("individual"));


    private String value;

    TaxRegimeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TaxRegimeEnum fromValue(String v) {
        for (TaxRegimeEnum b : TaxRegimeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "")
  private TaxRegimeEnum taxRegime = null;
  @ApiModelProperty(example = "null", value = "Entity Email")
  private String email = null;
  @ApiModelProperty(example = "null", value = "Companies subject to follow same rules of Government entities (Instrução Normativa: SRF1234)")
  private Boolean subjectToSRF1234 = null;

 /**
   * Entity name, official name (Razão Social)
   * @return name
  **/
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
 /**
   * - 'transporter' - 'sender' # REMETENTE - 'dispatcher' # EXPEDITOR - 'receiver' # RECEIVER - 'addressee' # DESTINATÁRIO - 'other' # OUTRO 
   * @return role
  **/
  public RoleEnum getRole() {
    return role;
  }
  public void setRole(RoleEnum role) {
    this.role = role;
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
   * CNPJ/CPF of Sales Buyer, if CPF pattern is '[0-9]{11}' if CNPJ pattern is '[0-9]{14}'
   * @return federalTaxId
  **/
  public String getFederalTaxId() {
    return federalTaxId;
  }
  public void setFederalTaxId(String federalTaxId) {
    this.federalTaxId = federalTaxId;
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
  public TaxRegimeEnum getTaxRegime() {
    return taxRegime;
  }
  public void setTaxRegime(TaxRegimeEnum taxRegime) {
    this.taxRegime = taxRegime;
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
   * Companies subject to follow same rules of Government entities (Instrução Normativa: SRF1234)
   * @return subjectToSRF1234
  **/
  public Boolean getSubjectToSRF1234() {
    return subjectToSRF1234;
  }
  public void setSubjectToSRF1234(Boolean subjectToSRF1234) {
    this.subjectToSRF1234 = subjectToSRF1234;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Entity {\n");
    
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

