goog.provide('API.Client.Address');

/**
 * @record
 */
API.Client.Address = function() {}

/**
 * Street Name
 * @type {!string}
 * @export
 */
API.Client.Address.prototype.street;

/**
 * Neighborhood Name
 * @type {!string}
 * @export
 */
API.Client.Address.prototype.neighborhood;

/**
 * Brazilian Zip Code
 * @type {!string}
 * @export
 */
API.Client.Address.prototype.zipcode;

/**
 * City Code (IBGE)
 * @type {!string}
 * @export
 */
API.Client.Address.prototype.cityCode;

/**
 * City Name
 * @type {!string}
 * @export
 */
API.Client.Address.prototype.cityName;

/**
 * @type {!API.Client.StateEnum}
 * @export
 */
API.Client.Address.prototype.state;

/**
 * Country Code
 * @type {!string}
 * @export
 */
API.Client.Address.prototype.countryCode;

/**
 * Use ISO 3166-1 alpha-3 codes
 * @type {!string}
 * @export
 */
API.Client.Address.prototype.country;

