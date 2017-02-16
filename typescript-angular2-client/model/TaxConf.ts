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

export interface TaxConf {
    /**
     * main unique identificator
     */
    code: string;

    /**
     * Inform that the process has inventory impact.
     */
    stockImpact?: boolean;

    /**
     * Inform that the process has financial impact.
     */
    financialImpact?: boolean;

    /**
     * Inform if this process is subject to IPI taxation on output process - '50' # Saída Tributada - '51' # Saída Tributável com Alíquota Zero - '52' # Saída Isenta - '53' # Saída Não-Tributada - '54' # Saída Imune 
     */
    cstIPI?: TaxConf.CstIPIEnum;

    /**
     * Legal tax classificação for IPI (enquadramento) When the processo has CST IPI 52 or 54, is mandatory inform Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo=mCnJajU4BKU= 
     */
    ipiLegalTaxClass?: string;

    /**
     * Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE 
     */
    accruablePISTaxation?: TaxConf.AccruablePISTaxationEnum;

    /**
     * When exempt, taxable with zero, suspended, not taxable, this field holds the official code number
     */
    pisExemptLegalReasonCode?: string;

    /**
     * When specifi reason, this field has the description
     */
    pisExemptLegalReason?: string;

    /**
     * Inform if this item by nature is subject to COFINS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE 
     */
    accruableCOFINSTaxation?: TaxConf.AccruableCOFINSTaxationEnum;

    /**
     * When exempt, taxable with zero, suspended, not taxable, this field holds the official code number
     */
    cofinsExemptLegalReasonCode?: string;

    /**
     * When specifi reason, this field has the description
     */
    cofinsExemptLegalReason?: string;

    /**
     * Inform that the process allow IPI credit to Input process
     */
    allowIPIcreditWhenInGoing?: boolean;

    /**
     * the map key is state code
     */
    icmsConf?: Array<models.IcmsTaxConf>;

}
export namespace TaxConf {
    export enum CstIPIEnum {
        _50 = <any> '50',
        _51 = <any> '51',
        _52 = <any> '52',
        _53 = <any> '53',
        _54 = <any> '54'
    }
    export enum AccruablePISTaxationEnum {
        T = <any> 'T',
        Z = <any> 'Z',
        E = <any> 'E',
        H = <any> 'H',
        N = <any> 'N'
    }
    export enum AccruableCOFINSTaxationEnum {
        T = <any> 'T',
        Z = <any> 'Z',
        E = <any> 'E',
        H = <any> 'H',
        N = <any> 'N'
    }
}
