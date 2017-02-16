goog.provide('API.Client.Payment');

/**
 * @record
 */
API.Client.Payment = function() {}

/**
 * Installment terms - 0 # cash - 1 # on terms - 2 # other 
 * @type {!number}
 * @export
 */
API.Client.Payment.prototype.installmentsTerms;

/**
 * @type {!API.Client.Payment_bill}
 * @export
 */
API.Client.Payment.prototype.bill;

/**
 * @type {!Array<!API.Client.Payment_installment>}
 * @export
 */
API.Client.Payment.prototype.installment;

/**
 * @type {!Array<!API.Client.Payment_paymentMode>}
 * @export
 */
API.Client.Payment.prototype.paymentMode;

