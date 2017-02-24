/**
 * @fileoverview AUTOMATICALLY GENERATED service for API.Client.CompanyICMSApi.
 * Do not edit this file by hand or your changes will be lost next time it is
 * generated.
 *
 * The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.
 * Version: 1.0
 * Generated by: io.swagger.codegen.languages.JavascriptClosureAngularClientCodegen
 */
goog.provide('API.Client.CompanyICMSApi');

goog.require('API.Client.CustomIcmsConfByState');
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
API.Client.CompanyICMSApi = function($http, $httpParamSerializer, $injector) {
  /** @private {!string} */
  this.basePath_ = $injector.has('CompanyICMSApiBasePath') ?
                   /** @type {!string} */ ($injector.get('CompanyICMSApiBasePath')) :
                   'http://avataxbr-sandbox.avalarabrasil.com.br/v2';

  /** @private {!Object<string, string>} */
  this.defaultHeaders_ = $injector.has('CompanyICMSApiDefaultHeaders') ?
                   /** @type {!Object<string, string>} */ (
                       $injector.get('CompanyICMSApiDefaultHeaders')) :
                   {};

  /** @private {!angular.$http} */
  this.http_ = $http;

  /** @package {!Object} */
  this.httpParamSerializer = $injector.get('$httpParamSerializer');
}
API.Client.CompanyICMSApi.$inject = ['$http', '$httpParamSerializer', '$injector'];

/**
 * 
 * This operation return custom ICMS configurations that match with parameters queries 
 * @param {!API.Client.UUID} companyId Company ID
 * @param {!number=} opt_xPaginationLimit The per page limit. Currently set to 10 but subject to change at any time (max 100).
 * @param {!number=} opt_xPaginationCurrentPage The current page. Defaults to 1.
 * @param {!string=} opt_xPaginationSort 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!Array<!API.Client.CustomIcmsConfByState>>}
 */
API.Client.CompanyICMSApi.prototype.companiesCompanyIdIcmsGet = function(companyId, opt_xPaginationLimit, opt_xPaginationCurrentPage, opt_xPaginationSort, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/companies/{companyId}/icms'
      .replace('{' + 'companyId' + '}', String(companyId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'companyId' is set
  if (!companyId) {
    throw new Error('Missing required parameter companyId when calling companiesCompanyIdIcmsGet');
  }
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
 * 
 * This operation return custom ICMS configurations that match with parameters queries 
 * @param {!API.Client.UUID} companyId Company ID
 * @param {!string} state Brazilian State
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.CustomIcmsConfByState>}
 */
API.Client.CompanyICMSApi.prototype.companiesCompanyIdIcmsStateGet = function(companyId, state, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/companies/{companyId}/icms/{state}'
      .replace('{' + 'companyId' + '}', String(companyId))
      .replace('{' + 'state' + '}', String(state));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'companyId' is set
  if (!companyId) {
    throw new Error('Missing required parameter companyId when calling companiesCompanyIdIcmsStateGet');
  }
  // verify required parameter 'state' is set
  if (!state) {
    throw new Error('Missing required parameter state when calling companiesCompanyIdIcmsStateGet');
  }
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
 * Create custom ICMS tax for one company
 * This method operation create a custom agast for one company 
 * @param {!API.Client.UUID} companyId Company ID
 * @param {!CustomIcmsConfByState} body Transaction Message
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.inline_response_201>}
 */
API.Client.CompanyICMSApi.prototype.createICMS = function(companyId, body, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/companies/{companyId}/icms'
      .replace('{' + 'companyId' + '}', String(companyId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'companyId' is set
  if (!companyId) {
    throw new Error('Missing required parameter companyId when calling createICMS');
  }
  // verify required parameter 'body' is set
  if (!body) {
    throw new Error('Missing required parameter body when calling createICMS');
  }
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
 * @param {!string} state Brazilian State
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.CompanyICMSApi.prototype.deleteCustomIcmsConfByState = function(companyId, state, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/companies/{companyId}/icms/{state}'
      .replace('{' + 'companyId' + '}', String(companyId))
      .replace('{' + 'state' + '}', String(state));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'companyId' is set
  if (!companyId) {
    throw new Error('Missing required parameter companyId when calling deleteCustomIcmsConfByState');
  }
  // verify required parameter 'state' is set
  if (!state) {
    throw new Error('Missing required parameter state when calling deleteCustomIcmsConfByState');
  }
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
 * This method operation update a custom ICMS tax for one company 
 * @param {!API.Client.UUID} companyId Company ID
 * @param {!string} state Brazilian State
 * @param {!CustomIcmsConfByState} body Transaction Message
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.CompanyICMSApi.prototype.updateCustomIcmsConfByState = function(companyId, state, body, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/companies/{companyId}/icms/{state}'
      .replace('{' + 'companyId' + '}', String(companyId))
      .replace('{' + 'state' + '}', String(state));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'companyId' is set
  if (!companyId) {
    throw new Error('Missing required parameter companyId when calling updateCustomIcmsConfByState');
  }
  // verify required parameter 'state' is set
  if (!state) {
    throw new Error('Missing required parameter state when calling updateCustomIcmsConfByState');
  }
  // verify required parameter 'body' is set
  if (!body) {
    throw new Error('Missing required parameter body when calling updateCustomIcmsConfByState');
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
