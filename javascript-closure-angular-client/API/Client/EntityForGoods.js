goog.provide('API.Client.EntityForGoods');

/**
 * @record
 */
API.Client.EntityForGoods = function() {}

/**
 * Entity name, official name (Razão Social)
 * @type {!string}
 * @export
 */
API.Client.EntityForGoods.prototype.name;

/**
 * - 'transporter' - 'sender' # REMETENTE - 'dispatcher' # EXPEDITOR - 'receiver' # RECEIVER - 'addressee' # DESTINATÁRIO - 'other' # OUTRO 
 * @type {!string}
 * @export
 */
API.Client.EntityForGoods.prototype.role;

/**
 * @type {!API.Client.EntityType}
 * @export
 */
API.Client.EntityForGoods.prototype.type;

/**
 * CNPJ/CPF of Sales Buyer, if CPF pattern is '[0-9]{11}' if CNPJ pattern is '[0-9]{14}'
 * @type {!string}
 * @export
 */
API.Client.EntityForGoods.prototype.federalTaxId;

/**
 * City Tax ID
 * @type {!string}
 * @export
 */
API.Client.EntityForGoods.prototype.cityTaxId;

/**
 * State Tax ID
 * @type {!string}
 * @export
 */
API.Client.EntityForGoods.prototype.stateTaxId;

/**
 * Suframa ID
 * @type {!string}
 * @export
 */
API.Client.EntityForGoods.prototype.suframa;

/**
 * Entity Phone
 * @type {!string}
 * @export
 */
API.Client.EntityForGoods.prototype.phone;

/**
 * @type {!string}
 * @export
 */
API.Client.EntityForGoods.prototype.taxRegime;

/**
 * Entity Email
 * @type {!string}
 * @export
 */
API.Client.EntityForGoods.prototype.email;

/**
 * Companies subject to follow same rules of Government entities (Instrução Normativa: SRF1234)
 * @type {!boolean}
 * @export
 */
API.Client.EntityForGoods.prototype.subjectToSRF1234;

/**
 * Inform if the entity is ICMS tax payer.
 * @type {!boolean}
 * @export
 */
API.Client.EntityForGoods.prototype.icmsTaxPayer;

/** @enum {string} */
API.Client.EntityForGoods.RoleEnum = { 
  transporter: 'transporter',
  sender: 'sender',
  dispatcher: 'dispatcher',
  receiver: 'receiver',
  addressee: 'addressee',
  other: 'other',
}
/** @enum {string} */
API.Client.EntityForGoods.TaxRegimeEnum = { 
  realProfit: 'realProfit',
  estimatedProfit: 'estimatedProfit',
  simplified: 'simplified',
  simplifiedOverGrossthreshold: 'simplifiedOverGrossthreshold',
  simplifiedEntrepreneur: 'simplifiedEntrepreneur',
  notApplicable: 'notApplicable',
  individual: 'individual',
}
