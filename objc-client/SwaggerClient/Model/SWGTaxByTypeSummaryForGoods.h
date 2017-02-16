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


#import "SWGTaxByTypeSummaryJurisdictionForGoods.h"


@protocol SWGTaxByTypeSummaryForGoods
@end

@interface SWGTaxByTypeSummaryForGoods : SWGObject

/* sum of all lines calcbase [optional]
 */
@property(nonatomic) NSNumber* calcbase;
/* sum of referenced tax value [optional]
 */
@property(nonatomic) NSNumber* tax;

@property(nonatomic) NSArray<SWGTaxByTypeSummaryJurisdictionForGoods>* jurisdictions;

@end
