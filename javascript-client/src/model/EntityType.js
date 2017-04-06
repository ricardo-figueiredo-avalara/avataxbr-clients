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
    root.AvaTaxBrazil.EntityType = factory(root.AvaTaxBrazil.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';


  /**
   * Enum class EntityType.
   * @enum {}
   * @readonly
   */
  var exports = {
    /**
     * value: "business"
     * @const
     */
    "business": "business",
    /**
     * value: "individual"
     * @const
     */
    "individual": "individual",
    /**
     * value: "federalGovernment"
     * @const
     */
    "federalGovernment": "federalGovernment",
    /**
     * value: "stateGovernment"
     * @const
     */
    "stateGovernment": "stateGovernment",
    /**
     * value: "cityGovernment"
     * @const
     */
    "cityGovernment": "cityGovernment",
    /**
     * value: "foreign"
     * @const
     */
    "foreign": "foreign"  };

  /**
   * Returns a <code>EntityType</code> enum value from a Javascript object name.
   * @param {Object} data The plain JavaScript object containing the name of the enum value.
   * @return {module:model/EntityType} The enum <code>EntityType</code> value.
   */
  exports.constructFromObject = function(object) {
    return object;
  }

  return exports;
}));


