goog.provide('API.Client.CalculatedTaxSummaryForGoods');

/**
 * @record
 */
API.Client.CalculatedTaxSummaryForGoods = function() {}

/**
 * Count of lines
 * @type {!number}
 * @export
 */
API.Client.CalculatedTaxSummaryForGoods.prototype.numberOfLines;

/**
 * sum of all line taxed discounts
 * @type {!number}
 * @export
 */
API.Client.CalculatedTaxSummaryForGoods.prototype.taxedDiscount;

/**
 * sum of all line untaxed discounts
 * @type {!number}
 * @export
 */
API.Client.CalculatedTaxSummaryForGoods.prototype.untaxedDiscount;

/**
 * sum of all line lineAmount attribute
 * @type {!number}
 * @export
 */
API.Client.CalculatedTaxSummaryForGoods.prototype.subtotal;

/**
 * sum of all line tax attribute
 * @type {!number}
 * @export
 */
API.Client.CalculatedTaxSummaryForGoods.prototype.totalTax;

/**
 * sum of all line lineAmount attribute + sum of all line tax attribute not VAT - sum of all line lineTaxedDiscount attribute
 * @type {!number}
 * @export
 */
API.Client.CalculatedTaxSummaryForGoods.prototype.grandTotal;

/**
 * @type {!API.Client.CalculatedTaxSummaryForGoods_taxByType}
 * @export
 */
API.Client.CalculatedTaxSummaryForGoods.prototype.taxByType;

