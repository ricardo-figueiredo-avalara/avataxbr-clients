goog.provide('API.Client.Fuel_cide');

/**
 * @record
 */
API.Client.FuelCide = function() {}

/**
 * percentage of natural gas (GLP), this decimal 12 integers and 0 to 4 decimals
 * @type {!number}
 * @export
 */
API.Client.FuelCide.prototype.baseCalcCIDE;

/**
 * percentage of natural gas (GLP), this decimal 11 integers and 0 to 4 decimals - R$
 * @type {!number}
 * @export
 */
API.Client.FuelCide.prototype.rateCIDE;

/**
 * percentage of natural gas (GLP), this decimal 13 integers and 2 decimals - R$
 * @type {!number}
 * @export
 */
API.Client.FuelCide.prototype.valueCIDE;

