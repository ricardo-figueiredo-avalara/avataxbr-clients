package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.StateEnum;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@ApiModel(description="Export information")
public class ExportInfo  {
  
  @ApiModelProperty(example = "null", required = true, value = "shipping state")
  private StateEnum shippingState = null;
  @ApiModelProperty(example = "null", required = true, value = "shipping place")
  private String place = null;
  @ApiModelProperty(example = "null", value = "description of shipping place")
  private String placeDescription = null;

 /**
   * shipping state
   * @return shippingState
  **/
  public StateEnum getShippingState() {
    return shippingState;
  }
  public void setShippingState(StateEnum shippingState) {
    this.shippingState = shippingState;
  }
 /**
   * shipping place
   * @return place
  **/
  public String getPlace() {
    return place;
  }
  public void setPlace(String place) {
    this.place = place;
  }
 /**
   * description of shipping place
   * @return placeDescription
  **/
  public String getPlaceDescription() {
    return placeDescription;
  }
  public void setPlaceDescription(String placeDescription) {
    this.placeDescription = placeDescription;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportInfo {\n");
    
    sb.append("    shippingState: ").append(toIndentedString(shippingState)).append("\n");
    sb.append("    place: ").append(toIndentedString(place)).append("\n");
    sb.append("    placeDescription: ").append(toIndentedString(placeDescription)).append("\n");
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

