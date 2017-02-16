package io.swagger.model;

import io.swagger.annotations.ApiModel;


/**
 * State Abreviation: - 'AC' - 'AL' - 'AP' - 'AM' - 'BA' - 'CE' - 'DF' - 'ES' - 'GO' - 'MA' - 'MT' - 'MS' - 'MG' - 'PA' - 'PB' - 'PR' - 'PE' - 'PI' - 'RJ' - 'RN' - 'RS' - 'RO' - 'RR' - 'SC' - 'SP' - 'SE' - 'TO' 
 */
public enum StateEnum {
  
  AC("AC"),
  
  AL("AL"),
  
  AP("AP"),
  
  AM("AM"),
  
  BA("BA"),
  
  CE("CE"),
  
  DF("DF"),
  
  ES("ES"),
  
  GO("GO"),
  
  MA("MA"),
  
  MT("MT"),
  
  MS("MS"),
  
  MG("MG"),
  
  PA("PA"),
  
  PB("PB"),
  
  PR("PR"),
  
  PE("PE"),
  
  PI("PI"),
  
  RJ("RJ"),
  
  RN("RN"),
  
  RS("RS"),
  
  RO("RO"),
  
  RR("RR"),
  
  SC("SC"),
  
  SP("SP"),
  
  SE("SE"),
  
  TO("TO");

  private String value;

  StateEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static StateEnum fromValue(String text) {
    for (StateEnum b : StateEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

