/**
 * BR16 - API
 * This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.client.model.StateEnum;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Export information
 **/
@ApiModel(description = "Export information")
public class ExportInfo {
  
  @SerializedName("shippingState")
  private StateEnum shippingState = null;
  @SerializedName("place")
  private String place = null;
  @SerializedName("placeDescription")
  private String placeDescription = null;

  /**
   * shipping state
   **/
  @ApiModelProperty(required = true, value = "shipping state")
  public StateEnum getShippingState() {
    return shippingState;
  }
  public void setShippingState(StateEnum shippingState) {
    this.shippingState = shippingState;
  }

  /**
   * shipping place
   **/
  @ApiModelProperty(required = true, value = "shipping place")
  public String getPlace() {
    return place;
  }
  public void setPlace(String place) {
    this.place = place;
  }

  /**
   * description of shipping place
   **/
  @ApiModelProperty(value = "description of shipping place")
  public String getPlaceDescription() {
    return placeDescription;
  }
  public void setPlaceDescription(String placeDescription) {
    this.placeDescription = placeDescription;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportInfo exportInfo = (ExportInfo) o;
    return (this.shippingState == null ? exportInfo.shippingState == null : this.shippingState.equals(exportInfo.shippingState)) &&
        (this.place == null ? exportInfo.place == null : this.place.equals(exportInfo.place)) &&
        (this.placeDescription == null ? exportInfo.placeDescription == null : this.placeDescription.equals(exportInfo.placeDescription));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.shippingState == null ? 0: this.shippingState.hashCode());
    result = 31 * result + (this.place == null ? 0: this.place.hashCode());
    result = 31 * result + (this.placeDescription == null ? 0: this.placeDescription.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportInfo {\n");
    
    sb.append("  shippingState: ").append(shippingState).append("\n");
    sb.append("  place: ").append(place).append("\n");
    sb.append("  placeDescription: ").append(placeDescription).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}