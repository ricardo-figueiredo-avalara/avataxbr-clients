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

    export interface CompanyConfiguration {
        /**
         * digital certificate A1 model, p12, encoded by base64
         */
        "certificate"?: string;

        /**
         * certificate password
         */
        "certificatepwd"?: string;

        /**
         * expiration date of this certificate
         */
        "certificateexpiration"?: Date;

        /**
         * company logo image encoded by base64
         */
        "logo"?: string;

        /**
         * how the document will be printed - '0' # without DANFE; - '1' # DANFe Letter; - '2' # DANFe Landscape; 
         */
        "tpImpNFe"?: CompanyConfiguration.TpImpNFeEnum;

        /**
         * how the document will be printed - '0' # without DANFE; - '4' # DANFe NFC-e; - '5' # DANFe NFC-e e-mail 
         */
        "tpImpNFCe"?: CompanyConfiguration.TpImpNFCeEnum;

    }

    export namespace CompanyConfiguration {
        export enum TpImpNFeEnum {
            _0 = <any> '0',
            _1 = <any> '1',
            _2 = <any> '2'
        }
        export enum TpImpNFCeEnum {
            _0 = <any> '0',
            _4 = <any> '4',
            _5 = <any> '5'
        }
    }
}
