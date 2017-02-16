/**
 * BR16 - API
 * This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts
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
    factory(root.expect, root.Br16Api);
  }
}(this, function(expect, Br16Api) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new Br16Api.PccWithholdingMode();
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

  describe('PccWithholdingMode', function() {
    it('should create an instance of PccWithholdingMode', function() {
      // uncomment below and update the code to test PccWithholdingMode
      //var instane = new Br16Api.PccWithholdingMode();
      //expect(instance).to.be.a(Br16Api.PccWithholdingMode);
    });

    it('should have the property type (base name: "type")', function() {
      // uncomment below and update the code to test the property type
      //var instane = new Br16Api.PccWithholdingMode();
      //expect(instance).to.be();
    });

    it('should have the property totalTax (base name: "totalTax")', function() {
      // uncomment below and update the code to test the property totalTax
      //var instane = new Br16Api.PccWithholdingMode();
      //expect(instance).to.be();
    });

    it('should have the property pisRf (base name: "pisRf")', function() {
      // uncomment below and update the code to test the property pisRf
      //var instane = new Br16Api.PccWithholdingMode();
      //expect(instance).to.be();
    });

    it('should have the property cofinsRf (base name: "cofinsRf")', function() {
      // uncomment below and update the code to test the property cofinsRf
      //var instane = new Br16Api.PccWithholdingMode();
      //expect(instance).to.be();
    });

    it('should have the property csllRf (base name: "csllRf")', function() {
      // uncomment below and update the code to test the property csllRf
      //var instane = new Br16Api.PccWithholdingMode();
      //expect(instance).to.be();
    });

  });

}));