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

export interface SefazInvoiceStatus {
    code?: string;

    desc?: string;

    protocol?: string;

    rec?: string;

    date?: Date;

    /**
     * - '1' # Ambiente de Produção - '2' # Ambiente de Homologação 
     */
    environment?: SefazInvoiceStatus.EnvironmentEnum;

    appVersion?: string;

}
export namespace SefazInvoiceStatus {
    export enum EnvironmentEnum {
        _1 = <any> '1',
        _2 = <any> '2'
    }
}
