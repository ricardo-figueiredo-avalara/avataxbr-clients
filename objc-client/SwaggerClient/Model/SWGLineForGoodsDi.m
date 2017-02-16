#import "SWGLineForGoodsDi.h"

@implementation SWGLineForGoodsDi

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"customsValue": @"customsValue", @"diNumber": @"diNumber", @"registerDateDI": @"registerDateDI", @"clearanceSite": @"clearanceSite", @"clearanceState": @"clearanceState", @"clearanceDate": @"clearanceDate", @"transportDIType": @"transportDIType", @"afrmmValue": @"afrmmValue", @"intermediateType": @"intermediateType", @"buyerFederalTaxID": @"buyerFederalTaxID", @"buyerState": @"buyerState", @"exporterCode": @"exporterCode", @"adi": @"adi" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"customsValue", @"clearanceDate", @"afrmmValue", @"buyerFederalTaxID", @"buyerState", @"exporterCode", ];
  return [optionalProperties containsObject:propertyName];
}

@end
