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
    instance = new Br16Api.LineForGoodsCalculatedTaxTaxByType();
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

  describe('LineForGoodsCalculatedTaxTaxByType', function() {
    it('should create an instance of LineForGoodsCalculatedTaxTaxByType', function() {
      // uncomment below and update the code to test LineForGoodsCalculatedTaxTaxByType
      //var instane = new Br16Api.LineForGoodsCalculatedTaxTaxByType();
      //expect(instance).to.be.a(Br16Api.LineForGoodsCalculatedTaxTaxByType);
    });

    it('should have the property icms (base name: "icms")', function() {
      // uncomment below and update the code to test the property icms
      //var instane = new Br16Api.LineForGoodsCalculatedTaxTaxByType();
      //expect(instance).to.be();
    });

    it('should have the property icmsSt (base name: "icmsSt")', function() {
      // uncomment below and update the code to test the property icmsSt
      //var instane = new Br16Api.LineForGoodsCalculatedTaxTaxByType();
      //expect(instance).to.be();
    });

    it('should have the property icmsStSd (base name: "icmsStSd")', function() {
      // uncomment below and update the code to test the property icmsStSd
      //var instane = new Br16Api.LineForGoodsCalculatedTaxTaxByType();
      //expect(instance).to.be();
    });

    it('should have the property icmsPartOwn (base name: "icmsPartOwn")', function() {
      // uncomment below and update the code to test the property icmsPartOwn
      //var instane = new Br16Api.LineForGoodsCalculatedTaxTaxByType();
      //expect(instance).to.be();
    });

    it('should have the property icmsPartDest (base name: "icmsPartDest")', function() {
      // uncomment below and update the code to test the property icmsPartDest
      //var instane = new Br16Api.LineForGoodsCalculatedTaxTaxByType();
      //expect(instance).to.be();
    });

    it('should have the property icmsDifaFCP (base name: "icmsDifaFCP")', function() {
      // uncomment below and update the code to test the property icmsDifaFCP
      //var instane = new Br16Api.LineForGoodsCalculatedTaxTaxByType();
      //expect(instance).to.be();
    });

    it('should have the property icmsDifaDest (base name: "icmsDifaDest")', function() {
      // uncomment below and update the code to test the property icmsDifaDest
      //var instane = new Br16Api.LineForGoodsCalculatedTaxTaxByType();
      //expect(instance).to.be();
    });

    it('should have the property icmsDifaRemet (base name: "icmsDifaRemet")', function() {
      // uncomment below and update the code to test the property icmsDifaRemet
      //var instane = new Br16Api.LineForGoodsCalculatedTaxTaxByType();
      //expect(instance).to.be();
    });

    it('should have the property icmsRf (base name: "icmsRf")', function() {
      // uncomment below and update the code to test the property icmsRf
      //var instane = new Br16Api.LineForGoodsCalculatedTaxTaxByType();
      //expect(instance).to.be();
    });

    it('should have the property icmsDeson (base name: "icmsDeson")', function() {
      // uncomment below and update the code to test the property icmsDeson
      //var instane = new Br16Api.LineForGoodsCalculatedTaxTaxByType();
      //expect(instance).to.be();
    });

    it('should have the property icmsCredsn (base name: "icmsCredsn")', function() {
      // uncomment below and update the code to test the property icmsCredsn
      //var instane = new Br16Api.LineForGoodsCalculatedTaxTaxByType();
      //expect(instance).to.be();
    });

    it('should have the property pis (base name: "pis")', function() {
      // uncomment below and update the code to test the property pis
      //var instane = new Br16Api.LineForGoodsCalculatedTaxTaxByType();
      //expect(instance).to.be();
    });

    it('should have the property pisSt (base name: "pisSt")', function() {
      // uncomment below and update the code to test the property pisSt
      //var instane = new Br16Api.LineForGoodsCalculatedTaxTaxByType();
      //expect(instance).to.be();
    });

    it('should have the property cofins (base name: "cofins")', function() {
      // uncomment below and update the code to test the property cofins
      //var instane = new Br16Api.LineForGoodsCalculatedTaxTaxByType();
      //expect(instance).to.be();
    });

    it('should have the property cofinsSt (base name: "cofinsSt")', function() {
      // uncomment below and update the code to test the property cofinsSt
      //var instane = new Br16Api.LineForGoodsCalculatedTaxTaxByType();
      //expect(instance).to.be();
    });

    it('should have the property ipi (base name: "ipi")', function() {
      // uncomment below and update the code to test the property ipi
      //var instane = new Br16Api.LineForGoodsCalculatedTaxTaxByType();
      //expect(instance).to.be();
    });

    it('should have the property ipiReturned (base name: "ipiReturned")', function() {
      // uncomment below and update the code to test the property ipiReturned
      //var instane = new Br16Api.LineForGoodsCalculatedTaxTaxByType();
      //expect(instance).to.be();
    });

    it('should have the property ii (base name: "ii")', function() {
      // uncomment below and update the code to test the property ii
      //var instane = new Br16Api.LineForGoodsCalculatedTaxTaxByType();
      //expect(instance).to.be();
    });

    it('should have the property iof (base name: "iof")', function() {
      // uncomment below and update the code to test the property iof
      //var instane = new Br16Api.LineForGoodsCalculatedTaxTaxByType();
      //expect(instance).to.be();
    });

    it('should have the property aproxtribState (base name: "aproxtribState")', function() {
      // uncomment below and update the code to test the property aproxtribState
      //var instane = new Br16Api.LineForGoodsCalculatedTaxTaxByType();
      //expect(instance).to.be();
    });

    it('should have the property aproxtribFed (base name: "aproxtribFed")', function() {
      // uncomment below and update the code to test the property aproxtribFed
      //var instane = new Br16Api.LineForGoodsCalculatedTaxTaxByType();
      //expect(instance).to.be();
    });

  });

}));