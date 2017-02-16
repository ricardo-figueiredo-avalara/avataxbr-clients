/**
 * BR16 - API
 * This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

/// <reference path="api.d.ts" />

/* tslint:disable:no-unused-variable member-ordering */

namespace API.Client {
    'use strict';

    export class InvoiceSEFAZApi {
        protected basePath = 'https://br16-dev-app03.br.avalara.com/v2';
        public defaultHeaders : any = {};

        static $inject: string[] = ['$http', '$httpParamSerializer', 'basePath'];

        constructor(protected $http: ng.IHttpService, protected $httpParamSerializer?: (d: any) => any, basePath?: string) {
            if (basePath !== undefined) {
                this.basePath = basePath;
            }
        }

        private extendObj<T1,T2>(objA: T1, objB: T2) {
            for(let key in objB){
                if(objB.hasOwnProperty(key)){
                    objA[key] = objB[key];
                }
            }
            return <T1&T2>objA;
        }

        /**
         * Disable Range e-Invoice
         * Send disable range of NFes to SEFAZ 
         * @param authorization Bearer {auth}
         * @param body Disable Range e-Invoice
         */
        public invoicesSefazDelete (authorization: string, body: SefazDisableRangeIn, extraHttpRequestParams?: any ) : ng.IHttpPromise<SefazInvoiceBasicStatus> {
            const localVarPath = this.basePath + '/invoices/sefaz';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            // verify required parameter 'authorization' is not null or undefined
            if (authorization === null || authorization === undefined) {
                throw new Error('Required parameter authorization was null or undefined when calling invoicesSefazDelete.');
            }
            // verify required parameter 'body' is not null or undefined
            if (body === null || body === undefined) {
                throw new Error('Required parameter body was null or undefined when calling invoicesSefazDelete.');
            }
            headerParams['Authorization'] = authorization;

            let httpRequestParams: any = {
                method: 'DELETE',
                url: localVarPath,
                json: true,
                data: body,
                                params: queryParameters,
                headers: headerParams
            };

            if (extraHttpRequestParams) {
                httpRequestParams = this.extendObj(httpRequestParams, extraHttpRequestParams);
            }

            return this.$http(httpRequestParams);
        }
        /**
         * Cancel invoice
         * Cancel the invoice
         * @param authorization Bearer {auth}
         * @param key Invoice Key
         * @param body Cancel Message
         */
        public invoicesSefazKeyDelete (authorization: string, key: string, body: SefazItDeleteIn, extraHttpRequestParams?: any ) : ng.IHttpPromise<SefazInvoiceBasicStatus> {
            const localVarPath = this.basePath + '/invoices/sefaz/{key}'
                .replace('{' + 'key' + '}', String(key));

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            // verify required parameter 'authorization' is not null or undefined
            if (authorization === null || authorization === undefined) {
                throw new Error('Required parameter authorization was null or undefined when calling invoicesSefazKeyDelete.');
            }
            // verify required parameter 'key' is not null or undefined
            if (key === null || key === undefined) {
                throw new Error('Required parameter key was null or undefined when calling invoicesSefazKeyDelete.');
            }
            // verify required parameter 'body' is not null or undefined
            if (body === null || body === undefined) {
                throw new Error('Required parameter body was null or undefined when calling invoicesSefazKeyDelete.');
            }
            headerParams['Authorization'] = authorization;

            let httpRequestParams: any = {
                method: 'DELETE',
                url: localVarPath,
                json: true,
                data: body,
                                params: queryParameters,
                headers: headerParams
            };

            if (extraHttpRequestParams) {
                httpRequestParams = this.extendObj(httpRequestParams, extraHttpRequestParams);
            }

            return this.$http(httpRequestParams);
        }
        /**
         * Retrieve invoice
         * Retrieve the invoice
         * @param authorization Bearer {auth}
         * @param key Invoice Key
         */
        public invoicesSefazKeyGet (authorization: string, key: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<SefazItGetOut> {
            const localVarPath = this.basePath + '/invoices/sefaz/{key}'
                .replace('{' + 'key' + '}', String(key));

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            // verify required parameter 'authorization' is not null or undefined
            if (authorization === null || authorization === undefined) {
                throw new Error('Required parameter authorization was null or undefined when calling invoicesSefazKeyGet.');
            }
            // verify required parameter 'key' is not null or undefined
            if (key === null || key === undefined) {
                throw new Error('Required parameter key was null or undefined when calling invoicesSefazKeyGet.');
            }
            headerParams['Authorization'] = authorization;

            let httpRequestParams: any = {
                method: 'GET',
                url: localVarPath,
                json: true,
                                                params: queryParameters,
                headers: headerParams
            };

            if (extraHttpRequestParams) {
                httpRequestParams = this.extendObj(httpRequestParams, extraHttpRequestParams);
            }

            return this.$http(httpRequestParams);
        }
        /**
         * Retrieve invoice
         * Retrieve the invoice
         * @param authorization Bearer {auth}
         * @param key Invoice Key
         */
        public invoicesSefazKeyLookupGet (authorization: string, key: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<TransactionForSefazGoodsList> {
            const localVarPath = this.basePath + '/invoices/sefaz/{key}/lookup'
                .replace('{' + 'key' + '}', String(key));

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            // verify required parameter 'authorization' is not null or undefined
            if (authorization === null || authorization === undefined) {
                throw new Error('Required parameter authorization was null or undefined when calling invoicesSefazKeyLookupGet.');
            }
            // verify required parameter 'key' is not null or undefined
            if (key === null || key === undefined) {
                throw new Error('Required parameter key was null or undefined when calling invoicesSefazKeyLookupGet.');
            }
            headerParams['Authorization'] = authorization;

            let httpRequestParams: any = {
                method: 'GET',
                url: localVarPath,
                json: true,
                                                params: queryParameters,
                headers: headerParams
            };

            if (extraHttpRequestParams) {
                httpRequestParams = this.extendObj(httpRequestParams, extraHttpRequestParams);
            }

            return this.$http(httpRequestParams);
        }
        /**
         * Fix Letter
         * Fix Letter
         * @param authorization Bearer {auth}
         * @param key Invoice Key
         * @param body Fix Message
         */
        public invoicesSefazKeyPut (authorization: string, key: string, body: SefazItPutIn, extraHttpRequestParams?: any ) : ng.IHttpPromise<SefazInvoiceBasicStatus> {
            const localVarPath = this.basePath + '/invoices/sefaz/{key}'
                .replace('{' + 'key' + '}', String(key));

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            // verify required parameter 'authorization' is not null or undefined
            if (authorization === null || authorization === undefined) {
                throw new Error('Required parameter authorization was null or undefined when calling invoicesSefazKeyPut.');
            }
            // verify required parameter 'key' is not null or undefined
            if (key === null || key === undefined) {
                throw new Error('Required parameter key was null or undefined when calling invoicesSefazKeyPut.');
            }
            // verify required parameter 'body' is not null or undefined
            if (body === null || body === undefined) {
                throw new Error('Required parameter body was null or undefined when calling invoicesSefazKeyPut.');
            }
            headerParams['Authorization'] = authorization;

            let httpRequestParams: any = {
                method: 'PUT',
                url: localVarPath,
                json: true,
                data: body,
                                params: queryParameters,
                headers: headerParams
            };

            if (extraHttpRequestParams) {
                httpRequestParams = this.extendObj(httpRequestParams, extraHttpRequestParams);
            }

            return this.$http(httpRequestParams);
        }
        /**
         * Send an e-Invoice
         * Send a invoice to SEFAZ 
         * @param authorization Bearer {auth}
         * @param body Invoices
         */
        public invoicesSefazPost (authorization: string, body: Array<TransactionForSefazGoods>, extraHttpRequestParams?: any ) : ng.IHttpPromise<SefazPostOut> {
            const localVarPath = this.basePath + '/invoices/sefaz';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            // verify required parameter 'authorization' is not null or undefined
            if (authorization === null || authorization === undefined) {
                throw new Error('Required parameter authorization was null or undefined when calling invoicesSefazPost.');
            }
            // verify required parameter 'body' is not null or undefined
            if (body === null || body === undefined) {
                throw new Error('Required parameter body was null or undefined when calling invoicesSefazPost.');
            }
            headerParams['Authorization'] = authorization;

            let httpRequestParams: any = {
                method: 'POST',
                url: localVarPath,
                json: true,
                data: body,
                                params: queryParameters,
                headers: headerParams
            };

            if (extraHttpRequestParams) {
                httpRequestParams = this.extendObj(httpRequestParams, extraHttpRequestParams);
            }

            return this.$http(httpRequestParams);
        }
        /**
         * Retrieve Status of SEFAZ Server
         * Retrieve Status of SEFAZ Server
         * @param authorization Bearer {auth}
         */
        public invoicesSefazStatusGet (authorization: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<string> {
            const localVarPath = this.basePath + '/invoices/sefaz/status';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            // verify required parameter 'authorization' is not null or undefined
            if (authorization === null || authorization === undefined) {
                throw new Error('Required parameter authorization was null or undefined when calling invoicesSefazStatusGet.');
            }
            headerParams['Authorization'] = authorization;

            let httpRequestParams: any = {
                method: 'GET',
                url: localVarPath,
                json: true,
                                                params: queryParameters,
                headers: headerParams
            };

            if (extraHttpRequestParams) {
                httpRequestParams = this.extendObj(httpRequestParams, extraHttpRequestParams);
            }

            return this.$http(httpRequestParams);
        }
    }
}
