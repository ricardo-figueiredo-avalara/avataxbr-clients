#import "SWGPaymentLinesIn.h"

@implementation SWGPaymentLinesIn

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"lineCode": @"lineCode", @"lineType": @"lineType", @"itemCode": @"itemCode", @"itemDescription": @"itemDescription", @"itemDocNumber": @"itemDocNumber", @"lineUntaxedPenality": @"lineUntaxedPenality", @"lineUntaxedDiscount": @"lineUntaxedDiscount", @"lineNetValue": @"lineNetValue" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"lineCode", @"lineType", @"itemDescription", @"itemDocNumber", @"lineUntaxedPenality", @"lineUntaxedDiscount", @"lineNetValue"];
  return [optionalProperties containsObject:propertyName];
}

@end