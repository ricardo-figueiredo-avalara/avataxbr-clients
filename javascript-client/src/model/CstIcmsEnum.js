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
    root.Br16Api.CstIcmsEnum = factory(root.Br16Api.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';


  /**
   * Enum class CstIcmsEnum.
   * @enum {}
   * @readonly
   */
  var exports = {
    /**
     * value: "00"
     * @const
     */
    "00": "00",
    /**
     * value: "20"
     * @const
     */
    "20": "20",
    /**
     * value: "40"
     * @const
     */
    "40": "40",
    /**
     * value: "41"
     * @const
     */
    "41": "41",
    /**
     * value: "50"
     * @const
     */
    "50": "50"  };

  /**
   * Returns a <code>CstIcmsEnum</code> enum value from a Javascript object name.
   * @param {Object} data The plain JavaScript object containing the name of the enum value.
   * @return {module:model/CstIcmsEnum} The enum <code>CstIcmsEnum</code> value.
   */
  exports.constructFromObject = function(object) {
    return exports[object];
  }

  return exports;
}));

