/**
 * AvaTax Brazil
 * The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

import { Inject, Injectable, Optional }                      from '@angular/core';
import { Http, Headers, URLSearchParams }                    from '@angular/http';
import { RequestMethod, RequestOptions, RequestOptionsArgs } from '@angular/http';
import { Response, ResponseContentType }                     from '@angular/http';

import { Observable }                                        from 'rxjs/Observable';
import 'rxjs/add/operator/map';

import * as models                                           from '../model/models';
import { BASE_PATH }                                         from '../variables';
import { Configuration }                                     from '../configuration';

/* tslint:disable:no-unused-variable member-ordering */


@Injectable()
export class TaxConfIBPTApi {
    protected basePath = 'http://avataxbr-sandbox.avalarabrasil.com.br/v2';
    public defaultHeaders: Headers = new Headers();
    public configuration: Configuration = new Configuration();

    constructor(protected http: Http, @Optional()@Inject(BASE_PATH) basePath: string, @Optional() configuration: Configuration) {
        if (basePath) {
            this.basePath = basePath;
        }
        if (configuration) {
            this.configuration = configuration;
        }
    }

    /**
     * 
     * Extends object by coping non-existing properties.
     * @param objA object to be extended
     * @param objB source object
     */
    private extendObj<T1,T2>(objA: T1, objB: T2) {
        for(let key in objB){
            if(objB.hasOwnProperty(key)){
                (objA as any)[key] = (objB as any)[key];
            }
        }
        return <T1&T2>objA;
    }

    /**
     * create a new Process Type configuration
     * 
     * @param taxconfprocess The pet JSON you want to post
     */
    public createIbptConf(taxconfprocess: models.IbptConf, extraHttpRequestParams?: any): Observable<models.InlineResponse201> {
        return this.createIbptConfWithHttpInfo(taxconfprocess, extraHttpRequestParams)
            .map((response: Response) => {
                if (response.status === 204) {
                    return undefined;
                } else {
                    return response.json();
                }
            });
    }

    /**
     * disable a IBPT.
     * 
     * @param code IBPT Code
     */
    public deleteIbptConf(code: string, extraHttpRequestParams?: any): Observable<{}> {
        return this.deleteIbptConfWithHttpInfo(code, extraHttpRequestParams)
            .map((response: Response) => {
                if (response.status === 204) {
                    return undefined;
                } else {
                    return response.json();
                }
            });
    }

    /**
     * get IBPT information.
     * This operation return Process Type configuration 
     * @param code IBPT Code
     */
    public getIbptConf(code: string, extraHttpRequestParams?: any): Observable<models.IbptConf> {
        return this.getIbptConfWithHttpInfo(code, extraHttpRequestParams)
            .map((response: Response) => {
                if (response.status === 204) {
                    return undefined;
                } else {
                    return response.json();
                }
            });
    }

    /**
     * retrive list of IBPT.
     * This operation return Process Type configurations that match with parameters queries 
     * @param accountId filter the configuration by accountID, if not informed, only the standard configuration will be returned 
     * @param date When informed return valid version configuration for this date 
     * @param inactive return the inactive versions too 
     */
    public getIbptConfList(accountId?: string, date?: Date, inactive?: boolean, extraHttpRequestParams?: any): Observable<Array<models.IbptConf>> {
        return this.getIbptConfListWithHttpInfo(accountId, date, inactive, extraHttpRequestParams)
            .map((response: Response) => {
                if (response.status === 204) {
                    return undefined;
                } else {
                    return response.json();
                }
            });
    }

    /**
     * update a Process Type configuration
     * 
     * @param code IBPT Code
     * @param taxconfprocess The pet JSON you want to post
     */
    public updateIbptConf(code: string, taxconfprocess: models.IbptConf, extraHttpRequestParams?: any): Observable<{}> {
        return this.updateIbptConfWithHttpInfo(code, taxconfprocess, extraHttpRequestParams)
            .map((response: Response) => {
                if (response.status === 204) {
                    return undefined;
                } else {
                    return response.json();
                }
            });
    }


    /**
     * create a new Process Type configuration
     * 
     * @param taxconfprocess The pet JSON you want to post
     */
    public createIbptConfWithHttpInfo(taxconfprocess: models.IbptConf, extraHttpRequestParams?: any): Observable<Response> {
        const path = this.basePath + `/taxconf/ibpt`;

        let queryParameters = new URLSearchParams();
        let headers = new Headers(this.defaultHeaders.toJSON()); // https://github.com/angular/angular/issues/6845
        // verify required parameter 'taxconfprocess' is not null or undefined
        if (taxconfprocess === null || taxconfprocess === undefined) {
            throw new Error('Required parameter taxconfprocess was null or undefined when calling createIbptConf.');
        }


        // to determine the Content-Type header
        let consumes: string[] = [
            'application/json'
        ];

        // to determine the Accept header
        let produces: string[] = [
            'application/json'
        ];
        
            

        headers.set('Content-Type', 'application/json');


        let requestOptions: RequestOptionsArgs = new RequestOptions({
            method: RequestMethod.Post,
            headers: headers,
            body: taxconfprocess == null ? '' : JSON.stringify(taxconfprocess), // https://github.com/angular/angular/issues/10612
            search: queryParameters
        });
        
        // https://github.com/swagger-api/swagger-codegen/issues/4037
        if (extraHttpRequestParams) {
            requestOptions = this.extendObj(requestOptions, extraHttpRequestParams);
        }

        return this.http.request(path, requestOptions);
    }

    /**
     * disable a IBPT.
     * 
     * @param code IBPT Code
     */
    public deleteIbptConfWithHttpInfo(code: string, extraHttpRequestParams?: any): Observable<Response> {
        const path = this.basePath + `/taxconf/ibpt/${code}`;

        let queryParameters = new URLSearchParams();
        let headers = new Headers(this.defaultHeaders.toJSON()); // https://github.com/angular/angular/issues/6845
        // verify required parameter 'code' is not null or undefined
        if (code === null || code === undefined) {
            throw new Error('Required parameter code was null or undefined when calling deleteIbptConf.');
        }


        // to determine the Content-Type header
        let consumes: string[] = [
            'application/json'
        ];

        // to determine the Accept header
        let produces: string[] = [
            'application/json'
        ];
        
            



        let requestOptions: RequestOptionsArgs = new RequestOptions({
            method: RequestMethod.Delete,
            headers: headers,
            search: queryParameters
        });
        
        // https://github.com/swagger-api/swagger-codegen/issues/4037
        if (extraHttpRequestParams) {
            requestOptions = this.extendObj(requestOptions, extraHttpRequestParams);
        }

        return this.http.request(path, requestOptions);
    }

    /**
     * get IBPT information.
     * This operation return Process Type configuration 
     * @param code IBPT Code
     */
    public getIbptConfWithHttpInfo(code: string, extraHttpRequestParams?: any): Observable<Response> {
        const path = this.basePath + `/taxconf/ibpt/${code}`;

        let queryParameters = new URLSearchParams();
        let headers = new Headers(this.defaultHeaders.toJSON()); // https://github.com/angular/angular/issues/6845
        // verify required parameter 'code' is not null or undefined
        if (code === null || code === undefined) {
            throw new Error('Required parameter code was null or undefined when calling getIbptConf.');
        }


        // to determine the Content-Type header
        let consumes: string[] = [
            'application/json'
        ];

        // to determine the Accept header
        let produces: string[] = [
            'application/json'
        ];
        
            



        let requestOptions: RequestOptionsArgs = new RequestOptions({
            method: RequestMethod.Get,
            headers: headers,
            search: queryParameters
        });
        
        // https://github.com/swagger-api/swagger-codegen/issues/4037
        if (extraHttpRequestParams) {
            requestOptions = this.extendObj(requestOptions, extraHttpRequestParams);
        }

        return this.http.request(path, requestOptions);
    }

    /**
     * retrive list of IBPT.
     * This operation return Process Type configurations that match with parameters queries 
     * @param accountId filter the configuration by accountID, if not informed, only the standard configuration will be returned 
     * @param date When informed return valid version configuration for this date 
     * @param inactive return the inactive versions too 
     */
    public getIbptConfListWithHttpInfo(accountId?: string, date?: Date, inactive?: boolean, extraHttpRequestParams?: any): Observable<Response> {
        const path = this.basePath + `/taxconf/ibpt`;

        let queryParameters = new URLSearchParams();
        let headers = new Headers(this.defaultHeaders.toJSON()); // https://github.com/angular/angular/issues/6845
        if (accountId !== undefined) {
            queryParameters.set('accountId', <any>accountId);
        }
        if (date !== undefined) {
            queryParameters.set('date', <any>date);
        }
        if (inactive !== undefined) {
            queryParameters.set('inactive', <any>inactive);
        }


        // to determine the Content-Type header
        let consumes: string[] = [
            'application/json'
        ];

        // to determine the Accept header
        let produces: string[] = [
            'application/json'
        ];
        
            



        let requestOptions: RequestOptionsArgs = new RequestOptions({
            method: RequestMethod.Get,
            headers: headers,
            search: queryParameters
        });
        
        // https://github.com/swagger-api/swagger-codegen/issues/4037
        if (extraHttpRequestParams) {
            requestOptions = this.extendObj(requestOptions, extraHttpRequestParams);
        }

        return this.http.request(path, requestOptions);
    }

    /**
     * update a Process Type configuration
     * 
     * @param code IBPT Code
     * @param taxconfprocess The pet JSON you want to post
     */
    public updateIbptConfWithHttpInfo(code: string, taxconfprocess: models.IbptConf, extraHttpRequestParams?: any): Observable<Response> {
        const path = this.basePath + `/taxconf/ibpt/${code}`;

        let queryParameters = new URLSearchParams();
        let headers = new Headers(this.defaultHeaders.toJSON()); // https://github.com/angular/angular/issues/6845
        // verify required parameter 'code' is not null or undefined
        if (code === null || code === undefined) {
            throw new Error('Required parameter code was null or undefined when calling updateIbptConf.');
        }
        // verify required parameter 'taxconfprocess' is not null or undefined
        if (taxconfprocess === null || taxconfprocess === undefined) {
            throw new Error('Required parameter taxconfprocess was null or undefined when calling updateIbptConf.');
        }


        // to determine the Content-Type header
        let consumes: string[] = [
            'application/json'
        ];

        // to determine the Accept header
        let produces: string[] = [
            'application/json'
        ];
        
            

        headers.set('Content-Type', 'application/json');


        let requestOptions: RequestOptionsArgs = new RequestOptions({
            method: RequestMethod.Put,
            headers: headers,
            body: taxconfprocess == null ? '' : JSON.stringify(taxconfprocess), // https://github.com/angular/angular/issues/10612
            search: queryParameters
        });
        
        // https://github.com/swagger-api/swagger-codegen/issues/4037
        if (extraHttpRequestParams) {
            requestOptions = this.extendObj(requestOptions, extraHttpRequestParams);
        }

        return this.http.request(path, requestOptions);
    }

}
