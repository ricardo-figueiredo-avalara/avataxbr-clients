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
    instance = new AvaTaxBrazil.SefazDisableRangeIn();
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

  describe('SefazDisableRangeIn', function() {
    it('should create an instance of SefazDisableRangeIn', function() {
      // uncomment below and update the code to test SefazDisableRangeIn
      //var instane = new AvaTaxBrazil.SefazDisableRangeIn();
      //expect(instance).to.be.a(AvaTaxBrazil.SefazDisableRangeIn);
    });

    it('should have the property companyLocation (base name: "companyLocation")', function() {
      // uncomment below and update the code to test the property companyLocation
      //var instane = new AvaTaxBrazil.SefazDisableRangeIn();
      //expect(instance).to.be();
    });

    it('should have the property transactionModel (base name: "transactionModel")', function() {
      // uncomment below and update the code to test the property transactionModel
      //var instane = new AvaTaxBrazil.SefazDisableRangeIn();
      //expect(instance).to.be();
    });

    it('should have the property invoiceSerial (base name: "invoiceSerial")', function() {
      // uncomment below and update the code to test the property invoiceSerial
      //var instane = new AvaTaxBrazil.SefazDisableRangeIn();
      //expect(instance).to.be();
    });

    it('should have the property year (base name: "year")', function() {
      // uncomment below and update the code to test the property year
      //var instane = new AvaTaxBrazil.SefazDisableRangeIn();
      //expect(instance).to.be();
    });

    it('should have the property message (base name: "message")', function() {
      // uncomment below and update the code to test the property message
      //var instane = new AvaTaxBrazil.SefazDisableRangeIn();
      //expect(instance).to.be();
    });

    it('should have the property invoiceNumberInit (base name: "invoiceNumberInit")', function() {
      // uncomment below and update the code to test the property invoiceNumberInit
      //var instane = new AvaTaxBrazil.SefazDisableRangeIn();
      //expect(instance).to.be();
    });

    it('should have the property invoiceNumberEnd (base name: "invoiceNumberEnd")', function() {
      // uncomment below and update the code to test the property invoiceNumberEnd
      //var instane = new AvaTaxBrazil.SefazDisableRangeIn();
      //expect(instance).to.be();
    });

  });

}));
