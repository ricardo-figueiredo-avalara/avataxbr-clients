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

    export class CompanyTaxRatesApi {
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
         * 
         * This operation return custom agast configurations that match with parameters queries 
         * @param companyId Company ID
         * @param xPaginationLimit The per page limit. Currently set to 10 but subject to change at any time (max 100).
         * @param xPaginationCurrentPage The current page. Defaults to 1.
         * @param xPaginationSort 
         */
        public companiesCompanyIdTaxratesGet (companyId: string, xPaginationLimit?: number, xPaginationCurrentPage?: number, xPaginationSort?: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<Array<CustomTaxTypeRate>> {
            const localVarPath = this.basePath + '/companies/{companyId}/taxrates'
                .replace('{' + 'companyId' + '}', String(companyId));

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            // verify required parameter 'companyId' is not null or undefined
            if (companyId === null || companyId === undefined) {
                throw new Error('Required parameter companyId was null or undefined when calling companiesCompanyIdTaxratesGet.');
            }
            headerParams['X-Pagination-Limit'] = xPaginationLimit;

            headerParams['X-Pagination-Current-Page'] = xPaginationCurrentPage;

            headerParams['X-Pagination-Sort'] = xPaginationSort;

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
         * 
         * This operation return custom agast configurations that match with parameters queries 
         * @param companyId Company ID
         * @param taxType Tax Type
         */
        public companiesCompanyIdTaxratesTaxTypeGet (companyId: string, taxType: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<CustomTaxTypeRate> {
            const localVarPath = this.basePath + '/companies/{companyId}/taxrates/{taxType}'
                .replace('{' + 'companyId' + '}', String(companyId))
                .replace('{' + 'taxType' + '}', String(taxType));

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            // verify required parameter 'companyId' is not null or undefined
            if (companyId === null || companyId === undefined) {
                throw new Error('Required parameter companyId was null or undefined when calling companiesCompanyIdTaxratesTaxTypeGet.');
            }
            // verify required parameter 'taxType' is not null or undefined
            if (taxType === null || taxType === undefined) {
                throw new Error('Required parameter taxType was null or undefined when calling companiesCompanyIdTaxratesTaxTypeGet.');
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
         * Create custom agast for one company
         * This method operation create a custom agast for one company 
         * @param companyId Company ID
         * @param body Transaction Message
         */
        public createCustomTaxes (companyId: string, body: CustomTaxTypeRate, extraHttpRequestParams?: any ) : ng.IHttpPromise<InlineResponse201> {
            const localVarPath = this.basePath + '/companies/{companyId}/taxrates'
                .replace('{' + 'companyId' + '}', String(companyId));

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            // verify required parameter 'companyId' is not null or undefined
            if (companyId === null || companyId === undefined) {
                throw new Error('Required parameter companyId was null or undefined when calling createCustomTaxes.');
            }
            // verify required parameter 'body' is not null or undefined
            if (body === null || body === undefined) {
                throw new Error('Required parameter body was null or undefined when calling createCustomTaxes.');
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
        /**
         * 
         * 
         * @param companyId Company ID
         * @param taxType Tax Type
         */
        public deleteCustomTaxes (companyId: string, taxType: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<{}> {
            const localVarPath = this.basePath + '/companies/{companyId}/taxrates/{taxType}'
                .replace('{' + 'companyId' + '}', String(companyId))
                .replace('{' + 'taxType' + '}', String(taxType));

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            // verify required parameter 'companyId' is not null or undefined
            if (companyId === null || companyId === undefined) {
                throw new Error('Required parameter companyId was null or undefined when calling deleteCustomTaxes.');
            }
            // verify required parameter 'taxType' is not null or undefined
            if (taxType === null || taxType === undefined) {
                throw new Error('Required parameter taxType was null or undefined when calling deleteCustomTaxes.');
            }
            let httpRequestParams: any = {
                method: 'DELETE',
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
         * Update custom agast for one company
         * This method operation create a custom agast for one company 
         * @param companyId Company ID
         * @param taxType Tax Type
         * @param body Transaction Message
         */
        public updateCustomTaxes (companyId: string, taxType: string, body: CustomTaxTypeRate, extraHttpRequestParams?: any ) : ng.IHttpPromise<{}> {
            const localVarPath = this.basePath + '/companies/{companyId}/taxrates/{taxType}'
                .replace('{' + 'companyId' + '}', String(companyId))
                .replace('{' + 'taxType' + '}', String(taxType));

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            // verify required parameter 'companyId' is not null or undefined
            if (companyId === null || companyId === undefined) {
                throw new Error('Required parameter companyId was null or undefined when calling updateCustomTaxes.');
            }
            // verify required parameter 'taxType' is not null or undefined
            if (taxType === null || taxType === undefined) {
                throw new Error('Required parameter taxType was null or undefined when calling updateCustomTaxes.');
            }
            // verify required parameter 'body' is not null or undefined
            if (body === null || body === undefined) {
                throw new Error('Required parameter body was null or undefined when calling updateCustomTaxes.');
            }
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
    }
}