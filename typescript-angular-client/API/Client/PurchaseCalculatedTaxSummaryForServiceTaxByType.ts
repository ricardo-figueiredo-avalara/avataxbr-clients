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
     * Object with summary of all taxes returned by engine
     */
    export interface PurchaseCalculatedTaxSummaryForServiceTaxByType {
        "issRf"?: TaxByTypeSummaryForService;

        "pisRf"?: TaxByTypeSummaryForService;

        "cofinsRf"?: TaxByTypeSummaryForService;

        "csllRf"?: TaxByTypeSummaryForService;

        "irrf"?: TaxByTypeSummaryForService;

        "inssRf"?: TaxByTypeSummaryForService;

        "inssAr"?: TaxByTypeSummaryForService;

        "pis"?: TaxByTypeSummaryForService;

        "cofins"?: TaxByTypeSummaryForService;

    }

}
