#import "SWGIssConfServiceListTaxRate.h"

@implementation SWGIssConfServiceListTaxRate

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"iSS": @"ISS", @"iSSRF": @"ISS_RF", @"iSSE": @"ISS_E", @"iSSI": @"ISS_I", @"ibpt": @"ibpt" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"iSS", @"iSSRF", @"iSSE", @"iSSI", @"ibpt"];
  return [optionalProperties containsObject:propertyName];
}

@end
