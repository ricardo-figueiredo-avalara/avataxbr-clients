goog.provide('API.Client.SefazInvoiceStatus');

/**
 * @record
 */
API.Client.SefazInvoiceStatus = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.SefazInvoiceStatus.prototype.code;

/**
 * @type {!string}
 * @export
 */
API.Client.SefazInvoiceStatus.prototype.desc;

/**
 * @type {!string}
 * @export
 */
API.Client.SefazInvoiceStatus.prototype.protocol;

/**
 * @type {!string}
 * @export
 */
API.Client.SefazInvoiceStatus.prototype.rec;

/**
 * @type {!Date}
 * @export
 */
API.Client.SefazInvoiceStatus.prototype.date;

/**
 * - '1' # Ambiente de Produção - '2' # Ambiente de Homologação 
 * @type {!string}
 * @export
 */
API.Client.SefazInvoiceStatus.prototype.environment;

/**
 * @type {!string}
 * @export
 */
API.Client.SefazInvoiceStatus.prototype.appVersion;

/** @enum {string} */
API.Client.SefazInvoiceStatus.EnvironmentEnum = { 
  1: '1',
  2: '2',
}
