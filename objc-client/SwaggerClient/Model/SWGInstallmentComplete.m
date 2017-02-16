#import "SWGInstallmentComplete.h"

@implementation SWGInstallmentComplete

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"documentNumber": @"documentNumber", @"date": @"date", @"grossValue": @"grossValue", @"netValue": @"netValue", @"withholdingMode": @"withholdingMode", @"withholdingPIS": @"withholdingPIS", @"withholdingCOFINS": @"withholdingCOFINS", @"withholdingCSLL": @"withholdingCSLL" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"netValue", @"withholdingMode", @"withholdingPIS", @"withholdingCOFINS", @"withholdingCSLL"];
  return [optionalProperties containsObject:propertyName];
}

@end
