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

    export interface SefazDisableRangeIn {
        /**
         * This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity
         */
        "companyLocation"?: string;

        /**
         * This string indicates the type of transaction for which tax should be calculated. - '55' # Nota Fiscal Eletrônica (NF-e) - '65' # Nota Fiscal Eletrônica ao-Consumidor Final (NFC-e) 
         */
        "transactionModel"?: SefazDisableRangeIn.TransactionModelEnum;

        /**
         * Invoice number, sequential unique by invoice serial (Número da nota fiscal) 
         */
        "invoiceSerial"?: number;

        "year"?: number;

        "message"?: string;

        /**
         * First number of disable range.
         */
        "invoiceNumberInit"?: number;

        /**
         * Last number of disable range.
         */
        "invoiceNumberEnd"?: number;

    }

    export namespace SefazDisableRangeIn {
        export enum TransactionModelEnum {
            _55 = <any> '55',
            _65 = <any> '65'
        }
    }
}
