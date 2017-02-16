goog.provide('API.Client.SalesCalculatedTaxSummaryForService');

/**
 * @record
 */
API.Client.SalesCalculatedTaxSummaryForService = function() {}

/**
 * Count of lines
 * @type {!number}
 * @export
 */
API.Client.SalesCalculatedTaxSummaryForService.prototype.numberOfLines;

/**
 * sum of all line tax attribute
 * @type {!number}
 * @export
 */
API.Client.SalesCalculatedTaxSummaryForService.prototype.subtotal;

/**
 * sum of all line lineAmount attribute
 * @type {!number}
 * @export
 */
API.Client.SalesCalculatedTaxSummaryForService.prototype.totalTax;

/**
 * sum of all line lineAmount attribute - sum of all line tax attribute - sum of all line lineTaxedDiscount attribute
 * @type {!number}
 * @export
 */
API.Client.SalesCalculatedTaxSummaryForService.prototype.grandTotal;

/**
 * @type {!API.Client.SalesCalculatedTaxSummaryForService_taxByType}
 * @export
 */
API.Client.SalesCalculatedTaxSummaryForService.prototype.taxByType;

