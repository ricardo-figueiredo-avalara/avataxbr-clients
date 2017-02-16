#import "SWGCalculatedTaxSummaryForGoods.h"

@implementation SWGCalculatedTaxSummaryForGoods

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"numberOfLines": @"numberOfLines", @"taxedDiscount": @"taxedDiscount", @"untaxedDiscount": @"untaxedDiscount", @"subtotal": @"subtotal", @"totalTax": @"totalTax", @"grandTotal": @"grandTotal", @"taxByType": @"taxByType" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"numberOfLines", @"taxedDiscount", @"untaxedDiscount", @"subtotal", @"totalTax", @"grandTotal", @"taxByType"];
  return [optionalProperties containsObject:propertyName];
}

@end
