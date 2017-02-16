#import "SWGPayRecHeader.h"

@implementation SWGPayRecHeader

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"accountId": @"accountId", @"companyCode": @"companyCode", @"transactionType": @"transactionType", @"documentCode": @"documentCode", @"currency": @"currency", @"transactionDate": @"transactionDate", @"taxCalculationDate": @"taxCalculationDate", @"vendorCode": @"vendorCode", @"paymentMode": @"paymentMode" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"documentCode", @"taxCalculationDate", ];
  return [optionalProperties containsObject:propertyName];
}

@end
