goog.provide('API.Client.NRef_refECF');

/**
 * @record
 */
API.Client.NRefRefECF = function() {}

/**
 * ECF Sequential number that generated Cupom attached to NFe informar o número de ordem seqüencial do ECF que emitiu o Cupom Fiscal vinculado à NF-e 
 * @type {!string}
 * @export
 */
API.Client.NRefRefECF.prototype.nECF;

/**
 * Operational counter number attached to NFe Informar o Número do Contador de Ordem de Operação - COO vinculado à NF-e 
 * @type {!string}
 * @export
 */
API.Client.NRefRefECF.prototype.nCOO;

/**
 * Fiscal document model - '2B' # coupon tax not ECF - '2C' # PDV coupon tax - '2D' # ECF coupon tax 
 * @type {!string}
 * @export
 */
API.Client.NRefRefECF.prototype.modECF;

/** @enum {string} */
API.Client.NRefRefECF.ModECFEnum = { 
  2B: '2B',
  2C: '2C',
  2D: '2D',
}
