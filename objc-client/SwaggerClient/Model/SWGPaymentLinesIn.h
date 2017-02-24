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


#import "SWGPayRecLinesIn.h"


@protocol SWGPaymentLinesIn
@end

@interface SWGPaymentLinesIn : SWGObject

/* Installment number in this document [optional]
 */
@property(nonatomic) NSNumber* lineCode;

@property(nonatomic) NSString* lineType;
/* Bill transaction code This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. 
 */
@property(nonatomic) NSString* itemCode;
/* Free description about this payment [optional]
 */
@property(nonatomic) NSString* itemDescription;
/* Installment number, when paid AS IS [optional]
 */
@property(nonatomic) NSString* itemDocNumber;
/* Penalty, usually because paid after due date [optional]
 */
@property(nonatomic) NSNumber* lineUntaxedPenality;
/* unconditional discounts [optional]
 */
@property(nonatomic) NSNumber* lineUntaxedDiscount;
/* Net value, the net Value is Gross value plus penalty minus sum of discount and withhold taxes [optional]
 */
@property(nonatomic) NSNumber* lineNetValue;

@end
