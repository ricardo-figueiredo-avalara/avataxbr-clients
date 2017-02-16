goog.provide('API.Client.NRef');

/**
 * Referenced Invoices The invoice can be one of this types, - 'refNFe - Eletronic Invoice' - 'refCTE - Transport Invoice' - 'refECF - Reatail Cupom' - 'refNF  - Invoice model 1 or 1A' - 'refFarmerNF - farmer invoice' 
 * @record
 */
API.Client.NRef = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.NRef.prototype.type;

/**
 * @type {!string}
 * @export
 */
API.Client.NRef.prototype.refNFe;

/**
 * @type {!string}
 * @export
 */
API.Client.NRef.prototype.refCTe;

/**
 * @type {!API.Client.NRef_refECF}
 * @export
 */
API.Client.NRef.prototype.refECF;

/**
 * @type {!API.Client.NRef_refNF}
 * @export
 */
API.Client.NRef.prototype.refNF;

/**
 * @type {!API.Client.NRef_refFarmerNF}
 * @export
 */
API.Client.NRef.prototype.refFarmerNF;

/** @enum {string} */
API.Client.NRef.TypeEnum = { 
  refNFe: 'refNFe',
  refCTE: 'refCTE',
  refECF: 'refECF',
  refNF: 'refNF',
  refFarmerNF: 'refFarmerNF',
}
