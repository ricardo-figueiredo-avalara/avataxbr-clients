#import "SWGCompanyConfiguration.h"

@implementation SWGCompanyConfiguration

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"certificate": @"certificate", @"certificatepwd": @"certificatepwd", @"certificateexpiration": @"certificateexpiration", @"logo": @"logo", @"tpImpNFe": @"tpImpNFe", @"tpImpNFCe": @"tpImpNFCe" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"certificate", @"certificatepwd", @"certificateexpiration", @"logo", @"tpImpNFe", @"tpImpNFCe"];
  return [optionalProperties containsObject:propertyName];
}

@end
