package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class SalesLinesOutTaxDeductions  {
  
  @ApiModelProperty(example = "null", value = "Deduction amount not ISS taxable. Example Building material")
  private Double iss = null;

 /**
   * Deduction amount not ISS taxable. Example Building material
   * @return iss
  **/
  public Double getIss() {
    return iss;
  }
  public void setIss(Double iss) {
    this.iss = iss;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesLinesOutTaxDeductions {\n");
    
    sb.append("    iss: ").append(toIndentedString(iss)).append("\n");
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
