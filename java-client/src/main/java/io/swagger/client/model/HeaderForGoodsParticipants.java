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
import io.swagger.client.model.EntityForGoods;

/**
 * List of transaction participants, Seller, Buyer, Carrier
 */
@ApiModel(description = "List of transaction participants, Seller, Buyer, Carrier")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-24T19:47:57.099Z")
public class HeaderForGoodsParticipants {
  @SerializedName("entity")
  private EntityForGoods entity = null;

  @SerializedName("transporter")
  private EntityForGoods transporter = null;

  public HeaderForGoodsParticipants entity(EntityForGoods entity) {
    this.entity = entity;
    return this;
  }

   /**
   * Get entity
   * @return entity
  **/
  @ApiModelProperty(example = "null", value = "")
  public EntityForGoods getEntity() {
    return entity;
  }

  public void setEntity(EntityForGoods entity) {
    this.entity = entity;
  }

  public HeaderForGoodsParticipants transporter(EntityForGoods transporter) {
    this.transporter = transporter;
    return this;
  }

   /**
   * Get transporter
   * @return transporter
  **/
  @ApiModelProperty(example = "null", value = "")
  public EntityForGoods getTransporter() {
    return transporter;
  }

  public void setTransporter(EntityForGoods transporter) {
    this.transporter = transporter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeaderForGoodsParticipants headerForGoodsParticipants = (HeaderForGoodsParticipants) o;
    return Objects.equals(this.entity, headerForGoodsParticipants.entity) &&
        Objects.equals(this.transporter, headerForGoodsParticipants.transporter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, transporter);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

