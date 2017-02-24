goog.provide('API.Client.TaxTypeRate');

/**
 * @record
 */
API.Client.TaxTypeRate = function() {}

/**
 * @type {!API.Client.TaxType}
 * @export
 */
API.Client.TaxTypeRate.prototype.taxType;

/**
 * Tax can be calculated by rate or by quantity
 * @type {!string}
 * @export
 */
API.Client.TaxTypeRate.prototype.taxModel;

/**
 * Specific tax rate ex 3.5 (3.5%)
 * @type {!number}
 * @export
 */
API.Client.TaxTypeRate.prototype.rate;

/**
 * Specific tax rate ex 3.5 (3.5%)
 * @type {!number}
 * @export
 */
API.Client.TaxTypeRate.prototype.srvAmount;

/**
 * @type {!string}
 * @export
 */
API.Client.TaxTypeRate.prototype.quantityUnidBase;

/**
 * @type {!string}
 * @export
 */
API.Client.TaxTypeRate.prototype.specializationType;

/** @enum {string} */
API.Client.TaxTypeRate.TaxModelEnum = { 
  rate: 'rate',
  srf: 'srf',
}
/** @enum {string} */
API.Client.TaxTypeRate.SpecializationTypeEnum = { 
  basic: 'basic',
  monophase: 'monophase',
  taxSubstitution: 'taxSubstitution',
}
