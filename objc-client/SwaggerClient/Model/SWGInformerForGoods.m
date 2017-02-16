#import "SWGInformerForGoods.h"

@implementation SWGInformerForGoods

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"header": @"header", @"line": @"line", @"company": @"_company", @"entity": @"_entity", @"emitter": @"emitter", @"receiver": @"receiver", @"transporter": @"transporter", @"csts": @"csts", @"amount": @"amount", @"discount": @"discount", @"quantity": @"quantity", @"unitPrice": @"unitPrice", @"freightAmount": @"freightAmount", @"insuranceAmount": @"insuranceAmount", @"otherCostAmount": @"otherCostAmount", @"exemptValue": @"exemptValue" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"header", @"line", @"company", @"entity", @"emitter", @"receiver", @"transporter", @"csts", @"amount", @"discount", @"quantity", @"unitPrice", @"freightAmount", @"insuranceAmount", @"otherCostAmount", @"exemptValue"];
  return [optionalProperties containsObject:propertyName];
}

@end
