goog.provide('API.Client.TaxByTypeSummaryForService');

/**
 * summary of all taxes
 * @record
 */
API.Client.TaxByTypeSummaryForService = function() {}

/**
 * sum of referenced tax value
 * @type {!number}
 * @export
 */
API.Client.TaxByTypeSummaryForService.prototype.tax;

/**
 * @type {!Array<!API.Client.TaxByTypeSummaryJurisdiction>}
 * @export
 */
API.Client.TaxByTypeSummaryForService.prototype.jurisdictions;

