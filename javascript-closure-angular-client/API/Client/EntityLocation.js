goog.provide('API.Client.EntityLocation');

/**
 * @record
 */
API.Client.EntityLocation = function() {}

/**
 * Street Name
 * @type {!string}
 * @export
 */
API.Client.EntityLocation.prototype.street;

/**
 * Neighborhood Name
 * @type {!string}
 * @export
 */
API.Client.EntityLocation.prototype.neighborhood;

/**
 * Brazilian Zip Code
 * @type {!string}
 * @export
 */
API.Client.EntityLocation.prototype.zipcode;

/**
 * City Code (IBGE)
 * @type {!string}
 * @export
 */
API.Client.EntityLocation.prototype.cityCode;

/**
 * City Name
 * @type {!string}
 * @export
 */
API.Client.EntityLocation.prototype.cityName;

/**
 * @type {!API.Client.StateEnum}
 * @export
 */
API.Client.EntityLocation.prototype.state;

/**
 * Country Code
 * @type {!string}
 * @export
 */
API.Client.EntityLocation.prototype.countryCode;

/**
 * Use ISO 3166-1 alpha-3 codes
 * @type {!string}
 * @export
 */
API.Client.EntityLocation.prototype.country;

