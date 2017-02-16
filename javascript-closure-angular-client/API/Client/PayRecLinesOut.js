goog.provide('API.Client.PayRecLinesOut');

/**
 * @record
 */
API.Client.PayRecLinesOut = function() {}

/**
 * Installment number in this document
 * @type {!number}
 * @export
 */
API.Client.PayRecLinesOut.prototype.lineCode;

/**
 * @type {!string}
 * @export
 */
API.Client.PayRecLinesOut.prototype.lineType;

/**
 * Bill transaction code This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc.
 * @type {!string}
 * @export
 */
API.Client.PayRecLinesOut.prototype.itemCode;

/**
 * Free description about this payment
 * @type {!string}
 * @export
 */
API.Client.PayRecLinesOut.prototype.itemDescription;

/**
 * Installment number, when paid AS IS
 * @type {!string}
 * @export
 */
API.Client.PayRecLinesOut.prototype.itemDocNumber;

/**
 * Penalty, usually because paid after due date
 * @type {!number}
 * @export
 */
API.Client.PayRecLinesOut.prototype.lineUntaxedPenality;

/**
 * unconditional discounts
 * @type {!number}
 * @export
 */
API.Client.PayRecLinesOut.prototype.lineUntaxedDiscount;

/**
 * GrossAmount of this installment line
 * @type {!number}
 * @export
 */
API.Client.PayRecLinesOut.prototype.lineAmount;

/**
 * Net value, the net Value is Gross value plus penalty minus sum of discount and withhold taxes
 * @type {!number}
 * @export
 */
API.Client.PayRecLinesOut.prototype.lineNetValue;

/**
 * x is because not subject of this tax independent of Threshold
 * @type {!API.Client.WithholdingMode}
 * @export
 */
API.Client.PayRecLinesOut.prototype.withholdingMode;

/**
 * @type {!API.Client.PaymentCalculatedTax}
 * @export
 */
API.Client.PayRecLinesOut.prototype.calculatedTax;

/** @enum {string} */
API.Client.PayRecLinesOut.LineTypeEnum = { 
  installment: 'installment',
}
