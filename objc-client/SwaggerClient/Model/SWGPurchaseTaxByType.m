#import "SWGPurchaseTaxByType.h"

@implementation SWGPurchaseTaxByType

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"issRf": @"issRf", @"pisRf": @"pisRf", @"cofinsRf": @"cofinsRf", @"csllRf": @"csllRf", @"irrf": @"irrf", @"inssRf": @"inssRf", @"inssAr": @"inssAr", @"pis": @"pis", @"cofins": @"cofins" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"issRf", @"pisRf", @"cofinsRf", @"csllRf", @"irrf", @"inssRf", @"inssAr", @"pis", @"cofins"];
  return [optionalProperties containsObject:propertyName];
}

@end
