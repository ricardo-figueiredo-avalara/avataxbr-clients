#import "SWGEntityInformerForGoods.h"

@implementation SWGEntityInformerForGoods

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"type": @"type", @"taxRegime": @"taxRegime", @"federalTaxRegime": @"federalTaxRegime", @"cityCode": @"cityCode", @"address": @"address", @"details": @"details", @"icmsTaxPayer": @"icmsTaxPayer" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"type", @"taxRegime", @"federalTaxRegime", @"cityCode", @"address", @"details", @"icmsTaxPayer"];
  return [optionalProperties containsObject:propertyName];
}

@end
