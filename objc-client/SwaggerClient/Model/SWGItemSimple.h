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




@protocol SWGItemSimple
@end

@interface SWGItemSimple : SWGObject

/* Company ID 
 */
@property(nonatomic) NSString* companyId;
/* ERP Code 
 */
@property(nonatomic) NSString* code;
/* Agast Code 
 */
@property(nonatomic) NSString* agast;
/* Item Description [optional]
 */
@property(nonatomic) NSString* _description;

@end
