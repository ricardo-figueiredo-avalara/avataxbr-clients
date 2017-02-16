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

    /**
     * Identify type of vehicle used to transport the attributes, except atribute type,  follow rule allOf then only one of this atributes will be informed. 
     */
    export interface VehicleTransp {
        "type"?: VehicleTransp.TypeEnum;

        "automobile"?: VehicleID;

        /**
         * Trailer
         */
        "trailer"?: Array<VehicleID>;

        "wagon"?: string;

        /**
         * Ferry
         */
        "ferry"?: string;

    }

    export namespace VehicleTransp {
        export enum TypeEnum {
            Automobile = <any> 'automobile',
            Wagon = <any> 'wagon',
            Ferry = <any> 'ferry',
            Trailer = <any> 'trailer'
        }
    }
}
