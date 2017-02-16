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
