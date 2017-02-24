/**
 * @fileoverview AUTOMATICALLY GENERATED service for API.Client.CompanyFilesApi.
 * Do not edit this file by hand or your changes will be lost next time it is
 * generated.
 *
 * The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.
 * Version: 1.0
 * Generated by: io.swagger.codegen.languages.JavascriptClosureAngularClientCodegen
 */
goog.provide('API.Client.CompanyFilesApi');

goog.require('API.Client.Body2');
goog.require('API.Client.Body3');
goog.require('API.Client.Message');
goog.require('API.Client.UUID');
goog.require('API.Client.ValidationError');
goog.require('API.Client.inline_response_200_2');

/**
 * @constructor
 * @param {!angular.$http} $http
 * @param {!Object} $httpParamSerializer
 * @param {!angular.$injector} $injector
 * @struct
 */
API.Client.CompanyFilesApi = function($http, $httpParamSerializer, $injector) {
  /** @private {!string} */
  this.basePath_ = $injector.has('CompanyFilesApiBasePath') ?
                   /** @type {!string} */ ($injector.get('CompanyFilesApiBasePath')) :
                   'http://avataxbr-sandbox.avalarabrasil.com.br/v2';

  /** @private {!Object<string, string>} */
  this.defaultHeaders_ = $injector.has('CompanyFilesApiDefaultHeaders') ?
                   /** @type {!Object<string, string>} */ (
                       $injector.get('CompanyFilesApiDefaultHeaders')) :
                   {};

  /** @private {!angular.$http} */
  this.http_ = $http;

  /** @package {!Object} */
  this.httpParamSerializer = $injector.get('$httpParamSerializer');
}
API.Client.CompanyFilesApi.$inject = ['$http', '$httpParamSerializer', '$injector'];

/**
 * 
 * Deletes a company file store.  
 * @param {!API.Client.UUID} companyId Company ID
 * @param {!API.Client.UUID} companyId2 Company ID
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.CompanyFilesApi.prototype.companiesCompanyIdNfseCertificateDelete = function(companyId, companyId2, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/companies/{companyId}/nfse-certificate'
      .replace('{' + 'companyId' + '}', String(companyId))
      .replace('{' + 'companyId' + '}', String(companyId2));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'companyId' is set
  if (!companyId) {
    throw new Error('Missing required parameter companyId when calling companiesCompanyIdNfseCertificateDelete');
  }
  // verify required parameter 'companyId2' is set
  if (!companyId2) {
    throw new Error('Missing required parameter companyId2 when calling companiesCompanyIdNfseCertificateDelete');
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
 * 
 * Gets an existing NFSe certificate file for this company. 
 * @param {!API.Client.UUID} companyId Company ID
 * @param {!API.Client.UUID} companyId2 Company ID
 * @param {!number=} opt_peek Use this parameter to check the existence of the file without downloading it.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.CompanyFilesApi.prototype.companiesCompanyIdNfseCertificateGet = function(companyId, companyId2, opt_peek, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/companies/{companyId}/nfse-certificate'
      .replace('{' + 'companyId' + '}', String(companyId))
      .replace('{' + 'companyId' + '}', String(companyId2));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'companyId' is set
  if (!companyId) {
    throw new Error('Missing required parameter companyId when calling companiesCompanyIdNfseCertificateGet');
  }
  // verify required parameter 'companyId2' is set
  if (!companyId2) {
    throw new Error('Missing required parameter companyId2 when calling companiesCompanyIdNfseCertificateGet');
  }
  if (opt_peek !== undefined) {
    queryParameters['peek'] = opt_peek;
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
 * If it still not exists, uploads a new NFSe Certificate file for this company. Send the file as a base64 string. 
 * @param {!API.Client.UUID} companyId Company ID
 * @param {!Body3} body Content
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.inline_response_200_2>}
 */
API.Client.CompanyFilesApi.prototype.companiesCompanyIdNfseCertificatePost = function(companyId, body, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/companies/{companyId}/nfse-certificate'
      .replace('{' + 'companyId' + '}', String(companyId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'companyId' is set
  if (!companyId) {
    throw new Error('Missing required parameter companyId when calling companiesCompanyIdNfseCertificatePost');
  }
  // verify required parameter 'body' is set
  if (!body) {
    throw new Error('Missing required parameter body when calling companiesCompanyIdNfseCertificatePost');
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
 * Updates an existing NFSe certificate file for this company. Send the file as a base64 string. 
 * @param {!API.Client.UUID} companyId Company ID
 * @param {!API.Client.UUID} companyId2 Company ID
 * @param {!Body2} body Content
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.inline_response_200_2>}
 */
API.Client.CompanyFilesApi.prototype.companiesCompanyIdNfseCertificatePut = function(companyId, companyId2, body, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/companies/{companyId}/nfse-certificate'
      .replace('{' + 'companyId' + '}', String(companyId))
      .replace('{' + 'companyId' + '}', String(companyId2));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'companyId' is set
  if (!companyId) {
    throw new Error('Missing required parameter companyId when calling companiesCompanyIdNfseCertificatePut');
  }
  // verify required parameter 'companyId2' is set
  if (!companyId2) {
    throw new Error('Missing required parameter companyId2 when calling companiesCompanyIdNfseCertificatePut');
  }
  // verify required parameter 'body' is set
  if (!body) {
    throw new Error('Missing required parameter body when calling companiesCompanyIdNfseCertificatePut');
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
