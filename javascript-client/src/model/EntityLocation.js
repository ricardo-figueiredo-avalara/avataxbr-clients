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
    root.AvaTaxBrazil.EntityLocation = factory(root.AvaTaxBrazil.ApiClient, root.AvaTaxBrazil.StateEnum);
  }
}(this, function(ApiClient, StateEnum) {
  'use strict';




  /**
   * The EntityLocation model module.
   * @module model/EntityLocation
   * @version 1.0
   */

  /**
   * Constructs a new <code>EntityLocation</code>.
   * @alias module:model/EntityLocation
   * @class
   * @param zipcode {String} Brazilian Zip Code
   */
  var exports = function(zipcode) {
    var _this = this;



    _this['zipcode'] = zipcode;





  };

  /**
   * Constructs a <code>EntityLocation</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/EntityLocation} obj Optional instance to populate.
   * @return {module:model/EntityLocation} The populated <code>EntityLocation</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('street')) {
        obj['street'] = ApiClient.convertToType(data['street'], 'String');
      }
      if (data.hasOwnProperty('neighborhood')) {
        obj['neighborhood'] = ApiClient.convertToType(data['neighborhood'], 'String');
      }
      if (data.hasOwnProperty('zipcode')) {
        obj['zipcode'] = ApiClient.convertToType(data['zipcode'], 'String');
      }
      if (data.hasOwnProperty('cityCode')) {
        obj['cityCode'] = ApiClient.convertToType(data['cityCode'], 'String');
      }
      if (data.hasOwnProperty('cityName')) {
        obj['cityName'] = ApiClient.convertToType(data['cityName'], 'String');
      }
      if (data.hasOwnProperty('state')) {
        obj['state'] = StateEnum.constructFromObject(data['state']);
      }
      if (data.hasOwnProperty('countryCode')) {
        obj['countryCode'] = ApiClient.convertToType(data['countryCode'], 'String');
      }
      if (data.hasOwnProperty('country')) {
        obj['country'] = ApiClient.convertToType(data['country'], 'String');
      }
    }
    return obj;
  }

  /**
   * Street Name
   * @member {String} street
   */
  exports.prototype['street'] = undefined;
  /**
   * Neighborhood Name
   * @member {String} neighborhood
   */
  exports.prototype['neighborhood'] = undefined;
  /**
   * Brazilian Zip Code
   * @member {String} zipcode
   */
  exports.prototype['zipcode'] = undefined;
  /**
   * City Code (IBGE)
   * @member {String} cityCode
   */
  exports.prototype['cityCode'] = undefined;
  /**
   * City Name
   * @member {String} cityName
   */
  exports.prototype['cityName'] = undefined;
  /**
   * @member {module:model/StateEnum} state
   */
  exports.prototype['state'] = undefined;
  /**
   * Country Code
   * @member {String} countryCode
   * @default '0'
   */
  exports.prototype['countryCode'] = '0';
  /**
   * Use ISO 3166-1 alpha-3 codes
   * @member {String} country
   * @default 'BRA'
   */
  exports.prototype['country'] = 'BRA';



  return exports;
}));


