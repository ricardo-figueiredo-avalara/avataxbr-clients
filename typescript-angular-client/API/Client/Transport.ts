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

    export interface Transport {
        /**
         * Freight model  - 0 - CIF,  - 1 - FOB,  - 2 - Thrid party, - 9 - Free shipping when 9 - Free shipping, the fields below will be ignored if present - 'transporter' - 'withholdICMSTransport' - 'volumes' - 'vehicle' 
         */
        "modFreight": Transport.ModFreightEnum;

        /**
         * Forces witholding of ICMS on transport amount (freight)
         */
        "withholdICMSTransport"?: boolean;

        /**
         * Packages
         */
        "volumes"?: Array<TransportVolumes>;

        "vehicle"?: VehicleTransp;

    }

    export namespace Transport {
        export enum ModFreightEnum {
            CIF = <any> 'CIF',
            FOB = <any> 'FOB',
            Thridparty = <any> 'Thridparty',
            FreeShipping = <any> 'FreeShipping'
        }
    }
}
