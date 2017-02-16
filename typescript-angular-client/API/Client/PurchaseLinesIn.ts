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

    export interface PurchaseLinesIn {
        /**
         * This string is a unique identifier for this line in the transaction
         */
        "lineCode"?: number;

        /**
         * This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU and is required for SST states.
         */
        "itemCode": string;

        /**
         * This decimal captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1
         */
        "numberOfItems"?: number;

        /**
         * This decimal captures the total cost of this line. In its simplest form lineAmount = (item price * numberOfItems).
         */
        "lineAmount"?: number;

        /**
         * This string captures the description of the item represented by this line, will be used LC 116
         */
        "itemDescription"?: string;

        /**
         * Conditional discount
         */
        "lineTaxedDiscount"?: number;

        /**
         * Unconditional discount
         */
        "lineUntaxedDiscount"?: number;

        /**
         * Type of entity use associated with this line - 'resale' - 'production' - 'use or consumption' - 'fixed assets' 
         */
        "useType"?: PurchaseLinesIn.UseTypeEnum;

        "taxDeductions"?: SalesLinesOutTaxDeductions;

    }

    export namespace PurchaseLinesIn {
        export enum UseTypeEnum {
            Resale = <any> 'resale',
            Production = <any> 'production',
            UseOrConsumption = <any> 'use or consumption',
            FixedAssets = <any> 'fixed assets'
        }
    }
}