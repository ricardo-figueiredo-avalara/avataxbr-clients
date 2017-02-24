#import <Foundation/Foundation.h>
#import "SWGCompany.h"
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



@interface SWGCompanyApi: NSObject <SWGApi>

extern NSString* kSWGCompanyApiErrorDomain;
extern NSInteger kSWGCompanyApiMissingParamErrorCode;

+(instancetype) sharedAPI;

/// Retrieve Companies by account
/// Retrieve list companies of one account
///
///  code:200 message:"Transaction Out",
///  code:400 message:"The request was invalid or cannot be otherwise served.",
///  code:401 message:"Authentication credentials were missing or incorrect.",
///  code:403 message:"The request is understood, but it has been refused or access is not allowed.",
///  code:404 message:"The URI requested is invalid or the resource requested does not exists.",
///  code:429 message:"The request cannot be served due to the application’s rate limit having been exhausted for the resource.",
///  code:500 message:"Something is broken.",
///  code:503 message:"The server is up, but overloaded with requests. Try again later."
/// @return NSArray<SWGCompany>*
-(NSNumber*) companiesGetWithCompletionHandler: 
    (void (^)(NSArray<SWGCompany>* output, NSError* error)) handler;

/// Create company and your data configuration
/// This method operation create a company for a account 
///
/// @param body Transaction Message
///  code:200 message:"Transaction Out",
///  code:400 message:"The request was invalid or cannot be otherwise served.",
///  code:401 message:"Authentication credentials were missing or incorrect.",
///  code:403 message:"The request is understood, but it has been refused or access is not allowed.",
///  code:404 message:"The URI requested is invalid or the resource requested does not exists.",
///  code:429 message:"The request cannot be served due to the application’s rate limit having been exhausted for the resource.",
///  code:500 message:"Something is broken.",
///  code:503 message:"The server is up, but overloaded with requests. Try again later."
/// @return SWGCompany*
-(NSNumber*) createCompanyWithBody: (SWGCompany*) body
    completionHandler: (void (^)(SWGCompany* output, NSError* error)) handler;

/// 
///
/// @param accountId Account ID
/// @param companyId Company ID
///  code:204 message:"Success.",
///  code:400 message:"The request was invalid or cannot be otherwise served.",
///  code:401 message:"Authentication credentials were missing or incorrect.",
///  code:403 message:"The request is understood, but it has been refused or access is not allowed.",
///  code:404 message:"The URI requested is invalid or the resource requested does not exists.",
///  code:429 message:"The request cannot be served due to the application’s rate limit having been exhausted for the resource.",
///  code:500 message:"Something is broken.",
///  code:503 message:"The server is up, but overloaded with requests. Try again later."
-(NSNumber*) deleteAccountCompanyWithAccountId: (NSString*) accountId
    companyId: (NSString*) companyId
    completionHandler: (void (^)(NSError* error)) handler;

/// 
///
/// @param companyId Company ID
/// @param companyId2 Company ID
///  code:204 message:"Success.",
///  code:400 message:"The request was invalid or cannot be otherwise served.",
///  code:401 message:"Authentication credentials were missing or incorrect.",
///  code:403 message:"The request is understood, but it has been refused or access is not allowed.",
///  code:404 message:"The URI requested is invalid or the resource requested does not exists.",
///  code:429 message:"The request cannot be served due to the application’s rate limit having been exhausted for the resource.",
///  code:500 message:"Something is broken.",
///  code:503 message:"The server is up, but overloaded with requests. Try again later."
-(NSNumber*) deleteCompanyWithCompanyId: (NSString*) companyId
    companyId2: (NSString*) companyId2
    completionHandler: (void (^)(NSError* error)) handler;

/// Get company information and your data configuration
/// This method operation get a company for a account 
///
/// @param companyId Company ID
///  code:200 message:"Transaction Out",
///  code:400 message:"The request was invalid or cannot be otherwise served.",
///  code:401 message:"Authentication credentials were missing or incorrect.",
///  code:403 message:"The request is understood, but it has been refused or access is not allowed.",
///  code:404 message:"The URI requested is invalid or the resource requested does not exists.",
///  code:429 message:"The request cannot be served due to the application’s rate limit having been exhausted for the resource.",
///  code:500 message:"Something is broken.",
///  code:503 message:"The server is up, but overloaded with requests. Try again later."
/// @return SWGCompany*
-(NSNumber*) infoCompanyWithCompanyId: (NSString*) companyId
    completionHandler: (void (^)(SWGCompany* output, NSError* error)) handler;

/// Update company information and your data configuration
/// This method operation create a company for a account 
///
/// @param companyId Company ID
/// @param body Transaction Message
///  code:204 message:"Success.",
///  code:400 message:"The request was invalid or cannot be otherwise served.",
///  code:401 message:"Authentication credentials were missing or incorrect.",
///  code:403 message:"The request is understood, but it has been refused or access is not allowed.",
///  code:404 message:"The URI requested is invalid or the resource requested does not exists.",
///  code:429 message:"The request cannot be served due to the application’s rate limit having been exhausted for the resource.",
///  code:500 message:"Something is broken.",
///  code:503 message:"The server is up, but overloaded with requests. Try again later."
-(NSNumber*) updateCompanyWithCompanyId: (NSString*) companyId
    body: (SWGCompany*) body
    completionHandler: (void (^)(NSError* error)) handler;


@end
