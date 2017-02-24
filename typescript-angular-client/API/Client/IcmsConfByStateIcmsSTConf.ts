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

    export interface IcmsConfByStateIcmsSTConf {
        /**
         * inform that substituted is tax regime Simplified the operation MVA will be reduced
         */
        "hasReductionOfMVAForSimples"?: boolean;

        /**
         * mva reduction when substituted is tax regime Simplified.
         */
        "reductionOfMVAForSimples"?: number;

        /**
         * how this ICMS-ST will be calculed for itens linked to this configuration
         */
        "calcMode"?: IcmsConfByStateIcmsSTConf.CalcModeEnum;

        /**
         * ICMS-ST mva rate to define calc base
         */
        "mvaRate"?: number;

        /**
         * ICMS rate - Redução da BC ICMS ST (%)
         */
        "icmsStBaseDiscount"?: number;

        /**
         * SRP or MSRP amount base for this ICMS-ST configuration
         */
        "srp"?: number;

        /**
         * unit used to srv amount value
         */
        "srpUnit"?: string;

    }

    export namespace IcmsConfByStateIcmsSTConf {
        export enum CalcModeEnum {
            BYMVARATE = <any> 'BYMVARATE',
            SRP = <any> 'SRP',
            MSRP = <any> 'MSRP'
        }
    }
}
