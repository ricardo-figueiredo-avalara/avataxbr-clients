goog.provide('API.Client.PurchaseCalculatedTaxSummaryForService');

/**
 * @record
 */
API.Client.PurchaseCalculatedTaxSummaryForService = function() {}

/**
 * Count of lines
 * @type {!number}
 * @export
 */
API.Client.PurchaseCalculatedTaxSummaryForService.prototype.numberOfLines;

/**
 * sum of all line tax attribute
 * @type {!number}
 * @export
 */
API.Client.PurchaseCalculatedTaxSummaryForService.prototype.subtotal;

/**
 * sum of all line lineAmount attribute
 * @type {!number}
 * @export
 */
API.Client.PurchaseCalculatedTaxSummaryForService.prototype.totalTax;

/**
 * sum of all line lineAmount attribute - sum of all line tax attribute - sum of all line lineTaxedDiscount attribute
 * @type {!number}
 * @export
 */
API.Client.PurchaseCalculatedTaxSummaryForService.prototype.grandTotal;

/**
 * @type {!API.Client.PurchaseCalculatedTaxSummaryForService_taxByType}
 * @export
 */
API.Client.PurchaseCalculatedTaxSummaryForService.prototype.taxByType;

