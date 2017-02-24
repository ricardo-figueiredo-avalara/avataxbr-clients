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

@ApiModel(description = "")
public class FuelPumpNumber {
  
  @SerializedName("nozzleNumberFuelSupply")
  private String nozzleNumberFuelSupply = null;
  @SerializedName("fuelPumpNumber")
  private String fuelPumpNumber = null;
  @SerializedName("fuelTankNumber")
  private String fuelTankNumber = null;
  @SerializedName("startValueOfPumpNumber")
  private Double startValueOfPumpNumber = null;
  @SerializedName("endValueOfPumpNumber")
  private Double endValueOfPumpNumber = null;

  /**
   * Identification number of nozzle used in the dispensing process.   Numero de identificação do Bico utilizado no abastecimento 
   **/
  @ApiModelProperty(required = true, value = "Identification number of nozzle used in the dispensing process.   Numero de identificação do Bico utilizado no abastecimento ")
  public String getNozzleNumberFuelSupply() {
    return nozzleNumberFuelSupply;
  }
  public void setNozzleNumberFuelSupply(String nozzleNumberFuelSupply) {
    this.nozzleNumberFuelSupply = nozzleNumberFuelSupply;
  }

  /**
   * Identification number of the Pump connect to the used nozzle.   Numero de identificação da bomba ao qual o bico está interligado 
   **/
  @ApiModelProperty(required = true, value = "Identification number of the Pump connect to the used nozzle.   Numero de identificação da bomba ao qual o bico está interligado ")
  public String getFuelPumpNumber() {
    return fuelPumpNumber;
  }
  public void setFuelPumpNumber(String fuelPumpNumber) {
    this.fuelPumpNumber = fuelPumpNumber;
  }

  /**
   * Identification number of the Pump connect to the used nozzle.   Numero de identificação da bomba ao qual o bico está interligado 
   **/
  @ApiModelProperty(required = true, value = "Identification number of the Pump connect to the used nozzle.   Numero de identificação da bomba ao qual o bico está interligado ")
  public String getFuelTankNumber() {
    return fuelTankNumber;
  }
  public void setFuelTankNumber(String fuelTankNumber) {
    this.fuelTankNumber = fuelTankNumber;
  }

  /**
   * Valor do Encerrante no ínicio do abastecimento.  Reading of auto-counter (encerrante) at the start of the refueling/dispensing. This decimal 12 integers and 3 decimals - R$ 
   **/
  @ApiModelProperty(required = true, value = "Valor do Encerrante no ínicio do abastecimento.  Reading of auto-counter (encerrante) at the start of the refueling/dispensing. This decimal 12 integers and 3 decimals - R$ ")
  public Double getStartValueOfPumpNumber() {
    return startValueOfPumpNumber;
  }
  public void setStartValueOfPumpNumber(Double startValueOfPumpNumber) {
    this.startValueOfPumpNumber = startValueOfPumpNumber;
  }

  /**
   * Valor do Encerrante no final do abastecimento.  Reading of auto-counter (encerrante) at the end of the refueling/dispensing. This decimal 12 integers and 3 decimals - R$ 
   **/
  @ApiModelProperty(required = true, value = "Valor do Encerrante no final do abastecimento.  Reading of auto-counter (encerrante) at the end of the refueling/dispensing. This decimal 12 integers and 3 decimals - R$ ")
  public Double getEndValueOfPumpNumber() {
    return endValueOfPumpNumber;
  }
  public void setEndValueOfPumpNumber(Double endValueOfPumpNumber) {
    this.endValueOfPumpNumber = endValueOfPumpNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FuelPumpNumber fuelPumpNumber = (FuelPumpNumber) o;
    return (this.nozzleNumberFuelSupply == null ? fuelPumpNumber.nozzleNumberFuelSupply == null : this.nozzleNumberFuelSupply.equals(fuelPumpNumber.nozzleNumberFuelSupply)) &&
        (this.fuelPumpNumber == null ? fuelPumpNumber.fuelPumpNumber == null : this.fuelPumpNumber.equals(fuelPumpNumber.fuelPumpNumber)) &&
        (this.fuelTankNumber == null ? fuelPumpNumber.fuelTankNumber == null : this.fuelTankNumber.equals(fuelPumpNumber.fuelTankNumber)) &&
        (this.startValueOfPumpNumber == null ? fuelPumpNumber.startValueOfPumpNumber == null : this.startValueOfPumpNumber.equals(fuelPumpNumber.startValueOfPumpNumber)) &&
        (this.endValueOfPumpNumber == null ? fuelPumpNumber.endValueOfPumpNumber == null : this.endValueOfPumpNumber.equals(fuelPumpNumber.endValueOfPumpNumber));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.nozzleNumberFuelSupply == null ? 0: this.nozzleNumberFuelSupply.hashCode());
    result = 31 * result + (this.fuelPumpNumber == null ? 0: this.fuelPumpNumber.hashCode());
    result = 31 * result + (this.fuelTankNumber == null ? 0: this.fuelTankNumber.hashCode());
    result = 31 * result + (this.startValueOfPumpNumber == null ? 0: this.startValueOfPumpNumber.hashCode());
    result = 31 * result + (this.endValueOfPumpNumber == null ? 0: this.endValueOfPumpNumber.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FuelPumpNumber {\n");
    
    sb.append("  nozzleNumberFuelSupply: ").append(nozzleNumberFuelSupply).append("\n");
    sb.append("  fuelPumpNumber: ").append(fuelPumpNumber).append("\n");
    sb.append("  fuelTankNumber: ").append(fuelTankNumber).append("\n");
    sb.append("  startValueOfPumpNumber: ").append(startValueOfPumpNumber).append("\n");
    sb.append("  endValueOfPumpNumber: ").append(endValueOfPumpNumber).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
