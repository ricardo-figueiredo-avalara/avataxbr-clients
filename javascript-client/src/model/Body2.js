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
    root.Br16Api.Body2 = factory(root.Br16Api.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The Body2 model module.
   * @module model/Body2
   * @version 1.0
   */

  /**
   * Constructs a new <code>Body2</code>.
   * @alias module:model/Body2
   * @class
   */
  var exports = function() {
    var _this = this;


  };

  /**
   * Constructs a <code>Body2</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Body2} obj Optional instance to populate.
   * @return {module:model/Body2} The populated <code>Body2</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('content')) {
        obj['content'] = ApiClient.convertToType(data['content'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} content
   */
  exports.prototype['content'] = undefined;



  return exports;
}));

