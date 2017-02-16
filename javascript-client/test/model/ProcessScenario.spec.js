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
    instance = new Br16Api.ProcessScenario();
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

  describe('ProcessScenario', function() {
    it('should create an instance of ProcessScenario', function() {
      // uncomment below and update the code to test ProcessScenario
      //var instane = new Br16Api.ProcessScenario();
      //expect(instance).to.be.a(Br16Api.ProcessScenario);
    });

    it('should have the property name (base name: "name")', function() {
      // uncomment below and update the code to test the property name
      //var instane = new Br16Api.ProcessScenario();
      //expect(instance).to.be();
    });

    it('should have the property code (base name: "code")', function() {
      // uncomment below and update the code to test the property code
      //var instane = new Br16Api.ProcessScenario();
      //expect(instance).to.be();
    });

    it('should have the property type (base name: "type")', function() {
      // uncomment below and update the code to test the property type
      //var instane = new Br16Api.ProcessScenario();
      //expect(instance).to.be();
    });

    it('should have the property wayType (base name: "wayType")', function() {
      // uncomment below and update the code to test the property wayType
      //var instane = new Br16Api.ProcessScenario();
      //expect(instance).to.be();
    });

    it('should have the property goal (base name: "goal")', function() {
      // uncomment below and update the code to test the property goal
      //var instane = new Br16Api.ProcessScenario();
      //expect(instance).to.be();
    });

    it('should have the property overWriteCFOP (base name: "overWriteCFOP")', function() {
      // uncomment below and update the code to test the property overWriteCFOP
      //var instane = new Br16Api.ProcessScenario();
      //expect(instance).to.be();
    });

    it('should have the property cfops (base name: "cfops")', function() {
      // uncomment below and update the code to test the property cfops
      //var instane = new Br16Api.ProcessScenario();
      //expect(instance).to.be();
    });

  });

}));
