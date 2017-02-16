package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class TaxByTypeSummaryJurisdiction  {
  
  @ApiModelProperty(example = "null", value = "Jurisdiction used for calctax amount")
  private String jurisdictionName = null;

@XmlType(name="JurisdictionTypeEnum")
@XmlEnum(String.class)
public enum JurisdictionTypeEnum {

    @XmlEnumValue("City") CITY(String.valueOf("City")), @XmlEnumValue("State") STATE(String.valueOf("State")), @XmlEnumValue("Country") COUNTRY(String.valueOf("Country"));


    private String value;

    JurisdictionTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static JurisdictionTypeEnum fromValue(String v) {
        for (JurisdictionTypeEnum b : JurisdictionTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "Type of jurisdiction - 'City' - 'State' - 'Country' ")
  private JurisdictionTypeEnum jurisdictionType = null;
  @ApiModelProperty(example = "null", value = "sum of referenced tax value by jurisdiction")
  private Double tax = null;

 /**
   * Jurisdiction used for calctax amount
   * @return jurisdictionName
  **/
  public String getJurisdictionName() {
    return jurisdictionName;
  }
  public void setJurisdictionName(String jurisdictionName) {
    this.jurisdictionName = jurisdictionName;
  }
 /**
   * Type of jurisdiction - 'City' - 'State' - 'Country' 
   * @return jurisdictionType
  **/
  public JurisdictionTypeEnum getJurisdictionType() {
    return jurisdictionType;
  }
  public void setJurisdictionType(JurisdictionTypeEnum jurisdictionType) {
    this.jurisdictionType = jurisdictionType;
  }
 /**
   * sum of referenced tax value by jurisdiction
   * @return tax
  **/
  public Double getTax() {
    return tax;
  }
  public void setTax(Double tax) {
    this.tax = tax;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxByTypeSummaryJurisdiction {\n");
    
    sb.append("    jurisdictionName: ").append(toIndentedString(jurisdictionName)).append("\n");
    sb.append("    jurisdictionType: ").append(toIndentedString(jurisdictionType)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
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

