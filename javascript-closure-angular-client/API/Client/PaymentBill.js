goog.provide('API.Client.Payment_bill');

/**
 * Bill information
 * @record
 */
API.Client.PaymentBill = function() {}

/**
 * Bill identifier
 * @type {!string}
 * @export
 */
API.Client.PaymentBill.prototype.nFat;

/**
 * Orignal value
 * @type {!number}
 * @export
 */
API.Client.PaymentBill.prototype.vOrig;

/**
 * Discount
 * @type {!number}
 * @export
 */
API.Client.PaymentBill.prototype.vDiscount;

/**
 * Net value
 * @type {!number}
 * @export
 */
API.Client.PaymentBill.prototype.vNet;

