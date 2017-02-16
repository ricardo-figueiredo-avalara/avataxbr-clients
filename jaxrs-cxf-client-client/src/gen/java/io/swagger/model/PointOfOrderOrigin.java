package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.SimpleAddress;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@ApiModel(description="Address where the service is rendered.")
public class PointOfOrderOrigin  {
  
  @ApiModelProperty(example = "null", value = "")
  private SimpleAddress address = null;

 /**
   * Get address
   * @return address
  **/
  public SimpleAddress getAddress() {
    return address;
  }
  public void setAddress(SimpleAddress address) {
    this.address = address;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointOfOrderOrigin {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

