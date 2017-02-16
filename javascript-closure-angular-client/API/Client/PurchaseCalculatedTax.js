goog.provide('API.Client.PurchaseCalculatedTax');

/**
 * @record
 */
API.Client.PurchaseCalculatedTax = function() {}

/**
 * @type {!API.Client.PurchaseTaxByType}
 * @export
 */
API.Client.PurchaseCalculatedTax.prototype.taxByType;

/**
 * Sum of tax type not VAT (Value Added Tax)
 * @type {!number}
 * @export
 */
API.Client.PurchaseCalculatedTax.prototype.tax;

/**
 * @type {!Array<!API.Client.PurchaseTaxByTypeDetail>}
 * @export
 */
API.Client.PurchaseCalculatedTax.prototype.details;

