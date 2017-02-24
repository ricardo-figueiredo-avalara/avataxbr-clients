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
 * Using the placing reference in PCC for PIS (P), COFINS (C) and COFINS (C).  x = tax is not subject to withholding.  - 'xxx' - 'PCC' - 'PCx' - 'PxC' - 'Pxx' - 'xCC' - 'xxC' - 'xCx' 
 */
public enum WithholdingMode {
  
  @SerializedName("xxx")
  XXX("xxx"),
  
  @SerializedName("PCC")
  PCC("PCC"),
  
  @SerializedName("PCx")
  PCX("PCx"),
  
  @SerializedName("PxC")
  PXC("PxC"),
  
  @SerializedName("Pxx")
  PXX("Pxx"),
  
  @SerializedName("xCC")
  XCC("xCC"),
  
  @SerializedName("xxC")
  XXC("xxC"),
  
  @SerializedName("xCx")
  XCX("xCx");

  private String value;

  WithholdingMode(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}

