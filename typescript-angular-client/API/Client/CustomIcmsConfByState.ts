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

    export interface CustomIcmsConfByState {
        /**
         * Identify the IcmsConfState in namespace
         */
        "code": string;

        "state": StateEnum;

        /**
         * name for this configuration
         */
        "name"?: string;

        /**
         * date when this configuration values starts
         */
        "startDate"?: Date;

        /**
         * date when this configuration values expire
         */
        "expirationDate"?: Date;

        /**
         * set this configuration to Inactive
         */
        "inactive"?: boolean;

        /**
         * inform that the item linked to this configuration is subject to ICMS ST on this state
         */
        "subjectToST"?: boolean;

        /**
         * On sales process inform the CST hat the item linked to this configuration is subject to for the own ICMS - '00' # TAXABLE - '20' # TAXABLE WITH BASE DISCOUNT - '40' # EXEMPT - '41' # NOT TAXABLE - '50' # SUSPENDED 
         */
        "icmsCST"?: CustomIcmsConfByState.IcmsCSTEnum;

        /**
         * how this ICMS will be calculed for itens linked to this configuration
         */
        "calcMode"?: CustomIcmsConfByState.CalcModeEnum;

        /**
         * discount if the item is subject to monophase PIS/COFINS for transactions inside state
         */
        "discountRateForMonoPhase"?: number;

        /**
         * ICMS rate
         */
        "rate"?: number;

        /**
         * ICMS rate
         */
        "icmsBaseDiscount"?: number;

        /**
         * SRP or MMSRP amount base for this icms configuration
         */
        "msrp"?: number;

        /**
         * ICMS mva rate to define calc base
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

        /**
         * Fundo de Combate à pobreza / Fund Against Poverty
         */
        "fcpRate"?: number;

        "icmsSTConf"?: IcmsConfByStateIcmsSTConf;

        /**
         * the map key is state code
         */
        "icmsInterStateConf"?: Array<IcmsConfInterState>;

        /**
         * Company ID
         */
        "companyId": string;

    }

    export namespace CustomIcmsConfByState {
        export enum IcmsCSTEnum {
            _00 = <any> '00',
            _20 = <any> '20',
            _40 = <any> '40',
            _41 = <any> '41',
            _50 = <any> '50'
        }
        export enum CalcModeEnum {
            BYMVARATE = <any> 'BYMVARATE',
            SRP = <any> 'SRP',
            MMSRP = <any> 'MMSRP',
            OPERATIONAMOUNT = <any> 'OPERATIONAMOUNT'
        }
    }
}