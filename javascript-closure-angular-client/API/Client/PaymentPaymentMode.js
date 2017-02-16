goog.provide('API.Client.Payment_paymentMode');

/**
 * @record
 */
API.Client.PaymentPaymentMode = function() {}

/**
 * Payment mode - '01' # Dinheiro - '02' # Cheque - '03' # Cartão de Crédito - '04' # Cartão de Débito - '05' # Crédito Loja - '10' # Vale Alimentação - '11' # Vale Refeição - '12' # Vale Presente - '13' # Vale Combustível - '99' # Outros 
 * @type {!string}
 * @export
 */
API.Client.PaymentPaymentMode.prototype.mode;

/**
 * payment value
 * @type {!number}
 * @export
 */
API.Client.PaymentPaymentMode.prototype.value;

/**
 * - '1' # Payment integrated with system, - '2' # Payment not integrated with system 
 * @type {!string}
 * @export
 */
API.Client.PaymentPaymentMode.prototype.cardTpIntegration;

/**
 * Federal tax id of accrediting card (credenciadora do cartão)
 * @type {!string}
 * @export
 */
API.Client.PaymentPaymentMode.prototype.cardCNPJ;

/**
 * card brand - '01' # Visa - '02' # Mastercard - '03' # American Express - '04' # Sorocred - '99' # Other 
 * @type {!string}
 * @export
 */
API.Client.PaymentPaymentMode.prototype.cardBrand;

/**
 * transaction authorization number
 * @type {!string}
 * @export
 */
API.Client.PaymentPaymentMode.prototype.cardAuthorization;

/** @enum {string} */
API.Client.PaymentPaymentMode.ModeEnum = { 
  01: '01',
  02: '02',
  03: '03',
  04: '04',
  05: '05',
  10: '10',
  11: '11',
  12: '12',
  13: '13',
  99: '99',
}
/** @enum {string} */
API.Client.PaymentPaymentMode.CardTpIntegrationEnum = { 
  1: '1',
  2: '2',
}
/** @enum {string} */
API.Client.PaymentPaymentMode.CardBrandEnum = { 
  01: '01',
  02: '02',
  03: '03',
  04: '04',
  99: '99',
}
