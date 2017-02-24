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

export interface PayRecLinesOut {
    /**
     * Installment number in this document
     */
    lineCode?: number;

    lineType?: PayRecLinesOut.LineTypeEnum;

    /**
     * Bill transaction code This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc.
     */
    itemCode: string;

    /**
     * Free description about this payment
     */
    itemDescription?: string;

    /**
     * Installment number, when paid AS IS
     */
    itemDocNumber?: string;

    /**
     * Penalty, usually because paid after due date
     */
    lineUntaxedPenality?: number;

    /**
     * unconditional discounts
     */
    lineUntaxedDiscount?: number;

    /**
     * GrossAmount of this installment line
     */
    lineAmount?: number;

    /**
     * Net value, the net Value is Gross value plus penalty minus sum of discount and withhold taxes
     */
    lineNetValue?: number;

    /**
     * x is because not subject of this tax independent of Threshold
     */
    withholdingMode?: models.WithholdingMode;

    calculatedTax?: models.PaymentCalculatedTax;

}
export namespace PayRecLinesOut {
    export enum LineTypeEnum {
        Installment = <any> 'installment'
    }
}
