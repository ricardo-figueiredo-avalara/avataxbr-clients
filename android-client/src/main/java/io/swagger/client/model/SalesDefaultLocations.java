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

import io.swagger.client.model.ServiceRendered;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * This element contains a dictionary of locations such as the origin and destination addresses to be associated with this transaction. There can only be one location of a given purpose in the dictionary.
 **/
@ApiModel(description = "This element contains a dictionary of locations such as the origin and destination addresses to be associated with this transaction. There can only be one location of a given purpose in the dictionary.")
public class SalesDefaultLocations {
  
  @SerializedName("serviceRendered")
  private ServiceRendered serviceRendered = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public ServiceRendered getServiceRendered() {
    return serviceRendered;
  }
  public void setServiceRendered(ServiceRendered serviceRendered) {
    this.serviceRendered = serviceRendered;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SalesDefaultLocations salesDefaultLocations = (SalesDefaultLocations) o;
    return (this.serviceRendered == null ? salesDefaultLocations.serviceRendered == null : this.serviceRendered.equals(salesDefaultLocations.serviceRendered));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.serviceRendered == null ? 0: this.serviceRendered.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesDefaultLocations {\n");
    
    sb.append("  serviceRendered: ").append(serviceRendered).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}