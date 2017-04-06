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
    instance = new AvaTaxBrazil.ServiceCalculationsApi();
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

  describe('ServiceCalculationsApi', function() {
    describe('calculationServicePayment', function() {
      it('should call calculationServicePayment successfully', function(done) {
        //uncomment below and update the code to test calculationServicePayment
        //instance.calculationServicePayment(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('calculationServicePurchase', function() {
      it('should call calculationServicePurchase successfully', function(done) {
        //uncomment below and update the code to test calculationServicePurchase
        //instance.calculationServicePurchase(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('calculationServiceReceipt', function() {
      it('should call calculationServiceReceipt successfully', function(done) {
        //uncomment below and update the code to test calculationServiceReceipt
        //instance.calculationServiceReceipt(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('calculationServiceSales', function() {
      it('should call calculationServiceSales successfully', function(done) {
        //uncomment below and update the code to test calculationServiceSales
        //instance.calculationServiceSales(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('convertServiceCalculatioToTransaction', function() {
      it('should call convertServiceCalculatioToTransaction successfully', function(done) {
        //uncomment below and update the code to test convertServiceCalculatioToTransaction
        //instance.convertServiceCalculatioToTransaction(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('retrieveGoodsTransactions', function() {
      it('should call retrieveGoodsTransactions successfully', function(done) {
        //uncomment below and update the code to test retrieveGoodsTransactions
        //instance.retrieveGoodsTransactions(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('retrieveServiceTransactionDocument', function() {
      it('should call retrieveServiceTransactionDocument successfully', function(done) {
        //uncomment below and update the code to test retrieveServiceTransactionDocument
        //instance.retrieveServiceTransactionDocument(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('retrieveServiceTransactions', function() {
      it('should call retrieveServiceTransactions successfully', function(done) {
        //uncomment below and update the code to test retrieveServiceTransactions
        //instance.retrieveServiceTransactions(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));