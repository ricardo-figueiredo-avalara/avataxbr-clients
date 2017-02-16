goog.provide('API.Client.SalesCalculatedTax');

/**
 * @record
 */
API.Client.SalesCalculatedTax = function() {}

/**
 * @type {!API.Client.SalesTaxByType}
 * @export
 */
API.Client.SalesCalculatedTax.prototype.taxByType;

/**
 * Sum of tax type not VAT (Value Added Tax)
 * @type {!number}
 * @export
 */
API.Client.SalesCalculatedTax.prototype.tax;

/**
 * @type {!Array<!API.Client.SalesTaxByTypeDetail>}
 * @export
 */
API.Client.SalesCalculatedTax.prototype.details;

