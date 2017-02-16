goog.provide('API.Client.LineForGoods_di');

/**
 * @record
 */
API.Client.LineForGoodsDi = function() {}

/**
 * customs value, valor aduaneiro (II Block of NFe)
 * @type {!number}
 * @export
 */
API.Client.LineForGoodsDi.prototype.customsValue;

/**
 * Import declaration number, DI/DSI/DA/DRI-E (DI/DSI/DA/DRI-E)
 * @type {!string}
 * @export
 */
API.Client.LineForGoodsDi.prototype.diNumber;

/**
 * Register date of import declaration number, DI/DSI/DA/DRI-E (DI/DSI/DA/DRI-E)
 * @type {!API.Client.date}
 * @export
 */
API.Client.LineForGoodsDi.prototype.registerDateDI;

/**
 * Clerance Site Local do desembaraço aduaneiro 
 * @type {!string}
 * @export
 */
API.Client.LineForGoodsDi.prototype.clearanceSite;

/**
 * Clerance Site State Estado onde ocorrreu o desembaraço aduaneiro 
 * @type {!API.Client.StateEnum}
 * @export
 */
API.Client.LineForGoodsDi.prototype.clearanceState;

/**
 * Clerance date
 * @type {!API.Client.date}
 * @export
 */
API.Client.LineForGoodsDi.prototype.clearanceDate;

/**
 * - '1' # Maritima - '2' # Fluvial - '3' # Lacustre - '4' # Aerea - '5' # Postal - '6' # Ferroviaria - '7' # Rodoviaria - '8' # Conduto - '9' # Meios Proprios - '10' # Entrada/Saida Ficta 
 * @type {!string}
 * @export
 */
API.Client.LineForGoodsDi.prototype.transportDIType;

/**
 * Aditional amount to freight to renew merchant marine, This decimal 13 integers and 2 decimals [Valor Adicional ao frete para renovação de marinha mercante] 
 * @type {!number}
 * @export
 */
API.Client.LineForGoodsDi.prototype.afrmmValue;

/**
 * - '1' # On One's Own [1-por conta propria] - '2' # On Behalf And Order [2-por conta e ordem] - '3' # Order [3-encomenda] 
 * @type {!string}
 * @export
 */
API.Client.LineForGoodsDi.prototype.intermediateType;

/**
 * Buyer federal tax id CNPJ do comprador ou encomendante 
 * @type {!string}
 * @export
 */
API.Client.LineForGoodsDi.prototype.buyerFederalTaxID;

/**
 * Buyer sate Estado do comprador ou encomendante 
 * @type {!API.Client.StateEnum}
 * @export
 */
API.Client.LineForGoodsDi.prototype.buyerState;

/**
 * Exporter code
 * @type {!string}
 * @export
 */
API.Client.LineForGoodsDi.prototype.exporterCode;

/**
 * aditional import declaration
 * @type {!Array<!API.Client.LineForGoods_adi>}
 * @export
 */
API.Client.LineForGoodsDi.prototype.adi;

/** @enum {string} */
API.Client.LineForGoodsDi.TransportDITypeEnum = { 
  1: '1',
  2: '2',
  3: '3',
  4: '4',
  5: '5',
  6: '6',
  7: '7',
  8: '8',
  9: '9',
  10: '10',
}
/** @enum {string} */
API.Client.LineForGoodsDi.IntermediateTypeEnum = { 
  1: '1',
  2: '2',
  3: '3',
}
