goog.provide('API.Client.SalesLinesIn');

/**
 * @record
 */
API.Client.SalesLinesIn = function() {}

/**
 * This string is a unique identifier for this line in the transaction
 * @type {!number}
 * @export
 */
API.Client.SalesLinesIn.prototype.lineCode;

/**
 * This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU and is required for SST states.
 * @type {!string}
 * @export
 */
API.Client.SalesLinesIn.prototype.itemCode;

/**
 * This decimal captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1
 * @type {!number}
 * @export
 */
API.Client.SalesLinesIn.prototype.numberOfItems;

/**
 * This decimal captures the total cost of this line. In its simplest form lineAmount = (item price * numberOfItems).
 * @type {!number}
 * @export
 */
API.Client.SalesLinesIn.prototype.lineAmount;

/**
 * This string captures the description of the item represented by this line, will be used LC 116
 * @type {!string}
 * @export
 */
API.Client.SalesLinesIn.prototype.itemDescription;

/**
 * Conditional discount
 * @type {!number}
 * @export
 */
API.Client.SalesLinesIn.prototype.lineTaxedDiscount;

/**
 * Unconditional discount
 * @type {!number}
 * @export
 */
API.Client.SalesLinesIn.prototype.lineUntaxedDiscount;

/**
 * @type {!API.Client.SalesLinesIn_taxDeductions}
 * @export
 */
API.Client.SalesLinesIn.prototype.taxDeductions;

