goog.provide('API.Client.Fuel_pumpNumber');

/**
 * @record
 */
API.Client.FuelPumpNumber = function() {}

/**
 * Identification number of nozzle used in the dispensing process.   Numero de identificação do Bico utilizado no abastecimento 
 * @type {!string}
 * @export
 */
API.Client.FuelPumpNumber.prototype.nozzleNumberFuelSupply;

/**
 * Identification number of the Pump connect to the used nozzle.   Numero de identificação da bomba ao qual o bico está interligado 
 * @type {!string}
 * @export
 */
API.Client.FuelPumpNumber.prototype.fuelPumpNumber;

/**
 * Identification number of the Pump connect to the used nozzle.   Numero de identificação da bomba ao qual o bico está interligado 
 * @type {!string}
 * @export
 */
API.Client.FuelPumpNumber.prototype.fuelTankNumber;

/**
 * Valor do Encerrante no ínicio do abastecimento.  Reading of auto-counter (encerrante) at the start of the refueling/dispensing. This decimal 12 integers and 3 decimals - R$ 
 * @type {!number}
 * @export
 */
API.Client.FuelPumpNumber.prototype.startValueOfPumpNumber;

/**
 * Valor do Encerrante no final do abastecimento.  Reading of auto-counter (encerrante) at the end of the refueling/dispensing. This decimal 12 integers and 3 decimals - R$ 
 * @type {!number}
 * @export
 */
API.Client.FuelPumpNumber.prototype.endValueOfPumpNumber;

