goog.provide('API.Client.LineForGoods_indExport');

/**
 * indirect exportation
 * @record
 */
API.Client.LineForGoodsIndExport = function() {}

/**
 * Exportation register number
 * @type {!string}
 * @export
 */
API.Client.LineForGoodsIndExport.prototype.registerNumber;

/**
 * invoice access key received to export
 * @type {!string}
 * @export
 */
API.Client.LineForGoodsIndExport.prototype.accessKey;

/**
 * This decimal 11 integers and 0 to 4 decimals, quantity exported in real
 * @type {!number}
 * @export
 */
API.Client.LineForGoodsIndExport.prototype.quantity;

