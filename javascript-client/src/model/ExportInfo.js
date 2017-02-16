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
    define(['ApiClient', 'model/StateEnum'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./StateEnum'));
  } else {
    // Browser globals (root is window)
    if (!root.Br16Api) {
      root.Br16Api = {};
    }
    root.Br16Api.ExportInfo = factory(root.Br16Api.ApiClient, root.Br16Api.StateEnum);
  }
}(this, function(ApiClient, StateEnum) {
  'use strict';




  /**
   * The ExportInfo model module.
   * @module model/ExportInfo
   * @version 1.0
   */

  /**
   * Constructs a new <code>ExportInfo</code>.
   * Export information
   * @alias module:model/ExportInfo
   * @class
   * @param shippingState {module:model/StateEnum} shipping state
   * @param place {String} shipping place
   */
  var exports = function(shippingState, place) {
    var _this = this;

    _this['shippingState'] = shippingState;
    _this['place'] = place;

  };

  /**
   * Constructs a <code>ExportInfo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ExportInfo} obj Optional instance to populate.
   * @return {module:model/ExportInfo} The populated <code>ExportInfo</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('shippingState')) {
        obj['shippingState'] = StateEnum.constructFromObject(data['shippingState']);
      }
      if (data.hasOwnProperty('place')) {
        obj['place'] = ApiClient.convertToType(data['place'], 'String');
      }
      if (data.hasOwnProperty('placeDescription')) {
        obj['placeDescription'] = ApiClient.convertToType(data['placeDescription'], 'String');
      }
    }
    return obj;
  }

  /**
   * shipping state
   * @member {module:model/StateEnum} shippingState
   */
  exports.prototype['shippingState'] = undefined;
  /**
   * shipping place
   * @member {String} place
   */
  exports.prototype['place'] = undefined;
  /**
   * description of shipping place
   * @member {String} placeDescription
   */
  exports.prototype['placeDescription'] = undefined;



  return exports;
}));


