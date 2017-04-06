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
    define(['ApiClient', 'model/AdditionalInformationProcRef'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./AdditionalInformationProcRef'));
  } else {
    // Browser globals (root is window)
    if (!root.AvaTaxBrazil) {
      root.AvaTaxBrazil = {};
    }
    root.AvaTaxBrazil.AdditionalInformation = factory(root.AvaTaxBrazil.ApiClient, root.AvaTaxBrazil.AdditionalInformationProcRef);
  }
}(this, function(ApiClient, AdditionalInformationProcRef) {
  'use strict';




  /**
   * The AdditionalInformation model module.
   * @module model/AdditionalInformation
   * @version 1.0
   */

  /**
   * Constructs a new <code>AdditionalInformation</code>.
   * @alias module:model/AdditionalInformation
   * @class
   */
  var exports = function() {
    var _this = this;




  };

  /**
   * Constructs a <code>AdditionalInformation</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AdditionalInformation} obj Optional instance to populate.
   * @return {module:model/AdditionalInformation} The populated <code>AdditionalInformation</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('fiscalInfo')) {
        obj['fiscalInfo'] = ApiClient.convertToType(data['fiscalInfo'], 'String');
      }
      if (data.hasOwnProperty('complementaryInfo')) {
        obj['complementaryInfo'] = ApiClient.convertToType(data['complementaryInfo'], 'String');
      }
      if (data.hasOwnProperty('procRef')) {
        obj['procRef'] = ApiClient.convertToType(data['procRef'], [AdditionalInformationProcRef]);
      }
    }
    return obj;
  }

  /**
   * Additional information of fiscal interest
   * @member {String} fiscalInfo
   */
  exports.prototype['fiscalInfo'] = undefined;
  /**
   * Additional information of user interest
   * @member {String} complementaryInfo
   */
  exports.prototype['complementaryInfo'] = undefined;
  /**
   * Referenced Process
   * @member {Array.<module:model/AdditionalInformationProcRef>} procRef
   */
  exports.prototype['procRef'] = undefined;



  return exports;
}));

