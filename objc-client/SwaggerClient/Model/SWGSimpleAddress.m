#import "SWGSimpleAddress.h"

@implementation SWGSimpleAddress

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.country = @"BRA";
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"line1": @"line1", @"line2": @"line2", @"line3": @"line3", @"city": @"city", @"zipcode": @"zipcode", @"state": @"state", @"country": @"country" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"city", @"state", ];
  return [optionalProperties containsObject:propertyName];
}

@end
