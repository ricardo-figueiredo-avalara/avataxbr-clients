#import "SWGSalesTaxesConfig.h"

@implementation SWGSalesTaxesConfig

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"accruableCOFINSTaxation": @"accruableCOFINSTaxation", @"accruableCSLLTaxation": @"accruableCSLLTaxation", @"accruablePISTaxation": @"accruablePISTaxation", @"accruableCOFINSExempCodeTaxation": @"accruableCOFINSExempCodeTaxation", @"accruablePISExempCodeTaxation": @"accruablePISExempCodeTaxation", @"withholdingCOFINS": @"withholdingCOFINS", @"withholdingCSLL": @"withholdingCSLL", @"withholdingIRRF": @"withholdingIRRF", @"withholdingPIS": @"withholdingPIS", @"withholdIRRFExemptReasonTaxation": @"withholdIRRFExemptReasonTaxation" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"accruableCOFINSTaxation", @"accruableCSLLTaxation", @"accruablePISTaxation", @"accruableCOFINSExempCodeTaxation", @"accruablePISExempCodeTaxation", @"withholdingCOFINS", @"withholdingCSLL", @"withholdingIRRF", @"withholdingPIS", @"withholdIRRFExemptReasonTaxation"];
  return [optionalProperties containsObject:propertyName];
}

@end
