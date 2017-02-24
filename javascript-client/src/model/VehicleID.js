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
    define(['ApiClient', 'model/StateEnum'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./StateEnum'));
  } else {
    // Browser globals (root is window)
    if (!root.AvaTaxBrazil) {
      root.AvaTaxBrazil = {};
    }
    root.AvaTaxBrazil.VehicleID = factory(root.AvaTaxBrazil.ApiClient, root.AvaTaxBrazil.StateEnum);
  }
}(this, function(ApiClient, StateEnum) {
  'use strict';




  /**
   * The VehicleID model module.
   * @module model/VehicleID
   * @version 1.0
   */

  /**
   * Constructs a new <code>VehicleID</code>.
   * @alias module:model/VehicleID
   * @class
   * @param licensePlate {String} 
   * @param stateCode {module:model/StateEnum} 
   */
  var exports = function(licensePlate, stateCode) {
    var _this = this;

    _this['licensePlate'] = licensePlate;
    _this['stateCode'] = stateCode;

  };

  /**
   * Constructs a <code>VehicleID</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/VehicleID} obj Optional instance to populate.
   * @return {module:model/VehicleID} The populated <code>VehicleID</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('licensePlate')) {
        obj['licensePlate'] = ApiClient.convertToType(data['licensePlate'], 'String');
      }
      if (data.hasOwnProperty('stateCode')) {
        obj['stateCode'] = StateEnum.constructFromObject(data['stateCode']);
      }
      if (data.hasOwnProperty('rtnc')) {
        obj['rtnc'] = ApiClient.convertToType(data['rtnc'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} licensePlate
   */
  exports.prototype['licensePlate'] = undefined;
  /**
   * @member {module:model/StateEnum} stateCode
   */
  exports.prototype['stateCode'] = undefined;
  /**
   * Cargo Transport National Register, Registro Nacional de Transportador de Carga (ANTT)
   * @member {String} rtnc
   */
  exports.prototype['rtnc'] = undefined;



  return exports;
}));


