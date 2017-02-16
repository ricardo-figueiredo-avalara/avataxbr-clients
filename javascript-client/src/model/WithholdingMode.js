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
    root.Br16Api.WithholdingMode = factory(root.Br16Api.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';


  /**
   * Enum class WithholdingMode.
   * @enum {}
   * @readonly
   */
  var exports = {
    /**
     * value: "xxx"
     * @const
     */
    "xxx": "xxx",
    /**
     * value: "PCC"
     * @const
     */
    "PCC": "PCC",
    /**
     * value: "PCx"
     * @const
     */
    "PCx": "PCx",
    /**
     * value: "PxC"
     * @const
     */
    "PxC": "PxC",
    /**
     * value: "Pxx"
     * @const
     */
    "Pxx": "Pxx",
    /**
     * value: "xCC"
     * @const
     */
    "xCC": "xCC",
    /**
     * value: "xxC"
     * @const
     */
    "xxC": "xxC",
    /**
     * value: "xCx"
     * @const
     */
    "xCx": "xCx"  };

  /**
   * Returns a <code>WithholdingMode</code> enum value from a Javascript object name.
   * @param {Object} data The plain JavaScript object containing the name of the enum value.
   * @return {module:model/WithholdingMode} The enum <code>WithholdingMode</code> value.
   */
  exports.constructFromObject = function(object) {
    return exports[object];
  }

  return exports;
}));


