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
     * Use to determined how the tax is applicable and calculated. It may define and exemption, a tax base reduction, identify that a special rate is applicable (not the rate itself). - '00' # Taxed in its totality - '10' # Taxed and subject to tax substitution (ICMS ST) - '20' # Taxed with Tax Base Reduction - '30' # Exempt /Not Taxed and subject to tax Substitution (ICMS#ST) - '40' # Tax Exempt - '41' # Not Taxed - '50' # Taxes Suspended - '51' # Taxes Diferred - '60' # ICMS Tax already collected through Substituition (ICMS ST) - '70' # Taxed with Tax Base Reduction and subject to Tax Subsititution (ICMS ST) - '90' # Others 
     */
    export interface CSTTableBEnum {
    }

}
