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
    instance = new AvaTaxBrazil.PurchaseInstallmentIn();
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

  describe('PurchaseInstallmentIn', function() {
    it('should create an instance of PurchaseInstallmentIn', function() {
      // uncomment below and update the code to test PurchaseInstallmentIn
      //var instane = new AvaTaxBrazil.PurchaseInstallmentIn();
      //expect(instance).to.be.a(AvaTaxBrazil.PurchaseInstallmentIn);
    });

    it('should have the property documentNumber (base name: "documentNumber")', function() {
      // uncomment below and update the code to test the property documentNumber
      //var instane = new AvaTaxBrazil.PurchaseInstallmentIn();
      //expect(instance).to.be();
    });

    it('should have the property _date (base name: "date")', function() {
      // uncomment below and update the code to test the property _date
      //var instane = new AvaTaxBrazil.PurchaseInstallmentIn();
      //expect(instance).to.be();
    });

    it('should have the property grossValue (base name: "grossValue")', function() {
      // uncomment below and update the code to test the property grossValue
      //var instane = new AvaTaxBrazil.PurchaseInstallmentIn();
      //expect(instance).to.be();
    });

  });

}));