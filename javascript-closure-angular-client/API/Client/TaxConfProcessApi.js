/**
 * @fileoverview AUTOMATICALLY GENERATED service for API.Client.TaxConfProcessApi.
 * Do not edit this file by hand or your changes will be lost next time it is
 * generated.
 *
 * The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.
 * Version: 1.0
 * Generated by: io.swagger.codegen.languages.JavascriptClosureAngularClientCodegen
 */
goog.provide('API.Client.TaxConfProcessApi');

goog.require('API.Client.Message');
goog.require('API.Client.ProcessScenario');
goog.require('API.Client.ValidationError');
goog.require('API.Client.date');
goog.require('API.Client.inline_response_201');

/**
 * @constructor
 * @param {!angular.$http} $http
 * @param {!Object} $httpParamSerializer
 * @param {!angular.$injector} $injector
 * @struct
 */
API.Client.TaxConfProcessApi = function($http, $httpParamSerializer, $injector) {
  /** @private {!string} */
  this.basePath_ = $injector.has('TaxConfProcessApiBasePath') ?
                   /** @type {!string} */ ($injector.get('TaxConfProcessApiBasePath')) :
                   'http://avataxbr-sandbox.avalarabrasil.com.br/v2';

  /** @private {!Object<string, string>} */
  this.defaultHeaders_ = $injector.has('TaxConfProcessApiDefaultHeaders') ?
                   /** @type {!Object<string, string>} */ (
                       $injector.get('TaxConfProcessApiDefaultHeaders')) :
                   {};

  /** @private {!angular.$http} */
  this.http_ = $http;

  /** @package {!Object} */
  this.httpParamSerializer = $injector.get('$httpParamSerializer');
}
API.Client.TaxConfProcessApi.$inject = ['$http', '$httpParamSerializer', '$injector'];

/**
 * create a new Process Type configuration
 * 
 * @param {!ProcessScenario} taxconfprocess The pet JSON you want to post
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.inline_response_201>}
 */
API.Client.TaxConfProcessApi.prototype.createProcess = function(taxconfprocess, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/taxconf/process';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'taxconfprocess' is set
  if (!taxconfprocess) {
    throw new Error('Missing required parameter taxconfprocess when calling createProcess');
  }
  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: true,
    data: taxconfprocess,
        params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * disable a Process.
 * 
 * @param {!string} code Process Code
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.TaxConfProcessApi.prototype.deleteProcess = function(code, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/taxconf/process/{code}'
      .replace('{' + 'code' + '}', String(code));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'code' is set
  if (!code) {
    throw new Error('Missing required parameter code when calling deleteProcess');
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
 * get Process information.
 * This operation return Process Type configuration 
 * @param {!string} code Process Code
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.ProcessScenario>}
 */
API.Client.TaxConfProcessApi.prototype.getProcess = function(code, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/taxconf/process/{code}'
      .replace('{' + 'code' + '}', String(code));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'code' is set
  if (!code) {
    throw new Error('Missing required parameter code when calling getProcess');
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
 * retrive list of Process.
 * This operation return Process Type configurations that match with parameters queries 
 * @param {!string=} opt_accountId filter the configuration by accountID, if not informed, only the standard configuration will be returned 
 * @param {!API.Client.date=} opt_date When informed return valid version configuration for this date 
 * @param {!boolean=} opt_inactive return the inactive versions too 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!Array<!API.Client.ProcessScenario>>}
 */
API.Client.TaxConfProcessApi.prototype.getProcessList = function(opt_accountId, opt_date, opt_inactive, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/taxconf/process';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  if (opt_accountId !== undefined) {
    queryParameters['accountId'] = opt_accountId;
  }

  if (opt_date !== undefined) {
    queryParameters['date'] = opt_date;
  }

  if (opt_inactive !== undefined) {
    queryParameters['inactive'] = opt_inactive;
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
 * update a Process Type configuration
 * 
 * @param {!string} code Process Code
 * @param {!ProcessScenario} taxconfprocess The pet JSON you want to post
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.TaxConfProcessApi.prototype.updateProcess = function(code, taxconfprocess, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/taxconf/process/{code}'
      .replace('{' + 'code' + '}', String(code));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'code' is set
  if (!code) {
    throw new Error('Missing required parameter code when calling updateProcess');
  }
  // verify required parameter 'taxconfprocess' is set
  if (!taxconfprocess) {
    throw new Error('Missing required parameter taxconfprocess when calling updateProcess');
  }
  /** @type {!Object} */
  var httpRequestParams = {
    method: 'PUT',
    url: path,
    json: true,
    data: taxconfprocess,
        params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}
