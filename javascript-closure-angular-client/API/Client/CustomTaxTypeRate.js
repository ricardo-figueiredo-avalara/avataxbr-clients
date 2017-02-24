goog.provide('API.Client.CustomTaxTypeRate');

/**
 * @record
 */
API.Client.CustomTaxTypeRate = function() {}

/**
 * @type {!API.Client.TaxType}
 * @export
 */
API.Client.CustomTaxTypeRate.prototype.taxType;

/**
 * Tax can be calculated by rate or by quantity
 * @type {!string}
 * @export
 */
API.Client.CustomTaxTypeRate.prototype.taxModel;

/**
 * Specific tax rate ex 3.5 (3.5%)
 * @type {!number}
 * @export
 */
API.Client.CustomTaxTypeRate.prototype.rate;

/**
 * Specific tax rate ex 3.5 (3.5%)
 * @type {!number}
 * @export
 */
API.Client.CustomTaxTypeRate.prototype.srvAmount;

/**
 * @type {!string}
 * @export
 */
API.Client.CustomTaxTypeRate.prototype.quantityUnidBase;

/**
 * @type {!string}
 * @export
 */
API.Client.CustomTaxTypeRate.prototype.specializationType;

/**
 * Company ID
 * @type {!API.Client.UUID}
 * @export
 */
API.Client.CustomTaxTypeRate.prototype.companyId;

/** @enum {string} */
API.Client.CustomTaxTypeRate.TaxModelEnum = { 
  rate: 'rate',
  srf: 'srf',
}
/** @enum {string} */
API.Client.CustomTaxTypeRate.SpecializationTypeEnum = { 
  basic: 'basic',
  monophase: 'monophase',
  taxSubstitution: 'taxSubstitution',
}
