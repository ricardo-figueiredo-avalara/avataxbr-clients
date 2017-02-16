package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class FuelCide  {
  
  @ApiModelProperty(example = "null", required = true, value = "percentage of natural gas (GLP), this decimal 12 integers and 0 to 4 decimals")
  private Double baseCalcCIDE = null;
  @ApiModelProperty(example = "null", required = true, value = "percentage of natural gas (GLP), this decimal 11 integers and 0 to 4 decimals - R$")
  private Double rateCIDE = null;
  @ApiModelProperty(example = "null", required = true, value = "percentage of natural gas (GLP), this decimal 13 integers and 2 decimals - R$")
  private Double valueCIDE = null;

 /**
   * percentage of natural gas (GLP), this decimal 12 integers and 0 to 4 decimals
   * @return baseCalcCIDE
  **/
  public Double getBaseCalcCIDE() {
    return baseCalcCIDE;
  }
  public void setBaseCalcCIDE(Double baseCalcCIDE) {
    this.baseCalcCIDE = baseCalcCIDE;
  }
 /**
   * percentage of natural gas (GLP), this decimal 11 integers and 0 to 4 decimals - R$
   * @return rateCIDE
  **/
  public Double getRateCIDE() {
    return rateCIDE;
  }
  public void setRateCIDE(Double rateCIDE) {
    this.rateCIDE = rateCIDE;
  }
 /**
   * percentage of natural gas (GLP), this decimal 13 integers and 2 decimals - R$
   * @return valueCIDE
  **/
  public Double getValueCIDE() {
    return valueCIDE;
  }
  public void setValueCIDE(Double valueCIDE) {
    this.valueCIDE = valueCIDE;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FuelCide {\n");
    
    sb.append("    baseCalcCIDE: ").append(toIndentedString(baseCalcCIDE)).append("\n");
    sb.append("    rateCIDE: ").append(toIndentedString(rateCIDE)).append("\n");
    sb.append("    valueCIDE: ").append(toIndentedString(valueCIDE)).append("\n");
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

