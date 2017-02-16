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

/**
 * Referenced Invoices The invoice can be one of this types, - 'refNFe - Eletronic Invoice' - 'refCTE - Transport Invoice' - 'refECF - Reatail Cupom' - 'refNF  - Invoice model 1 or 1A' - 'refFarmerNF - farmer invoice' 
 */
export interface NRef {
    type?: NRef.TypeEnum;

    refNFe?: string;

    refCTe?: string;

    refECF?: models.NRefRefECF;

    refNF?: models.NRefRefNF;

    refFarmerNF?: models.NRefRefFarmerNF;

}
export namespace NRef {
    export enum TypeEnum {
        RefNFe = <any> 'refNFe',
        RefCTE = <any> 'refCTE',
        RefECF = <any> 'refECF',
        RefNF = <any> 'refNF',
        RefFarmerNF = <any> 'refFarmerNF'
    }
}