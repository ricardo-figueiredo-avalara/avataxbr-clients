/*
 * AvaTax Brazil
 * The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.StateEnum;

/**
 * Export information
 */
@ApiModel(description = "Export information")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-06T17:54:07.550Z")
public class ExportInfo {
  @SerializedName("shippingState")
  private StateEnum shippingState = null;

  @SerializedName("place")
  private String place = null;

  @SerializedName("placeDescription")
  private String placeDescription = null;

  public ExportInfo shippingState(StateEnum shippingState) {
    this.shippingState = shippingState;
    return this;
  }

   /**
   * shipping state
   * @return shippingState
  **/
  @ApiModelProperty(example = "null", required = true, value = "shipping state")
  public StateEnum getShippingState() {
    return shippingState;
  }

  public void setShippingState(StateEnum shippingState) {
    this.shippingState = shippingState;
  }

  public ExportInfo place(String place) {
    this.place = place;
    return this;
  }

   /**
   * shipping place
   * @return place
  **/
  @ApiModelProperty(example = "null", required = true, value = "shipping place")
  public String getPlace() {
    return place;
  }

  public void setPlace(String place) {
    this.place = place;
  }

  public ExportInfo placeDescription(String placeDescription) {
    this.placeDescription = placeDescription;
    return this;
  }

   /**
   * description of shipping place
   * @return placeDescription
  **/
  @ApiModelProperty(example = "null", value = "description of shipping place")
  public String getPlaceDescription() {
    return placeDescription;
  }

  public void setPlaceDescription(String placeDescription) {
    this.placeDescription = placeDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportInfo exportInfo = (ExportInfo) o;
    return Objects.equals(this.shippingState, exportInfo.shippingState) &&
        Objects.equals(this.place, exportInfo.place) &&
        Objects.equals(this.placeDescription, exportInfo.placeDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shippingState, place, placeDescription);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
