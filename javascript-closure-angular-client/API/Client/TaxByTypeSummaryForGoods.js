goog.provide('API.Client.TaxByTypeSummaryForGoods');

/**
 * summary of all taxes
 * @record
 */
API.Client.TaxByTypeSummaryForGoods = function() {}

/**
 * sum of all lines calcbase
 * @type {!number}
 * @export
 */
API.Client.TaxByTypeSummaryForGoods.prototype.calcbase;

/**
 * sum of referenced tax value
 * @type {!number}
 * @export
 */
API.Client.TaxByTypeSummaryForGoods.prototype.tax;

/**
 * @type {!Array<!API.Client.TaxByTypeSummaryJurisdictionForGoods>}
 * @export
 */
API.Client.TaxByTypeSummaryForGoods.prototype.jurisdictions;

