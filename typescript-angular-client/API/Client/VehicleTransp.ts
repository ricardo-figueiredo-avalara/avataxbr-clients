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
