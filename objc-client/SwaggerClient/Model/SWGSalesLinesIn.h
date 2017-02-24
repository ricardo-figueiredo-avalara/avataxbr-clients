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


#import "SWGSalesLinesInTaxDeductions.h"


@protocol SWGSalesLinesIn
@end

@interface SWGSalesLinesIn : SWGObject

/* This string is a unique identifier for this line in the transaction [optional]
 */
@property(nonatomic) NSNumber* lineCode;
/* This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU and is required for SST states. 
 */
@property(nonatomic) NSString* itemCode;
/* This decimal captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1 [optional]
 */
@property(nonatomic) NSNumber* numberOfItems;
/* This decimal captures the total cost of this line. In its simplest form lineAmount = (item price * numberOfItems). [optional]
 */
@property(nonatomic) NSNumber* lineAmount;
/* This string captures the description of the item represented by this line, will be used LC 116 [optional]
 */
@property(nonatomic) NSString* itemDescription;
/* Conditional discount [optional]
 */
@property(nonatomic) NSNumber* lineTaxedDiscount;
/* Unconditional discount [optional]
 */
@property(nonatomic) NSNumber* lineUntaxedDiscount;

@property(nonatomic) SWGSalesLinesInTaxDeductions* taxDeductions;

@end
