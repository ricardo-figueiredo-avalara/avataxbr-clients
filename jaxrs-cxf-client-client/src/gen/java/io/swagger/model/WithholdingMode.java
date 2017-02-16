package io.swagger.model;

import io.swagger.annotations.ApiModel;


/**
 * Using the placing reference in PCC for PIS (P), COFINS (C) and COFINS (C).  x = tax is not subject to withholding.  - 'xxx' - 'PCC' - 'PCx' - 'PxC' - 'Pxx' - 'xCC' - 'xxC' - 'xCx' 
 */
public enum WithholdingMode {
  
  XXX("xxx"),
  
  PCC("PCC"),
  
  PCX("PCx"),
  
  PXC("PxC"),
  
  PXX("Pxx"),
  
  XCC("xCC"),
  
  XXC("xxC"),
  
  XCX("xCx");

  private String value;

  WithholdingMode(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static WithholdingMode fromValue(String text) {
    for (WithholdingMode b : WithholdingMode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

