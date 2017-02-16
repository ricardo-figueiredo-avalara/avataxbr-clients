goog.provide('API.Client.ItemCpom');

/**
 * @record
 */
API.Client.ItemCpom = function() {}

/**
 * Company ID
 * @type {!API.Client.UUID}
 * @export
 */
API.Client.ItemCpom.prototype.companyId;

/**
 * IBGE city code
 * @type {!string}
 * @export
 */
API.Client.ItemCpom.prototype.cityCode;

/**
 * ERP Code
 * @type {!string}
 * @export
 */
API.Client.ItemCpom.prototype.itemCode;

/**
 * Code in City
 * @type {!string}
 * @export
 */
API.Client.ItemCpom.prototype.code;

