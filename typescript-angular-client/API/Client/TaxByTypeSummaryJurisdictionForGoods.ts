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

    export interface TaxByTypeSummaryJurisdictionForGoods {
        /**
         * Jurisdiction used for calctax amount
         */
        "jurisdictionName"?: string;

        /**
         * Type of jurisdiction
         */
        "jurisdictionType"?: TaxByTypeSummaryJurisdictionForGoods.JurisdictionTypeEnum;

        /**
         * sum of referenced tax value by jurisdiction
         */
        "tax"?: number;

    }

    export namespace TaxByTypeSummaryJurisdictionForGoods {
        export enum JurisdictionTypeEnum {
            City = <any> 'City',
            State = <any> 'State',
            Country = <any> 'Country'
        }
    }
}
