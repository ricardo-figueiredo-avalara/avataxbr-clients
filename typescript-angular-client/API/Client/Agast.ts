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

    export interface Agast {
        /**
         * Agast Code. AGAST (Avalara Goods and Services Types) are preset products with default tax definitions available to be used as provided or copied to create an specific comapany item.
         */
        "code": string;

        /**
         * Agast Description
         */
        "description"?: string;

        /**
         * harmonized code, NCM or LC 116
         */
        "hsCode"?: string;

        /**
         * hsCode Exception for IPI tax
         */
        "ex"?: number;

        /**
         * tax substitution code - Codigo especificador da Substuicao Tributaria
         */
        "cest"?: string;

        /**
         * GTIN NUMBER
         */
        "cean"?: string;

        "codeType"?: AgastCodeType;

        /**
         * Inform if this process is subject to IPI taxation on output process - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'N'  # NO TAXABLE     - 'I'  # IMMUNE 
         */
        "cstIPI"?: Agast.CstIPIEnum;

        /**
         * Legal tax classificação for IPI (enquadramento tributário) When the process has CST IPI 52 or 54, it is mandatory to inform a Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo=mCnJajU4BKU= 
         */
        "ipiLegalTaxClass"?: string;

        /**
         * when the company is Real Profit inform if this item is cumulative or no cumulative by default
         */
        "pisCofinsTaxReporting"?: Agast.PisCofinsTaxReportingEnum;

        /**
         * Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE 
         */
        "accruablePISTaxation"?: Agast.AccruablePISTaxationEnum;

        /**
         * When exempt, taxable with zero rate, suspended, not taxable, this field informs the official code number for the exemption
         */
        "pisExemptLegalReasonCode"?: string;

        /**
         * When specified a reason, this field holds the reason's description
         */
        "pisExemptLegalReason"?: string;

        /**
         * Inform if this item by nature is subject to COFINS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE 
         */
        "accruableCOFINSTaxation"?: Agast.AccruableCOFINSTaxationEnum;

        /**
         * When exempt, taxable with zero rate, suspended, not taxable, this field informs the official code number for the exemption
         */
        "cofinsExemptLegalReasonCode"?: string;

        /**
         * When specified a reason, this field holds the reason's description
         */
        "cofinsExemptLegalReason"?: string;

        /**
         * Inform if this item by nature is subject to CSLL taxation or exempt - 'T' # TAXABLE - 'E' # EXEMPT 
         */
        "accruableCSLLTaxation"?: Agast.AccruableCSLLTaxationEnum;

        "csllExemptLegalReason"?: string;

        "csllExemptLegalReasonCode"?: string;

        "withholding"?: AgastWithholding;

        /**
         * for service items with City Jurisdiction, inform where the ISS tax is due
         */
        "issDueatDestination"?: boolean;

        /**
         * on Real Profit Purchase transaction, inform if this item allows tax credits when it is non-cumulative
         */
        "pisCofinsCreditNotAllowed"?: boolean;

        /**
         * - 'T' # TAXABLE - TRIBUTÁVEL INCLUSIVE PARA EXPORTAÇÃO' - 'E' # TAXABLE WITH EXEMPTION FOR EXPORTS - ISENTO PARA SERVIÇOS PRESTADOS AO EXTERIOR (DEFAULT) - 'F' # EXEMPT - 'A' # SUSPENDED FOR ADMINISTRATIVE REASON - 'L' # SUSPENDED FOR LEGAL DECISION - 'I' # IMMUNE 
         */
        "issTaxation"?: Agast.IssTaxationEnum;

        /**
         * This is an array of tax object related to an agast.
         */
        "federalTaxRate"?: Array<TaxTypeRate>;

        "specialProductClass"?: Agast.SpecialProductClassEnum;

        /**
         * One per State
         */
        "icmsConf"?: Array<AgastIcmsConf>;

    }

    export namespace Agast {
        export enum CstIPIEnum {
            T = <any> 'T',
            Z = <any> 'Z',
            E = <any> 'E',
            N = <any> 'N',
            I = <any> 'I'
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
}
