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


@protocol SWGIpbtConfItem
@end

@interface SWGIpbtConfItem : SWGObject


@property(nonatomic) SWGStateEnum* state;

@property(nonatomic) NSNumber* federalTax;

@property(nonatomic) NSNumber* importTax;

@property(nonatomic) NSNumber* stateTax;

@property(nonatomic) NSNumber* cityTax;

@property(nonatomic) NSString* source;

@end
