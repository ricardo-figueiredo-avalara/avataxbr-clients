goog.provide('API.Client.LineForGoods_calculatedTax');

/**
 * @record
 */
API.Client.LineForGoodsCalculatedTax = function() {}

/**
 * @type {!API.Client.LineForGoods_calculatedTax_taxByType}
 * @export
 */
API.Client.LineForGoodsCalculatedTax.prototype.taxByType;

/**
 * @type {!number}
 * @export
 */
API.Client.LineForGoodsCalculatedTax.prototype.tax;

/**
 * @type {!Array<!API.Client.DetailsCalculatedTaxItem>}
 * @export
 */
API.Client.LineForGoodsCalculatedTax.prototype.details;

