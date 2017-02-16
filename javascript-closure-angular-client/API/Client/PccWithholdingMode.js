goog.provide('API.Client.PccWithholdingMode');

/**
 * @record
 */
API.Client.PccWithholdingMode = function() {}

/**
 * Inform if this group of tax are calculated considering the threashold by PCC or Individualy (each tax separately)
 * @type {!string}
 * @export
 */
API.Client.PccWithholdingMode.prototype.type;

/**
 * this attribute occurs only for CSRF type, When CRSF mode, this is sum of pisRf, CofinsRf and CsllRf
 * @type {!number}
 * @export
 */
API.Client.PccWithholdingMode.prototype.totalTax;

/**
 * @type {!API.Client.TaxByTypeTax}
 * @export
 */
API.Client.PccWithholdingMode.prototype.pisRf;

/**
 * @type {!API.Client.TaxByTypeTax}
 * @export
 */
API.Client.PccWithholdingMode.prototype.cofinsRf;

/**
 * @type {!API.Client.TaxByTypeTax}
 * @export
 */
API.Client.PccWithholdingMode.prototype.csllRf;

/** @enum {string} */
API.Client.PccWithholdingMode.TypeEnum = { 
  CSRF: 'CSRF',
  individual: 'individual',
}
