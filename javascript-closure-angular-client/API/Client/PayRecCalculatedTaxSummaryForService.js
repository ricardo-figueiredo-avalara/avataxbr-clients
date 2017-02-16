goog.provide('API.Client.PayRecCalculatedTaxSummaryForService');

/**
 * @record
 */
API.Client.PayRecCalculatedTaxSummaryForService = function() {}

/**
 * Count of lines
 * @type {!number}
 * @export
 */
API.Client.PayRecCalculatedTaxSummaryForService.prototype.numberOfLines;

/**
 * Sum of grossvalues
 * @type {!number}
 * @export
 */
API.Client.PayRecCalculatedTaxSummaryForService.prototype.subtotal;

/**
 * Sum of all withholding values
 * @type {!number}
 * @export
 */
API.Client.PayRecCalculatedTaxSummaryForService.prototype.totalTax;

/**
 * Sum all NetValues
 * @type {!number}
 * @export
 */
API.Client.PayRecCalculatedTaxSummaryForService.prototype.grandTotal;

/**
 * @type {!Array<!API.Client.PccWithholdingMode>}
 * @export
 */
API.Client.PayRecCalculatedTaxSummaryForService.prototype.pccWithholdingModes;

/**
 * @type {!API.Client.PayRecCalculatedTaxSummaryForService_taxByType}
 * @export
 */
API.Client.PayRecCalculatedTaxSummaryForService.prototype.taxByType;

