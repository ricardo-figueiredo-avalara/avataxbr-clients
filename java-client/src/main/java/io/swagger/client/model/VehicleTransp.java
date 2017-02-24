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
import io.swagger.client.model.VehicleID;
import java.util.ArrayList;
import java.util.List;

/**
 * Identify type of vehicle used to transport the attributes, except atribute type,  follow rule allOf then only one of this atributes will be informed. 
 */
@ApiModel(description = "Identify type of vehicle used to transport the attributes, except atribute type,  follow rule allOf then only one of this atributes will be informed. ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-24T19:47:57.099Z")
public class VehicleTransp {
  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    @SerializedName("automobile")
    AUTOMOBILE("automobile"),
    
    @SerializedName("wagon")
    WAGON("wagon"),
    
    @SerializedName("ferry")
    FERRY("ferry"),
    
    @SerializedName("trailer")
    TRAILER("trailer");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("automobile")
  private VehicleID automobile = null;

  @SerializedName("trailer")
  private List<VehicleID> trailer = new ArrayList<VehicleID>();

  @SerializedName("wagon")
  private String wagon = null;

  @SerializedName("ferry")
  private String ferry = null;

  public VehicleTransp type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public VehicleTransp automobile(VehicleID automobile) {
    this.automobile = automobile;
    return this;
  }

   /**
   * Get automobile
   * @return automobile
  **/
  @ApiModelProperty(example = "null", value = "")
  public VehicleID getAutomobile() {
    return automobile;
  }

  public void setAutomobile(VehicleID automobile) {
    this.automobile = automobile;
  }

  public VehicleTransp trailer(List<VehicleID> trailer) {
    this.trailer = trailer;
    return this;
  }

  public VehicleTransp addTrailerItem(VehicleID trailerItem) {
    this.trailer.add(trailerItem);
    return this;
  }

   /**
   * Trailer
   * @return trailer
  **/
  @ApiModelProperty(example = "null", value = "Trailer")
  public List<VehicleID> getTrailer() {
    return trailer;
  }

  public void setTrailer(List<VehicleID> trailer) {
    this.trailer = trailer;
  }

  public VehicleTransp wagon(String wagon) {
    this.wagon = wagon;
    return this;
  }

   /**
   * Get wagon
   * @return wagon
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getWagon() {
    return wagon;
  }

  public void setWagon(String wagon) {
    this.wagon = wagon;
  }

  public VehicleTransp ferry(String ferry) {
    this.ferry = ferry;
    return this;
  }

   /**
   * Ferry
   * @return ferry
  **/
  @ApiModelProperty(example = "null", value = "Ferry")
  public String getFerry() {
    return ferry;
  }

  public void setFerry(String ferry) {
    this.ferry = ferry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleTransp vehicleTransp = (VehicleTransp) o;
    return Objects.equals(this.type, vehicleTransp.type) &&
        Objects.equals(this.automobile, vehicleTransp.automobile) &&
        Objects.equals(this.trailer, vehicleTransp.trailer) &&
        Objects.equals(this.wagon, vehicleTransp.wagon) &&
        Objects.equals(this.ferry, vehicleTransp.ferry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, automobile, trailer, wagon, ferry);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleTransp {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    automobile: ").append(toIndentedString(automobile)).append("\n");
    sb.append("    trailer: ").append(toIndentedString(trailer)).append("\n");
    sb.append("    wagon: ").append(toIndentedString(wagon)).append("\n");
    sb.append("    ferry: ").append(toIndentedString(ferry)).append("\n");
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

