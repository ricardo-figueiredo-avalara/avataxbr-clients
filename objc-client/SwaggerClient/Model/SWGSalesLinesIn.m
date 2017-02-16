#import "SWGSalesLinesIn.h"

@implementation SWGSalesLinesIn

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.numberOfItems = @1.0;
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"lineCode": @"lineCode", @"itemCode": @"itemCode", @"numberOfItems": @"numberOfItems", @"lineAmount": @"lineAmount", @"itemDescription": @"itemDescription", @"lineTaxedDiscount": @"lineTaxedDiscount", @"lineUntaxedDiscount": @"lineUntaxedDiscount", @"taxDeductions": @"taxDeductions" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"lineCode", @"numberOfItems", @"lineAmount", @"itemDescription", @"lineTaxedDiscount", @"lineUntaxedDiscount", @"taxDeductions"];
  return [optionalProperties containsObject:propertyName];
}

@end