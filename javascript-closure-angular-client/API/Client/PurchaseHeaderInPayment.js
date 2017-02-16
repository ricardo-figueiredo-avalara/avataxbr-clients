goog.provide('API.Client.PurchaseHeaderIn_payment');

/**
 * @record
 */
API.Client.PurchaseHeaderInPayment = function() {}

/**
 * @type {!API.Client.PaymentTerms}
 * @export
 */
API.Client.PurchaseHeaderInPayment.prototype.terms;

/**
 * installments
 * @type {!Array<!API.Client.PurchaseInstallmentIn>}
 * @export
 */
API.Client.PurchaseHeaderInPayment.prototype.installments;

