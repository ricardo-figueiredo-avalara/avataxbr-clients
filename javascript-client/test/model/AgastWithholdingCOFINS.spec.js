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
    instance = new AvaTaxBrazil.AgastWithholdingCOFINS();
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

  describe('AgastWithholdingCOFINS', function() {
    it('should create an instance of AgastWithholdingCOFINS', function() {
      // uncomment below and update the code to test AgastWithholdingCOFINS
      //var instane = new AvaTaxBrazil.AgastWithholdingCOFINS();
      //expect(instance).to.be.a(AvaTaxBrazil.AgastWithholdingCOFINS);
    });

    it('should have the property legalReason (base name: "legalReason")', function() {
      // uncomment below and update the code to test the property legalReason
      //var instane = new AvaTaxBrazil.AgastWithholdingCOFINS();
      //expect(instance).to.be();
    });

    it('should have the property business (base name: "business")', function() {
      // uncomment below and update the code to test the property business
      //var instane = new AvaTaxBrazil.AgastWithholdingCOFINS();
      //expect(instance).to.be();
    });

    it('should have the property businessLegalReason (base name: "businessLegalReason")', function() {
      // uncomment below and update the code to test the property businessLegalReason
      //var instane = new AvaTaxBrazil.AgastWithholdingCOFINS();
      //expect(instance).to.be();
    });

    it('should have the property federalGovernment (base name: "federalGovernment")', function() {
      // uncomment below and update the code to test the property federalGovernment
      //var instane = new AvaTaxBrazil.AgastWithholdingCOFINS();
      //expect(instance).to.be();
    });

    it('should have the property federalGovernmentLegalReason (base name: "federalGovernmentLegalReason")', function() {
      // uncomment below and update the code to test the property federalGovernmentLegalReason
      //var instane = new AvaTaxBrazil.AgastWithholdingCOFINS();
      //expect(instance).to.be();
    });

    it('should have the property stateGovernment (base name: "stateGovernment")', function() {
      // uncomment below and update the code to test the property stateGovernment
      //var instane = new AvaTaxBrazil.AgastWithholdingCOFINS();
      //expect(instance).to.be();
    });

    it('should have the property stateGovernmentLegalReason (base name: "stateGovernmentLegalReason")', function() {
      // uncomment below and update the code to test the property stateGovernmentLegalReason
      //var instane = new AvaTaxBrazil.AgastWithholdingCOFINS();
      //expect(instance).to.be();
    });

    it('should have the property cityGovernment (base name: "cityGovernment")', function() {
      // uncomment below and update the code to test the property cityGovernment
      //var instane = new AvaTaxBrazil.AgastWithholdingCOFINS();
      //expect(instance).to.be();
    });

    it('should have the property cityGovernmentLegalReason (base name: "cityGovernmentLegalReason")', function() {
      // uncomment below and update the code to test the property cityGovernmentLegalReason
      //var instane = new AvaTaxBrazil.AgastWithholdingCOFINS();
      //expect(instance).to.be();
    });

  });

}));
