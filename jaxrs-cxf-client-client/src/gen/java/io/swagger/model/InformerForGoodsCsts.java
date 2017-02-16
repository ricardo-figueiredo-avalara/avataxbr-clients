package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class InformerForGoodsCsts  {
  
  @ApiModelProperty(example = "null", value = "CST-B")
  private String icms = null;
  @ApiModelProperty(example = "null", value = "CST-IPI")
  private String ipi = null;
  @ApiModelProperty(example = "null", value = "CST PIS/COFINS")
  private String pisCofins = null;

 /**
   * CST-B
   * @return icms
  **/
  public String getIcms() {
    return icms;
  }
  public void setIcms(String icms) {
    this.icms = icms;
  }
 /**
   * CST-IPI
   * @return ipi
  **/
  public String getIpi() {
    return ipi;
  }
  public void setIpi(String ipi) {
    this.ipi = ipi;
  }
 /**
   * CST PIS/COFINS
   * @return pisCofins
  **/
  public String getPisCofins() {
    return pisCofins;
  }
  public void setPisCofins(String pisCofins) {
    this.pisCofins = pisCofins;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InformerForGoodsCsts {\n");
    
    sb.append("    icms: ").append(toIndentedString(icms)).append("\n");
    sb.append("    ipi: ").append(toIndentedString(ipi)).append("\n");
    sb.append("    pisCofins: ").append(toIndentedString(pisCofins)).append("\n");
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

