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


#import "SWGStateEnum.h"


@protocol SWGExportInfo
@end

@interface SWGExportInfo : SWGObject

/* shipping state 
 */
@property(nonatomic) SWGStateEnum* shippingState;
/* shipping place 
 */
@property(nonatomic) NSString* place;
/* description of shipping place [optional]
 */
@property(nonatomic) NSString* placeDescription;

@end