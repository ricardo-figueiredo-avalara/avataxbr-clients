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

    export class AGASTApi {
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
         * This operation return agast configurations that match with parameters queries 
         * @param code Agast Code
         */
        public agastsCodeGet (code: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<Agast> {
            const localVarPath = this.basePath + '/agasts/{code}'
                .replace('{' + 'code' + '}', String(code));

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            // verify required parameter 'code' is not null or undefined
            if (code === null || code === undefined) {
                throw new Error('Required parameter code was null or undefined when calling agastsCodeGet.');
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
         * Create agast
         * This method operation create a AGAST 
         * @param body Transaction Message
         */
        public createAgast (body: Agast, extraHttpRequestParams?: any ) : ng.IHttpPromise<InlineResponse201> {
            const localVarPath = this.basePath + '/agasts';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            // verify required parameter 'body' is not null or undefined
            if (body === null || body === undefined) {
                throw new Error('Required parameter body was null or undefined when calling createAgast.');
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
         * @param code Agast Code
         */
        public deleteAgast (code: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<{}> {
            const localVarPath = this.basePath + '/agasts/{code}'
                .replace('{' + 'code' + '}', String(code));

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            // verify required parameter 'code' is not null or undefined
            if (code === null || code === undefined) {
                throw new Error('Required parameter code was null or undefined when calling deleteAgast.');
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
         * 
         * This operation return agast configurations that match with parameters queries 
         * @param text Text query
         */
        public getAgastList (text?: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<Array<InlineResponse2001>> {
            const localVarPath = this.basePath + '/agasts';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            if (text !== undefined) {
                queryParameters['text'] = text;
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
         * Update agast
         * This method operation create a agast 
         * @param code Agast Code
         * @param body Transaction Message
         */
        public updateAgast (code: string, body: Agast, extraHttpRequestParams?: any ) : ng.IHttpPromise<{}> {
            const localVarPath = this.basePath + '/agasts/{code}'
                .replace('{' + 'code' + '}', String(code));

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            // verify required parameter 'code' is not null or undefined
            if (code === null || code === undefined) {
                throw new Error('Required parameter code was null or undefined when calling updateAgast.');
            }
            // verify required parameter 'body' is not null or undefined
            if (body === null || body === undefined) {
                throw new Error('Required parameter body was null or undefined when calling updateAgast.');
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