goog.provide('API.Client.PaymentCalculatedTax');

/**
 * Structure with value for each tax withhold value of this line
 * @record
 */
API.Client.PaymentCalculatedTax = function() {}

/**
 * @type {!API.Client.PaymentTaxByType}
 * @export
 */
API.Client.PaymentCalculatedTax.prototype.taxByType;

/**
 * Sum of tax type not VAT (Value Added Tax)
 * @type {!number}
 * @export
 */
API.Client.PaymentCalculatedTax.prototype.tax;

