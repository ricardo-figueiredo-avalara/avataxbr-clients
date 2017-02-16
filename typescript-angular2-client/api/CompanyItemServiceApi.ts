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
export class CompanyItemServiceApi {
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
     * Change the code of a given item. 
     * @param companyId Company ID
     * @param code Item Code
     * @param body Requisition
     * @param goods Provide to apply to goods items.
     * @param service Provide to apply to service items.
     */
    public companiesCompanyIdItemsCodeChangeCodePut(companyId: string, code: string, body: models.Body1, goods?: string, service?: string, extraHttpRequestParams?: any): Observable<{}> {
        return this.companiesCompanyIdItemsCodeChangeCodePutWithHttpInfo(companyId, code, body, goods, service, extraHttpRequestParams)
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
     * @param code Item Code
     * @param avalaraProductType Avalara Product Type
     * @param agast Custom Agast Code
     */
    public companiesCompanyIdItemsCodeserviceGet(companyId: string, code: string, avalaraProductType?: string, agast?: string, extraHttpRequestParams?: any): Observable<models.ItemSimple> {
        return this.companiesCompanyIdItemsCodeserviceGetWithHttpInfo(companyId, code, avalaraProductType, agast, extraHttpRequestParams)
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
     * @param avalaraProductType Avalara Product Type
     * @param xPaginationLimit The per page limit. Currently set to 10 but subject to change at any time (max 100).
     * @param xPaginationCurrentPage The current page. Defaults to 1.
     * @param xPaginationSort 
     * @param code Item Code
     * @param agast Custom Agast Code
     */
    public companiesCompanyIdItemsserviceGet(companyId: string, avalaraProductType?: string, xPaginationLimit?: number, xPaginationCurrentPage?: number, xPaginationSort?: string, code?: string, agast?: string, extraHttpRequestParams?: any): Observable<Array<models.ItemSimple>> {
        return this.companiesCompanyIdItemsserviceGetWithHttpInfo(companyId, avalaraProductType, xPaginationLimit, xPaginationCurrentPage, xPaginationSort, code, agast, extraHttpRequestParams)
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
     * @param avalaraProductType Avalara Product Type
     */
    public createItemService(companyId: string, body: models.ItemSimple, avalaraProductType?: string, extraHttpRequestParams?: any): Observable<models.InlineResponse201> {
        return this.createItemServiceWithHttpInfo(companyId, body, avalaraProductType, extraHttpRequestParams)
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
     * @param code Item Code
     * @param avalaraProductType Avalara Product Type
     */
    public deleteItemService(companyId: string, code: string, avalaraProductType?: string, extraHttpRequestParams?: any): Observable<{}> {
        return this.deleteItemServiceWithHttpInfo(companyId, code, avalaraProductType, extraHttpRequestParams)
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
     * @param code Item Code
     * @param body Transaction Message
     * @param avalaraProductType Avalara Product Type
     */
    public updateItemService(companyId: string, code: string, body: models.ItemSimple, avalaraProductType?: string, extraHttpRequestParams?: any): Observable<{}> {
        return this.updateItemServiceWithHttpInfo(companyId, code, body, avalaraProductType, extraHttpRequestParams)
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
     * Change the code of a given item. 
     * @param companyId Company ID
     * @param code Item Code
     * @param body Requisition
     * @param goods Provide to apply to goods items.
     * @param service Provide to apply to service items.
     */
    public companiesCompanyIdItemsCodeChangeCodePutWithHttpInfo(companyId: string, code: string, body: models.Body1, goods?: string, service?: string, extraHttpRequestParams?: any): Observable<Response> {
        const path = this.basePath + `/companies/${companyId}/items/${code}/change-code`;

        let queryParameters = new URLSearchParams();
        let headers = new Headers(this.defaultHeaders.toJSON()); // https://github.com/angular/angular/issues/6845
        // verify required parameter 'companyId' is not null or undefined
        if (companyId === null || companyId === undefined) {
            throw new Error('Required parameter companyId was null or undefined when calling companiesCompanyIdItemsCodeChangeCodePut.');
        }
        // verify required parameter 'code' is not null or undefined
        if (code === null || code === undefined) {
            throw new Error('Required parameter code was null or undefined when calling companiesCompanyIdItemsCodeChangeCodePut.');
        }
        // verify required parameter 'body' is not null or undefined
        if (body === null || body === undefined) {
            throw new Error('Required parameter body was null or undefined when calling companiesCompanyIdItemsCodeChangeCodePut.');
        }
        if (goods !== undefined) {
            queryParameters.set('goods', <any>goods);
        }
        if (service !== undefined) {
            queryParameters.set('service', <any>service);
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

    /**
     * 
     * This operation return custom agast configurations that match with parameters queries 
     * @param companyId Company ID
     * @param code Item Code
     * @param avalaraProductType Avalara Product Type
     * @param agast Custom Agast Code
     */
    public companiesCompanyIdItemsCodeserviceGetWithHttpInfo(companyId: string, code: string, avalaraProductType?: string, agast?: string, extraHttpRequestParams?: any): Observable<Response> {
        const path = this.basePath + `/companies/${companyId}/items/${code}?service`;

        let queryParameters = new URLSearchParams();
        let headers = new Headers(this.defaultHeaders.toJSON()); // https://github.com/angular/angular/issues/6845
        // verify required parameter 'companyId' is not null or undefined
        if (companyId === null || companyId === undefined) {
            throw new Error('Required parameter companyId was null or undefined when calling companiesCompanyIdItemsCodeserviceGet.');
        }
        // verify required parameter 'code' is not null or undefined
        if (code === null || code === undefined) {
            throw new Error('Required parameter code was null or undefined when calling companiesCompanyIdItemsCodeserviceGet.');
        }
        if (agast !== undefined) {
            queryParameters.set('agast', <any>agast);
        }

        headers.set('Avalara-Product-Type', String(avalaraProductType));

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
     * @param avalaraProductType Avalara Product Type
     * @param xPaginationLimit The per page limit. Currently set to 10 but subject to change at any time (max 100).
     * @param xPaginationCurrentPage The current page. Defaults to 1.
     * @param xPaginationSort 
     * @param code Item Code
     * @param agast Custom Agast Code
     */
    public companiesCompanyIdItemsserviceGetWithHttpInfo(companyId: string, avalaraProductType?: string, xPaginationLimit?: number, xPaginationCurrentPage?: number, xPaginationSort?: string, code?: string, agast?: string, extraHttpRequestParams?: any): Observable<Response> {
        const path = this.basePath + `/companies/${companyId}/items?service`;

        let queryParameters = new URLSearchParams();
        let headers = new Headers(this.defaultHeaders.toJSON()); // https://github.com/angular/angular/issues/6845
        // verify required parameter 'companyId' is not null or undefined
        if (companyId === null || companyId === undefined) {
            throw new Error('Required parameter companyId was null or undefined when calling companiesCompanyIdItemsserviceGet.');
        }
        if (code !== undefined) {
            queryParameters.set('code', <any>code);
        }
        if (agast !== undefined) {
            queryParameters.set('agast', <any>agast);
        }

        headers.set('Avalara-Product-Type', String(avalaraProductType));
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
     * Create custom agast for one company
     * This method operation create a custom agast for one company 
     * @param companyId Company ID
     * @param body Transaction Message
     * @param avalaraProductType Avalara Product Type
     */
    public createItemServiceWithHttpInfo(companyId: string, body: models.ItemSimple, avalaraProductType?: string, extraHttpRequestParams?: any): Observable<Response> {
        const path = this.basePath + `/companies/${companyId}/items?service`;

        let queryParameters = new URLSearchParams();
        let headers = new Headers(this.defaultHeaders.toJSON()); // https://github.com/angular/angular/issues/6845
        // verify required parameter 'companyId' is not null or undefined
        if (companyId === null || companyId === undefined) {
            throw new Error('Required parameter companyId was null or undefined when calling createItemService.');
        }
        // verify required parameter 'body' is not null or undefined
        if (body === null || body === undefined) {
            throw new Error('Required parameter body was null or undefined when calling createItemService.');
        }

        headers.set('Avalara-Product-Type', String(avalaraProductType));

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
     * @param code Item Code
     * @param avalaraProductType Avalara Product Type
     */
    public deleteItemServiceWithHttpInfo(companyId: string, code: string, avalaraProductType?: string, extraHttpRequestParams?: any): Observable<Response> {
        const path = this.basePath + `/companies/${companyId}/items/${code}?service`;

        let queryParameters = new URLSearchParams();
        let headers = new Headers(this.defaultHeaders.toJSON()); // https://github.com/angular/angular/issues/6845
        // verify required parameter 'companyId' is not null or undefined
        if (companyId === null || companyId === undefined) {
            throw new Error('Required parameter companyId was null or undefined when calling deleteItemService.');
        }
        // verify required parameter 'code' is not null or undefined
        if (code === null || code === undefined) {
            throw new Error('Required parameter code was null or undefined when calling deleteItemService.');
        }

        headers.set('Avalara-Product-Type', String(avalaraProductType));

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
     * @param code Item Code
     * @param body Transaction Message
     * @param avalaraProductType Avalara Product Type
     */
    public updateItemServiceWithHttpInfo(companyId: string, code: string, body: models.ItemSimple, avalaraProductType?: string, extraHttpRequestParams?: any): Observable<Response> {
        const path = this.basePath + `/companies/${companyId}/items/${code}?service`;

        let queryParameters = new URLSearchParams();
        let headers = new Headers(this.defaultHeaders.toJSON()); // https://github.com/angular/angular/issues/6845
        // verify required parameter 'companyId' is not null or undefined
        if (companyId === null || companyId === undefined) {
            throw new Error('Required parameter companyId was null or undefined when calling updateItemService.');
        }
        // verify required parameter 'code' is not null or undefined
        if (code === null || code === undefined) {
            throw new Error('Required parameter code was null or undefined when calling updateItemService.');
        }
        // verify required parameter 'body' is not null or undefined
        if (body === null || body === undefined) {
            throw new Error('Required parameter body was null or undefined when calling updateItemService.');
        }

        headers.set('Avalara-Product-Type', String(avalaraProductType));

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
