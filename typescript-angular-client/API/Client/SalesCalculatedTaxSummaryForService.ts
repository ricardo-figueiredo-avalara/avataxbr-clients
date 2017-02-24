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

    export interface SalesCalculatedTaxSummaryForService {
        /**
         * Count of lines
         */
        "numberOfLines"?: number;

        /**
         * sum of all line tax attribute
         */
        "subtotal"?: number;

        /**
         * sum of all line lineAmount attribute
         */
        "totalTax"?: number;

        /**
         * sum of all line lineAmount attribute - sum of all line tax attribute - sum of all line lineTaxedDiscount attribute
         */
        "grandTotal"?: number;

        "taxByType"?: SalesCalculatedTaxSummaryForServiceTaxByType;

    }

}
