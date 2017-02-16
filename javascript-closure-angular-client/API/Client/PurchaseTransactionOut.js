goog.provide('API.Client.PurchaseTransactionOut');

/**
 * @record
 */
API.Client.PurchaseTransactionOut = function() {}

/**
 * @type {!API.Client.PurchaseHeaderOut}
 * @export
 */
API.Client.PurchaseTransactionOut.prototype.header;

/**
 * @type {!Array<!API.Client.PurchaseLinesOut>}
 * @export
 */
API.Client.PurchaseTransactionOut.prototype.lines;

/**
 * @type {!API.Client.PurchaseCalculatedTaxSummaryForService}
 * @export
 */
API.Client.PurchaseTransactionOut.prototype.calculatedTaxSummary;

/**
 * @type {!API.Client.ProcessingInfo}
 * @export
 */
API.Client.PurchaseTransactionOut.prototype.processingInfo;

