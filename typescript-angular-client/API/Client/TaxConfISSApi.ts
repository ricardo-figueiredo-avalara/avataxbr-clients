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

    export class TaxConfISSApi {
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
         * create a new ISS Configuration
         * 
         * @param issConfByCity The pet JSON you want to post
         */
        public createIssConfByCity (issConfByCity: IssConfByCity, extraHttpRequestParams?: any ) : ng.IHttpPromise<InlineResponse201> {
            const localVarPath = this.basePath + '/taxconf/iss';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            // verify required parameter 'issConfByCity' is not null or undefined
            if (issConfByCity === null || issConfByCity === undefined) {
                throw new Error('Required parameter issConfByCity was null or undefined when calling createIssConfByCity.');
            }
            let httpRequestParams: any = {
                method: 'POST',
                url: localVarPath,
                json: true,
                data: issConfByCity,
                                params: queryParameters,
                headers: headerParams
            };

            if (extraHttpRequestParams) {
                httpRequestParams = this.extendObj(httpRequestParams, extraHttpRequestParams);
            }

            return this.$http(httpRequestParams);
        }
        /**
         * disable a ISS by City Code.
         * 
         * @param cityCode City Code
         */
        public deleteIssConf (cityCode: number, extraHttpRequestParams?: any ) : ng.IHttpPromise<{}> {
            const localVarPath = this.basePath + '/taxconf/iss/{cityCode}'
                .replace('{' + 'cityCode' + '}', String(cityCode));

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            // verify required parameter 'cityCode' is not null or undefined
            if (cityCode === null || cityCode === undefined) {
                throw new Error('Required parameter cityCode was null or undefined when calling deleteIssConf.');
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
         * get ISS information by City Code.
         * This operation return configurations of ISS that match with parameters queries 
         * @param cityCode City Code
         * @param code Identificator of this configuration, it is unique for account or standard namedspace 
         * @param date When informed return valid version configuration for this date 
         * @param inactive return the inctives versions too 
         */
        public getIssConfByCity (cityCode: number, code?: string, date?: Date, inactive?: boolean, extraHttpRequestParams?: any ) : ng.IHttpPromise<Array<IssConfByCity>> {
            const localVarPath = this.basePath + '/taxconf/iss/{cityCode}'
                .replace('{' + 'cityCode' + '}', String(cityCode));

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            // verify required parameter 'cityCode' is not null or undefined
            if (cityCode === null || cityCode === undefined) {
                throw new Error('Required parameter cityCode was null or undefined when calling getIssConfByCity.');
            }
            if (code !== undefined) {
                queryParameters['code'] = code;
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
         * retrive list of ISS
         * This operation return ISS configurations that match with parameters queries 
         * @param suffixcode Identify this ISS 
         * @param date When informed return valid version configuration for this date 
         * @param inactive return the inactive versions too 
         */
        public getIssList (suffixcode?: string, date?: Date, inactive?: boolean, extraHttpRequestParams?: any ) : ng.IHttpPromise<Array<IssConfByCity>> {
            const localVarPath = this.basePath + '/taxconf/iss';

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
         * update a ISS by City Code.
         * 
         * @param cityCode City Code
         * @param issConfByCity The pet JSON you want to post
         */
        public updateIssConfByCity (cityCode: number, issConfByCity: IssConfByCity, extraHttpRequestParams?: any ) : ng.IHttpPromise<{}> {
            const localVarPath = this.basePath + '/taxconf/iss/{cityCode}'
                .replace('{' + 'cityCode' + '}', String(cityCode));

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            // verify required parameter 'cityCode' is not null or undefined
            if (cityCode === null || cityCode === undefined) {
                throw new Error('Required parameter cityCode was null or undefined when calling updateIssConfByCity.');
            }
            // verify required parameter 'issConfByCity' is not null or undefined
            if (issConfByCity === null || issConfByCity === undefined) {
                throw new Error('Required parameter issConfByCity was null or undefined when calling updateIssConfByCity.');
            }
            let httpRequestParams: any = {
                method: 'PUT',
                url: localVarPath,
                json: true,
                data: issConfByCity,
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