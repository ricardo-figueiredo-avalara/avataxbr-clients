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


#import "SWGProcessingInfo.h"
#import "SWGSalesCalculatedTaxSummaryForService.h"
#import "SWGSalesHeaderOut.h"
#import "SWGSalesLinesOut.h"


@protocol SWGSalesTransactionOut
@end

@interface SWGSalesTransactionOut : SWGObject


@property(nonatomic) SWGSalesHeaderOut* header;

@property(nonatomic) NSArray<SWGSalesLinesOut>* lines;

@property(nonatomic) SWGSalesCalculatedTaxSummaryForService* calculatedTaxSummary;

@property(nonatomic) SWGProcessingInfo* processingInfo;

@end