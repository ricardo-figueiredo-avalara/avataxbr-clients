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


#import "SWGPayRecCalculatedTaxSummaryForService.h"
#import "SWGPayRecHeader.h"
#import "SWGPayRecLinesOut.h"
#import "SWGProcessingInfo.h"


@protocol SWGReceiptTransactionOut
@end

@interface SWGReceiptTransactionOut : SWGObject


@property(nonatomic) SWGPayRecHeader* header;

@property(nonatomic) NSArray<SWGPayRecLinesOut>* lines;

@property(nonatomic) SWGPayRecCalculatedTaxSummaryForService* calculatedTaxSummary;

@property(nonatomic) SWGProcessingInfo* processingInfo;

@end