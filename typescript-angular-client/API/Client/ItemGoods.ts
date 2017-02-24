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

    export interface ItemGoods {
        /**
         * Company ID
         */
        "companyId": string;

        /**
         * ERP Code
         */
        "code": string;

        /**
         * Agast Code
         */
        "agast": string;

        /**
         * Item Description
         */
        "description"?: string;

        /**
         * Seal Code for ipi tax control (código do selo para controle de IPI)
         */
        "sealCode": string;

        /**
         * Importation content form number (Número de controle da FCI - Ficha de Conteúdo de Importação)
         */
        "nFCI"?: string;

        /**
         * this field inform that this merchandise or product is ICMS Substitute Must be used when the item is for resale and the company will assume the role of ICMS Substitute (wholesaler, retailer, distributor). Example: when Importing some product the company does not pay IcmsSt at the time of customs clearance but when selling sale the item. Deverá ser utilizado quando a empresa que irá vender a mercadoria sujeita ao ICMS ST for o SUBSTITUTO TRIBUTÁRIO (Distribuidor, atacadista e varejista), como por exemplo das mercadorias IMPORTADAS, neste sentido, a empresa não irá pagar o ICMS ST no desembaraço aduaneiro e irá recolher quando for vender as mesmas. 
         */
        "isIcmsStSubstitute"?: boolean;

        /**
         * - '0' # National goods - except those treated in codes 3,4, 5 and 8 - '1' # Foreign goods - Imported directly by seller, except those in code 6 - '2' # Foreign goods - Acquired in the internal market (inside Brazil), except those in code 7 - '3' # National goods - Merchandise or goods with imported content above 40% and with less than or equal to 70% - '4' # National goods from production following 'standard basic processes' as stablished by legislation (standard basic processes are devised to separate simple assembly from manufaturing processes) - '5' # National goods - Merchandise or goods with imported content equal or below 40% - '6' # Foreign goods - Directly imported by Seller, without a National Equivalent as listed by Comex and natural gas - '7' # Foreign goods - Acquired inside Brazil, without a National Equivalent  as listed by Comex and natural gas - '8' # National goods - Merchandise or goods with imported content above 70% 
         */
        "source"?: ItemGoods.SourceEnum;

        "productType"?: ItemGoods.ProductTypeEnum;

        /**
         * Item is merchandise but will be considered product
         */
        "manufacturerEquivalent"?: boolean;

        /**
         * Inform that this item will have rights to aprropriate IPI credit
         */
        "appropriateIPIcreditWhenInGoing"?: boolean;

        /**
         * Subject to appropriate PIS/COFINS credit, when NO CUMULATIVE
         */
        "usuallyAppropriatePISCOFINSCredit"?: boolean;

        /**
         * The credit PIS/COFINS is subject to purchase form companies, but exist some exceptions, when the credit will be a estimated amount
         */
        "isPisCofinsEstimatedCredit"?: boolean;

        /**
         * - '01' # Vinculada Exclusivamente a Receita Tributada no Mercado Interno - '02' # Exclusivamente a Receita Não Tributada no Mercado Interno - '03' # Exclusivamente a Receita de Exportação - '04' # Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno - '05' # Vinculada a Receitas Tributadas no Mercado Interno e de Exportação - '06' # Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação - '07' # Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação 
         */
        "piscofinsRevenueType"?: ItemGoods.PiscofinsRevenueTypeEnum;

        /**
         * Discount allowed on icms base when PIS/COFINS are Monophase
         */
        "icmsBaseDiscountForMonoPhaseSocialContr"?: number;

        /**
         * GTIN NUMBER
         */
        "cean"?: string;

        /**
         * Nomenclatura de Valor aduaneio e Estatístico - NCM extension code
         */
        "nve"?: string;

        "salesUnit"?: string;

        /**
         * factor to convert sales quantity to IPI taxable quantity when it is by SRF Statutory Retail Price (Pauta)
         */
        "salesUnitIPIfactor"?: number;

        /**
         * factor to convert sales quantity to ICMS taxable quantity when it is by SRF Statutory Retail Price (Pauta)
         */
        "salesUnitIcmsfactor"?: number;

        /**
         * factor to convert sales quantity to ICMS-ST taxable quantity when it is by SRF Statutory Retail Price (Pauta)
         */
        "salesUnitIcmsStfactor"?: number;

        /**
         * factor to convert sales quantity to PIS/COFINS taxable quantity when it is by SRF Statutory Retail Price (Pauta)
         */
        "salesUnitPisCofinsfactor"?: number;

        "purchaseUnit"?: string;

        /**
         * factor to convert purchase quantity to IPI taxable quantity when it is by SRF Statutory Retail Price (Pauta)
         */
        "purchaseUnitIPIfactor"?: number;

        /**
         * factor to convert purchase quantity to ICMS taxable quantity when it is by SRF Statutory Retail Price (Pauta)
         */
        "purchaseUnitIcmsfactor"?: number;

        /**
         * factor to convert purchase quantity to ICMS-ST taxable quantity when it is by SRF Statutory Retail Price (Pauta)
         */
        "purchaseUnitIcmsStfactor"?: number;

        /**
         * factor to convert purchase quantity to PIS/COFINS taxable quantity when it is by SRF Statutory Retail Price (Pauta)
         */
        "purchaseUnitPisCofinsfactor"?: number;

        /**
         * When the product is new, and will be retail, firt time that it exit it is subject to IPI
         */
        "firstUse"?: boolean;

    }

    export namespace ItemGoods {
        export enum SourceEnum {
            _0 = <any> '0',
            _1 = <any> '1',
            _2 = <any> '2',
            _3 = <any> '3',
            _4 = <any> '4',
            _5 = <any> '5',
            _6 = <any> '6',
            _7 = <any> '7',
            _8 = <any> '8'
        }
        export enum ProductTypeEnum {
            FORPRODUCT = <any> 'FOR PRODUCT',
            FORMERCHANDISE = <any> 'FOR MERCHANDISE',
            NORESTRICTION = <any> 'NO RESTRICTION',
            SERVICE = <any> 'SERVICE',
            FEEDSTOCK = <any> 'FEEDSTOCK',
            FIXEDASSETS = <any> 'FIXED ASSETS'
        }
        export enum PiscofinsRevenueTypeEnum {
            _01 = <any> '01',
            _02 = <any> '02',
            _03 = <any> '03',
            _04 = <any> '04',
            _05 = <any> '05',
            _06 = <any> '06',
            _07 = <any> '07'
        }
    }
}
