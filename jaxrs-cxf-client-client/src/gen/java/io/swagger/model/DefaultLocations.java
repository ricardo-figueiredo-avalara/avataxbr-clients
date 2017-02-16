package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.EntityLocation;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@ApiModel(description="This element contains a dictionary of locations such as the origin and destination addresses to be associated with this transaction. These locations may be overridden within each line item. The key for each location in the dictionary is the location 'purpose'. Valid locations purposes are 'ShipFrom', 'ShipTo', 'POS', 'POM', 'POO', 'BillingLocation', 'CallPlaced', 'CallReceived', 'ServiceRendered', 'POA' and 'FirstUse'. There can only be one location of a given purpose in the dictionary.")
public class DefaultLocations  {
  
  @ApiModelProperty(example = "null", value = "")
  private EntityLocation entity = null;
  @ApiModelProperty(example = "null", value = "")
  private EntityLocation company = null;
  @ApiModelProperty(example = "null", value = "")
  private EntityLocation transporter = null;
  @ApiModelProperty(example = "null", value = "")
  private EntityLocation deliveryLocation = null;
  @ApiModelProperty(example = "null", value = "")
  private EntityLocation pickupLocation = null;

 /**
   * Get entity
   * @return entity
  **/
  public EntityLocation getEntity() {
    return entity;
  }
  public void setEntity(EntityLocation entity) {
    this.entity = entity;
  }
 /**
   * Get company
   * @return company
  **/
  public EntityLocation getCompany() {
    return company;
  }
  public void setCompany(EntityLocation company) {
    this.company = company;
  }
 /**
   * Get transporter
   * @return transporter
  **/
  public EntityLocation getTransporter() {
    return transporter;
  }
  public void setTransporter(EntityLocation transporter) {
    this.transporter = transporter;
  }
 /**
   * Get deliveryLocation
   * @return deliveryLocation
  **/
  public EntityLocation getDeliveryLocation() {
    return deliveryLocation;
  }
  public void setDeliveryLocation(EntityLocation deliveryLocation) {
    this.deliveryLocation = deliveryLocation;
  }
 /**
   * Get pickupLocation
   * @return pickupLocation
  **/
  public EntityLocation getPickupLocation() {
    return pickupLocation;
  }
  public void setPickupLocation(EntityLocation pickupLocation) {
    this.pickupLocation = pickupLocation;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultLocations {\n");
    
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    transporter: ").append(toIndentedString(transporter)).append("\n");
    sb.append("    deliveryLocation: ").append(toIndentedString(deliveryLocation)).append("\n");
    sb.append("    pickupLocation: ").append(toIndentedString(pickupLocation)).append("\n");
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

