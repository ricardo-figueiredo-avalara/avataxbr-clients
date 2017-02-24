package io.swagger.model;

import io.swagger.model.TaxType;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class TaxTypeRate  {
  
  @ApiModelProperty(example = "null", required = true, value = "")
  private TaxType taxType = null;

@XmlType(name="TaxModelEnum")
@XmlEnum(String.class)
public enum TaxModelEnum {

    @XmlEnumValue("rate") RATE(String.valueOf("rate")), @XmlEnumValue("srf") SRF(String.valueOf("srf"));


    private String value;

    TaxModelEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TaxModelEnum fromValue(String v) {
        for (TaxModelEnum b : TaxModelEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", required = true, value = "Tax can be calculated by rate or by quantity")
  private TaxModelEnum taxModel = null;
  @ApiModelProperty(example = "null", value = "Specific tax rate ex 3.5 (3.5%)")
  private Double rate = null;
  @ApiModelProperty(example = "null", value = "Specific tax rate ex 3.5 (3.5%)")
  private Double srvAmount = null;
  @ApiModelProperty(example = "null", value = "")
  private String quantityUnidBase = null;

@XmlType(name="SpecializationTypeEnum")
@XmlEnum(String.class)
public enum SpecializationTypeEnum {

    @XmlEnumValue("basic") BASIC(String.valueOf("basic")), @XmlEnumValue("monophase") MONOPHASE(String.valueOf("monophase")), @XmlEnumValue("taxSubstitution") TAXSUBSTITUTION(String.valueOf("taxSubstitution"));


    private String value;

    SpecializationTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SpecializationTypeEnum fromValue(String v) {
        for (SpecializationTypeEnum b : SpecializationTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "")
  private SpecializationTypeEnum specializationType = null;

 /**
   * Get taxType
   * @return taxType
  **/
  public TaxType getTaxType() {
    return taxType;
  }
  public void setTaxType(TaxType taxType) {
    this.taxType = taxType;
  }
 /**
   * Tax can be calculated by rate or by quantity
   * @return taxModel
  **/
  public TaxModelEnum getTaxModel() {
    return taxModel;
  }
  public void setTaxModel(TaxModelEnum taxModel) {
    this.taxModel = taxModel;
  }
 /**
   * Specific tax rate ex 3.5 (3.5%)
   * @return rate
  **/
  public Double getRate() {
    return rate;
  }
  public void setRate(Double rate) {
    this.rate = rate;
  }
 /**
   * Specific tax rate ex 3.5 (3.5%)
   * @return srvAmount
  **/
  public Double getSrvAmount() {
    return srvAmount;
  }
  public void setSrvAmount(Double srvAmount) {
    this.srvAmount = srvAmount;
  }
 /**
   * Get quantityUnidBase
   * @return quantityUnidBase
  **/
  public String getQuantityUnidBase() {
    return quantityUnidBase;
  }
  public void setQuantityUnidBase(String quantityUnidBase) {
    this.quantityUnidBase = quantityUnidBase;
  }
 /**
   * Get specializationType
   * @return specializationType
  **/
  public SpecializationTypeEnum getSpecializationType() {
    return specializationType;
  }
  public void setSpecializationType(SpecializationTypeEnum specializationType) {
    this.specializationType = specializationType;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxTypeRate {\n");
    
    sb.append("    taxType: ").append(toIndentedString(taxType)).append("\n");
    sb.append("    taxModel: ").append(toIndentedString(taxModel)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    srvAmount: ").append(toIndentedString(srvAmount)).append("\n");
    sb.append("    quantityUnidBase: ").append(toIndentedString(quantityUnidBase)).append("\n");
    sb.append("    specializationType: ").append(toIndentedString(specializationType)).append("\n");
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

