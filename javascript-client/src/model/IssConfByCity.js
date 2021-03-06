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
    define(['ApiClient', 'model/IssConfServiceList', 'model/StateEnum'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./IssConfServiceList'), require('./StateEnum'));
  } else {
    // Browser globals (root is window)
    if (!root.AvaTaxBrazil) {
      root.AvaTaxBrazil = {};
    }
    root.AvaTaxBrazil.IssConfByCity = factory(root.AvaTaxBrazil.ApiClient, root.AvaTaxBrazil.IssConfServiceList, root.AvaTaxBrazil.StateEnum);
  }
}(this, function(ApiClient, IssConfServiceList, StateEnum) {
  'use strict';




  /**
   * The IssConfByCity model module.
   * @module model/IssConfByCity
   * @version 1.0
   */

  /**
   * Constructs a new <code>IssConfByCity</code>.
   * @alias module:model/IssConfByCity
   * @class
   * @param cityCode {Number} City Code (IBGE)
   */
  var exports = function(cityCode) {
    var _this = this;

    _this['cityCode'] = cityCode;






  };

  /**
   * Constructs a <code>IssConfByCity</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/IssConfByCity} obj Optional instance to populate.
   * @return {module:model/IssConfByCity} The populated <code>IssConfByCity</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('cityCode')) {
        obj['cityCode'] = ApiClient.convertToType(data['cityCode'], 'Number');
      }
      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
      if (data.hasOwnProperty('state')) {
        obj['state'] = StateEnum.constructFromObject(data['state']);
      }
      if (data.hasOwnProperty('issWhDestOtherCities')) {
        obj['issWhDestOtherCities'] = ApiClient.convertToType(data['issWhDestOtherCities'], 'Boolean');
      }
      if (data.hasOwnProperty('issWhDestSameCity')) {
        obj['issWhDestSameCity'] = ApiClient.convertToType(data['issWhDestSameCity'], 'Boolean');
      }
      if (data.hasOwnProperty('issWhOriginUnregSeller')) {
        obj['issWhOriginUnregSeller'] = ApiClient.convertToType(data['issWhOriginUnregSeller'], 'Boolean');
      }
      if (data.hasOwnProperty('serviceList')) {
        obj['serviceList'] = ApiClient.convertToType(data['serviceList'], [IssConfServiceList]);
      }
    }
    return obj;
  }

  /**
   * City Code (IBGE)
   * @member {Number} cityCode
   */
  exports.prototype['cityCode'] = undefined;
  /**
   * @member {String} name
   */
  exports.prototype['name'] = undefined;
  /**
   * @member {module:model/StateEnum} state
   */
  exports.prototype['state'] = undefined;
  /**
   * @member {Boolean} issWhDestOtherCities
   */
  exports.prototype['issWhDestOtherCities'] = undefined;
  /**
   * @member {Boolean} issWhDestSameCity
   */
  exports.prototype['issWhDestSameCity'] = undefined;
  /**
   * @member {Boolean} issWhOriginUnregSeller
   */
  exports.prototype['issWhOriginUnregSeller'] = undefined;
  /**
   * @member {Array.<module:model/IssConfServiceList>} serviceList
   */
  exports.prototype['serviceList'] = undefined;



  return exports;
}));


