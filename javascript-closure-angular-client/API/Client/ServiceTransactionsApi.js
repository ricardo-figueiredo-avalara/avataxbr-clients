/**
 * @fileoverview AUTOMATICALLY GENERATED service for API.Client.ServiceTransactionsApi.
 * Do not edit this file by hand or your changes will be lost next time it is
 * generated.
 *
 * This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts
 * Version: 1.0
 * Generated by: io.swagger.codegen.languages.JavascriptClosureAngularClientCodegen
 */
goog.provide('API.Client.ServiceTransactionsApi');

goog.require('API.Client.Message');
goog.require('API.Client.PaymentTransactionIn');
goog.require('API.Client.PaymentTransactionOut');
goog.require('API.Client.PurchaseTransactionIn');
goog.require('API.Client.PurchaseTransactionOut');
goog.require('API.Client.ReceiptTransactionIn');
goog.require('API.Client.ReceiptTransactionOut');
goog.require('API.Client.SalesTransactionIn');
goog.require('API.Client.SalesTransactionOut');
goog.require('API.Client.StateTransition');
goog.require('API.Client.UUID');
goog.require('API.Client.ValidationError');

/**
 * @constructor
 * @param {!angular.$http} $http
 * @param {!Object} $httpParamSerializer
 * @param {!angular.$injector} $injector
 * @struct
 */
API.Client.ServiceTransactionsApi = function($http, $httpParamSerializer, $injector) {
  /** @private {!string} */
  this.basePath_ = $injector.has('ServiceTransactionsApiBasePath') ?
                   /** @type {!string} */ ($injector.get('ServiceTransactionsApiBasePath')) :
                   'https://br16-dev-app03.br.avalara.com/v2';

  /** @private {!Object<string, string>} */
  this.defaultHeaders_ = $injector.has('ServiceTransactionsApiDefaultHeaders') ?
                   /** @type {!Object<string, string>} */ (
                       $injector.get('ServiceTransactionsApiDefaultHeaders')) :
                   {};

  /** @private {!angular.$http} */
  this.http_ = $http;

  /** @package {!Object} */
  this.httpParamSerializer = $injector.get('$httpParamSerializer');
}
API.Client.ServiceTransactionsApi.$inject = ['$http', '$httpParamSerializer', '$injector'];

/**
 * Retrieve transactions
 * Retrieve a single transaction
 * @param {!string} authorization Bearer {auth}
 * @param {!API.Client.UUID} accountId Account ID
 * @param {!string} companyCode Company Code
 * @param {!string} transactionType Transaction Type (sale, purchase, receipts or payment)
 * @param {!string} documentCode Document Code
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.ServiceTransactionsApi.prototype.transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet = function(authorization, accountId, companyCode, transactionType, documentCode, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/transactions/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode}'
      .replace('{' + 'accountId' + '}', String(accountId))
      .replace('{' + 'companyCode' + '}', String(companyCode))
      .replace('{' + 'transactionType' + '}', String(transactionType))
      .replace('{' + 'documentCode' + '}', String(documentCode));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'authorization' is set
  if (!authorization) {
    throw new Error('Missing required parameter authorization when calling transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet');
  }
  // verify required parameter 'accountId' is set
  if (!accountId) {
    throw new Error('Missing required parameter accountId when calling transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet');
  }
  // verify required parameter 'companyCode' is set
  if (!companyCode) {
    throw new Error('Missing required parameter companyCode when calling transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet');
  }
  // verify required parameter 'transactionType' is set
  if (!transactionType) {
    throw new Error('Missing required parameter transactionType when calling transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet');
  }
  // verify required parameter 'documentCode' is set
  if (!documentCode) {
    throw new Error('Missing required parameter documentCode when calling transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet');
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
 * Transaction State Transition
 * Transaction State Transition Voided  Send this event to a Recorded tax transaction record to mark it as voided.  Recorded -&gt; Voided UnVoided  Send this event to a Voided tax transaction record to mark it as recorded.  Voided -&gt; Recorded Reconciled  Send this event to a Recorded tax transaction record to indicate that it has been reconciled with client systems and to prevent it from being edited prior to filing. This is useful when a transaction will be filed and you do not want it to change again to facilitate auditing and reconciliation. Recorded -&gt; Reconciled UnReconciled  Send this event to a Reconciled tax transaction record to indicate that it has not been reconciled and may need to be edited. This is useful when a Tax transaction was erroniously put into the reconciled state.  Reconciled -&gt; Recorded Filed Send this event to a Reconciled transaction to indicate that it has been part of a tax filing by the client system. Reconciled -&gt; Filed UnFiled Send this event to a Filed transaction to indicate that it has NOT been part of a tax filing by the client system.  Filed -&gt; Reconciled FiledByAvalara  This event can only be sent by Avalara Systems. Reconciled -&gt; FiledByAvalara 
 * @param {!string} authorization Bearer {auth}
 * @param {!API.Client.UUID} accountId Account ID
 * @param {!string} companyCode Company Code
 * @param {!string} transactionType Transaction Type (sale, purchase, receipts or payment)
 * @param {!string} documentCode Document Code
 * @param {!StateTransition} body Transaction Message
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.ServiceTransactionsApi.prototype.transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost = function(authorization, accountId, companyCode, transactionType, documentCode, body, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/transactions/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode}/stateTransitions'
      .replace('{' + 'accountId' + '}', String(accountId))
      .replace('{' + 'companyCode' + '}', String(companyCode))
      .replace('{' + 'transactionType' + '}', String(transactionType))
      .replace('{' + 'documentCode' + '}', String(documentCode));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'authorization' is set
  if (!authorization) {
    throw new Error('Missing required parameter authorization when calling transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost');
  }
  // verify required parameter 'accountId' is set
  if (!accountId) {
    throw new Error('Missing required parameter accountId when calling transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost');
  }
  // verify required parameter 'companyCode' is set
  if (!companyCode) {
    throw new Error('Missing required parameter companyCode when calling transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost');
  }
  // verify required parameter 'transactionType' is set
  if (!transactionType) {
    throw new Error('Missing required parameter transactionType when calling transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost');
  }
  // verify required parameter 'documentCode' is set
  if (!documentCode) {
    throw new Error('Missing required parameter documentCode when calling transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost');
  }
  // verify required parameter 'body' is set
  if (!body) {
    throw new Error('Missing required parameter body when calling transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost');
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
 * Retrieve transactions
 * Retrieve a list of transactions
 * @param {!string} authorization Bearer {auth}
 * @param {!API.Client.UUID} accountId Account ID
 * @param {!string} companyCode Company Code
 * @param {!string} transactionType Transaction Type (sale, purchase, receipts or payment)
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.ServiceTransactionsApi.prototype.transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGet = function(authorization, accountId, companyCode, transactionType, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/transactions/account/{accountId}/company/{companyCode}/{transactionType}'
      .replace('{' + 'accountId' + '}', String(accountId))
      .replace('{' + 'companyCode' + '}', String(companyCode))
      .replace('{' + 'transactionType' + '}', String(transactionType));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'authorization' is set
  if (!authorization) {
    throw new Error('Missing required parameter authorization when calling transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGet');
  }
  // verify required parameter 'accountId' is set
  if (!accountId) {
    throw new Error('Missing required parameter accountId when calling transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGet');
  }
  // verify required parameter 'companyCode' is set
  if (!companyCode) {
    throw new Error('Missing required parameter companyCode when calling transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGet');
  }
  // verify required parameter 'transactionType' is set
  if (!transactionType) {
    throw new Error('Missing required parameter transactionType when calling transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGet');
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
 * Calculation Method
 * Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
 * @param {!string} authorization Bearer {auth}
 * @param {!PaymentTransactionIn} body Transaction Message
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.PaymentTransactionOut>}
 */
API.Client.ServiceTransactionsApi.prototype.transactionsservicePaymentPost = function(authorization, body, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/transactions?service-payment';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'authorization' is set
  if (!authorization) {
    throw new Error('Missing required parameter authorization when calling transactionsservicePaymentPost');
  }
  // verify required parameter 'body' is set
  if (!body) {
    throw new Error('Missing required parameter body when calling transactionsservicePaymentPost');
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
 * Calculation Method
 * Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
 * @param {!string} authorization Bearer {auth}
 * @param {!PurchaseTransactionIn} body Transaction Message
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.PurchaseTransactionOut>}
 */
API.Client.ServiceTransactionsApi.prototype.transactionsservicePurchasePost = function(authorization, body, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/transactions?service-purchase';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'authorization' is set
  if (!authorization) {
    throw new Error('Missing required parameter authorization when calling transactionsservicePurchasePost');
  }
  // verify required parameter 'body' is set
  if (!body) {
    throw new Error('Missing required parameter body when calling transactionsservicePurchasePost');
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
 * Calculation Method
 * Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
 * @param {!string} authorization Bearer {auth}
 * @param {!ReceiptTransactionIn} body Transaction Message
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.ReceiptTransactionOut>}
 */
API.Client.ServiceTransactionsApi.prototype.transactionsserviceReceiptPost = function(authorization, body, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/transactions?service-receipt';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'authorization' is set
  if (!authorization) {
    throw new Error('Missing required parameter authorization when calling transactionsserviceReceiptPost');
  }
  // verify required parameter 'body' is set
  if (!body) {
    throw new Error('Missing required parameter body when calling transactionsserviceReceiptPost');
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
 * Calculation Method
 * Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
 * @param {!string} authorization Bearer {auth}
 * @param {!SalesTransactionIn} body Transaction Message
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.SalesTransactionOut>}
 */
API.Client.ServiceTransactionsApi.prototype.transactionsserviceSalesPost = function(authorization, body, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/transactions?service-sales';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'authorization' is set
  if (!authorization) {
    throw new Error('Missing required parameter authorization when calling transactionsserviceSalesPost');
  }
  // verify required parameter 'body' is set
  if (!body) {
    throw new Error('Missing required parameter body when calling transactionsserviceSalesPost');
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
