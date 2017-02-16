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
    define(['ApiClient', 'model/PointOfOrderOrigin'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./PointOfOrderOrigin'));
  } else {
    // Browser globals (root is window)
    if (!root.Br16Api) {
      root.Br16Api = {};
    }
    root.Br16Api.PurchaseDefaultLocations = factory(root.Br16Api.ApiClient, root.Br16Api.PointOfOrderOrigin);
  }
}(this, function(ApiClient, PointOfOrderOrigin) {
  'use strict';




  /**
   * The PurchaseDefaultLocations model module.
   * @module model/PurchaseDefaultLocations
   * @version 1.0
   */

  /**
   * Constructs a new <code>PurchaseDefaultLocations</code>.
   * This element contains a dictionary of locations such as the origin and destination addresses to be associated with this transaction. There can only be one location of a given purpose in the dictionary.
   * @alias module:model/PurchaseDefaultLocations
   * @class
   */
  var exports = function() {
    var _this = this;


  };

  /**
   * Constructs a <code>PurchaseDefaultLocations</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PurchaseDefaultLocations} obj Optional instance to populate.
   * @return {module:model/PurchaseDefaultLocations} The populated <code>PurchaseDefaultLocations</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('PointOfOrderOrigin')) {
        obj['PointOfOrderOrigin'] = PointOfOrderOrigin.constructFromObject(data['PointOfOrderOrigin']);
      }
    }
    return obj;
  }

  /**
   * @member {module:model/PointOfOrderOrigin} PointOfOrderOrigin
   */
  exports.prototype['PointOfOrderOrigin'] = undefined;



  return exports;
}));

