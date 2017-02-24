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
    instance = new AvaTaxBrazil.LineForGoodsDi();
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

  describe('LineForGoodsDi', function() {
    it('should create an instance of LineForGoodsDi', function() {
      // uncomment below and update the code to test LineForGoodsDi
      //var instane = new AvaTaxBrazil.LineForGoodsDi();
      //expect(instance).to.be.a(AvaTaxBrazil.LineForGoodsDi);
    });

    it('should have the property customsValue (base name: "customsValue")', function() {
      // uncomment below and update the code to test the property customsValue
      //var instane = new AvaTaxBrazil.LineForGoodsDi();
      //expect(instance).to.be();
    });

    it('should have the property diNumber (base name: "diNumber")', function() {
      // uncomment below and update the code to test the property diNumber
      //var instane = new AvaTaxBrazil.LineForGoodsDi();
      //expect(instance).to.be();
    });

    it('should have the property registerDateDI (base name: "registerDateDI")', function() {
      // uncomment below and update the code to test the property registerDateDI
      //var instane = new AvaTaxBrazil.LineForGoodsDi();
      //expect(instance).to.be();
    });

    it('should have the property clearanceSite (base name: "clearanceSite")', function() {
      // uncomment below and update the code to test the property clearanceSite
      //var instane = new AvaTaxBrazil.LineForGoodsDi();
      //expect(instance).to.be();
    });

    it('should have the property clearanceState (base name: "clearanceState")', function() {
      // uncomment below and update the code to test the property clearanceState
      //var instane = new AvaTaxBrazil.LineForGoodsDi();
      //expect(instance).to.be();
    });

    it('should have the property clearanceDate (base name: "clearanceDate")', function() {
      // uncomment below and update the code to test the property clearanceDate
      //var instane = new AvaTaxBrazil.LineForGoodsDi();
      //expect(instance).to.be();
    });

    it('should have the property transportDIType (base name: "transportDIType")', function() {
      // uncomment below and update the code to test the property transportDIType
      //var instane = new AvaTaxBrazil.LineForGoodsDi();
      //expect(instance).to.be();
    });

    it('should have the property afrmmValue (base name: "afrmmValue")', function() {
      // uncomment below and update the code to test the property afrmmValue
      //var instane = new AvaTaxBrazil.LineForGoodsDi();
      //expect(instance).to.be();
    });

    it('should have the property intermediateType (base name: "intermediateType")', function() {
      // uncomment below and update the code to test the property intermediateType
      //var instane = new AvaTaxBrazil.LineForGoodsDi();
      //expect(instance).to.be();
    });

    it('should have the property buyerFederalTaxID (base name: "buyerFederalTaxID")', function() {
      // uncomment below and update the code to test the property buyerFederalTaxID
      //var instane = new AvaTaxBrazil.LineForGoodsDi();
      //expect(instance).to.be();
    });

    it('should have the property buyerState (base name: "buyerState")', function() {
      // uncomment below and update the code to test the property buyerState
      //var instane = new AvaTaxBrazil.LineForGoodsDi();
      //expect(instance).to.be();
    });

    it('should have the property exporterCode (base name: "exporterCode")', function() {
      // uncomment below and update the code to test the property exporterCode
      //var instane = new AvaTaxBrazil.LineForGoodsDi();
      //expect(instance).to.be();
    });

    it('should have the property adi (base name: "adi")', function() {
      // uncomment below and update the code to test the property adi
      //var instane = new AvaTaxBrazil.LineForGoodsDi();
      //expect(instance).to.be();
    });

  });

}));
