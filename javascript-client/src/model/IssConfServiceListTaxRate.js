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
    define(['ApiClient', 'model/IssConfServiceListTaxRateIbpt', 'model/ServiceItemTaxRate'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./IssConfServiceListTaxRateIbpt'), require('./ServiceItemTaxRate'));
  } else {
    // Browser globals (root is window)
    if (!root.AvaTaxBrazil) {
      root.AvaTaxBrazil = {};
    }
    root.AvaTaxBrazil.IssConfServiceListTaxRate = factory(root.AvaTaxBrazil.ApiClient, root.AvaTaxBrazil.IssConfServiceListTaxRateIbpt, root.AvaTaxBrazil.ServiceItemTaxRate);
  }
}(this, function(ApiClient, IssConfServiceListTaxRateIbpt, ServiceItemTaxRate) {
  'use strict';




  /**
   * The IssConfServiceListTaxRate model module.
   * @module model/IssConfServiceListTaxRate
   * @version 1.0
   */

  /**
   * Constructs a new <code>IssConfServiceListTaxRate</code>.
   * @alias module:model/IssConfServiceListTaxRate
   * @class
   */
  var exports = function() {
    var _this = this;






  };

  /**
   * Constructs a <code>IssConfServiceListTaxRate</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/IssConfServiceListTaxRate} obj Optional instance to populate.
   * @return {module:model/IssConfServiceListTaxRate} The populated <code>IssConfServiceListTaxRate</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('ISS')) {
        obj['ISS'] = ServiceItemTaxRate.constructFromObject(data['ISS']);
      }
      if (data.hasOwnProperty('ISS_RF')) {
        obj['ISS_RF'] = ServiceItemTaxRate.constructFromObject(data['ISS_RF']);
      }
      if (data.hasOwnProperty('ISS_E')) {
        obj['ISS_E'] = ServiceItemTaxRate.constructFromObject(data['ISS_E']);
      }
      if (data.hasOwnProperty('ISS_I')) {
        obj['ISS_I'] = ServiceItemTaxRate.constructFromObject(data['ISS_I']);
      }
      if (data.hasOwnProperty('ibpt')) {
        obj['ibpt'] = IssConfServiceListTaxRateIbpt.constructFromObject(data['ibpt']);
      }
    }
    return obj;
  }

  /**
   * @member {module:model/ServiceItemTaxRate} ISS
   */
  exports.prototype['ISS'] = undefined;
  /**
   * @member {module:model/ServiceItemTaxRate} ISS_RF
   */
  exports.prototype['ISS_RF'] = undefined;
  /**
   * @member {module:model/ServiceItemTaxRate} ISS_E
   */
  exports.prototype['ISS_E'] = undefined;
  /**
   * @member {module:model/ServiceItemTaxRate} ISS_I
   */
  exports.prototype['ISS_I'] = undefined;
  /**
   * @member {module:model/IssConfServiceListTaxRateIbpt} ibpt
   */
  exports.prototype['ibpt'] = undefined;



  return exports;
}));


