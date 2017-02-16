#import "SWGPccWithholdingMode.h"

@implementation SWGPccWithholdingMode

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"type": @"type", @"totalTax": @"totalTax", @"pisRf": @"pisRf", @"cofinsRf": @"cofinsRf", @"csllRf": @"csllRf" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"type", @"totalTax", @"pisRf", @"cofinsRf", @"csllRf"];
  return [optionalProperties containsObject:propertyName];
}

@end
