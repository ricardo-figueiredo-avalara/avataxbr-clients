#import "SWGDetailsCalculatedTax.h"

@implementation SWGDetailsCalculatedTax

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"locationType": @"locationType", @"jurisdictionName": @"jurisdictionName", @"jurisdictionType": @"jurisdictionType", @"taxType": @"taxType", @"rateType": @"rateType", @"scenario": @"scenario", @"subtotalTaxable": @"subtotalTaxable", @"rate": @"rate", @"tax": @"tax", @"exemptionCode": @"exemptionCode", @"significantLocations": @"significantLocations", @"taxRuleType": @"taxRuleType" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"locationType", @"jurisdictionName", @"jurisdictionType", @"taxType", @"rateType", @"scenario", @"subtotalTaxable", @"rate", @"tax", @"exemptionCode", @"significantLocations", @"taxRuleType"];
  return [optionalProperties containsObject:propertyName];
}

@end
