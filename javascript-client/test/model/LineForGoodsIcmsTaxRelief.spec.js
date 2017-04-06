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
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.AvaTaxBrazil);
  }
}(this, function(expect, AvaTaxBrazil) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new AvaTaxBrazil.LineForGoodsIcmsTaxRelief();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('LineForGoodsIcmsTaxRelief', function() {
    it('should create an instance of LineForGoodsIcmsTaxRelief', function() {
      // uncomment below and update the code to test LineForGoodsIcmsTaxRelief
      //var instane = new AvaTaxBrazil.LineForGoodsIcmsTaxRelief();
      //expect(instance).to.be.a(AvaTaxBrazil.LineForGoodsIcmsTaxRelief);
    });

    it('should have the property reasonCode (base name: "reasonCode")', function() {
      // uncomment below and update the code to test the property reasonCode
      //var instane = new AvaTaxBrazil.LineForGoodsIcmsTaxRelief();
      //expect(instance).to.be();
    });

    it('should have the property taxBaseDiscount (base name: "taxBaseDiscount")', function() {
      // uncomment below and update the code to test the property taxBaseDiscount
      //var instane = new AvaTaxBrazil.LineForGoodsIcmsTaxRelief();
      //expect(instance).to.be();
    });

    it('should have the property taxAmount (base name: "taxAmount")', function() {
      // uncomment below and update the code to test the property taxAmount
      //var instane = new AvaTaxBrazil.LineForGoodsIcmsTaxRelief();
      //expect(instance).to.be();
    });

  });

}));