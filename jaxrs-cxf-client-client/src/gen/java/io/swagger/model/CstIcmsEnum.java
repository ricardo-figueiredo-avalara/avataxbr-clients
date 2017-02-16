package io.swagger.model;

import io.swagger.annotations.ApiModel;


/**
 * On sales process inform the CST that the item linked to this configuration is subject to - '00' # TAXABLE - '20' # TAXABLE WITH BASE DISCOUNT - '40' # EXEMPT - '41' # NOT TAXABLE - '50' # SUSPENDED 
 */
public enum CstIcmsEnum {
  
  _00("00"),
  
  _20("20"),
  
  _40("40"),
  
  _41("41"),
  
  _50("50");

  private String value;

  CstIcmsEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CstIcmsEnum fromValue(String text) {
    for (CstIcmsEnum b : CstIcmsEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

