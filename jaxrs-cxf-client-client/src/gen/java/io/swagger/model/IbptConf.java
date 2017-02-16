package io.swagger.model;

import io.swagger.model.IpbtConfItem;
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

public class IbptConf  {
  
  @ApiModelProperty(example = "null", value = "IBPT Code")
  private String code = null;
  @ApiModelProperty(example = "null", value = "")
  private String description = null;
  @ApiModelProperty(example = "null", value = "")
  private List<IpbtConfItem> list = new ArrayList<IpbtConfItem>();

 /**
   * IBPT Code
   * @return code
  **/
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }
 /**
   * Get description
   * @return description
  **/
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
 /**
   * Get list
   * @return list
  **/
  public List<IpbtConfItem> getList() {
    return list;
  }
  public void setList(List<IpbtConfItem> list) {
    this.list = list;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IbptConf {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
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

