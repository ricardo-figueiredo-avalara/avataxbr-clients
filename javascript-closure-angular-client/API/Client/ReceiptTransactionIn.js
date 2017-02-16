goog.provide('API.Client.ReceiptTransactionIn');

/**
 * @record
 */
API.Client.ReceiptTransactionIn = function() {}

/**
 * @type {!API.Client.PayRecHeader}
 * @export
 */
API.Client.ReceiptTransactionIn.prototype.header;

/**
 * @type {!Array<!API.Client.PaymentLinesIn>}
 * @export
 */
API.Client.ReceiptTransactionIn.prototype.lines;

