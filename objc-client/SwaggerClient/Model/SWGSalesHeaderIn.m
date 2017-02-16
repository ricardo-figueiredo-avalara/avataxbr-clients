#import "SWGSalesHeaderIn.h"

@implementation SWGSalesHeaderIn

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.rpsSerie = @"0";
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"accountId": @"accountId", @"companyCode": @"companyCode", @"transactionType": @"transactionType", @"documentCode": @"documentCode", @"currency": @"currency", @"transactionDate": @"transactionDate", @"taxCalculationDate": @"taxCalculationDate", @"companyLocation": @"companyLocation", @"customerCode": @"customerCode", @"purchaseOrderNumber": @"purchaseOrderNumber", @"rpsNumber": @"rpsNumber", @"rpsSerie": @"rpsSerie", @"discriminationIn": @"discriminationIn", @"entity": @"entity", @"payment": @"payment", @"taxesConfig": @"taxesConfig", @"defaultLocations": @"defaultLocations" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"documentCode", @"taxCalculationDate", @"purchaseOrderNumber", @"rpsNumber", @"rpsSerie", @"discriminationIn", @"entity", @"payment", @"taxesConfig", @"defaultLocations"];
  return [optionalProperties containsObject:propertyName];
}

@end
