#import "SWGFuel.h"

@implementation SWGFuel

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"prodANPCode": @"prodANPCode", @"perMixGN": @"perMixGN", @"authorizationCodeCODIF": @"authorizationCodeCODIF", @"quantityOnRoomTemperature": @"quantityOnRoomTemperature", @"stateCodeOfUndUser": @"stateCodeOfUndUser", @"cide": @"cide", @"pumpNumber": @"pumpNumber" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"perMixGN", @"authorizationCodeCODIF", @"quantityOnRoomTemperature", @"cide", @"pumpNumber"];
  return [optionalProperties containsObject:propertyName];
}

@end
