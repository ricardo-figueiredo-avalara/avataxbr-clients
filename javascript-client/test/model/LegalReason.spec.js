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
    instance = new AvaTaxBrazil.LegalReason();
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

  describe('LegalReason', function() {
    it('should create an instance of LegalReason', function() {
      // uncomment below and update the code to test LegalReason
      //var instane = new AvaTaxBrazil.LegalReason();
      //expect(instance).to.be.a(AvaTaxBrazil.LegalReason);
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instane = new AvaTaxBrazil.LegalReason();
      //expect(instance).to.be();
    });

    it('should have the property scope (base name: "scope")', function() {
      // uncomment below and update the code to test the property scope
      //var instane = new AvaTaxBrazil.LegalReason();
      //expect(instance).to.be();
    });

    it('should have the property disable (base name: "disable")', function() {
      // uncomment below and update the code to test the property disable
      //var instane = new AvaTaxBrazil.LegalReason();
      //expect(instance).to.be();
    });

    it('should have the property description (base name: "description")', function() {
      // uncomment below and update the code to test the property description
      //var instane = new AvaTaxBrazil.LegalReason();
      //expect(instance).to.be();
    });

    it('should have the property name (base name: "name")', function() {
      // uncomment below and update the code to test the property name
      //var instane = new AvaTaxBrazil.LegalReason();
      //expect(instance).to.be();
    });

    it('should have the property legalCode (base name: "legalCode")', function() {
      // uncomment below and update the code to test the property legalCode
      //var instane = new AvaTaxBrazil.LegalReason();
      //expect(instance).to.be();
    });

    it('should have the property showInInvoice (base name: "showInInvoice")', function() {
      // uncomment below and update the code to test the property showInInvoice
      //var instane = new AvaTaxBrazil.LegalReason();
      //expect(instance).to.be();
    });

    it('should have the property referencedProcesses (base name: "referencedProcesses")', function() {
      // uncomment below and update the code to test the property referencedProcesses
      //var instane = new AvaTaxBrazil.LegalReason();
      //expect(instance).to.be();
    });

    it('should have the property taxScope (base name: "taxScope")', function() {
      // uncomment below and update the code to test the property taxScope
      //var instane = new AvaTaxBrazil.LegalReason();
      //expect(instance).to.be();
    });

  });

}));