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

export interface PayRecCalculatedTaxSummaryForService {
    /**
     * Count of lines
     */
    numberOfLines?: number;

    /**
     * Sum of grossvalues
     */
    subtotal?: number;

    /**
     * Sum of all withholding values
     */
    totalTax?: number;

    /**
     * Sum all NetValues
     */
    grandTotal?: number;

    pccWithholdingModes?: Array<models.PccWithholdingMode>;

    taxByType?: models.PayRecCalculatedTaxSummaryForServiceTaxByType;

}
