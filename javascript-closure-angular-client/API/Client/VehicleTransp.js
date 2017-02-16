goog.provide('API.Client.VehicleTransp');

/**
 * Identify type of vehicle used to transport the attributes, except atribute type,  follow rule allOf then only one of this atributes will be informed. 
 * @record
 */
API.Client.VehicleTransp = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.VehicleTransp.prototype.type;

/**
 * @type {!API.Client.VehicleID}
 * @export
 */
API.Client.VehicleTransp.prototype.automobile;

/**
 * Trailer
 * @type {!Array<!API.Client.VehicleID>}
 * @export
 */
API.Client.VehicleTransp.prototype.trailer;

/**
 * @type {!string}
 * @export
 */
API.Client.VehicleTransp.prototype.wagon;

/**
 * Ferry
 * @type {!string}
 * @export
 */
API.Client.VehicleTransp.prototype.ferry;

/** @enum {string} */
API.Client.VehicleTransp.TypeEnum = { 
  automobile: 'automobile',
  wagon: 'wagon',
  ferry: 'ferry',
  trailer: 'trailer',
}
