goog.provide('API.Client.PaymentTaxByType');

/**
 * Object with summary of all taxes returned by engine
 * @record
 */
API.Client.PaymentTaxByType = function() {}

/**
 * @type {!API.Client.TaxByTypeTax}
 * @export
 */
API.Client.PaymentTaxByType.prototype.irrf;

/**
 * @type {!API.Client.TaxByTypeTax}
 * @export
 */
API.Client.PaymentTaxByType.prototype.inssRf;

/**
 * @type {!API.Client.TaxByTypeTax}
 * @export
 */
API.Client.PaymentTaxByType.prototype.issRf;

/**
 * @type {!API.Client.TaxByTypeTax}
 * @export
 */
API.Client.PaymentTaxByType.prototype.pisRf;

/**
 * @type {!API.Client.TaxByTypeTax}
 * @export
 */
API.Client.PaymentTaxByType.prototype.cofinsRf;

/**
 * @type {!API.Client.TaxByTypeTax}
 * @export
 */
API.Client.PaymentTaxByType.prototype.csllRf;

