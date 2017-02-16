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
    root.Br16Api.NRefRefECF = factory(root.Br16Api.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The NRefRefECF model module.
   * @module model/NRefRefECF
   * @version 1.0
   */

  /**
   * Constructs a new <code>NRefRefECF</code>.
   * @alias module:model/NRefRefECF
   * @class
   * @param nECF {String} ECF Sequential number that generated Cupom attached to NFe informar o número de ordem seqüencial do ECF que emitiu o Cupom Fiscal vinculado à NF-e 
   * @param nCOO {String} Operational counter number attached to NFe Informar o Número do Contador de Ordem de Operação - COO vinculado à NF-e 
   * @param modECF {module:model/NRefRefECF.ModECFEnum} Fiscal document model - '2B' # coupon tax not ECF - '2C' # PDV coupon tax - '2D' # ECF coupon tax 
   */
  var exports = function(nECF, nCOO, modECF) {
    var _this = this;

    _this['nECF'] = nECF;
    _this['nCOO'] = nCOO;
    _this['modECF'] = modECF;
  };

  /**
   * Constructs a <code>NRefRefECF</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/NRefRefECF} obj Optional instance to populate.
   * @return {module:model/NRefRefECF} The populated <code>NRefRefECF</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('nECF')) {
        obj['nECF'] = ApiClient.convertToType(data['nECF'], 'String');
      }
      if (data.hasOwnProperty('nCOO')) {
        obj['nCOO'] = ApiClient.convertToType(data['nCOO'], 'String');
      }
      if (data.hasOwnProperty('modECF')) {
        obj['modECF'] = ApiClient.convertToType(data['modECF'], 'String');
      }
    }
    return obj;
  }

  /**
   * ECF Sequential number that generated Cupom attached to NFe informar o número de ordem seqüencial do ECF que emitiu o Cupom Fiscal vinculado à NF-e 
   * @member {String} nECF
   */
  exports.prototype['nECF'] = undefined;
  /**
   * Operational counter number attached to NFe Informar o Número do Contador de Ordem de Operação - COO vinculado à NF-e 
   * @member {String} nCOO
   */
  exports.prototype['nCOO'] = undefined;
  /**
   * Fiscal document model - '2B' # coupon tax not ECF - '2C' # PDV coupon tax - '2D' # ECF coupon tax 
   * @member {module:model/NRefRefECF.ModECFEnum} modECF
   */
  exports.prototype['modECF'] = undefined;


  /**
   * Allowed values for the <code>modECF</code> property.
   * @enum {String}
   * @readonly
   */
  exports.ModECFEnum = {
    /**
     * value: "2B"
     * @const
     */
    "2B": "2B",
    /**
     * value: "2C"
     * @const
     */
    "2C": "2C",
    /**
     * value: "2D"
     * @const
     */
    "2D": "2D"  };


  return exports;
}));

