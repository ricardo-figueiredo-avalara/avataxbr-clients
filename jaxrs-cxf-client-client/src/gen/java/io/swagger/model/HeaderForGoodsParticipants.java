package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.EntityForGoods;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@ApiModel(description="List of transaction participants, Seller, Buyer, Carrier")
public class HeaderForGoodsParticipants  {
  
  @ApiModelProperty(example = "null", value = "")
  private EntityForGoods entity = null;
  @ApiModelProperty(example = "null", value = "")
  private EntityForGoods transporter = null;

 /**
   * Get entity
   * @return entity
  **/
  public EntityForGoods getEntity() {
    return entity;
  }
  public void setEntity(EntityForGoods entity) {
    this.entity = entity;
  }
 /**
   * Get transporter
   * @return transporter
  **/
  public EntityForGoods getTransporter() {
    return transporter;
  }
  public void setTransporter(EntityForGoods transporter) {
    this.transporter = transporter;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeaderForGoodsParticipants {\n");
    
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    transporter: ").append(toIndentedString(transporter)).append("\n");
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

