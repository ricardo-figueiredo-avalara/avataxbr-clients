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
    instance = new AvaTaxBrazil.ServiceItemTaxRate();
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

  describe('ServiceItemTaxRate', function() {
    it('should create an instance of ServiceItemTaxRate', function() {
      // uncomment below and update the code to test ServiceItemTaxRate
      //var instane = new AvaTaxBrazil.ServiceItemTaxRate();
      //expect(instance).to.be.a(AvaTaxBrazil.ServiceItemTaxRate);
    });

    it('should have the property taxType (base name: "taxType")', function() {
      // uncomment below and update the code to test the property taxType
      //var instane = new AvaTaxBrazil.ServiceItemTaxRate();
      //expect(instance).to.be();
    });

    it('should have the property rateType (base name: "rateType")', function() {
      // uncomment below and update the code to test the property rateType
      //var instane = new AvaTaxBrazil.ServiceItemTaxRate();
      //expect(instance).to.be();
    });

    it('should have the property rate (base name: "rate")', function() {
      // uncomment below and update the code to test the property rate
      //var instane = new AvaTaxBrazil.ServiceItemTaxRate();
      //expect(instance).to.be();
    });

    it('should have the property isExempt (base name: "isExempt")', function() {
      // uncomment below and update the code to test the property isExempt
      //var instane = new AvaTaxBrazil.ServiceItemTaxRate();
      //expect(instance).to.be();
    });

    it('should have the property discount (base name: "discount")', function() {
      // uncomment below and update the code to test the property discount
      //var instane = new AvaTaxBrazil.ServiceItemTaxRate();
      //expect(instance).to.be();
    });

    it('should have the property zone1 (base name: "zone1")', function() {
      // uncomment below and update the code to test the property zone1
      //var instane = new AvaTaxBrazil.ServiceItemTaxRate();
      //expect(instance).to.be();
    });

    it('should have the property zone2 (base name: "zone2")', function() {
      // uncomment below and update the code to test the property zone2
      //var instane = new AvaTaxBrazil.ServiceItemTaxRate();
      //expect(instance).to.be();
    });

    it('should have the property period (base name: "period")', function() {
      // uncomment below and update the code to test the property period
      //var instane = new AvaTaxBrazil.ServiceItemTaxRate();
      //expect(instance).to.be();
    });

    it('should have the property reason (base name: "reason")', function() {
      // uncomment below and update the code to test the property reason
      //var instane = new AvaTaxBrazil.ServiceItemTaxRate();
      //expect(instance).to.be();
    });

    it('should have the property message (base name: "message")', function() {
      // uncomment below and update the code to test the property message
      //var instane = new AvaTaxBrazil.ServiceItemTaxRate();
      //expect(instance).to.be();
    });

  });

}));
