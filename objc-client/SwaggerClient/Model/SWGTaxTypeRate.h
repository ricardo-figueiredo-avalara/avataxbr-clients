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


#import "SWGTaxType.h"


@protocol SWGTaxTypeRate
@end

@interface SWGTaxTypeRate : SWGObject


@property(nonatomic) SWGTaxType* taxType;
/* Tax can be calculated by rate or by quantity 
 */
@property(nonatomic) NSString* taxModel;
/* Specific tax rate ex 3.5 (3.5%) [optional]
 */
@property(nonatomic) NSNumber* rate;
/* Specific tax rate ex 3.5 (3.5%) [optional]
 */
@property(nonatomic) NSNumber* srvAmount;

@property(nonatomic) NSString* quantityUnidBase;

@property(nonatomic) NSString* specializationType;

@end
