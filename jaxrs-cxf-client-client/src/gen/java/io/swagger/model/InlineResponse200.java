package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class InlineResponse200  {
  
  @ApiModelProperty(example = "null", value = "")
  private String token = null;
  @ApiModelProperty(example = "null", value = "")
  private javax.xml.datatype.XMLGregorianCalendar expired = null;

 /**
   * Get token
   * @return token
  **/
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }
 /**
   * Get expired
   * @return expired
  **/
  public javax.xml.datatype.XMLGregorianCalendar getExpired() {
    return expired;
  }
  public void setExpired(javax.xml.datatype.XMLGregorianCalendar expired) {
    this.expired = expired;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
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

