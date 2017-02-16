goog.provide('API.Client.Fuel');

/**
 * @record
 */
API.Client.Fuel = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.Fuel.prototype.prodANPCode;

/**
 * percentage of natural gas (GLP)
 * @type {!number}
 * @export
 */
API.Client.Fuel.prototype.perMixGN;

/**
 * @type {!string}
 * @export
 */
API.Client.Fuel.prototype.authorizationCodeCODIF;

/**
 * This decimal 12 integers and 0 to 4 decimals Quantidade de combustível faturada à temperatura ambiente. Informar quando a quantidade faturada informada no campo qCom (I10) tiver sido ajustada para uma temperatura diferente da ambiente. 
 * @type {!number}
 * @export
 */
API.Client.Fuel.prototype.quantityOnRoomTemperature;

/**
 * state where fuel was used
 * @type {!API.Client.StateEnum}
 * @export
 */
API.Client.Fuel.prototype.stateCodeOfUndUser;

/**
 * @type {!API.Client.Fuel_cide}
 * @export
 */
API.Client.Fuel.prototype.cide;

/**
 * @type {!API.Client.Fuel_pumpNumber}
 * @export
 */
API.Client.Fuel.prototype.pumpNumber;

