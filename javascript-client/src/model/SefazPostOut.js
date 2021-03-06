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
    define(['ApiClient', 'model/SefazInvoiceStatus'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./SefazInvoiceStatus'));
  } else {
    // Browser globals (root is window)
    if (!root.AvaTaxBrazil) {
      root.AvaTaxBrazil = {};
    }
    root.AvaTaxBrazil.SefazPostOut = factory(root.AvaTaxBrazil.ApiClient, root.AvaTaxBrazil.SefazInvoiceStatus);
  }
}(this, function(ApiClient, SefazInvoiceStatus) {
  'use strict';




  /**
   * The SefazPostOut model module.
   * @module model/SefazPostOut
   * @version 1.0
   */

  /**
   * Constructs a new <code>SefazPostOut</code>.
   * @alias module:model/SefazPostOut
   * @class
   */
  var exports = function() {
    var _this = this;




  };

  /**
   * Constructs a <code>SefazPostOut</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SefazPostOut} obj Optional instance to populate.
   * @return {module:model/SefazPostOut} The populated <code>SefazPostOut</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('key')) {
        obj['key'] = ApiClient.convertToType(data['key'], 'String');
      }
      if (data.hasOwnProperty('documentCode')) {
        obj['documentCode'] = ApiClient.convertToType(data['documentCode'], 'String');
      }
      if (data.hasOwnProperty('status')) {
        obj['status'] = SefazInvoiceStatus.constructFromObject(data['status']);
      }
    }
    return obj;
  }

  /**
   * @member {String} key
   */
  exports.prototype['key'] = undefined;
  /**
   * @member {String} documentCode
   */
  exports.prototype['documentCode'] = undefined;
  /**
   * @member {module:model/SefazInvoiceStatus} status
   */
  exports.prototype['status'] = undefined;



  return exports;
}));


