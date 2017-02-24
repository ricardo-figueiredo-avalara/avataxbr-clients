/**
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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * - Federal tax regime - realProfit - REAL PROFIT LUCRO REAL - estimatedProfit - ESTIMATED PROFIT / LUCRO PRESUMIDO - simplified - SIMPLIFIED - OPTANTE TO SIMPLES - simplifiedOverGrossthreshold - OPTANTE DO SIMPLES COM LIMITE DE GROSS REVENUE - simplifiedEntrepreneur - SIMPLIFIED ENTREPRENEUR / MEI MICRO EMPREENDEDOR INDIVIDUAL  - notApplicable - Not Applicable 1  - individual - INDIVIDUAL / INDIVIDUO 
 **/
@ApiModel(description = "- Federal tax regime - realProfit - REAL PROFIT LUCRO REAL - estimatedProfit - ESTIMATED PROFIT / LUCRO PRESUMIDO - simplified - SIMPLIFIED - OPTANTE TO SIMPLES - simplifiedOverGrossthreshold - OPTANTE DO SIMPLES COM LIMITE DE GROSS REVENUE - simplifiedEntrepreneur - SIMPLIFIED ENTREPRENEUR / MEI MICRO EMPREENDEDOR INDIVIDUAL  - notApplicable - Not Applicable 1  - individual - INDIVIDUAL / INDIVIDUO ")
public class FederalTaxRegime {
  


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FederalTaxRegime federalTaxRegime = (FederalTaxRegime) o;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 17;
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FederalTaxRegime {\n");
    
    sb.append("}\n");
    return sb.toString();
  }
}
