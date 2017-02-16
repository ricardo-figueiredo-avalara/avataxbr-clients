goog.provide('API.Client.SalesInstallmentIn');

/**
 * @record
 */
API.Client.SalesInstallmentIn = function() {}

/**
 * DOCNUMBER, ID OF THIS DOCUMENT FOR THIS transaction
 * @type {!string}
 * @export
 */
API.Client.SalesInstallmentIn.prototype.documentNumber;

/**
 * installment Due Date
 * @type {!API.Client.date}
 * @export
 */
API.Client.SalesInstallmentIn.prototype.date;

/**
 * Intallment value, fraction of  ∑(lineAmount - lineTaxedDiscount)
 * @type {!number}
 * @export
 */
API.Client.SalesInstallmentIn.prototype.grossValue;

