#import <Foundation/Foundation.h>
#import "SWGBody1.h"
#import "SWGInlineResponse201.h"
#import "SWGItemGoods.h"
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



@interface SWGCompanyItemGoodsApi: NSObject <SWGApi>

extern NSString* kSWGCompanyItemGoodsApiErrorDomain;
extern NSInteger kSWGCompanyItemGoodsApiMissingParamErrorCode;

+(instancetype) sharedAPI;

/// 
/// Change the code of a given item. 
///
/// @param companyId Company ID
/// @param code Item Code
/// @param body Requisition
/// @param goods Provide to apply to goods items. (optional)
/// @param service Provide to apply to service items. (optional)
///  code:204 message:"Success.",
///  code:400 message:"The request was invalid or cannot be otherwise served.",
///  code:401 message:"Authentication credentials were missing or incorrect.",
///  code:403 message:"The request is understood, but it has been refused or access is not allowed.",
///  code:404 message:"The URI requested is invalid or the resource requested does not exists.",
///  code:429 message:"The request cannot be served due to the application’s rate limit having been exhausted for the resource.",
///  code:500 message:"Something is broken.",
///  code:503 message:"The server is up, but overloaded with requests. Try again later."
-(NSNumber*) companiesCompanyIdItemsCodeChangeCodePutWithCompanyId: (NSString*) companyId
    code: (NSString*) code
    body: (SWGBody1*) body
    goods: (NSString*) goods
    service: (NSString*) service
    completionHandler: (void (^)(NSError* error)) handler;

/// 
/// This operation return custom agast configurations that match with parameters queries 
///
/// @param companyId Company ID
/// @param code Item Code
/// @param avalaraProductType Avalara Product Type (default to goods)
/// @param agast Custom Agast Code (optional)
///  code:200 message:"Successful response",
///  code:400 message:"The request was invalid or cannot be otherwise served.",
///  code:401 message:"Authentication credentials were missing or incorrect.",
///  code:403 message:"The request is understood, but it has been refused or access is not allowed.",
///  code:404 message:"The URI requested is invalid or the resource requested does not exists.",
///  code:429 message:"The request cannot be served due to the application’s rate limit having been exhausted for the resource.",
///  code:500 message:"Something is broken.",
///  code:503 message:"The server is up, but overloaded with requests. Try again later."
/// @return SWGItemGoods*
-(NSNumber*) companiesCompanyIdItemsCodegoodsGetWithCompanyId: (NSString*) companyId
    code: (NSString*) code
    avalaraProductType: (NSString*) avalaraProductType
    agast: (NSString*) agast
    completionHandler: (void (^)(SWGItemGoods* output, NSError* error)) handler;

/// 
/// This operation return custom agast configurations that match with parameters queries 
///
/// @param companyId Company ID
/// @param avalaraProductType Avalara Product Type (default to goods)
/// @param xPaginationLimit The per page limit. Currently set to 10 but subject to change at any time (max 100). (optional) (default to 10)
/// @param xPaginationCurrentPage The current page. Defaults to 1. (optional) (default to 1)
/// @param xPaginationSort  (optional)
/// @param code Item Code (optional)
/// @param agast Custom Agast Code (optional)
///  code:200 message:"Success response",
///  code:400 message:"The request was invalid or cannot be otherwise served.",
///  code:401 message:"Authentication credentials were missing or incorrect.",
///  code:403 message:"The request is understood, but it has been refused or access is not allowed.",
///  code:404 message:"The URI requested is invalid or the resource requested does not exists.",
///  code:429 message:"The request cannot be served due to the application’s rate limit having been exhausted for the resource.",
///  code:500 message:"Something is broken.",
///  code:503 message:"The server is up, but overloaded with requests. Try again later."
/// @return NSArray<SWGItemGoods>*
-(NSNumber*) companiesCompanyIdItemsgoodsGetWithCompanyId: (NSString*) companyId
    avalaraProductType: (NSString*) avalaraProductType
    xPaginationLimit: (NSNumber*) xPaginationLimit
    xPaginationCurrentPage: (NSNumber*) xPaginationCurrentPage
    xPaginationSort: (NSString*) xPaginationSort
    code: (NSString*) code
    agast: (NSString*) agast
    completionHandler: (void (^)(NSArray<SWGItemGoods>* output, NSError* error)) handler;

/// Create custom agast for one company
/// This method operation create a custom agast for one company 
///
/// @param companyId Company ID
/// @param avalaraProductType Avalara Product Type (default to goods)
/// @param body Transaction Message
///  code:201 message:"Success.",
///  code:400 message:"The request was invalid or cannot be otherwise served.",
///  code:401 message:"Authentication credentials were missing or incorrect.",
///  code:403 message:"The request is understood, but it has been refused or access is not allowed.",
///  code:404 message:"The URI requested is invalid or the resource requested does not exists.",
///  code:429 message:"The request cannot be served due to the application’s rate limit having been exhausted for the resource.",
///  code:500 message:"Something is broken.",
///  code:503 message:"The server is up, but overloaded with requests. Try again later."
/// @return SWGInlineResponse201*
-(NSNumber*) createItemWithCompanyId: (NSString*) companyId
    avalaraProductType: (NSString*) avalaraProductType
    body: (SWGItemGoods*) body
    completionHandler: (void (^)(SWGInlineResponse201* output, NSError* error)) handler;

/// 
///
/// @param companyId Company ID
/// @param code Item Code
/// @param avalaraProductType Avalara Product Type (default to goods)
///  code:204 message:"Success.",
///  code:400 message:"The request was invalid or cannot be otherwise served.",
///  code:401 message:"Authentication credentials were missing or incorrect.",
///  code:403 message:"The request is understood, but it has been refused or access is not allowed.",
///  code:404 message:"The URI requested is invalid or the resource requested does not exists.",
///  code:429 message:"The request cannot be served due to the application’s rate limit having been exhausted for the resource.",
///  code:500 message:"Something is broken.",
///  code:503 message:"The server is up, but overloaded with requests. Try again later."
-(NSNumber*) deleteItemWithCompanyId: (NSString*) companyId
    code: (NSString*) code
    avalaraProductType: (NSString*) avalaraProductType
    completionHandler: (void (^)(NSError* error)) handler;

/// Update custom agast for one company
/// This method operation create a custom agast for one company 
///
/// @param companyId Company ID
/// @param code Item Code
/// @param avalaraProductType Avalara Product Type (default to goods)
/// @param body Transaction Message
///  code:204 message:"Success.",
///  code:400 message:"The request was invalid or cannot be otherwise served.",
///  code:401 message:"Authentication credentials were missing or incorrect.",
///  code:403 message:"The request is understood, but it has been refused or access is not allowed.",
///  code:404 message:"The URI requested is invalid or the resource requested does not exists.",
///  code:429 message:"The request cannot be served due to the application’s rate limit having been exhausted for the resource.",
///  code:500 message:"Something is broken.",
///  code:503 message:"The server is up, but overloaded with requests. Try again later."
-(NSNumber*) updateItemWithCompanyId: (NSString*) companyId
    code: (NSString*) code
    avalaraProductType: (NSString*) avalaraProductType
    body: (SWGItemGoods*) body
    completionHandler: (void (^)(NSError* error)) handler;


@end
