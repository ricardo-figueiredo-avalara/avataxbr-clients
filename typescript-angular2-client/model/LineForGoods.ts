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

export interface LineForGoods {
    /**
     * This string is a unique identifier for this line in the transaction
     */
    lineCode: number;

    /**
     * This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU and is required for SST states.
     */
    itemCode: string;

    /**
     * AGAST CODE for itemCode
     */
    avalaraGoodsAndServicesType?: string;

    /**
     * This decimal 11 integers and 1 to 4 decimals captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1
     */
    numberOfItems: number;

    /**
     * when is return operation this field inform the percentage of returned itens. This decimal max 3 integers and 2 decimals, v >=0.00 and v <= 100.00
     */
    returnedPercentageAmount?: number;

    /**
     * This decimal 11 integers and 1 to 10 decimals captures the unit price of this line.
     */
    lineUnitPrice?: number;

    /**
     * In its simplest form lineAmount = (item price * numberOfItems). If taxIncluded is 'true', lineAmount = (item price * numberOfItems + tax).
     */
    lineAmount: number;

    /**
     * This string captures the description of the item represented by this line, will be used LC 116
     */
    itemDescription: string;

    /**
     * Discount conditional, This decimal 13 integers and 0 to 2 decimals
     */
    lineTaxedDiscount?: number;

    /**
     * discount unconditional, This decimal 13 integers and 0 to 2 decimals
     */
    lineUntaxedDiscount?: number;

    /**
     * This is a enumeration folowing table
     */
    useType: LineForGoods.UseTypeEnum;

    /**
     * Reference to process configurantion of this transaction, See ProcessScenario definition
     */
    processScenario: string;

    /**
     * Fiscal Operation Code of transport service
     */
    cfop?: number;

    /**
     * return if this transaction has stock impact for this process or CFOP
     */
    hasStockImpact?: boolean;

    /**
     * return if this transaction has finantial impact for this process or CFOP
     */
    hasFinantialImpact?: boolean;

    /**
     * This decimal 13 integers and 0 to 2 decimals
     */
    freightAmount?: number;

    /**
     * This decimal 13 integers and 0 to 2 decimals
     */
    insuranceAmount?: number;

    /**
     * This decimal 13 integers and 0 to 2 decimals
     */
    otherCostAmount?: number;

    /**
     * The item value will compose the invoice total value.
     */
    indTotType?: boolean;

    /**
     * order number, information used for B2B control process
     */
    orderNumber?: string;

    /**
     * number of the item from order number, information used for B2B control process
     */
    orderItemNumber?: string;

    /**
     * Gloal Unique identifier (Importation form)
     */
    fciNumber?: string;

    /**
     * RECOPI number
     */
    recopiNumber?: string;

    /**
     * additional information about product (referenced standard, complementary info, etc)
     */
    infAdProd?: string;

    vehicle?: models.Vehicle;

    medicine?: models.Medicine;

    weapon?: models.Weapon;

    fuel?: models.Fuel;

    /**
     * Inform that for this item the Entity referenced is ICMS Substitute
     */
    entityIsIcmsSubstitute?: boolean;

    /**
     * Inform that this item has ICMS withheld for transport value service.
     */
    isTransportIcmsWithheld?: boolean;

    icmsTaxRelief?: models.LineForGoodsIcmsTaxRelief;

    /**
     * Exportation detail
     */
    export?: Array<models.LineForGoodsExport>;

    /**
     * Import declaration
     */
    di?: Array<models.LineForGoodsDi>;

    calculatedTax?: models.LineForGoodsCalculatedTax;

}
export namespace LineForGoods {
    export enum UseTypeEnum {
        UseOrConsumption = <any> 'use or consumption',
        Resale = <any> 'resale',
        AgriculturalProduction = <any> 'agricultural production',
        Production = <any> 'production',
        UseOrConsumptionOnBusinessEstablishment = <any> 'use or consumption on business establishment',
        UseOrConsumptionOnTransporterServiceEstablishment = <any> 'use or consumption on transporter service establishment',
        UseOrConsumptionOnCommunicationServiceEstablishment = <any> 'use or consumption on communication service establishment',
        UseOrConsumptionOnDemandByContract = <any> 'use or consumption on demand by contract',
        UseOrConsumptionOnEnergySupplierEstablishment = <any> 'use or consumption on energy supplier establishment',
        UseOrConsumptionOfFuelTransactionTypeExportation = <any> 'use or consumption of fuel transaction type exportation',
        FixedAssets = <any> 'fixed assets',
        ResaleExport = <any> 'resale export',
        ResaleIcmsExempt = <any> 'resale icms exempt',
        ResaleBuyerUnderTheSameIcmsStTaxRule = <any> 'resale buyer under the same icmsSt tax rule',
        TransportOfGoodsThatDontNeedInvoiceNf = <any> 'transport of goods that don't need invoice (nf)'
    }
}
