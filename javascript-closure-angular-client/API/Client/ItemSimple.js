goog.provide('API.Client.ItemSimple');

/**
 * @record
 */
API.Client.ItemSimple = function() {}

/**
 * Company ID
 * @type {!API.Client.UUID}
 * @export
 */
API.Client.ItemSimple.prototype.companyId;

/**
 * ERP Code
 * @type {!string}
 * @export
 */
API.Client.ItemSimple.prototype.code;

/**
 * Agast Code
 * @type {!string}
 * @export
 */
API.Client.ItemSimple.prototype.agast;

/**
 * Item Description
 * @type {!string}
 * @export
 */
API.Client.ItemSimple.prototype.description;

