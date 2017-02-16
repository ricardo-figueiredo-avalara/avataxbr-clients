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
    instance = new Br16Api.TaxTypeRate();
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

  describe('TaxTypeRate', function() {
    it('should create an instance of TaxTypeRate', function() {
      // uncomment below and update the code to test TaxTypeRate
      //var instane = new Br16Api.TaxTypeRate();
      //expect(instance).to.be.a(Br16Api.TaxTypeRate);
    });

    it('should have the property taxType (base name: "taxType")', function() {
      // uncomment below and update the code to test the property taxType
      //var instane = new Br16Api.TaxTypeRate();
      //expect(instance).to.be();
    });

    it('should have the property taxModel (base name: "taxModel")', function() {
      // uncomment below and update the code to test the property taxModel
      //var instane = new Br16Api.TaxTypeRate();
      //expect(instance).to.be();
    });

    it('should have the property rate (base name: "rate")', function() {
      // uncomment below and update the code to test the property rate
      //var instane = new Br16Api.TaxTypeRate();
      //expect(instance).to.be();
    });

    it('should have the property srvAmount (base name: "srvAmount")', function() {
      // uncomment below and update the code to test the property srvAmount
      //var instane = new Br16Api.TaxTypeRate();
      //expect(instance).to.be();
    });

    it('should have the property quantityUnidBase (base name: "quantityUnidBase")', function() {
      // uncomment below and update the code to test the property quantityUnidBase
      //var instane = new Br16Api.TaxTypeRate();
      //expect(instance).to.be();
    });

    it('should have the property specializationType (base name: "specializationType")', function() {
      // uncomment below and update the code to test the property specializationType
      //var instane = new Br16Api.TaxTypeRate();
      //expect(instance).to.be();
    });

    it('should have the property exemptionReasonCode (base name: "exemptionReasonCode")', function() {
      // uncomment below and update the code to test the property exemptionReasonCode
      //var instane = new Br16Api.TaxTypeRate();
      //expect(instance).to.be();
    });

    it('should have the property customExemptionReasonDescription (base name: "customExemptionReasonDescription")', function() {
      // uncomment below and update the code to test the property customExemptionReasonDescription
      //var instane = new Br16Api.TaxTypeRate();
      //expect(instance).to.be();
    });

    it('should have the property withholding (base name: "withholding")', function() {
      // uncomment below and update the code to test the property withholding
      //var instane = new Br16Api.TaxTypeRate();
      //expect(instance).to.be();
    });

  });

}));