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


@protocol SWGSimpleAddress
@end

@interface SWGSimpleAddress : SWGObject

/* Address 
 */
@property(nonatomic) NSString* line1;
/* Number 
 */
@property(nonatomic) NSString* line2;
/* District 
 */
@property(nonatomic) NSString* line3;

@property(nonatomic) NSString* city;
/* Brazilian Zip Code 
 */
@property(nonatomic) NSString* zipcode;

@property(nonatomic) SWGStateEnum* state;
/* Use ISO 3166-1 alpha-3 codes 
 */
@property(nonatomic) NSString* country;

@end
