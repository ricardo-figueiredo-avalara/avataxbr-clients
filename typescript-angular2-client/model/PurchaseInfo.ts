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

export interface PurchaseInfo {
    /**
     * Invoice info for government purchase orders Informação da Nota de Empenho de compras públicas 
     */
    governmentOrder?: string;

    /**
     * Order info Informação do pedido 
     */
    orderNumber?: string;

    /**
     * Agreement info Informação do contrato 
     */
    contractNumber?: string;

}
