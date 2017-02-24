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

    export interface AgastExtendForSefaz {
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

        /**
         * Nomenclatura de Valor aduaneio e Estatístico - NCM extension code
         */
        "nve"?: string;

        /**
         * Sales Unit
         */
        "unit"?: string;

        /**
         * Sales Taxable Unit
         */
        "unitTaxable"?: string;

        /**
         * Importation content form number (Número de controle da FCI - Ficha de Conteúdo de Importação)
         */
        "nFCI"?: string;

    }

}
