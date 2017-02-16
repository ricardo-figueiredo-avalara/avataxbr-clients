package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class IcmsConfByStateIcmsSTConf  {
  
  @ApiModelProperty(example = "null", value = "inform that substituted is tax regime Simplified the operation MVA will be reduced")
  private Boolean hasReductionOfMVAForSimples = null;
  @ApiModelProperty(example = "null", value = "mva reduction when substituted is tax regime Simplified.")
  private Double reductionOfMVAForSimples = null;

@XmlType(name="CalcModeEnum")
@XmlEnum(String.class)
public enum CalcModeEnum {

    @XmlEnumValue("BYMVARATE") BYMVARATE(String.valueOf("BYMVARATE")), @XmlEnumValue("SRP") SRP(String.valueOf("SRP")), @XmlEnumValue("MSRP") MSRP(String.valueOf("MSRP"));


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

  @ApiModelProperty(example = "null", value = "how this ICMS-ST will be calculed for itens linked to this configuration")
  private CalcModeEnum calcMode = null;
  @ApiModelProperty(example = "null", value = "ICMS-ST mva rate to define calc base")
  private Double mvaRate = null;
  @ApiModelProperty(example = "null", value = "ICMS rate - Redução da BC ICMS ST (%)")
  private Double icmsStBaseDiscount = null;
  @ApiModelProperty(example = "null", value = "SRP or MSRP amount base for this ICMS-ST configuration")
  private Double srp = null;
  @ApiModelProperty(example = "null", value = "unit used to srv amount value")
  private String srpUnit = null;

 /**
   * inform that substituted is tax regime Simplified the operation MVA will be reduced
   * @return hasReductionOfMVAForSimples
  **/
  public Boolean getHasReductionOfMVAForSimples() {
    return hasReductionOfMVAForSimples;
  }
  public void setHasReductionOfMVAForSimples(Boolean hasReductionOfMVAForSimples) {
    this.hasReductionOfMVAForSimples = hasReductionOfMVAForSimples;
  }
 /**
   * mva reduction when substituted is tax regime Simplified.
   * @return reductionOfMVAForSimples
  **/
  public Double getReductionOfMVAForSimples() {
    return reductionOfMVAForSimples;
  }
  public void setReductionOfMVAForSimples(Double reductionOfMVAForSimples) {
    this.reductionOfMVAForSimples = reductionOfMVAForSimples;
  }
 /**
   * how this ICMS-ST will be calculed for itens linked to this configuration
   * @return calcMode
  **/
  public CalcModeEnum getCalcMode() {
    return calcMode;
  }
  public void setCalcMode(CalcModeEnum calcMode) {
    this.calcMode = calcMode;
  }
 /**
   * ICMS-ST mva rate to define calc base
   * @return mvaRate
  **/
  public Double getMvaRate() {
    return mvaRate;
  }
  public void setMvaRate(Double mvaRate) {
    this.mvaRate = mvaRate;
  }
 /**
   * ICMS rate - Redução da BC ICMS ST (%)
   * @return icmsStBaseDiscount
  **/
  public Double getIcmsStBaseDiscount() {
    return icmsStBaseDiscount;
  }
  public void setIcmsStBaseDiscount(Double icmsStBaseDiscount) {
    this.icmsStBaseDiscount = icmsStBaseDiscount;
  }
 /**
   * SRP or MSRP amount base for this ICMS-ST configuration
   * @return srp
  **/
  public Double getSrp() {
    return srp;
  }
  public void setSrp(Double srp) {
    this.srp = srp;
  }
 /**
   * unit used to srv amount value
   * @return srpUnit
  **/
  public String getSrpUnit() {
    return srpUnit;
  }
  public void setSrpUnit(String srpUnit) {
    this.srpUnit = srpUnit;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IcmsConfByStateIcmsSTConf {\n");
    
    sb.append("    hasReductionOfMVAForSimples: ").append(toIndentedString(hasReductionOfMVAForSimples)).append("\n");
    sb.append("    reductionOfMVAForSimples: ").append(toIndentedString(reductionOfMVAForSimples)).append("\n");
    sb.append("    calcMode: ").append(toIndentedString(calcMode)).append("\n");
    sb.append("    mvaRate: ").append(toIndentedString(mvaRate)).append("\n");
    sb.append("    icmsStBaseDiscount: ").append(toIndentedString(icmsStBaseDiscount)).append("\n");
    sb.append("    srp: ").append(toIndentedString(srp)).append("\n");
    sb.append("    srpUnit: ").append(toIndentedString(srpUnit)).append("\n");
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

