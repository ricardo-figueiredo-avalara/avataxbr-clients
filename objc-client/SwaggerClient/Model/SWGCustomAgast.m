#import "SWGCustomAgast.h"

@implementation SWGCustomAgast

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"code": @"code", @"_description": @"description", @"hsCode": @"hsCode", @"ex": @"ex", @"cest": @"cest", @"cean": @"cean", @"codeType": @"codeType", @"cstIPI": @"cstIPI", @"ipiLegalTaxClass": @"ipiLegalTaxClass", @"pisCofinsTaxReporting": @"pisCofinsTaxReporting", @"accruablePISTaxation": @"accruablePISTaxation", @"pisExemptLegalReasonCode": @"pisExemptLegalReasonCode", @"pisExemptLegalReason": @"pisExemptLegalReason", @"accruableCOFINSTaxation": @"accruableCOFINSTaxation", @"cofinsExemptLegalReasonCode": @"cofinsExemptLegalReasonCode", @"cofinsExemptLegalReason": @"cofinsExemptLegalReason", @"accruableCSLLTaxation": @"accruableCSLLTaxation", @"csllExemptLegalReason": @"csllExemptLegalReason", @"csllExemptLegalReasonCode": @"csllExemptLegalReasonCode", @"withholding": @"withholding", @"issDueatDestination": @"issDueatDestination", @"pisCofinsCreditNotAllowed": @"pisCofinsCreditNotAllowed", @"issTaxation": @"issTaxation", @"federalTaxRate": @"federalTaxRate", @"specialProductClass": @"specialProductClass", @"icmsConf": @"icmsConf", @"companyId": @"companyId" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_description", @"hsCode", @"ex", @"cest", @"cean", @"codeType", @"cstIPI", @"ipiLegalTaxClass", @"pisCofinsTaxReporting", @"accruablePISTaxation", @"pisExemptLegalReasonCode", @"pisExemptLegalReason", @"accruableCOFINSTaxation", @"cofinsExemptLegalReasonCode", @"cofinsExemptLegalReason", @"accruableCSLLTaxation", @"csllExemptLegalReason", @"csllExemptLegalReasonCode", @"withholding", @"issDueatDestination", @"pisCofinsCreditNotAllowed", @"issTaxation", @"federalTaxRate", @"specialProductClass", @"icmsConf", ];
  return [optionalProperties containsObject:propertyName];
}

@end
