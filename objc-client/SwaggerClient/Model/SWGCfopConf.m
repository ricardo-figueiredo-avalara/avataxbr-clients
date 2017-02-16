#import "SWGCfopConf.h"

@implementation SWGCfopConf

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"code": @"code", @"stockImpact": @"stockImpact", @"financialImpact": @"financialImpact", @"cstIPI": @"cstIPI", @"ipiLegalTaxClass": @"ipiLegalTaxClass", @"accruablePISTaxation": @"accruablePISTaxation", @"pisExemptLegalReasonCode": @"pisExemptLegalReasonCode", @"pisExemptLegalReason": @"pisExemptLegalReason", @"accruableCOFINSTaxation": @"accruableCOFINSTaxation", @"cofinsExemptLegalReasonCode": @"cofinsExemptLegalReasonCode", @"cofinsExemptLegalReason": @"cofinsExemptLegalReason", @"allowIPIcreditWhenInGoing": @"allowIPIcreditWhenInGoing", @"icmsConf": @"icmsConf", @"name": @"name", @"_description": @"description", @"wayType": @"wayType", @"codInState": @"codInState", @"codOtherState": @"codOtherState", @"codOtherCountry": @"codOtherCountry", @"cstICMSSameState": @"cstICMSSameState", @"cstICMSOtherState": @"cstICMSOtherState", @"cstICMSOtherCountry": @"cstICMSOtherCountry", @"productType": @"productType", @"operationToTaxPayerOtherState": @"operationToTaxPayerOtherState", @"operationWithST": @"operationWithST", @"operationToFreeZone": @"operationToFreeZone", @"specificForProductClass": @"specificForProductClass" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"stockImpact", @"financialImpact", @"cstIPI", @"ipiLegalTaxClass", @"accruablePISTaxation", @"pisExemptLegalReasonCode", @"pisExemptLegalReason", @"accruableCOFINSTaxation", @"cofinsExemptLegalReasonCode", @"cofinsExemptLegalReason", @"allowIPIcreditWhenInGoing", @"icmsConf", @"_description", @"wayType", @"codInState", @"codOtherState", @"codOtherCountry", @"cstICMSSameState", @"cstICMSOtherState", @"cstICMSOtherCountry", @"productType", @"operationToTaxPayerOtherState", @"operationWithST", @"operationToFreeZone", @"specificForProductClass"];
  return [optionalProperties containsObject:propertyName];
}

@end
