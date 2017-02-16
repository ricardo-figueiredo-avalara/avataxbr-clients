/**
 * @fileoverview AUTOMATICALLY GENERATED service for API.Client.TaxConfIBPTApi.
 * Do not edit this file by hand or your changes will be lost next time it is
 * generated.
 *
 * This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts
 * Version: 1.0
 * Generated by: io.swagger.codegen.languages.JavascriptClosureAngularClientCodegen
 */
goog.provide('API.Client.TaxConfIBPTApi');

goog.require('API.Client.IbptConf');
goog.require('API.Client.Message');
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
API.Client.TaxConfIBPTApi = function($http, $httpParamSerializer, $injector) {
  /** @private {!string} */
  this.basePath_ = $injector.has('TaxConfIBPTApiBasePath') ?
                   /** @type {!string} */ ($injector.get('TaxConfIBPTApiBasePath')) :
                   'https://br16-dev-app03.br.avalara.com/v2';

  /** @private {!Object<string, string>} */
  this.defaultHeaders_ = $injector.has('TaxConfIBPTApiDefaultHeaders') ?
                   /** @type {!Object<string, string>} */ (
                       $injector.get('TaxConfIBPTApiDefaultHeaders')) :
                   {};

  /** @private {!angular.$http} */
  this.http_ = $http;

  /** @package {!Object} */
  this.httpParamSerializer = $injector.get('$httpParamSerializer');
}
API.Client.TaxConfIBPTApi.$inject = ['$http', '$httpParamSerializer', '$injector'];

/**
 * create a new Process Type configuration
 * 
 * @param {!IbptConf} taxconfprocess The pet JSON you want to post
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.inline_response_201>}
 */
API.Client.TaxConfIBPTApi.prototype.createIbptConf = function(taxconfprocess, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/taxconf/ibpt';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'taxconfprocess' is set
  if (!taxconfprocess) {
    throw new Error('Missing required parameter taxconfprocess when calling createIbptConf');
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
 * disable a IBPT.
 * 
 * @param {!string} code IBPT Code
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.TaxConfIBPTApi.prototype.deleteIbptConf = function(code, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/taxconf/ibpt/{code}'
      .replace('{' + 'code' + '}', String(code));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'code' is set
  if (!code) {
    throw new Error('Missing required parameter code when calling deleteIbptConf');
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
 * get IBPT information.
 * This operation return Process Type configuration 
 * @param {!string} code IBPT Code
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.IbptConf>}
 */
API.Client.TaxConfIBPTApi.prototype.getIbptConf = function(code, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/taxconf/ibpt/{code}'
      .replace('{' + 'code' + '}', String(code));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'code' is set
  if (!code) {
    throw new Error('Missing required parameter code when calling getIbptConf');
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
 * retrive list of IBPT.
 * This operation return Process Type configurations that match with parameters queries 
 * @param {!string=} opt_accountId filter the configuration by accountID, if not informed, only the standard configuration will be returned 
 * @param {!API.Client.date=} opt_date When informed return valid version configuration for this date 
 * @param {!boolean=} opt_inactive return the inactive versions too 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!Array<!API.Client.IbptConf>>}
 */
API.Client.TaxConfIBPTApi.prototype.getIbptConfList = function(opt_accountId, opt_date, opt_inactive, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/taxconf/ibpt';

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
 * @param {!string} code IBPT Code
 * @param {!IbptConf} taxconfprocess The pet JSON you want to post
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.TaxConfIBPTApi.prototype.updateIbptConf = function(code, taxconfprocess, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/taxconf/ibpt/{code}'
      .replace('{' + 'code' + '}', String(code));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'code' is set
  if (!code) {
    throw new Error('Missing required parameter code when calling updateIbptConf');
  }
  // verify required parameter 'taxconfprocess' is set
  if (!taxconfprocess) {
    throw new Error('Missing required parameter taxconfprocess when calling updateIbptConf');
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