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
export class CompanyFilesApi {
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
     * Deletes a company file store.  
     * @param companyId Company ID
     * @param companyId2 Company ID
     */
    public companiesCompanyIdNfseCertificateDelete(companyId: string, companyId2: string, extraHttpRequestParams?: any): Observable<{}> {
        return this.companiesCompanyIdNfseCertificateDeleteWithHttpInfo(companyId, companyId2, extraHttpRequestParams)
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
     * Gets an existing NFSe certificate file for this company. 
     * @param companyId Company ID
     * @param companyId2 Company ID
     * @param peek Use this parameter to check the existence of the file without downloading it.
     */
    public companiesCompanyIdNfseCertificateGet(companyId: string, companyId2: string, peek?: number, extraHttpRequestParams?: any): Observable<{}> {
        return this.companiesCompanyIdNfseCertificateGetWithHttpInfo(companyId, companyId2, peek, extraHttpRequestParams)
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
     * If it still not exists, uploads a new NFSe Certificate file for this company. Send the file as a base64 string. 
     * @param companyId Company ID
     * @param body Content
     */
    public companiesCompanyIdNfseCertificatePost(companyId: string, body: models.Body3, extraHttpRequestParams?: any): Observable<models.InlineResponse2002> {
        return this.companiesCompanyIdNfseCertificatePostWithHttpInfo(companyId, body, extraHttpRequestParams)
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
     * Updates an existing NFSe certificate file for this company. Send the file as a base64 string. 
     * @param companyId Company ID
     * @param companyId2 Company ID
     * @param body Content
     */
    public companiesCompanyIdNfseCertificatePut(companyId: string, companyId2: string, body: models.Body2, extraHttpRequestParams?: any): Observable<models.InlineResponse2002> {
        return this.companiesCompanyIdNfseCertificatePutWithHttpInfo(companyId, companyId2, body, extraHttpRequestParams)
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
     * Deletes a company file store.  
     * @param companyId Company ID
     * @param companyId2 Company ID
     */
    public companiesCompanyIdNfseCertificateDeleteWithHttpInfo(companyId: string, companyId2: string, extraHttpRequestParams?: any): Observable<Response> {
        const path = this.basePath + `/companies/${companyId}/nfse-certificate`;

        let queryParameters = new URLSearchParams();
        let headers = new Headers(this.defaultHeaders.toJSON()); // https://github.com/angular/angular/issues/6845
        // verify required parameter 'companyId' is not null or undefined
        if (companyId === null || companyId === undefined) {
            throw new Error('Required parameter companyId was null or undefined when calling companiesCompanyIdNfseCertificateDelete.');
        }
        // verify required parameter 'companyId2' is not null or undefined
        if (companyId2 === null || companyId2 === undefined) {
            throw new Error('Required parameter companyId2 was null or undefined when calling companiesCompanyIdNfseCertificateDelete.');
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
     * 
     * Gets an existing NFSe certificate file for this company. 
     * @param companyId Company ID
     * @param companyId2 Company ID
     * @param peek Use this parameter to check the existence of the file without downloading it.
     */
    public companiesCompanyIdNfseCertificateGetWithHttpInfo(companyId: string, companyId2: string, peek?: number, extraHttpRequestParams?: any): Observable<Response> {
        const path = this.basePath + `/companies/${companyId}/nfse-certificate`;

        let queryParameters = new URLSearchParams();
        let headers = new Headers(this.defaultHeaders.toJSON()); // https://github.com/angular/angular/issues/6845
        // verify required parameter 'companyId' is not null or undefined
        if (companyId === null || companyId === undefined) {
            throw new Error('Required parameter companyId was null or undefined when calling companiesCompanyIdNfseCertificateGet.');
        }
        // verify required parameter 'companyId2' is not null or undefined
        if (companyId2 === null || companyId2 === undefined) {
            throw new Error('Required parameter companyId2 was null or undefined when calling companiesCompanyIdNfseCertificateGet.');
        }
        if (peek !== undefined) {
            queryParameters.set('peek', <any>peek);
        }


        // to determine the Content-Type header
        let consumes: string[] = [
            'application/json'
        ];

        // to determine the Accept header
        let produces: string[] = [
            'application/octet-stream'
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
     * If it still not exists, uploads a new NFSe Certificate file for this company. Send the file as a base64 string. 
     * @param companyId Company ID
     * @param body Content
     */
    public companiesCompanyIdNfseCertificatePostWithHttpInfo(companyId: string, body: models.Body3, extraHttpRequestParams?: any): Observable<Response> {
        const path = this.basePath + `/companies/${companyId}/nfse-certificate`;

        let queryParameters = new URLSearchParams();
        let headers = new Headers(this.defaultHeaders.toJSON()); // https://github.com/angular/angular/issues/6845
        // verify required parameter 'companyId' is not null or undefined
        if (companyId === null || companyId === undefined) {
            throw new Error('Required parameter companyId was null or undefined when calling companiesCompanyIdNfseCertificatePost.');
        }
        // verify required parameter 'body' is not null or undefined
        if (body === null || body === undefined) {
            throw new Error('Required parameter body was null or undefined when calling companiesCompanyIdNfseCertificatePost.');
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
     * Updates an existing NFSe certificate file for this company. Send the file as a base64 string. 
     * @param companyId Company ID
     * @param companyId2 Company ID
     * @param body Content
     */
    public companiesCompanyIdNfseCertificatePutWithHttpInfo(companyId: string, companyId2: string, body: models.Body2, extraHttpRequestParams?: any): Observable<Response> {
        const path = this.basePath + `/companies/${companyId}/nfse-certificate`;

        let queryParameters = new URLSearchParams();
        let headers = new Headers(this.defaultHeaders.toJSON()); // https://github.com/angular/angular/issues/6845
        // verify required parameter 'companyId' is not null or undefined
        if (companyId === null || companyId === undefined) {
            throw new Error('Required parameter companyId was null or undefined when calling companiesCompanyIdNfseCertificatePut.');
        }
        // verify required parameter 'companyId2' is not null or undefined
        if (companyId2 === null || companyId2 === undefined) {
            throw new Error('Required parameter companyId2 was null or undefined when calling companiesCompanyIdNfseCertificatePut.');
        }
        // verify required parameter 'body' is not null or undefined
        if (body === null || body === undefined) {
            throw new Error('Required parameter body was null or undefined when calling companiesCompanyIdNfseCertificatePut.');
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