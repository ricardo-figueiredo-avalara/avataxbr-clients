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

export interface LineForGoodsAdi {
    /**
     * aditional sequence number (1 to 100)
     */
    addNumber: number;

    /**
     * sequential item number for this adi, sequence number (1 to 999)
     */
    sequentialNumber: number;

    /**
     * Manufatorer erp internal code
     */
    manufacturerCode: string;

    /**
     * This decimal 13 integers and 2 decimals, aditional adi discount
     */
    adiDiscount?: number;

    /**
     * Drawback number
     */
    drawbackNumber?: string;

}
