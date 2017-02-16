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

    export interface PaymentPaymentMode {
        /**
         * Payment mode - '01' # Dinheiro - '02' # Cheque - '03' # Cartão de Crédito - '04' # Cartão de Débito - '05' # Crédito Loja - '10' # Vale Alimentação - '11' # Vale Refeição - '12' # Vale Presente - '13' # Vale Combustível - '99' # Outros 
         */
        "mode": PaymentPaymentMode.ModeEnum;

        /**
         * payment value
         */
        "value": number;

        /**
         * - '1' # Payment integrated with system, - '2' # Payment not integrated with system 
         */
        "cardTpIntegration"?: PaymentPaymentMode.CardTpIntegrationEnum;

        /**
         * Federal tax id of accrediting card (credenciadora do cartão)
         */
        "cardCNPJ"?: string;

        /**
         * card brand - '01' # Visa - '02' # Mastercard - '03' # American Express - '04' # Sorocred - '99' # Other 
         */
        "cardBrand"?: PaymentPaymentMode.CardBrandEnum;

        /**
         * transaction authorization number
         */
        "cardAuthorization"?: string;

    }

    export namespace PaymentPaymentMode {
        export enum ModeEnum {
            _01 = <any> '01',
            _02 = <any> '02',
            _03 = <any> '03',
            _04 = <any> '04',
            _05 = <any> '05',
            _10 = <any> '10',
            _11 = <any> '11',
            _12 = <any> '12',
            _13 = <any> '13',
            _99 = <any> '99'
        }
        export enum CardTpIntegrationEnum {
            _1 = <any> '1',
            _2 = <any> '2'
        }
        export enum CardBrandEnum {
            _01 = <any> '01',
            _02 = <any> '02',
            _03 = <any> '03',
            _04 = <any> '04',
            _99 = <any> '99'
        }
    }
}