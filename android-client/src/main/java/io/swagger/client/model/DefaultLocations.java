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

import io.swagger.client.model.EntityLocation;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * This element contains a dictionary of locations such as the origin and destination addresses to be associated with this transaction. These locations may be overridden within each line item. The key for each location in the dictionary is the location &#39;purpose&#39;. Valid locations purposes are &#39;ShipFrom&#39;, &#39;ShipTo&#39;, &#39;POS&#39;, &#39;POM&#39;, &#39;POO&#39;, &#39;BillingLocation&#39;, &#39;CallPlaced&#39;, &#39;CallReceived&#39;, &#39;ServiceRendered&#39;, &#39;POA&#39; and &#39;FirstUse&#39;. There can only be one location of a given purpose in the dictionary.
 **/
@ApiModel(description = "This element contains a dictionary of locations such as the origin and destination addresses to be associated with this transaction. These locations may be overridden within each line item. The key for each location in the dictionary is the location 'purpose'. Valid locations purposes are 'ShipFrom', 'ShipTo', 'POS', 'POM', 'POO', 'BillingLocation', 'CallPlaced', 'CallReceived', 'ServiceRendered', 'POA' and 'FirstUse'. There can only be one location of a given purpose in the dictionary.")
public class DefaultLocations {
  
  @SerializedName("entity")
  private EntityLocation entity = null;
  @SerializedName("company")
  private EntityLocation company = null;
  @SerializedName("transporter")
  private EntityLocation transporter = null;
  @SerializedName("deliveryLocation")
  private EntityLocation deliveryLocation = null;
  @SerializedName("pickupLocation")
  private EntityLocation pickupLocation = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public EntityLocation getEntity() {
    return entity;
  }
  public void setEntity(EntityLocation entity) {
    this.entity = entity;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public EntityLocation getCompany() {
    return company;
  }
  public void setCompany(EntityLocation company) {
    this.company = company;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public EntityLocation getTransporter() {
    return transporter;
  }
  public void setTransporter(EntityLocation transporter) {
    this.transporter = transporter;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public EntityLocation getDeliveryLocation() {
    return deliveryLocation;
  }
  public void setDeliveryLocation(EntityLocation deliveryLocation) {
    this.deliveryLocation = deliveryLocation;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public EntityLocation getPickupLocation() {
    return pickupLocation;
  }
  public void setPickupLocation(EntityLocation pickupLocation) {
    this.pickupLocation = pickupLocation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefaultLocations defaultLocations = (DefaultLocations) o;
    return (this.entity == null ? defaultLocations.entity == null : this.entity.equals(defaultLocations.entity)) &&
        (this.company == null ? defaultLocations.company == null : this.company.equals(defaultLocations.company)) &&
        (this.transporter == null ? defaultLocations.transporter == null : this.transporter.equals(defaultLocations.transporter)) &&
        (this.deliveryLocation == null ? defaultLocations.deliveryLocation == null : this.deliveryLocation.equals(defaultLocations.deliveryLocation)) &&
        (this.pickupLocation == null ? defaultLocations.pickupLocation == null : this.pickupLocation.equals(defaultLocations.pickupLocation));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.entity == null ? 0: this.entity.hashCode());
    result = 31 * result + (this.company == null ? 0: this.company.hashCode());
    result = 31 * result + (this.transporter == null ? 0: this.transporter.hashCode());
    result = 31 * result + (this.deliveryLocation == null ? 0: this.deliveryLocation.hashCode());
    result = 31 * result + (this.pickupLocation == null ? 0: this.pickupLocation.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultLocations {\n");
    
    sb.append("  entity: ").append(entity).append("\n");
    sb.append("  company: ").append(company).append("\n");
    sb.append("  transporter: ").append(transporter).append("\n");
    sb.append("  deliveryLocation: ").append(deliveryLocation).append("\n");
    sb.append("  pickupLocation: ").append(pickupLocation).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
