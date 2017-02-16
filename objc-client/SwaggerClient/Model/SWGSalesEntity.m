#import "SWGSalesEntity.h"

@implementation SWGSalesEntity

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"name": @"name", @"type": @"type", @"email": @"email", @"cnpjcpf": @"cnpjcpf", @"cityTaxId": @"cityTaxId", @"stateTaxId": @"stateTaxId", @"suframa": @"suframa", @"phone": @"phone", @"taxRegime": @"taxRegime", @"specialTaxRegime": @"specialTaxRegime", @"subjectToSRF1234": @"subjectToSRF1234", @"requiredWithholdingISS": @"requiredWithholdingISS", @"art": @"art", @"adminProcess": @"adminProcess", @"buildCode": @"buildCode" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"name", @"email", @"cnpjcpf", @"cityTaxId", @"stateTaxId", @"suframa", @"phone", @"specialTaxRegime", @"subjectToSRF1234", @"requiredWithholdingISS", @"art", @"adminProcess", @"buildCode"];
  return [optionalProperties containsObject:propertyName];
}

@end
