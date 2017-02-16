goog.provide('API.Client.SefazItGetOut');

/**
 * @record
 */
API.Client.SefazItGetOut = function() {}

/**
 * Invoice Access Key
 * @type {!string}
 * @export
 */
API.Client.SefazItGetOut.prototype.key;

/**
 * XML Signed
 * @type {!string}
 * @export
 */
API.Client.SefazItGetOut.prototype.xml;

/**
 * @type {!API.Client.SefazInvoiceStatus}
 * @export
 */
API.Client.SefazItGetOut.prototype.status;

