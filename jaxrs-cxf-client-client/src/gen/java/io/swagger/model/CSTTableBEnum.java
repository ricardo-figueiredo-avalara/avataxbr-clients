package io.swagger.model;

import io.swagger.annotations.ApiModel;


/**
 * Use to determined how the tax is applicable and calculated. It may define and exemption, a tax base reduction, identify that a special rate is applicable (not the rate itself). - '00' # Taxed in its totality - '10' # Taxed and subject to tax substitution (ICMS ST) - '20' # Taxed with Tax Base Reduction - '30' # Exempt /Not Taxed and subject to tax Substitution (ICMS#ST) - '40' # Tax Exempt - '41' # Not Taxed - '50' # Taxes Suspended - '51' # Taxes Diferred - '60' # ICMS Tax already collected through Substituition (ICMS ST) - '70' # Taxed with Tax Base Reduction and subject to Tax Subsititution (ICMS ST) - '90' # Others 
 */
public enum CSTTableBEnum {
  
  _00("00"),
  
  _10("10"),
  
  _20("20"),
  
  _30("30"),
  
  _40("40"),
  
  _41("41"),
  
  _50("50"),
  
  _51("51"),
  
  _60("60"),
  
  _70("70"),
  
  _90("90");

  private String value;

  CSTTableBEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CSTTableBEnum fromValue(String text) {
    for (CSTTableBEnum b : CSTTableBEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

