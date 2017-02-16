package io.swagger.model;

import io.swagger.annotations.ApiModel;


/**
 * Tax Rate
 */
public enum TaxType {
  
  INSS("INSS"),
  
  INSS_RF("INSS_RF"),
  
  IRRF("IRRF"),
  
  PIS("PIS"),
  
  PIS_RF("PIS_RF"),
  
  COFINS("COFINS"),
  
  COFINS_RF("COFINS_RF"),
  
  CSLL("CSLL"),
  
  CSLL_RF("CSLL_RF"),
  
  IRPJ("IRPJ"),
  
  ISS("ISS"),
  
  ISS_RF("ISS_RF"),
  
  IPI("IPI");

  private String value;

  TaxType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TaxType fromValue(String text) {
    for (TaxType b : TaxType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

