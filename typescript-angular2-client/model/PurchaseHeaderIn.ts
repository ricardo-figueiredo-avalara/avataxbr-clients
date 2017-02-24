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

export interface PurchaseHeaderIn {
    /**
     * This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line.
     */
    accountId: string;

    /**
     * This string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company
     */
    companyCode: string;

    /**
     * This string indicates the type of transaction for which tax should be calculated. - 'Sale' - 'Purchase' - 'Payment' - 'Receipt' 
     */
    transactionType: PurchaseHeaderIn.TransactionTypeEnum;

    /**
     * This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored
     */
    documentCode?: string;

    /**
     * currency code / transactions must be in Brazilian Reais \"BRL\"
     */
    currency: PurchaseHeaderIn.CurrencyEnum;

    /**
     * This string is the transaction date in ISO 8601 format (which may be different from the date the tax calculation is performed)
     */
    transactionDate: Date;

    /**
     * accrual date, This string is the date, in ISO 8601 format, on which tax is to be calculated for this transaction (normally tax is calculated on the date the transaction is performed as captured in the transactionDate field). This is useful for layaways and other deferred transactions.
     */
    taxCalculationDate?: Date;

    /**
     * This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity
     */
    companyLocation: string;

    /**
     * This string is a code maintained by the client application to uniquely identify the party with whom the company (identified by companyCode) is transacting. It is unique within the context of an Account.
     */
    vendorCode: string;

    /**
     * The number of Purchase Order
     */
    purchaseOrderNumber?: string;

    entity?: models.PurchaseEntity;

    payment?: models.PurchaseHeaderInPayment;

    taxesConfig?: models.PurchaseTaxesConfig;

    defaultLocations?: models.PurchaseDefaultLocations;

}
export namespace PurchaseHeaderIn {
    export enum TransactionTypeEnum {
        Sale = <any> 'Sale',
        Purchase = <any> 'Purchase',
        Payment = <any> 'Payment',
        Receipt = <any> 'Receipt'
    }
    export enum CurrencyEnum {
        BRL = <any> 'BRL'
    }
}
