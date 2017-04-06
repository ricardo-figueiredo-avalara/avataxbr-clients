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
    instance = new AvaTaxBrazil.CompanyItemServiceApi();
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

  describe('CompanyItemServiceApi', function() {
    describe('companyItemsChangeCode', function() {
      it('should call companyItemsChangeCode successfully', function(done) {
        //uncomment below and update the code to test companyItemsChangeCode
        //instance.companyItemsChangeCode(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('createItemService', function() {
      it('should call createItemService successfully', function(done) {
        //uncomment below and update the code to test createItemService
        //instance.createItemService(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('deleteItemService', function() {
      it('should call deleteItemService successfully', function(done) {
        //uncomment below and update the code to test deleteItemService
        //instance.deleteItemService(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getCompanyItemsService', function() {
      it('should call getCompanyItemsService successfully', function(done) {
        //uncomment below and update the code to test getCompanyItemsService
        //instance.getCompanyItemsService(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getCompanyItemsServiceList', function() {
      it('should call getCompanyItemsServiceList successfully', function(done) {
        //uncomment below and update the code to test getCompanyItemsServiceList
        //instance.getCompanyItemsServiceList(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('updateItemService', function() {
      it('should call updateItemService successfully', function(done) {
        //uncomment below and update the code to test updateItemService
        //instance.updateItemService(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
