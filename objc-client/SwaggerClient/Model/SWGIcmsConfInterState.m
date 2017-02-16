#import "SWGIcmsConfInterState.h"

@implementation SWGIcmsConfInterState

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"state": @"state", @"calcMode": @"calcMode", @"discountRateForMonoPhase": @"discountRateForMonoPhase", @"rate": @"rate", @"fcpRate": @"fcpRate", @"icmsBaseDiscount": @"icmsBaseDiscount", @"msrp": @"msrp", @"mvaRate": @"mvaRate", @"msrpUnit": @"msrpUnit", @"icmsLegalReason": @"icmsLegalReason", @"icmsSTConf": @"icmsSTConf" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"state", @"calcMode", @"discountRateForMonoPhase", @"rate", @"fcpRate", @"icmsBaseDiscount", @"msrp", @"mvaRate", @"msrpUnit", @"icmsLegalReason", @"icmsSTConf"];
  return [optionalProperties containsObject:propertyName];
}

@end
