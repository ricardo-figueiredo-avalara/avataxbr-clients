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
    instance = new Br16Api.CompanyConfiguration();
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

  describe('CompanyConfiguration', function() {
    it('should create an instance of CompanyConfiguration', function() {
      // uncomment below and update the code to test CompanyConfiguration
      //var instane = new Br16Api.CompanyConfiguration();
      //expect(instance).to.be.a(Br16Api.CompanyConfiguration);
    });

    it('should have the property certificate (base name: "certificate")', function() {
      // uncomment below and update the code to test the property certificate
      //var instane = new Br16Api.CompanyConfiguration();
      //expect(instance).to.be();
    });

    it('should have the property certificatepwd (base name: "certificatepwd")', function() {
      // uncomment below and update the code to test the property certificatepwd
      //var instane = new Br16Api.CompanyConfiguration();
      //expect(instance).to.be();
    });

    it('should have the property certificateexpiration (base name: "certificateexpiration")', function() {
      // uncomment below and update the code to test the property certificateexpiration
      //var instane = new Br16Api.CompanyConfiguration();
      //expect(instance).to.be();
    });

    it('should have the property logo (base name: "logo")', function() {
      // uncomment below and update the code to test the property logo
      //var instane = new Br16Api.CompanyConfiguration();
      //expect(instance).to.be();
    });

    it('should have the property tpImpNFe (base name: "tpImpNFe")', function() {
      // uncomment below and update the code to test the property tpImpNFe
      //var instane = new Br16Api.CompanyConfiguration();
      //expect(instance).to.be();
    });

    it('should have the property tpImpNFCe (base name: "tpImpNFCe")', function() {
      // uncomment below and update the code to test the property tpImpNFCe
      //var instane = new Br16Api.CompanyConfiguration();
      //expect(instance).to.be();
    });

  });

}));