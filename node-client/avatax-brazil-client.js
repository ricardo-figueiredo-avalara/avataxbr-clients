/*jshint -W069 */
/**
 * The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.
 * @class AvaTaxBR
 * @param {(string|object)} [domainOrOptions] - The project domain or options object. If object, see the object's optional properties.
 * @param {string} [domainOrOptions.domain] - The project domain
 * @param {object} [domainOrOptions.token] - auth token - object with value property and optional headerOrQueryName and isQuery properties
 */
var AvaTaxBR = (function() {
    'use strict';

    var request = require('request');
    var Q = require('q');

    function AvaTaxBR(options) {
        var domain = (typeof options === 'object') ? options.domain : options;
        this.domain = domain ? domain : 'http://avataxbr-sandbox.avalarabrasil.com.br/v2';
        if (this.domain.length === 0) {
            throw new Error('Domain parameter must be specified as a string.');
        }
    }

    AvaTaxBR.prototype.request = function(method, url, parameters, body, headers, queryParameters, form, deferred) {
        var req = {
            method: method,
            uri: url,
            qs: queryParameters,
            headers: headers,
            body: body
        };
        if (Object.keys(form).length > 0) {
            req.form = form;
        }
        if (typeof(body) === 'object' && !(body instanceof Buffer)) {
            req.json = true;
        }
        request(req, function(error, response, body) {
            if (error) {
                deferred.reject(error);
            } else {
                if (/^application\/(.*\\+)?json/.test(response.headers['content-type'])) {
                    try {
                        body = JSON.parse(body);
                    } catch (e) {}
                }
                if (response.statusCode === 204) {
                    deferred.resolve({
                        response: response
                    });
                } else if (response.statusCode >= 200 && response.statusCode <= 299) {
                    deferred.resolve({
                        response: response,
                        body: body
                    });
                } else {
                    deferred.reject({
                        response: response,
                        body: body
                    });
                }
            }
        });
    };

    /**
     * Authorization: Basic VGVzdDoxMjM=

    Generate Base64:

    - auth = "{user}:{password}"

    - base = base64(auth)

    - header["Authorization"] = "Basic " + base

     * @method
     * @name AvaTaxBR#getAuthorization
     * @param {string} authorization - Accepts "Basic + hash", where hash is {user}:{password} base64 encoded.

     * 
     */
    AvaTaxBR.prototype.getAuthorization = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/v2/auth';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('POST', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Authorization: Basic VGVzdDoxMjM=

    Generate Base64:

    - auth = "{user}:{password}"

    - base = base64(auth)

    - header["Authorization"] = "Basic " + base

     * @method
     * @name AvaTaxBR#getAuthorization2
     * @param {string} authorization - Accepts "Basic + hash", where hash is {user}:{password} base64 encoded.

     * 
     */
    AvaTaxBR.prototype.getAuthorization2 = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/auth';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('POST', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Retrieve list companies of one account
     * @method
     * @name AvaTaxBR#getCompaniesList
     * @param {string} authorization - Bearer {auth}
     * @param {string} accountId - Account ID
     * 
     */
    AvaTaxBR.prototype.getCompaniesList = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/accounts/{accountId}/companies';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{accountId}', parameters['accountId']);

        if (parameters['accountId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: accountId'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This method operation create a company for a account

     * @method
     * @name AvaTaxBR#createAccountCompany
     * @param {} body - Company Code
     * @param {string} authorization - Bearer {auth}
     * @param {string} accountId - Account ID
     * 
     */
    AvaTaxBR.prototype.createAccountCompany = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/accounts/{accountId}/companies';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['body'] !== undefined) {
            body = parameters['body'];
        }

        if (parameters['body'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: body'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{accountId}', parameters['accountId']);

        if (parameters['accountId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: accountId'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('POST', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Delete relation Account x company
     * @method
     * @name AvaTaxBR#deleteAccountCompany
     * @param {string} authorization - Bearer {auth}
     * @param {string} accountId - Account ID
     * @param {string} companyId - Company ID
     * 
     */
    AvaTaxBR.prototype.deleteAccountCompany = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/accounts/{accountId}/companies/{companyId}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{accountId}', parameters['accountId']);

        if (parameters['accountId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: accountId'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('DELETE', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This operation return address
     * @method
     * @name AvaTaxBR#getZipCode
     * @param {string} zipcode - ZIP Code
     * @param {string} authorization - Bearer {auth}
     * 
     */
    AvaTaxBR.prototype.getZipCode = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/addresses/{zipcode}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        path = path.replace('{zipcode}', parameters['zipcode']);

        if (parameters['zipcode'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: zipcode'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This operation return agast configurations that match with parameters queries

     * @method
     * @name AvaTaxBR#getAgastList
     * @param {string} text - Text query
     * @param {string} authorization - Bearer {auth}
     * 
     */
    AvaTaxBR.prototype.getAgastList = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/agasts';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        if (parameters['text'] !== undefined) {
            queryParameters['text'] = parameters['text'];
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This method operation create a AGAST

     * @method
     * @name AvaTaxBR#createAgast
     * @param {} body - Transaction Message
     * @param {string} authorization - Bearer {auth}
     * 
     */
    AvaTaxBR.prototype.createAgast = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/agasts';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['body'] !== undefined) {
            body = parameters['body'];
        }

        if (parameters['body'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: body'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('POST', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This operation return agast configurations that match with parameters queries

     * @method
     * @name AvaTaxBR#getAgast
     * @param {string} authorization - Bearer {auth}
     * @param {string} code - Agast Code
     * 
     */
    AvaTaxBR.prototype.getAgast = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/agasts/{code}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{code}', parameters['code']);

        if (parameters['code'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: code'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This method operation create a agast

     * @method
     * @name AvaTaxBR#updateAgast
     * @param {} body - Transaction Message
     * @param {string} authorization - Bearer {auth}
     * @param {string} code - Agast Code
     * 
     */
    AvaTaxBR.prototype.updateAgast = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/agasts/{code}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['body'] !== undefined) {
            body = parameters['body'];
        }

        if (parameters['body'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: body'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{code}', parameters['code']);

        if (parameters['code'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: code'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('PUT', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Delete Agast
     * @method
     * @name AvaTaxBR#deleteAgast
     * @param {string} authorization - Bearer {auth}
     * @param {string} code - Agast Code
     * 
     */
    AvaTaxBR.prototype.deleteAgast = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/agasts/{code}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{code}', parameters['code']);

        if (parameters['code'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: code'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('DELETE', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This method has more the one operation model,
    (a) simple calculation, this mode has a minimal validation and mandatory field, only enough for calc;
    (b) full calculation, simulation, this mode the system will check all atributes and calc all taxes for that transaction;
    (c) full calculation, starting process to transform this this request into transaction (for NFe, NFCe, CT-e need government authorization);
    (d) ASIS, the sistem receive the message, store and try get authorization, model valid only form NFe, NFCe and CT-e.

     * @method
     * @name AvaTaxBR#calculationGood
     * @param {} body - Transaction Message
     * @param {string} noPersist - Do not save this calculation
     * @param {string} authorization - Bearer {auth}
     * 
     */
    AvaTaxBR.prototype.calculationGood = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/calculations?goods';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['body'] !== undefined) {
            body = parameters['body'];
        }

        if (parameters['body'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: body'));
            return deferred.promise;
        }

        if (parameters['noPersist'] !== undefined) {
            queryParameters['noPersist'] = parameters['noPersist'];
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('POST', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned. Accept all transactions type (Sale, Purchase, Payment and Receipt), the format and message type are desbribed above in each 'calculations-<type>'.
     * @method
     * @name AvaTaxBR#calculationServiceSales
     * @param {} body - Transaction Message
     * @param {string} noPersist - Do not save this calculation
     * @param {string} authorization - Bearer {auth}
     * 
     */
    AvaTaxBR.prototype.calculationServiceSales = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/calculations?service-sales';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['body'] !== undefined) {
            body = parameters['body'];
        }

        if (parameters['body'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: body'));
            return deferred.promise;
        }

        if (parameters['noPersist'] !== undefined) {
            queryParameters['noPersist'] = parameters['noPersist'];
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('POST', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
     * @method
     * @name AvaTaxBR#calculationServicePurchase
     * @param {} body - Transaction Message
     * @param {string} noPersist - Do not save this calculation
     * @param {string} authorization - Bearer {auth}
     * 
     */
    AvaTaxBR.prototype.calculationServicePurchase = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/calculations?service-purchase';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['body'] !== undefined) {
            body = parameters['body'];
        }

        if (parameters['body'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: body'));
            return deferred.promise;
        }

        if (parameters['noPersist'] !== undefined) {
            queryParameters['noPersist'] = parameters['noPersist'];
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('POST', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
     * @method
     * @name AvaTaxBR#calculationServicePayment
     * @param {} body - Transaction Message
     * @param {string} noPersist - Do not save this calculation
     * @param {string} authorization - Bearer {auth}
     * 
     */
    AvaTaxBR.prototype.calculationServicePayment = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/calculations?service-payment';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['body'] !== undefined) {
            body = parameters['body'];
        }

        if (parameters['body'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: body'));
            return deferred.promise;
        }

        if (parameters['noPersist'] !== undefined) {
            queryParameters['noPersist'] = parameters['noPersist'];
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('POST', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
     * @method
     * @name AvaTaxBR#calculationServiceReceipt
     * @param {} body - Transaction Message
     * @param {string} noPersist - Do not save this calculation
     * @param {string} authorization - Bearer {auth}
     * 
     */
    AvaTaxBR.prototype.calculationServiceReceipt = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/calculations?service-receipt';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['body'] !== undefined) {
            body = parameters['body'];
        }

        if (parameters['body'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: body'));
            return deferred.promise;
        }

        if (parameters['noPersist'] !== undefined) {
            queryParameters['noPersist'] = parameters['noPersist'];
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('POST', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Retrieve a list of transactions
     * @method
     * @name AvaTaxBR#retrieveGoodsTransactions
     * @param {string} authorization - Bearer {auth}
     * @param {string} transactionType - Transaction Type
     * 
     */
    AvaTaxBR.prototype.retrieveGoodsTransactions = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/calculations/goods/{transactionType}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{transactionType}', parameters['transactionType']);

        if (parameters['transactionType'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: transactionType'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Retrieve a single transaction
     * @method
     * @name AvaTaxBR#retrieveGoodsTransactionDocument
     * @param {string} authorization - Bearer {auth}
     * @param {string} transactionType - Transaction Type
     * @param {string} documentCode - Document Code
     * 
     */
    AvaTaxBR.prototype.retrieveGoodsTransactionDocument = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/calculations/goods/{transactionType}/{documentCode}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{transactionType}', parameters['transactionType']);

        if (parameters['transactionType'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: transactionType'));
            return deferred.promise;
        }

        path = path.replace('{documentCode}', parameters['documentCode']);

        if (parameters['documentCode'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: documentCode'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Retrieve a list of transactions
     * @method
     * @name AvaTaxBR#retrieveServiceTransactions
     * @param {string} authorization - Bearer {auth}
     * @param {string} transactionType - Transaction Type (sale, purchase, receipts or payment)
     * 
     */
    AvaTaxBR.prototype.retrieveServiceTransactions = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/calculations/service/{transactionType}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{transactionType}', parameters['transactionType']);

        if (parameters['transactionType'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: transactionType'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Retrieve a single transaction
     * @method
     * @name AvaTaxBR#retrieveServiceTransactionDocument
     * @param {string} authorization - Bearer {auth}
     * @param {string} transactionType - Transaction Type (sale, purchase, receipts or payment)
     * @param {string} documentCode - Document Code
     * 
     */
    AvaTaxBR.prototype.retrieveServiceTransactionDocument = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/calculations/service/{transactionType}/{documentCode}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{transactionType}', parameters['transactionType']);

        if (parameters['transactionType'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: transactionType'));
            return deferred.promise;
        }

        path = path.replace('{documentCode}', parameters['documentCode']);

        if (parameters['documentCode'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: documentCode'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Promote a calculation to transaction
     * @method
     * @name AvaTaxBR#convertServiceCalculatioToTransaction
     * @param {string} authorization - Bearer {auth}
     * @param {string} transactionType - Transaction Type (sale, purchase, receipts or payment)
     * @param {string} documentCode - Document Code
     * 
     */
    AvaTaxBR.prototype.convertServiceCalculatioToTransaction = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/calculations/service/{transactionType}/{documentCode}/transactions';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{transactionType}', parameters['transactionType']);

        if (parameters['transactionType'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: transactionType'));
            return deferred.promise;
        }

        path = path.replace('{documentCode}', parameters['documentCode']);

        if (parameters['documentCode'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: documentCode'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('POST', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Retrieve list companies of one account
     * @method
     * @name AvaTaxBR#getCompaniesList
     * @param {string} authorization - Bearer {auth}
     * 
     */
    AvaTaxBR.prototype.getCompaniesList = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This method operation create a company for a account

     * @method
     * @name AvaTaxBR#createCompany
     * @param {} body - Transaction Message
     * @param {string} authorization - Bearer {auth}
     * 
     */
    AvaTaxBR.prototype.createCompany = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['body'] !== undefined) {
            body = parameters['body'];
        }

        if (parameters['body'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: body'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('POST', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This method operation get a company for a account

     * @method
     * @name AvaTaxBR#infoCompany
     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * 
     */
    AvaTaxBR.prototype.infoCompany = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This method operation create a company for a account

     * @method
     * @name AvaTaxBR#updateCompany
     * @param {} body - Transaction Message
     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * 
     */
    AvaTaxBR.prototype.updateCompany = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['body'] !== undefined) {
            body = parameters['body'];
        }

        if (parameters['body'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: body'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('PUT', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Delete Company
     * @method
     * @name AvaTaxBR#deleteCompany
     * @param {string} companyId - Company ID
     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * 
     */
    AvaTaxBR.prototype.deleteCompany = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('DELETE', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This operation return all locations

     * @method
     * @name AvaTaxBR#getCompanyLocationsList
     * @param {integer} xPaginationLimit - The per page limit. Currently set to 10 but subject to change at any time (max 100).
     * @param {integer} xPaginationCurrentPage - The current page. Defaults to 1.
     * @param {string} xPaginationSort - The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.
     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * 
     */
    AvaTaxBR.prototype.getCompanyLocationsList = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}/locations';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        if (parameters['xPaginationLimit'] !== undefined) {
            headers['X-Pagination-Limit'] = parameters['xPaginationLimit'];
        }

        if (parameters['xPaginationCurrentPage'] !== undefined) {
            headers['X-Pagination-Current-Page'] = parameters['xPaginationCurrentPage'];
        }

        if (parameters['xPaginationSort'] !== undefined) {
            headers['X-Pagination-Sort'] = parameters['xPaginationSort'];
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This method operation create a new location for company

     * @method
     * @name AvaTaxBR#createLocation
     * @param {} body - Transaction Message
     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * 
     */
    AvaTaxBR.prototype.createLocation = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}/locations';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['body'] !== undefined) {
            body = parameters['body'];
        }

        if (parameters['body'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: body'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('POST', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This operation return location

     * @method
     * @name AvaTaxBR#getCompanyLocation
     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * @param {string} code - Location Code
     * 
     */
    AvaTaxBR.prototype.getCompanyLocation = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}/locations/{code}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        path = path.replace('{code}', parameters['code']);

        if (parameters['code'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: code'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This method operation update a location for company

     * @method
     * @name AvaTaxBR#updateLocation
     * @param {} body - Transaction Message
     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * @param {string} code - Location Code
     * 
     */
    AvaTaxBR.prototype.updateLocation = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}/locations/{code}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['body'] !== undefined) {
            body = parameters['body'];
        }

        if (parameters['body'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: body'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        path = path.replace('{code}', parameters['code']);

        if (parameters['code'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: code'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('PUT', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Delete location
     * @method
     * @name AvaTaxBR#deleteLocation
     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * @param {string} code - Location Code
     * 
     */
    AvaTaxBR.prototype.deleteLocation = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}/locations/{code}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        path = path.replace('{code}', parameters['code']);

        if (parameters['code'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: code'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('DELETE', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This operation return custom agast configurations that match with parameters queries

     * @method
     * @name AvaTaxBR#getCompanyAgastList
     * @param {integer} xPaginationLimit - The per page limit. Currently set to 10 but subject to change at any time (max 100).
     * @param {integer} xPaginationCurrentPage - The current page. Defaults to 1.
     * @param {string} xPaginationSort - The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.
     * @param {string} agast - Custom Agast Code
     * @param {string} parent - Agast Code
     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * @param {string} text - Text query
     * 
     */
    AvaTaxBR.prototype.getCompanyAgastList = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}/agasts';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        if (parameters['xPaginationLimit'] !== undefined) {
            headers['X-Pagination-Limit'] = parameters['xPaginationLimit'];
        }

        if (parameters['xPaginationCurrentPage'] !== undefined) {
            headers['X-Pagination-Current-Page'] = parameters['xPaginationCurrentPage'];
        }

        if (parameters['xPaginationSort'] !== undefined) {
            headers['X-Pagination-Sort'] = parameters['xPaginationSort'];
        }

        if (parameters['agast'] !== undefined) {
            queryParameters['agast'] = parameters['agast'];
        }

        if (parameters['parent'] !== undefined) {
            queryParameters['parent'] = parameters['parent'];
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        if (parameters['text'] !== undefined) {
            queryParameters['text'] = parameters['text'];
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This method operation create a custom agast for one company

     * @method
     * @name AvaTaxBR#createCustomAgast
     * @param {} body - Transaction Message
     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * @param {string} text - Text query
     * 
     */
    AvaTaxBR.prototype.createCustomAgast = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}/agasts';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['body'] !== undefined) {
            body = parameters['body'];
        }

        if (parameters['body'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: body'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        if (parameters['text'] !== undefined) {
            queryParameters['text'] = parameters['text'];
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('POST', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This operation return custom agast configurations that match with parameters queries - Alannes.

     * @method
     * @name AvaTaxBR#getCompanyAgast
     * @param {string} parent - Agast parent code, means that this agast is a specialization of parent agast

     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * @param {string} code - Agast Code
     * 
     */
    AvaTaxBR.prototype.getCompanyAgast = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}/agasts/{code}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        if (parameters['parent'] !== undefined) {
            queryParameters['parent'] = parameters['parent'];
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        path = path.replace('{code}', parameters['code']);

        if (parameters['code'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: code'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This method operation create a custom agast for one company

     * @method
     * @name AvaTaxBR#updateCustomAgast
     * @param {} body - Transaction Message
     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * @param {string} code - Agast Code
     * 
     */
    AvaTaxBR.prototype.updateCustomAgast = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}/agasts/{code}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['body'] !== undefined) {
            body = parameters['body'];
        }

        if (parameters['body'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: body'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        path = path.replace('{code}', parameters['code']);

        if (parameters['code'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: code'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('PUT', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Delete Custom Agast
     * @method
     * @name AvaTaxBR#deleteCustomAgast
     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * @param {string} code - Agast Code
     * 
     */
    AvaTaxBR.prototype.deleteCustomAgast = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}/agasts/{code}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        path = path.replace('{code}', parameters['code']);

        if (parameters['code'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: code'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('DELETE', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This operation return custom agast configurations that match with parameters queries

     * @method
     * @name AvaTaxBR#getCompanyTaxRatesList
     * @param {integer} xPaginationLimit - The per page limit. Currently set to 10 but subject to change at any time (max 100).
     * @param {integer} xPaginationCurrentPage - The current page. Defaults to 1.
     * @param {string} xPaginationSort - The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.
     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * 
     */
    AvaTaxBR.prototype.getCompanyTaxRatesList = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}/taxrates';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        if (parameters['xPaginationLimit'] !== undefined) {
            headers['X-Pagination-Limit'] = parameters['xPaginationLimit'];
        }

        if (parameters['xPaginationCurrentPage'] !== undefined) {
            headers['X-Pagination-Current-Page'] = parameters['xPaginationCurrentPage'];
        }

        if (parameters['xPaginationSort'] !== undefined) {
            headers['X-Pagination-Sort'] = parameters['xPaginationSort'];
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This method operation create a custom agast for one company

     * @method
     * @name AvaTaxBR#createCustomTaxes
     * @param {} body - Transaction Message
     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * 
     */
    AvaTaxBR.prototype.createCustomTaxes = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}/taxrates';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['body'] !== undefined) {
            body = parameters['body'];
        }

        if (parameters['body'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: body'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('POST', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This operation return custom agast configurations that match with parameters queries

     * @method
     * @name AvaTaxBR#getCompanyCustomTax
     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * @param {string} taxType - Tax Type
     * 
     */
    AvaTaxBR.prototype.getCompanyCustomTax = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}/taxrates/{taxType}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        path = path.replace('{taxType}', parameters['taxType']);

        if (parameters['taxType'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: taxType'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This method operation create a custom agast for one company

     * @method
     * @name AvaTaxBR#updateCustomTaxes
     * @param {} body - Transaction Message
     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * @param {string} taxType - Tax Type
     * 
     */
    AvaTaxBR.prototype.updateCustomTaxes = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}/taxrates/{taxType}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['body'] !== undefined) {
            body = parameters['body'];
        }

        if (parameters['body'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: body'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        path = path.replace('{taxType}', parameters['taxType']);

        if (parameters['taxType'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: taxType'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('PUT', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Delete Custom Tax
     * @method
     * @name AvaTaxBR#deleteCustomTaxes
     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * @param {string} taxType - Tax Type
     * 
     */
    AvaTaxBR.prototype.deleteCustomTaxes = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}/taxrates/{taxType}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        path = path.replace('{taxType}', parameters['taxType']);

        if (parameters['taxType'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: taxType'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('DELETE', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This operation return custom agast configurations that match with parameters queries

     * @method
     * @name AvaTaxBR#getCompanyItemsGoodsList
     * @param {integer} xPaginationLimit - The per page limit. Currently set to 10 but subject to change at any time (max 100).
     * @param {integer} xPaginationCurrentPage - The current page. Defaults to 1.
     * @param {string} xPaginationSort - The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.
     * @param {string} code - Item Code
     * @param {string} agast - Custom Agast Code
     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * @param {string} avalaraProductType - Avalara Product Type
     * 
     */
    AvaTaxBR.prototype.getCompanyItemsGoodsList = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}/items?goods';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        if (parameters['xPaginationLimit'] !== undefined) {
            headers['X-Pagination-Limit'] = parameters['xPaginationLimit'];
        }

        if (parameters['xPaginationCurrentPage'] !== undefined) {
            headers['X-Pagination-Current-Page'] = parameters['xPaginationCurrentPage'];
        }

        if (parameters['xPaginationSort'] !== undefined) {
            headers['X-Pagination-Sort'] = parameters['xPaginationSort'];
        }

        if (parameters['code'] !== undefined) {
            queryParameters['code'] = parameters['code'];
        }

        if (parameters['agast'] !== undefined) {
            queryParameters['agast'] = parameters['agast'];
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        if (parameters['avalaraProductType'] !== undefined) {
            headers['Avalara-Product-Type'] = parameters['avalaraProductType'];
        }

        if (parameters['avalaraProductType'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: avalaraProductType'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This method operation create a custom agast for one company

     * @method
     * @name AvaTaxBR#createItem
     * @param {} body - Transaction Message
     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * @param {string} avalaraProductType - Avalara Product Type
     * 
     */
    AvaTaxBR.prototype.createItem = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}/items?goods';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['body'] !== undefined) {
            body = parameters['body'];
        }

        if (parameters['body'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: body'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        if (parameters['avalaraProductType'] !== undefined) {
            headers['Avalara-Product-Type'] = parameters['avalaraProductType'];
        }

        if (parameters['avalaraProductType'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: avalaraProductType'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('POST', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Change the code of a given item.

     * @method
     * @name AvaTaxBR#companyItemsChangeCode
     * @param {} body - Requisition
     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * @param {string} code - Item Code
     * @param {string} goods - Provide to apply to goods items.
     * @param {string} service - Provide to apply to service items.
     * 
     */
    AvaTaxBR.prototype.companyItemsChangeCode = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}/items/{code}/change-code';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['body'] !== undefined) {
            body = parameters['body'];
        }

        if (parameters['body'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: body'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        path = path.replace('{code}', parameters['code']);

        if (parameters['code'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: code'));
            return deferred.promise;
        }

        if (parameters['goods'] !== undefined) {
            queryParameters['goods'] = parameters['goods'];
        }

        if (parameters['service'] !== undefined) {
            queryParameters['service'] = parameters['service'];
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('PUT', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This operation return custom agast configurations that match with parameters queries

     * @method
     * @name AvaTaxBR#getCompanyItemsGoods
     * @param {string} agast - Custom Agast Code
     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * @param {string} code - Item Code
     * @param {string} avalaraProductType - Avalara Product Type
     * 
     */
    AvaTaxBR.prototype.getCompanyItemsGoods = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}/items/{code}?goods';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        if (parameters['agast'] !== undefined) {
            queryParameters['agast'] = parameters['agast'];
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        path = path.replace('{code}', parameters['code']);

        if (parameters['code'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: code'));
            return deferred.promise;
        }

        if (parameters['avalaraProductType'] !== undefined) {
            headers['Avalara-Product-Type'] = parameters['avalaraProductType'];
        }

        if (parameters['avalaraProductType'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: avalaraProductType'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This method operation create a custom agast for one company

     * @method
     * @name AvaTaxBR#updateItem
     * @param {} body - Transaction Message
     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * @param {string} code - Item Code
     * @param {string} avalaraProductType - Avalara Product Type
     * 
     */
    AvaTaxBR.prototype.updateItem = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}/items/{code}?goods';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['body'] !== undefined) {
            body = parameters['body'];
        }

        if (parameters['body'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: body'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        path = path.replace('{code}', parameters['code']);

        if (parameters['code'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: code'));
            return deferred.promise;
        }

        if (parameters['avalaraProductType'] !== undefined) {
            headers['Avalara-Product-Type'] = parameters['avalaraProductType'];
        }

        if (parameters['avalaraProductType'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: avalaraProductType'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('PUT', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Delete Item
     * @method
     * @name AvaTaxBR#deleteItem
     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * @param {string} code - Item Code
     * @param {string} avalaraProductType - Avalara Product Type
     * 
     */
    AvaTaxBR.prototype.deleteItem = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}/items/{code}?goods';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        path = path.replace('{code}', parameters['code']);

        if (parameters['code'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: code'));
            return deferred.promise;
        }

        if (parameters['avalaraProductType'] !== undefined) {
            headers['Avalara-Product-Type'] = parameters['avalaraProductType'];
        }

        if (parameters['avalaraProductType'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: avalaraProductType'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('DELETE', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This operation return custom agast configurations that match with parameters queries

     * @method
     * @name AvaTaxBR#getCompanyItemsServiceList
     * @param {integer} xPaginationLimit - The per page limit. Currently set to 10 but subject to change at any time (max 100).
     * @param {integer} xPaginationCurrentPage - The current page. Defaults to 1.
     * @param {string} xPaginationSort - The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.
     * @param {string} code - Item Code
     * @param {string} agast - Custom Agast Code
     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * @param {string} avalaraProductType - Avalara Product Type
     * 
     */
    AvaTaxBR.prototype.getCompanyItemsServiceList = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}/items?service';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        if (parameters['xPaginationLimit'] !== undefined) {
            headers['X-Pagination-Limit'] = parameters['xPaginationLimit'];
        }

        if (parameters['xPaginationCurrentPage'] !== undefined) {
            headers['X-Pagination-Current-Page'] = parameters['xPaginationCurrentPage'];
        }

        if (parameters['xPaginationSort'] !== undefined) {
            headers['X-Pagination-Sort'] = parameters['xPaginationSort'];
        }

        if (parameters['code'] !== undefined) {
            queryParameters['code'] = parameters['code'];
        }

        if (parameters['agast'] !== undefined) {
            queryParameters['agast'] = parameters['agast'];
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        if (parameters['avalaraProductType'] !== undefined) {
            headers['Avalara-Product-Type'] = parameters['avalaraProductType'];
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This method operation create a custom agast for one company

     * @method
     * @name AvaTaxBR#createItemService
     * @param {} body - Transaction Message
     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * @param {string} avalaraProductType - Avalara Product Type
     * 
     */
    AvaTaxBR.prototype.createItemService = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}/items?service';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['body'] !== undefined) {
            body = parameters['body'];
        }

        if (parameters['body'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: body'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        if (parameters['avalaraProductType'] !== undefined) {
            headers['Avalara-Product-Type'] = parameters['avalaraProductType'];
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('POST', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This operation return custom agast configurations that match with parameters queries

     * @method
     * @name AvaTaxBR#getCompanyItemsService
     * @param {string} agast - Custom Agast Code
     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * @param {string} code - Item Code
     * @param {string} avalaraProductType - Avalara Product Type
     * 
     */
    AvaTaxBR.prototype.getCompanyItemsService = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}/items/{code}?service';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        if (parameters['agast'] !== undefined) {
            queryParameters['agast'] = parameters['agast'];
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        path = path.replace('{code}', parameters['code']);

        if (parameters['code'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: code'));
            return deferred.promise;
        }

        if (parameters['avalaraProductType'] !== undefined) {
            headers['Avalara-Product-Type'] = parameters['avalaraProductType'];
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This method operation create a custom agast for one company

     * @method
     * @name AvaTaxBR#updateItemService
     * @param {} body - Transaction Message
     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * @param {string} code - Item Code
     * @param {string} avalaraProductType - Avalara Product Type
     * 
     */
    AvaTaxBR.prototype.updateItemService = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}/items/{code}?service';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['body'] !== undefined) {
            body = parameters['body'];
        }

        if (parameters['body'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: body'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        path = path.replace('{code}', parameters['code']);

        if (parameters['code'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: code'));
            return deferred.promise;
        }

        if (parameters['avalaraProductType'] !== undefined) {
            headers['Avalara-Product-Type'] = parameters['avalaraProductType'];
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('PUT', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Delete Item - Service
     * @method
     * @name AvaTaxBR#deleteItemService
     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * @param {string} code - Item Code
     * @param {string} avalaraProductType - Avalara Product Type
     * 
     */
    AvaTaxBR.prototype.deleteItemService = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}/items/{code}?service';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        path = path.replace('{code}', parameters['code']);

        if (parameters['code'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: code'));
            return deferred.promise;
        }

        if (parameters['avalaraProductType'] !== undefined) {
            headers['Avalara-Product-Type'] = parameters['avalaraProductType'];
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('DELETE', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This operation return custom agast configurations that match with parameters queries

     * @method
     * @name AvaTaxBR#getCompanyCpomList
     * @param {integer} xPaginationLimit - The per page limit. Currently set to 10 but subject to change at any time (max 100).
     * @param {integer} xPaginationCurrentPage - The current page. Defaults to 1.
     * @param {string} xPaginationSort - The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.
     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * @param {string} code - Item Code
     * 
     */
    AvaTaxBR.prototype.getCompanyCpomList = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}/items/{code}/cpom';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        if (parameters['xPaginationLimit'] !== undefined) {
            headers['X-Pagination-Limit'] = parameters['xPaginationLimit'];
        }

        if (parameters['xPaginationCurrentPage'] !== undefined) {
            headers['X-Pagination-Current-Page'] = parameters['xPaginationCurrentPage'];
        }

        if (parameters['xPaginationSort'] !== undefined) {
            headers['X-Pagination-Sort'] = parameters['xPaginationSort'];
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        path = path.replace('{code}', parameters['code']);

        if (parameters['code'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: code'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This method operation create a custom agast for one company

     * @method
     * @name AvaTaxBR#createItemCPOM
     * @param {} body - Transaction Message
     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * @param {string} code - Item Code
     * 
     */
    AvaTaxBR.prototype.createItemCPOM = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}/items/{code}/cpom';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['body'] !== undefined) {
            body = parameters['body'];
        }

        if (parameters['body'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: body'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        path = path.replace('{code}', parameters['code']);

        if (parameters['code'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: code'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('POST', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This operation return custom agast configurations that match with parameters queries

     * @method
     * @name AvaTaxBR#getCompanyCpomCity
     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * @param {string} code - Item Code
     * @param {number} cityCode - City Code
     * 
     */
    AvaTaxBR.prototype.getCompanyCpomCity = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}/items/{code}/cpom/{cityCode}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        path = path.replace('{code}', parameters['code']);

        if (parameters['code'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: code'));
            return deferred.promise;
        }

        path = path.replace('{cityCode}', parameters['cityCode']);

        if (parameters['cityCode'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: cityCode'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This method operation create a custom agast for one company

     * @method
     * @name AvaTaxBR#updateItemCPOM
     * @param {} body - Transaction Message
     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * @param {string} code - Item Code
     * @param {number} cityCode - City Code
     * 
     */
    AvaTaxBR.prototype.updateItemCPOM = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}/items/{code}/cpom/{cityCode}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['body'] !== undefined) {
            body = parameters['body'];
        }

        if (parameters['body'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: body'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        path = path.replace('{code}', parameters['code']);

        if (parameters['code'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: code'));
            return deferred.promise;
        }

        path = path.replace('{cityCode}', parameters['cityCode']);

        if (parameters['cityCode'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: cityCode'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('PUT', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Delete item CPOM
     * @method
     * @name AvaTaxBR#deleteItemCPOM
     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * @param {string} code - Item Code
     * @param {number} cityCode - City Code
     * 
     */
    AvaTaxBR.prototype.deleteItemCPOM = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}/items/{code}/cpom/{cityCode}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        path = path.replace('{code}', parameters['code']);

        if (parameters['code'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: code'));
            return deferred.promise;
        }

        path = path.replace('{cityCode}', parameters['cityCode']);

        if (parameters['cityCode'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: cityCode'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('DELETE', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This operation return custom ICMS configurations that match with parameters queries

     * @method
     * @name AvaTaxBR#getCompanyICMSList
     * @param {integer} xPaginationLimit - The per page limit. Currently set to 10 but subject to change at any time (max 100).
     * @param {integer} xPaginationCurrentPage - The current page. Defaults to 1.
     * @param {string} xPaginationSort - The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.
     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * 
     */
    AvaTaxBR.prototype.getCompanyICMSList = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}/icms';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        if (parameters['xPaginationLimit'] !== undefined) {
            headers['X-Pagination-Limit'] = parameters['xPaginationLimit'];
        }

        if (parameters['xPaginationCurrentPage'] !== undefined) {
            headers['X-Pagination-Current-Page'] = parameters['xPaginationCurrentPage'];
        }

        if (parameters['xPaginationSort'] !== undefined) {
            headers['X-Pagination-Sort'] = parameters['xPaginationSort'];
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This method operation create a custom agast for one company

     * @method
     * @name AvaTaxBR#createICMS
     * @param {} body - Transaction Message
     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * 
     */
    AvaTaxBR.prototype.createICMS = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}/icms';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['body'] !== undefined) {
            body = parameters['body'];
        }

        if (parameters['body'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: body'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('POST', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This operation return custom ICMS configurations that match with parameters queries

     * @method
     * @name AvaTaxBR#getCompanyICMS
     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * @param {string} state - Brazilian State
     * 
     */
    AvaTaxBR.prototype.getCompanyICMS = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}/icms/{state}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        path = path.replace('{state}', parameters['state']);

        if (parameters['state'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: state'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This method operation update a custom ICMS tax for one company

     * @method
     * @name AvaTaxBR#updateCustomIcmsConfByState
     * @param {} body - Transaction Message
     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * @param {string} state - Brazilian State
     * 
     */
    AvaTaxBR.prototype.updateCustomIcmsConfByState = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}/icms/{state}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['body'] !== undefined) {
            body = parameters['body'];
        }

        if (parameters['body'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: body'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        path = path.replace('{state}', parameters['state']);

        if (parameters['state'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: state'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('PUT', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Delete ICMS Config
     * @method
     * @name AvaTaxBR#deleteCustomIcmsConfByState
     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * @param {string} state - Brazilian State
     * 
     */
    AvaTaxBR.prototype.deleteCustomIcmsConfByState = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}/icms/{state}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        path = path.replace('{state}', parameters['state']);

        if (parameters['state'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: state'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('DELETE', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This operation return custom process configurations that match with parameters queries

     * @method
     * @name AvaTaxBR#getCompanyProcessList
     * @param {integer} xPaginationLimit - The per page limit. Currently set to 10 but subject to change at any time (max 100).
     * @param {integer} xPaginationCurrentPage - The current page. Defaults to 1.
     * @param {string} xPaginationSort - The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.
     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * @param {string} text - Text query
     * 
     */
    AvaTaxBR.prototype.getCompanyProcessList = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}/process';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        if (parameters['xPaginationLimit'] !== undefined) {
            headers['X-Pagination-Limit'] = parameters['xPaginationLimit'];
        }

        if (parameters['xPaginationCurrentPage'] !== undefined) {
            headers['X-Pagination-Current-Page'] = parameters['xPaginationCurrentPage'];
        }

        if (parameters['xPaginationSort'] !== undefined) {
            headers['X-Pagination-Sort'] = parameters['xPaginationSort'];
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        if (parameters['text'] !== undefined) {
            queryParameters['text'] = parameters['text'];
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This method operation create a custom agast for one company

     * @method
     * @name AvaTaxBR#createCustomProcessScenario
     * @param {} body - Transaction Message
     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * @param {string} text - Text query
     * 
     */
    AvaTaxBR.prototype.createCustomProcessScenario = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}/process';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['body'] !== undefined) {
            body = parameters['body'];
        }

        if (parameters['body'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: body'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        if (parameters['text'] !== undefined) {
            queryParameters['text'] = parameters['text'];
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('POST', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This operation return custom process configurations that match with parameters queries

     * @method
     * @name AvaTaxBR#getCompanyProcess
     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * @param {string} code - Process Code
     * 
     */
    AvaTaxBR.prototype.getCompanyProcess = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}/process/{code}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        path = path.replace('{code}', parameters['code']);

        if (parameters['code'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: code'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This method operation update a custom process for one company

     * @method
     * @name AvaTaxBR#updateCustomProcessScenario
     * @param {} body - Transaction Message
     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * @param {string} code - Process Code
     * 
     */
    AvaTaxBR.prototype.updateCustomProcessScenario = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}/process/{code}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['body'] !== undefined) {
            body = parameters['body'];
        }

        if (parameters['body'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: body'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        path = path.replace('{code}', parameters['code']);

        if (parameters['code'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: code'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('PUT', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Delete Custom Process
     * @method
     * @name AvaTaxBR#deleteCustomProcessScenario
     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * @param {string} code - Process Code
     * 
     */
    AvaTaxBR.prototype.deleteCustomProcessScenario = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}/process/{code}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        path = path.replace('{code}', parameters['code']);

        if (parameters['code'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: code'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('DELETE', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * If it still not exists, uploads a new Certificate file for this company.
    Send the file as a base64 string.

     * @method
     * @name AvaTaxBR#postCompanyServiceCertificate
     * @param {} body - Content
     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * 
     */
    AvaTaxBR.prototype.postCompanyServiceCertificate = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}/certificate';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['body'] !== undefined) {
            body = parameters['body'];
        }

        if (parameters['body'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: body'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('POST', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Updates an existing certificate file for this company.
    Send the file as a base64 string.

     * @method
     * @name AvaTaxBR#updateCompanyServiceCertificate
     * @param {string} companyId - Company ID
     * @param {} body - Content
     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * 
     */
    AvaTaxBR.prototype.updateCompanyServiceCertificate = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}/certificate';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        if (parameters['body'] !== undefined) {
            body = parameters['body'];
        }

        if (parameters['body'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: body'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('PUT', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Gets an existing certificate file for this company.

     * @method
     * @name AvaTaxBR#getCompanyServiceCertificate
     * @param {string} companyId - Company ID
     * @param {number} peek - Use this parameter to check the existence of the file without downloading it.
     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * 
     */
    AvaTaxBR.prototype.getCompanyServiceCertificate = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}/certificate';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/octet-stream'];
        headers['Content-Type'] = ['application/json'];

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        if (parameters['peek'] !== undefined) {
            queryParameters['peek'] = parameters['peek'];
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Deletes a company file store.

     * @method
     * @name AvaTaxBR#deleteCompanyServiceCertificate
     * @param {string} companyId - Company ID
     * @param {string} authorization - Bearer {auth}
     * @param {string} companyId - Company ID
     * 
     */
    AvaTaxBR.prototype.deleteCompanyServiceCertificate = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/companies/{companyId}/certificate';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{companyId}', parameters['companyId']);

        if (parameters['companyId'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: companyId'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('DELETE', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Retrieve the Danfe

     * @method
     * @name AvaTaxBR#nfePrint
     * @param {string} authorization - Bearer {auth}
     * @param {string} key - Invoice Key
     * 
     */
    AvaTaxBR.prototype.nfePrint = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/invoices/nfe/{key}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/pdf'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{key}', parameters['key']);

        if (parameters['key'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: key'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Retrieve the Danfe in NFCe format.

     * @method
     * @name AvaTaxBR#nfcePrint
     * @param {string} authorization - Bearer {auth}
     * @param {string} key - Invoice Key
     * 
     */
    AvaTaxBR.prototype.nfcePrint = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/invoices/nfce/{key}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/pdf'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{key}', parameters['key']);

        if (parameters['key'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: key'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Send a invoice to SEFAZ

     * @method
     * @name AvaTaxBR#sendInvoice
     * @param {} body - Invoices
     * @param {string} authorization - Bearer {auth}
     * 
     */
    AvaTaxBR.prototype.sendInvoice = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/invoices/sefaz';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['body'] !== undefined) {
            body = parameters['body'];
        }

        if (parameters['body'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: body'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('POST', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Send disable range of NFes to SEFAZ

     * @method
     * @name AvaTaxBR#disableRange
     * @param {} body - Disable Range e-Invoice
     * @param {string} authorization - Bearer {auth}
     * 
     */
    AvaTaxBR.prototype.disableRange = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/invoices/sefaz';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['body'] !== undefined) {
            body = parameters['body'];
        }

        if (parameters['body'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: body'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('DELETE', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Retrieve the invoice
     * @method
     * @name AvaTaxBR#retrieveInvoice
     * @param {string} authorization - Bearer {auth}
     * @param {string} key - Invoice Key
     * 
     */
    AvaTaxBR.prototype.retrieveInvoice = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/invoices/sefaz/{key}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{key}', parameters['key']);

        if (parameters['key'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: key'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Fix Letter
     * @method
     * @name AvaTaxBR#fixLetter
     * @param {} body - Fix Message
     * @param {string} authorization - Bearer {auth}
     * @param {string} key - Invoice Key
     * 
     */
    AvaTaxBR.prototype.fixLetter = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/invoices/sefaz/{key}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['body'] !== undefined) {
            body = parameters['body'];
        }

        if (parameters['body'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: body'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{key}', parameters['key']);

        if (parameters['key'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: key'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('PUT', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Cancel the invoice
     * @method
     * @name AvaTaxBR#cancelInvoice
     * @param {} body - Cancel Message
     * @param {string} authorization - Bearer {auth}
     * @param {string} key - Invoice Key
     * 
     */
    AvaTaxBR.prototype.cancelInvoice = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/invoices/sefaz/{key}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['body'] !== undefined) {
            body = parameters['body'];
        }

        if (parameters['body'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: body'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{key}', parameters['key']);

        if (parameters['key'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: key'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('DELETE', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Retrieve the invoice
     * @method
     * @name AvaTaxBR#retrieveInvoiceLookup
     * @param {string} authorization - Bearer {auth}
     * @param {string} key - Invoice Key
     * 
     */
    AvaTaxBR.prototype.retrieveInvoiceLookup = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/invoices/sefaz/{key}/lookup';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{key}', parameters['key']);

        if (parameters['key'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: key'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Retrieve Status of SEFAZ Server
     * @method
     * @name AvaTaxBR#retrieveStatus
     * @param {string} authorization - Bearer {auth}
     * 
     */
    AvaTaxBR.prototype.retrieveStatus = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/invoices/sefaz/status';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Send a invoice
     * @method
     * @name AvaTaxBR#sendInvoiceService
     * @param {} body - Invoices
     * @param {string} authorization - Bearer {auth}
     * 
     */
    AvaTaxBR.prototype.sendInvoiceService = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/invoices/service';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['body'] !== undefined) {
            body = parameters['body'];
        }

        if (parameters['body'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: body'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('POST', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Retrieve the invoice
     * @method
     * @name AvaTaxBR#retrieveInvoiceService
     * @param {string} authorization - Bearer {auth}
     * @param {string} key - Invoice Key
     * 
     */
    AvaTaxBR.prototype.retrieveInvoiceService = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/invoices/service/{key}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{key}', parameters['key']);

        if (parameters['key'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: key'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Cancel the invoice
     * @method
     * @name AvaTaxBR#cancelInvoiceService
     * @param {} body - Cancel Message
     * @param {string} authorization - Bearer {auth}
     * @param {string} key - Invoice Key
     * 
     */
    AvaTaxBR.prototype.cancelInvoiceService = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/invoices/service/{key}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['body'] !== undefined) {
            body = parameters['body'];
        }

        if (parameters['body'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: body'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{key}', parameters['key']);

        if (parameters['key'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: key'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('DELETE', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Check if State was in Contingency
     * @method
     * @name AvaTaxBR#invoiceVerifyContingency
     * @param {string} state - Brazilian State
     * 
     */
    AvaTaxBR.prototype.invoiceVerifyContingency = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/invoices/contingency/{state}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        path = path.replace('{state}', parameters['state']);

        if (parameters['state'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: state'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Set State in Contingency
     * @method
     * @name AvaTaxBR#invoiceSetContingency
     * @param {} body - Set Contingency
     * @param {string} state - Brazilian State
     * 
     */
    AvaTaxBR.prototype.invoiceSetContingency = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/invoices/contingency/{state}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['body'] !== undefined) {
            body = parameters['body'];
        }

        if (parameters['body'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: body'));
            return deferred.promise;
        }

        path = path.replace('{state}', parameters['state']);

        if (parameters['state'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: state'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('PUT', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Drop State in Contingency
     * @method
     * @name AvaTaxBR#invoiceDropContingency
     * @param {string} state - Brazilian State
     * 
     */
    AvaTaxBR.prototype.invoiceDropContingency = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/invoices/contingency/{state}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        path = path.replace('{state}', parameters['state']);

        if (parameters['state'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: state'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('DELETE', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Get Enviroment Settigns
     * @method
     * @name AvaTaxBR#invoiceSettings
     * 
     */
    AvaTaxBR.prototype.invoiceSettings = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/invoices/settings';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This operation return ISS configurations that match with parameters queries

     * @method
     * @name AvaTaxBR#getIssList
     * @param {string} suffixcode - Identify this ISS

     * @param {string} date - When informed return valid version configuration for this date

     * @param {boolean} inactive - return the inactive versions too

     * @param {string} authorization - Bearer {auth}
     * 
     */
    AvaTaxBR.prototype.getIssList = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/taxconf/iss';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        if (parameters['suffixcode'] !== undefined) {
            queryParameters['suffixcode'] = parameters['suffixcode'];
        }

        if (parameters['date'] !== undefined) {
            queryParameters['date'] = parameters['date'];
        }

        if (parameters['inactive'] !== undefined) {
            queryParameters['inactive'] = parameters['inactive'];
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * create a new ISS Configuration
     * @method
     * @name AvaTaxBR#createIssConfByCity
     * @param {} issConfByCity - The pet JSON you want to post
     * @param {string} authorization - Bearer {auth}
     * 
     */
    AvaTaxBR.prototype.createIssConfByCity = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/taxconf/iss';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['issConfByCity'] !== undefined) {
            body = parameters['issConfByCity'];
        }

        if (parameters['issConfByCity'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: issConfByCity'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('POST', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This operation return configurations of ISS that match with parameters queries

     * @method
     * @name AvaTaxBR#getIssConfByCity
     * @param {number} cityCode - City Code
     * @param {string} code - Identificator of this configuration, it is unique for account or standard namedspace

     * @param {string} date - When informed return valid version configuration for this date

     * @param {boolean} inactive - return the inctives versions too

     * @param {string} authorization - Bearer {auth}
     * 
     */
    AvaTaxBR.prototype.getIssConfByCity = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/taxconf/iss/{cityCode}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        path = path.replace('{cityCode}', parameters['cityCode']);

        if (parameters['cityCode'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: cityCode'));
            return deferred.promise;
        }

        if (parameters['code'] !== undefined) {
            queryParameters['code'] = parameters['code'];
        }

        if (parameters['date'] !== undefined) {
            queryParameters['date'] = parameters['date'];
        }

        if (parameters['inactive'] !== undefined) {
            queryParameters['inactive'] = parameters['inactive'];
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * update a ISS by City Code.
     * @method
     * @name AvaTaxBR#updateIssConfByCity
     * @param {number} cityCode - City Code
     * @param {} issConfByCity - The pet JSON you want to post
     * @param {string} authorization - Bearer {auth}
     * 
     */
    AvaTaxBR.prototype.updateIssConfByCity = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/taxconf/iss/{cityCode}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        path = path.replace('{cityCode}', parameters['cityCode']);

        if (parameters['cityCode'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: cityCode'));
            return deferred.promise;
        }

        if (parameters['issConfByCity'] !== undefined) {
            body = parameters['issConfByCity'];
        }

        if (parameters['issConfByCity'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: issConfByCity'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('PUT', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * disable a ISS by City Code.
     * @method
     * @name AvaTaxBR#deleteIssConf
     * @param {number} cityCode - City Code
     * @param {string} authorization - Bearer {auth}
     * 
     */
    AvaTaxBR.prototype.deleteIssConf = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/taxconf/iss/{cityCode}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        path = path.replace('{cityCode}', parameters['cityCode']);

        if (parameters['cityCode'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: cityCode'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('DELETE', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This operation return ICMS configurations that match with parameters queries

     * @method
     * @name AvaTaxBR#getIcmsList
     * @param {string} suffixcode - Identify this ICMS
     * @param {string} date - When informed return valid version configuration for this date
     * @param {boolean} inactive - return the inactive versions too
     * @param {string} authorization - Bearer {auth}
     * @param {string} state - Brazilian State
     * 
     */
    AvaTaxBR.prototype.getIcmsList = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/taxconf/icms/{state}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        if (parameters['suffixcode'] !== undefined) {
            queryParameters['suffixcode'] = parameters['suffixcode'];
        }

        if (parameters['date'] !== undefined) {
            queryParameters['date'] = parameters['date'];
        }

        if (parameters['inactive'] !== undefined) {
            queryParameters['inactive'] = parameters['inactive'];
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{state}', parameters['state']);

        if (parameters['state'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: state'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * create a new ICMS Configuration
     * @method
     * @name AvaTaxBR#createIcmsconfstate
     * @param {} icmsConfState - The pet JSON you want to post
     * @param {string} authorization - Bearer {auth}
     * @param {string} state - Brazilian State
     * 
     */
    AvaTaxBR.prototype.createIcmsconfstate = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/taxconf/icms/{state}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['icmsConfState'] !== undefined) {
            body = parameters['icmsConfState'];
        }

        if (parameters['icmsConfState'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: icmsConfState'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{state}', parameters['state']);

        if (parameters['state'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: state'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('POST', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This operation return configurations of icms that match with parameters queries

     * @method
     * @name AvaTaxBR#getIcmsConfByState
     * @param {string} authorization - Bearer {auth}
     * @param {string} state - Brazilian State
     * @param {string} code - ICMS Code
     * 
     */
    AvaTaxBR.prototype.getIcmsConfByState = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/taxconf/icms/{state}/{code}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{state}', parameters['state']);

        if (parameters['state'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: state'));
            return deferred.promise;
        }

        path = path.replace('{code}', parameters['code']);

        if (parameters['code'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: code'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * update a IcmsConf State,
     * @method
     * @name AvaTaxBR#updateIcmsconfstate
     * @param {} icmsConfState - The pet JSON you want to post
     * @param {string} authorization - Bearer {auth}
     * @param {string} state - Brazilian State
     * @param {string} code - ICMS Code
     * 
     */
    AvaTaxBR.prototype.updateIcmsconfstate = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/taxconf/icms/{state}/{code}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['icmsConfState'] !== undefined) {
            body = parameters['icmsConfState'];
        }

        if (parameters['icmsConfState'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: icmsConfState'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{state}', parameters['state']);

        if (parameters['state'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: state'));
            return deferred.promise;
        }

        path = path.replace('{code}', parameters['code']);

        if (parameters['code'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: code'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('PUT', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * disable a ICMS by State.
     * @method
     * @name AvaTaxBR#deleteIcmsConf
     * @param {string} authorization - Bearer {auth}
     * @param {string} state - Brazilian State
     * @param {string} code - ICMS Code
     * 
     */
    AvaTaxBR.prototype.deleteIcmsConf = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/taxconf/icms/{state}/{code}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{state}', parameters['state']);

        if (parameters['state'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: state'));
            return deferred.promise;
        }

        path = path.replace('{code}', parameters['code']);

        if (parameters['code'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: code'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('DELETE', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This operation return ICMS configurations that match with parameters queries

     * @method
     * @name AvaTaxBR#getIcmsListSearch
     * @param {string} text - Search for codes
     * @param {string} state - Filter for states
     * @param {string} authorization - Bearer {auth}
     * 
     */
    AvaTaxBR.prototype.getIcmsListSearch = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/taxconf/icms-search/';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        if (parameters['text'] !== undefined) {
            queryParameters['text'] = parameters['text'];
        }

        if (parameters['text'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: text'));
            return deferred.promise;
        }

        if (parameters['state'] !== undefined) {
            queryParameters['state'] = parameters['state'];
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This operation return CFOP configurations that match with parameters queries

     * @method
     * @name AvaTaxBR#getCfopList
     * @param {string} suffixcode - Identify this CFOP, the CFOP Code has two parts N.XXX where N the prefix is the operation scope type if IN or OUT and if is in state, other state, other country and suffix XXX is the operation type

     * @param {string} date - When informed return valid version configuration for this date

     * @param {boolean} inactive - return the inactive versions too

     * @param {string} authorization - Bearer {auth}
     * 
     */
    AvaTaxBR.prototype.getCfopList = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/taxconf/cfop';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        if (parameters['suffixcode'] !== undefined) {
            queryParameters['suffixcode'] = parameters['suffixcode'];
        }

        if (parameters['date'] !== undefined) {
            queryParameters['date'] = parameters['date'];
        }

        if (parameters['inactive'] !== undefined) {
            queryParameters['inactive'] = parameters['inactive'];
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * create a new CFOP configuration
     * @method
     * @name AvaTaxBR#createCfop
     * @param {} body - The pet JSON you want to post
     * @param {string} authorization - Bearer {auth}
     * 
     */
    AvaTaxBR.prototype.createCfop = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/taxconf/cfop';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['body'] !== undefined) {
            body = parameters['body'];
        }

        if (parameters['body'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: body'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('POST', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This operation return CFOP configuration

     * @method
     * @name AvaTaxBR#getCfop
     * @param {string} code - CFOP Code
     * @param {string} authorization - Bearer {auth}
     * 
     */
    AvaTaxBR.prototype.getCfop = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/taxconf/cfop/{code}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        path = path.replace('{code}', parameters['code']);

        if (parameters['code'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: code'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * update a CFOP configuration
     * @method
     * @name AvaTaxBR#updateCfop
     * @param {string} code - CFOP Code
     * @param {} taxconfcfop - The pet JSON you want to post
     * @param {string} authorization - Bearer {auth}
     * 
     */
    AvaTaxBR.prototype.updateCfop = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/taxconf/cfop/{code}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        path = path.replace('{code}', parameters['code']);

        if (parameters['code'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: code'));
            return deferred.promise;
        }

        if (parameters['taxconfcfop'] !== undefined) {
            body = parameters['taxconfcfop'];
        }

        if (parameters['taxconfcfop'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: taxconfcfop'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('PUT', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * disable a CFOP.
     * @method
     * @name AvaTaxBR#deleteCfop
     * @param {string} code - CFOP Code
     * @param {string} authorization - Bearer {auth}
     * 
     */
    AvaTaxBR.prototype.deleteCfop = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/taxconf/cfop/{code}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        path = path.replace('{code}', parameters['code']);

        if (parameters['code'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: code'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('DELETE', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This operation return Process Type configurations that match with parameters queries

     * @method
     * @name AvaTaxBR#getProcessList
     * @param {string} accountId - filter the configuration by accountID, if not informed, only the standard configuration will be returned

     * @param {string} date - When informed return valid version configuration for this date

     * @param {boolean} inactive - return the inactive versions too

     * @param {string} authorization - Bearer {auth}
     * 
     */
    AvaTaxBR.prototype.getProcessList = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/taxconf/process';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        if (parameters['accountId'] !== undefined) {
            queryParameters['accountId'] = parameters['accountId'];
        }

        if (parameters['date'] !== undefined) {
            queryParameters['date'] = parameters['date'];
        }

        if (parameters['inactive'] !== undefined) {
            queryParameters['inactive'] = parameters['inactive'];
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * create a new Process Type configuration
     * @method
     * @name AvaTaxBR#createProcess
     * @param {} taxconfprocess - The pet JSON you want to post
     * @param {string} authorization - Bearer {auth}
     * 
     */
    AvaTaxBR.prototype.createProcess = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/taxconf/process';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['taxconfprocess'] !== undefined) {
            body = parameters['taxconfprocess'];
        }

        if (parameters['taxconfprocess'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: taxconfprocess'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('POST', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This operation return Process Type configuration

     * @method
     * @name AvaTaxBR#getProcess
     * @param {string} code - Process Code
     * @param {string} authorization - Bearer {auth}
     * 
     */
    AvaTaxBR.prototype.getProcess = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/taxconf/process/{code}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        path = path.replace('{code}', parameters['code']);

        if (parameters['code'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: code'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * update a Process Type configuration
     * @method
     * @name AvaTaxBR#updateProcess
     * @param {string} code - Process Code
     * @param {} taxconfprocess - The pet JSON you want to post
     * @param {string} authorization - Bearer {auth}
     * 
     */
    AvaTaxBR.prototype.updateProcess = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/taxconf/process/{code}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        path = path.replace('{code}', parameters['code']);

        if (parameters['code'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: code'));
            return deferred.promise;
        }

        if (parameters['taxconfprocess'] !== undefined) {
            body = parameters['taxconfprocess'];
        }

        if (parameters['taxconfprocess'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: taxconfprocess'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('PUT', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * disable a Process.
     * @method
     * @name AvaTaxBR#deleteProcess
     * @param {string} code - Process Code
     * @param {string} authorization - Bearer {auth}
     * 
     */
    AvaTaxBR.prototype.deleteProcess = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/taxconf/process/{code}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        path = path.replace('{code}', parameters['code']);

        if (parameters['code'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: code'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('DELETE', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * create a new Process Type configuration
     * @method
     * @name AvaTaxBR#createIbptFromCSV
     * @param {} csvIbpt - CSV file
     * @param {string} authorization - Bearer {auth}
     * @param {string} state - Brazilian State
     * 
     */
    AvaTaxBR.prototype.createIbptFromCSV = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/taxconf/ibpt/{state}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['csvIbpt'] !== undefined) {
            body = parameters['csvIbpt'];
        }

        if (parameters['csvIbpt'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: csvIbpt'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{state}', parameters['state']);

        if (parameters['state'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: state'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('POST', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * disable a IBPT.
     * @method
     * @name AvaTaxBR#deleteIbptFromState
     * @param {string} authorization - Bearer {auth}
     * @param {string} state - Brazilian State
     * 
     */
    AvaTaxBR.prototype.deleteIbptFromState = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/taxconf/ibpt/{state}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{state}', parameters['state']);

        if (parameters['state'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: state'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('DELETE', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * List Legal Reasons.
     * @method
     * @name AvaTaxBR#listReason
     * @param {string} companyId - Filters by company domain entries.
    Provide "global" to retrive only "global" entries.
    CompanyId searches also match global entries.

     * @param {string} authorization - Bearer {auth}
     * 
     */
    AvaTaxBR.prototype.listReason = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/taxconf/legal-reason';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        if (parameters['companyId'] !== undefined) {
            queryParameters['companyId'] = parameters['companyId'];
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Update Legal Reason.
     * @method
     * @name AvaTaxBR#updateReason_
     * @param {} body - The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.
     * @param {string} authorization - Bearer {auth}
     * 
     */
    AvaTaxBR.prototype.updateReason_ = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/taxconf/legal-reason';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        if (parameters['body'] !== undefined) {
            body = parameters['body'];
        }

        if (parameters['body'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: body'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('PUT', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Create Legal Reason.
     * @method
     * @name AvaTaxBR#createReason_
     * @param {} body - The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.
     * @param {string} authorization - Bearer {auth}
     * 
     */
    AvaTaxBR.prototype.createReason_ = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/taxconf/legal-reason';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        if (parameters['body'] !== undefined) {
            body = parameters['body'];
        }

        if (parameters['body'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: body'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('POST', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Get single Legal Reason.
     * @method
     * @name AvaTaxBR#getReason_
     * @param {string} uuid - The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.
     * @param {string} authorization - Bearer {auth}
     * 
     */
    AvaTaxBR.prototype.getReason_ = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/taxconf/legal-reason/{uuid}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        path = path.replace('{uuid}', parameters['uuid']);

        if (parameters['uuid'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: uuid'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Delete a Legal Reason entry.
     * @method
     * @name AvaTaxBR#deleteReason_
     * @param {string} uuid - The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.
     * @param {string} authorization - Bearer {auth}
     * 
     */
    AvaTaxBR.prototype.deleteReason_ = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/taxconf/legal-reason/{uuid}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Content-Type'] = ['application/json'];

        path = path.replace('{uuid}', parameters['uuid']);

        if (parameters['uuid'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: uuid'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('DELETE', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * This method has more then one operation model,
    (a) AS IS, the system only stores the transaction;
    (b) Full Calculation, the system calculates taxes, validates fileds, stores with transaction state, but doesn't try get government authorization;
    (c) Full Sync, the system calculates taxes, validates fileds, gets government authorization, stores with transaction state when authorized, used for NFCe.

     * @method
     * @name AvaTaxBR#transactionGoodsPurchase
     * @param {} body - Transaction Message
     * @param {string} authorization - Bearer {auth}
     * 
     */
    AvaTaxBR.prototype.transactionGoodsPurchase = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/transactions?goods';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['body'] !== undefined) {
            body = parameters['body'];
        }

        if (parameters['body'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: body'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('POST', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
     * @method
     * @name AvaTaxBR#transactionServicesSales
     * @param {} body - Transaction Message
     * @param {string} authorization - Bearer {auth}
     * 
     */
    AvaTaxBR.prototype.transactionServicesSales = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/transactions?service-sales';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['body'] !== undefined) {
            body = parameters['body'];
        }

        if (parameters['body'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: body'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('POST', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
     * @method
     * @name AvaTaxBR#transactionServiceSales
     * @param {} body - Transaction Message
     * @param {string} authorization - Bearer {auth}
     * 
     */
    AvaTaxBR.prototype.transactionServiceSales = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/transactions?service-purchase';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['body'] !== undefined) {
            body = parameters['body'];
        }

        if (parameters['body'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: body'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('POST', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
     * @method
     * @name AvaTaxBR#transactionServicePayment
     * @param {} body - Transaction Message
     * @param {string} authorization - Bearer {auth}
     * 
     */
    AvaTaxBR.prototype.transactionServicePayment = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/transactions?service-payment';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['body'] !== undefined) {
            body = parameters['body'];
        }

        if (parameters['body'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: body'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('POST', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
     * @method
     * @name AvaTaxBR#transactionServiceReceipt
     * @param {} body - Transaction Message
     * @param {string} authorization - Bearer {auth}
     * 
     */
    AvaTaxBR.prototype.transactionServiceReceipt = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/transactions?service-receipt';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['body'] !== undefined) {
            body = parameters['body'];
        }

        if (parameters['body'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: body'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('POST', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Retrieve a list of transactions
     * @method
     * @name AvaTaxBR#retrieveServiceTransactions
     * @param {string} authorization - Bearer {auth}
     * @param {string} transactionType - Transaction Type (sale, purchase, receipts or payment)
     * 
     */
    AvaTaxBR.prototype.retrieveServiceTransactions = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/transactions/service/{transactionType}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{transactionType}', parameters['transactionType']);

        if (parameters['transactionType'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: transactionType'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Retrieve a single transaction
     * @method
     * @name AvaTaxBR#singleServiceTransaction
     * @param {string} authorization - Bearer {auth}
     * @param {string} transactionType - Transaction Type (sale, purchase, receipts or payment)
     * @param {string} documentCode - Document Code
     * 
     */
    AvaTaxBR.prototype.singleServiceTransaction = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/transactions/service/{transactionType}/{documentCode}';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{transactionType}', parameters['transactionType']);

        if (parameters['transactionType'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: transactionType'));
            return deferred.promise;
        }

        path = path.replace('{documentCode}', parameters['documentCode']);

        if (parameters['documentCode'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: documentCode'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('GET', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };
    /**
     * Transaction State Transition
    Voided  Send this event to a Recorded tax transaction record to mark it as voided.  Recorded -> Voided
    UnVoided  Send this event to a Voided tax transaction record to mark it as recorded.  Voided -> Recorded
    Reconciled  Send this event to a Recorded tax transaction record to indicate that it has been reconciled with client systems and to prevent it from being edited prior to filing. This is useful when a transaction will be filed and you do not want it to change again to facilitate auditing and reconciliation. Recorded -> Reconciled
    UnReconciled  Send this event to a Reconciled tax transaction record to indicate that it has not been reconciled and may need to be edited. This is useful when a Tax transaction was erroniously put into the reconciled state.  Reconciled -> Recorded
    Filed Send this event to a Reconciled transaction to indicate that it has been part of a tax filing by the client system. Reconciled -> Filed
    UnFiled Send this event to a Filed transaction to indicate that it has NOT been part of a tax filing by the client system.  Filed -> Reconciled
    FiledByAvalara  This event can only be sent by Avalara Systems. Reconciled -> FiledByAvalara

     * @method
     * @name AvaTaxBR#transactionServiceStateTransaction
     * @param {} body - Transaction Message
     * @param {string} authorization - Bearer {auth}
     * @param {string} transactionType - Transaction Type (sale, purchase, receipts or payment)
     * @param {string} documentCode - Document Code
     * 
     */
    AvaTaxBR.prototype.transactionServiceStateTransaction = function(parameters) {
        if (parameters === undefined) {
            parameters = {};
        }
        var deferred = Q.defer();

        var domain = this.domain;
        var path = '/transactions/service/{transactionType}/{documentCode}/stateTransitions';

        var body;
        var queryParameters = {};
        var headers = {};
        var form = {};

        headers['Accept'] = ['application/json'];
        headers['Content-Type'] = ['application/json'];

        if (parameters['body'] !== undefined) {
            body = parameters['body'];
        }

        if (parameters['body'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: body'));
            return deferred.promise;
        }

        if (parameters['authorization'] !== undefined) {
            headers['Authorization'] = parameters['authorization'];
        }

        if (parameters['authorization'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: authorization'));
            return deferred.promise;
        }

        path = path.replace('{transactionType}', parameters['transactionType']);

        if (parameters['transactionType'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: transactionType'));
            return deferred.promise;
        }

        path = path.replace('{documentCode}', parameters['documentCode']);

        if (parameters['documentCode'] === undefined) {
            deferred.reject(new Error('Missing required  parameter: documentCode'));
            return deferred.promise;
        }

        if (parameters.$queryParameters) {
            Object.keys(parameters.$queryParameters)
                .forEach(function(parameterName) {
                    var parameter = parameters.$queryParameters[parameterName];
                    queryParameters[parameterName] = parameter;
                });
        }

        this.request('POST', domain + path, parameters, body, headers, queryParameters, form, deferred);

        return deferred.promise;
    };

    return AvaTaxBR;
})();

exports.AvaTaxBR = AvaTaxBR;