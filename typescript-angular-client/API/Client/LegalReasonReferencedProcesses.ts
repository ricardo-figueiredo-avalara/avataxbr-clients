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

    export interface LegalReasonReferencedProcesses {
        /**
         * Process Identifier (NFe <nProc> tag)
         */
        "nProc"?: string;

        /**
         * Process Origin (NFe <indProc> tag) - '0' # SEFAZ; - '1' # Justiça Federal; - '2' # Justiça Estadual; - '3' # Secex/RFB; - '9' # Outros 
         */
        "indProc"?: LegalReasonReferencedProcesses.IndProcEnum;

    }

    export namespace LegalReasonReferencedProcesses {
        export enum IndProcEnum {
            _0 = <any> '0',
            _1 = <any> '1',
            _2 = <any> '2',
            _3 = <any> '3',
            _9 = <any> '9'
        }
    }
}
