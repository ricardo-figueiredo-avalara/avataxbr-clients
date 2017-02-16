#import "SWGTransportVolumes.h"

@implementation SWGTransportVolumes

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"qVol": @"qVol", @"specie": @"specie", @"brand": @"brand", @"volumeNumeration": @"volumeNumeration", @"netWeight": @"netWeight", @"grossWeight": @"grossWeight", @"seal": @"seal" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"qVol", @"specie", @"brand", @"volumeNumeration", @"netWeight", @"grossWeight", @"seal"];
  return [optionalProperties containsObject:propertyName];
}

@end
