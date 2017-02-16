#import "SWGItemGoods.h"

@implementation SWGItemGoods

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"companyId": @"companyId", @"code": @"code", @"agast": @"agast", @"_description": @"description", @"sealCode": @"sealCode", @"nFCI": @"nFCI", @"isIcmsStSubstitute": @"isIcmsStSubstitute", @"source": @"source", @"productType": @"productType", @"manufacturerEquivalent": @"manufacturerEquivalent", @"appropriateIPIcreditWhenInGoing": @"appropriateIPIcreditWhenInGoing", @"usuallyAppropriatePISCOFINSCredit": @"usuallyAppropriatePISCOFINSCredit", @"isPisCofinsEstimatedCredit": @"isPisCofinsEstimatedCredit", @"piscofinsRevenueType": @"piscofinsRevenueType", @"icmsBaseDiscountForMonoPhaseSocialContr": @"icmsBaseDiscountForMonoPhaseSocialContr", @"cest": @"cest", @"cean": @"cean", @"nve": @"nve", @"salesUnit": @"salesUnit", @"salesUnitIPIfactor": @"salesUnitIPIfactor", @"salesUnitIcmsfactor": @"salesUnitIcmsfactor", @"salesUnitIcmsStfactor": @"salesUnitIcmsStfactor", @"salesUnitPisCofinsfactor": @"salesUnitPisCofinsfactor", @"purchaseUnit": @"purchaseUnit", @"purchaseUnitIPIfactor": @"purchaseUnitIPIfactor", @"purchaseUnitIcmsfactor": @"purchaseUnitIcmsfactor", @"purchaseUnitIcmsStfactor": @"purchaseUnitIcmsStfactor", @"purchaseUnitPisCofinsfactor": @"purchaseUnitPisCofinsfactor", @"firstUse": @"firstUse" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_description", @"nFCI", @"isIcmsStSubstitute", @"source", @"productType", @"manufacturerEquivalent", @"appropriateIPIcreditWhenInGoing", @"usuallyAppropriatePISCOFINSCredit", @"isPisCofinsEstimatedCredit", @"piscofinsRevenueType", @"icmsBaseDiscountForMonoPhaseSocialContr", @"cest", @"cean", @"nve", @"salesUnit", @"salesUnitIPIfactor", @"salesUnitIcmsfactor", @"salesUnitIcmsStfactor", @"salesUnitPisCofinsfactor", @"purchaseUnit", @"purchaseUnitIPIfactor", @"purchaseUnitIcmsfactor", @"purchaseUnitIcmsStfactor", @"purchaseUnitPisCofinsfactor", @"firstUse"];
  return [optionalProperties containsObject:propertyName];
}

@end
