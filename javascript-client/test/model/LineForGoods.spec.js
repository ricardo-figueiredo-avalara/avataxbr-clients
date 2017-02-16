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
    instance = new Br16Api.LineForGoods();
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

  describe('LineForGoods', function() {
    it('should create an instance of LineForGoods', function() {
      // uncomment below and update the code to test LineForGoods
      //var instane = new Br16Api.LineForGoods();
      //expect(instance).to.be.a(Br16Api.LineForGoods);
    });

    it('should have the property lineCode (base name: "lineCode")', function() {
      // uncomment below and update the code to test the property lineCode
      //var instane = new Br16Api.LineForGoods();
      //expect(instance).to.be();
    });

    it('should have the property itemCode (base name: "itemCode")', function() {
      // uncomment below and update the code to test the property itemCode
      //var instane = new Br16Api.LineForGoods();
      //expect(instance).to.be();
    });

    it('should have the property avalaraGoodsAndServicesType (base name: "avalaraGoodsAndServicesType")', function() {
      // uncomment below and update the code to test the property avalaraGoodsAndServicesType
      //var instane = new Br16Api.LineForGoods();
      //expect(instance).to.be();
    });

    it('should have the property numberOfItems (base name: "numberOfItems")', function() {
      // uncomment below and update the code to test the property numberOfItems
      //var instane = new Br16Api.LineForGoods();
      //expect(instance).to.be();
    });

    it('should have the property returnedPercentageAmount (base name: "returnedPercentageAmount")', function() {
      // uncomment below and update the code to test the property returnedPercentageAmount
      //var instane = new Br16Api.LineForGoods();
      //expect(instance).to.be();
    });

    it('should have the property lineUnitPrice (base name: "lineUnitPrice")', function() {
      // uncomment below and update the code to test the property lineUnitPrice
      //var instane = new Br16Api.LineForGoods();
      //expect(instance).to.be();
    });

    it('should have the property lineAmount (base name: "lineAmount")', function() {
      // uncomment below and update the code to test the property lineAmount
      //var instane = new Br16Api.LineForGoods();
      //expect(instance).to.be();
    });

    it('should have the property itemDescription (base name: "itemDescription")', function() {
      // uncomment below and update the code to test the property itemDescription
      //var instane = new Br16Api.LineForGoods();
      //expect(instance).to.be();
    });

    it('should have the property lineTaxedDiscount (base name: "lineTaxedDiscount")', function() {
      // uncomment below and update the code to test the property lineTaxedDiscount
      //var instane = new Br16Api.LineForGoods();
      //expect(instance).to.be();
    });

    it('should have the property lineUntaxedDiscount (base name: "lineUntaxedDiscount")', function() {
      // uncomment below and update the code to test the property lineUntaxedDiscount
      //var instane = new Br16Api.LineForGoods();
      //expect(instance).to.be();
    });

    it('should have the property useType (base name: "useType")', function() {
      // uncomment below and update the code to test the property useType
      //var instane = new Br16Api.LineForGoods();
      //expect(instance).to.be();
    });

    it('should have the property processScenario (base name: "processScenario")', function() {
      // uncomment below and update the code to test the property processScenario
      //var instane = new Br16Api.LineForGoods();
      //expect(instance).to.be();
    });

    it('should have the property cfop (base name: "cfop")', function() {
      // uncomment below and update the code to test the property cfop
      //var instane = new Br16Api.LineForGoods();
      //expect(instance).to.be();
    });

    it('should have the property hasStockImpact (base name: "hasStockImpact")', function() {
      // uncomment below and update the code to test the property hasStockImpact
      //var instane = new Br16Api.LineForGoods();
      //expect(instance).to.be();
    });

    it('should have the property hasFinantialImpact (base name: "hasFinantialImpact")', function() {
      // uncomment below and update the code to test the property hasFinantialImpact
      //var instane = new Br16Api.LineForGoods();
      //expect(instance).to.be();
    });

    it('should have the property freightAmount (base name: "freightAmount")', function() {
      // uncomment below and update the code to test the property freightAmount
      //var instane = new Br16Api.LineForGoods();
      //expect(instance).to.be();
    });

    it('should have the property insuranceAmount (base name: "insuranceAmount")', function() {
      // uncomment below and update the code to test the property insuranceAmount
      //var instane = new Br16Api.LineForGoods();
      //expect(instance).to.be();
    });

    it('should have the property otherCostAmount (base name: "otherCostAmount")', function() {
      // uncomment below and update the code to test the property otherCostAmount
      //var instane = new Br16Api.LineForGoods();
      //expect(instance).to.be();
    });

    it('should have the property indTotType (base name: "indTotType")', function() {
      // uncomment below and update the code to test the property indTotType
      //var instane = new Br16Api.LineForGoods();
      //expect(instance).to.be();
    });

    it('should have the property orderNumber (base name: "orderNumber")', function() {
      // uncomment below and update the code to test the property orderNumber
      //var instane = new Br16Api.LineForGoods();
      //expect(instance).to.be();
    });

    it('should have the property orderItemNumber (base name: "orderItemNumber")', function() {
      // uncomment below and update the code to test the property orderItemNumber
      //var instane = new Br16Api.LineForGoods();
      //expect(instance).to.be();
    });

    it('should have the property fciNumber (base name: "fciNumber")', function() {
      // uncomment below and update the code to test the property fciNumber
      //var instane = new Br16Api.LineForGoods();
      //expect(instance).to.be();
    });

    it('should have the property recopiNumber (base name: "recopiNumber")', function() {
      // uncomment below and update the code to test the property recopiNumber
      //var instane = new Br16Api.LineForGoods();
      //expect(instance).to.be();
    });

    it('should have the property infAdProd (base name: "infAdProd")', function() {
      // uncomment below and update the code to test the property infAdProd
      //var instane = new Br16Api.LineForGoods();
      //expect(instance).to.be();
    });

    it('should have the property vehicle (base name: "vehicle")', function() {
      // uncomment below and update the code to test the property vehicle
      //var instane = new Br16Api.LineForGoods();
      //expect(instance).to.be();
    });

    it('should have the property medicine (base name: "medicine")', function() {
      // uncomment below and update the code to test the property medicine
      //var instane = new Br16Api.LineForGoods();
      //expect(instance).to.be();
    });

    it('should have the property weapon (base name: "weapon")', function() {
      // uncomment below and update the code to test the property weapon
      //var instane = new Br16Api.LineForGoods();
      //expect(instance).to.be();
    });

    it('should have the property fuel (base name: "fuel")', function() {
      // uncomment below and update the code to test the property fuel
      //var instane = new Br16Api.LineForGoods();
      //expect(instance).to.be();
    });

    it('should have the property entityIsIcmsSubstitute (base name: "entityIsIcmsSubstitute")', function() {
      // uncomment below and update the code to test the property entityIsIcmsSubstitute
      //var instane = new Br16Api.LineForGoods();
      //expect(instance).to.be();
    });

    it('should have the property isTransportIcmsWithheld (base name: "isTransportIcmsWithheld")', function() {
      // uncomment below and update the code to test the property isTransportIcmsWithheld
      //var instane = new Br16Api.LineForGoods();
      //expect(instance).to.be();
    });

    it('should have the property icmsTaxRelief (base name: "icmsTaxRelief")', function() {
      // uncomment below and update the code to test the property icmsTaxRelief
      //var instane = new Br16Api.LineForGoods();
      //expect(instance).to.be();
    });

    it('should have the property _export (base name: "export")', function() {
      // uncomment below and update the code to test the property _export
      //var instane = new Br16Api.LineForGoods();
      //expect(instance).to.be();
    });

    it('should have the property di (base name: "di")', function() {
      // uncomment below and update the code to test the property di
      //var instane = new Br16Api.LineForGoods();
      //expect(instance).to.be();
    });

    it('should have the property calculatedTax (base name: "calculatedTax")', function() {
      // uncomment below and update the code to test the property calculatedTax
      //var instane = new Br16Api.LineForGoods();
      //expect(instance).to.be();
    });

  });

}));