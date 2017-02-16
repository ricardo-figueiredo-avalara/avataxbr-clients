#import "SWGAddress.h"

@implementation SWGAddress

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.countryCode = @"0";
    self.country = @"BRA";
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"street": @"street", @"neighborhood": @"neighborhood", @"zipcode": @"zipcode", @"cityCode": @"cityCode", @"cityName": @"cityName", @"state": @"state", @"countryCode": @"countryCode", @"country": @"country" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"street", @"neighborhood", @"cityCode", @"cityName", @"state", @"countryCode", @"country"];
  return [optionalProperties containsObject:propertyName];
}

@end
