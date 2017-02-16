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
    instance = new Br16Api.IpbtConfItem();
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

  describe('IpbtConfItem', function() {
    it('should create an instance of IpbtConfItem', function() {
      // uncomment below and update the code to test IpbtConfItem
      //var instane = new Br16Api.IpbtConfItem();
      //expect(instance).to.be.a(Br16Api.IpbtConfItem);
    });

    it('should have the property state (base name: "state")', function() {
      // uncomment below and update the code to test the property state
      //var instane = new Br16Api.IpbtConfItem();
      //expect(instance).to.be();
    });

    it('should have the property federalTax (base name: "federalTax")', function() {
      // uncomment below and update the code to test the property federalTax
      //var instane = new Br16Api.IpbtConfItem();
      //expect(instance).to.be();
    });

    it('should have the property importTax (base name: "importTax")', function() {
      // uncomment below and update the code to test the property importTax
      //var instane = new Br16Api.IpbtConfItem();
      //expect(instance).to.be();
    });

    it('should have the property stateTax (base name: "stateTax")', function() {
      // uncomment below and update the code to test the property stateTax
      //var instane = new Br16Api.IpbtConfItem();
      //expect(instance).to.be();
    });

    it('should have the property cityTax (base name: "cityTax")', function() {
      // uncomment below and update the code to test the property cityTax
      //var instane = new Br16Api.IpbtConfItem();
      //expect(instance).to.be();
    });

    it('should have the property source (base name: "source")', function() {
      // uncomment below and update the code to test the property source
      //var instane = new Br16Api.IpbtConfItem();
      //expect(instance).to.be();
    });

  });

}));
