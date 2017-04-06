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
    root.AvaTaxBrazil.NRefRefNF = factory(root.AvaTaxBrazil.ApiClient, root.AvaTaxBrazil.StateEnum);
  }
}(this, function(ApiClient, StateEnum) {
  'use strict';




  /**
   * The NRefRefNF model module.
   * @module model/NRefRefNF
   * @version 1.0
   */

  /**
   * Constructs a new <code>NRefRefNF</code>.
   * @alias module:model/NRefRefNF
   * @class
   * @param stateCd {module:model/StateEnum} State code of fiscal Document creator
   * @param yymm {String} year and month of fiscal document creation
   * @param federalTaxId {String} fiscal document creator federalTaxId
   * @param serie {String} fiscal document serie
   * @param _number {String} fiscal document number
   */
  var exports = function(stateCd, yymm, federalTaxId, serie, _number) {
    var _this = this;

    _this['stateCd'] = stateCd;
    _this['yymm'] = yymm;
    _this['federalTaxId'] = federalTaxId;
    _this['serie'] = serie;
    _this['number'] = _number;
  };

  /**
   * Constructs a <code>NRefRefNF</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/NRefRefNF} obj Optional instance to populate.
   * @return {module:model/NRefRefNF} The populated <code>NRefRefNF</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('stateCd')) {
        obj['stateCd'] = StateEnum.constructFromObject(data['stateCd']);
      }
      if (data.hasOwnProperty('yymm')) {
        obj['yymm'] = ApiClient.convertToType(data['yymm'], 'String');
      }
      if (data.hasOwnProperty('federalTaxId')) {
        obj['federalTaxId'] = ApiClient.convertToType(data['federalTaxId'], 'String');
      }
      if (data.hasOwnProperty('serie')) {
        obj['serie'] = ApiClient.convertToType(data['serie'], 'String');
      }
      if (data.hasOwnProperty('number')) {
        obj['number'] = ApiClient.convertToType(data['number'], 'String');
      }
    }
    return obj;
  }

  /**
   * State code of fiscal Document creator
   * @member {module:model/StateEnum} stateCd
   */
  exports.prototype['stateCd'] = undefined;
  /**
   * year and month of fiscal document creation
   * @member {String} yymm
   */
  exports.prototype['yymm'] = undefined;
  /**
   * fiscal document creator federalTaxId
   * @member {String} federalTaxId
   */
  exports.prototype['federalTaxId'] = undefined;
  /**
   * fiscal document serie
   * @member {String} serie
   */
  exports.prototype['serie'] = undefined;
  /**
   * fiscal document number
   * @member {String} number
   */
  exports.prototype['number'] = undefined;



  return exports;
}));


