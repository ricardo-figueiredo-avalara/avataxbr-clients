#import "SWGSefazInvoiceStatus.h"

@implementation SWGSefazInvoiceStatus

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"code": @"code", @"desc": @"desc", @"_protocol": @"protocol", @"rec": @"rec", @"date": @"date", @"environment": @"environment", @"appVersion": @"appVersion" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"code", @"desc", @"_protocol", @"rec", @"date", @"environment", @"appVersion"];
  return [optionalProperties containsObject:propertyName];
}

@end
