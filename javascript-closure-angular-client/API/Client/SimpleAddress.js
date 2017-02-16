goog.provide('API.Client.SimpleAddress');

/**
 * @record
 */
API.Client.SimpleAddress = function() {}

/**
 * Address
 * @type {!string}
 * @export
 */
API.Client.SimpleAddress.prototype.line1;

/**
 * Number
 * @type {!string}
 * @export
 */
API.Client.SimpleAddress.prototype.line2;

/**
 * District
 * @type {!string}
 * @export
 */
API.Client.SimpleAddress.prototype.line3;

/**
 * @type {!string}
 * @export
 */
API.Client.SimpleAddress.prototype.city;

/**
 * Brazilian Zip Code
 * @type {!string}
 * @export
 */
API.Client.SimpleAddress.prototype.zipcode;

/**
 * @type {!API.Client.StateEnum}
 * @export
 */
API.Client.SimpleAddress.prototype.state;

/**
 * Use ISO 3166-1 alpha-3 codes
 * @type {!string}
 * @export
 */
API.Client.SimpleAddress.prototype.country;

