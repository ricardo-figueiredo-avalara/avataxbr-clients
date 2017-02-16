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

    export interface IcmsTaxConf {
        "state": StateEnum;

        /**
         * On sales process inform the CST hat the item linked to this configuration is subject to - '00' # TAXABLE - '20' # TAXABLE WITH BASE DISCOUNT - '40' # EXEMPT - '41' # NOT TAXABLE - '50' # SUSPENDED 
         */
        "icmsCST"?: IcmsTaxConf.IcmsCSTEnum;

        /**
         * Message to add to NF when this configuration is used
         */
        "messageCode"?: string;

        /**
         * the mapping key is state code / A chave do mapeamento é o código do Estado.
         */
        "relationShip"?: Array<IcmsTaxConfBase>;

    }

    export namespace IcmsTaxConf {
        export enum IcmsCSTEnum {
            _00 = <any> '00',
            _20 = <any> '20',
            _40 = <any> '40',
            _41 = <any> '41',
            _50 = <any> '50'
        }
    }
}