#import "SWGLineForSefazGoods.h"

@implementation SWGLineForSefazGoods

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.numberOfItems = @1.0;
    self.indTotType = @1;
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"lineCode": @"lineCode", @"itemCode": @"itemCode", @"avalaraGoodsAndServicesType": @"avalaraGoodsAndServicesType", @"numberOfItems": @"numberOfItems", @"returnedPercentageAmount": @"returnedPercentageAmount", @"lineUnitPrice": @"lineUnitPrice", @"lineAmount": @"lineAmount", @"itemDescription": @"itemDescription", @"lineTaxedDiscount": @"lineTaxedDiscount", @"lineUntaxedDiscount": @"lineUntaxedDiscount", @"useType": @"useType", @"processScenario": @"processScenario", @"cfop": @"cfop", @"hasStockImpact": @"hasStockImpact", @"hasFinantialImpact": @"hasFinantialImpact", @"freightAmount": @"freightAmount", @"insuranceAmount": @"insuranceAmount", @"otherCostAmount": @"otherCostAmount", @"indTotType": @"indTotType", @"orderNumber": @"orderNumber", @"orderItemNumber": @"orderItemNumber", @"fciNumber": @"fciNumber", @"recopiNumber": @"recopiNumber", @"infAdProd": @"infAdProd", @"vehicle": @"vehicle", @"medicine": @"medicine", @"weapon": @"weapon", @"fuel": @"fuel", @"entityIsIcmsSubstitute": @"entityIsIcmsSubstitute", @"isTransportIcmsWithheld": @"isTransportIcmsWithheld", @"icmsTaxRelief": @"icmsTaxRelief", @"export": @"export", @"di": @"di", @"calculatedTax": @"calculatedTax", @"extend": @"extend" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"avalaraGoodsAndServicesType", @"returnedPercentageAmount", @"lineUnitPrice", @"lineTaxedDiscount", @"lineUntaxedDiscount", @"cfop", @"hasStockImpact", @"hasFinantialImpact", @"freightAmount", @"insuranceAmount", @"otherCostAmount", @"indTotType", @"orderNumber", @"orderItemNumber", @"fciNumber", @"recopiNumber", @"infAdProd", @"vehicle", @"medicine", @"weapon", @"fuel", @"entityIsIcmsSubstitute", @"isTransportIcmsWithheld", @"icmsTaxRelief", @"export", @"di", @"calculatedTax", @"extend"];
  return [optionalProperties containsObject:propertyName];
}

@end
