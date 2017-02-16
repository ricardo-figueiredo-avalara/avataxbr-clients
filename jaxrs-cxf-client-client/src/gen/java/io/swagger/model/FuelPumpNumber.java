package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class FuelPumpNumber  {
  
  @ApiModelProperty(example = "null", required = true, value = "Identification number of nozzle used in the dispensing process.   Numero de identificação do Bico utilizado no abastecimento ")
  private String nozzleNumberFuelSupply = null;
  @ApiModelProperty(example = "null", required = true, value = "Identification number of the Pump connect to the used nozzle.   Numero de identificação da bomba ao qual o bico está interligado ")
  private String fuelPumpNumber = null;
  @ApiModelProperty(example = "null", required = true, value = "Identification number of the Pump connect to the used nozzle.   Numero de identificação da bomba ao qual o bico está interligado ")
  private String fuelTankNumber = null;
  @ApiModelProperty(example = "null", required = true, value = "Valor do Encerrante no ínicio do abastecimento.  Reading of auto-counter (encerrante) at the start of the refueling/dispensing. This decimal 12 integers and 3 decimals - R$ ")
  private Double startValueOfPumpNumber = null;
  @ApiModelProperty(example = "null", required = true, value = "Valor do Encerrante no final do abastecimento.  Reading of auto-counter (encerrante) at the end of the refueling/dispensing. This decimal 12 integers and 3 decimals - R$ ")
  private Double endValueOfPumpNumber = null;

 /**
   * Identification number of nozzle used in the dispensing process.   Numero de identificação do Bico utilizado no abastecimento 
   * @return nozzleNumberFuelSupply
  **/
  public String getNozzleNumberFuelSupply() {
    return nozzleNumberFuelSupply;
  }
  public void setNozzleNumberFuelSupply(String nozzleNumberFuelSupply) {
    this.nozzleNumberFuelSupply = nozzleNumberFuelSupply;
  }
 /**
   * Identification number of the Pump connect to the used nozzle.   Numero de identificação da bomba ao qual o bico está interligado 
   * @return fuelPumpNumber
  **/
  public String getFuelPumpNumber() {
    return fuelPumpNumber;
  }
  public void setFuelPumpNumber(String fuelPumpNumber) {
    this.fuelPumpNumber = fuelPumpNumber;
  }
 /**
   * Identification number of the Pump connect to the used nozzle.   Numero de identificação da bomba ao qual o bico está interligado 
   * @return fuelTankNumber
  **/
  public String getFuelTankNumber() {
    return fuelTankNumber;
  }
  public void setFuelTankNumber(String fuelTankNumber) {
    this.fuelTankNumber = fuelTankNumber;
  }
 /**
   * Valor do Encerrante no ínicio do abastecimento.  Reading of auto-counter (encerrante) at the start of the refueling/dispensing. This decimal 12 integers and 3 decimals - R$ 
   * @return startValueOfPumpNumber
  **/
  public Double getStartValueOfPumpNumber() {
    return startValueOfPumpNumber;
  }
  public void setStartValueOfPumpNumber(Double startValueOfPumpNumber) {
    this.startValueOfPumpNumber = startValueOfPumpNumber;
  }
 /**
   * Valor do Encerrante no final do abastecimento.  Reading of auto-counter (encerrante) at the end of the refueling/dispensing. This decimal 12 integers and 3 decimals - R$ 
   * @return endValueOfPumpNumber
  **/
  public Double getEndValueOfPumpNumber() {
    return endValueOfPumpNumber;
  }
  public void setEndValueOfPumpNumber(Double endValueOfPumpNumber) {
    this.endValueOfPumpNumber = endValueOfPumpNumber;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FuelPumpNumber {\n");
    
    sb.append("    nozzleNumberFuelSupply: ").append(toIndentedString(nozzleNumberFuelSupply)).append("\n");
    sb.append("    fuelPumpNumber: ").append(toIndentedString(fuelPumpNumber)).append("\n");
    sb.append("    fuelTankNumber: ").append(toIndentedString(fuelTankNumber)).append("\n");
    sb.append("    startValueOfPumpNumber: ").append(toIndentedString(startValueOfPumpNumber)).append("\n");
    sb.append("    endValueOfPumpNumber: ").append(toIndentedString(endValueOfPumpNumber)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

