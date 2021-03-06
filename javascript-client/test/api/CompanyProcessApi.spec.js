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
    instance = new AvaTaxBrazil.CompanyProcessApi();
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

  describe('CompanyProcessApi', function() {
    describe('createCustomProcessScenario', function() {
      it('should call createCustomProcessScenario successfully', function(done) {
        //uncomment below and update the code to test createCustomProcessScenario
        //instance.createCustomProcessScenario(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('deleteCustomProcessScenario', function() {
      it('should call deleteCustomProcessScenario successfully', function(done) {
        //uncomment below and update the code to test deleteCustomProcessScenario
        //instance.deleteCustomProcessScenario(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getCompanyProcess', function() {
      it('should call getCompanyProcess successfully', function(done) {
        //uncomment below and update the code to test getCompanyProcess
        //instance.getCompanyProcess(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getCompanyProcessList', function() {
      it('should call getCompanyProcessList successfully', function(done) {
        //uncomment below and update the code to test getCompanyProcessList
        //instance.getCompanyProcessList(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('updateCustomProcessScenario', function() {
      it('should call updateCustomProcessScenario successfully', function(done) {
        //uncomment below and update the code to test updateCustomProcessScenario
        //instance.updateCustomProcessScenario(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
