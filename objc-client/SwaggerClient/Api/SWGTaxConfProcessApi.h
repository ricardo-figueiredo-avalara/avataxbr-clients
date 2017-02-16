#import <Foundation/Foundation.h>
#import "SWGInlineResponse201.h"
#import "SWGMessage.h"
#import "SWGProcessScenario.h"
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



@interface SWGTaxConfProcessApi: NSObject <SWGApi>

extern NSString* kSWGTaxConfProcessApiErrorDomain;
extern NSInteger kSWGTaxConfProcessApiMissingParamErrorCode;

+(instancetype) sharedAPI;

/// create a new Process Type configuration
///
/// @param taxconfprocess The pet JSON you want to post
///  code:201 message:"Success.",
///  code:400 message:"The request was invalid or cannot be otherwise served.",
///  code:401 message:"Authentication credentials were missing or incorrect.",
///  code:403 message:"The request is understood, but it has been refused or access is not allowed.",
///  code:404 message:"The URI requested is invalid or the resource requested does not exists.",
///  code:429 message:"The request cannot be served due to the application’s rate limit having been exhausted for the resource.",
///  code:500 message:"Something is broken.",
///  code:503 message:"The server is up, but overloaded with requests. Try again later."
/// @return SWGInlineResponse201*
-(NSNumber*) createProcessWithTaxconfprocess: (SWGProcessScenario*) taxconfprocess
    completionHandler: (void (^)(SWGInlineResponse201* output, NSError* error)) handler;

/// disable a Process.
///
/// @param code Process Code
///  code:204 message:"Success.",
///  code:400 message:"The request was invalid or cannot be otherwise served.",
///  code:401 message:"Authentication credentials were missing or incorrect.",
///  code:403 message:"The request is understood, but it has been refused or access is not allowed.",
///  code:404 message:"The URI requested is invalid or the resource requested does not exists.",
///  code:429 message:"The request cannot be served due to the application’s rate limit having been exhausted for the resource.",
///  code:500 message:"Something is broken.",
///  code:503 message:"The server is up, but overloaded with requests. Try again later."
-(NSNumber*) deleteProcessWithCode: (NSString*) code
    completionHandler: (void (^)(NSError* error)) handler;

/// get Process information.
/// This operation return Process Type configuration 
///
/// @param code Process Code
///  code:200 message:"Successful response",
///  code:400 message:"The request was invalid or cannot be otherwise served.",
///  code:401 message:"Authentication credentials were missing or incorrect.",
///  code:403 message:"The request is understood, but it has been refused or access is not allowed.",
///  code:404 message:"The URI requested is invalid or the resource requested does not exists.",
///  code:429 message:"The request cannot be served due to the application’s rate limit having been exhausted for the resource.",
///  code:500 message:"Something is broken.",
///  code:503 message:"The server is up, but overloaded with requests. Try again later."
/// @return SWGProcessScenario*
-(NSNumber*) getProcessWithCode: (NSString*) code
    completionHandler: (void (^)(SWGProcessScenario* output, NSError* error)) handler;

/// retrive list of Process.
/// This operation return Process Type configurations that match with parameters queries 
///
/// @param accountId filter the configuration by accountID, if not informed, only the standard configuration will be returned  (optional)
/// @param date When informed return valid version configuration for this date  (optional)
/// @param inactive return the inactive versions too  (optional)
///  code:200 message:"Success response",
///  code:400 message:"The request was invalid or cannot be otherwise served.",
///  code:401 message:"Authentication credentials were missing or incorrect.",
///  code:403 message:"The request is understood, but it has been refused or access is not allowed.",
///  code:404 message:"The URI requested is invalid or the resource requested does not exists.",
///  code:429 message:"The request cannot be served due to the application’s rate limit having been exhausted for the resource.",
///  code:500 message:"Something is broken.",
///  code:503 message:"The server is up, but overloaded with requests. Try again later."
/// @return NSArray<SWGProcessScenario>*
-(NSNumber*) getProcessListWithAccountId: (NSString*) accountId
    date: (NSDate*) date
    inactive: (NSNumber*) inactive
    completionHandler: (void (^)(NSArray<SWGProcessScenario>* output, NSError* error)) handler;

/// update a Process Type configuration
///
/// @param code Process Code
/// @param taxconfprocess The pet JSON you want to post
///  code:204 message:"Success.",
///  code:400 message:"The request was invalid or cannot be otherwise served.",
///  code:401 message:"Authentication credentials were missing or incorrect.",
///  code:403 message:"The request is understood, but it has been refused or access is not allowed.",
///  code:404 message:"The URI requested is invalid or the resource requested does not exists.",
///  code:429 message:"The request cannot be served due to the application’s rate limit having been exhausted for the resource.",
///  code:500 message:"Something is broken.",
///  code:503 message:"The server is up, but overloaded with requests. Try again later."
-(NSNumber*) updateProcessWithCode: (NSString*) code
    taxconfprocess: (SWGProcessScenario*) taxconfprocess
    completionHandler: (void (^)(NSError* error)) handler;


@end