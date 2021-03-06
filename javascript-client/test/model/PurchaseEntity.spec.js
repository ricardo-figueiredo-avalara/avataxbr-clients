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
    instance = new AvaTaxBrazil.PurchaseEntity();
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

  describe('PurchaseEntity', function() {
    it('should create an instance of PurchaseEntity', function() {
      // uncomment below and update the code to test PurchaseEntity
      //var instane = new AvaTaxBrazil.PurchaseEntity();
      //expect(instance).to.be.a(AvaTaxBrazil.PurchaseEntity);
    });

    it('should have the property name (base name: "name")', function() {
      // uncomment below and update the code to test the property name
      //var instane = new AvaTaxBrazil.PurchaseEntity();
      //expect(instance).to.be();
    });

    it('should have the property type (base name: "type")', function() {
      // uncomment below and update the code to test the property type
      //var instane = new AvaTaxBrazil.PurchaseEntity();
      //expect(instance).to.be();
    });

    it('should have the property email (base name: "email")', function() {
      // uncomment below and update the code to test the property email
      //var instane = new AvaTaxBrazil.PurchaseEntity();
      //expect(instance).to.be();
    });

    it('should have the property cnpjcpf (base name: "cnpjcpf")', function() {
      // uncomment below and update the code to test the property cnpjcpf
      //var instane = new AvaTaxBrazil.PurchaseEntity();
      //expect(instance).to.be();
    });

    it('should have the property cityTaxId (base name: "cityTaxId")', function() {
      // uncomment below and update the code to test the property cityTaxId
      //var instane = new AvaTaxBrazil.PurchaseEntity();
      //expect(instance).to.be();
    });

    it('should have the property stateTaxId (base name: "stateTaxId")', function() {
      // uncomment below and update the code to test the property stateTaxId
      //var instane = new AvaTaxBrazil.PurchaseEntity();
      //expect(instance).to.be();
    });

    it('should have the property suframa (base name: "suframa")', function() {
      // uncomment below and update the code to test the property suframa
      //var instane = new AvaTaxBrazil.PurchaseEntity();
      //expect(instance).to.be();
    });

    it('should have the property phone (base name: "phone")', function() {
      // uncomment below and update the code to test the property phone
      //var instane = new AvaTaxBrazil.PurchaseEntity();
      //expect(instance).to.be();
    });

    it('should have the property taxRegime (base name: "taxRegime")', function() {
      // uncomment below and update the code to test the property taxRegime
      //var instane = new AvaTaxBrazil.PurchaseEntity();
      //expect(instance).to.be();
    });

    it('should have the property hasCpom (base name: "hasCpom")', function() {
      // uncomment below and update the code to test the property hasCpom
      //var instane = new AvaTaxBrazil.PurchaseEntity();
      //expect(instance).to.be();
    });

    it('should have the property subjectWithholdingIrrf (base name: "subjectWithholdingIrrf")', function() {
      // uncomment below and update the code to test the property subjectWithholdingIrrf
      //var instane = new AvaTaxBrazil.PurchaseEntity();
      //expect(instance).to.be();
    });

    it('should have the property inssPreviousContrib (base name: "inssPreviousContrib")', function() {
      // uncomment below and update the code to test the property inssPreviousContrib
      //var instane = new AvaTaxBrazil.PurchaseEntity();
      //expect(instance).to.be();
    });

    it('should have the property inssBasisDiscount (base name: "inssBasisDiscount")', function() {
      // uncomment below and update the code to test the property inssBasisDiscount
      //var instane = new AvaTaxBrazil.PurchaseEntity();
      //expect(instance).to.be();
    });

    it('should have the property issRfRate (base name: "issRfRate")', function() {
      // uncomment below and update the code to test the property issRfRate
      //var instane = new AvaTaxBrazil.PurchaseEntity();
      //expect(instance).to.be();
    });

  });

}));
