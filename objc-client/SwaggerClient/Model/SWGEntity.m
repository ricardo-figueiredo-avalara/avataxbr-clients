#import "SWGEntity.h"

@implementation SWGEntity

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"name": @"name", @"role": @"role", @"type": @"type", @"federalTaxId": @"federalTaxId", @"cityTaxId": @"cityTaxId", @"stateTaxId": @"stateTaxId", @"suframa": @"suframa", @"phone": @"phone", @"taxRegime": @"taxRegime", @"email": @"email", @"subjectToSRF1234": @"subjectToSRF1234" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"name", @"role", @"cityTaxId", @"stateTaxId", @"suframa", @"phone", @"taxRegime", @"email", @"subjectToSRF1234"];
  return [optionalProperties containsObject:propertyName];
}

@end
