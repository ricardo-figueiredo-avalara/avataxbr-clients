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

/**
 * Object with summary of all taxes returned by engine
 */
export interface SalesCalculatedTaxSummaryForServiceTaxByType {
    pisRf?: models.TaxByTypeSummaryForService;

    cofinsRf?: models.TaxByTypeSummaryForService;

    csllRf?: models.TaxByTypeSummaryForService;

    irrf?: models.TaxByTypeSummaryForService;

    inssRf?: models.TaxByTypeSummaryForService;

    pis?: models.TaxByTypeSummaryForService;

    cofins?: models.TaxByTypeSummaryForService;

    csll?: models.TaxByTypeSummaryForService;

    issRf?: models.TaxByTypeSummaryForService;

    iss?: models.TaxByTypeSummaryForService;

    aproxtribCity?: models.TaxByTypeSummaryForService;

    aproxtribFed?: models.TaxByTypeSummaryForService;

    irpj?: models.TaxByTypeSummaryForService;

    inss?: models.TaxByTypeSummaryForService;

}
