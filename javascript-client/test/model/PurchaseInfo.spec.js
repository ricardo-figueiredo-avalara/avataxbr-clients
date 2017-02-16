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
    instance = new Br16Api.PurchaseInfo();
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

  describe('PurchaseInfo', function() {
    it('should create an instance of PurchaseInfo', function() {
      // uncomment below and update the code to test PurchaseInfo
      //var instane = new Br16Api.PurchaseInfo();
      //expect(instance).to.be.a(Br16Api.PurchaseInfo);
    });

    it('should have the property governmentOrder (base name: "governmentOrder")', function() {
      // uncomment below and update the code to test the property governmentOrder
      //var instane = new Br16Api.PurchaseInfo();
      //expect(instance).to.be();
    });

    it('should have the property orderNumber (base name: "orderNumber")', function() {
      // uncomment below and update the code to test the property orderNumber
      //var instane = new Br16Api.PurchaseInfo();
      //expect(instance).to.be();
    });

    it('should have the property contractNumber (base name: "contractNumber")', function() {
      // uncomment below and update the code to test the property contractNumber
      //var instane = new Br16Api.PurchaseInfo();
      //expect(instance).to.be();
    });

  });

}));
