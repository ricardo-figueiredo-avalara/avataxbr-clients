goog.provide('API.Client.LegalReason_taxScope');

/**
 * Filter this message application to specified tax cases. - taxtype - jurisdictionType 
 * @record
 */
API.Client.LegalReasonTaxScope = function() {}

/**
 * This is the Tax Type to apply legal messages. - 'NONE' - 'INSS' - 'IRRF' - 'IRPJ' - 'PIS' - 'COFINS' - 'CSLL' - 'IPI' - 'ICMS' - 'II' - 'IOF' - 'ISS' - 'APROXTOTALTAX' 
 * @type {!string}
 * @export
 */
API.Client.LegalReasonTaxScope.prototype.taxType;

/**
 * These are the specific tax types to which a message may be applied - 'icms' - 'icmsSt' - 'icmsStSd' - 'icmsPartOwn' - 'icmsPartDest' - 'icmsDifaFCP' - 'icmsDifaDest' - 'icmsDifaRemet' - 'icmsRf' - 'icmsDeson' - 'icmsCredsn' - 'pis' - 'pisSt' - 'cofins' - 'cofinsSt' - 'ipi' - 'ipiReturned' - 'ii' - 'iof' 
 * @type {!string}
 * @export
 */
API.Client.LegalReasonTaxScope.prototype.specializedTaxType;

/**
 * Types of jurisdiction - 'NONE' - 'City' - 'State' - 'Country' 
 * @type {!string}
 * @export
 */
API.Client.LegalReasonTaxScope.prototype.jurisdictionType;

/**
 * Code to identify the Jurisdiction
 * @type {!string}
 * @export
 */
API.Client.LegalReasonTaxScope.prototype.jurisdictionIbgeCode;

/** @enum {string} */
API.Client.LegalReasonTaxScope.TaxTypeEnum = { 
  NONE: 'NONE',
  INSS: 'INSS',
  IRRF: 'IRRF',
  IRPJ: 'IRPJ',
  PIS: 'PIS',
  COFINS: 'COFINS',
  CSLL: 'CSLL',
  IPI: 'IPI',
  ICMS: 'ICMS',
  II: 'II',
  IOF: 'IOF',
  ISS: 'ISS',
  APROXTOTALTAX: 'APROXTOTALTAX',
}
/** @enum {string} */
API.Client.LegalReasonTaxScope.SpecializedTaxTypeEnum = { 
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
}
/** @enum {string} */
API.Client.LegalReasonTaxScope.JurisdictionTypeEnum = { 
  NONE: 'NONE',
  City: 'City',
  State: 'State',
  Country: 'Country',
}
