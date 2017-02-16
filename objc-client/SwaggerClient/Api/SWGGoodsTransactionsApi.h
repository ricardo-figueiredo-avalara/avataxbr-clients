#import <Foundation/Foundation.h>
#import "SWGMessage.h"
#import "SWGTransactionForGoodsIn.h"
#import "SWGTransactionForGoodsOut.h"
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



@interface SWGGoodsTransactionsApi: NSObject <SWGApi>

extern NSString* kSWGGoodsTransactionsApiErrorDomain;
extern NSInteger kSWGGoodsTransactionsApiMissingParamErrorCode;

+(instancetype) sharedAPI;

/// Transaction Method
/// This method has more then one operation model, (a) AS IS, the system only stores the transaction; (b) Full Calculation, the system calculates taxes, validates fileds, stores with transaction state, but doesn't try get government authorization; (c) Full Sync, the system calculates taxes, validates fileds, gets government authorization, stores with transaction state when authorized, used for NFCe. 
///
/// @param authorization Bearer {auth}
/// @param body Transaction Message
///  code:200 message:"Transaction Out",
///  code:400 message:"The request was invalid or cannot be otherwise served.",
///  code:401 message:"Authentication credentials were missing or incorrect.",
///  code:403 message:"The request is understood, but it has been refused or access is not allowed.",
///  code:404 message:"The URI requested is invalid or the resource requested does not exists.",
///  code:429 message:"The request cannot be served due to the application’s rate limit having been exhausted for the resource.",
///  code:500 message:"Something is broken.",
///  code:503 message:"The server is up, but overloaded with requests. Try again later."
/// @return SWGTransactionForGoodsOut*
-(NSNumber*) transactionsgoodsPurchasePostWithAuthorization: (NSString*) authorization
    body: (SWGTransactionForGoodsIn*) body
    completionHandler: (void (^)(SWGTransactionForGoodsOut* output, NSError* error)) handler;

/// Transaction Method
/// This method has more then one operation model, (a) AS IS, the system only stores the transaction; (b) Full Calculation, the system calculates taxes, validates fields, stores with transaction state, but doesn't try get government authorization; (c) Full Sync, the system calculates the taxes, validates fileds, gets government authorization, stores with transaction state when authorized, used for NFCe. 
///
/// @param authorization Bearer {auth}
/// @param body Transaction Message
///  code:200 message:"Transaction Out",
///  code:400 message:"The request was invalid or cannot be otherwise served.",
///  code:401 message:"Authentication credentials were missing or incorrect.",
///  code:403 message:"The request is understood, but it has been refused or access is not allowed.",
///  code:404 message:"The URI requested is invalid or the resource requested does not exists.",
///  code:429 message:"The request cannot be served due to the application’s rate limit having been exhausted for the resource.",
///  code:500 message:"Something is broken.",
///  code:503 message:"The server is up, but overloaded with requests. Try again later."
/// @return SWGTransactionForGoodsOut*
-(NSNumber*) transactionsgoodsSalesPostWithAuthorization: (NSString*) authorization
    body: (SWGTransactionForGoodsIn*) body
    completionHandler: (void (^)(SWGTransactionForGoodsOut* output, NSError* error)) handler;


@end