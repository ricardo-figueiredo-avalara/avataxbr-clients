package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class FuelPumpNumber {

  /* Identification number of nozzle used in the dispensing process.   Numero de identificação do Bico utilizado no abastecimento  */
  String nozzleNumberFuelSupply = null

  /* Identification number of the Pump connect to the used nozzle.   Numero de identificação da bomba ao qual o bico está interligado  */
  String fuelPumpNumber = null

  /* Identification number of the Pump connect to the used nozzle.   Numero de identificação da bomba ao qual o bico está interligado  */
  String fuelTankNumber = null

  /* Valor do Encerrante no ínicio do abastecimento.  Reading of auto-counter (encerrante) at the start of the refueling/dispensing. This decimal 12 integers and 3 decimals - R$  */
  Double startValueOfPumpNumber = null

  /* Valor do Encerrante no final do abastecimento.  Reading of auto-counter (encerrante) at the end of the refueling/dispensing. This decimal 12 integers and 3 decimals - R$  */
  Double endValueOfPumpNumber = null
  

}

