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

export interface Transport {
    /**
     * Freight model  - 0 - CIF,  - 1 - FOB,  - 2 - Thrid party, - 9 - Free shipping when 9 - Free shipping, the fields below will be ignored if present - 'transporter' - 'withholdICMSTransport' - 'volumes' - 'vehicle' 
     */
    modFreight: Transport.ModFreightEnum;

    /**
     * Forces witholding of ICMS on transport amount (freight)
     */
    withholdICMSTransport?: boolean;

    /**
     * Packages
     */
    volumes?: Array<models.TransportVolumes>;

    vehicle?: models.VehicleTransp;

}
export namespace Transport {
    export enum ModFreightEnum {
        CIF = <any> 'CIF',
        FOB = <any> 'FOB',
        Thridparty = <any> 'Thridparty',
        FreeShipping = <any> 'FreeShipping'
    }
}
