goog.provide('API.Client.IcmsTaxConfBase');

/**
 * @record
 */
API.Client.IcmsTaxConfBase = function() {}

/**
 * @type {!API.Client.StateEnum}
 * @export
 */
API.Client.IcmsTaxConfBase.prototype.state;

/**
 * On sales process inform the CST hat the item linked to this configuration is subject to - '00' # TAXABLE - '20' # TAXABLE WITH BASE DISCOUNT - '40' # EXEMPT - '41' # NOT TAXABLE - '50' # SUSPENDED 
 * @type {!string}
 * @export
 */
API.Client.IcmsTaxConfBase.prototype.icmsCST;

/**
 * Message to add to NF when this configuration is used
 * @type {!string}
 * @export
 */
API.Client.IcmsTaxConfBase.prototype.messageCode;

/** @enum {string} */
API.Client.IcmsTaxConfBase.IcmsCSTEnum = { 
  00: '00',
  20: '20',
  40: '40',
  41: '41',
  50: '50',
}
