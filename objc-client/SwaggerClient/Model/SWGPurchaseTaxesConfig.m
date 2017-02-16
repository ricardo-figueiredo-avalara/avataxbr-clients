#import "SWGPurchaseTaxesConfig.h"

@implementation SWGPurchaseTaxesConfig

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.entityAccruableCOFINSTaxation = @"T";
    self.entityAccruableCSLLTaxation = @"T";
    self.entityAccruablePISTaxation = @"T";
    self.withholdingPIS = @1;
    self.withholdingCOFINS = @1;
    self.withholdingCSLL = @1;
    self.withholdingIRRF = @1;
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"entityAccruableCOFINSTaxation": @"entityAccruableCOFINSTaxation", @"entityAccruableCSLLTaxation": @"entityAccruableCSLLTaxation", @"entityAccruablePISTaxation": @"entityAccruablePISTaxation", @"accruableCOFINSExempCodeTaxation": @"accruableCOFINSExempCodeTaxation", @"accruablePISExempCodeTaxation": @"accruablePISExempCodeTaxation", @"accruablePISExemptReasonTaxation": @"accruablePISExemptReasonTaxation", @"accruableCOFINSExemptReasonTaxation": @"accruableCOFINSExemptReasonTaxation", @"accruableCSLLExemptReasonTaxation": @"accruableCSLLExemptReasonTaxation", @"withholdingPIS": @"withholdingPIS", @"withholdingCOFINS": @"withholdingCOFINS", @"withholdingCSLL": @"withholdingCSLL", @"withholdingIRRF": @"withholdingIRRF", @"withholdCOFINSExemptReasonTaxation": @"withholdCOFINSExemptReasonTaxation", @"withholdCSLLExemptReasonTaxation": @"withholdCSLLExemptReasonTaxation", @"withholdPISExemptReasonTaxation": @"withholdPISExemptReasonTaxation" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"entityAccruableCOFINSTaxation", @"entityAccruableCSLLTaxation", @"entityAccruablePISTaxation", @"accruableCOFINSExempCodeTaxation", @"accruablePISExempCodeTaxation", @"accruablePISExemptReasonTaxation", @"accruableCOFINSExemptReasonTaxation", @"accruableCSLLExemptReasonTaxation", @"withholdingPIS", @"withholdingCOFINS", @"withholdingCSLL", @"withholdingIRRF", @"withholdCOFINSExemptReasonTaxation", @"withholdCSLLExemptReasonTaxation", @"withholdPISExemptReasonTaxation"];
  return [optionalProperties containsObject:propertyName];
}

@end
