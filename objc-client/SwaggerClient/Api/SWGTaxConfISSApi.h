#import <Foundation/Foundation.h>
#import "SWGInlineResponse201.h"
#import "SWGIssConfByCity.h"
#import "SWGMessage.h"
#import "SWGValidationError.h"
#import "SWGApi.h"

/**
* AvaTax Brazil
* The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.
*
* OpenAPI spec version: 1.0
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/



@interface SWGTaxConfISSApi: NSObject <SWGApi>

extern NSString* kSWGTaxConfISSApiErrorDomain;
extern NSInteger kSWGTaxConfISSApiMissingParamErrorCode;

+(instancetype) sharedAPI;

/// create a new ISS Configuration
///
/// @param issConfByCity The pet JSON you want to post
///  code:201 message:"Success.",
///  code:400 message:"The request was invalid or cannot be otherwise served.",
///  code:401 message:"Authentication credentials were missing or incorrect.",
///  code:403 message:"The request is understood, but it has been refused or access is not allowed.",
///  code:404 message:"The URI requested is invalid or the resource requested does not exists.",
///  code:429 message:"The request cannot be served due to the application’s rate limit having been exhausted for the resource.",
///  code:500 message:"Something is broken.",
///  code:503 message:"The server is up, but overloaded with requests. Try again later."
/// @return SWGInlineResponse201*
-(NSNumber*) createIssConfByCityWithIssConfByCity: (SWGIssConfByCity*) issConfByCity
    completionHandler: (void (^)(SWGInlineResponse201* output, NSError* error)) handler;

/// disable a ISS by City Code.
///
/// @param cityCode City Code
///  code:204 message:"Success.",
///  code:400 message:"The request was invalid or cannot be otherwise served.",
///  code:401 message:"Authentication credentials were missing or incorrect.",
///  code:403 message:"The request is understood, but it has been refused or access is not allowed.",
///  code:404 message:"The URI requested is invalid or the resource requested does not exists.",
///  code:429 message:"The request cannot be served due to the application’s rate limit having been exhausted for the resource.",
///  code:500 message:"Something is broken.",
///  code:503 message:"The server is up, but overloaded with requests. Try again later."
-(NSNumber*) deleteIssConfWithCityCode: (NSNumber*) cityCode
    completionHandler: (void (^)(NSError* error)) handler;

/// get ISS information by City Code.
/// This operation return configurations of ISS that match with parameters queries 
///
/// @param cityCode City Code
/// @param code Identificator of this configuration, it is unique for account or standard namedspace  (optional)
/// @param date When informed return valid version configuration for this date  (optional)
/// @param inactive return the inctives versions too  (optional)
///  code:200 message:"Successful response",
///  code:400 message:"The request was invalid or cannot be otherwise served.",
///  code:401 message:"Authentication credentials were missing or incorrect.",
///  code:403 message:"The request is understood, but it has been refused or access is not allowed.",
///  code:404 message:"The URI requested is invalid or the resource requested does not exists.",
///  code:429 message:"The request cannot be served due to the application’s rate limit having been exhausted for the resource.",
///  code:500 message:"Something is broken.",
///  code:503 message:"The server is up, but overloaded with requests. Try again later."
/// @return NSArray<SWGIssConfByCity>*
-(NSNumber*) getIssConfByCityWithCityCode: (NSNumber*) cityCode
    code: (NSString*) code
    date: (NSDate*) date
    inactive: (NSNumber*) inactive
    completionHandler: (void (^)(NSArray<SWGIssConfByCity>* output, NSError* error)) handler;

/// retrive list of ISS
/// This operation return ISS configurations that match with parameters queries 
///
/// @param suffixcode Identify this ISS  (optional)
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
/// @return NSArray<SWGIssConfByCity>*
-(NSNumber*) getIssListWithSuffixcode: (NSString*) suffixcode
    date: (NSDate*) date
    inactive: (NSNumber*) inactive
    completionHandler: (void (^)(NSArray<SWGIssConfByCity>* output, NSError* error)) handler;

/// update a ISS by City Code.
///
/// @param cityCode City Code
/// @param issConfByCity The pet JSON you want to post
///  code:204 message:"Success.",
///  code:400 message:"The request was invalid or cannot be otherwise served.",
///  code:401 message:"Authentication credentials were missing or incorrect.",
///  code:403 message:"The request is understood, but it has been refused or access is not allowed.",
///  code:404 message:"The URI requested is invalid or the resource requested does not exists.",
///  code:429 message:"The request cannot be served due to the application’s rate limit having been exhausted for the resource.",
///  code:500 message:"Something is broken.",
///  code:503 message:"The server is up, but overloaded with requests. Try again later."
-(NSNumber*) updateIssConfByCityWithCityCode: (NSNumber*) cityCode
    issConfByCity: (SWGIssConfByCity*) issConfByCity
    completionHandler: (void (^)(NSError* error)) handler;


@end
