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
 * Tax Rate Obs: AR - \"a recolher\" (serviço). RP e PP - filtrado para alvos de lucro real ou lucro presumido (serviço) 
 */
public enum TaxType {
  
  @SerializedName("INSS")
  INSS("INSS"),
  
  @SerializedName("INSS_RF")
  INSS_RF("INSS_RF"),
  
  @SerializedName("INSS_AR")
  INSS_AR("INSS_AR"),
  
  @SerializedName("IRRF")
  IRRF("IRRF"),
  
  @SerializedName("PIS")
  PIS("PIS"),
  
  @SerializedName("PIS_RF")
  PIS_RF("PIS_RF"),
  
  @SerializedName("PIS_RP")
  PIS_RP("PIS_RP"),
  
  @SerializedName("PIS_PP")
  PIS_PP("PIS_PP"),
  
  @SerializedName("COFINS")
  COFINS("COFINS"),
  
  @SerializedName("COFINS_RF")
  COFINS_RF("COFINS_RF"),
  
  @SerializedName("COFINS_RP")
  COFINS_RP("COFINS_RP"),
  
  @SerializedName("COFINS_PP")
  COFINS_PP("COFINS_PP"),
  
  @SerializedName("CSLL")
  CSLL("CSLL"),
  
  @SerializedName("CSLL_RF")
  CSLL_RF("CSLL_RF"),
  
  @SerializedName("CSLL_PP")
  CSLL_PP("CSLL_PP"),
  
  @SerializedName("CSLL_RP")
  CSLL_RP("CSLL_RP"),
  
  @SerializedName("IRPJ")
  IRPJ("IRPJ"),
  
  @SerializedName("ISS")
  ISS("ISS"),
  
  @SerializedName("ISS_RF")
  ISS_RF("ISS_RF"),
  
  @SerializedName("IPI")
  IPI("IPI");

  private String value;

  TaxType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}
