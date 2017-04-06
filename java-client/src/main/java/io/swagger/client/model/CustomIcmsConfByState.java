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
import io.swagger.client.model.IcmsConfByState;
import io.swagger.client.model.IcmsConfByStateIcmsSTConf;
import io.swagger.client.model.IcmsConfInterState;
import io.swagger.client.model.StateEnum;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.joda.time.DateTime;

/**
 * CustomIcmsConfByState
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-06T17:54:07.550Z")
public class CustomIcmsConfByState {
  @SerializedName("code")
  private String code = null;

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("startDate")
  private DateTime startDate = null;

  @SerializedName("expirationDate")
  private DateTime expirationDate = null;

  @SerializedName("inactive")
  private Boolean inactive = null;

  @SerializedName("subjectToST")
  private Boolean subjectToST = null;

  /**
   * On sales process inform the CST hat the item linked to this configuration is subject to for the own ICMS - '00' # TAXABLE - '20' # TAXABLE WITH BASE DISCOUNT - '40' # EXEMPT - '41' # NOT TAXABLE - '50' # SUSPENDED 
   */
  public enum IcmsCSTEnum {
    @SerializedName("00")
    _00("00"),
    
    @SerializedName("20")
    _20("20"),
    
    @SerializedName("40")
    _40("40"),
    
    @SerializedName("41")
    _41("41"),
    
    @SerializedName("50")
    _50("50");

    private String value;

    IcmsCSTEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("icmsCST")
  private IcmsCSTEnum icmsCST = null;

  /**
   * how this ICMS will be calculed for itens linked to this configuration
   */
  public enum CalcModeEnum {
    @SerializedName("BYMVARATE")
    BYMVARATE("BYMVARATE"),
    
    @SerializedName("SRP")
    SRP("SRP"),
    
    @SerializedName("MMSRP")
    MMSRP("MMSRP"),
    
    @SerializedName("OPERATIONAMOUNT")
    OPERATIONAMOUNT("OPERATIONAMOUNT");

    private String value;

    CalcModeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("calcMode")
  private CalcModeEnum calcMode = null;

  @SerializedName("discountRateForMonoPhase")
  private Double discountRateForMonoPhase = null;

  @SerializedName("rate")
  private Double rate = null;

  @SerializedName("icmsBaseDiscount")
  private Double icmsBaseDiscount = null;

  @SerializedName("msrp")
  private Double msrp = null;

  @SerializedName("mvaRate")
  private Double mvaRate = null;

  @SerializedName("msrpUnit")
  private String msrpUnit = null;

  @SerializedName("icmsLegalReason")
  private String icmsLegalReason = null;

  @SerializedName("fcpRate")
  private Double fcpRate = null;

  @SerializedName("icmsSTConf")
  private IcmsConfByStateIcmsSTConf icmsSTConf = null;

  @SerializedName("icmsInterStateConf")
  private List<IcmsConfInterState> icmsInterStateConf = new ArrayList<IcmsConfInterState>();

  @SerializedName("companyId")
  private UUID companyId = null;

  public CustomIcmsConfByState code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Identify the IcmsConfState in namespace
   * @return code
  **/
  @ApiModelProperty(example = "null", required = true, value = "Identify the IcmsConfState in namespace")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public CustomIcmsConfByState state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public CustomIcmsConfByState name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name for this configuration
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "name for this configuration")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CustomIcmsConfByState startDate(DateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * date when this configuration values starts
   * @return startDate
  **/
  @ApiModelProperty(example = "null", value = "date when this configuration values starts")
  public DateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(DateTime startDate) {
    this.startDate = startDate;
  }

  public CustomIcmsConfByState expirationDate(DateTime expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * date when this configuration values expire
   * @return expirationDate
  **/
  @ApiModelProperty(example = "null", value = "date when this configuration values expire")
  public DateTime getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(DateTime expirationDate) {
    this.expirationDate = expirationDate;
  }

  public CustomIcmsConfByState inactive(Boolean inactive) {
    this.inactive = inactive;
    return this;
  }

   /**
   * set this configuration to Inactive
   * @return inactive
  **/
  @ApiModelProperty(example = "null", value = "set this configuration to Inactive")
  public Boolean getInactive() {
    return inactive;
  }

  public void setInactive(Boolean inactive) {
    this.inactive = inactive;
  }

  public CustomIcmsConfByState subjectToST(Boolean subjectToST) {
    this.subjectToST = subjectToST;
    return this;
  }

   /**
   * inform that the item linked to this configuration is subject to ICMS ST on this state
   * @return subjectToST
  **/
  @ApiModelProperty(example = "null", value = "inform that the item linked to this configuration is subject to ICMS ST on this state")
  public Boolean getSubjectToST() {
    return subjectToST;
  }

  public void setSubjectToST(Boolean subjectToST) {
    this.subjectToST = subjectToST;
  }

  public CustomIcmsConfByState icmsCST(IcmsCSTEnum icmsCST) {
    this.icmsCST = icmsCST;
    return this;
  }

   /**
   * On sales process inform the CST hat the item linked to this configuration is subject to for the own ICMS - '00' # TAXABLE - '20' # TAXABLE WITH BASE DISCOUNT - '40' # EXEMPT - '41' # NOT TAXABLE - '50' # SUSPENDED 
   * @return icmsCST
  **/
  @ApiModelProperty(example = "null", value = "On sales process inform the CST hat the item linked to this configuration is subject to for the own ICMS - '00' # TAXABLE - '20' # TAXABLE WITH BASE DISCOUNT - '40' # EXEMPT - '41' # NOT TAXABLE - '50' # SUSPENDED ")
  public IcmsCSTEnum getIcmsCST() {
    return icmsCST;
  }

  public void setIcmsCST(IcmsCSTEnum icmsCST) {
    this.icmsCST = icmsCST;
  }

  public CustomIcmsConfByState calcMode(CalcModeEnum calcMode) {
    this.calcMode = calcMode;
    return this;
  }

   /**
   * how this ICMS will be calculed for itens linked to this configuration
   * @return calcMode
  **/
  @ApiModelProperty(example = "null", value = "how this ICMS will be calculed for itens linked to this configuration")
  public CalcModeEnum getCalcMode() {
    return calcMode;
  }

  public void setCalcMode(CalcModeEnum calcMode) {
    this.calcMode = calcMode;
  }

  public CustomIcmsConfByState discountRateForMonoPhase(Double discountRateForMonoPhase) {
    this.discountRateForMonoPhase = discountRateForMonoPhase;
    return this;
  }

   /**
   * discount if the item is subject to monophase PIS/COFINS for transactions inside state
   * @return discountRateForMonoPhase
  **/
  @ApiModelProperty(example = "null", value = "discount if the item is subject to monophase PIS/COFINS for transactions inside state")
  public Double getDiscountRateForMonoPhase() {
    return discountRateForMonoPhase;
  }

  public void setDiscountRateForMonoPhase(Double discountRateForMonoPhase) {
    this.discountRateForMonoPhase = discountRateForMonoPhase;
  }

  public CustomIcmsConfByState rate(Double rate) {
    this.rate = rate;
    return this;
  }

   /**
   * ICMS rate
   * @return rate
  **/
  @ApiModelProperty(example = "null", value = "ICMS rate")
  public Double getRate() {
    return rate;
  }

  public void setRate(Double rate) {
    this.rate = rate;
  }

  public CustomIcmsConfByState icmsBaseDiscount(Double icmsBaseDiscount) {
    this.icmsBaseDiscount = icmsBaseDiscount;
    return this;
  }

   /**
   * ICMS rate
   * @return icmsBaseDiscount
  **/
  @ApiModelProperty(example = "null", value = "ICMS rate")
  public Double getIcmsBaseDiscount() {
    return icmsBaseDiscount;
  }

  public void setIcmsBaseDiscount(Double icmsBaseDiscount) {
    this.icmsBaseDiscount = icmsBaseDiscount;
  }

  public CustomIcmsConfByState msrp(Double msrp) {
    this.msrp = msrp;
    return this;
  }

   /**
   * SRP or MMSRP amount base for this icms configuration
   * @return msrp
  **/
  @ApiModelProperty(example = "null", value = "SRP or MMSRP amount base for this icms configuration")
  public Double getMsrp() {
    return msrp;
  }

  public void setMsrp(Double msrp) {
    this.msrp = msrp;
  }

  public CustomIcmsConfByState mvaRate(Double mvaRate) {
    this.mvaRate = mvaRate;
    return this;
  }

   /**
   * ICMS mva rate to define calc base
   * @return mvaRate
  **/
  @ApiModelProperty(example = "null", value = "ICMS mva rate to define calc base")
  public Double getMvaRate() {
    return mvaRate;
  }

  public void setMvaRate(Double mvaRate) {
    this.mvaRate = mvaRate;
  }

  public CustomIcmsConfByState msrpUnit(String msrpUnit) {
    this.msrpUnit = msrpUnit;
    return this;
  }

   /**
   * unit used to SRP amount value
   * @return msrpUnit
  **/
  @ApiModelProperty(example = "null", value = "unit used to SRP amount value")
  public String getMsrpUnit() {
    return msrpUnit;
  }

  public void setMsrpUnit(String msrpUnit) {
    this.msrpUnit = msrpUnit;
  }

  public CustomIcmsConfByState icmsLegalReason(String icmsLegalReason) {
    this.icmsLegalReason = icmsLegalReason;
    return this;
  }

   /**
   * Code for the ICM legal reason, this message will be placed on invoice.
   * @return icmsLegalReason
  **/
  @ApiModelProperty(example = "null", value = "Code for the ICM legal reason, this message will be placed on invoice.")
  public String getIcmsLegalReason() {
    return icmsLegalReason;
  }

  public void setIcmsLegalReason(String icmsLegalReason) {
    this.icmsLegalReason = icmsLegalReason;
  }

  public CustomIcmsConfByState fcpRate(Double fcpRate) {
    this.fcpRate = fcpRate;
    return this;
  }

   /**
   * Fundo de Combate à pobreza / Fund Against Poverty
   * @return fcpRate
  **/
  @ApiModelProperty(example = "null", value = "Fundo de Combate à pobreza / Fund Against Poverty")
  public Double getFcpRate() {
    return fcpRate;
  }

  public void setFcpRate(Double fcpRate) {
    this.fcpRate = fcpRate;
  }

  public CustomIcmsConfByState icmsSTConf(IcmsConfByStateIcmsSTConf icmsSTConf) {
    this.icmsSTConf = icmsSTConf;
    return this;
  }

   /**
   * Get icmsSTConf
   * @return icmsSTConf
  **/
  @ApiModelProperty(example = "null", value = "")
  public IcmsConfByStateIcmsSTConf getIcmsSTConf() {
    return icmsSTConf;
  }

  public void setIcmsSTConf(IcmsConfByStateIcmsSTConf icmsSTConf) {
    this.icmsSTConf = icmsSTConf;
  }

  public CustomIcmsConfByState icmsInterStateConf(List<IcmsConfInterState> icmsInterStateConf) {
    this.icmsInterStateConf = icmsInterStateConf;
    return this;
  }

  public CustomIcmsConfByState addIcmsInterStateConfItem(IcmsConfInterState icmsInterStateConfItem) {
    this.icmsInterStateConf.add(icmsInterStateConfItem);
    return this;
  }

   /**
   * the map key is state code
   * @return icmsInterStateConf
  **/
  @ApiModelProperty(example = "null", value = "the map key is state code")
  public List<IcmsConfInterState> getIcmsInterStateConf() {
    return icmsInterStateConf;
  }

  public void setIcmsInterStateConf(List<IcmsConfInterState> icmsInterStateConf) {
    this.icmsInterStateConf = icmsInterStateConf;
  }

  public CustomIcmsConfByState companyId(UUID companyId) {
    this.companyId = companyId;
    return this;
  }

   /**
   * Company ID
   * @return companyId
  **/
  @ApiModelProperty(example = "null", required = true, value = "Company ID")
  public UUID getCompanyId() {
    return companyId;
  }

  public void setCompanyId(UUID companyId) {
    this.companyId = companyId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomIcmsConfByState customIcmsConfByState = (CustomIcmsConfByState) o;
    return Objects.equals(this.code, customIcmsConfByState.code) &&
        Objects.equals(this.state, customIcmsConfByState.state) &&
        Objects.equals(this.name, customIcmsConfByState.name) &&
        Objects.equals(this.startDate, customIcmsConfByState.startDate) &&
        Objects.equals(this.expirationDate, customIcmsConfByState.expirationDate) &&
        Objects.equals(this.inactive, customIcmsConfByState.inactive) &&
        Objects.equals(this.subjectToST, customIcmsConfByState.subjectToST) &&
        Objects.equals(this.icmsCST, customIcmsConfByState.icmsCST) &&
        Objects.equals(this.calcMode, customIcmsConfByState.calcMode) &&
        Objects.equals(this.discountRateForMonoPhase, customIcmsConfByState.discountRateForMonoPhase) &&
        Objects.equals(this.rate, customIcmsConfByState.rate) &&
        Objects.equals(this.icmsBaseDiscount, customIcmsConfByState.icmsBaseDiscount) &&
        Objects.equals(this.msrp, customIcmsConfByState.msrp) &&
        Objects.equals(this.mvaRate, customIcmsConfByState.mvaRate) &&
        Objects.equals(this.msrpUnit, customIcmsConfByState.msrpUnit) &&
        Objects.equals(this.icmsLegalReason, customIcmsConfByState.icmsLegalReason) &&
        Objects.equals(this.fcpRate, customIcmsConfByState.fcpRate) &&
        Objects.equals(this.icmsSTConf, customIcmsConfByState.icmsSTConf) &&
        Objects.equals(this.icmsInterStateConf, customIcmsConfByState.icmsInterStateConf) &&
        Objects.equals(this.companyId, customIcmsConfByState.companyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, state, name, startDate, expirationDate, inactive, subjectToST, icmsCST, calcMode, discountRateForMonoPhase, rate, icmsBaseDiscount, msrp, mvaRate, msrpUnit, icmsLegalReason, fcpRate, icmsSTConf, icmsInterStateConf, companyId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomIcmsConfByState {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    inactive: ").append(toIndentedString(inactive)).append("\n");
    sb.append("    subjectToST: ").append(toIndentedString(subjectToST)).append("\n");
    sb.append("    icmsCST: ").append(toIndentedString(icmsCST)).append("\n");
    sb.append("    calcMode: ").append(toIndentedString(calcMode)).append("\n");
    sb.append("    discountRateForMonoPhase: ").append(toIndentedString(discountRateForMonoPhase)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    icmsBaseDiscount: ").append(toIndentedString(icmsBaseDiscount)).append("\n");
    sb.append("    msrp: ").append(toIndentedString(msrp)).append("\n");
    sb.append("    mvaRate: ").append(toIndentedString(mvaRate)).append("\n");
    sb.append("    msrpUnit: ").append(toIndentedString(msrpUnit)).append("\n");
    sb.append("    icmsLegalReason: ").append(toIndentedString(icmsLegalReason)).append("\n");
    sb.append("    fcpRate: ").append(toIndentedString(fcpRate)).append("\n");
    sb.append("    icmsSTConf: ").append(toIndentedString(icmsSTConf)).append("\n");
    sb.append("    icmsInterStateConf: ").append(toIndentedString(icmsInterStateConf)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
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

