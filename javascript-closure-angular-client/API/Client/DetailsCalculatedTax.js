goog.provide('API.Client.DetailsCalculatedTax');

/**
 * @record
 */
API.Client.DetailsCalculatedTax = function() {}

/**
 * This string captures the applicable location type. Location used for calc. Buyer or Seller
 * @type {!string}
 * @export
 */
API.Client.DetailsCalculatedTax.prototype.locationType;

/**
 * Jurisdiction used for calctax amount
 * @type {!string}
 * @export
 */
API.Client.DetailsCalculatedTax.prototype.jurisdictionName;

/**
 * Type of jurisdiction - 'City' - 'State' - 'Country' 
 * @type {!string}
 * @export
 */
API.Client.DetailsCalculatedTax.prototype.jurisdictionType;

/**
 * Tax identificator
 * @type {!string}
 * @export
 */
API.Client.DetailsCalculatedTax.prototype.taxType;

/**
 * Name of configuration rate
 * @type {!string}
 * @export
 */
API.Client.DetailsCalculatedTax.prototype.rateType;

/**
 * This string captures the transaction scenario used to calculate the tax for this tax type. Scenarios are specific to the tax type. This field provides information about how the tax engine interpreted the transaction information that was passed in.
 * @type {!string}
 * @export
 */
API.Client.DetailsCalculatedTax.prototype.scenario;

/**
 * This decimal captures how much of the lineAmount was taxable by this tax, calc base
 * @type {!number}
 * @export
 */
API.Client.DetailsCalculatedTax.prototype.subtotalTaxable;

/**
 * This decimal captures the tax rate for this tax.3.00 (3%)
 * @type {!number}
 * @export
 */
API.Client.DetailsCalculatedTax.prototype.rate;

/**
 * This decimal captures how much of the lineAmount was taxable by this tax
 * @type {!number}
 * @export
 */
API.Client.DetailsCalculatedTax.prototype.tax;

/**
 * This string is required if is exempt
 * @type {!string}
 * @export
 */
API.Client.DetailsCalculatedTax.prototype.exemptionCode;

/**
 * This element captures the list of locations that contributed to the tax determination. for Service is Buyer and Seller Address
 * @type {!Array<!string>}
 * @export
 */
API.Client.DetailsCalculatedTax.prototype.significantLocations;

/**
 * This string with type of rule
 * @type {!string}
 * @export
 */
API.Client.DetailsCalculatedTax.prototype.taxRuleType;

/** @enum {string} */
API.Client.DetailsCalculatedTax.JurisdictionTypeEnum = { 
  City: 'City',
  State: 'State',
  Country: 'Country',
}
/** @enum {string} */
API.Client.DetailsCalculatedTax.TaxTypeEnum = { 
  icms: 'icms',
  icmsSt: 'icmsSt',
  icmsStSd: 'icmsStSd',
  icmsPartOwn: 'icmsPartOwn',
  icmsPartDest: 'icmsPartDest',
  icmsDifaFCP: 'icmsDifaFCP',
  icmsDifaDest: 'icmsDifaDest',
  icmsDifaRemet: 'icmsDifaRemet',
  icmsRf: 'icmsRf',
  icmsDeson: 'icmsDeson',
  icmsCredsn: 'icmsCredsn',
  pis: 'pis',
  pisSt: 'pisSt',
  cofins: 'cofins',
  cofinsSt: 'cofinsSt',
  ipi: 'ipi',
  ipiReturned: 'ipiReturned',
  ii: 'ii',
  iof: 'iof',
  aproxtribState: 'aproxtribState',
  aproxtribFed: 'aproxtribFed',
  aproxtrib: 'aproxtrib',
}
/** @enum {string} */
API.Client.DetailsCalculatedTax.TaxRuleTypeEnum = { 
  SELLER: 'SELLER',
  BUYER: 'BUYER',
  TRANSACTION: 'TRANSACTION',
  ITEM: 'ITEM',
  TAX: 'TAX',
}
