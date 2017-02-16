goog.provide('API.Client.TransactionForGoodsIn');

/**
 * @record
 */
API.Client.TransactionForGoodsIn = function() {}

/**
 * @type {!API.Client.HeaderForGoods}
 * @export
 */
API.Client.TransactionForGoodsIn.prototype.header;

/**
 * @type {!Array<!API.Client.LineForGoods>}
 * @export
 */
API.Client.TransactionForGoodsIn.prototype.lines;

