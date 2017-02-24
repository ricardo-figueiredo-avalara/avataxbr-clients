/**
 * @fileoverview AUTOMATICALLY GENERATED service for API.Client.CompanyItemGoodsApi.
 * Do not edit this file by hand or your changes will be lost next time it is
 * generated.
 *
 * The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.
 * Version: 1.0
 * Generated by: io.swagger.codegen.languages.JavascriptClosureAngularClientCodegen
 */
goog.provide('API.Client.CompanyItemGoodsApi');

goog.require('API.Client.Body1');
goog.require('API.Client.ItemGoods');
goog.require('API.Client.Message');
goog.require('API.Client.UUID');
goog.require('API.Client.ValidationError');
goog.require('API.Client.inline_response_201');

/**
 * @constructor
 * @param {!angular.$http} $http
 * @param {!Object} $httpParamSerializer
 * @param {!angular.$injector} $injector
 * @struct
 */
API.Client.CompanyItemGoodsApi = function($http, $httpParamSerializer, $injector) {
  /** @private {!string} */
  this.basePath_ = $injector.has('CompanyItemGoodsApiBasePath') ?
                   /** @type {!string} */ ($injector.get('CompanyItemGoodsApiBasePath')) :
                   'http://avataxbr-sandbox.avalarabrasil.com.br/v2';

  /** @private {!Object<string, string>} */
  this.defaultHeaders_ = $injector.has('CompanyItemGoodsApiDefaultHeaders') ?
                   /** @type {!Object<string, string>} */ (
                       $injector.get('CompanyItemGoodsApiDefaultHeaders')) :
                   {};

  /** @private {!angular.$http} */
  this.http_ = $http;

  /** @package {!Object} */
  this.httpParamSerializer = $injector.get('$httpParamSerializer');
}
API.Client.CompanyItemGoodsApi.$inject = ['$http', '$httpParamSerializer', '$injector'];

/**
 * 
 * Change the code of a given item. 
 * @param {!API.Client.UUID} companyId Company ID
 * @param {!string} code Item Code
 * @param {!Body1} body Requisition
 * @param {!string=} opt_goods Provide to apply to goods items.
 * @param {!string=} opt_service Provide to apply to service items.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.CompanyItemGoodsApi.prototype.companiesCompanyIdItemsCodeChangeCodePut = function(companyId, code, body, opt_goods, opt_service, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/companies/{companyId}/items/{code}/change-code'
      .replace('{' + 'companyId' + '}', String(companyId))
      .replace('{' + 'code' + '}', String(code));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'companyId' is set
  if (!companyId) {
    throw new Error('Missing required parameter companyId when calling companiesCompanyIdItemsCodeChangeCodePut');
  }
  // verify required parameter 'code' is set
  if (!code) {
    throw new Error('Missing required parameter code when calling companiesCompanyIdItemsCodeChangeCodePut');
  }
  // verify required parameter 'body' is set
  if (!body) {
    throw new Error('Missing required parameter body when calling companiesCompanyIdItemsCodeChangeCodePut');
  }
  if (opt_goods !== undefined) {
    queryParameters['goods'] = opt_goods;
  }

  if (opt_service !== undefined) {
    queryParameters['service'] = opt_service;
  }

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'PUT',
    url: path,
    json: true,
    data: body,
        params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * 
 * This operation return custom agast configurations that match with parameters queries 
 * @param {!API.Client.UUID} companyId Company ID
 * @param {!string} code Item Code
 * @param {!string} avalaraProductType Avalara Product Type
 * @param {!string=} opt_agast Custom Agast Code
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.ItemGoods>}
 */
API.Client.CompanyItemGoodsApi.prototype.companiesCompanyIdItemsCodegoodsGet = function(companyId, code, avalaraProductType, opt_agast, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/companies/{companyId}/items/{code}?goods'
      .replace('{' + 'companyId' + '}', String(companyId))
      .replace('{' + 'code' + '}', String(code));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'companyId' is set
  if (!companyId) {
    throw new Error('Missing required parameter companyId when calling companiesCompanyIdItemsCodegoodsGet');
  }
  // verify required parameter 'code' is set
  if (!code) {
    throw new Error('Missing required parameter code when calling companiesCompanyIdItemsCodegoodsGet');
  }
  // verify required parameter 'avalaraProductType' is set
  if (!avalaraProductType) {
    throw new Error('Missing required parameter avalaraProductType when calling companiesCompanyIdItemsCodegoodsGet');
  }
  if (opt_agast !== undefined) {
    queryParameters['agast'] = opt_agast;
  }

  headerParams['Avalara-Product-Type'] = avalaraProductType;

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'GET',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * 
 * This operation return custom agast configurations that match with parameters queries 
 * @param {!API.Client.UUID} companyId Company ID
 * @param {!string} avalaraProductType Avalara Product Type
 * @param {!number=} opt_xPaginationLimit The per page limit. Currently set to 10 but subject to change at any time (max 100).
 * @param {!number=} opt_xPaginationCurrentPage The current page. Defaults to 1.
 * @param {!string=} opt_xPaginationSort 
 * @param {!string=} opt_code Item Code
 * @param {!string=} opt_agast Custom Agast Code
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!Array<!API.Client.ItemGoods>>}
 */
API.Client.CompanyItemGoodsApi.prototype.companiesCompanyIdItemsgoodsGet = function(companyId, avalaraProductType, opt_xPaginationLimit, opt_xPaginationCurrentPage, opt_xPaginationSort, opt_code, opt_agast, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/companies/{companyId}/items?goods'
      .replace('{' + 'companyId' + '}', String(companyId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'companyId' is set
  if (!companyId) {
    throw new Error('Missing required parameter companyId when calling companiesCompanyIdItemsgoodsGet');
  }
  // verify required parameter 'avalaraProductType' is set
  if (!avalaraProductType) {
    throw new Error('Missing required parameter avalaraProductType when calling companiesCompanyIdItemsgoodsGet');
  }
  if (opt_code !== undefined) {
    queryParameters['code'] = opt_code;
  }

  if (opt_agast !== undefined) {
    queryParameters['agast'] = opt_agast;
  }

  headerParams['Avalara-Product-Type'] = avalaraProductType;

  headerParams['X-Pagination-Limit'] = opt_xPaginationLimit;

  headerParams['X-Pagination-Current-Page'] = opt_xPaginationCurrentPage;

  headerParams['X-Pagination-Sort'] = opt_xPaginationSort;

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'GET',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * Create custom agast for one company
 * This method operation create a custom agast for one company 
 * @param {!API.Client.UUID} companyId Company ID
 * @param {!string} avalaraProductType Avalara Product Type
 * @param {!ItemGoods} body Transaction Message
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.inline_response_201>}
 */
API.Client.CompanyItemGoodsApi.prototype.createItem = function(companyId, avalaraProductType, body, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/companies/{companyId}/items?goods'
      .replace('{' + 'companyId' + '}', String(companyId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'companyId' is set
  if (!companyId) {
    throw new Error('Missing required parameter companyId when calling createItem');
  }
  // verify required parameter 'avalaraProductType' is set
  if (!avalaraProductType) {
    throw new Error('Missing required parameter avalaraProductType when calling createItem');
  }
  // verify required parameter 'body' is set
  if (!body) {
    throw new Error('Missing required parameter body when calling createItem');
  }
  headerParams['Avalara-Product-Type'] = avalaraProductType;

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: true,
    data: body,
        params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * 
 * 
 * @param {!API.Client.UUID} companyId Company ID
 * @param {!string} code Item Code
 * @param {!string} avalaraProductType Avalara Product Type
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.CompanyItemGoodsApi.prototype.deleteItem = function(companyId, code, avalaraProductType, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/companies/{companyId}/items/{code}?goods'
      .replace('{' + 'companyId' + '}', String(companyId))
      .replace('{' + 'code' + '}', String(code));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'companyId' is set
  if (!companyId) {
    throw new Error('Missing required parameter companyId when calling deleteItem');
  }
  // verify required parameter 'code' is set
  if (!code) {
    throw new Error('Missing required parameter code when calling deleteItem');
  }
  // verify required parameter 'avalaraProductType' is set
  if (!avalaraProductType) {
    throw new Error('Missing required parameter avalaraProductType when calling deleteItem');
  }
  headerParams['Avalara-Product-Type'] = avalaraProductType;

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'DELETE',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * Update custom agast for one company
 * This method operation create a custom agast for one company 
 * @param {!API.Client.UUID} companyId Company ID
 * @param {!string} code Item Code
 * @param {!string} avalaraProductType Avalara Product Type
 * @param {!ItemGoods} body Transaction Message
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.CompanyItemGoodsApi.prototype.updateItem = function(companyId, code, avalaraProductType, body, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/companies/{companyId}/items/{code}?goods'
      .replace('{' + 'companyId' + '}', String(companyId))
      .replace('{' + 'code' + '}', String(code));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'companyId' is set
  if (!companyId) {
    throw new Error('Missing required parameter companyId when calling updateItem');
  }
  // verify required parameter 'code' is set
  if (!code) {
    throw new Error('Missing required parameter code when calling updateItem');
  }
  // verify required parameter 'avalaraProductType' is set
  if (!avalaraProductType) {
    throw new Error('Missing required parameter avalaraProductType when calling updateItem');
  }
  // verify required parameter 'body' is set
  if (!body) {
    throw new Error('Missing required parameter body when calling updateItem');
  }
  headerParams['Avalara-Product-Type'] = avalaraProductType;

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'PUT',
    url: path,
    json: true,
    data: body,
        params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}
