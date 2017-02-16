#import "SWGPaymentTaxByType.h"

@implementation SWGPaymentTaxByType

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"irrf": @"irrf", @"inssRf": @"inssRf", @"issRf": @"issRf", @"pisRf": @"pisRf", @"cofinsRf": @"cofinsRf", @"csllRf": @"csllRf" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"irrf", @"inssRf", @"issRf", @"pisRf", @"cofinsRf", @"csllRf"];
  return [optionalProperties containsObject:propertyName];
}

@end
