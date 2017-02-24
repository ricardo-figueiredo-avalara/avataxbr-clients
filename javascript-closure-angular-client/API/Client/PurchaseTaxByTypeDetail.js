goog.provide('API.Client.PurchaseTaxByTypeDetail');

/**
 * @record
 */
API.Client.PurchaseTaxByTypeDetail = function() {}

/**
 * This string captures the applicable location type. Location used for calc. Buyer or Seller
 * @type {!string}
 * @export
 */
API.Client.PurchaseTaxByTypeDetail.prototype.locationType;

/**
 * Jurisdiction used for calctax amount
 * @type {!string}
 * @export
 */
API.Client.PurchaseTaxByTypeDetail.prototype.jurisdictionName;

/**
 * Type of jurisdiction - 'City' - 'State' - 'Country' 
 * @type {!string}
 * @export
 */
API.Client.PurchaseTaxByTypeDetail.prototype.jurisdictionType;

/**
 * Tax identificator - 'pis' - 'pisRf' - 'cofins' - 'cofinsRf' - 'csll' - 'csllRf' - 'irrf' - 'inssAr' - 'inssRf' - 'issRf' 
 * @type {!string}
 * @export
 */
API.Client.PurchaseTaxByTypeDetail.prototype.taxType;

/**
 * Name of configuration rate
 * @type {!string}
 * @export
 */
API.Client.PurchaseTaxByTypeDetail.prototype.rateType;

/**
 * This string captures the transaction scenario used to calculate the tax for this tax type. Scenarios are specific to the tax type. This field provides information about how the tax engine interpreted the transaction information that was passed in.
 * @type {!string}
 * @export
 */
API.Client.PurchaseTaxByTypeDetail.prototype.scenario;

/**
 * This decimal captures how much of the lineAmount was taxable by this tax, calc base
 * @type {!number}
 * @export
 */
API.Client.PurchaseTaxByTypeDetail.prototype.subtotalTaxable;

/**
 * This decimal captures how much of the lineAmount was non-taxed. This is simply the line amount minus the taxable.
 * @type {!number}
 * @export
 */
API.Client.PurchaseTaxByTypeDetail.prototype.subtotalExempt;

/**
 * This decimal captures the tax rate for this tax.3.00 (3%)
 * @type {!number}
 * @export
 */
API.Client.PurchaseTaxByTypeDetail.prototype.rate;

/**
 * This decimal captures how much of the lineAmount was taxable by this tax
 * @type {!number}
 * @export
 */
API.Client.PurchaseTaxByTypeDetail.prototype.tax;

/**
 * This string is required if is exempt
 * @type {!string}
 * @export
 */
API.Client.PurchaseTaxByTypeDetail.prototype.exemptionCode;

/**
 * This element captures the list of locations that contributed to the tax determination. for BR16 Service is Buyer and Seller Address
 * @type {!Array<!string>}
 * @export
 */
API.Client.PurchaseTaxByTypeDetail.prototype.significantLocations;

/**
 * This string with type of rule - 'SELLER' - 'BUYER' - 'TRANSACTION' - 'ITEM' - 'TAX' 
 * @type {!string}
 * @export
 */
API.Client.PurchaseTaxByTypeDetail.prototype.taxRuleType;

/** @enum {string} */
API.Client.PurchaseTaxByTypeDetail.JurisdictionTypeEnum = { 
  City: 'City',
  State: 'State',
  Country: 'Country',
}
/** @enum {string} */
API.Client.PurchaseTaxByTypeDetail.TaxTypeEnum = { 
  pis: 'pis',
  pisRf: 'pisRf',
  cofins: 'cofins',
  cofinsRf: 'cofinsRf',
  csll: 'csll',
  csllRf: 'csllRf',
  irrf: 'irrf',
  inssAr: 'inssAr',
  inssRf: 'inssRf',
  issRf: 'issRf',
}
/** @enum {string} */
API.Client.PurchaseTaxByTypeDetail.TaxRuleTypeEnum = { 
  SELLER: 'SELLER',
  BUYER: 'BUYER',
  TRANSACTION: 'TRANSACTION',
  ITEM: 'ITEM',
  TAX: 'TAX',
}
