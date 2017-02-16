goog.provide('API.Client.SalesLinesOut');

/**
 * @record
 */
API.Client.SalesLinesOut = function() {}

/**
 * This string is a unique identifier for this line in the transaction
 * @type {!number}
 * @export
 */
API.Client.SalesLinesOut.prototype.lineCode;

/**
 * This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU and is required for SST states.
 * @type {!string}
 * @export
 */
API.Client.SalesLinesOut.prototype.itemCode;

/**
 * This decimal captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1
 * @type {!number}
 * @export
 */
API.Client.SalesLinesOut.prototype.numberOfItems;

/**
 * This decimal captures the total cost of this line. In its simplest form lineAmount = (item price * numberOfItems).
 * @type {!number}
 * @export
 */
API.Client.SalesLinesOut.prototype.lineAmount;

/**
 * This string captures the description of the item represented by this line, will be used LC 116
 * @type {!string}
 * @export
 */
API.Client.SalesLinesOut.prototype.itemDescription;

/**
 * Conditional discount
 * @type {!number}
 * @export
 */
API.Client.SalesLinesOut.prototype.lineTaxedDiscount;

/**
 * Unconditional discount
 * @type {!number}
 * @export
 */
API.Client.SalesLinesOut.prototype.lineUntaxedDiscount;

/**
 * @type {!API.Client.SalesLinesOut_taxDeductions}
 * @export
 */
API.Client.SalesLinesOut.prototype.taxDeductions;

/**
 * AGAST CODE for itemCode
 * @type {!string}
 * @export
 */
API.Client.SalesLinesOut.prototype.avalaraGoodsAndServicesType;

/**
 * This decimal captures the total cost of this line. In its simplest form lineNetValue = (lineAmount - discountTaxable - sum of whithholdings).
 * @type {!number}
 * @export
 */
API.Client.SalesLinesOut.prototype.lineNetValue;

/**
 * - '01' # ORIGIN MODE - '02' # ORIGIN MODE BUT EXEMPT - '03' # ORIGIN MODE BUT IMMUNE - '04' # ORIGIN MODE BUT SUSPENDED FOR LEGAL REASON - '05' # ORIGIN MODE BUT SUSPENDED FOR ADMINISTRATIVE REASON - '21' # DESTINATION MODE - '22' # DESTINATION MODE BUT EXEMPT - '23' # DESTINATION MODE BUT IMMUNE - '24' # DESTINATION MODE BUT SUSPENDED - '25' # DESTINATION MODE BUT SUSPENDED - '40' # FOREIGN IMMUNE MODE 
 * @type {!string}
 * @export
 */
API.Client.SalesLinesOut.prototype.cst;

/**
 * - '61' # WITHHOLD NORMAL MODE - '62' # WITHHOLD NORMAL MODE BUT EXEMPT - '63' # WITHHOLD NORMAL MODE BUT IMMUNE - '64' # WITHHOLD NORMAL MODE BUT SUSPENDED FOR LEGAL REASON - '65' # WITHHOLD NORMAL MODE BUT SUSPENDED FOR ADMINISTRATIVE REASON - '66' # WITHHOLD FORCED MODE - '67' # WITHHOLD FORCED MODE BUT EXEMPT - '68' # WITHHOLD FORCED MODE BUT IMMUNE - '69' # WITHHOLD FORCED MODE BUT SUSPENDED FOR LEGAL REASON - '70' # WITHHOLD FORCED MODE BUT SUSPENDED FOR ADMINISTRATIVE PROCESS - '71' # NO WITHHOLD MODE - '72' # NO WITHHOLD FOREIGN MODE 
 * @type {!string}
 * @export
 */
API.Client.SalesLinesOut.prototype.cstRf;

/**
 * @type {!API.Client.SalesCalculatedTax}
 * @export
 */
API.Client.SalesLinesOut.prototype.calculatedTax;

/** @enum {string} */
API.Client.SalesLinesOut.CstEnum = { 
  01: '01',
  02: '02',
  03: '03',
  04: '04',
  05: '05',
  21: '21',
  22: '22',
  23: '23',
  24: '24',
  25: '25',
  40: '40',
}
/** @enum {string} */
API.Client.SalesLinesOut.CstRfEnum = { 
  61: '61',
  62: '62',
  63: '63',
  64: '64',
  65: '65',
  66: '66',
  67: '67',
  68: '68',
  69: '69',
  70: '70',
  71: '71',
  72: '72',
}
