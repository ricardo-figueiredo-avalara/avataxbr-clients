package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Fuel_pumpNumber (
  nozzleNumberFuelSupply: String,  // Identification number of nozzle used in the dispensing process.   Numero de identificação do Bico utilizado no abastecimento 
fuelPumpNumber: String,  // Identification number of the Pump connect to the used nozzle.   Numero de identificação da bomba ao qual o bico está interligado 
fuelTankNumber: String,  // Identification number of the Pump connect to the used nozzle.   Numero de identificação da bomba ao qual o bico está interligado 
startValueOfPumpNumber: Double,  // Valor do Encerrante no ínicio do abastecimento.  Reading of auto-counter (encerrante) at the start of the refueling/dispensing. This decimal 12 integers and 3 decimals - R$ 
endValueOfPumpNumber: Double  // Valor do Encerrante no final do abastecimento.  Reading of auto-counter (encerrante) at the end of the refueling/dispensing. This decimal 12 integers and 3 decimals - R$ 
)
