package io.swagger.model;

import io.swagger.model.IcmsConfInterStateIcmsSTConf;
import io.swagger.model.StateEnum;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class IcmsConfInterState  {
  
  @ApiModelProperty(example = "null", value = "")
  private StateEnum state = null;

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
  @ApiModelProperty(example = "null", value = "discount if the item is subject to monophase PIS/COFINS when operation interstate")
  private Double discountRateForMonoPhase = null;
  @ApiModelProperty(example = "null", value = "ICMS rate")
  private Double rate = null;
  @ApiModelProperty(example = "null", value = "FCP rate (Fundo de Combate à Probreza / Fund Against Poverty")
  private Double fcpRate = null;
  @ApiModelProperty(example = "null", value = "ICMS rate")
  private Double icmsBaseDiscount = null;
  @ApiModelProperty(example = "null", value = "SRP or MMSRP amount base for this icms configuration")
  private Double msrp = null;
  @ApiModelProperty(example = "null", value = "ICMS MVA rate to define calc base")
  private Double mvaRate = null;
  @ApiModelProperty(example = "null", value = "unit used to SRP amount value")
  private String msrpUnit = null;
  @ApiModelProperty(example = "null", value = "Code for the ICM legal reason, this message will be placed on invoice.")
  private String icmsLegalReason = null;
  @ApiModelProperty(example = "null", value = "")
  private IcmsConfInterStateIcmsSTConf icmsSTConf = null;

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
   * discount if the item is subject to monophase PIS/COFINS when operation interstate
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
   * FCP rate (Fundo de Combate à Probreza / Fund Against Poverty
   * @return fcpRate
  **/
  public Double getFcpRate() {
    return fcpRate;
  }
  public void setFcpRate(Double fcpRate) {
    this.fcpRate = fcpRate;
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
   * ICMS MVA rate to define calc base
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
   * Get icmsSTConf
   * @return icmsSTConf
  **/
  public IcmsConfInterStateIcmsSTConf getIcmsSTConf() {
    return icmsSTConf;
  }
  public void setIcmsSTConf(IcmsConfInterStateIcmsSTConf icmsSTConf) {
    this.icmsSTConf = icmsSTConf;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IcmsConfInterState {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    calcMode: ").append(toIndentedString(calcMode)).append("\n");
    sb.append("    discountRateForMonoPhase: ").append(toIndentedString(discountRateForMonoPhase)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    fcpRate: ").append(toIndentedString(fcpRate)).append("\n");
    sb.append("    icmsBaseDiscount: ").append(toIndentedString(icmsBaseDiscount)).append("\n");
    sb.append("    msrp: ").append(toIndentedString(msrp)).append("\n");
    sb.append("    mvaRate: ").append(toIndentedString(mvaRate)).append("\n");
    sb.append("    msrpUnit: ").append(toIndentedString(msrpUnit)).append("\n");
    sb.append("    icmsLegalReason: ").append(toIndentedString(icmsLegalReason)).append("\n");
    sb.append("    icmsSTConf: ").append(toIndentedString(icmsSTConf)).append("\n");
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

