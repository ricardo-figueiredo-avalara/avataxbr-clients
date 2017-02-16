goog.provide('API.Client.Payment_installment');

/**
 * @record
 */
API.Client.PaymentInstallment = function() {}

/**
 * Instalment number identifier
 * @type {!string}
 * @export
 */
API.Client.PaymentInstallment.prototype.documentNumber;

/**
 * Installment expiration date
 * @type {!API.Client.date}
 * @export
 */
API.Client.PaymentInstallment.prototype.date;

/**
 * Installment value
 * @type {!number}
 * @export
 */
API.Client.PaymentInstallment.prototype.grossValue;

