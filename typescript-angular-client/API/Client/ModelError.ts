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

namespace API.Client {
    'use strict';

    export interface ModelError {
        "code"?: number;

        "message": string;

        "field"?: string;

        "value"?: string;

        "in"?: ModelError.ModelInEnum;

    }

    export namespace ModelError {
        export enum ModelInEnum {
            Params = <any> 'params',
            Body = <any> 'body',
            Query = <any> 'query'
        }
    }
}
