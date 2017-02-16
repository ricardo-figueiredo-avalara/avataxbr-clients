package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class WithholdDef  {
  
  @ApiModelProperty(example = "null", value = "UUID Reference to an item in the LegalReason store.")
  private String exemptionReasonCode = null;
  @ApiModelProperty(example = "null", value = "")
  private String customExemptionReasonDescription = null;

 /**
   * UUID Reference to an item in the LegalReason store.
   * @return exemptionReasonCode
  **/
  public String getExemptionReasonCode() {
    return exemptionReasonCode;
  }
  public void setExemptionReasonCode(String exemptionReasonCode) {
    this.exemptionReasonCode = exemptionReasonCode;
  }
 /**
   * Get customExemptionReasonDescription
   * @return customExemptionReasonDescription
  **/
  public String getCustomExemptionReasonDescription() {
    return customExemptionReasonDescription;
  }
  public void setCustomExemptionReasonDescription(String customExemptionReasonDescription) {
    this.customExemptionReasonDescription = customExemptionReasonDescription;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WithholdDef {\n");
    
    sb.append("    exemptionReasonCode: ").append(toIndentedString(exemptionReasonCode)).append("\n");
    sb.append("    customExemptionReasonDescription: ").append(toIndentedString(customExemptionReasonDescription)).append("\n");
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

