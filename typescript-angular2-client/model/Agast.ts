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

export interface Agast {
    /**
     * Agast Code. AGAST (Avalara Goods and Services Types) are preset products with default tax definitions available to be used as provided or copied to create an specific comapany item.
     */
    code: string;

    /**
     * Agast Description
     */
    description?: string;

    /**
     * harmonized code, NCM or LC 116
     */
    hsCode?: string;

    /**
     * hsCode Exception for IPI tax
     */
    ex?: number;

    /**
     * tax substitution code - Codigo especificador da Substuicao Tributaria
     */
    cest?: string;

    /**
     * GTIN NUMBER
     */
    cean?: string;

    codeType?: models.AgastCodeType;

    /**
     * Inform if this process is subject to IPI taxation on output process - '50' # Saída Tributada - '51' # Saída Tributável com Alíquota Zero - '52' # Saída Isenta - '53' # Saída Não-Tributada - '54' # Saída Imune 
     */
    cstIPI?: Agast.CstIPIEnum;

    /**
     * Legal tax classificação for IPI (enquadramento tributário) When the process has CST IPI 52 or 54, it is mandatory to inform a Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo=mCnJajU4BKU= 
     */
    ipiLegalTaxClass?: string;

    /**
     * when the company is Real Profit inform if this item is cumulative or no cumulative by default
     */
    pisCofinsTaxReporting?: Agast.PisCofinsTaxReportingEnum;

    /**
     * Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE 
     */
    accruablePISTaxation?: Agast.AccruablePISTaxationEnum;

    /**
     * Inform if this item by nature is subject to COFINS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE 
     */
    accruableCOFINSTaxation?: Agast.AccruableCOFINSTaxationEnum;

    /**
     * Inform if this item by nature is subject to CSLL taxation or exempt - 'T' # TAXABLE - 'E' # EXEMPT 
     */
    accruableCSLLTaxation?: Agast.AccruableCSLLTaxationEnum;

    /**
     * for service items with City Jurisdiction, inform where the ISS tax is due
     */
    issDueatDestination?: boolean;

    /**
     * on Real Profit Purchase transaction, inform if this item allows tax credits when it is non-cumulative
     */
    pisCofinsCreditNotAllowed?: boolean;

    /**
     * - 'T' # TAXABLE - TRIBUTÁVEL INCLUSIVE PARA EXPORTAÇÃO' - 'E' # TAXABLE WITH EXEMPTION FOR EXPORTS - ISENTO PARA SERVIÇOS PRESTADOS AO EXTERIOR (DEFAULT) - 'F' # EXEMPT - 'A' # SUSPENDED FOR ADMINISTRATIVE REASON - 'L' # SUSPENDED FOR LEGAL DECISION - 'I' # IMMUNE 
     */
    issTaxation?: Agast.IssTaxationEnum;

    /**
     * This is an array of tax object related to an agast.
     */
    federalTaxRate?: Array<models.TaxTypeRate>;

    specialProductClass?: Agast.SpecialProductClassEnum;

    /**
     * One per State
     */
    icmsConf?: Array<models.AgastIcmsConf>;

}
export namespace Agast {
    export enum CstIPIEnum {
        _50 = <any> '50',
        _51 = <any> '51',
        _52 = <any> '52',
        _53 = <any> '53',
        _54 = <any> '54'
    }
    export enum PisCofinsTaxReportingEnum {
        Cumulative = <any> 'cumulative',
        NoCumulative = <any> 'noCumulative'
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
    export enum AccruableCSLLTaxationEnum {
        T = <any> 'T',
        E = <any> 'E'
    }
    export enum IssTaxationEnum {
        T = <any> 'T',
        E = <any> 'E',
        F = <any> 'F',
        A = <any> 'A',
        L = <any> 'L',
        I = <any> 'I'
    }
    export enum SpecialProductClassEnum {
        OTHERS = <any> 'OTHERS',
        COMMUNICATION = <any> 'COMMUNICATION',
        ENERGY = <any> 'ENERGY',
        TRANSPORT = <any> 'TRANSPORT',
        FUELANDLUBRIFICANT = <any> 'FUEL AND LUBRIFICANT',
        VEHICLE = <any> 'VEHICLE',
        ALCOHOLICBEVERAGES = <any> 'ALCOHOLIC BEVERAGES',
        WEAPONS = <any> 'WEAPONS',
        AMMO = <any> 'AMMO',
        PERFUME = <any> 'PERFUME',
        TOBACCO = <any> 'TOBACCO'
    }
}
