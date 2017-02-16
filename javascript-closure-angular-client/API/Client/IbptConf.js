goog.provide('API.Client.IbptConf');

/**
 * @record
 */
API.Client.IbptConf = function() {}

/**
 * IBPT Code
 * @type {!string}
 * @export
 */
API.Client.IbptConf.prototype.code;

/**
 * @type {!string}
 * @export
 */
API.Client.IbptConf.prototype.description;

/**
 * @type {!Array<!API.Client.IpbtConfItem>}
 * @export
 */
API.Client.IbptConf.prototype.list;

