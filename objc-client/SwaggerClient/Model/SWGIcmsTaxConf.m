#import "SWGIcmsTaxConf.h"

@implementation SWGIcmsTaxConf

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"state": @"state", @"icmsCST": @"icmsCST", @"messageCode": @"messageCode", @"relationShip": @"relationShip" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"icmsCST", @"messageCode", @"relationShip"];
  return [optionalProperties containsObject:propertyName];
}

@end
