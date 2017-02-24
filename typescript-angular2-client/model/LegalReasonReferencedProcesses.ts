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

import * as models from './models';

export interface LegalReasonReferencedProcesses {
    /**
     * Process Identifier (NFe <nProc> tag)
     */
    nProc?: string;

    /**
     * Process Origin (NFe <indProc> tag) - '0' # SEFAZ; - '1' # Justiça Federal; - '2' # Justiça Estadual; - '3' # Secex/RFB; - '9' # Outros 
     */
    indProc?: LegalReasonReferencedProcesses.IndProcEnum;

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
