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

/// <reference path="api.d.ts" />

namespace API.Client {
    'use strict';

    export interface LineForGoodsIcmsTaxRelief {
        /**
         * When item transaction subject to desoneration, this is the reason code - 1 # Táxi; - 3 # Produtor Agropecuário; - 4 # Frotista/Locadora; - 5 # Diplomático/Consular; - 6 # Utilitários e Motocicletas da Amazônia Ocidental e Áreas de Livre Comércio (Resolução 714/88 e 790/94 – CONTRAN e suas alterações); - 7 # SUFRAMA; - 8 # Venda a órgão Público; - 9 # Outros - 10 # Deficiente Condutor - 11 # Deficiente não condutor - 12 # Fomento agropecuário - 16 # Olimpíadas Rio 2016 
         */
        "icmsTaxReliefReasonCode": number;

        /**
         * ICMS Tax base rate discount  (desconto na base do ICMS referetne a desoneração)
         */
        "icmsReliefTaxRate"?: number;

        /**
         * Amount for Icms Relief (desoneração)
         */
        "icmsReliefTaxAmount"?: number;

    }

}