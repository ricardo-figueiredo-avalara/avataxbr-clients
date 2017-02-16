/**
 * @fileoverview AUTOMATICALLY GENERATED service for API.Client.AuthApi.
 * Do not edit this file by hand or your changes will be lost next time it is
 * generated.
 *
 * This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts
 * Version: 1.0
 * Generated by: io.swagger.codegen.languages.JavascriptClosureAngularClientCodegen
 */
goog.provide('API.Client.AuthApi');

goog.require('API.Client.inline_response_200');

/**
 * @constructor
 * @param {!angular.$http} $http
 * @param {!Object} $httpParamSerializer
 * @param {!angular.$injector} $injector
 * @struct
 */
API.Client.AuthApi = function($http, $httpParamSerializer, $injector) {
  /** @private {!string} */
  this.basePath_ = $injector.has('AuthApiBasePath') ?
                   /** @type {!string} */ ($injector.get('AuthApiBasePath')) :
                   'https://br16-dev-app03.br.avalara.com/v2';

  /** @private {!Object<string, string>} */
  this.defaultHeaders_ = $injector.has('AuthApiDefaultHeaders') ?
                   /** @type {!Object<string, string>} */ (
                       $injector.get('AuthApiDefaultHeaders')) :
                   {};

  /** @private {!angular.$http} */
  this.http_ = $http;

  /** @package {!Object} */
  this.httpParamSerializer = $injector.get('$httpParamSerializer');
}
API.Client.AuthApi.$inject = ['$http', '$httpParamSerializer', '$injector'];

/**
 * authorization
 * Authorization: Basic VGVzdDoxMjM&#x3D;  Generate Base64:  - auth &#x3D; \&quot;{user}:{password}\&quot;  - base &#x3D; base64(auth)  - header[\&quot;Authorization\&quot;] &#x3D; \&quot;Basic \&quot; + base 
 * @param {!string} authorization Authorization: Basic VGVzdDoxMjM&#x3D; 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.inline_response_200>}
 */
API.Client.AuthApi.prototype.authPost = function(authorization, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/auth';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'authorization' is set
  if (!authorization) {
    throw new Error('Missing required parameter authorization when calling authPost');
  }
  headerParams['Authorization'] = authorization;

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
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