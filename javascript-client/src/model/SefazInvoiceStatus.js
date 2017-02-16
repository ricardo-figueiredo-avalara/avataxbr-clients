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
    define(['ApiClient', 'model/SefazInvoiceBasicStatus'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./SefazInvoiceBasicStatus'));
  } else {
    // Browser globals (root is window)
    if (!root.Br16Api) {
      root.Br16Api = {};
    }
    root.Br16Api.SefazInvoiceStatus = factory(root.Br16Api.ApiClient, root.Br16Api.SefazInvoiceBasicStatus);
  }
}(this, function(ApiClient, SefazInvoiceBasicStatus) {
  'use strict';




  /**
   * The SefazInvoiceStatus model module.
   * @module model/SefazInvoiceStatus
   * @version 1.0
   */

  /**
   * Constructs a new <code>SefazInvoiceStatus</code>.
   * @alias module:model/SefazInvoiceStatus
   * @class
   * @implements module:model/SefazInvoiceBasicStatus
   */
  var exports = function() {
    var _this = this;

    SefazInvoiceBasicStatus.call(_this);





  };

  /**
   * Constructs a <code>SefazInvoiceStatus</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SefazInvoiceStatus} obj Optional instance to populate.
   * @return {module:model/SefazInvoiceStatus} The populated <code>SefazInvoiceStatus</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      SefazInvoiceBasicStatus.constructFromObject(data, obj);
      if (data.hasOwnProperty('protocol')) {
        obj['protocol'] = ApiClient.convertToType(data['protocol'], 'String');
      }
      if (data.hasOwnProperty('rec')) {
        obj['rec'] = ApiClient.convertToType(data['rec'], 'String');
      }
      if (data.hasOwnProperty('date')) {
        obj['date'] = ApiClient.convertToType(data['date'], 'Date');
      }
      if (data.hasOwnProperty('environment')) {
        obj['environment'] = ApiClient.convertToType(data['environment'], 'String');
      }
      if (data.hasOwnProperty('appVersion')) {
        obj['appVersion'] = ApiClient.convertToType(data['appVersion'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} protocol
   */
  exports.prototype['protocol'] = undefined;
  /**
   * @member {String} rec
   */
  exports.prototype['rec'] = undefined;
  /**
   * @member {Date} date
   */
  exports.prototype['date'] = undefined;
  /**
   * - '1' # Ambiente de Produção - '2' # Ambiente de Homologação 
   * @member {module:model/SefazInvoiceStatus.EnvironmentEnum} environment
   */
  exports.prototype['environment'] = undefined;
  /**
   * @member {String} appVersion
   */
  exports.prototype['appVersion'] = undefined;

  // Implement SefazInvoiceBasicStatus interface:
  /**
   * @member {String} code
   */
exports.prototype['code'] = undefined;

  /**
   * @member {String} desc
   */
exports.prototype['desc'] = undefined;


  /**
   * Allowed values for the <code>environment</code> property.
   * @enum {String}
   * @readonly
   */
  exports.EnvironmentEnum = {
    /**
     * value: "1"
     * @const
     */
    "1": "1",
    /**
     * value: "2"
     * @const
     */
    "2": "2"  };


  return exports;
}));


