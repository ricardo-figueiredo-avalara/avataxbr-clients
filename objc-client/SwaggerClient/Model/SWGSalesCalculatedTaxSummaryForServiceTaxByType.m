#import "SWGSalesCalculatedTaxSummaryForServiceTaxByType.h"

@implementation SWGSalesCalculatedTaxSummaryForServiceTaxByType

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"pisRf": @"pisRf", @"cofinsRf": @"cofinsRf", @"csllRf": @"csllRf", @"irrf": @"irrf", @"inssRf": @"inssRf", @"pis": @"pis", @"cofins": @"cofins", @"csll": @"csll", @"issRf": @"issRf", @"iss": @"iss", @"aproxtribCity": @"aproxtribCity", @"aproxtribFed": @"aproxtribFed", @"irpj": @"irpj", @"inss": @"inss" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"pisRf", @"cofinsRf", @"csllRf", @"irrf", @"inssRf", @"pis", @"cofins", @"csll", @"issRf", @"iss", @"aproxtribCity", @"aproxtribFed", @"irpj", @"inss"];
  return [optionalProperties containsObject:propertyName];
}

@end
