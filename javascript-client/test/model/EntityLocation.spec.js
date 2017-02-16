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
    instance = new Br16Api.EntityLocation();
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

  describe('EntityLocation', function() {
    it('should create an instance of EntityLocation', function() {
      // uncomment below and update the code to test EntityLocation
      //var instane = new Br16Api.EntityLocation();
      //expect(instance).to.be.a(Br16Api.EntityLocation);
    });

    it('should have the property street (base name: "street")', function() {
      // uncomment below and update the code to test the property street
      //var instane = new Br16Api.EntityLocation();
      //expect(instance).to.be();
    });

    it('should have the property neighborhood (base name: "neighborhood")', function() {
      // uncomment below and update the code to test the property neighborhood
      //var instane = new Br16Api.EntityLocation();
      //expect(instance).to.be();
    });

    it('should have the property zipcode (base name: "zipcode")', function() {
      // uncomment below and update the code to test the property zipcode
      //var instane = new Br16Api.EntityLocation();
      //expect(instance).to.be();
    });

    it('should have the property cityCode (base name: "cityCode")', function() {
      // uncomment below and update the code to test the property cityCode
      //var instane = new Br16Api.EntityLocation();
      //expect(instance).to.be();
    });

    it('should have the property cityName (base name: "cityName")', function() {
      // uncomment below and update the code to test the property cityName
      //var instane = new Br16Api.EntityLocation();
      //expect(instance).to.be();
    });

    it('should have the property state (base name: "state")', function() {
      // uncomment below and update the code to test the property state
      //var instane = new Br16Api.EntityLocation();
      //expect(instance).to.be();
    });

    it('should have the property countryCode (base name: "countryCode")', function() {
      // uncomment below and update the code to test the property countryCode
      //var instane = new Br16Api.EntityLocation();
      //expect(instance).to.be();
    });

    it('should have the property country (base name: "country")', function() {
      // uncomment below and update the code to test the property country
      //var instane = new Br16Api.EntityLocation();
      //expect(instance).to.be();
    });

  });

}));
