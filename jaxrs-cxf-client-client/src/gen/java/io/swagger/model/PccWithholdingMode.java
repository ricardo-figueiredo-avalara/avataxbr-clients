package io.swagger.model;

import io.swagger.model.TaxByTypeTax;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class PccWithholdingMode  {
  

@XmlType(name="TypeEnum")
@XmlEnum(String.class)
public enum TypeEnum {

    @XmlEnumValue("CSRF") CSRF(String.valueOf("CSRF")), @XmlEnumValue("individual") INDIVIDUAL(String.valueOf("individual"));


    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TypeEnum fromValue(String v) {
        for (TypeEnum b : TypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "Inform if this group of tax are calculated considering the threashold by PCC or Individualy (each tax separately)")
  private TypeEnum type = null;
  @ApiModelProperty(example = "null", value = "this attribute occurs only for CSRF type, When CRSF mode, this is sum of pisRf, CofinsRf and CsllRf")
  private Double totalTax = null;
  @ApiModelProperty(example = "null", value = "")
  private TaxByTypeTax pisRf = null;
  @ApiModelProperty(example = "null", value = "")
  private TaxByTypeTax cofinsRf = null;
  @ApiModelProperty(example = "null", value = "")
  private TaxByTypeTax csllRf = null;

 /**
   * Inform if this group of tax are calculated considering the threashold by PCC or Individualy (each tax separately)
   * @return type
  **/
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }
 /**
   * this attribute occurs only for CSRF type, When CRSF mode, this is sum of pisRf, CofinsRf and CsllRf
   * @return totalTax
  **/
  public Double getTotalTax() {
    return totalTax;
  }
  public void setTotalTax(Double totalTax) {
    this.totalTax = totalTax;
  }
 /**
   * Get pisRf
   * @return pisRf
  **/
  public TaxByTypeTax getPisRf() {
    return pisRf;
  }
  public void setPisRf(TaxByTypeTax pisRf) {
    this.pisRf = pisRf;
  }
 /**
   * Get cofinsRf
   * @return cofinsRf
  **/
  public TaxByTypeTax getCofinsRf() {
    return cofinsRf;
  }
  public void setCofinsRf(TaxByTypeTax cofinsRf) {
    this.cofinsRf = cofinsRf;
  }
 /**
   * Get csllRf
   * @return csllRf
  **/
  public TaxByTypeTax getCsllRf() {
    return csllRf;
  }
  public void setCsllRf(TaxByTypeTax csllRf) {
    this.csllRf = csllRf;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PccWithholdingMode {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    totalTax: ").append(toIndentedString(totalTax)).append("\n");
    sb.append("    pisRf: ").append(toIndentedString(pisRf)).append("\n");
    sb.append("    cofinsRf: ").append(toIndentedString(cofinsRf)).append("\n");
    sb.append("    csllRf: ").append(toIndentedString(csllRf)).append("\n");
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

