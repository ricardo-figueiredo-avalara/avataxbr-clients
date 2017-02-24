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
    instance = new AvaTaxBrazil.TransportVolumes();
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

  describe('TransportVolumes', function() {
    it('should create an instance of TransportVolumes', function() {
      // uncomment below and update the code to test TransportVolumes
      //var instane = new AvaTaxBrazil.TransportVolumes();
      //expect(instance).to.be.a(AvaTaxBrazil.TransportVolumes);
    });

    it('should have the property qVol (base name: "qVol")', function() {
      // uncomment below and update the code to test the property qVol
      //var instane = new AvaTaxBrazil.TransportVolumes();
      //expect(instance).to.be();
    });

    it('should have the property specie (base name: "specie")', function() {
      // uncomment below and update the code to test the property specie
      //var instane = new AvaTaxBrazil.TransportVolumes();
      //expect(instance).to.be();
    });

    it('should have the property brand (base name: "brand")', function() {
      // uncomment below and update the code to test the property brand
      //var instane = new AvaTaxBrazil.TransportVolumes();
      //expect(instance).to.be();
    });

    it('should have the property volumeNumeration (base name: "volumeNumeration")', function() {
      // uncomment below and update the code to test the property volumeNumeration
      //var instane = new AvaTaxBrazil.TransportVolumes();
      //expect(instance).to.be();
    });

    it('should have the property netWeight (base name: "netWeight")', function() {
      // uncomment below and update the code to test the property netWeight
      //var instane = new AvaTaxBrazil.TransportVolumes();
      //expect(instance).to.be();
    });

    it('should have the property grossWeight (base name: "grossWeight")', function() {
      // uncomment below and update the code to test the property grossWeight
      //var instane = new AvaTaxBrazil.TransportVolumes();
      //expect(instance).to.be();
    });

    it('should have the property seal (base name: "seal")', function() {
      // uncomment below and update the code to test the property seal
      //var instane = new AvaTaxBrazil.TransportVolumes();
      //expect(instance).to.be();
    });

  });

}));
