/**
 * BR16 - API
 * This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts
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
    define(['ApiClient', 'model/SalesCalculatedTax', 'model/SalesLinesIn', 'model/SalesLinesOutTaxDeductions'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./SalesCalculatedTax'), require('./SalesLinesIn'), require('./SalesLinesOutTaxDeductions'));
  } else {
    // Browser globals (root is window)
    if (!root.Br16Api) {
      root.Br16Api = {};
    }
    root.Br16Api.SalesLinesOut = factory(root.Br16Api.ApiClient, root.Br16Api.SalesCalculatedTax, root.Br16Api.SalesLinesIn, root.Br16Api.SalesLinesOutTaxDeductions);
  }
}(this, function(ApiClient, SalesCalculatedTax, SalesLinesIn, SalesLinesOutTaxDeductions) {
  'use strict';




  /**
   * The SalesLinesOut model module.
   * @module model/SalesLinesOut
   * @version 1.0
   */

  /**
   * Constructs a new <code>SalesLinesOut</code>.
   * @alias module:model/SalesLinesOut
   * @class
   * @implements module:model/SalesLinesIn
   * @param itemCode {String} This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU and is required for SST states.
   */
  var exports = function(itemCode) {
    var _this = this;

    SalesLinesIn.call(_this, itemCode);






  };

  /**
   * Constructs a <code>SalesLinesOut</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SalesLinesOut} obj Optional instance to populate.
   * @return {module:model/SalesLinesOut} The populated <code>SalesLinesOut</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      SalesLinesIn.constructFromObject(data, obj);
      if (data.hasOwnProperty('avalaraGoodsAndServicesType')) {
        obj['avalaraGoodsAndServicesType'] = ApiClient.convertToType(data['avalaraGoodsAndServicesType'], 'String');
      }
      if (data.hasOwnProperty('lineNetValue')) {
        obj['lineNetValue'] = ApiClient.convertToType(data['lineNetValue'], 'Number');
      }
      if (data.hasOwnProperty('cst')) {
        obj['cst'] = ApiClient.convertToType(data['cst'], 'String');
      }
      if (data.hasOwnProperty('cstRf')) {
        obj['cstRf'] = ApiClient.convertToType(data['cstRf'], 'String');
      }
      if (data.hasOwnProperty('taxDeductions')) {
        obj['taxDeductions'] = SalesLinesOutTaxDeductions.constructFromObject(data['taxDeductions']);
      }
      if (data.hasOwnProperty('calculatedTax')) {
        obj['calculatedTax'] = SalesCalculatedTax.constructFromObject(data['calculatedTax']);
      }
    }
    return obj;
  }

  /**
   * AGAST CODE for itemCode
   * @member {String} avalaraGoodsAndServicesType
   */
  exports.prototype['avalaraGoodsAndServicesType'] = undefined;
  /**
   * This decimal captures the total cost of this line. In its simplest form lineNetValue = (lineAmount - discountTaxable - sum of whithholdings).
   * @member {Number} lineNetValue
   */
  exports.prototype['lineNetValue'] = undefined;
  /**
   * - '01' # ORIGIN MODE - '02' # ORIGIN MODE BUT EXEMPT - '03' # ORIGIN MODE BUT IMMUNE - '04' # ORIGIN MODE BUT SUSPENDED FOR LEGAL REASON - '05' # ORIGIN MODE BUT SUSPENDED FOR ADMINISTRATIVE REASON - '21' # DESTINATION MODE - '22' # DESTINATION MODE BUT EXEMPT - '23' # DESTINATION MODE BUT IMMUNE - '24' # DESTINATION MODE BUT SUSPENDED - '25' # DESTINATION MODE BUT SUSPENDED - '40' # FOREIGN IMMUNE MODE 
   * @member {module:model/SalesLinesOut.CstEnum} cst
   */
  exports.prototype['cst'] = undefined;
  /**
   * - '61' # WITHHOLD NORMAL MODE - '62' # WITHHOLD NORMAL MODE BUT EXEMPT - '63' # WITHHOLD NORMAL MODE BUT IMMUNE - '64' # WITHHOLD NORMAL MODE BUT SUSPENDED FOR LEGAL REASON - '65' # WITHHOLD NORMAL MODE BUT SUSPENDED FOR ADMINISTRATIVE REASON - '66' # WITHHOLD FORCED MODE - '67' # WITHHOLD FORCED MODE BUT EXEMPT - '68' # WITHHOLD FORCED MODE BUT IMMUNE - '69' # WITHHOLD FORCED MODE BUT SUSPENDED FOR LEGAL REASON - '70' # WITHHOLD FORCED MODE BUT SUSPENDED FOR ADMINISTRATIVE PROCESS - '71' # NO WITHHOLD MODE - '72' # NO WITHHOLD FOREIGN MODE 
   * @member {module:model/SalesLinesOut.CstRfEnum} cstRf
   */
  exports.prototype['cstRf'] = undefined;
  /**
   * @member {module:model/SalesLinesOutTaxDeductions} taxDeductions
   */
  exports.prototype['taxDeductions'] = undefined;
  /**
   * @member {module:model/SalesCalculatedTax} calculatedTax
   */
  exports.prototype['calculatedTax'] = undefined;

  // Implement SalesLinesIn interface:
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
   * This decimal captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1
   * @member {Number} numberOfItems
   * @default 1.0
   */
exports.prototype['numberOfItems'] = 1.0;

  /**
   * This decimal captures the total cost of this line. In its simplest form lineAmount = (item price * numberOfItems).
   * @member {Number} lineAmount
   */
exports.prototype['lineAmount'] = undefined;

  /**
   * This string captures the description of the item represented by this line, will be used LC 116
   * @member {String} itemDescription
   */
exports.prototype['itemDescription'] = undefined;

  /**
   * Conditional discount
   * @member {Number} lineTaxedDiscount
   */
exports.prototype['lineTaxedDiscount'] = undefined;

  /**
   * Unconditional discount
   * @member {Number} lineUntaxedDiscount
   */
exports.prototype['lineUntaxedDiscount'] = undefined;

  /**
   * @member {module:model/SalesLinesInTaxDeductions} taxDeductions
   */
exports.prototype['taxDeductions'] = undefined;


  /**
   * Allowed values for the <code>cst</code> property.
   * @enum {String}
   * @readonly
   */
  exports.CstEnum = {
    /**
     * value: "01"
     * @const
     */
    "01": "01",
    /**
     * value: "02"
     * @const
     */
    "02": "02",
    /**
     * value: "03"
     * @const
     */
    "03": "03",
    /**
     * value: "04"
     * @const
     */
    "04": "04",
    /**
     * value: "05"
     * @const
     */
    "05": "05",
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
     * value: "23"
     * @const
     */
    "23": "23",
    /**
     * value: "24"
     * @const
     */
    "24": "24",
    /**
     * value: "25"
     * @const
     */
    "25": "25",
    /**
     * value: "40"
     * @const
     */
    "40": "40"  };

  /**
   * Allowed values for the <code>cstRf</code> property.
   * @enum {String}
   * @readonly
   */
  exports.CstRfEnum = {
    /**
     * value: "61"
     * @const
     */
    "61": "61",
    /**
     * value: "62"
     * @const
     */
    "62": "62",
    /**
     * value: "63"
     * @const
     */
    "63": "63",
    /**
     * value: "64"
     * @const
     */
    "64": "64",
    /**
     * value: "65"
     * @const
     */
    "65": "65",
    /**
     * value: "66"
     * @const
     */
    "66": "66",
    /**
     * value: "67"
     * @const
     */
    "67": "67",
    /**
     * value: "68"
     * @const
     */
    "68": "68",
    /**
     * value: "69"
     * @const
     */
    "69": "69",
    /**
     * value: "70"
     * @const
     */
    "70": "70",
    /**
     * value: "71"
     * @const
     */
    "71": "71",
    /**
     * value: "72"
     * @const
     */
    "72": "72"  };


  return exports;
}));


