goog.provide('API.Client.TaxByTypeSummaryJurisdiction');

/**
 * @record
 */
API.Client.TaxByTypeSummaryJurisdiction = function() {}

/**
 * Jurisdiction used for calctax amount
 * @type {!string}
 * @export
 */
API.Client.TaxByTypeSummaryJurisdiction.prototype.jurisdictionName;

/**
 * Type of jurisdiction - 'City' - 'State' - 'Country' 
 * @type {!string}
 * @export
 */
API.Client.TaxByTypeSummaryJurisdiction.prototype.jurisdictionType;

/**
 * sum of referenced tax value by jurisdiction
 * @type {!number}
 * @export
 */
API.Client.TaxByTypeSummaryJurisdiction.prototype.tax;

/** @enum {string} */
API.Client.TaxByTypeSummaryJurisdiction.JurisdictionTypeEnum = { 
  City: 'City',
  State: 'State',
  Country: 'Country',
}
