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
    instance = new Br16Api.InstallmentComplete();
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

  describe('InstallmentComplete', function() {
    it('should create an instance of InstallmentComplete', function() {
      // uncomment below and update the code to test InstallmentComplete
      //var instane = new Br16Api.InstallmentComplete();
      //expect(instance).to.be.a(Br16Api.InstallmentComplete);
    });

    it('should have the property documentNumber (base name: "documentNumber")', function() {
      // uncomment below and update the code to test the property documentNumber
      //var instane = new Br16Api.InstallmentComplete();
      //expect(instance).to.be();
    });

    it('should have the property _date (base name: "date")', function() {
      // uncomment below and update the code to test the property _date
      //var instane = new Br16Api.InstallmentComplete();
      //expect(instance).to.be();
    });

    it('should have the property grossValue (base name: "grossValue")', function() {
      // uncomment below and update the code to test the property grossValue
      //var instane = new Br16Api.InstallmentComplete();
      //expect(instance).to.be();
    });

    it('should have the property netValue (base name: "netValue")', function() {
      // uncomment below and update the code to test the property netValue
      //var instane = new Br16Api.InstallmentComplete();
      //expect(instance).to.be();
    });

    it('should have the property withholdingMode (base name: "withholdingMode")', function() {
      // uncomment below and update the code to test the property withholdingMode
      //var instane = new Br16Api.InstallmentComplete();
      //expect(instance).to.be();
    });

    it('should have the property withholdingPIS (base name: "withholdingPIS")', function() {
      // uncomment below and update the code to test the property withholdingPIS
      //var instane = new Br16Api.InstallmentComplete();
      //expect(instance).to.be();
    });

    it('should have the property withholdingCOFINS (base name: "withholdingCOFINS")', function() {
      // uncomment below and update the code to test the property withholdingCOFINS
      //var instane = new Br16Api.InstallmentComplete();
      //expect(instance).to.be();
    });

    it('should have the property withholdingCSLL (base name: "withholdingCSLL")', function() {
      // uncomment below and update the code to test the property withholdingCSLL
      //var instane = new Br16Api.InstallmentComplete();
      //expect(instance).to.be();
    });

  });

}));
