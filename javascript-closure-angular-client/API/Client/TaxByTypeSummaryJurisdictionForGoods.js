goog.provide('API.Client.TaxByTypeSummaryJurisdictionForGoods');

/**
 * @record
 */
API.Client.TaxByTypeSummaryJurisdictionForGoods = function() {}

/**
 * Jurisdiction used for calctax amount
 * @type {!string}
 * @export
 */
API.Client.TaxByTypeSummaryJurisdictionForGoods.prototype.jurisdictionName;

/**
 * Type of jurisdiction - 'City' - 'State' - 'Country' 
 * @type {!string}
 * @export
 */
API.Client.TaxByTypeSummaryJurisdictionForGoods.prototype.jurisdictionType;

/**
 * sum of referenced tax value by jurisdiction
 * @type {!number}
 * @export
 */
API.Client.TaxByTypeSummaryJurisdictionForGoods.prototype.tax;

/** @enum {string} */
API.Client.TaxByTypeSummaryJurisdictionForGoods.JurisdictionTypeEnum = { 
  City: 'City',
  State: 'State',
  Country: 'Country',
}
