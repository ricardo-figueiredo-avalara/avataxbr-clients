/**
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

import io.swagger.client.model.IcmsConfInterStateIcmsSTConf;
import io.swagger.client.model.StateEnum;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class IcmsConfInterState {
  
  @SerializedName("state")
  private StateEnum state = null;
  public enum CalcModeEnum {
     BYMVARATE,  SRP,  MMSRP,  OPERATIONAMOUNT, 
  };
  @SerializedName("calcMode")
  private CalcModeEnum calcMode = null;
  @SerializedName("discountRateForMonoPhase")
  private Double discountRateForMonoPhase = null;
  @SerializedName("rate")
  private Double rate = null;
  @SerializedName("fcpRate")
  private Double fcpRate = null;
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
  @SerializedName("icmsSTConf")
  private IcmsConfInterStateIcmsSTConf icmsSTConf = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  /**
   * how this ICMS will be calculed for itens linked to this configuration
   **/
  @ApiModelProperty(value = "how this ICMS will be calculed for itens linked to this configuration")
  public CalcModeEnum getCalcMode() {
    return calcMode;
  }
  public void setCalcMode(CalcModeEnum calcMode) {
    this.calcMode = calcMode;
  }

  /**
   * discount if the item is subject to monophase PIS/COFINS when operation interstate
   **/
  @ApiModelProperty(value = "discount if the item is subject to monophase PIS/COFINS when operation interstate")
  public Double getDiscountRateForMonoPhase() {
    return discountRateForMonoPhase;
  }
  public void setDiscountRateForMonoPhase(Double discountRateForMonoPhase) {
    this.discountRateForMonoPhase = discountRateForMonoPhase;
  }

  /**
   * ICMS rate
   **/
  @ApiModelProperty(value = "ICMS rate")
  public Double getRate() {
    return rate;
  }
  public void setRate(Double rate) {
    this.rate = rate;
  }

  /**
   * FCP rate (Fundo de Combate à Probreza / Fund Against Poverty
   **/
  @ApiModelProperty(value = "FCP rate (Fundo de Combate à Probreza / Fund Against Poverty")
  public Double getFcpRate() {
    return fcpRate;
  }
  public void setFcpRate(Double fcpRate) {
    this.fcpRate = fcpRate;
  }

  /**
   * ICMS rate
   **/
  @ApiModelProperty(value = "ICMS rate")
  public Double getIcmsBaseDiscount() {
    return icmsBaseDiscount;
  }
  public void setIcmsBaseDiscount(Double icmsBaseDiscount) {
    this.icmsBaseDiscount = icmsBaseDiscount;
  }

  /**
   * SRP or MMSRP amount base for this icms configuration
   **/
  @ApiModelProperty(value = "SRP or MMSRP amount base for this icms configuration")
  public Double getMsrp() {
    return msrp;
  }
  public void setMsrp(Double msrp) {
    this.msrp = msrp;
  }

  /**
   * ICMS MVA rate to define calc base
   **/
  @ApiModelProperty(value = "ICMS MVA rate to define calc base")
  public Double getMvaRate() {
    return mvaRate;
  }
  public void setMvaRate(Double mvaRate) {
    this.mvaRate = mvaRate;
  }

  /**
   * unit used to SRP amount value
   **/
  @ApiModelProperty(value = "unit used to SRP amount value")
  public String getMsrpUnit() {
    return msrpUnit;
  }
  public void setMsrpUnit(String msrpUnit) {
    this.msrpUnit = msrpUnit;
  }

  /**
   * Code for the ICM legal reason, this message will be placed on invoice.
   **/
  @ApiModelProperty(value = "Code for the ICM legal reason, this message will be placed on invoice.")
  public String getIcmsLegalReason() {
    return icmsLegalReason;
  }
  public void setIcmsLegalReason(String icmsLegalReason) {
    this.icmsLegalReason = icmsLegalReason;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public IcmsConfInterStateIcmsSTConf getIcmsSTConf() {
    return icmsSTConf;
  }
  public void setIcmsSTConf(IcmsConfInterStateIcmsSTConf icmsSTConf) {
    this.icmsSTConf = icmsSTConf;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IcmsConfInterState icmsConfInterState = (IcmsConfInterState) o;
    return (this.state == null ? icmsConfInterState.state == null : this.state.equals(icmsConfInterState.state)) &&
        (this.calcMode == null ? icmsConfInterState.calcMode == null : this.calcMode.equals(icmsConfInterState.calcMode)) &&
        (this.discountRateForMonoPhase == null ? icmsConfInterState.discountRateForMonoPhase == null : this.discountRateForMonoPhase.equals(icmsConfInterState.discountRateForMonoPhase)) &&
        (this.rate == null ? icmsConfInterState.rate == null : this.rate.equals(icmsConfInterState.rate)) &&
        (this.fcpRate == null ? icmsConfInterState.fcpRate == null : this.fcpRate.equals(icmsConfInterState.fcpRate)) &&
        (this.icmsBaseDiscount == null ? icmsConfInterState.icmsBaseDiscount == null : this.icmsBaseDiscount.equals(icmsConfInterState.icmsBaseDiscount)) &&
        (this.msrp == null ? icmsConfInterState.msrp == null : this.msrp.equals(icmsConfInterState.msrp)) &&
        (this.mvaRate == null ? icmsConfInterState.mvaRate == null : this.mvaRate.equals(icmsConfInterState.mvaRate)) &&
        (this.msrpUnit == null ? icmsConfInterState.msrpUnit == null : this.msrpUnit.equals(icmsConfInterState.msrpUnit)) &&
        (this.icmsLegalReason == null ? icmsConfInterState.icmsLegalReason == null : this.icmsLegalReason.equals(icmsConfInterState.icmsLegalReason)) &&
        (this.icmsSTConf == null ? icmsConfInterState.icmsSTConf == null : this.icmsSTConf.equals(icmsConfInterState.icmsSTConf));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.state == null ? 0: this.state.hashCode());
    result = 31 * result + (this.calcMode == null ? 0: this.calcMode.hashCode());
    result = 31 * result + (this.discountRateForMonoPhase == null ? 0: this.discountRateForMonoPhase.hashCode());
    result = 31 * result + (this.rate == null ? 0: this.rate.hashCode());
    result = 31 * result + (this.fcpRate == null ? 0: this.fcpRate.hashCode());
    result = 31 * result + (this.icmsBaseDiscount == null ? 0: this.icmsBaseDiscount.hashCode());
    result = 31 * result + (this.msrp == null ? 0: this.msrp.hashCode());
    result = 31 * result + (this.mvaRate == null ? 0: this.mvaRate.hashCode());
    result = 31 * result + (this.msrpUnit == null ? 0: this.msrpUnit.hashCode());
    result = 31 * result + (this.icmsLegalReason == null ? 0: this.icmsLegalReason.hashCode());
    result = 31 * result + (this.icmsSTConf == null ? 0: this.icmsSTConf.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class IcmsConfInterState {\n");
    
    sb.append("  state: ").append(state).append("\n");
    sb.append("  calcMode: ").append(calcMode).append("\n");
    sb.append("  discountRateForMonoPhase: ").append(discountRateForMonoPhase).append("\n");
    sb.append("  rate: ").append(rate).append("\n");
    sb.append("  fcpRate: ").append(fcpRate).append("\n");
    sb.append("  icmsBaseDiscount: ").append(icmsBaseDiscount).append("\n");
    sb.append("  msrp: ").append(msrp).append("\n");
    sb.append("  mvaRate: ").append(mvaRate).append("\n");
    sb.append("  msrpUnit: ").append(msrpUnit).append("\n");
    sb.append("  icmsLegalReason: ").append(icmsLegalReason).append("\n");
    sb.append("  icmsSTConf: ").append(icmsSTConf).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
