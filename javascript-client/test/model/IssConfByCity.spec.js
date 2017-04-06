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
    instance = new AvaTaxBrazil.IssConfByCity();
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

  describe('IssConfByCity', function() {
    it('should create an instance of IssConfByCity', function() {
      // uncomment below and update the code to test IssConfByCity
      //var instane = new AvaTaxBrazil.IssConfByCity();
      //expect(instance).to.be.a(AvaTaxBrazil.IssConfByCity);
    });

    it('should have the property cityCode (base name: "cityCode")', function() {
      // uncomment below and update the code to test the property cityCode
      //var instane = new AvaTaxBrazil.IssConfByCity();
      //expect(instance).to.be();
    });

    it('should have the property name (base name: "name")', function() {
      // uncomment below and update the code to test the property name
      //var instane = new AvaTaxBrazil.IssConfByCity();
      //expect(instance).to.be();
    });

    it('should have the property state (base name: "state")', function() {
      // uncomment below and update the code to test the property state
      //var instane = new AvaTaxBrazil.IssConfByCity();
      //expect(instance).to.be();
    });

    it('should have the property issWhDestOtherCities (base name: "issWhDestOtherCities")', function() {
      // uncomment below and update the code to test the property issWhDestOtherCities
      //var instane = new AvaTaxBrazil.IssConfByCity();
      //expect(instance).to.be();
    });

    it('should have the property issWhDestSameCity (base name: "issWhDestSameCity")', function() {
      // uncomment below and update the code to test the property issWhDestSameCity
      //var instane = new AvaTaxBrazil.IssConfByCity();
      //expect(instance).to.be();
    });

    it('should have the property issWhOriginUnregSeller (base name: "issWhOriginUnregSeller")', function() {
      // uncomment below and update the code to test the property issWhOriginUnregSeller
      //var instane = new AvaTaxBrazil.IssConfByCity();
      //expect(instance).to.be();
    });

    it('should have the property serviceList (base name: "serviceList")', function() {
      // uncomment below and update the code to test the property serviceList
      //var instane = new AvaTaxBrazil.IssConfByCity();
      //expect(instance).to.be();
    });

  });

}));