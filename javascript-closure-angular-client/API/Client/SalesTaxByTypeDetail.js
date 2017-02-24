goog.provide('API.Client.SalesTaxByTypeDetail');

/**
 * @record
 */
API.Client.SalesTaxByTypeDetail = function() {}

/**
 * This string captures the applicable location type. Location used for calc. Buyer or Seller
 * @type {!string}
 * @export
 */
API.Client.SalesTaxByTypeDetail.prototype.locationType;

/**
 * Jurisdiction used for calctax amount
 * @type {!string}
 * @export
 */
API.Client.SalesTaxByTypeDetail.prototype.jurisdictionName;

/**
 * Type of jurisdiction - 'City' - 'State' - 'Country' 
 * @type {!string}
 * @export
 */
API.Client.SalesTaxByTypeDetail.prototype.jurisdictionType;

/**
 * Tax identificator - 'aproxtribCity' - 'aproxtribFed' - 'pis' - 'pisRf' - 'cofins' - 'cofinsRf' - 'csll' - 'csllRf' - 'irrf' - 'inss' - 'inssRf' - 'iss' - 'issRf' - 'irpj' 
 * @type {!string}
 * @export
 */
API.Client.SalesTaxByTypeDetail.prototype.taxType;

/**
 * Name of configuration rate
 * @type {!string}
 * @export
 */
API.Client.SalesTaxByTypeDetail.prototype.rateType;

/**
 * This string captures the transaction scenario used to calculate the tax for this tax type. Scenarios are specific to the tax type. This field provides information about how the tax engine interpreted the transaction information that was passed in.
 * @type {!string}
 * @export
 */
API.Client.SalesTaxByTypeDetail.prototype.scenario;

/**
 * This decimal captures how much of the lineAmount was taxable by this tax, calc base
 * @type {!number}
 * @export
 */
API.Client.SalesTaxByTypeDetail.prototype.subtotalTaxable;

/**
 * This decimal captures how much of the lineAmount was non-taxed. This is simply the line amount minus the taxable.
 * @type {!number}
 * @export
 */
API.Client.SalesTaxByTypeDetail.prototype.subtotalExempt;

/**
 * This decimal captures the tax rate for this tax.3.00 (3%)
 * @type {!number}
 * @export
 */
API.Client.SalesTaxByTypeDetail.prototype.rate;

/**
 * This decimal captures how much of the lineAmount was taxable by this tax
 * @type {!number}
 * @export
 */
API.Client.SalesTaxByTypeDetail.prototype.tax;

/**
 * This string is required if is exempt
 * @type {!string}
 * @export
 */
API.Client.SalesTaxByTypeDetail.prototype.exemptionCode;

/**
 * This element captures the list of locations that contributed to the tax determination. for BR16 Service is Buyer and Seller Address
 * @type {!Array<!string>}
 * @export
 */
API.Client.SalesTaxByTypeDetail.prototype.significantLocations;

/**
 * This string with type of rule - 'SELLER' - 'BUYER' - 'TRANSACTION' - 'ITEM' - 'TAX' 
 * @type {!string}
 * @export
 */
API.Client.SalesTaxByTypeDetail.prototype.taxRuleType;

/** @enum {string} */
API.Client.SalesTaxByTypeDetail.JurisdictionTypeEnum = { 
  City: 'City',
  State: 'State',
  Country: 'Country',
}
/** @enum {string} */
API.Client.SalesTaxByTypeDetail.TaxTypeEnum = { 
  aproxtribCity: 'aproxtribCity',
  aproxtribFed: 'aproxtribFed',
  pis: 'pis',
  pisRf: 'pisRf',
  cofins: 'cofins',
  cofinsRf: 'cofinsRf',
  csll: 'csll',
  csllRf: 'csllRf',
  irrf: 'irrf',
  inss: 'inss',
  inssRf: 'inssRf',
  iss: 'iss',
  issRf: 'issRf',
  irpj: 'irpj',
}
/** @enum {string} */
API.Client.SalesTaxByTypeDetail.TaxRuleTypeEnum = { 
  SELLER: 'SELLER',
  BUYER: 'BUYER',
  TRANSACTION: 'TRANSACTION',
  ITEM: 'ITEM',
  TAX: 'TAX',
}
