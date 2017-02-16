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

public class PurchaseEntity  {
  
  @ApiModelProperty(example = "null", value = "Legal Name of Service buyer.")
  private String name = null;
  @ApiModelProperty(example = "null", value = "")
  private EntityType type = null;
  @ApiModelProperty(example = "null", value = "Entity Email")
  private String email = null;
  @ApiModelProperty(example = "null", value = "CNPJ/CPF of Sales Buyer. If CPF, pattern is '[0-9]{11}' if CNPJ, pattern is '[0-9]{14}'")
  private String cnpjcpf = null;
  @ApiModelProperty(example = "null", value = "City Tax ID")
  private String cityTaxId = null;
  @ApiModelProperty(example = "null", value = "State Tax ID")
  private String stateTaxId = null;
  @ApiModelProperty(example = "null", value = "Suframa ID")
  private String suframa = null;
  @ApiModelProperty(example = "null", value = "Entity Phone")
  private String phone = null;
  @ApiModelProperty(example = "null", value = "")
  private FederalTaxRegime taxRegime = null;
  @ApiModelProperty(example = "null", value = "Some cities require PURCHASE.Buyers to withhold ISS (City Tax) from PURCHASE.Sellers stablished in different cities. In case the PURCHASE.Seller has acquired a Tax Registration in this destination city, by providing this information in the service invoice, this withholding obligation is lifted.")
  private Boolean hasCpom = null;
  @ApiModelProperty(example = "null", value = "These are the federal taxes attributes that determine whether withholding of taxes should take place. In special cases where the PURCHASE.Seller is exempt of one or more of these taxes the withholding follows the same rules. The Business type may also dictate these rules as well.")
  private Boolean subjectWithholdingIrrf = null;
  @ApiModelProperty(example = "null", value = "The INSS contribution is capped at a maximum limit (amount of actual retired payment available in the country).  Individuals sellers subject to INSS withholding can provide the amount already tax by other transactions (with the same buyer or different ones) to deduct to the tax basis. This amount is to be provided to the Seller in a form of a signed document.")
  private Double inssPreviousContrib = null;
  @ApiModelProperty(example = "null", value = "The INSS contribution is applicable only to the labor amount in a service contract.  There are several items that may be deducted from the service invoice total to arrive at the INSS taxable amount. This amount is to be provided to the Seller in the body of the Invoice or calculated during the transaction input.")
  private Double inssBasisDiscount = null;
  @ApiModelProperty(example = "null", value = "When Seller is Simples regime, the seller needs send RF rate.")
  private Double issRfRate = null;

 /**
   * Legal Name of Service buyer.
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
   * CNPJ/CPF of Sales Buyer. If CPF, pattern is '[0-9]{11}' if CNPJ, pattern is '[0-9]{14}'
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
   * Some cities require PURCHASE.Buyers to withhold ISS (City Tax) from PURCHASE.Sellers stablished in different cities. In case the PURCHASE.Seller has acquired a Tax Registration in this destination city, by providing this information in the service invoice, this withholding obligation is lifted.
   * @return hasCpom
  **/
  public Boolean getHasCpom() {
    return hasCpom;
  }
  public void setHasCpom(Boolean hasCpom) {
    this.hasCpom = hasCpom;
  }
 /**
   * These are the federal taxes attributes that determine whether withholding of taxes should take place. In special cases where the PURCHASE.Seller is exempt of one or more of these taxes the withholding follows the same rules. The Business type may also dictate these rules as well.
   * @return subjectWithholdingIrrf
  **/
  public Boolean getSubjectWithholdingIrrf() {
    return subjectWithholdingIrrf;
  }
  public void setSubjectWithholdingIrrf(Boolean subjectWithholdingIrrf) {
    this.subjectWithholdingIrrf = subjectWithholdingIrrf;
  }
 /**
   * The INSS contribution is capped at a maximum limit (amount of actual retired payment available in the country).  Individuals sellers subject to INSS withholding can provide the amount already tax by other transactions (with the same buyer or different ones) to deduct to the tax basis. This amount is to be provided to the Seller in a form of a signed document.
   * @return inssPreviousContrib
  **/
  public Double getInssPreviousContrib() {
    return inssPreviousContrib;
  }
  public void setInssPreviousContrib(Double inssPreviousContrib) {
    this.inssPreviousContrib = inssPreviousContrib;
  }
 /**
   * The INSS contribution is applicable only to the labor amount in a service contract.  There are several items that may be deducted from the service invoice total to arrive at the INSS taxable amount. This amount is to be provided to the Seller in the body of the Invoice or calculated during the transaction input.
   * @return inssBasisDiscount
  **/
  public Double getInssBasisDiscount() {
    return inssBasisDiscount;
  }
  public void setInssBasisDiscount(Double inssBasisDiscount) {
    this.inssBasisDiscount = inssBasisDiscount;
  }
 /**
   * When Seller is Simples regime, the seller needs send RF rate.
   * @return issRfRate
  **/
  public Double getIssRfRate() {
    return issRfRate;
  }
  public void setIssRfRate(Double issRfRate) {
    this.issRfRate = issRfRate;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

