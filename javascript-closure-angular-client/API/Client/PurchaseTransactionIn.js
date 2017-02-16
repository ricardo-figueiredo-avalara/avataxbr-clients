goog.provide('API.Client.PurchaseTransactionIn');

/**
 * @record
 */
API.Client.PurchaseTransactionIn = function() {}

/**
 * @type {!API.Client.PurchaseHeaderIn}
 * @export
 */
API.Client.PurchaseTransactionIn.prototype.header;

/**
 * @type {!Array<!API.Client.PurchaseLinesIn>}
 * @export
 */
API.Client.PurchaseTransactionIn.prototype.lines;

