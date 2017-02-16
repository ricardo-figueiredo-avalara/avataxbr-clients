package io.swagger.model;

import io.swagger.annotations.ApiModel;


/**
 * - Federal tax regime - realProfit - REAL PROFIT LUCRO REAL - estimatedProfit - ESTIMATED PROFIT / LUCRO PRESUMIDO - simplified - SIMPLIFIED - OPTANTE TO SIMPLES - simplifiedOverGrossthreshold - OPTANTE DO SIMPLES COM LIMITE DE GROSS REVENUE - simplifiedEntrepreneur - SIMPLIFIED ENTREPRENEUR / MEI MICRO EMPREENDEDOR INDIVIDUAL  - notApplicable - Not Applicable 1  - individual - INDIVIDUAL / INDIVIDUO 
 */
public enum FederalTaxRegime {
  
  REALPROFIT("realProfit"),
  
  ESTIMATEDPROFIT("estimatedProfit"),
  
  SIMPLIFIED("simplified"),
  
  SIMPLIFIEDOVERGROSSTHRESHOLD("simplifiedOverGrossthreshold"),
  
  SIMPLIFIEDENTREPRENEUR("simplifiedEntrepreneur"),
  
  NOTAPPLICABLE("notApplicable"),
  
  INDIVIDUAL("individual");

  private String value;

  FederalTaxRegime(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static FederalTaxRegime fromValue(String text) {
    for (FederalTaxRegime b : FederalTaxRegime.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

