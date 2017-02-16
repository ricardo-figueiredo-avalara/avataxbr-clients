package io.swagger.model;

import io.swagger.model.IcmsConfByStateIcmsSTConf;
import io.swagger.model.IcmsConfInterState;
import io.swagger.model.StateEnum;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class IcmsConfByState  {
  
  @ApiModelProperty(example = "null", required = true, value = "Identify the IcmsConfState in namespace")
  private String code = null;
  @ApiModelProperty(example = "null", required = true, value = "")
  private StateEnum state = null;
  @ApiModelProperty(example = "null", value = "name for this configuration")
  private String name = null;
  @ApiModelProperty(example = "null", value = "date when this configuration values starts")
  private javax.xml.datatype.XMLGregorianCalendar startDate = null;
  @ApiModelProperty(example = "null", value = "date when this configuration values expire")
  private javax.xml.datatype.XMLGregorianCalendar expirationDate = null;
  @ApiModelProperty(example = "null", value = "set this configuration to Inactive")
  private Boolean inactive = null;
  @ApiModelProperty(example = "null", value = "inform that the item linked to this configuration is subject to ICMS ST on this state")
  private Boolean subjectToST = null;

@XmlType(name="IcmsCSTEnum")
@XmlEnum(String.class)
public enum IcmsCSTEnum {

    @XmlEnumValue("00") _00(String.valueOf("00")), @XmlEnumValue("20") _20(String.valueOf("20")), @XmlEnumValue("40") _40(String.valueOf("40")), @XmlEnumValue("41") _41(String.valueOf("41")), @XmlEnumValue("50") _50(String.valueOf("50"));


    private String value;

    IcmsCSTEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static IcmsCSTEnum fromValue(String v) {
        for (IcmsCSTEnum b : IcmsCSTEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "On sales process inform the CST hat the item linked to this configuration is subject to for the own ICMS - '00' # TAXABLE - '20' # TAXABLE WITH BASE DISCOUNT - '40' # EXEMPT - '41' # NOT TAXABLE - '50' # SUSPENDED ")
  private IcmsCSTEnum icmsCST = null;

@XmlType(name="CalcModeEnum")
@XmlEnum(String.class)
public enum CalcModeEnum {

    @XmlEnumValue("BYMVARATE") BYMVARATE(String.valueOf("BYMVARATE")), @XmlEnumValue("SRP") SRP(String.valueOf("SRP")), @XmlEnumValue("MMSRP") MMSRP(String.valueOf("MMSRP")), @XmlEnumValue("OPERATIONAMOUNT") OPERATIONAMOUNT(String.valueOf("OPERATIONAMOUNT"));


    private String value;

    CalcModeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CalcModeEnum fromValue(String v) {
        for (CalcModeEnum b : CalcModeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "how this ICMS will be calculed for itens linked to this configuration")
  private CalcModeEnum calcMode = null;
  @ApiModelProperty(example = "null", value = "discount if the item is subject to monophase PIS/COFINS for transactions inside state")
  private Double discountRateForMonoPhase = null;
  @ApiModelProperty(example = "null", value = "ICMS rate")
  private Double rate = null;
  @ApiModelProperty(example = "null", value = "ICMS rate")
  private Double icmsBaseDiscount = null;
  @ApiModelProperty(example = "null", value = "SRP or MMSRP amount base for this icms configuration")
  private Double msrp = null;
  @ApiModelProperty(example = "null", value = "ICMS mva rate to define calc base")
  private Double mvaRate = null;
  @ApiModelProperty(example = "null", value = "unit used to SRP amount value")
  private String msrpUnit = null;
  @ApiModelProperty(example = "null", value = "Code for the ICM legal reason, this message will be placed on invoice.")
  private String icmsLegalReason = null;
  @ApiModelProperty(example = "null", value = "Fundo de Combate à pobreza / Fund Against Poverty")
  private Double fcpRate = null;
  @ApiModelProperty(example = "null", value = "")
  private IcmsConfByStateIcmsSTConf icmsSTConf = null;
  @ApiModelProperty(example = "null", value = "the map key is state code")
  private List<IcmsConfInterState> icmsInterStateConf = new ArrayList<IcmsConfInterState>();

 /**
   * Identify the IcmsConfState in namespace
   * @return code
  **/
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }
 /**
   * Get state
   * @return state
  **/
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }
 /**
   * name for this configuration
   * @return name
  **/
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
 /**
   * date when this configuration values starts
   * @return startDate
  **/
  public javax.xml.datatype.XMLGregorianCalendar getStartDate() {
    return startDate;
  }
  public void setStartDate(javax.xml.datatype.XMLGregorianCalendar startDate) {
    this.startDate = startDate;
  }
 /**
   * date when this configuration values expire
   * @return expirationDate
  **/
  public javax.xml.datatype.XMLGregorianCalendar getExpirationDate() {
    return expirationDate;
  }
  public void setExpirationDate(javax.xml.datatype.XMLGregorianCalendar expirationDate) {
    this.expirationDate = expirationDate;
  }
 /**
   * set this configuration to Inactive
   * @return inactive
  **/
  public Boolean getInactive() {
    return inactive;
  }
  public void setInactive(Boolean inactive) {
    this.inactive = inactive;
  }
 /**
   * inform that the item linked to this configuration is subject to ICMS ST on this state
   * @return subjectToST
  **/
  public Boolean getSubjectToST() {
    return subjectToST;
  }
  public void setSubjectToST(Boolean subjectToST) {
    this.subjectToST = subjectToST;
  }
 /**
   * On sales process inform the CST hat the item linked to this configuration is subject to for the own ICMS - '00' # TAXABLE - '20' # TAXABLE WITH BASE DISCOUNT - '40' # EXEMPT - '41' # NOT TAXABLE - '50' # SUSPENDED 
   * @return icmsCST
  **/
  public IcmsCSTEnum getIcmsCST() {
    return icmsCST;
  }
  public void setIcmsCST(IcmsCSTEnum icmsCST) {
    this.icmsCST = icmsCST;
  }
 /**
   * how this ICMS will be calculed for itens linked to this configuration
   * @return calcMode
  **/
  public CalcModeEnum getCalcMode() {
    return calcMode;
  }
  public void setCalcMode(CalcModeEnum calcMode) {
    this.calcMode = calcMode;
  }
 /**
   * discount if the item is subject to monophase PIS/COFINS for transactions inside state
   * @return discountRateForMonoPhase
  **/
  public Double getDiscountRateForMonoPhase() {
    return discountRateForMonoPhase;
  }
  public void setDiscountRateForMonoPhase(Double discountRateForMonoPhase) {
    this.discountRateForMonoPhase = discountRateForMonoPhase;
  }
 /**
   * ICMS rate
   * @return rate
  **/
  public Double getRate() {
    return rate;
  }
  public void setRate(Double rate) {
    this.rate = rate;
  }
 /**
   * ICMS rate
   * @return icmsBaseDiscount
  **/
  public Double getIcmsBaseDiscount() {
    return icmsBaseDiscount;
  }
  public void setIcmsBaseDiscount(Double icmsBaseDiscount) {
    this.icmsBaseDiscount = icmsBaseDiscount;
  }
 /**
   * SRP or MMSRP amount base for this icms configuration
   * @return msrp
  **/
  public Double getMsrp() {
    return msrp;
  }
  public void setMsrp(Double msrp) {
    this.msrp = msrp;
  }
 /**
   * ICMS mva rate to define calc base
   * @return mvaRate
  **/
  public Double getMvaRate() {
    return mvaRate;
  }
  public void setMvaRate(Double mvaRate) {
    this.mvaRate = mvaRate;
  }
 /**
   * unit used to SRP amount value
   * @return msrpUnit
  **/
  public String getMsrpUnit() {
    return msrpUnit;
  }
  public void setMsrpUnit(String msrpUnit) {
    this.msrpUnit = msrpUnit;
  }
 /**
   * Code for the ICM legal reason, this message will be placed on invoice.
   * @return icmsLegalReason
  **/
  public String getIcmsLegalReason() {
    return icmsLegalReason;
  }
  public void setIcmsLegalReason(String icmsLegalReason) {
    this.icmsLegalReason = icmsLegalReason;
  }
 /**
   * Fundo de Combate à pobreza / Fund Against Poverty
   * @return fcpRate
  **/
  public Double getFcpRate() {
    return fcpRate;
  }
  public void setFcpRate(Double fcpRate) {
    this.fcpRate = fcpRate;
  }
 /**
   * Get icmsSTConf
   * @return icmsSTConf
  **/
  public IcmsConfByStateIcmsSTConf getIcmsSTConf() {
    return icmsSTConf;
  }
  public void setIcmsSTConf(IcmsConfByStateIcmsSTConf icmsSTConf) {
    this.icmsSTConf = icmsSTConf;
  }
 /**
   * the map key is state code
   * @return icmsInterStateConf
  **/
  public List<IcmsConfInterState> getIcmsInterStateConf() {
    return icmsInterStateConf;
  }
  public void setIcmsInterStateConf(List<IcmsConfInterState> icmsInterStateConf) {
    this.icmsInterStateConf = icmsInterStateConf;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IcmsConfByState {\n");
    
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

