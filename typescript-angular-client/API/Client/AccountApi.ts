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

    export class AccountApi {
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
         * Retrieve Companies by account
         * Retrieve list companies of one account
         * @param accountId Account ID
         */
        public accountsAccountIdCompaniesGet (accountId: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<Array<AccountCompany>> {
            const localVarPath = this.basePath + '/accounts/{accountId}/companies'
                .replace('{' + 'accountId' + '}', String(accountId));

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            // verify required parameter 'accountId' is not null or undefined
            if (accountId === null || accountId === undefined) {
                throw new Error('Required parameter accountId was null or undefined when calling accountsAccountIdCompaniesGet.');
            }
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
         * Create company and your data configuration
         * This method operation create a company for a account 
         * @param accountId Account ID
         * @param body Company Code
         */
        public createAccountCompany (accountId: string, body: Body, extraHttpRequestParams?: any ) : ng.IHttpPromise<InlineResponse201> {
            const localVarPath = this.basePath + '/accounts/{accountId}/companies'
                .replace('{' + 'accountId' + '}', String(accountId));

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            // verify required parameter 'accountId' is not null or undefined
            if (accountId === null || accountId === undefined) {
                throw new Error('Required parameter accountId was null or undefined when calling createAccountCompany.');
            }
            // verify required parameter 'body' is not null or undefined
            if (body === null || body === undefined) {
                throw new Error('Required parameter body was null or undefined when calling createAccountCompany.');
            }
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
    }
}