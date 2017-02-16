goog.provide('API.Client.SalesHeaderIn_payment');

/**
 * @record
 */
API.Client.SalesHeaderInPayment = function() {}

/**
 * @type {!API.Client.PaymentTerms}
 * @export
 */
API.Client.SalesHeaderInPayment.prototype.terms;

/**
 * installments
 * @type {!Array<!API.Client.SalesInstallmentIn>}
 * @export
 */
API.Client.SalesHeaderInPayment.prototype.installments;

