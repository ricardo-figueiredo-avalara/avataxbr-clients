#import "SWGCustomIcmsConfByState.h"

@implementation SWGCustomIcmsConfByState

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"code": @"code", @"state": @"state", @"name": @"name", @"startDate": @"startDate", @"expirationDate": @"expirationDate", @"inactive": @"inactive", @"subjectToST": @"subjectToST", @"icmsCST": @"icmsCST", @"calcMode": @"calcMode", @"discountRateForMonoPhase": @"discountRateForMonoPhase", @"rate": @"rate", @"icmsBaseDiscount": @"icmsBaseDiscount", @"msrp": @"msrp", @"mvaRate": @"mvaRate", @"msrpUnit": @"msrpUnit", @"icmsLegalReason": @"icmsLegalReason", @"fcpRate": @"fcpRate", @"icmsSTConf": @"icmsSTConf", @"icmsInterStateConf": @"icmsInterStateConf", @"companyId": @"companyId" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"name", @"startDate", @"expirationDate", @"inactive", @"subjectToST", @"icmsCST", @"calcMode", @"discountRateForMonoPhase", @"rate", @"icmsBaseDiscount", @"msrp", @"mvaRate", @"msrpUnit", @"icmsLegalReason", @"fcpRate", @"icmsSTConf", @"icmsInterStateConf", ];
  return [optionalProperties containsObject:propertyName];
}

@end
