goog.provide('API.Client.Agast');

/**
 * @record
 */
API.Client.Agast = function() {}

/**
 * Agast Code. AGAST (Avalara Goods and Services Types) are preset products with default tax definitions available to be used as provided or copied to create an specific comapany item.
 * @type {!string}
 * @export
 */
API.Client.Agast.prototype.code;

/**
 * Agast Description
 * @type {!string}
 * @export
 */
API.Client.Agast.prototype.description;

/**
 * harmonized code, NCM or LC 116
 * @type {!string}
 * @export
 */
API.Client.Agast.prototype.hsCode;

/**
 * hsCode Exception for IPI tax
 * @type {!number}
 * @export
 */
API.Client.Agast.prototype.ex;

/**
 * tax substitution code - Codigo especificador da Substuicao Tributaria
 * @type {!string}
 * @export
 */
API.Client.Agast.prototype.cest;

/**
 * GTIN NUMBER
 * @type {!string}
 * @export
 */
API.Client.Agast.prototype.cean;

/**
 * @type {!API.Client.Agast_codeType}
 * @export
 */
API.Client.Agast.prototype.codeType;

/**
 * Inform if this process is subject to IPI taxation on output process - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'N'  # NO TAXABLE     - 'I'  # IMMUNE 
 * @type {!string}
 * @export
 */
API.Client.Agast.prototype.cstIPI;

/**
 * Legal tax classificação for IPI (enquadramento tributário) When the process has CST IPI 52 or 54, it is mandatory to inform a Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo=mCnJajU4BKU= 
 * @type {!string}
 * @export
 */
API.Client.Agast.prototype.ipiLegalTaxClass;

/**
 * when the company is Real Profit inform if this item is cumulative or no cumulative by default
 * @type {!string}
 * @export
 */
API.Client.Agast.prototype.pisCofinsTaxReporting;

/**
 * Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE 
 * @type {!string}
 * @export
 */
API.Client.Agast.prototype.accruablePISTaxation;

/**
 * When exempt, taxable with zero rate, suspended, not taxable, this field informs the official code number for the exemption
 * @type {!string}
 * @export
 */
API.Client.Agast.prototype.pisExemptLegalReasonCode;

/**
 * When specified a reason, this field holds the reason's description
 * @type {!string}
 * @export
 */
API.Client.Agast.prototype.pisExemptLegalReason;

/**
 * Inform if this item by nature is subject to COFINS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE 
 * @type {!string}
 * @export
 */
API.Client.Agast.prototype.accruableCOFINSTaxation;

/**
 * When exempt, taxable with zero rate, suspended, not taxable, this field informs the official code number for the exemption
 * @type {!string}
 * @export
 */
API.Client.Agast.prototype.cofinsExemptLegalReasonCode;

/**
 * When specified a reason, this field holds the reason's description
 * @type {!string}
 * @export
 */
API.Client.Agast.prototype.cofinsExemptLegalReason;

/**
 * Inform if this item by nature is subject to CSLL taxation or exempt - 'T' # TAXABLE - 'E' # EXEMPT 
 * @type {!string}
 * @export
 */
API.Client.Agast.prototype.accruableCSLLTaxation;

/**
 * @type {!string}
 * @export
 */
API.Client.Agast.prototype.csllExemptLegalReason;

/**
 * @type {!string}
 * @export
 */
API.Client.Agast.prototype.csllExemptLegalReasonCode;

/**
 * @type {!API.Client.Agast_withholding}
 * @export
 */
API.Client.Agast.prototype.withholding;

/**
 * for service items with City Jurisdiction, inform where the ISS tax is due
 * @type {!boolean}
 * @export
 */
API.Client.Agast.prototype.issDueatDestination;

/**
 * on Real Profit Purchase transaction, inform if this item allows tax credits when it is non-cumulative
 * @type {!boolean}
 * @export
 */
API.Client.Agast.prototype.pisCofinsCreditNotAllowed;

/**
 * - 'T' # TAXABLE - TRIBUTÁVEL INCLUSIVE PARA EXPORTAÇÃO' - 'E' # TAXABLE WITH EXEMPTION FOR EXPORTS - ISENTO PARA SERVIÇOS PRESTADOS AO EXTERIOR (DEFAULT) - 'F' # EXEMPT - 'A' # SUSPENDED FOR ADMINISTRATIVE REASON - 'L' # SUSPENDED FOR LEGAL DECISION - 'I' # IMMUNE 
 * @type {!string}
 * @export
 */
API.Client.Agast.prototype.issTaxation;

/**
 * This is an array of tax object related to an agast.
 * @type {!Array<!API.Client.TaxTypeRate>}
 * @export
 */
API.Client.Agast.prototype.federalTaxRate;

/**
 * @type {!string}
 * @export
 */
API.Client.Agast.prototype.specialProductClass;

/**
 * One per State
 * @type {!Array<!API.Client.Agast_icmsConf>}
 * @export
 */
API.Client.Agast.prototype.icmsConf;

/** @enum {string} */
API.Client.Agast.CstIPIEnum = { 
  T: 'T',
  Z: 'Z',
  E: 'E',
  N: 'N',
  I: 'I',
}
/** @enum {string} */
API.Client.Agast.PisCofinsTaxReportingEnum = { 
  cumulative: 'cumulative',
  noCumulative: 'noCumulative',
}
/** @enum {string} */
API.Client.Agast.AccruablePISTaxationEnum = { 
  T: 'T',
  Z: 'Z',
  E: 'E',
  H: 'H',
  N: 'N',
}
/** @enum {string} */
API.Client.Agast.AccruableCOFINSTaxationEnum = { 
  T: 'T',
  Z: 'Z',
  E: 'E',
  H: 'H',
  N: 'N',
}
/** @enum {string} */
API.Client.Agast.AccruableCSLLTaxationEnum = { 
  T: 'T',
  E: 'E',
}
/** @enum {string} */
API.Client.Agast.IssTaxationEnum = { 
  T: 'T',
  E: 'E',
  F: 'F',
  A: 'A',
  L: 'L',
  I: 'I',
}
/** @enum {string} */
API.Client.Agast.SpecialProductClassEnum = { 
  OTHERS: 'OTHERS',
  COMMUNICATION: 'COMMUNICATION',
  ENERGY: 'ENERGY',
  TRANSPORT: 'TRANSPORT',
  FUEL AND LUBRIFICANT: 'FUEL AND LUBRIFICANT',
  VEHICLE: 'VEHICLE',
  ALCOHOLIC BEVERAGES: 'ALCOHOLIC BEVERAGES',
  WEAPONS: 'WEAPONS',
  AMMO: 'AMMO',
  PERFUME: 'PERFUME',
  TOBACCO: 'TOBACCO',
}
