goog.provide('API.Client.PaymentTransactionOut');

/**
 * @record
 */
API.Client.PaymentTransactionOut = function() {}

/**
 * @type {!API.Client.PayRecHeader}
 * @export
 */
API.Client.PaymentTransactionOut.prototype.header;

/**
 * @type {!Array<!API.Client.PayRecLinesOut>}
 * @export
 */
API.Client.PaymentTransactionOut.prototype.lines;

/**
 * @type {!API.Client.PayRecCalculatedTaxSummaryForService}
 * @export
 */
API.Client.PaymentTransactionOut.prototype.calculatedTaxSummary;

/**
 * @type {!API.Client.ProcessingInfo}
 * @export
 */
API.Client.PaymentTransactionOut.prototype.processingInfo;

