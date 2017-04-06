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
    instance = new AvaTaxBrazil.TaxConf();
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

  describe('TaxConf', function() {
    it('should create an instance of TaxConf', function() {
      // uncomment below and update the code to test TaxConf
      //var instane = new AvaTaxBrazil.TaxConf();
      //expect(instance).to.be.a(AvaTaxBrazil.TaxConf);
    });

    it('should have the property code (base name: "code")', function() {
      // uncomment below and update the code to test the property code
      //var instane = new AvaTaxBrazil.TaxConf();
      //expect(instance).to.be();
    });

    it('should have the property stockImpact (base name: "stockImpact")', function() {
      // uncomment below and update the code to test the property stockImpact
      //var instane = new AvaTaxBrazil.TaxConf();
      //expect(instance).to.be();
    });

    it('should have the property financialImpact (base name: "financialImpact")', function() {
      // uncomment below and update the code to test the property financialImpact
      //var instane = new AvaTaxBrazil.TaxConf();
      //expect(instance).to.be();
    });

    it('should have the property cstIPI (base name: "cstIPI")', function() {
      // uncomment below and update the code to test the property cstIPI
      //var instane = new AvaTaxBrazil.TaxConf();
      //expect(instance).to.be();
    });

    it('should have the property ipiLegalTaxClass (base name: "ipiLegalTaxClass")', function() {
      // uncomment below and update the code to test the property ipiLegalTaxClass
      //var instane = new AvaTaxBrazil.TaxConf();
      //expect(instance).to.be();
    });

    it('should have the property accruablePISTaxation (base name: "accruablePISTaxation")', function() {
      // uncomment below and update the code to test the property accruablePISTaxation
      //var instane = new AvaTaxBrazil.TaxConf();
      //expect(instance).to.be();
    });

    it('should have the property pisExemptLegalReasonCode (base name: "pisExemptLegalReasonCode")', function() {
      // uncomment below and update the code to test the property pisExemptLegalReasonCode
      //var instane = new AvaTaxBrazil.TaxConf();
      //expect(instance).to.be();
    });

    it('should have the property pisExemptLegalReason (base name: "pisExemptLegalReason")', function() {
      // uncomment below and update the code to test the property pisExemptLegalReason
      //var instane = new AvaTaxBrazil.TaxConf();
      //expect(instance).to.be();
    });

    it('should have the property accruableCOFINSTaxation (base name: "accruableCOFINSTaxation")', function() {
      // uncomment below and update the code to test the property accruableCOFINSTaxation
      //var instane = new AvaTaxBrazil.TaxConf();
      //expect(instance).to.be();
    });

    it('should have the property cofinsExemptLegalReasonCode (base name: "cofinsExemptLegalReasonCode")', function() {
      // uncomment below and update the code to test the property cofinsExemptLegalReasonCode
      //var instane = new AvaTaxBrazil.TaxConf();
      //expect(instance).to.be();
    });

    it('should have the property cofinsExemptLegalReason (base name: "cofinsExemptLegalReason")', function() {
      // uncomment below and update the code to test the property cofinsExemptLegalReason
      //var instane = new AvaTaxBrazil.TaxConf();
      //expect(instance).to.be();
    });

    it('should have the property allowIPIcreditWhenInGoing (base name: "allowIPIcreditWhenInGoing")', function() {
      // uncomment below and update the code to test the property allowIPIcreditWhenInGoing
      //var instane = new AvaTaxBrazil.TaxConf();
      //expect(instance).to.be();
    });

    it('should have the property icmsConf (base name: "icmsConf")', function() {
      // uncomment below and update the code to test the property icmsConf
      //var instane = new AvaTaxBrazil.TaxConf();
      //expect(instance).to.be();
    });

  });

}));
