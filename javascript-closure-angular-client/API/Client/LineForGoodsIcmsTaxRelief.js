goog.provide('API.Client.LineForGoods_icmsTaxRelief');

/**
 * @record
 */
API.Client.LineForGoodsIcmsTaxRelief = function() {}

/**
 * When item transaction subject to desoneration, this is the reason code - '1' # Táxi; - '3' # Produtor Agropecuário; - '4' # Frotista/Locadora; - '5' # Diplomático/Consular; - '6' # Utilitários e Motocicletas da Amazônia Ocidental e Áreas de Livre Comércio (Resolução 714/88 e 790/94 – CONTRAN e suas alterações); - '7' # SUFRAMA; - '8' # Venda a órgão Público; - '9' # Outros - '10' # Deficiente Condutor - '11' # Deficiente não condutor - '12' # Fomento agropecuário - '16' # Olimpíadas Rio 2016 
 * @type {!string}
 * @export
 */
API.Client.LineForGoodsIcmsTaxRelief.prototype.reasonCode;

/**
 * ICMS Tax base rate discount  (desconto na base do ICMS referetne a desoneração)
 * @type {!number}
 * @export
 */
API.Client.LineForGoodsIcmsTaxRelief.prototype.taxBaseDiscount;

/**
 * Amount for Icms Relief (desoneração)
 * @type {!number}
 * @export
 */
API.Client.LineForGoodsIcmsTaxRelief.prototype.taxAmount;

/** @enum {string} */
API.Client.LineForGoodsIcmsTaxRelief.ReasonCodeEnum = { 
  1: '1',
  3: '3',
  4: '4',
  5: '5',
  6: '6',
  7: '7',
  8: '8',
  9: '9',
  10: '10',
  11: '11',
  12: '12',
  16: '16',
}
