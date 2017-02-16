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
    instance = new Br16Api.CompanyAGASTApi();
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

  describe('CompanyAGASTApi', function() {
    describe('companiesCompanyIdAgastsCodeGet', function() {
      it('should call companiesCompanyIdAgastsCodeGet successfully', function(done) {
        //uncomment below and update the code to test companiesCompanyIdAgastsCodeGet
        //instance.companiesCompanyIdAgastsCodeGet(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('companiesCompanyIdAgastsGet', function() {
      it('should call companiesCompanyIdAgastsGet successfully', function(done) {
        //uncomment below and update the code to test companiesCompanyIdAgastsGet
        //instance.companiesCompanyIdAgastsGet(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('createCustomAgast', function() {
      it('should call createCustomAgast successfully', function(done) {
        //uncomment below and update the code to test createCustomAgast
        //instance.createCustomAgast(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('deleteAgast', function() {
      it('should call deleteAgast successfully', function(done) {
        //uncomment below and update the code to test deleteAgast
        //instance.deleteAgast(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('updateCustomAgast', function() {
      it('should call updateCustomAgast successfully', function(done) {
        //uncomment below and update the code to test updateCustomAgast
        //instance.updateCustomAgast(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));