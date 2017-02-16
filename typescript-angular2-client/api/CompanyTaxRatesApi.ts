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
export class CompanyTaxRatesApi {
    protected basePath = 'https://br16-dev-app03.br.avalara.com/v2';
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
     * 
     * This operation return custom agast configurations that match with parameters queries 
     * @param companyId Company ID
     * @param xPaginationLimit The per page limit. Currently set to 10 but subject to change at any time (max 100).
     * @param xPaginationCurrentPage The current page. Defaults to 1.
     * @param xPaginationSort 
     */
    public companiesCompanyIdTaxratesGet(companyId: string, xPaginationLimit?: number, xPaginationCurrentPage?: number, xPaginationSort?: string, extraHttpRequestParams?: any): Observable<Array<models.CustomTaxTypeRate>> {
        return this.companiesCompanyIdTaxratesGetWithHttpInfo(companyId, xPaginationLimit, xPaginationCurrentPage, xPaginationSort, extraHttpRequestParams)
            .map((response: Response) => {
                if (response.status === 204) {
                    return undefined;
                } else {
                    return response.json();
                }
            });
    }

    /**
     * 
     * This operation return custom agast configurations that match with parameters queries 
     * @param companyId Company ID
     * @param taxType Tax Type
     */
    public companiesCompanyIdTaxratesTaxTypeGet(companyId: string, taxType: string, extraHttpRequestParams?: any): Observable<models.CustomTaxTypeRate> {
        return this.companiesCompanyIdTaxratesTaxTypeGetWithHttpInfo(companyId, taxType, extraHttpRequestParams)
            .map((response: Response) => {
                if (response.status === 204) {
                    return undefined;
                } else {
                    return response.json();
                }
            });
    }

    /**
     * Create custom agast for one company
     * This method operation create a custom agast for one company 
     * @param companyId Company ID
     * @param body Transaction Message
     */
    public createCustomTaxes(companyId: string, body: models.CustomTaxTypeRate, extraHttpRequestParams?: any): Observable<models.InlineResponse201> {
        return this.createCustomTaxesWithHttpInfo(companyId, body, extraHttpRequestParams)
            .map((response: Response) => {
                if (response.status === 204) {
                    return undefined;
                } else {
                    return response.json();
                }
            });
    }

    /**
     * 
     * 
     * @param companyId Company ID
     * @param taxType Tax Type
     */
    public deleteCustomTaxes(companyId: string, taxType: string, extraHttpRequestParams?: any): Observable<{}> {
        return this.deleteCustomTaxesWithHttpInfo(companyId, taxType, extraHttpRequestParams)
            .map((response: Response) => {
                if (response.status === 204) {
                    return undefined;
                } else {
                    return response.json();
                }
            });
    }

    /**
     * Update custom agast for one company
     * This method operation create a custom agast for one company 
     * @param companyId Company ID
     * @param taxType Tax Type
     * @param body Transaction Message
     */
    public updateCustomTaxes(companyId: string, taxType: string, body: models.CustomTaxTypeRate, extraHttpRequestParams?: any): Observable<{}> {
        return this.updateCustomTaxesWithHttpInfo(companyId, taxType, body, extraHttpRequestParams)
            .map((response: Response) => {
                if (response.status === 204) {
                    return undefined;
                } else {
                    return response.json();
                }
            });
    }


    /**
     * 
     * This operation return custom agast configurations that match with parameters queries 
     * @param companyId Company ID
     * @param xPaginationLimit The per page limit. Currently set to 10 but subject to change at any time (max 100).
     * @param xPaginationCurrentPage The current page. Defaults to 1.
     * @param xPaginationSort 
     */
    public companiesCompanyIdTaxratesGetWithHttpInfo(companyId: string, xPaginationLimit?: number, xPaginationCurrentPage?: number, xPaginationSort?: string, extraHttpRequestParams?: any): Observable<Response> {
        const path = this.basePath + `/companies/${companyId}/taxrates`;

        let queryParameters = new URLSearchParams();
        let headers = new Headers(this.defaultHeaders.toJSON()); // https://github.com/angular/angular/issues/6845
        // verify required parameter 'companyId' is not null or undefined
        if (companyId === null || companyId === undefined) {
            throw new Error('Required parameter companyId was null or undefined when calling companiesCompanyIdTaxratesGet.');
        }

        headers.set('X-Pagination-Limit', String(xPaginationLimit));
        headers.set('X-Pagination-Current-Page', String(xPaginationCurrentPage));
        headers.set('X-Pagination-Sort', String(xPaginationSort));

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
     * 
     * This operation return custom agast configurations that match with parameters queries 
     * @param companyId Company ID
     * @param taxType Tax Type
     */
    public companiesCompanyIdTaxratesTaxTypeGetWithHttpInfo(companyId: string, taxType: string, extraHttpRequestParams?: any): Observable<Response> {
        const path = this.basePath + `/companies/${companyId}/taxrates/${taxType}`;

        let queryParameters = new URLSearchParams();
        let headers = new Headers(this.defaultHeaders.toJSON()); // https://github.com/angular/angular/issues/6845
        // verify required parameter 'companyId' is not null or undefined
        if (companyId === null || companyId === undefined) {
            throw new Error('Required parameter companyId was null or undefined when calling companiesCompanyIdTaxratesTaxTypeGet.');
        }
        // verify required parameter 'taxType' is not null or undefined
        if (taxType === null || taxType === undefined) {
            throw new Error('Required parameter taxType was null or undefined when calling companiesCompanyIdTaxratesTaxTypeGet.');
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
     * Create custom agast for one company
     * This method operation create a custom agast for one company 
     * @param companyId Company ID
     * @param body Transaction Message
     */
    public createCustomTaxesWithHttpInfo(companyId: string, body: models.CustomTaxTypeRate, extraHttpRequestParams?: any): Observable<Response> {
        const path = this.basePath + `/companies/${companyId}/taxrates`;

        let queryParameters = new URLSearchParams();
        let headers = new Headers(this.defaultHeaders.toJSON()); // https://github.com/angular/angular/issues/6845
        // verify required parameter 'companyId' is not null or undefined
        if (companyId === null || companyId === undefined) {
            throw new Error('Required parameter companyId was null or undefined when calling createCustomTaxes.');
        }
        // verify required parameter 'body' is not null or undefined
        if (body === null || body === undefined) {
            throw new Error('Required parameter body was null or undefined when calling createCustomTaxes.');
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
            body: body == null ? '' : JSON.stringify(body), // https://github.com/angular/angular/issues/10612
            search: queryParameters
        });
        
        // https://github.com/swagger-api/swagger-codegen/issues/4037
        if (extraHttpRequestParams) {
            requestOptions = this.extendObj(requestOptions, extraHttpRequestParams);
        }

        return this.http.request(path, requestOptions);
    }

    /**
     * 
     * 
     * @param companyId Company ID
     * @param taxType Tax Type
     */
    public deleteCustomTaxesWithHttpInfo(companyId: string, taxType: string, extraHttpRequestParams?: any): Observable<Response> {
        const path = this.basePath + `/companies/${companyId}/taxrates/${taxType}`;

        let queryParameters = new URLSearchParams();
        let headers = new Headers(this.defaultHeaders.toJSON()); // https://github.com/angular/angular/issues/6845
        // verify required parameter 'companyId' is not null or undefined
        if (companyId === null || companyId === undefined) {
            throw new Error('Required parameter companyId was null or undefined when calling deleteCustomTaxes.');
        }
        // verify required parameter 'taxType' is not null or undefined
        if (taxType === null || taxType === undefined) {
            throw new Error('Required parameter taxType was null or undefined when calling deleteCustomTaxes.');
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
     * Update custom agast for one company
     * This method operation create a custom agast for one company 
     * @param companyId Company ID
     * @param taxType Tax Type
     * @param body Transaction Message
     */
    public updateCustomTaxesWithHttpInfo(companyId: string, taxType: string, body: models.CustomTaxTypeRate, extraHttpRequestParams?: any): Observable<Response> {
        const path = this.basePath + `/companies/${companyId}/taxrates/${taxType}`;

        let queryParameters = new URLSearchParams();
        let headers = new Headers(this.defaultHeaders.toJSON()); // https://github.com/angular/angular/issues/6845
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
            body: body == null ? '' : JSON.stringify(body), // https://github.com/angular/angular/issues/10612
            search: queryParameters
        });
        
        // https://github.com/swagger-api/swagger-codegen/issues/4037
        if (extraHttpRequestParams) {
            requestOptions = this.extendObj(requestOptions, extraHttpRequestParams);
        }

        return this.http.request(path, requestOptions);
    }

}
