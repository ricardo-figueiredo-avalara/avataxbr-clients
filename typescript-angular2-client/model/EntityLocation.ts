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

export interface EntityLocation {
    /**
     * Street Name
     */
    street?: string;

    /**
     * Neighborhood Name
     */
    neighborhood?: string;

    /**
     * Brazilian Zip Code
     */
    zipcode: string;

    /**
     * City Code (IBGE)
     */
    cityCode?: string;

    /**
     * City Name
     */
    cityName?: string;

    state?: models.StateEnum;

    /**
     * Country Code
     */
    countryCode?: string;

    /**
     * Use ISO 3166-1 alpha-3 codes
     */
    country?: string;

}
