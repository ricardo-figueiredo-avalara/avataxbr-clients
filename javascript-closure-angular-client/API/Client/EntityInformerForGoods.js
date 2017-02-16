goog.provide('API.Client.EntityInformerForGoods');

/**
 * @record
 */
API.Client.EntityInformerForGoods = function() {}

/**
 * @type {!API.Client.EntityType}
 * @export
 */
API.Client.EntityInformerForGoods.prototype.type;

/**
 * @type {!API.Client.FederalTaxRegime}
 * @export
 */
API.Client.EntityInformerForGoods.prototype.taxRegime;

/**
 * @type {!API.Client.EntityInformerForGoods_federalTaxRegime}
 * @export
 */
API.Client.EntityInformerForGoods.prototype.federalTaxRegime;

/**
 * @type {!string}
 * @export
 */
API.Client.EntityInformerForGoods.prototype.cityCode;

/**
 * @type {!API.Client.Address}
 * @export
 */
API.Client.EntityInformerForGoods.prototype.address;

/**
 * @type {!API.Client.Object}
 * @export
 */
API.Client.EntityInformerForGoods.prototype.details;

/**
 * @type {!boolean}
 * @export
 */
API.Client.EntityInformerForGoods.prototype.icmsTaxPayer;

