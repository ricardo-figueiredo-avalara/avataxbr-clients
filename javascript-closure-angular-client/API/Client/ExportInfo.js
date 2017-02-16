goog.provide('API.Client.ExportInfo');

/**
 * Export information
 * @record
 */
API.Client.ExportInfo = function() {}

/**
 * shipping state
 * @type {!API.Client.StateEnum}
 * @export
 */
API.Client.ExportInfo.prototype.shippingState;

/**
 * shipping place
 * @type {!string}
 * @export
 */
API.Client.ExportInfo.prototype.place;

/**
 * description of shipping place
 * @type {!string}
 * @export
 */
API.Client.ExportInfo.prototype.placeDescription;

