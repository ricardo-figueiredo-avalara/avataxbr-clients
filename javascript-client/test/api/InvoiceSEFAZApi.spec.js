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
    instance = new Br16Api.InvoiceSEFAZApi();
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

  describe('InvoiceSEFAZApi', function() {
    describe('invoicesSefazDelete', function() {
      it('should call invoicesSefazDelete successfully', function(done) {
        //uncomment below and update the code to test invoicesSefazDelete
        //instance.invoicesSefazDelete(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('invoicesSefazKeyDelete', function() {
      it('should call invoicesSefazKeyDelete successfully', function(done) {
        //uncomment below and update the code to test invoicesSefazKeyDelete
        //instance.invoicesSefazKeyDelete(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('invoicesSefazKeyGet', function() {
      it('should call invoicesSefazKeyGet successfully', function(done) {
        //uncomment below and update the code to test invoicesSefazKeyGet
        //instance.invoicesSefazKeyGet(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('invoicesSefazKeyLookupGet', function() {
      it('should call invoicesSefazKeyLookupGet successfully', function(done) {
        //uncomment below and update the code to test invoicesSefazKeyLookupGet
        //instance.invoicesSefazKeyLookupGet(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('invoicesSefazKeyPut', function() {
      it('should call invoicesSefazKeyPut successfully', function(done) {
        //uncomment below and update the code to test invoicesSefazKeyPut
        //instance.invoicesSefazKeyPut(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('invoicesSefazPost', function() {
      it('should call invoicesSefazPost successfully', function(done) {
        //uncomment below and update the code to test invoicesSefazPost
        //instance.invoicesSefazPost(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('invoicesSefazStatusGet', function() {
      it('should call invoicesSefazStatusGet successfully', function(done) {
        //uncomment below and update the code to test invoicesSefazStatusGet
        //instance.invoicesSefazStatusGet(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
