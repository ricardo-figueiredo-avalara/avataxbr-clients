package io.swagger.model;

import io.swagger.annotations.ApiModel;


/**
 * Entity Type (business, individual, federal government, state government, city government foreign)
 */
public enum EntityType {
  
  BUSINESS("business"),
  
  INDIVIDUAL("individual"),
  
  FEDERALGOVERNMENT("federalGovernment"),
  
  STATEGOVERNMENT("stateGovernment"),
  
  CITYGOVERNMENT("cityGovernment"),
  
  FOREIGN("foreign");

  private String value;

  EntityType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static EntityType fromValue(String text) {
    for (EntityType b : EntityType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

