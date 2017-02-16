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

    export class TaxConfCFOPApi {
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
         * create a new CFOP configuration
         * 
         * @param body The pet JSON you want to post
         */
        public createCfop (body: CfopConf, extraHttpRequestParams?: any ) : ng.IHttpPromise<InlineResponse201> {
            const localVarPath = this.basePath + '/taxconf/cfop';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            // verify required parameter 'body' is not null or undefined
            if (body === null || body === undefined) {
                throw new Error('Required parameter body was null or undefined when calling createCfop.');
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
         * disable a CFOP.
         * 
         * @param code CFOP Code
         */
        public deleteCfop (code: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<{}> {
            const localVarPath = this.basePath + '/taxconf/cfop/{code}'
                .replace('{' + 'code' + '}', String(code));

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            // verify required parameter 'code' is not null or undefined
            if (code === null || code === undefined) {
                throw new Error('Required parameter code was null or undefined when calling deleteCfop.');
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
         * get CFOP information.
         * This operation return CFOP configuration 
         * @param code CFOP Code
         */
        public getCfop (code: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<CfopConf> {
            const localVarPath = this.basePath + '/taxconf/cfop/{code}'
                .replace('{' + 'code' + '}', String(code));

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            // verify required parameter 'code' is not null or undefined
            if (code === null || code === undefined) {
                throw new Error('Required parameter code was null or undefined when calling getCfop.');
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
         * retrive list of CFOP.
         * This operation return CFOP configurations that match with parameters queries 
         * @param suffixcode Identify this CFOP, the CFOP Code has two parts N.XXX where N the prefix is the operation scope type if IN or OUT and if is in state, other state, other country and suffix XXX is the operation type 
         * @param date When informed return valid version configuration for this date 
         * @param inactive return the inactive versions too 
         */
        public getCfopList (suffixcode?: string, date?: Date, inactive?: boolean, extraHttpRequestParams?: any ) : ng.IHttpPromise<Array<CfopConf>> {
            const localVarPath = this.basePath + '/taxconf/cfop';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            if (suffixcode !== undefined) {
                queryParameters['suffixcode'] = suffixcode;
            }

            if (date !== undefined) {
                queryParameters['date'] = date;
            }

            if (inactive !== undefined) {
                queryParameters['inactive'] = inactive;
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
         * update a CFOP configuration
         * 
         * @param code CFOP Code
         * @param taxconfcfop The pet JSON you want to post
         */
        public updateCfop (code: string, taxconfcfop: CfopConf, extraHttpRequestParams?: any ) : ng.IHttpPromise<{}> {
            const localVarPath = this.basePath + '/taxconf/cfop/{code}'
                .replace('{' + 'code' + '}', String(code));

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            // verify required parameter 'code' is not null or undefined
            if (code === null || code === undefined) {
                throw new Error('Required parameter code was null or undefined when calling updateCfop.');
            }
            // verify required parameter 'taxconfcfop' is not null or undefined
            if (taxconfcfop === null || taxconfcfop === undefined) {
                throw new Error('Required parameter taxconfcfop was null or undefined when calling updateCfop.');
            }
            let httpRequestParams: any = {
                method: 'PUT',
                url: localVarPath,
                json: true,
                data: taxconfcfop,
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