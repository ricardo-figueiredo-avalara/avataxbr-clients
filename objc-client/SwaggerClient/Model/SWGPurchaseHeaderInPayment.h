#import <Foundation/Foundation.h>
#import "SWGObject.h"

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


#import "SWGPaymentTerms.h"
#import "SWGPurchaseInstallmentIn.h"


@protocol SWGPurchaseHeaderInPayment
@end

@interface SWGPurchaseHeaderInPayment : SWGObject


@property(nonatomic) SWGPaymentTerms* terms;
/* installments [optional]
 */
@property(nonatomic) NSArray<SWGPurchaseInstallmentIn>* installments;

@end
