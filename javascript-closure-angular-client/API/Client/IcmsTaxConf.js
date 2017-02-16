goog.provide('API.Client.IcmsTaxConf');

/**
 * @record
 */
API.Client.IcmsTaxConf = function() {}

/**
 * @type {!API.Client.StateEnum}
 * @export
 */
API.Client.IcmsTaxConf.prototype.state;

/**
 * On sales process inform the CST hat the item linked to this configuration is subject to - '00' # TAXABLE - '20' # TAXABLE WITH BASE DISCOUNT - '40' # EXEMPT - '41' # NOT TAXABLE - '50' # SUSPENDED 
 * @type {!string}
 * @export
 */
API.Client.IcmsTaxConf.prototype.icmsCST;

/**
 * Message to add to NF when this configuration is used
 * @type {!string}
 * @export
 */
API.Client.IcmsTaxConf.prototype.messageCode;

/**
 * the mapping key is state code / A chave do mapeamento é o código do Estado.
 * @type {!Array<!API.Client.IcmsTaxConfBase>}
 * @export
 */
API.Client.IcmsTaxConf.prototype.relationShip;

/** @enum {string} */
API.Client.IcmsTaxConf.IcmsCSTEnum = { 
  00: '00',
  20: '20',
  40: '40',
  41: '41',
  50: '50',
}
