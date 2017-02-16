package io.swagger.model;

import io.swagger.annotations.ApiModel;


/**
 * Source of product or merchandise, - '0' # National goods - 'except those treated in codes 3,4, 5 and 8 - '1' # Imported directly by seller, except those in code 6 - '2' # Foreign goods - 'Acquired in the internal market (inside Brazil), except those in code 7 - '3' # Merchandise or goods with imported content above 40% and with less than or equal to 70% - '4' # National goods from production following 'standard basic processes' as stablished by legislation (standard basic processes are devised to separate simple assembly from manufaturing processes) - '5' # National goods - 'Merchandise or goods with imported content equal or below 40% - '6' # Foreign goods - 'Directly imported by Seller, without a National Equivalent as listed by Comex and natural gas - '7' # Foreign goods - 'Acquired inside Brazil, without a National Equivalent  as listed by Comex and natural gas - '8' # Merchandise or goods with imported content above 70% 
 */
public enum CSTTableAEnum {
  
  _0("0"),
  
  _1("1"),
  
  _2("2"),
  
  _3("3"),
  
  _4("4"),
  
  _5("5"),
  
  _6("6"),
  
  _7("7"),
  
  _8("8");

  private String value;

  CSTTableAEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CSTTableAEnum fromValue(String text) {
    for (CSTTableAEnum b : CSTTableAEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

