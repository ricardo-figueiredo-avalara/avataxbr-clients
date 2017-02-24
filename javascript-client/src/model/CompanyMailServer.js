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
    root.AvaTaxBrazil.CompanyMailServer = factory(root.AvaTaxBrazil.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The CompanyMailServer model module.
   * @module model/CompanyMailServer
   * @version 1.0
   */

  /**
   * Constructs a new <code>CompanyMailServer</code>.
   * @alias module:model/CompanyMailServer
   * @class
   */
  var exports = function() {
    var _this = this;








  };

  /**
   * Constructs a <code>CompanyMailServer</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CompanyMailServer} obj Optional instance to populate.
   * @return {module:model/CompanyMailServer} The populated <code>CompanyMailServer</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('user')) {
        obj['user'] = ApiClient.convertToType(data['user'], 'String');
      }
      if (data.hasOwnProperty('password')) {
        obj['password'] = ApiClient.convertToType(data['password'], 'String');
      }
      if (data.hasOwnProperty('smtpAddress')) {
        obj['smtpAddress'] = ApiClient.convertToType(data['smtpAddress'], 'String');
      }
      if (data.hasOwnProperty('port')) {
        obj['port'] = ApiClient.convertToType(data['port'], 'Number');
      }
      if (data.hasOwnProperty('emailFrom')) {
        obj['emailFrom'] = ApiClient.convertToType(data['emailFrom'], 'String');
      }
      if (data.hasOwnProperty('protocol')) {
        obj['protocol'] = ApiClient.convertToType(data['protocol'], 'String');
      }
      if (data.hasOwnProperty('templatemessageToEmail')) {
        obj['templatemessageToEmail'] = ApiClient.convertToType(data['templatemessageToEmail'], 'String');
      }
    }
    return obj;
  }

  /**
   * User for login on email server
   * @member {String} user
   */
  exports.prototype['user'] = undefined;
  /**
   * Password to login on email server
   * @member {String} password
   */
  exports.prototype['password'] = undefined;
  /**
   * smtp address to email server
   * @member {String} smtpAddress
   */
  exports.prototype['smtpAddress'] = undefined;
  /**
   * port
   * @member {Number} port
   */
  exports.prototype['port'] = undefined;
  /**
   * email address to identify the sender e-mail, to send a XML and DANFE
   * @member {String} emailFrom
   */
  exports.prototype['emailFrom'] = undefined;
  /**
   * protocol SSL or TLS
   * @member {module:model/CompanyMailServer.ProtocolEnum} protocol
   */
  exports.prototype['protocol'] = undefined;
  /**
   * Message to add to email body
   * @member {String} templatemessageToEmail
   */
  exports.prototype['templatemessageToEmail'] = undefined;


  /**
   * Allowed values for the <code>protocol</code> property.
   * @enum {String}
   * @readonly
   */
  exports.ProtocolEnum = {
    /**
     * value: "ssl"
     * @const
     */
    "ssl": "ssl",
    /**
     * value: "tls"
     * @const
     */
    "tls": "tls"  };


  return exports;
}));


