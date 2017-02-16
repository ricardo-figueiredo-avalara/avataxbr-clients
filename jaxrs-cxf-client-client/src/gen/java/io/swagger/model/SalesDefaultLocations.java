package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.ServiceRendered;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@ApiModel(description="This element contains a dictionary of locations such as the origin and destination addresses to be associated with this transaction. There can only be one location of a given purpose in the dictionary.")
public class SalesDefaultLocations  {
  
  @ApiModelProperty(example = "null", value = "")
  private ServiceRendered serviceRendered = null;

 /**
   * Get serviceRendered
   * @return serviceRendered
  **/
  public ServiceRendered getServiceRendered() {
    return serviceRendered;
  }
  public void setServiceRendered(ServiceRendered serviceRendered) {
    this.serviceRendered = serviceRendered;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesDefaultLocations {\n");
    
    sb.append("    serviceRendered: ").append(toIndentedString(serviceRendered)).append("\n");
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

