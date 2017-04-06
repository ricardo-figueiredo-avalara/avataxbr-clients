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

/**
 * This element contains a dictionary of locations such as the origin and destination addresses to be associated with this transaction. There can only be one location of a given purpose in the dictionary.
 */
@ApiModel(description = "This element contains a dictionary of locations such as the origin and destination addresses to be associated with this transaction. There can only be one location of a given purpose in the dictionary.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-06T17:54:07.550Z")
public class SalesDefaultLocations {
  @SerializedName("serviceRendered")
  private ServiceRendered serviceRendered = null;

  public SalesDefaultLocations serviceRendered(ServiceRendered serviceRendered) {
    this.serviceRendered = serviceRendered;
    return this;
  }

   /**
   * Get serviceRendered
   * @return serviceRendered
  **/
  @ApiModelProperty(example = "null", value = "")
  public ServiceRendered getServiceRendered() {
    return serviceRendered;
  }

  public void setServiceRendered(ServiceRendered serviceRendered) {
    this.serviceRendered = serviceRendered;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SalesDefaultLocations salesDefaultLocations = (SalesDefaultLocations) o;
    return Objects.equals(this.serviceRendered, salesDefaultLocations.serviceRendered);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceRendered);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

