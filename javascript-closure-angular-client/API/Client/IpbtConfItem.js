goog.provide('API.Client.IpbtConfItem');

/**
 * @record
 */
API.Client.IpbtConfItem = function() {}

/**
 * @type {!API.Client.StateEnum}
 * @export
 */
API.Client.IpbtConfItem.prototype.state;

/**
 * @type {!number}
 * @export
 */
API.Client.IpbtConfItem.prototype.federalTax;

/**
 * @type {!number}
 * @export
 */
API.Client.IpbtConfItem.prototype.importTax;

/**
 * @type {!number}
 * @export
 */
API.Client.IpbtConfItem.prototype.stateTax;

/**
 * @type {!number}
 * @export
 */
API.Client.IpbtConfItem.prototype.cityTax;

/**
 * @type {!string}
 * @export
 */
API.Client.IpbtConfItem.prototype.source;

