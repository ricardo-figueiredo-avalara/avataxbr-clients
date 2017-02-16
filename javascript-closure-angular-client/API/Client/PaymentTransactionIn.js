goog.provide('API.Client.PaymentTransactionIn');

/**
 * @record
 */
API.Client.PaymentTransactionIn = function() {}

/**
 * @type {!API.Client.PayRecHeader}
 * @export
 */
API.Client.PaymentTransactionIn.prototype.header;

/**
 * @type {!Array<!API.Client.PaymentLinesIn>}
 * @export
 */
API.Client.PaymentTransactionIn.prototype.lines;

