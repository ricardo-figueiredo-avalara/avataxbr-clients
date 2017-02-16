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
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.Br16Api) {
      root.Br16Api = {};
    }
    root.Br16Api.TransportVolumes = factory(root.Br16Api.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The TransportVolumes model module.
   * @module model/TransportVolumes
   * @version 1.0
   */

  /**
   * Constructs a new <code>TransportVolumes</code>.
   * @alias module:model/TransportVolumes
   * @class
   */
  var exports = function() {
    var _this = this;








  };

  /**
   * Constructs a <code>TransportVolumes</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/TransportVolumes} obj Optional instance to populate.
   * @return {module:model/TransportVolumes} The populated <code>TransportVolumes</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('qVol')) {
        obj['qVol'] = ApiClient.convertToType(data['qVol'], 'String');
      }
      if (data.hasOwnProperty('specie')) {
        obj['specie'] = ApiClient.convertToType(data['specie'], 'String');
      }
      if (data.hasOwnProperty('brand')) {
        obj['brand'] = ApiClient.convertToType(data['brand'], 'String');
      }
      if (data.hasOwnProperty('volumeNumeration')) {
        obj['volumeNumeration'] = ApiClient.convertToType(data['volumeNumeration'], 'String');
      }
      if (data.hasOwnProperty('netWeight')) {
        obj['netWeight'] = ApiClient.convertToType(data['netWeight'], 'Number');
      }
      if (data.hasOwnProperty('grossWeight')) {
        obj['grossWeight'] = ApiClient.convertToType(data['grossWeight'], 'Number');
      }
      if (data.hasOwnProperty('seal')) {
        obj['seal'] = ApiClient.convertToType(data['seal'], ['String']);
      }
    }
    return obj;
  }

  /**
   * Quantity of packages transported
   * @member {String} qVol
   */
  exports.prototype['qVol'] = undefined;
  /**
   * package type
   * @member {String} specie
   */
  exports.prototype['specie'] = undefined;
  /**
   * brand
   * @member {String} brand
   */
  exports.prototype['brand'] = undefined;
  /**
   * packages numeration
   * @member {String} volumeNumeration
   */
  exports.prototype['volumeNumeration'] = undefined;
  /**
   * net weight using Kg
   * @member {Number} netWeight
   */
  exports.prototype['netWeight'] = undefined;
  /**
   * gross weight using Kg
   * @member {Number} grossWeight
   */
  exports.prototype['grossWeight'] = undefined;
  /**
   * @member {Array.<String>} seal
   */
  exports.prototype['seal'] = undefined;



  return exports;
}));


