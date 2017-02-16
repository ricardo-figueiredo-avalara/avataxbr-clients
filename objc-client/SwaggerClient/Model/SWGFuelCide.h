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




@protocol SWGFuelCide
@end

@interface SWGFuelCide : SWGObject

/* percentage of natural gas (GLP), this decimal 12 integers and 0 to 4 decimals 
 */
@property(nonatomic) NSNumber* baseCalcCIDE;
/* percentage of natural gas (GLP), this decimal 11 integers and 0 to 4 decimals - R$ 
 */
@property(nonatomic) NSNumber* rateCIDE;
/* percentage of natural gas (GLP), this decimal 13 integers and 2 decimals - R$ 
 */
@property(nonatomic) NSNumber* valueCIDE;

@end
