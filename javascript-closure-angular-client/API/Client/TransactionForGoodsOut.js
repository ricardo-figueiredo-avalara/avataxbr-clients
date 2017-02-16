goog.provide('API.Client.TransactionForGoodsOut');

/**
 * @record
 */
API.Client.TransactionForGoodsOut = function() {}

/**
 * @type {!API.Client.HeaderForGoods}
 * @export
 */
API.Client.TransactionForGoodsOut.prototype.header;

/**
 * @type {!Array<!API.Client.LineForGoods>}
 * @export
 */
API.Client.TransactionForGoodsOut.prototype.lines;

/**
 * @type {!API.Client.CalculatedTaxSummaryForGoods}
 * @export
 */
API.Client.TransactionForGoodsOut.prototype.calculatedTaxSummary;

/**
 * @type {!API.Client.ProcessingInfo}
 * @export
 */
API.Client.TransactionForGoodsOut.prototype.processingInfo;

