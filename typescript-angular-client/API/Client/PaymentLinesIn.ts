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

    export interface PaymentLinesIn {
        /**
         * Installment number in this document
         */
        "lineCode"?: number;

        "lineType"?: PaymentLinesIn.LineTypeEnum;

        /**
         * Bill transaction code This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc.
         */
        "itemCode": string;

        /**
         * Free description about this payment
         */
        "itemDescription"?: string;

        /**
         * Installment number, when paid AS IS
         */
        "itemDocNumber"?: string;

        /**
         * Penalty, usually because paid after due date
         */
        "lineUntaxedPenality"?: number;

        /**
         * unconditional discounts
         */
        "lineUntaxedDiscount"?: number;

        /**
         * Net value, the net Value is Gross value plus penalty minus sum of discount and withhold taxes
         */
        "lineNetValue"?: number;

    }

    export namespace PaymentLinesIn {
        export enum LineTypeEnum {
            Installment = <any> 'installment'
        }
    }
}