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
    root.Br16Api.CSTPistCofinsEnum = factory(root.Br16Api.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';


  /**
   * Enum class CSTPistCofinsEnum.
   * @enum {}
   * @readonly
   */
  var exports = {
    /**
     * value: "01"
     * @const
     */
    "01": "01",
    /**
     * value: "02"
     * @const
     */
    "02": "02",
    /**
     * value: "03"
     * @const
     */
    "03": "03",
    /**
     * value: "04"
     * @const
     */
    "04": "04",
    /**
     * value: "05"
     * @const
     */
    "05": "05",
    /**
     * value: "06"
     * @const
     */
    "06": "06",
    /**
     * value: "07"
     * @const
     */
    "07": "07",
    /**
     * value: "08"
     * @const
     */
    "08": "08",
    /**
     * value: "09"
     * @const
     */
    "09": "09",
    /**
     * value: "49"
     * @const
     */
    "49": "49",
    /**
     * value: "50"
     * @const
     */
    "50": "50",
    /**
     * value: "51"
     * @const
     */
    "51": "51",
    /**
     * value: "52"
     * @const
     */
    "52": "52",
    /**
     * value: "53"
     * @const
     */
    "53": "53",
    /**
     * value: "54"
     * @const
     */
    "54": "54",
    /**
     * value: "55"
     * @const
     */
    "55": "55",
    /**
     * value: "56"
     * @const
     */
    "56": "56",
    /**
     * value: "60"
     * @const
     */
    "60": "60",
    /**
     * value: "61"
     * @const
     */
    "61": "61",
    /**
     * value: "62"
     * @const
     */
    "62": "62",
    /**
     * value: "63"
     * @const
     */
    "63": "63",
    /**
     * value: "64"
     * @const
     */
    "64": "64",
    /**
     * value: "65"
     * @const
     */
    "65": "65",
    /**
     * value: "66"
     * @const
     */
    "66": "66",
    /**
     * value: "67"
     * @const
     */
    "67": "67",
    /**
     * value: "70"
     * @const
     */
    "70": "70",
    /**
     * value: "71"
     * @const
     */
    "71": "71",
    /**
     * value: "72"
     * @const
     */
    "72": "72",
    /**
     * value: "73"
     * @const
     */
    "73": "73",
    /**
     * value: "74"
     * @const
     */
    "74": "74",
    /**
     * value: "75"
     * @const
     */
    "75": "75",
    /**
     * value: "98"
     * @const
     */
    "98": "98",
    /**
     * value: "99"
     * @const
     */
    "99": "99"  };

  /**
   * Returns a <code>CSTPistCofinsEnum</code> enum value from a Javascript object name.
   * @param {Object} data The plain JavaScript object containing the name of the enum value.
   * @return {module:model/CSTPistCofinsEnum} The enum <code>CSTPistCofinsEnum</code> value.
   */
  exports.constructFromObject = function(object) {
    return exports[object];
  }

  return exports;
}));


