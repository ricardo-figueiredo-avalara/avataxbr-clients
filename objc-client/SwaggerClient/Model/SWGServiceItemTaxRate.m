#import "SWGServiceItemTaxRate.h"

@implementation SWGServiceItemTaxRate

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"taxType": @"taxType", @"rateType": @"rateType", @"rate": @"rate", @"isExempt": @"isExempt", @"discount": @"discount", @"zone1": @"zone1", @"zone2": @"zone2", @"period": @"period", @"reason": @"reason", @"message": @"message" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"taxType", @"rateType", @"rate", @"isExempt", @"discount", @"zone1", @"zone2", @"period", @"reason", @"message"];
  return [optionalProperties containsObject:propertyName];
}

@end
