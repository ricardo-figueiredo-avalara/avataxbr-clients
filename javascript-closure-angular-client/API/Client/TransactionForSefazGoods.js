goog.provide('API.Client.TransactionForSefazGoods');

/**
 * @record
 */
API.Client.TransactionForSefazGoods = function() {}

/**
 * @type {!API.Client.HeaderForGoods}
 * @export
 */
API.Client.TransactionForSefazGoods.prototype.header;

/**
 * @type {!Array<!API.Client.LineForSefazGoods>}
 * @export
 */
API.Client.TransactionForSefazGoods.prototype.lines;

/**
 * @type {!API.Client.CalculatedTaxSummaryForGoods}
 * @export
 */
API.Client.TransactionForSefazGoods.prototype.calculatedTaxSummary;

