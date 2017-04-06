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
    root.AvaTaxBrazil.StateEnum = factory(root.AvaTaxBrazil.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';


  /**
   * Enum class StateEnum.
   * @enum {}
   * @readonly
   */
  var exports = {
    /**
     * value: "AC"
     * @const
     */
    "AC": "AC",
    /**
     * value: "AL"
     * @const
     */
    "AL": "AL",
    /**
     * value: "AP"
     * @const
     */
    "AP": "AP",
    /**
     * value: "AM"
     * @const
     */
    "AM": "AM",
    /**
     * value: "BA"
     * @const
     */
    "BA": "BA",
    /**
     * value: "CE"
     * @const
     */
    "CE": "CE",
    /**
     * value: "DF"
     * @const
     */
    "DF": "DF",
    /**
     * value: "ES"
     * @const
     */
    "ES": "ES",
    /**
     * value: "GO"
     * @const
     */
    "GO": "GO",
    /**
     * value: "MA"
     * @const
     */
    "MA": "MA",
    /**
     * value: "MT"
     * @const
     */
    "MT": "MT",
    /**
     * value: "MS"
     * @const
     */
    "MS": "MS",
    /**
     * value: "MG"
     * @const
     */
    "MG": "MG",
    /**
     * value: "PA"
     * @const
     */
    "PA": "PA",
    /**
     * value: "PB"
     * @const
     */
    "PB": "PB",
    /**
     * value: "PR"
     * @const
     */
    "PR": "PR",
    /**
     * value: "PE"
     * @const
     */
    "PE": "PE",
    /**
     * value: "PI"
     * @const
     */
    "PI": "PI",
    /**
     * value: "RJ"
     * @const
     */
    "RJ": "RJ",
    /**
     * value: "RN"
     * @const
     */
    "RN": "RN",
    /**
     * value: "RS"
     * @const
     */
    "RS": "RS",
    /**
     * value: "RO"
     * @const
     */
    "RO": "RO",
    /**
     * value: "RR"
     * @const
     */
    "RR": "RR",
    /**
     * value: "SC"
     * @const
     */
    "SC": "SC",
    /**
     * value: "SP"
     * @const
     */
    "SP": "SP",
    /**
     * value: "SE"
     * @const
     */
    "SE": "SE",
    /**
     * value: "TO"
     * @const
     */
    "TO": "TO"  };

  /**
   * Returns a <code>StateEnum</code> enum value from a Javascript object name.
   * @param {Object} data The plain JavaScript object containing the name of the enum value.
   * @return {module:model/StateEnum} The enum <code>StateEnum</code> value.
   */
  exports.constructFromObject = function(object) {
    return object;
  }

  return exports;
}));


