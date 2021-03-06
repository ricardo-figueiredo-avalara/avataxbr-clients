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
    instance = new AvaTaxBrazil.CompanyApi();
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

  describe('CompanyApi', function() {
    describe('createCompany', function() {
      it('should call createCompany successfully', function(done) {
        //uncomment below and update the code to test createCompany
        //instance.createCompany(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('deleteAccountCompany', function() {
      it('should call deleteAccountCompany successfully', function(done) {
        //uncomment below and update the code to test deleteAccountCompany
        //instance.deleteAccountCompany(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('deleteCompany', function() {
      it('should call deleteCompany successfully', function(done) {
        //uncomment below and update the code to test deleteCompany
        //instance.deleteCompany(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getCompaniesList', function() {
      it('should call getCompaniesList successfully', function(done) {
        //uncomment below and update the code to test getCompaniesList
        //instance.getCompaniesList(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('infoCompany', function() {
      it('should call infoCompany successfully', function(done) {
        //uncomment below and update the code to test infoCompany
        //instance.infoCompany(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('updateCompany', function() {
      it('should call updateCompany successfully', function(done) {
        //uncomment below and update the code to test updateCompany
        //instance.updateCompany(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
