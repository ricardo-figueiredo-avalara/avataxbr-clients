/**
 * AvaTax Brazil
 * The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.
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
    factory(root.expect, root.AvaTaxBrazil);
  }
}(this, function(expect, AvaTaxBrazil) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new AvaTaxBrazil.EntityInformerForGoods();
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

  describe('EntityInformerForGoods', function() {
    it('should create an instance of EntityInformerForGoods', function() {
      // uncomment below and update the code to test EntityInformerForGoods
      //var instane = new AvaTaxBrazil.EntityInformerForGoods();
      //expect(instance).to.be.a(AvaTaxBrazil.EntityInformerForGoods);
    });

    it('should have the property type (base name: "type")', function() {
      // uncomment below and update the code to test the property type
      //var instane = new AvaTaxBrazil.EntityInformerForGoods();
      //expect(instance).to.be();
    });

    it('should have the property taxRegime (base name: "taxRegime")', function() {
      // uncomment below and update the code to test the property taxRegime
      //var instane = new AvaTaxBrazil.EntityInformerForGoods();
      //expect(instance).to.be();
    });

    it('should have the property federalTaxRegime (base name: "federalTaxRegime")', function() {
      // uncomment below and update the code to test the property federalTaxRegime
      //var instane = new AvaTaxBrazil.EntityInformerForGoods();
      //expect(instance).to.be();
    });

    it('should have the property cityCode (base name: "cityCode")', function() {
      // uncomment below and update the code to test the property cityCode
      //var instane = new AvaTaxBrazil.EntityInformerForGoods();
      //expect(instance).to.be();
    });

    it('should have the property address (base name: "address")', function() {
      // uncomment below and update the code to test the property address
      //var instane = new AvaTaxBrazil.EntityInformerForGoods();
      //expect(instance).to.be();
    });

    it('should have the property details (base name: "details")', function() {
      // uncomment below and update the code to test the property details
      //var instane = new AvaTaxBrazil.EntityInformerForGoods();
      //expect(instance).to.be();
    });

    it('should have the property icmsTaxPayer (base name: "icmsTaxPayer")', function() {
      // uncomment below and update the code to test the property icmsTaxPayer
      //var instane = new AvaTaxBrazil.EntityInformerForGoods();
      //expect(instance).to.be();
    });

  });

}));
