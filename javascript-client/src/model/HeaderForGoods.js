/**
 * AvaTax Brazil
 * The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/AdditionalInformation', 'model/DefaultLocations', 'model/ExportInfo', 'model/HeaderForGoodsParticipants', 'model/NRef', 'model/Payment', 'model/PurchaseInfo', 'model/Transport'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./AdditionalInformation'), require('./DefaultLocations'), require('./ExportInfo'), require('./HeaderForGoodsParticipants'), require('./NRef'), require('./Payment'), require('./PurchaseInfo'), require('./Transport'));
  } else {
    // Browser globals (root is window)
    if (!root.AvaTaxBrazil) {
      root.AvaTaxBrazil = {};
    }
    root.AvaTaxBrazil.HeaderForGoods = factory(root.AvaTaxBrazil.ApiClient, root.AvaTaxBrazil.AdditionalInformation, root.AvaTaxBrazil.DefaultLocations, root.AvaTaxBrazil.ExportInfo, root.AvaTaxBrazil.HeaderForGoodsParticipants, root.AvaTaxBrazil.NRef, root.AvaTaxBrazil.Payment, root.AvaTaxBrazil.PurchaseInfo, root.AvaTaxBrazil.Transport);
  }
}(this, function(ApiClient, AdditionalInformation, DefaultLocations, ExportInfo, HeaderForGoodsParticipants, NRef, Payment, PurchaseInfo, Transport) {
  'use strict';




  /**
   * The HeaderForGoods model module.
   * @module model/HeaderForGoods
   * @version 1.0
   */

  /**
   * Constructs a new <code>HeaderForGoods</code>.
   * @alias module:model/HeaderForGoods
   * @class
   * @param messageType {module:model/HeaderForGoods.MessageTypeEnum} 
   * @param transactionType {module:model/HeaderForGoods.TransactionTypeEnum} This string indicates the type of transaction for which tax should be calculated.
   * @param eDocCreatorType {module:model/HeaderForGoods.EDocCreatorTypeEnum} 
   * @param companyLocation {String} This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity
   */
  var exports = function(messageType, transactionType, eDocCreatorType, companyLocation) {
    var _this = this;

    _this['messageType'] = messageType;




    _this['transactionType'] = transactionType;


    _this['eDocCreatorType'] = eDocCreatorType;


    _this['companyLocation'] = companyLocation;














  };

  /**
   * Constructs a <code>HeaderForGoods</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/HeaderForGoods} obj Optional instance to populate.
   * @return {module:model/HeaderForGoods} The populated <code>HeaderForGoods</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('messageType')) {
        obj['messageType'] = ApiClient.convertToType(data['messageType'], 'String');
      }
      if (data.hasOwnProperty('documentCode')) {
        obj['documentCode'] = ApiClient.convertToType(data['documentCode'], 'String');
      }
      if (data.hasOwnProperty('participants')) {
        obj['participants'] = HeaderForGoodsParticipants.constructFromObject(data['participants']);
      }
      if (data.hasOwnProperty('nfAccessKey')) {
        obj['nfAccessKey'] = ApiClient.convertToType(data['nfAccessKey'], 'String');
      }
      if (data.hasOwnProperty('nfceQrCode')) {
        obj['nfceQrCode'] = ApiClient.convertToType(data['nfceQrCode'], 'String');
      }
      if (data.hasOwnProperty('transactionType')) {
        obj['transactionType'] = ApiClient.convertToType(data['transactionType'], 'String');
      }
      if (data.hasOwnProperty('transactionModel')) {
        obj['transactionModel'] = ApiClient.convertToType(data['transactionModel'], 'String');
      }
      if (data.hasOwnProperty('transactionClass')) {
        obj['transactionClass'] = ApiClient.convertToType(data['transactionClass'], 'String');
      }
      if (data.hasOwnProperty('eDocCreatorType')) {
        obj['eDocCreatorType'] = ApiClient.convertToType(data['eDocCreatorType'], 'String');
      }
      if (data.hasOwnProperty('eDocCreatorPerspective')) {
        obj['eDocCreatorPerspective'] = ApiClient.convertToType(data['eDocCreatorPerspective'], 'Boolean');
      }
      if (data.hasOwnProperty('currency')) {
        obj['currency'] = ApiClient.convertToType(data['currency'], 'String');
      }
      if (data.hasOwnProperty('companyLocation')) {
        obj['companyLocation'] = ApiClient.convertToType(data['companyLocation'], 'String');
      }
      if (data.hasOwnProperty('transactionDate')) {
        obj['transactionDate'] = ApiClient.convertToType(data['transactionDate'], 'String');
      }
      if (data.hasOwnProperty('shippingDate')) {
        obj['shippingDate'] = ApiClient.convertToType(data['shippingDate'], 'String');
      }
      if (data.hasOwnProperty('additionalInfo')) {
        obj['additionalInfo'] = AdditionalInformation.constructFromObject(data['additionalInfo']);
      }
      if (data.hasOwnProperty('tpImp')) {
        obj['tpImp'] = ApiClient.convertToType(data['tpImp'], 'String');
      }
      if (data.hasOwnProperty('idDest')) {
        obj['idDest'] = ApiClient.convertToType(data['idDest'], 'Number');
      }
      if (data.hasOwnProperty('indPres')) {
        obj['indPres'] = ApiClient.convertToType(data['indPres'], 'String');
      }
      if (data.hasOwnProperty('invoiceNumber')) {
        obj['invoiceNumber'] = ApiClient.convertToType(data['invoiceNumber'], 'Number');
      }
      if (data.hasOwnProperty('invoiceSerial')) {
        obj['invoiceSerial'] = ApiClient.convertToType(data['invoiceSerial'], 'Number');
      }
      if (data.hasOwnProperty('defaultLocations')) {
        obj['defaultLocations'] = DefaultLocations.constructFromObject(data['defaultLocations']);
      }
      if (data.hasOwnProperty('transport')) {
        obj['transport'] = Transport.constructFromObject(data['transport']);
      }
      if (data.hasOwnProperty('nfRef')) {
        obj['nfRef'] = ApiClient.convertToType(data['nfRef'], [NRef]);
      }
      if (data.hasOwnProperty('payment')) {
        obj['payment'] = Payment.constructFromObject(data['payment']);
      }
      if (data.hasOwnProperty('purchaseInfo')) {
        obj['purchaseInfo'] = PurchaseInfo.constructFromObject(data['purchaseInfo']);
      }
      if (data.hasOwnProperty('export')) {
        obj['export'] = ExportInfo.constructFromObject(data['export']);
      }
    }
    return obj;
  }

  /**
   * @member {module:model/HeaderForGoods.MessageTypeEnum} messageType
   * @default 'goods'
   */
  exports.prototype['messageType'] = 'goods';
  /**
   * This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored
   * @member {String} documentCode
   */
  exports.prototype['documentCode'] = undefined;
  /**
   * @member {module:model/HeaderForGoodsParticipants} participants
   */
  exports.prototype['participants'] = undefined;
  /**
   * This is the public NF id. With this number is possible get invoice information directly from government.
   * @member {String} nfAccessKey
   */
  exports.prototype['nfAccessKey'] = undefined;
  /**
   * qr code printed on DANFE;
   * @member {String} nfceQrCode
   */
  exports.prototype['nfceQrCode'] = undefined;
  /**
   * This string indicates the type of transaction for which tax should be calculated.
   * @member {module:model/HeaderForGoods.TransactionTypeEnum} transactionType
   */
  exports.prototype['transactionType'] = undefined;
  /**
   * - '01' # Nota Fiscal 1/1A - '1B' # Nota Fiscal Avulsa - '02' # Nota Fiscal de Venda a-Consumidor - '2D' # Cupom Fiscal - '2E' # Cupom Fiscal-Bilhete de Passagem - '04' # Nota Fiscal de Produtor - '06' # Nota Fiscal/Conta de Energia Elétrica - '07' # Nota Fiscal de Serviço de Transporte - '08' # Conhecimento de Transporte Rodoviário de-Cargas - '8B' # Conhecimento de Transporte de-Cargas Avulso - '09' # Conhecimento de Transporte Aquaviário de-Cargas - '10' # Conhecimento Aéreo - '11' # Conhecimento de Transporte Ferroviário de-Cargas - '13' # Bilhete de Passagem Rodoviário - '14' # Bilhete de Passagem Aquaviário - '15' # Bilhete de Passagem e-Nota de-Bagagem - '16' # Bilhete de Passagem Ferroviário - '18' # Resumo de Movimento Diário - '21' # Nota Fiscal de Serviço de-Comunicação - '22' # Nota Fiscal de Serviço de Telecomunicação - '26' # Conhecimento de Transporte Multimodal de-Cargas - '27' # Nota Fiscal De Transporte Ferroviário De-Carga - '28' # Nota Fiscal/Conta de Fornecimento de Gás-Canalizado - '29' # Nota Fiscal/Conta de Fornecimento de Água-Canalizada - '55' # Nota Fiscal Eletrônica (NF-e) - '57' # Conhecimento de Transporte Eletrônico (CT-e) - '59' # Cupom Fiscal Eletrônico (CF-e-SAT) - '60' # Cupom Fiscal Eletrônico (CF-e-ECF) - '65' # Nota Fiscal Eletrônica ao-Consumidor Final (NFC-e) 
   * @member {module:model/HeaderForGoods.TransactionModelEnum} transactionModel
   */
  exports.prototype['transactionModel'] = undefined;
  /**
   * Natureza da Opreração - 'Describe kind of this transaction, summary
   * @member {String} transactionClass
   */
  exports.prototype['transactionClass'] = undefined;
  /**
   * @member {module:model/HeaderForGoods.EDocCreatorTypeEnum} eDocCreatorType
   * @default 'self'
   */
  exports.prototype['eDocCreatorType'] = 'self';
  /**
   * @member {Boolean} eDocCreatorPerspective
   * @default true
   */
  exports.prototype['eDocCreatorPerspective'] = true;
  /**
   * currency code
   * @member {String} currency
   */
  exports.prototype['currency'] = undefined;
  /**
   * This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity
   * @member {String} companyLocation
   */
  exports.prototype['companyLocation'] = undefined;
  /**
   * This string is the transaction date in ISO 8601 format, create transaction date
   * @member {String} transactionDate
   */
  exports.prototype['transactionDate'] = undefined;
  /**
   * This string is the transaction date in ISO 8601 format, when products were shipped, can be empty or absent
   * @member {String} shippingDate
   */
  exports.prototype['shippingDate'] = undefined;
  /**
   * @member {module:model/AdditionalInformation} additionalInfo
   */
  exports.prototype['additionalInfo'] = undefined;
  /**
   * how the document will be printed - '0' # without DANFE; - '1' # DANFe Letter; - '2' # DANFe Landscape; - '3' # DANFe Simplified; - '4' # DANFe NFC-e; - '5' # DANFe NFC-e e-mail 
   * @member {module:model/HeaderForGoods.TpImpEnum} tpImp
   */
  exports.prototype['tpImp'] = undefined;
  /**
   * This indicator inform transaction target place, when is AUTOMATIC the company address and entity address are analyzed to identify type of transaction target place 1- same state; 2 - interstate; 3-with exterior. Exist some cases where is necessary force this situation like when buyer from another state buy something in loco, the address are from different states, but transaction no.  Identificador de Local de destino da operação, na opção AUTOMATIC endereços da Companhia e da entidade destino são analisados para saber se é uma operação dentro do mesmo estado, interestadual ou com o exterior. Há situações onde é necessário forçar este indicador como por exemplo  Quando uma pessoa com endereço em outro estado, compra uma mercadoria de forma presencial, é uma operação interna apesar dos endereços dos envolvidos estarem em estados distintos. - 0 # AUTOMATIC - DEFAULT - 1 # Interna; - 2 # Interestadual; - 3 # Exterior) 
   * @member {Number} idDest
   */
  exports.prototype['idDest'] = undefined;
  /**
   * Presence indicator - '0' # Not applicable - '1' # Presential; - '2' # Remote, internet; - '3' # Remote, phone; - '4' # NFC-e home delivery; - '9' # Remote, others 
   * @member {module:model/HeaderForGoods.IndPresEnum} indPres
   */
  exports.prototype['indPres'] = undefined;
  /**
   * Invoice number, sequential unique by invoice serial (Número da nota fiscal)
   * @member {Number} invoiceNumber
   */
  exports.prototype['invoiceNumber'] = undefined;
  /**
   * Invoice number, sequential unique by invoice serial (Número da nota fiscal) 
   * @member {Number} invoiceSerial
   */
  exports.prototype['invoiceSerial'] = undefined;
  /**
   * @member {module:model/DefaultLocations} defaultLocations
   */
  exports.prototype['defaultLocations'] = undefined;
  /**
   * Shipment
   * @member {module:model/Transport} transport
   */
  exports.prototype['transport'] = undefined;
  /**
   * Transactions or other invoices referenced
   * @member {Array.<module:model/NRef>} nfRef
   */
  exports.prototype['nfRef'] = undefined;
  /**
   * @member {module:model/Payment} payment
   */
  exports.prototype['payment'] = undefined;
  /**
   * @member {module:model/PurchaseInfo} purchaseInfo
   */
  exports.prototype['purchaseInfo'] = undefined;
  /**
   * @member {module:model/ExportInfo} export
   */
  exports.prototype['export'] = undefined;


  /**
   * Allowed values for the <code>messageType</code> property.
   * @enum {String}
   * @readonly
   */
  exports.MessageTypeEnum = {
    /**
     * value: "goods"
     * @const
     */
    "goods": "goods"  };

  /**
   * Allowed values for the <code>transactionType</code> property.
   * @enum {String}
   * @readonly
   */
  exports.TransactionTypeEnum = {
    /**
     * value: "Sale"
     * @const
     */
    "Sale": "Sale",
    /**
     * value: "Purchase"
     * @const
     */
    "Purchase": "Purchase",
    /**
     * value: "SalesReturn"
     * @const
     */
    "SalesReturn": "SalesReturn",
    /**
     * value: "PurchaseReturn"
     * @const
     */
    "PurchaseReturn": "PurchaseReturn",
    /**
     * value: "TransferReturn"
     * @const
     */
    "TransferReturn": "TransferReturn",
    /**
     * value: "Shipping"
     * @const
     */
    "Shipping": "Shipping",
    /**
     * value: "ShippingReturn"
     * @const
     */
    "ShippingReturn": "ShippingReturn",
    /**
     * value: "Transfer"
     * @const
     */
    "Transfer": "Transfer",
    /**
     * value: "ReceiptAdjustment"
     * @const
     */
    "ReceiptAdjustment": "ReceiptAdjustment",
    /**
     * value: "TransferAdjustment"
     * @const
     */
    "TransferAdjustment": "TransferAdjustment"  };

  /**
   * Allowed values for the <code>transactionModel</code> property.
   * @enum {String}
   * @readonly
   */
  exports.TransactionModelEnum = {
    /**
     * value: "01"
     * @const
     */
    "01": "01",
    /**
     * value: "1B"
     * @const
     */
    "1B": "1B",
    /**
     * value: "02"
     * @const
     */
    "02": "02",
    /**
     * value: "2D"
     * @const
     */
    "2D": "2D",
    /**
     * value: "2E"
     * @const
     */
    "2E": "2E",
    /**
     * value: "04"
     * @const
     */
    "04": "04",
    /**
     * value: "06"
     * @const
     */
    "06": "06",
    /**
     * value: "07"
     * @const
     */
    "07": "07",
    /**
     * value: "08"
     * @const
     */
    "08": "08",
    /**
     * value: "8B"
     * @const
     */
    "8B": "8B",
    /**
     * value: "09"
     * @const
     */
    "09": "09",
    /**
     * value: "10"
     * @const
     */
    "10": "10",
    /**
     * value: "11"
     * @const
     */
    "11": "11",
    /**
     * value: "13"
     * @const
     */
    "13": "13",
    /**
     * value: "14"
     * @const
     */
    "14": "14",
    /**
     * value: "15"
     * @const
     */
    "15": "15",
    /**
     * value: "16"
     * @const
     */
    "16": "16",
    /**
     * value: "18"
     * @const
     */
    "18": "18",
    /**
     * value: "21"
     * @const
     */
    "21": "21",
    /**
     * value: "22"
     * @const
     */
    "22": "22",
    /**
     * value: "26"
     * @const
     */
    "26": "26",
    /**
     * value: "27"
     * @const
     */
    "27": "27",
    /**
     * value: "28"
     * @const
     */
    "28": "28",
    /**
     * value: "29"
     * @const
     */
    "29": "29",
    /**
     * value: "55"
     * @const
     */
    "55": "55",
    /**
     * value: "57"
     * @const
     */
    "57": "57",
    /**
     * value: "59"
     * @const
     */
    "59": "59",
    /**
     * value: "60"
     * @const
     */
    "60": "60",
    /**
     * value: "65"
     * @const
     */
    "65": "65"  };

  /**
   * Allowed values for the <code>eDocCreatorType</code> property.
   * @enum {String}
   * @readonly
   */
  exports.EDocCreatorTypeEnum = {
    /**
     * value: "self"
     * @const
     */
    "self": "self",
    /**
     * value: "other"
     * @const
     */
    "other": "other"  };

  /**
   * Allowed values for the <code>tpImp</code> property.
   * @enum {String}
   * @readonly
   */
  exports.TpImpEnum = {
    /**
     * value: "0"
     * @const
     */
    "0": "0",
    /**
     * value: "1"
     * @const
     */
    "1": "1",
    /**
     * value: "2"
     * @const
     */
    "2": "2",
    /**
     * value: "3"
     * @const
     */
    "3": "3",
    /**
     * value: "4"
     * @const
     */
    "4": "4",
    /**
     * value: "5"
     * @const
     */
    "5": "5"  };

  /**
   * Allowed values for the <code>indPres</code> property.
   * @enum {String}
   * @readonly
   */
  exports.IndPresEnum = {
    /**
     * value: "0"
     * @const
     */
    "0": "0",
    /**
     * value: "1"
     * @const
     */
    "1": "1",
    /**
     * value: "2"
     * @const
     */
    "2": "2",
    /**
     * value: "3"
     * @const
     */
    "3": "3",
    /**
     * value: "4"
     * @const
     */
    "4": "4",
    /**
     * value: "9"
     * @const
     */
    "9": "9"  };


  return exports;
}));


