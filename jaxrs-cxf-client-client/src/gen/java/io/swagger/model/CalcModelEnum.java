package io.swagger.model;



/**
 * Gets or Sets CalcModelEnum
 */
public enum CalcModelEnum {
  
  RATE("rate"),
  
  QUANTITY("quantity");

  private String value;

  CalcModelEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CalcModelEnum fromValue(String text) {
    for (CalcModelEnum b : CalcModelEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

