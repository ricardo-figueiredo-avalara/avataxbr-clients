#import "SWGTaxConf.h"

@implementation SWGTaxConf

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"code": @"code", @"stockImpact": @"stockImpact", @"financialImpact": @"financialImpact", @"cstIPI": @"cstIPI", @"ipiLegalTaxClass": @"ipiLegalTaxClass", @"accruablePISTaxation": @"accruablePISTaxation", @"pisExemptLegalReasonCode": @"pisExemptLegalReasonCode", @"pisExemptLegalReason": @"pisExemptLegalReason", @"accruableCOFINSTaxation": @"accruableCOFINSTaxation", @"cofinsExemptLegalReasonCode": @"cofinsExemptLegalReasonCode", @"cofinsExemptLegalReason": @"cofinsExemptLegalReason", @"allowIPIcreditWhenInGoing": @"allowIPIcreditWhenInGoing", @"icmsConf": @"icmsConf" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"stockImpact", @"financialImpact", @"cstIPI", @"ipiLegalTaxClass", @"accruablePISTaxation", @"pisExemptLegalReasonCode", @"pisExemptLegalReason", @"accruableCOFINSTaxation", @"cofinsExemptLegalReasonCode", @"cofinsExemptLegalReason", @"allowIPIcreditWhenInGoing", @"icmsConf"];
  return [optionalProperties containsObject:propertyName];
}

@end
