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
    instance = new AvaTaxBrazil.Fuel();
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

  describe('Fuel', function() {
    it('should create an instance of Fuel', function() {
      // uncomment below and update the code to test Fuel
      //var instane = new AvaTaxBrazil.Fuel();
      //expect(instance).to.be.a(AvaTaxBrazil.Fuel);
    });

    it('should have the property prodANPCode (base name: "prodANPCode")', function() {
      // uncomment below and update the code to test the property prodANPCode
      //var instane = new AvaTaxBrazil.Fuel();
      //expect(instance).to.be();
    });

    it('should have the property perMixGN (base name: "perMixGN")', function() {
      // uncomment below and update the code to test the property perMixGN
      //var instane = new AvaTaxBrazil.Fuel();
      //expect(instance).to.be();
    });

    it('should have the property authorizationCodeCODIF (base name: "authorizationCodeCODIF")', function() {
      // uncomment below and update the code to test the property authorizationCodeCODIF
      //var instane = new AvaTaxBrazil.Fuel();
      //expect(instance).to.be();
    });

    it('should have the property quantityOnRoomTemperature (base name: "quantityOnRoomTemperature")', function() {
      // uncomment below and update the code to test the property quantityOnRoomTemperature
      //var instane = new AvaTaxBrazil.Fuel();
      //expect(instance).to.be();
    });

    it('should have the property stateCodeOfUndUser (base name: "stateCodeOfUndUser")', function() {
      // uncomment below and update the code to test the property stateCodeOfUndUser
      //var instane = new AvaTaxBrazil.Fuel();
      //expect(instance).to.be();
    });

    it('should have the property cide (base name: "cide")', function() {
      // uncomment below and update the code to test the property cide
      //var instane = new AvaTaxBrazil.Fuel();
      //expect(instance).to.be();
    });

    it('should have the property pumpNumber (base name: "pumpNumber")', function() {
      // uncomment below and update the code to test the property pumpNumber
      //var instane = new AvaTaxBrazil.Fuel();
      //expect(instance).to.be();
    });

  });

}));
