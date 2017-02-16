package io.swagger.model;

import io.swagger.model.AdditionalInformationProcRef;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class AdditionalInformation  {
  
  @ApiModelProperty(example = "null", value = "Additional information of fiscal interest")
  private String fiscalInfo = null;
  @ApiModelProperty(example = "null", value = "Additional information of user interest")
  private String complementaryInfo = null;
  @ApiModelProperty(example = "null", value = "Referenced Process")
  private List<AdditionalInformationProcRef> procRef = new ArrayList<AdditionalInformationProcRef>();

 /**
   * Additional information of fiscal interest
   * @return fiscalInfo
  **/
  public String getFiscalInfo() {
    return fiscalInfo;
  }
  public void setFiscalInfo(String fiscalInfo) {
    this.fiscalInfo = fiscalInfo;
  }
 /**
   * Additional information of user interest
   * @return complementaryInfo
  **/
  public String getComplementaryInfo() {
    return complementaryInfo;
  }
  public void setComplementaryInfo(String complementaryInfo) {
    this.complementaryInfo = complementaryInfo;
  }
 /**
   * Referenced Process
   * @return procRef
  **/
  public List<AdditionalInformationProcRef> getProcRef() {
    return procRef;
  }
  public void setProcRef(List<AdditionalInformationProcRef> procRef) {
    this.procRef = procRef;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalInformation {\n");
    
    sb.append("    fiscalInfo: ").append(toIndentedString(fiscalInfo)).append("\n");
    sb.append("    complementaryInfo: ").append(toIndentedString(complementaryInfo)).append("\n");
    sb.append("    procRef: ").append(toIndentedString(procRef)).append("\n");
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

