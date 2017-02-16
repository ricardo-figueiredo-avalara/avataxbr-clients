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
    instance = new Br16Api.SalesLinesIn();
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

  describe('SalesLinesIn', function() {
    it('should create an instance of SalesLinesIn', function() {
      // uncomment below and update the code to test SalesLinesIn
      //var instane = new Br16Api.SalesLinesIn();
      //expect(instance).to.be.a(Br16Api.SalesLinesIn);
    });

    it('should have the property lineCode (base name: "lineCode")', function() {
      // uncomment below and update the code to test the property lineCode
      //var instane = new Br16Api.SalesLinesIn();
      //expect(instance).to.be();
    });

    it('should have the property itemCode (base name: "itemCode")', function() {
      // uncomment below and update the code to test the property itemCode
      //var instane = new Br16Api.SalesLinesIn();
      //expect(instance).to.be();
    });

    it('should have the property numberOfItems (base name: "numberOfItems")', function() {
      // uncomment below and update the code to test the property numberOfItems
      //var instane = new Br16Api.SalesLinesIn();
      //expect(instance).to.be();
    });

    it('should have the property lineAmount (base name: "lineAmount")', function() {
      // uncomment below and update the code to test the property lineAmount
      //var instane = new Br16Api.SalesLinesIn();
      //expect(instance).to.be();
    });

    it('should have the property itemDescription (base name: "itemDescription")', function() {
      // uncomment below and update the code to test the property itemDescription
      //var instane = new Br16Api.SalesLinesIn();
      //expect(instance).to.be();
    });

    it('should have the property lineTaxedDiscount (base name: "lineTaxedDiscount")', function() {
      // uncomment below and update the code to test the property lineTaxedDiscount
      //var instane = new Br16Api.SalesLinesIn();
      //expect(instance).to.be();
    });

    it('should have the property lineUntaxedDiscount (base name: "lineUntaxedDiscount")', function() {
      // uncomment below and update the code to test the property lineUntaxedDiscount
      //var instane = new Br16Api.SalesLinesIn();
      //expect(instance).to.be();
    });

    it('should have the property taxDeductions (base name: "taxDeductions")', function() {
      // uncomment below and update the code to test the property taxDeductions
      //var instane = new Br16Api.SalesLinesIn();
      //expect(instance).to.be();
    });

  });

}));