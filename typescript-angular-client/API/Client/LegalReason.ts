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

    /**
     * Legal Reason (Fundamentação Legal): - 'name' - 'description' - 'scope' 
     */
    export interface LegalReason {
        /**
         * Internal ID
         */
        "id"?: string;

        /**
         * Message scope. May be one of these. general - This message is not linked to any entity (agast/process/cfop) and will be applied to any item in a transacition. (Esta mensagem tem escopo geral, nao está relacionadas diretamente qualquer objeto.); linkedTo - This message is linked to an entity, and its processing will only occur when the context involves it. (Esta mensagens estão relacionadas diretamente a algum objeto como um AGAST por exemplo, um Processo ou uma CFOP.); 
         */
        "scope": LegalReason.ScopeEnum;

        /**
         * Set this message as no longer valid
         */
        "disable"?: boolean;

        /**
         * Legal reason textual description;
         */
        "description": string;

        /**
         * Short name to this message
         */
        "name": string;

        /**
         * this field inform the official code number
         */
        "legalCode"?: string;

        /**
         * Optional. Show this message when used in Invoice (NFe, NFCe, others...). Where to show this.
         */
        "showInInvoice"?: LegalReason.ShowInInvoiceEnum;

        /**
         * Referenced Process
         */
        "referencedProcesses"?: Array<LegalReasonReferencedProcesses>;

        "taxScope"?: LegalReasonTaxScope;

    }

    export namespace LegalReason {
        export enum ScopeEnum {
            General = <any> 'general',
            LinkedTo = <any> 'linkedTo'
        }
        export enum ShowInInvoiceEnum {
            ComplementaryInfoMessage = <any> 'complementaryInfoMessage',
            FiscalInfoMessage = <any> 'fiscalInfoMessage',
            ItemInfoMessage = <any> 'itemInfoMessage'
        }
    }
}
