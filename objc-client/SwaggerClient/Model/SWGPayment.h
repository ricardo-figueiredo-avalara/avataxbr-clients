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


#import "SWGPaymentBill.h"
#import "SWGPaymentInstallment.h"
#import "SWGPaymentPaymentMode.h"


@protocol SWGPayment
@end

@interface SWGPayment : SWGObject

/* Installment terms - 0 # cash - 1 # on terms - 2 # other  [optional]
 */
@property(nonatomic) NSNumber* installmentsTerms;

@property(nonatomic) SWGPaymentBill* bill;

@property(nonatomic) NSArray<SWGPaymentInstallment>* installment;

@property(nonatomic) NSArray<SWGPaymentPaymentMode>* paymentMode;

@end
