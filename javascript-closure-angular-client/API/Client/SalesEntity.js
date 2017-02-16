goog.provide('API.Client.SalesEntity');

/**
 * @record
 */
API.Client.SalesEntity = function() {}

/**
 * SERVICE BUYER NAME OFFICIAL
 * @type {!string}
 * @export
 */
API.Client.SalesEntity.prototype.name;

/**
 * @type {!API.Client.EntityType}
 * @export
 */
API.Client.SalesEntity.prototype.type;

/**
 * Entity Email
 * @type {!string}
 * @export
 */
API.Client.SalesEntity.prototype.email;

/**
 * CNPJ/CPF of Sales Buyer, if CPF pattern is '[0-9]{11}' if CNPJ pattern is '[0-9]{14}'
 * @type {!string}
 * @export
 */
API.Client.SalesEntity.prototype.cnpjcpf;

/**
 * City Tax ID
 * @type {!string}
 * @export
 */
API.Client.SalesEntity.prototype.cityTaxId;

/**
 * State Tax ID
 * @type {!string}
 * @export
 */
API.Client.SalesEntity.prototype.stateTaxId;

/**
 * Suframa ID
 * @type {!string}
 * @export
 */
API.Client.SalesEntity.prototype.suframa;

/**
 * Entity Phone
 * @type {!string}
 * @export
 */
API.Client.SalesEntity.prototype.phone;

/**
 * @type {!API.Client.FederalTaxRegime}
 * @export
 */
API.Client.SalesEntity.prototype.taxRegime;

/**
 * Entity Special Tax Regime  - 'MEM' # Microempresa municipal - 'EST' # Estimativa - 'SPR' # Sociedade de profissionais - 'COP' # Cooperativa - 'MEI' # Microempresário Individual (MEI) - 'MPP' # Microempresário e Empresa de Pequeno Porte (ME EPP) 
 * @type {!string}
 * @export
 */
API.Client.SalesEntity.prototype.specialTaxRegime;

/**
 * Companies subject to rule follow same rule of Government
 * @type {!boolean}
 * @export
 */
API.Client.SalesEntity.prototype.subjectToSRF1234;

/**
 * If Withholding ISS is required, independently the rules applied.
 * @type {!boolean}
 * @export
 */
API.Client.SalesEntity.prototype.requiredWithholdingISS;

/**
 * technical note. Anota\\u00e7\\u00e3o de Responsabilidade T\\u00e9cnica-ART, estabelece que todos os contratos referentes à  execu\\u00e7\\u00e3o de servi\\u00e7os ou obras de Engenharia, Agronomia, Geologia, Geografia ou Meteorologia dever\\u00e3o ser objeto de anota\\u00e7\\u00e3o no Conselho Regional de Engenharia e Agronomia
 * @type {!string}
 * @export
 */
API.Client.SalesEntity.prototype.art;

/**
 * PROCESS NUMBER TO ISS SUSPENDED FOR ADMINISTRATIVE PROCESS
 * @type {!string}
 * @export
 */
API.Client.SalesEntity.prototype.adminProcess;

/**
 * Business code. Código da obra OBRA
 * @type {!string}
 * @export
 */
API.Client.SalesEntity.prototype.buildCode;

/** @enum {string} */
API.Client.SalesEntity.SpecialTaxRegimeEnum = { 
  MEM: 'MEM',
  EST: 'EST',
  SPR: 'SPR',
  COP: 'COP',
  MEI: 'MEI',
  MPP: 'MPP',
}
