goog.provide('API.Client.PurchaseLinesOut');

/**
 * @record
 */
API.Client.PurchaseLinesOut = function() {}

/**
 * This string is a unique identifier for this line in the transaction
 * @type {!number}
 * @export
 */
API.Client.PurchaseLinesOut.prototype.lineCode;

/**
 * This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU and is required for SST states.
 * @type {!string}
 * @export
 */
API.Client.PurchaseLinesOut.prototype.itemCode;

/**
 * This decimal captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1
 * @type {!number}
 * @export
 */
API.Client.PurchaseLinesOut.prototype.numberOfItems;

/**
 * This decimal captures the total cost of this line. In its simplest form lineAmount = (item price * numberOfItems).
 * @type {!number}
 * @export
 */
API.Client.PurchaseLinesOut.prototype.lineAmount;

/**
 * This string captures the description of the item represented by this line, will be used LC 116
 * @type {!string}
 * @export
 */
API.Client.PurchaseLinesOut.prototype.itemDescription;

/**
 * Conditional discount
 * @type {!number}
 * @export
 */
API.Client.PurchaseLinesOut.prototype.lineTaxedDiscount;

/**
 * Unconditional discount
 * @type {!number}
 * @export
 */
API.Client.PurchaseLinesOut.prototype.lineUntaxedDiscount;

/**
 * Type of entity use associated with this line - 'resale' - 'production' - 'use or consumption' - 'fixed assets' 
 * @type {!string}
 * @export
 */
API.Client.PurchaseLinesOut.prototype.useType;

/**
 * @type {!API.Client.SalesLinesOut_taxDeductions}
 * @export
 */
API.Client.PurchaseLinesOut.prototype.taxDeductions;

/**
 * AGAST CODE for itemCode
 * @type {!string}
 * @export
 */
API.Client.PurchaseLinesOut.prototype.avalaraGoodsAndServicesType;

/**
 * This decimal captures the value of lineAmount - lineTaxedDiscount - sum of withholding.
 * @type {!number}
 * @export
 */
API.Client.PurchaseLinesOut.prototype.lineNetValue;

/**
 * @type {!API.Client.PurchaseCalculatedTax}
 * @export
 */
API.Client.PurchaseLinesOut.prototype.calculatedTax;

/** @enum {string} */
API.Client.PurchaseLinesOut.UseTypeEnum = { 
  resale: 'resale',
  production: 'production',
  use or consumption: 'use or consumption',
  fixed assets: 'fixed assets',
}
