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

export interface CfopConf {
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
     * Inform if this process is subject to IPI taxation on output process - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'H'  # SUSPENDED - 'N'  # NO TAXABLE     - 'I'  # IMMUNE - 'O'  # OTHER - 'OZ' # OTHER AND ZERO VALUES 
     */
    cstIPI?: CfopConf.CstIPIEnum;

    /**
     * Legal tax classificação for IPI (enquadramento) When the processo has CST IPI 52 or 54, is mandatory inform Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo=mCnJajU4BKU= 
     */
    ipiLegalTaxClass?: string;

    /**
     * Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE - 'O' # OTHER - 'OZ'# OTHER AND ZERO VALUES 
     */
    accruablePISTaxation?: CfopConf.AccruablePISTaxationEnum;

    /**
     * When exempt, taxable with zero, suspended, not taxable, this field holds the official code number
     */
    pisExemptLegalReasonCode?: string;

    /**
     * When specifi reason, this field has the description
     */
    pisExemptLegalReason?: string;

    /**
     * Inform if this item by nature is subject to COFINS taxation or exempt - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'H'  # SUSPENDED - 'N'  # NO TAXABLE     - 'O'  # OTHER - 'OZ' # OTHER AND ZERO VALUES 
     */
    accruableCOFINSTaxation?: CfopConf.AccruableCOFINSTaxationEnum;

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

    name: string;

    description?: string;

    /**
     * inform if the transaction is an operation to internalizing item or value
     */
    wayType?: CfopConf.WayTypeEnum;

    /**
     * CFOP code (tax code operation) when the transactions are within the same state.
     */
    codInState?: number;

    /**
     * CFOP code (tax code operation) when the transactions are to another state.
     */
    codOtherState?: number;

    /**
     * CFOP code (tax code operation) when the transactions are to another country.
     */
    codOtherCountry?: number;

    cstICMSSameState?: models.CstIcmsEnum;

    cstICMSOtherState?: models.CstIcmsEnum;

    cstICMSOtherCountry?: models.CstIcmsEnum;

    /**
     * this field is used to define right CFOP, one operation type can be specialized to item product, item merchandise or generic
     */
    productType?: CfopConf.ProductTypeEnum;

    /**
     * field used to indicate an operation to ICMS tax payer
     */
    operationToTaxPayerOtherState?: boolean;

    /**
     * field used to indicate an operation to items sibject to ICMS-ST
     */
    operationWithST?: boolean;

    /**
     * field used to indicate an operation to free zone
     */
    operationToFreeZone?: boolean;

    /**
     * field used to indicate an operation to some product class specifically
     */
    specificForProductClass?: CfopConf.SpecificForProductClassEnum;

}
export namespace CfopConf {
    export enum CstIPIEnum {
        T = <any> 'T',
        Z = <any> 'Z',
        E = <any> 'E',
        H = <any> 'H',
        N = <any> 'N',
        I = <any> 'I',
        O = <any> 'O',
        OZ = <any> 'OZ'
    }
    export enum AccruablePISTaxationEnum {
        T = <any> 'T',
        Z = <any> 'Z',
        E = <any> 'E',
        H = <any> 'H',
        N = <any> 'N',
        O = <any> 'O',
        OZ = <any> 'OZ'
    }
    export enum AccruableCOFINSTaxationEnum {
        T = <any> 'T',
        Z = <any> 'Z',
        E = <any> 'E',
        H = <any> 'H',
        N = <any> 'N',
        O = <any> 'O',
        OZ = <any> 'OZ'
    }
    export enum WayTypeEnum {
        In = <any> 'in',
        Out = <any> 'out'
    }
    export enum ProductTypeEnum {
        FORPRODUCT = <any> 'FOR PRODUCT',
        FORMERCHANDISE = <any> 'FOR MERCHANDISE',
        NORESTRICTION = <any> 'NO RESTRICTION'
    }
    export enum SpecificForProductClassEnum {
        OTHERS = <any> 'OTHERS',
        COMMUNICATION = <any> 'COMMUNICATION',
        ENERGY = <any> 'ENERGY',
        TRANSPORT = <any> 'TRANSPORT',
        FUELANDLUBRIFICANT = <any> 'FUEL AND LUBRIFICANT',
        VEHICLE = <any> 'VEHICLE',
        ALCOHOLICBEVERAGES = <any> 'ALCOHOLIC BEVERAGES',
        WEAPONS = <any> 'WEAPONS',
        AMMO = <any> 'AMMO',
        PERFUM = <any> 'PERFUM',
        TOBACCO = <any> 'TOBACCO'
    }
}
