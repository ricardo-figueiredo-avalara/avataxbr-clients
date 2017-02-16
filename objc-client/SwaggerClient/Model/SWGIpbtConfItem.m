#import "SWGIpbtConfItem.h"

@implementation SWGIpbtConfItem

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"state": @"state", @"federalTax": @"federalTax", @"importTax": @"importTax", @"stateTax": @"stateTax", @"cityTax": @"cityTax", @"source": @"source" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"state", @"federalTax", @"importTax", @"stateTax", @"cityTax", @"source"];
  return [optionalProperties containsObject:propertyName];
}

@end
