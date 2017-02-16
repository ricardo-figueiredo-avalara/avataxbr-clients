/**
 * @fileoverview AUTOMATICALLY GENERATED service for API.Client.CompanyLocationApi.
 * Do not edit this file by hand or your changes will be lost next time it is
 * generated.
 *
 * This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts
 * Version: 1.0
 * Generated by: io.swagger.codegen.languages.JavascriptClosureAngularClientCodegen
 */
goog.provide('API.Client.CompanyLocationApi');

goog.require('API.Client.Location');
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
API.Client.CompanyLocationApi = function($http, $httpParamSerializer, $injector) {
  /** @private {!string} */
  this.basePath_ = $injector.has('CompanyLocationApiBasePath') ?
                   /** @type {!string} */ ($injector.get('CompanyLocationApiBasePath')) :
                   'https://br16-dev-app03.br.avalara.com/v2';

  /** @private {!Object<string, string>} */
  this.defaultHeaders_ = $injector.has('CompanyLocationApiDefaultHeaders') ?
                   /** @type {!Object<string, string>} */ (
                       $injector.get('CompanyLocationApiDefaultHeaders')) :
                   {};

  /** @private {!angular.$http} */
  this.http_ = $http;

  /** @package {!Object} */
  this.httpParamSerializer = $injector.get('$httpParamSerializer');
}
API.Client.CompanyLocationApi.$inject = ['$http', '$httpParamSerializer', '$injector'];

/**
 * 
 * This operation return location 
 * @param {!API.Client.UUID} companyId Company ID
 * @param {!string} code Location Code
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.Location>}
 */
API.Client.CompanyLocationApi.prototype.companiesCompanyIdLocationsCodeGet = function(companyId, code, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/companies/{companyId}/locations/{code}'
      .replace('{' + 'companyId' + '}', String(companyId))
      .replace('{' + 'code' + '}', String(code));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'companyId' is set
  if (!companyId) {
    throw new Error('Missing required parameter companyId when calling companiesCompanyIdLocationsCodeGet');
  }
  // verify required parameter 'code' is set
  if (!code) {
    throw new Error('Missing required parameter code when calling companiesCompanyIdLocationsCodeGet');
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
 * 
 * This operation return all locations 
 * @param {!API.Client.UUID} companyId Company ID
 * @param {!number=} opt_xPaginationLimit The per page limit. Currently set to 10 but subject to change at any time (max 100).
 * @param {!number=} opt_xPaginationCurrentPage The current page. Defaults to 1.
 * @param {!string=} opt_xPaginationSort 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!Array<!API.Client.Location>>}
 */
API.Client.CompanyLocationApi.prototype.companiesCompanyIdLocationsGet = function(companyId, opt_xPaginationLimit, opt_xPaginationCurrentPage, opt_xPaginationSort, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/companies/{companyId}/locations'
      .replace('{' + 'companyId' + '}', String(companyId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'companyId' is set
  if (!companyId) {
    throw new Error('Missing required parameter companyId when calling companiesCompanyIdLocationsGet');
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
 * Create new location for company
 * This method operation create a new location for company 
 * @param {!API.Client.UUID} companyId Company ID
 * @param {!Location} body Transaction Message
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.inline_response_201>}
 */
API.Client.CompanyLocationApi.prototype.createLocation = function(companyId, body, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/companies/{companyId}/locations'
      .replace('{' + 'companyId' + '}', String(companyId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'companyId' is set
  if (!companyId) {
    throw new Error('Missing required parameter companyId when calling createLocation');
  }
  // verify required parameter 'body' is set
  if (!body) {
    throw new Error('Missing required parameter body when calling createLocation');
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
 * @param {!string} code Location Code
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.CompanyLocationApi.prototype.deleteLocation = function(companyId, code, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/companies/{companyId}/locations/{code}'
      .replace('{' + 'companyId' + '}', String(companyId))
      .replace('{' + 'code' + '}', String(code));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'companyId' is set
  if (!companyId) {
    throw new Error('Missing required parameter companyId when calling deleteLocation');
  }
  // verify required parameter 'code' is set
  if (!code) {
    throw new Error('Missing required parameter code when calling deleteLocation');
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
 * Update location for company
 * This method operation update a location for company 
 * @param {!API.Client.UUID} companyId Company ID
 * @param {!string} code Location Code
 * @param {!Location} body Transaction Message
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.CompanyLocationApi.prototype.updateLocation = function(companyId, code, body, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/companies/{companyId}/locations/{code}'
      .replace('{' + 'companyId' + '}', String(companyId))
      .replace('{' + 'code' + '}', String(code));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'companyId' is set
  if (!companyId) {
    throw new Error('Missing required parameter companyId when calling updateLocation');
  }
  // verify required parameter 'code' is set
  if (!code) {
    throw new Error('Missing required parameter code when calling updateLocation');
  }
  // verify required parameter 'body' is set
  if (!body) {
    throw new Error('Missing required parameter body when calling updateLocation');
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