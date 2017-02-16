goog.provide('API.Client.PayRecLinesIn');

/**
 * @record
 */
API.Client.PayRecLinesIn = function() {}

/**
 * Installment number in this document
 * @type {!number}
 * @export
 */
API.Client.PayRecLinesIn.prototype.lineCode;

/**
 * @type {!string}
 * @export
 */
API.Client.PayRecLinesIn.prototype.lineType;

/**
 * Bill transaction code This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc.
 * @type {!string}
 * @export
 */
API.Client.PayRecLinesIn.prototype.itemCode;

/**
 * Free description about this payment
 * @type {!string}
 * @export
 */
API.Client.PayRecLinesIn.prototype.itemDescription;

/**
 * Installment number, when paid AS IS
 * @type {!string}
 * @export
 */
API.Client.PayRecLinesIn.prototype.itemDocNumber;

/**
 * Penalty, usually because paid after due date
 * @type {!number}
 * @export
 */
API.Client.PayRecLinesIn.prototype.lineUntaxedPenality;

/**
 * unconditional discounts
 * @type {!number}
 * @export
 */
API.Client.PayRecLinesIn.prototype.lineUntaxedDiscount;

/** @enum {string} */
API.Client.PayRecLinesIn.LineTypeEnum = { 
  installment: 'installment',
}
