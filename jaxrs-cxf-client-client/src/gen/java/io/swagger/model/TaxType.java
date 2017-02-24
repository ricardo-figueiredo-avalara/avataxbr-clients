package io.swagger.model;

import io.swagger.annotations.ApiModel;


/**
 * Tax Rate Obs: AR - \"a recolher\" (serviço). RP e PP - filtrado para alvos de lucro real ou lucro presumido (serviço) 
 */
public enum TaxType {
  
  INSS("INSS"),
  
  INSS_RF("INSS_RF"),
  
  INSS_AR("INSS_AR"),
  
  IRRF("IRRF"),
  
  PIS("PIS"),
  
  PIS_RF("PIS_RF"),
  
  PIS_RP("PIS_RP"),
  
  PIS_PP("PIS_PP"),
  
  COFINS("COFINS"),
  
  COFINS_RF("COFINS_RF"),
  
  COFINS_RP("COFINS_RP"),
  
  COFINS_PP("COFINS_PP"),
  
  CSLL("CSLL"),
  
  CSLL_RF("CSLL_RF"),
  
  CSLL_PP("CSLL_PP"),
  
  CSLL_RP("CSLL_RP"),
  
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

