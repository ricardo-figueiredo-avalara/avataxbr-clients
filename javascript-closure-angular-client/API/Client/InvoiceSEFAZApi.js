/**
 * @fileoverview AUTOMATICALLY GENERATED service for API.Client.InvoiceSEFAZApi.
 * Do not edit this file by hand or your changes will be lost next time it is
 * generated.
 *
 * This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts
 * Version: 1.0
 * Generated by: io.swagger.codegen.languages.JavascriptClosureAngularClientCodegen
 */
goog.provide('API.Client.InvoiceSEFAZApi');

goog.require('API.Client.Message');
goog.require('API.Client.SefazDisableRangeIn');
goog.require('API.Client.SefazInvoiceBasicStatus');
goog.require('API.Client.SefazItDeleteIn');
goog.require('API.Client.SefazItGetOut');
goog.require('API.Client.SefazItPutIn');
goog.require('API.Client.SefazPostOut');
goog.require('API.Client.TransactionForSefazGoods');
goog.require('API.Client.TransactionForSefazGoodsList');
goog.require('API.Client.ValidationError');

/**
 * @constructor
 * @param {!angular.$http} $http
 * @param {!Object} $httpParamSerializer
 * @param {!angular.$injector} $injector
 * @struct
 */
API.Client.InvoiceSEFAZApi = function($http, $httpParamSerializer, $injector) {
  /** @private {!string} */
  this.basePath_ = $injector.has('InvoiceSEFAZApiBasePath') ?
                   /** @type {!string} */ ($injector.get('InvoiceSEFAZApiBasePath')) :
                   'https://br16-dev-app03.br.avalara.com/v2';

  /** @private {!Object<string, string>} */
  this.defaultHeaders_ = $injector.has('InvoiceSEFAZApiDefaultHeaders') ?
                   /** @type {!Object<string, string>} */ (
                       $injector.get('InvoiceSEFAZApiDefaultHeaders')) :
                   {};

  /** @private {!angular.$http} */
  this.http_ = $http;

  /** @package {!Object} */
  this.httpParamSerializer = $injector.get('$httpParamSerializer');
}
API.Client.InvoiceSEFAZApi.$inject = ['$http', '$httpParamSerializer', '$injector'];

/**
 * Disable Range e-Invoice
 * Send disable range of NFes to SEFAZ 
 * @param {!string} authorization Bearer {auth}
 * @param {!SefazDisableRangeIn} body Disable Range e-Invoice
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.SefazInvoiceBasicStatus>}
 */
API.Client.InvoiceSEFAZApi.prototype.invoicesSefazDelete = function(authorization, body, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/invoices/sefaz';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'authorization' is set
  if (!authorization) {
    throw new Error('Missing required parameter authorization when calling invoicesSefazDelete');
  }
  // verify required parameter 'body' is set
  if (!body) {
    throw new Error('Missing required parameter body when calling invoicesSefazDelete');
  }
  headerParams['Authorization'] = authorization;

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'DELETE',
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
 * Cancel invoice
 * Cancel the invoice
 * @param {!string} authorization Bearer {auth}
 * @param {!string} key Invoice Key
 * @param {!SefazItDeleteIn} body Cancel Message
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.SefazInvoiceBasicStatus>}
 */
API.Client.InvoiceSEFAZApi.prototype.invoicesSefazKeyDelete = function(authorization, key, body, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/invoices/sefaz/{key}'
      .replace('{' + 'key' + '}', String(key));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'authorization' is set
  if (!authorization) {
    throw new Error('Missing required parameter authorization when calling invoicesSefazKeyDelete');
  }
  // verify required parameter 'key' is set
  if (!key) {
    throw new Error('Missing required parameter key when calling invoicesSefazKeyDelete');
  }
  // verify required parameter 'body' is set
  if (!body) {
    throw new Error('Missing required parameter body when calling invoicesSefazKeyDelete');
  }
  headerParams['Authorization'] = authorization;

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'DELETE',
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
 * Retrieve invoice
 * Retrieve the invoice
 * @param {!string} authorization Bearer {auth}
 * @param {!string} key Invoice Key
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.SefazItGetOut>}
 */
API.Client.InvoiceSEFAZApi.prototype.invoicesSefazKeyGet = function(authorization, key, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/invoices/sefaz/{key}'
      .replace('{' + 'key' + '}', String(key));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'authorization' is set
  if (!authorization) {
    throw new Error('Missing required parameter authorization when calling invoicesSefazKeyGet');
  }
  // verify required parameter 'key' is set
  if (!key) {
    throw new Error('Missing required parameter key when calling invoicesSefazKeyGet');
  }
  headerParams['Authorization'] = authorization;

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
 * Retrieve invoice
 * Retrieve the invoice
 * @param {!string} authorization Bearer {auth}
 * @param {!string} key Invoice Key
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.TransactionForSefazGoodsList>}
 */
API.Client.InvoiceSEFAZApi.prototype.invoicesSefazKeyLookupGet = function(authorization, key, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/invoices/sefaz/{key}/lookup'
      .replace('{' + 'key' + '}', String(key));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'authorization' is set
  if (!authorization) {
    throw new Error('Missing required parameter authorization when calling invoicesSefazKeyLookupGet');
  }
  // verify required parameter 'key' is set
  if (!key) {
    throw new Error('Missing required parameter key when calling invoicesSefazKeyLookupGet');
  }
  headerParams['Authorization'] = authorization;

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
 * Fix Letter
 * Fix Letter
 * @param {!string} authorization Bearer {auth}
 * @param {!string} key Invoice Key
 * @param {!SefazItPutIn} body Fix Message
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.SefazInvoiceBasicStatus>}
 */
API.Client.InvoiceSEFAZApi.prototype.invoicesSefazKeyPut = function(authorization, key, body, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/invoices/sefaz/{key}'
      .replace('{' + 'key' + '}', String(key));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'authorization' is set
  if (!authorization) {
    throw new Error('Missing required parameter authorization when calling invoicesSefazKeyPut');
  }
  // verify required parameter 'key' is set
  if (!key) {
    throw new Error('Missing required parameter key when calling invoicesSefazKeyPut');
  }
  // verify required parameter 'body' is set
  if (!body) {
    throw new Error('Missing required parameter body when calling invoicesSefazKeyPut');
  }
  headerParams['Authorization'] = authorization;

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
 * Send an e-Invoice
 * Send a invoice to SEFAZ 
 * @param {!string} authorization Bearer {auth}
 * @param {!Array<!API.Client.TransactionForSefazGoods>} body Invoices
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.SefazPostOut>}
 */
API.Client.InvoiceSEFAZApi.prototype.invoicesSefazPost = function(authorization, body, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/invoices/sefaz';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'authorization' is set
  if (!authorization) {
    throw new Error('Missing required parameter authorization when calling invoicesSefazPost');
  }
  // verify required parameter 'body' is set
  if (!body) {
    throw new Error('Missing required parameter body when calling invoicesSefazPost');
  }
  headerParams['Authorization'] = authorization;

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
 * Retrieve Status of SEFAZ Server
 * Retrieve Status of SEFAZ Server
 * @param {!string} authorization Bearer {auth}
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!string>}
 */
API.Client.InvoiceSEFAZApi.prototype.invoicesSefazStatusGet = function(authorization, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/invoices/sefaz/status';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'authorization' is set
  if (!authorization) {
    throw new Error('Missing required parameter authorization when calling invoicesSefazStatusGet');
  }
  headerParams['Authorization'] = authorization;

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