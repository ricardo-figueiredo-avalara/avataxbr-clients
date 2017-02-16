#import "SWGSefazDisableRangeIn.h"

@implementation SWGSefazDisableRangeIn

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"companyLocation": @"companyLocation", @"transactionModel": @"transactionModel", @"invoiceSerial": @"invoiceSerial", @"year": @"year", @"message": @"message", @"invoiceNumberInit": @"invoiceNumberInit", @"invoiceNumberEnd": @"invoiceNumberEnd" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"companyLocation", @"transactionModel", @"invoiceSerial", @"year", @"message", @"invoiceNumberInit", @"invoiceNumberEnd"];
  return [optionalProperties containsObject:propertyName];
}

@end
