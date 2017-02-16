#import <Foundation/Foundation.h>
#import "SWGInlineResponse2004.h"
#import "SWGMessage.h"
#import "SWGValidationError.h"
#import "SWGApi.h"

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



@interface SWGInvoiceSettingsApi: NSObject <SWGApi>

extern NSString* kSWGInvoiceSettingsApiErrorDomain;
extern NSInteger kSWGInvoiceSettingsApiMissingParamErrorCode;

+(instancetype) sharedAPI;

/// Invoice Settigns
/// Get Enviroment Settigns
///
///  code:200 message:"Transaction Out",
///  code:400 message:"The request was invalid or cannot be otherwise served.",
///  code:401 message:"Authentication credentials were missing or incorrect.",
///  code:403 message:"The request is understood, but it has been refused or access is not allowed.",
///  code:404 message:"The URI requested is invalid or the resource requested does not exists.",
///  code:429 message:"The request cannot be served due to the application’s rate limit having been exhausted for the resource.",
///  code:500 message:"Something is broken.",
///  code:503 message:"The server is up, but overloaded with requests. Try again later."
/// @return SWGInlineResponse2004*
-(NSNumber*) invoiceSettingsWithCompletionHandler: 
    (void (^)(SWGInlineResponse2004* output, NSError* error)) handler;


@end
