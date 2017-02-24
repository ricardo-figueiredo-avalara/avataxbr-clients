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
    instance = new AvaTaxBrazil.PurchaseCalculatedTaxSummaryForServiceTaxByType();
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

  describe('PurchaseCalculatedTaxSummaryForServiceTaxByType', function() {
    it('should create an instance of PurchaseCalculatedTaxSummaryForServiceTaxByType', function() {
      // uncomment below and update the code to test PurchaseCalculatedTaxSummaryForServiceTaxByType
      //var instane = new AvaTaxBrazil.PurchaseCalculatedTaxSummaryForServiceTaxByType();
      //expect(instance).to.be.a(AvaTaxBrazil.PurchaseCalculatedTaxSummaryForServiceTaxByType);
    });

    it('should have the property issRf (base name: "issRf")', function() {
      // uncomment below and update the code to test the property issRf
      //var instane = new AvaTaxBrazil.PurchaseCalculatedTaxSummaryForServiceTaxByType();
      //expect(instance).to.be();
    });

    it('should have the property pisRf (base name: "pisRf")', function() {
      // uncomment below and update the code to test the property pisRf
      //var instane = new AvaTaxBrazil.PurchaseCalculatedTaxSummaryForServiceTaxByType();
      //expect(instance).to.be();
    });

    it('should have the property cofinsRf (base name: "cofinsRf")', function() {
      // uncomment below and update the code to test the property cofinsRf
      //var instane = new AvaTaxBrazil.PurchaseCalculatedTaxSummaryForServiceTaxByType();
      //expect(instance).to.be();
    });

    it('should have the property csllRf (base name: "csllRf")', function() {
      // uncomment below and update the code to test the property csllRf
      //var instane = new AvaTaxBrazil.PurchaseCalculatedTaxSummaryForServiceTaxByType();
      //expect(instance).to.be();
    });

    it('should have the property irrf (base name: "irrf")', function() {
      // uncomment below and update the code to test the property irrf
      //var instane = new AvaTaxBrazil.PurchaseCalculatedTaxSummaryForServiceTaxByType();
      //expect(instance).to.be();
    });

    it('should have the property inssRf (base name: "inssRf")', function() {
      // uncomment below and update the code to test the property inssRf
      //var instane = new AvaTaxBrazil.PurchaseCalculatedTaxSummaryForServiceTaxByType();
      //expect(instance).to.be();
    });

    it('should have the property inssAr (base name: "inssAr")', function() {
      // uncomment below and update the code to test the property inssAr
      //var instane = new AvaTaxBrazil.PurchaseCalculatedTaxSummaryForServiceTaxByType();
      //expect(instance).to.be();
    });

    it('should have the property pis (base name: "pis")', function() {
      // uncomment below and update the code to test the property pis
      //var instane = new AvaTaxBrazil.PurchaseCalculatedTaxSummaryForServiceTaxByType();
      //expect(instance).to.be();
    });

    it('should have the property cofins (base name: "cofins")', function() {
      // uncomment below and update the code to test the property cofins
      //var instane = new AvaTaxBrazil.PurchaseCalculatedTaxSummaryForServiceTaxByType();
      //expect(instance).to.be();
    });

  });

}));
