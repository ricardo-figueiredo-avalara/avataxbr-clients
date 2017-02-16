goog.provide('API.Client.VehicleID');

/**
 * @record
 */
API.Client.VehicleID = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.VehicleID.prototype.licensePlate;

/**
 * @type {!API.Client.StateEnum}
 * @export
 */
API.Client.VehicleID.prototype.stateCode;

/**
 * Cargo Transport National Register, Registro Nacional de Transportador de Carga (ANTT)
 * @type {!string}
 * @export
 */
API.Client.VehicleID.prototype.rtnc;

