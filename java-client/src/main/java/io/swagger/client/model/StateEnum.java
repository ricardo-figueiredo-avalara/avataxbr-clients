/*
 * AvaTax Brazil
 * The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;


/**
 * State Abreviation: - 'AC' - 'AL' - 'AP' - 'AM' - 'BA' - 'CE' - 'DF' - 'ES' - 'GO' - 'MA' - 'MT' - 'MS' - 'MG' - 'PA' - 'PB' - 'PR' - 'PE' - 'PI' - 'RJ' - 'RN' - 'RS' - 'RO' - 'RR' - 'SC' - 'SP' - 'SE' - 'TO' 
 */
public enum StateEnum {
  
  @SerializedName("AC")
  AC("AC"),
  
  @SerializedName("AL")
  AL("AL"),
  
  @SerializedName("AP")
  AP("AP"),
  
  @SerializedName("AM")
  AM("AM"),
  
  @SerializedName("BA")
  BA("BA"),
  
  @SerializedName("CE")
  CE("CE"),
  
  @SerializedName("DF")
  DF("DF"),
  
  @SerializedName("ES")
  ES("ES"),
  
  @SerializedName("GO")
  GO("GO"),
  
  @SerializedName("MA")
  MA("MA"),
  
  @SerializedName("MT")
  MT("MT"),
  
  @SerializedName("MS")
  MS("MS"),
  
  @SerializedName("MG")
  MG("MG"),
  
  @SerializedName("PA")
  PA("PA"),
  
  @SerializedName("PB")
  PB("PB"),
  
  @SerializedName("PR")
  PR("PR"),
  
  @SerializedName("PE")
  PE("PE"),
  
  @SerializedName("PI")
  PI("PI"),
  
  @SerializedName("RJ")
  RJ("RJ"),
  
  @SerializedName("RN")
  RN("RN"),
  
  @SerializedName("RS")
  RS("RS"),
  
  @SerializedName("RO")
  RO("RO"),
  
  @SerializedName("RR")
  RR("RR"),
  
  @SerializedName("SC")
  SC("SC"),
  
  @SerializedName("SP")
  SP("SP"),
  
  @SerializedName("SE")
  SE("SE"),
  
  @SerializedName("TO")
  TO("TO");

  private String value;

  StateEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}

