goog.provide('API.Client.AgastExtendForSefaz');

/**
 * @record
 */
API.Client.AgastExtendForSefaz = function() {}

/**
 * harmonized code, NCM or LC 116
 * @type {!string}
 * @export
 */
API.Client.AgastExtendForSefaz.prototype.hsCode;

/**
 * hsCode Exception for IPI tax
 * @type {!number}
 * @export
 */
API.Client.AgastExtendForSefaz.prototype.ex;

/**
 * tax substitution code - Codigo especificador da Substuicao Tributaria
 * @type {!string}
 * @export
 */
API.Client.AgastExtendForSefaz.prototype.cest;

/**
 * GTIN NUMBER
 * @type {!string}
 * @export
 */
API.Client.AgastExtendForSefaz.prototype.cean;

/**
 * Nomenclatura de Valor aduaneio e Estatístico - NCM extension code
 * @type {!string}
 * @export
 */
API.Client.AgastExtendForSefaz.prototype.nve;

/**
 * Sales Unit
 * @type {!string}
 * @export
 */
API.Client.AgastExtendForSefaz.prototype.unit;

/**
 * Sales Taxable Unit
 * @type {!string}
 * @export
 */
API.Client.AgastExtendForSefaz.prototype.unitTaxable;

/**
 * Importation content form number (Número de controle da FCI - Ficha de Conteúdo de Importação)
 * @type {!string}
 * @export
 */
API.Client.AgastExtendForSefaz.prototype.nFCI;

