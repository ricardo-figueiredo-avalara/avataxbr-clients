goog.provide('API.Client.ReceiptTransactionOut');

/**
 * @record
 */
API.Client.ReceiptTransactionOut = function() {}

/**
 * @type {!API.Client.PayRecHeader}
 * @export
 */
API.Client.ReceiptTransactionOut.prototype.header;

/**
 * @type {!Array<!API.Client.PayRecLinesOut>}
 * @export
 */
API.Client.ReceiptTransactionOut.prototype.lines;

/**
 * @type {!API.Client.PayRecCalculatedTaxSummaryForService}
 * @export
 */
API.Client.ReceiptTransactionOut.prototype.calculatedTaxSummary;

/**
 * @type {!API.Client.ProcessingInfo}
 * @export
 */
API.Client.ReceiptTransactionOut.prototype.processingInfo;

