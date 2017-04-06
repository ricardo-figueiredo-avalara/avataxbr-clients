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
    define(['ApiClient', 'model/AgastExtendForSefaz', 'model/Fuel', 'model/LineForGoods', 'model/LineForGoodsCalculatedTax', 'model/LineForGoodsDi', 'model/LineForGoodsExport', 'model/LineForGoodsIcmsTaxRelief', 'model/Medicine', 'model/Vehicle', 'model/Weapon'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./AgastExtendForSefaz'), require('./Fuel'), require('./LineForGoods'), require('./LineForGoodsCalculatedTax'), require('./LineForGoodsDi'), require('./LineForGoodsExport'), require('./LineForGoodsIcmsTaxRelief'), require('./Medicine'), require('./Vehicle'), require('./Weapon'));
  } else {
    // Browser globals (root is window)
    if (!root.AvaTaxBrazil) {
      root.AvaTaxBrazil = {};
    }
    root.AvaTaxBrazil.LineForSefazGoods = factory(root.AvaTaxBrazil.ApiClient, root.AvaTaxBrazil.AgastExtendForSefaz, root.AvaTaxBrazil.Fuel, root.AvaTaxBrazil.LineForGoods, root.AvaTaxBrazil.LineForGoodsCalculatedTax, root.AvaTaxBrazil.LineForGoodsDi, root.AvaTaxBrazil.LineForGoodsExport, root.AvaTaxBrazil.LineForGoodsIcmsTaxRelief, root.AvaTaxBrazil.Medicine, root.AvaTaxBrazil.Vehicle, root.AvaTaxBrazil.Weapon);
  }
}(this, function(ApiClient, AgastExtendForSefaz, Fuel, LineForGoods, LineForGoodsCalculatedTax, LineForGoodsDi, LineForGoodsExport, LineForGoodsIcmsTaxRelief, Medicine, Vehicle, Weapon) {
  'use strict';




  /**
   * The LineForSefazGoods model module.
   * @module model/LineForSefazGoods
   * @version 1.0
   */

  /**
   * Constructs a new <code>LineForSefazGoods</code>.
   * @alias module:model/LineForSefazGoods
   * @class
   * @implements module:model/LineForGoods
   * @param lineCode {Number} This string is a unique identifier for this line in the transaction
   * @param itemCode {String} This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU and is required for SST states.
   * @param numberOfItems {Number} This decimal 11 integers and 1 to 4 decimals captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1
   * @param lineAmount {Number} In its simplest form lineAmount = (item price * numberOfItems). If taxIncluded is 'true', lineAmount = (item price * numberOfItems + tax).
   * @param itemDescription {String} This string captures the description of the item represented by this line, will be used LC 116
   * @param useType {module:model/LineForGoods.UseTypeEnum} This is a enumeration folowing table
   * @param processScenario {String} Reference to process configurantion of this transaction, See ProcessScenario definition
   */
  var exports = function(lineCode, itemCode, numberOfItems, lineAmount, itemDescription, useType, processScenario) {
    var _this = this;

    LineForGoods.call(_this, lineCode, itemCode, numberOfItems, lineAmount, itemDescription, useType, processScenario);

  };

  /**
   * Constructs a <code>LineForSefazGoods</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/LineForSefazGoods} obj Optional instance to populate.
   * @return {module:model/LineForSefazGoods} The populated <code>LineForSefazGoods</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      LineForGoods.constructFromObject(data, obj);
      if (data.hasOwnProperty('extend')) {
        obj['extend'] = AgastExtendForSefaz.constructFromObject(data['extend']);
      }
    }
    return obj;
  }

  /**
   * @member {module:model/AgastExtendForSefaz} extend
   */
  exports.prototype['extend'] = undefined;

  // Implement LineForGoods interface:
  /**
   * This string is a unique identifier for this line in the transaction
   * @member {Number} lineCode
   */
exports.prototype['lineCode'] = undefined;

  /**
   * This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU and is required for SST states.
   * @member {String} itemCode
   */
exports.prototype['itemCode'] = undefined;

  /**
   * AGAST CODE for itemCode
   * @member {String} avalaraGoodsAndServicesType
   */
exports.prototype['avalaraGoodsAndServicesType'] = undefined;

  /**
   * This decimal 11 integers and 1 to 4 decimals captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1
   * @member {Number} numberOfItems
   * @default 1.0
   */
exports.prototype['numberOfItems'] = 1.0;

  /**
   * when is return operation this field inform the percentage of returned itens. This decimal max 3 integers and 2 decimals, v >=0.00 and v <= 100.00
   * @member {Number} returnedPercentageAmount
   */
exports.prototype['returnedPercentageAmount'] = undefined;

  /**
   * This decimal 11 integers and 1 to 10 decimals captures the unit price of this line.
   * @member {Number} lineUnitPrice
   */
exports.prototype['lineUnitPrice'] = undefined;

  /**
   * In its simplest form lineAmount = (item price * numberOfItems). If taxIncluded is 'true', lineAmount = (item price * numberOfItems + tax).
   * @member {Number} lineAmount
   */
exports.prototype['lineAmount'] = undefined;

  /**
   * This string captures the description of the item represented by this line, will be used LC 116
   * @member {String} itemDescription
   */
exports.prototype['itemDescription'] = undefined;

  /**
   * Discount conditional, This decimal 13 integers and 0 to 2 decimals
   * @member {Number} lineTaxedDiscount
   */
exports.prototype['lineTaxedDiscount'] = undefined;

  /**
   * discount unconditional, This decimal 13 integers and 0 to 2 decimals
   * @member {Number} lineUntaxedDiscount
   */
exports.prototype['lineUntaxedDiscount'] = undefined;

  /**
   * This is a enumeration folowing table
   * @member {module:model/LineForGoods.UseTypeEnum} useType
   */
exports.prototype['useType'] = undefined;

  /**
   * Reference to process configurantion of this transaction, See ProcessScenario definition
   * @member {String} processScenario
   */
exports.prototype['processScenario'] = undefined;

  /**
   * Fiscal Operation Code of transport service
   * @member {Number} cfop
   */
exports.prototype['cfop'] = undefined;

  /**
   * return if this transaction has stock impact for this process or CFOP
   * @member {Boolean} hasStockImpact
   */
exports.prototype['hasStockImpact'] = undefined;

  /**
   * return if this transaction has finantial impact for this process or CFOP
   * @member {Boolean} hasFinantialImpact
   */
exports.prototype['hasFinantialImpact'] = undefined;

  /**
   * This decimal 13 integers and 0 to 2 decimals
   * @member {Number} freightAmount
   */
exports.prototype['freightAmount'] = undefined;

  /**
   * This decimal 13 integers and 0 to 2 decimals
   * @member {Number} insuranceAmount
   */
exports.prototype['insuranceAmount'] = undefined;

  /**
   * This decimal 13 integers and 0 to 2 decimals
   * @member {Number} otherCostAmount
   */
exports.prototype['otherCostAmount'] = undefined;

  /**
   * The item value will compose the invoice total value.
   * @member {Boolean} indTotType
   * @default true
   */
exports.prototype['indTotType'] = true;

  /**
   * order number, information used for B2B control process
   * @member {String} orderNumber
   */
exports.prototype['orderNumber'] = undefined;

  /**
   * number of the item from order number, information used for B2B control process
   * @member {String} orderItemNumber
   */
exports.prototype['orderItemNumber'] = undefined;

  /**
   * Gloal Unique identifier (Importation form)
   * @member {String} fciNumber
   */
exports.prototype['fciNumber'] = undefined;

  /**
   * RECOPI number
   * @member {String} recopiNumber
   */
exports.prototype['recopiNumber'] = undefined;

  /**
   * additional information about product (referenced standard, complementary info, etc)
   * @member {String} infAdProd
   */
exports.prototype['infAdProd'] = undefined;

  /**
   * @member {module:model/Vehicle} vehicle
   */
exports.prototype['vehicle'] = undefined;

  /**
   * @member {module:model/Medicine} medicine
   */
exports.prototype['medicine'] = undefined;

  /**
   * @member {module:model/Weapon} weapon
   */
exports.prototype['weapon'] = undefined;

  /**
   * @member {module:model/Fuel} fuel
   */
exports.prototype['fuel'] = undefined;

  /**
   * Inform that for this item the Entity referenced is ICMS Substitute
   * @member {Boolean} entityIsIcmsSubstitute
   */
exports.prototype['entityIsIcmsSubstitute'] = undefined;

  /**
   * Inform that this item has ICMS withheld for transport value service.
   * @member {Boolean} isTransportIcmsWithheld
   */
exports.prototype['isTransportIcmsWithheld'] = undefined;

  /**
   * @member {module:model/LineForGoodsIcmsTaxRelief} icmsTaxRelief
   */
exports.prototype['icmsTaxRelief'] = undefined;

  /**
   * Exportation detail
   * @member {Array.<module:model/LineForGoodsExport>} export
   */
exports.prototype['export'] = undefined;

  /**
   * Import declaration
   * @member {Array.<module:model/LineForGoodsDi>} di
   */
exports.prototype['di'] = undefined;

  /**
   * @member {module:model/LineForGoodsCalculatedTax} calculatedTax
   */
exports.prototype['calculatedTax'] = undefined;



  return exports;
}));


