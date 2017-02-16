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

import * as models from './models';

export interface NRefRefECF {
    /**
     * ECF Sequential number that generated Cupom attached to NFe informar o número de ordem seqüencial do ECF que emitiu o Cupom Fiscal vinculado à NF-e 
     */
    nECF: string;

    /**
     * Operational counter number attached to NFe Informar o Número do Contador de Ordem de Operação - COO vinculado à NF-e 
     */
    nCOO: string;

    /**
     * Fiscal document model - '2B' # coupon tax not ECF - '2C' # PDV coupon tax - '2D' # ECF coupon tax 
     */
    modECF: NRefRefECF.ModECFEnum;

}
export namespace NRefRefECF {
    export enum ModECFEnum {
        _2B = <any> '2B',
        _2C = <any> '2C',
        _2D = <any> '2D'
    }
}