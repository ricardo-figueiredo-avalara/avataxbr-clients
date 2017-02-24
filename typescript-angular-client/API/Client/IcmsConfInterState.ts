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

    export interface IcmsConfInterState {
        "state"?: StateEnum;

        /**
         * how this ICMS will be calculed for itens linked to this configuration
         */
        "calcMode"?: IcmsConfInterState.CalcModeEnum;

        /**
         * discount if the item is subject to monophase PIS/COFINS when operation interstate
         */
        "discountRateForMonoPhase"?: number;

        /**
         * ICMS rate
         */
        "rate"?: number;

        /**
         * FCP rate (Fundo de Combate à Probreza / Fund Against Poverty
         */
        "fcpRate"?: number;

        /**
         * ICMS rate
         */
        "icmsBaseDiscount"?: number;

        /**
         * SRP or MMSRP amount base for this icms configuration
         */
        "msrp"?: number;

        /**
         * ICMS MVA rate to define calc base
         */
        "mvaRate"?: number;

        /**
         * unit used to SRP amount value
         */
        "msrpUnit"?: string;

        /**
         * Code for the ICM legal reason, this message will be placed on invoice.
         */
        "icmsLegalReason"?: string;

        "icmsSTConf"?: IcmsConfInterStateIcmsSTConf;

    }

    export namespace IcmsConfInterState {
        export enum CalcModeEnum {
            BYMVARATE = <any> 'BYMVARATE',
            SRP = <any> 'SRP',
            MMSRP = <any> 'MMSRP',
            OPERATIONAMOUNT = <any> 'OPERATIONAMOUNT'
        }
    }
}
