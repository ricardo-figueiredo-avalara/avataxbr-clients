#import "SWGCompanyItemGoodsApi.h"
#import "SWGQueryParamCollection.h"
#import "SWGBody1.h"
#import "SWGInlineResponse201.h"
#import "SWGItemGoods.h"
#import "SWGMessage.h"
#import "SWGValidationError.h"


@interface SWGCompanyItemGoodsApi ()

@property (nonatomic, strong) NSMutableDictionary *defaultHeaders;

@end

@implementation SWGCompanyItemGoodsApi

NSString* kSWGCompanyItemGoodsApiErrorDomain = @"SWGCompanyItemGoodsApiErrorDomain";
NSInteger kSWGCompanyItemGoodsApiMissingParamErrorCode = 234513;

@synthesize apiClient = _apiClient;

#pragma mark - Initialize methods

- (instancetype) init {
    self = [super init];
    if (self) {
        SWGConfiguration *config = [SWGConfiguration sharedConfig];
        if (config.apiClient == nil) {
            config.apiClient = [[SWGApiClient alloc] init];
        }
        _apiClient = config.apiClient;
        _defaultHeaders = [NSMutableDictionary dictionary];
    }
    return self;
}

- (id) initWithApiClient:(SWGApiClient *)apiClient {
    self = [super init];
    if (self) {
        _apiClient = apiClient;
        _defaultHeaders = [NSMutableDictionary dictionary];
    }
    return self;
}

#pragma mark -

+ (instancetype)sharedAPI {
    static SWGCompanyItemGoodsApi *sharedAPI;
    static dispatch_once_t once;
    dispatch_once(&once, ^{
        sharedAPI = [[self alloc] init];
    });
    return sharedAPI;
}

-(NSString*) defaultHeaderForKey:(NSString*)key {
    return self.defaultHeaders[key];
}

-(void) addHeader:(NSString*)value forKey:(NSString*)key {
    [self setDefaultHeaderValue:value forKey:key];
}

-(void) setDefaultHeaderValue:(NSString*) value forKey:(NSString*)key {
    [self.defaultHeaders setValue:value forKey:key];
}

-(NSUInteger) requestQueueSize {
    return [SWGApiClient requestQueueSize];
}

#pragma mark - Api Methods

///
/// 
/// Change the code of a given item. 
/// @param companyId Company ID 
///
/// @param code Item Code 
///
/// @param body Requisition 
///
/// @param goods Provide to apply to goods items. (optional)
///
/// @param service Provide to apply to service items. (optional)
///
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
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'companyId' is set
    if (companyId == nil) {
        NSParameterAssert(companyId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"companyId"] };
            NSError* error = [NSError errorWithDomain:kSWGCompanyItemGoodsApiErrorDomain code:kSWGCompanyItemGoodsApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'code' is set
    if (code == nil) {
        NSParameterAssert(code);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"code"] };
            NSError* error = [NSError errorWithDomain:kSWGCompanyItemGoodsApiErrorDomain code:kSWGCompanyItemGoodsApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'body' is set
    if (body == nil) {
        NSParameterAssert(body);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"body"] };
            NSError* error = [NSError errorWithDomain:kSWGCompanyItemGoodsApiErrorDomain code:kSWGCompanyItemGoodsApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/companies/{companyId}/items/{code}/change-code"];

    // remove format in URL if needed
    [resourcePath replaceOccurrencesOfString:@".{format}" withString:@".json" options:0 range:NSMakeRange(0,resourcePath.length)];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (companyId != nil) {
        pathParams[@"companyId"] = companyId;
    }
    if (code != nil) {
        pathParams[@"code"] = code;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (goods != nil) {
        queryParams[@"goods"] = goods;
    }
    if (service != nil) {
        queryParams[@"service"] = service;
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    bodyParam = body;

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"PUT"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: nil
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler(error);
                                }
                           }
          ];
}

///
/// 
/// This operation return custom agast configurations that match with parameters queries 
/// @param companyId Company ID 
///
/// @param code Item Code 
///
/// @param avalaraProductType Avalara Product Type 
///
/// @param agast Custom Agast Code (optional)
///
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
    completionHandler: (void (^)(SWGItemGoods* output, NSError* error)) handler {
    // verify the required parameter 'companyId' is set
    if (companyId == nil) {
        NSParameterAssert(companyId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"companyId"] };
            NSError* error = [NSError errorWithDomain:kSWGCompanyItemGoodsApiErrorDomain code:kSWGCompanyItemGoodsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'code' is set
    if (code == nil) {
        NSParameterAssert(code);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"code"] };
            NSError* error = [NSError errorWithDomain:kSWGCompanyItemGoodsApiErrorDomain code:kSWGCompanyItemGoodsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'avalaraProductType' is set
    if (avalaraProductType == nil) {
        NSParameterAssert(avalaraProductType);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"avalaraProductType"] };
            NSError* error = [NSError errorWithDomain:kSWGCompanyItemGoodsApiErrorDomain code:kSWGCompanyItemGoodsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/companies/{companyId}/items/{code}?goods"];

    // remove format in URL if needed
    [resourcePath replaceOccurrencesOfString:@".{format}" withString:@".json" options:0 range:NSMakeRange(0,resourcePath.length)];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (companyId != nil) {
        pathParams[@"companyId"] = companyId;
    }
    if (code != nil) {
        pathParams[@"code"] = code;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (agast != nil) {
        queryParams[@"agast"] = agast;
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    if (avalaraProductType != nil) {
        headerParams[@"Avalara-Product-Type"] = avalaraProductType;
    }
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"SWGItemGoods*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((SWGItemGoods*)data, error);
                                }
                           }
          ];
}

///
/// 
/// This operation return custom agast configurations that match with parameters queries 
/// @param companyId Company ID 
///
/// @param avalaraProductType Avalara Product Type 
///
/// @param xPaginationLimit The per page limit. Currently set to 10 but subject to change at any time (max 100). (optional, default to 10)
///
/// @param xPaginationCurrentPage The current page. Defaults to 1. (optional, default to 1)
///
/// @param xPaginationSort  (optional)
///
/// @param code Item Code (optional)
///
/// @param agast Custom Agast Code (optional)
///
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
    completionHandler: (void (^)(NSArray<SWGItemGoods>* output, NSError* error)) handler {
    // verify the required parameter 'companyId' is set
    if (companyId == nil) {
        NSParameterAssert(companyId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"companyId"] };
            NSError* error = [NSError errorWithDomain:kSWGCompanyItemGoodsApiErrorDomain code:kSWGCompanyItemGoodsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'avalaraProductType' is set
    if (avalaraProductType == nil) {
        NSParameterAssert(avalaraProductType);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"avalaraProductType"] };
            NSError* error = [NSError errorWithDomain:kSWGCompanyItemGoodsApiErrorDomain code:kSWGCompanyItemGoodsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/companies/{companyId}/items?goods"];

    // remove format in URL if needed
    [resourcePath replaceOccurrencesOfString:@".{format}" withString:@".json" options:0 range:NSMakeRange(0,resourcePath.length)];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (companyId != nil) {
        pathParams[@"companyId"] = companyId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (code != nil) {
        queryParams[@"code"] = code;
    }
    if (agast != nil) {
        queryParams[@"agast"] = agast;
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    if (avalaraProductType != nil) {
        headerParams[@"Avalara-Product-Type"] = avalaraProductType;
    }
    if (xPaginationLimit != nil) {
        headerParams[@"X-Pagination-Limit"] = xPaginationLimit;
    }
    if (xPaginationCurrentPage != nil) {
        headerParams[@"X-Pagination-Current-Page"] = xPaginationCurrentPage;
    }
    if (xPaginationSort != nil) {
        headerParams[@"X-Pagination-Sort"] = xPaginationSort;
    }
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"NSArray<SWGItemGoods>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<SWGItemGoods>*)data, error);
                                }
                           }
          ];
}

///
/// Create custom agast for one company
/// This method operation create a custom agast for one company 
/// @param companyId Company ID 
///
/// @param avalaraProductType Avalara Product Type 
///
/// @param body Transaction Message 
///
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
    completionHandler: (void (^)(SWGInlineResponse201* output, NSError* error)) handler {
    // verify the required parameter 'companyId' is set
    if (companyId == nil) {
        NSParameterAssert(companyId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"companyId"] };
            NSError* error = [NSError errorWithDomain:kSWGCompanyItemGoodsApiErrorDomain code:kSWGCompanyItemGoodsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'avalaraProductType' is set
    if (avalaraProductType == nil) {
        NSParameterAssert(avalaraProductType);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"avalaraProductType"] };
            NSError* error = [NSError errorWithDomain:kSWGCompanyItemGoodsApiErrorDomain code:kSWGCompanyItemGoodsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'body' is set
    if (body == nil) {
        NSParameterAssert(body);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"body"] };
            NSError* error = [NSError errorWithDomain:kSWGCompanyItemGoodsApiErrorDomain code:kSWGCompanyItemGoodsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/companies/{companyId}/items?goods"];

    // remove format in URL if needed
    [resourcePath replaceOccurrencesOfString:@".{format}" withString:@".json" options:0 range:NSMakeRange(0,resourcePath.length)];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (companyId != nil) {
        pathParams[@"companyId"] = companyId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    if (avalaraProductType != nil) {
        headerParams[@"Avalara-Product-Type"] = avalaraProductType;
    }
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    bodyParam = body;

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"SWGInlineResponse201*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((SWGInlineResponse201*)data, error);
                                }
                           }
          ];
}

///
/// 
/// 
/// @param companyId Company ID 
///
/// @param code Item Code 
///
/// @param avalaraProductType Avalara Product Type 
///
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
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'companyId' is set
    if (companyId == nil) {
        NSParameterAssert(companyId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"companyId"] };
            NSError* error = [NSError errorWithDomain:kSWGCompanyItemGoodsApiErrorDomain code:kSWGCompanyItemGoodsApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'code' is set
    if (code == nil) {
        NSParameterAssert(code);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"code"] };
            NSError* error = [NSError errorWithDomain:kSWGCompanyItemGoodsApiErrorDomain code:kSWGCompanyItemGoodsApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'avalaraProductType' is set
    if (avalaraProductType == nil) {
        NSParameterAssert(avalaraProductType);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"avalaraProductType"] };
            NSError* error = [NSError errorWithDomain:kSWGCompanyItemGoodsApiErrorDomain code:kSWGCompanyItemGoodsApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/companies/{companyId}/items/{code}?goods"];

    // remove format in URL if needed
    [resourcePath replaceOccurrencesOfString:@".{format}" withString:@".json" options:0 range:NSMakeRange(0,resourcePath.length)];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (companyId != nil) {
        pathParams[@"companyId"] = companyId;
    }
    if (code != nil) {
        pathParams[@"code"] = code;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    if (avalaraProductType != nil) {
        headerParams[@"Avalara-Product-Type"] = avalaraProductType;
    }
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"DELETE"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: nil
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler(error);
                                }
                           }
          ];
}

///
/// Update custom agast for one company
/// This method operation create a custom agast for one company 
/// @param companyId Company ID 
///
/// @param code Item Code 
///
/// @param avalaraProductType Avalara Product Type 
///
/// @param body Transaction Message 
///
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
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'companyId' is set
    if (companyId == nil) {
        NSParameterAssert(companyId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"companyId"] };
            NSError* error = [NSError errorWithDomain:kSWGCompanyItemGoodsApiErrorDomain code:kSWGCompanyItemGoodsApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'code' is set
    if (code == nil) {
        NSParameterAssert(code);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"code"] };
            NSError* error = [NSError errorWithDomain:kSWGCompanyItemGoodsApiErrorDomain code:kSWGCompanyItemGoodsApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'avalaraProductType' is set
    if (avalaraProductType == nil) {
        NSParameterAssert(avalaraProductType);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"avalaraProductType"] };
            NSError* error = [NSError errorWithDomain:kSWGCompanyItemGoodsApiErrorDomain code:kSWGCompanyItemGoodsApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'body' is set
    if (body == nil) {
        NSParameterAssert(body);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"body"] };
            NSError* error = [NSError errorWithDomain:kSWGCompanyItemGoodsApiErrorDomain code:kSWGCompanyItemGoodsApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/companies/{companyId}/items/{code}?goods"];

    // remove format in URL if needed
    [resourcePath replaceOccurrencesOfString:@".{format}" withString:@".json" options:0 range:NSMakeRange(0,resourcePath.length)];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (companyId != nil) {
        pathParams[@"companyId"] = companyId;
    }
    if (code != nil) {
        pathParams[@"code"] = code;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    if (avalaraProductType != nil) {
        headerParams[@"Avalara-Product-Type"] = avalaraProductType;
    }
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    bodyParam = body;

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"PUT"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: nil
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler(error);
                                }
                           }
          ];
}


@end
