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
    instance = new Br16Api.ItemCpom();
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

  describe('ItemCpom', function() {
    it('should create an instance of ItemCpom', function() {
      // uncomment below and update the code to test ItemCpom
      //var instane = new Br16Api.ItemCpom();
      //expect(instance).to.be.a(Br16Api.ItemCpom);
    });

    it('should have the property companyId (base name: "companyId")', function() {
      // uncomment below and update the code to test the property companyId
      //var instane = new Br16Api.ItemCpom();
      //expect(instance).to.be();
    });

    it('should have the property cityCode (base name: "cityCode")', function() {
      // uncomment below and update the code to test the property cityCode
      //var instane = new Br16Api.ItemCpom();
      //expect(instance).to.be();
    });

    it('should have the property itemCode (base name: "itemCode")', function() {
      // uncomment below and update the code to test the property itemCode
      //var instane = new Br16Api.ItemCpom();
      //expect(instance).to.be();
    });

    it('should have the property code (base name: "code")', function() {
      // uncomment below and update the code to test the property code
      //var instane = new Br16Api.ItemCpom();
      //expect(instance).to.be();
    });

  });

}));
