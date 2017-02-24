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

export interface TaxTypeRate {
    taxType: models.TaxType;

    /**
     * Tax can be calculated by rate or by quantity
     */
    taxModel: TaxTypeRate.TaxModelEnum;

    /**
     * Specific tax rate ex 3.5 (3.5%)
     */
    rate?: number;

    /**
     * Specific tax rate ex 3.5 (3.5%)
     */
    srvAmount?: number;

    quantityUnidBase?: string;

    specializationType?: TaxTypeRate.SpecializationTypeEnum;

}
export namespace TaxTypeRate {
    export enum TaxModelEnum {
        Rate = <any> 'rate',
        Srf = <any> 'srf'
    }
    export enum SpecializationTypeEnum {
        Basic = <any> 'basic',
        Monophase = <any> 'monophase',
        TaxSubstitution = <any> 'taxSubstitution'
    }
}
