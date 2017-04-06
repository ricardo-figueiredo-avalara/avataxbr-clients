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
    instance = new AvaTaxBrazil.CompanyItemGoodsApi();
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

  describe('CompanyItemGoodsApi', function() {
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
    describe('createItem', function() {
      it('should call createItem successfully', function(done) {
        //uncomment below and update the code to test createItem
        //instance.createItem(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('deleteItem', function() {
      it('should call deleteItem successfully', function(done) {
        //uncomment below and update the code to test deleteItem
        //instance.deleteItem(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getCompanyItemsGoods', function() {
      it('should call getCompanyItemsGoods successfully', function(done) {
        //uncomment below and update the code to test getCompanyItemsGoods
        //instance.getCompanyItemsGoods(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getCompanyItemsGoodsList', function() {
      it('should call getCompanyItemsGoodsList successfully', function(done) {
        //uncomment below and update the code to test getCompanyItemsGoodsList
        //instance.getCompanyItemsGoodsList(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('updateItem', function() {
      it('should call updateItem successfully', function(done) {
        //uncomment below and update the code to test updateItem
        //instance.updateItem(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
