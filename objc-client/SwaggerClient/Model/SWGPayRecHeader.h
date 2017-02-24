#import <Foundation/Foundation.h>
#import "SWGObject.h"

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




@protocol SWGPayRecHeader
@end

@interface SWGPayRecHeader : SWGObject

/* This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line. 
 */
@property(nonatomic) NSString* accountId;
/* This string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company 
 */
@property(nonatomic) NSString* companyCode;
/* This string indicates the type of transaction for which tax should be calculated. - 'Sale' - 'Purchase' - 'Payment' - 'Receipt'  
 */
@property(nonatomic) NSString* transactionType;
/* This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored [optional]
 */
@property(nonatomic) NSString* documentCode;
/* currency code. 'BRL' for Brazilian Reais. 
 */
@property(nonatomic) NSString* currency;
/* This string is the transaction date in ISO 8601 format (which may be different from the date the tax calculation is performed) 
 */
@property(nonatomic) NSDate* transactionDate;
/* accrual date, This string is the date, in ISO 8601 format, on which tax is to be calculated for this transaction (normally tax is calculated on the date the transaction is performed as captured in the transactionDate field). This is useful for layaways and other deferred transactions. [optional]
 */
@property(nonatomic) NSDate* taxCalculationDate;
/* This string is a code maintained by the client application to uniquely identify the party with whom the company (identified by companyCode) is transacting. It is unique within the context of an Account. 
 */
@property(nonatomic) NSString* vendorCode;
/* - 'CALCULATE' - 'ASIS' When ASIS, the transaction is stored without executing tax determination (no Calculation).  
 */
@property(nonatomic) NSString* paymentMode;

@end
