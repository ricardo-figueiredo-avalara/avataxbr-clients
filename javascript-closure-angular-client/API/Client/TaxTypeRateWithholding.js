goog.provide('API.Client.TaxTypeRate_withholding');

/**
 * Assign an empty object for simple withholding, null (no key) for no withholding. Detailed behaviors for specific targets may be set by using the available optional keys. 
 * @record
 */
API.Client.TaxTypeRateWithholding = function() {}

/**
 * @type {!API.Client.WithholdDef}
 * @export
 */
API.Client.TaxTypeRateWithholding.prototype.all;

/**
 * @type {!API.Client.WithholdDef}
 * @export
 */
API.Client.TaxTypeRateWithholding.prototype.business;

/**
 * @type {!API.Client.WithholdDef}
 * @export
 */
API.Client.TaxTypeRateWithholding.prototype.federalGovernment;

/**
 * @type {!API.Client.WithholdDef}
 * @export
 */
API.Client.TaxTypeRateWithholding.prototype.stateGovernment;

/**
 * @type {!API.Client.WithholdDef}
 * @export
 */
API.Client.TaxTypeRateWithholding.prototype.cityGovernment;

