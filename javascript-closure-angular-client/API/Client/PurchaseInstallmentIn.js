goog.provide('API.Client.PurchaseInstallmentIn');

/**
 * @record
 */
API.Client.PurchaseInstallmentIn = function() {}

/**
 * DOCNUMBER, ID OF THIS DOCUMENT FOR THIS transaction
 * @type {!string}
 * @export
 */
API.Client.PurchaseInstallmentIn.prototype.documentNumber;

/**
 * installment, Due Date
 * @type {!API.Client.date}
 * @export
 */
API.Client.PurchaseInstallmentIn.prototype.date;

/**
 * Intallment value, fraction of  ∑(lineAmount - lineTaxedDiscount)
 * @type {!number}
 * @export
 */
API.Client.PurchaseInstallmentIn.prototype.grossValue;

