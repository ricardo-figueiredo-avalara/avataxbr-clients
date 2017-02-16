goog.provide('API.Client.PaymentLinesIn');

/**
 * @record
 */
API.Client.PaymentLinesIn = function() {}

/**
 * Installment number in this document
 * @type {!number}
 * @export
 */
API.Client.PaymentLinesIn.prototype.lineCode;

/**
 * @type {!string}
 * @export
 */
API.Client.PaymentLinesIn.prototype.lineType;

/**
 * Bill transaction code This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc.
 * @type {!string}
 * @export
 */
API.Client.PaymentLinesIn.prototype.itemCode;

/**
 * Free description about this payment
 * @type {!string}
 * @export
 */
API.Client.PaymentLinesIn.prototype.itemDescription;

/**
 * Installment number, when paid AS IS
 * @type {!string}
 * @export
 */
API.Client.PaymentLinesIn.prototype.itemDocNumber;

/**
 * Penalty, usually because paid after due date
 * @type {!number}
 * @export
 */
API.Client.PaymentLinesIn.prototype.lineUntaxedPenality;

/**
 * unconditional discounts
 * @type {!number}
 * @export
 */
API.Client.PaymentLinesIn.prototype.lineUntaxedDiscount;

/**
 * Net value, the net Value is Gross value plus penalty minus sum of discount and withhold taxes
 * @type {!number}
 * @export
 */
API.Client.PaymentLinesIn.prototype.lineNetValue;

/** @enum {string} */
API.Client.PaymentLinesIn.LineTypeEnum = { 
  installment: 'installment',
}
