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
 * UUID Reference to an item in the LegalReason store. 
 * @type {!string}
 * @export
 */
API.Client.CustomTaxTypeRate.prototype.exemptionReasonCode;

/**
 * Optional textual reason description, to be used when reason codes are generic (i.e. reason code 999 = Other). 
 * @type {!string}
 * @export
 */
API.Client.CustomTaxTypeRate.prototype.customExemptionReasonDescription;

/**
 * @type {!API.Client.TaxTypeRate_withholding}
 * @export
 */
API.Client.CustomTaxTypeRate.prototype.withholding;

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
