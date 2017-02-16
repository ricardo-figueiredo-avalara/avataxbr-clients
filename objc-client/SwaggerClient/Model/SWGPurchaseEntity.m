#import "SWGPurchaseEntity.h"

@implementation SWGPurchaseEntity

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"name": @"name", @"type": @"type", @"email": @"email", @"cnpjcpf": @"cnpjcpf", @"cityTaxId": @"cityTaxId", @"stateTaxId": @"stateTaxId", @"suframa": @"suframa", @"phone": @"phone", @"taxRegime": @"taxRegime", @"hasCpom": @"hasCpom", @"subjectWithholdingIrrf": @"subjectWithholdingIrrf", @"inssPreviousContrib": @"inssPreviousContrib", @"inssBasisDiscount": @"inssBasisDiscount", @"issRfRate": @"issRfRate" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"name", @"type", @"email", @"cnpjcpf", @"cityTaxId", @"stateTaxId", @"suframa", @"phone", @"taxRegime", @"hasCpom", @"subjectWithholdingIrrf", @"inssPreviousContrib", @"inssBasisDiscount", @"issRfRate"];
  return [optionalProperties containsObject:propertyName];
}

@end
