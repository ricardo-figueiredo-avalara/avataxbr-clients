goog.provide('API.Client.NRef_refNF');

/**
 * @record
 */
API.Client.NRefRefNF = function() {}

/**
 * State code of fiscal Document creator
 * @type {!API.Client.StateEnum}
 * @export
 */
API.Client.NRefRefNF.prototype.stateCd;

/**
 * year and month of fiscal document creation
 * @type {!string}
 * @export
 */
API.Client.NRefRefNF.prototype.yymm;

/**
 * fiscal document creator federalTaxId
 * @type {!string}
 * @export
 */
API.Client.NRefRefNF.prototype.federalTaxId;

/**
 * fiscal document serie
 * @type {!string}
 * @export
 */
API.Client.NRefRefNF.prototype.serie;

/**
 * fiscal document number
 * @type {!string}
 * @export
 */
API.Client.NRefRefNF.prototype.number;

