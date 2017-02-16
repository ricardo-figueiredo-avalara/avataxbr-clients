goog.provide('API.Client.SalesTransactionOut');

/**
 * @record
 */
API.Client.SalesTransactionOut = function() {}

/**
 * @type {!API.Client.SalesHeaderOut}
 * @export
 */
API.Client.SalesTransactionOut.prototype.header;

/**
 * @type {!Array<!API.Client.SalesLinesOut>}
 * @export
 */
API.Client.SalesTransactionOut.prototype.lines;

/**
 * @type {!API.Client.SalesCalculatedTaxSummaryForService}
 * @export
 */
API.Client.SalesTransactionOut.prototype.calculatedTaxSummary;

/**
 * @type {!API.Client.ProcessingInfo}
 * @export
 */
API.Client.SalesTransactionOut.prototype.processingInfo;

