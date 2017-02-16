goog.provide('API.Client.NRef_refFarmerNF');

/**
 * @record
 */
API.Client.NRefRefFarmerNF = function() {}

/**
 * State code of fiscal Document creator, farmer
 * @type {!API.Client.StateEnum}
 * @export
 */
API.Client.NRefRefFarmerNF.prototype.stateCd;

/**
 * year and month of fiscal document creation
 * @type {!string}
 * @export
 */
API.Client.NRefRefFarmerNF.prototype.yymm;

/**
 * fiscal document creator farmer federalTaxId
 * @type {!string}
 * @export
 */
API.Client.NRefRefFarmerNF.prototype.federalTaxId;

/**
 * fiscal document creator, farmer stateTaxId
 * @type {!string}
 * @export
 */
API.Client.NRefRefFarmerNF.prototype.stateTaxId;

/**
 * Document Fiscal model - '04' # FARMER DOCUMENT - '01' # DETACHED DOCUMENT - AVULSO 
 * @type {!string}
 * @export
 */
API.Client.NRefRefFarmerNF.prototype.model;

/**
 * fiscal document serie
 * @type {!string}
 * @export
 */
API.Client.NRefRefFarmerNF.prototype.serie;

/**
 * fiscal document number
 * @type {!string}
 * @export
 */
API.Client.NRefRefFarmerNF.prototype.number;

/** @enum {string} */
API.Client.NRefRefFarmerNF.ModelEnum = { 
  04: '04',
  01: '01',
}
