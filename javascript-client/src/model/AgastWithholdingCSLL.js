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
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.AvaTaxBrazil) {
      root.AvaTaxBrazil = {};
    }
    root.AvaTaxBrazil.AgastWithholdingCSLL = factory(root.AvaTaxBrazil.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The AgastWithholdingCSLL model module.
   * @module model/AgastWithholdingCSLL
   * @version 1.0
   */

  /**
   * Constructs a new <code>AgastWithholdingCSLL</code>.
   * inform if this item is subject to withholding CSLL on service Transactions, by entity type, default true
   * @alias module:model/AgastWithholdingCSLL
   * @class
   */
  var exports = function() {
    var _this = this;










  };

  /**
   * Constructs a <code>AgastWithholdingCSLL</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AgastWithholdingCSLL} obj Optional instance to populate.
   * @return {module:model/AgastWithholdingCSLL} The populated <code>AgastWithholdingCSLL</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('legalReason')) {
        obj['legalReason'] = ApiClient.convertToType(data['legalReason'], 'String');
      }
      if (data.hasOwnProperty('business')) {
        obj['business'] = ApiClient.convertToType(data['business'], 'Boolean');
      }
      if (data.hasOwnProperty('businessLegalReason')) {
        obj['businessLegalReason'] = ApiClient.convertToType(data['businessLegalReason'], 'String');
      }
      if (data.hasOwnProperty('federalGovernment')) {
        obj['federalGovernment'] = ApiClient.convertToType(data['federalGovernment'], 'Boolean');
      }
      if (data.hasOwnProperty('federalGovernmentLegalReason')) {
        obj['federalGovernmentLegalReason'] = ApiClient.convertToType(data['federalGovernmentLegalReason'], 'String');
      }
      if (data.hasOwnProperty('stateGovernment')) {
        obj['stateGovernment'] = ApiClient.convertToType(data['stateGovernment'], 'Boolean');
      }
      if (data.hasOwnProperty('stateGovernmentLegalReason')) {
        obj['stateGovernmentLegalReason'] = ApiClient.convertToType(data['stateGovernmentLegalReason'], 'String');
      }
      if (data.hasOwnProperty('cityGovernment')) {
        obj['cityGovernment'] = ApiClient.convertToType(data['cityGovernment'], 'Boolean');
      }
      if (data.hasOwnProperty('cityGovernmentLegalReason')) {
        obj['cityGovernmentLegalReason'] = ApiClient.convertToType(data['cityGovernmentLegalReason'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} legalReason
   */
  exports.prototype['legalReason'] = undefined;
  /**
   * @member {Boolean} business
   */
  exports.prototype['business'] = undefined;
  /**
   * reference id to TaxLegalReason
   * @member {String} businessLegalReason
   */
  exports.prototype['businessLegalReason'] = undefined;
  /**
   * @member {Boolean} federalGovernment
   */
  exports.prototype['federalGovernment'] = undefined;
  /**
   * reference id to TaxLegalReason
   * @member {String} federalGovernmentLegalReason
   */
  exports.prototype['federalGovernmentLegalReason'] = undefined;
  /**
   * @member {Boolean} stateGovernment
   */
  exports.prototype['stateGovernment'] = undefined;
  /**
   * reference id to TaxLegalReason
   * @member {String} stateGovernmentLegalReason
   */
  exports.prototype['stateGovernmentLegalReason'] = undefined;
  /**
   * @member {Boolean} cityGovernment
   */
  exports.prototype['cityGovernment'] = undefined;
  /**
   * reference id to TaxLegalReason
   * @member {String} cityGovernmentLegalReason
   */
  exports.prototype['cityGovernmentLegalReason'] = undefined;



  return exports;
}));


