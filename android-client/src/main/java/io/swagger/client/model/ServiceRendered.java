/**
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

import io.swagger.client.model.SimpleAddress;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Address where the rendered service.
 **/
@ApiModel(description = "Address where the rendered service.")
public class ServiceRendered {
  
  @SerializedName("address")
  private SimpleAddress address = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public SimpleAddress getAddress() {
    return address;
  }
  public void setAddress(SimpleAddress address) {
    this.address = address;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceRendered serviceRendered = (ServiceRendered) o;
    return (this.address == null ? serviceRendered.address == null : this.address.equals(serviceRendered.address));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.address == null ? 0: this.address.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceRendered {\n");
    
    sb.append("  address: ").append(address).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
