package io.swagger.model;

import io.swagger.model.StateEnum;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class LocationSecondaryStateTaxId  {
  
  @ApiModelProperty(example = "null", value = "")
  private String stateTaxId = null;
  @ApiModelProperty(example = "null", value = "")
  private StateEnum state = null;

 /**
   * Get stateTaxId
   * @return stateTaxId
  **/
  public String getStateTaxId() {
    return stateTaxId;
  }
  public void setStateTaxId(String stateTaxId) {
    this.stateTaxId = stateTaxId;
  }
 /**
   * Get state
   * @return state
  **/
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationSecondaryStateTaxId {\n");
    
    sb.append("    stateTaxId: ").append(toIndentedString(stateTaxId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

