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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;


/**
 * Entity Type (business, individual, federal government, state government, city government, foreign)
 */
public enum EntityType {
  
  @SerializedName("business")
  BUSINESS("business"),
  
  @SerializedName("individual")
  INDIVIDUAL("individual"),
  
  @SerializedName("federalGovernment")
  FEDERALGOVERNMENT("federalGovernment"),
  
  @SerializedName("stateGovernment")
  STATEGOVERNMENT("stateGovernment"),
  
  @SerializedName("cityGovernment")
  CITYGOVERNMENT("cityGovernment"),
  
  @SerializedName("foreign")
  FOREIGN("foreign");

  private String value;

  EntityType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}
