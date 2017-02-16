goog.provide('API.Client.HeaderForGoods');

/**
 * @record
 */
API.Client.HeaderForGoods = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.HeaderForGoods.prototype.messageType;

/**
 * This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line.
 * @type {!string}
 * @export
 */
API.Client.HeaderForGoods.prototype.accountId;

/**
 * string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company
 * @type {!string}
 * @export
 */
API.Client.HeaderForGoods.prototype.companyCode;

/**
 * This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored
 * @type {!string}
 * @export
 */
API.Client.HeaderForGoods.prototype.documentCode;

/**
 * @type {!API.Client.HeaderForGoods_participants}
 * @export
 */
API.Client.HeaderForGoods.prototype.participants;

/**
 * This is the public NF id. With this number is possible get invoice information directly from government.
 * @type {!string}
 * @export
 */
API.Client.HeaderForGoods.prototype.nfAccessKey;

/**
 * qr code printed on DANFE;
 * @type {!string}
 * @export
 */
API.Client.HeaderForGoods.prototype.nfceQrCode;

/**
 * This string indicates the type of transaction for which tax should be calculated.
 * @type {!string}
 * @export
 */
API.Client.HeaderForGoods.prototype.transactionType;

/**
 * This string indicates the type of transaction for which tax should be calculated. - '01' # Nota Fiscal 1/1A - '1B' # Nota Fiscal Avulsa - '02' # Nota Fiscal de Venda a-Consumidor - '2D' # Cupom Fiscal - '2E' # Cupom Fiscal-Bilhete de Passagem - '04' # Nota Fiscal de Produtor - '06' # Nota Fiscal/Conta de Energia Elétrica - '07' # Nota Fiscal de Serviço de Transporte - '08' # Conhecimento de Transporte Rodoviário de-Cargas - '8B' # Conhecimento de Transporte de-Cargas Avulso - '09' # Conhecimento de Transporte Aquaviário de-Cargas - '10' # Conhecimento Aéreo - '11' # Conhecimento de Transporte Ferroviário de-Cargas - '13' # Bilhete de Passagem Rodoviário - '14' # Bilhete de Passagem Aquaviário - '15' # Bilhete de Passagem e-Nota de-Bagagem - '16' # Bilhete de Passagem Ferroviário - '18' # Resumo de Movimento Diário - '21' # Nota Fiscal de Serviço de-Comunicação - '22' # Nota Fiscal de Serviço de Telecomunicação - '26' # Conhecimento de Transporte Multimodal de-Cargas - '27' # Nota Fiscal De Transporte Ferroviário De-Carga - '28' # Nota Fiscal/Conta de Fornecimento de Gás-Canalizado - '29' # Nota Fiscal/Conta de Fornecimento de Água-Canalizada - '55' # Nota Fiscal Eletrônica (NF-e) - '57' # Conhecimento de Transporte Eletrônico (CT-e) - '59' # Cupom Fiscal Eletrônico (CF-e-SAT) - '60' # Cupom Fiscal Eletrônico (CF-e-ECF) - '65' # Nota Fiscal Eletrônica ao-Consumidor Final (NFC-e) 
 * @type {!string}
 * @export
 */
API.Client.HeaderForGoods.prototype.transactionModel;

/**
 * Natureza da Opreração - 'Describe kind of this transaction, summary
 * @type {!string}
 * @export
 */
API.Client.HeaderForGoods.prototype.transactionClass;

/**
 * @type {!string}
 * @export
 */
API.Client.HeaderForGoods.prototype.eDocCreatorType;

/**
 * This Flag is used only when eDocCreatorType is other and the return show Taxes using eDocCreator perspective or self perspective.
 * @type {!boolean}
 * @export
 */
API.Client.HeaderForGoods.prototype.eDocCreatorPerspective;

/**
 * This string is a code maintained by the client application and recorded in CUP to uniquely identify the party with whom the company (identified by companyCode) is transacting. It is unique within the context of a Company.
 * @type {!string}
 * @export
 */
API.Client.HeaderForGoods.prototype.entityCode;

/**
 * currency code
 * @type {!string}
 * @export
 */
API.Client.HeaderForGoods.prototype.currency;

/**
 * This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity
 * @type {!string}
 * @export
 */
API.Client.HeaderForGoods.prototype.companyLocation;

/**
 * This string is the transaction date in ISO 8601 format, create transaction date
 * @type {!string}
 * @export
 */
API.Client.HeaderForGoods.prototype.transactionDate;

/**
 * This string is the transaction date in ISO 8601 format, when products were shipped, can be empty or absent
 * @type {!string}
 * @export
 */
API.Client.HeaderForGoods.prototype.shippingDate;

/**
 * @type {!API.Client.AdditionalInformation}
 * @export
 */
API.Client.HeaderForGoods.prototype.additionalInfo;

/**
 * how the document will be printed - '0' # without DANFE; - '1' # DANFe Letter; - '2' # DANFe Landscape; - '3' # DANFe Simplified; - '4' # DANFe NFC-e; - '5' # DANFe NFC-e e-mail 
 * @type {!string}
 * @export
 */
API.Client.HeaderForGoods.prototype.tpImp;

/**
 * This indicator inform transaction target place, when is AUTOMATIC the company address and entity address are analyzed to identify type of transaction target place 1- same state; 2 - interstate; 3-with exterior. Exist some cases where is necessary force this situation like when buyer from another state buy something in loco, the address are from different states, but transaction no.  Identificador de Local de destino da operação, na opção AUTOMATIC endereços da Companhia e da entidade destino são analisados para saber se é uma operação dentro do mesmo estado, interestadual ou com o exterior. Há situações onde é necessário forçar este indicador como por exemplo  Quando uma pessoa com endereço em outro estado, compra uma mercadoria de forma presencial, é uma operação interna apesar dos endereços dos envolvidos estarem em estados distintos. - 0 # AUTOMATIC - DEFAULT - 1 # Interna; - 2 # Interestadual; - 3 # Exterior) 
 * @type {!number}
 * @export
 */
API.Client.HeaderForGoods.prototype.idDest;

/**
 * Presence indicator - '0' # Not applicable - '1' # Presential; - '2' # Remote, internet; - '3' # Remote, phone; - '4' # NFC-e home delivery; - '9' # Remote, others 
 * @type {!string}
 * @export
 */
API.Client.HeaderForGoods.prototype.indPres;

/**
 * Invoice number, sequential unique by invoice serial (Número da nota fiscal)
 * @type {!number}
 * @export
 */
API.Client.HeaderForGoods.prototype.invoiceNumber;

/**
 * Invoice number, sequential unique by invoice serial (Número da nota fiscal) 
 * @type {!number}
 * @export
 */
API.Client.HeaderForGoods.prototype.invoiceSerial;

/**
 * @type {!API.Client.DefaultLocations}
 * @export
 */
API.Client.HeaderForGoods.prototype.defaultLocations;

/**
 * Shipment
 * @type {!API.Client.Transport}
 * @export
 */
API.Client.HeaderForGoods.prototype.transport;

/**
 * Transactions or other invoices referenced
 * @type {!Array<!API.Client.NRef>}
 * @export
 */
API.Client.HeaderForGoods.prototype.nfRef;

/**
 * @type {!API.Client.Payment}
 * @export
 */
API.Client.HeaderForGoods.prototype.payment;

/**
 * @type {!API.Client.PurchaseInfo}
 * @export
 */
API.Client.HeaderForGoods.prototype.purchaseInfo;

/**
 * @type {!API.Client.ExportInfo}
 * @export
 */
API.Client.HeaderForGoods.prototype.export;

/** @enum {string} */
API.Client.HeaderForGoods.MessageTypeEnum = { 
  goods: 'goods',
}
/** @enum {string} */
API.Client.HeaderForGoods.TransactionTypeEnum = { 
  Sales: 'Sales',
  Purchase: 'Purchase',
  SalesReturn: 'SalesReturn',
  PurchaseReturn: 'PurchaseReturn',
  TransferReturn: 'TransferReturn',
  Shipping: 'Shipping',
  ShippingReturn: 'ShippingReturn',
  Transfer: 'Transfer',
  ReceiptAdjustment: 'ReceiptAdjustment',
  TransferAdjustment: 'TransferAdjustment',
}
/** @enum {string} */
API.Client.HeaderForGoods.TransactionModelEnum = { 
  01: '01',
  1B: '1B',
  02: '02',
  2D: '2D',
  2E: '2E',
  04: '04',
  06: '06',
  07: '07',
  08: '08',
  8B: '8B',
  09: '09',
  10: '10',
  11: '11',
  13: '13',
  14: '14',
  15: '15',
  16: '16',
  18: '18',
  21: '21',
  22: '22',
  26: '26',
  27: '27',
  28: '28',
  29: '29',
  55: '55',
  57: '57',
  59: '59',
  60: '60',
  65: '65',
}
/** @enum {string} */
API.Client.HeaderForGoods.EDocCreatorTypeEnum = { 
  self: 'self',
  other: 'other',
}
/** @enum {string} */
API.Client.HeaderForGoods.CurrencyEnum = { 
  BRL: 'BRL',
}
/** @enum {string} */
API.Client.HeaderForGoods.TpImpEnum = { 
  0: '0',
  1: '1',
  2: '2',
  3: '3',
  4: '4',
  5: '5',
}
/** @enum {string} */
API.Client.HeaderForGoods.IndPresEnum = { 
  0: '0',
  1: '1',
  2: '2',
  3: '3',
  4: '4',
  9: '9',
}
