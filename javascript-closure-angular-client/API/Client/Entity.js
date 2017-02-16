goog.provide('API.Client.Entity');

/**
 * @record
 */
API.Client.Entity = function() {}

/**
 * Entity name, official name (Razão Social)
 * @type {!string}
 * @export
 */
API.Client.Entity.prototype.name;

/**
 * - 'transporter' - 'sender' # REMETENTE - 'dispatcher' # EXPEDITOR - 'receiver' # RECEIVER - 'addressee' # DESTINATÁRIO - 'other' # OUTRO 
 * @type {!string}
 * @export
 */
API.Client.Entity.prototype.role;

/**
 * @type {!API.Client.EntityType}
 * @export
 */
API.Client.Entity.prototype.type;

/**
 * CNPJ/CPF of Sales Buyer, if CPF pattern is '[0-9]{11}' if CNPJ pattern is '[0-9]{14}'
 * @type {!string}
 * @export
 */
API.Client.Entity.prototype.federalTaxId;

/**
 * City Tax ID
 * @type {!string}
 * @export
 */
API.Client.Entity.prototype.cityTaxId;

/**
 * State Tax ID
 * @type {!string}
 * @export
 */
API.Client.Entity.prototype.stateTaxId;

/**
 * Suframa ID
 * @type {!string}
 * @export
 */
API.Client.Entity.prototype.suframa;

/**
 * Entity Phone
 * @type {!string}
 * @export
 */
API.Client.Entity.prototype.phone;

/**
 * @type {!string}
 * @export
 */
API.Client.Entity.prototype.taxRegime;

/**
 * Entity Email
 * @type {!string}
 * @export
 */
API.Client.Entity.prototype.email;

/**
 * Companies subject to follow same rules of Government entities (Instrução Normativa: SRF1234)
 * @type {!boolean}
 * @export
 */
API.Client.Entity.prototype.subjectToSRF1234;

/** @enum {string} */
API.Client.Entity.RoleEnum = { 
  transporter: 'transporter',
  sender: 'sender',
  dispatcher: 'dispatcher',
  receiver: 'receiver',
  addressee: 'addressee',
  other: 'other',
}
/** @enum {string} */
API.Client.Entity.TaxRegimeEnum = { 
  realProfit: 'realProfit',
  estimatedProfit: 'estimatedProfit',
  simplified: 'simplified',
  simplifiedOverGrossthreshold: 'simplifiedOverGrossthreshold',
  simplifiedEntrepreneur: 'simplifiedEntrepreneur',
  notApplicable: 'notApplicable',
  individual: 'individual',
}
