#import "SWGLocation.h"

@implementation SWGLocation

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.countryCode = @"0";
    self.country = @"BRA";
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"street": @"street", @"neighborhood": @"neighborhood", @"zipcode": @"zipcode", @"cityCode": @"cityCode", @"cityName": @"cityName", @"state": @"state", @"countryCode": @"countryCode", @"country": @"country", @"number": @"number", @"complement": @"complement", @"phone": @"phone", @"companyId": @"companyId", @"code": @"code", @"type": @"type", @"email": @"email", @"federalTaxId": @"federalTaxId", @"stateTaxId": @"stateTaxId", @"secondaryStateTaxId": @"secondaryStateTaxId", @"cityTaxId": @"cityTaxId", @"suframa": @"suframa", @"mainActivity": @"mainActivity", @"nfseProcessModel": @"nfseProcessModel" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"street", @"neighborhood", @"cityCode", @"cityName", @"state", @"countryCode", @"country", @"number", @"complement", @"phone", @"email", @"federalTaxId", @"stateTaxId", @"secondaryStateTaxId", @"cityTaxId", @"suframa", @"mainActivity", @"nfseProcessModel"];
  return [optionalProperties containsObject:propertyName];
}

@end
