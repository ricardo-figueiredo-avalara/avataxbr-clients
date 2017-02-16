goog.provide('API.Client.SalesTransactionIn');

/**
 * @record
 */
API.Client.SalesTransactionIn = function() {}

/**
 * @type {!API.Client.SalesHeaderIn}
 * @export
 */
API.Client.SalesTransactionIn.prototype.header;

/**
 * @type {!Array<!API.Client.SalesLinesIn>}
 * @export
 */
API.Client.SalesTransactionIn.prototype.lines;

