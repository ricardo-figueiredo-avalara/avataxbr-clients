#import "SWGTaxTypeRate.h"

@implementation SWGTaxTypeRate

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"taxType": @"taxType", @"taxModel": @"taxModel", @"rate": @"rate", @"srvAmount": @"srvAmount", @"quantityUnidBase": @"quantityUnidBase", @"specializationType": @"specializationType", @"exemptionReasonCode": @"exemptionReasonCode", @"customExemptionReasonDescription": @"customExemptionReasonDescription", @"withholding": @"withholding" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"rate", @"srvAmount", @"quantityUnidBase", @"specializationType", @"exemptionReasonCode", @"customExemptionReasonDescription", @"withholding"];
  return [optionalProperties containsObject:propertyName];
}

@end
