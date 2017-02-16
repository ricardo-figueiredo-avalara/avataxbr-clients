#import "SWGCalculatedTaxSummaryForGoodsTaxByType.h"

@implementation SWGCalculatedTaxSummaryForGoodsTaxByType

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"icms": @"icms", @"icmsSt": @"icmsSt", @"icmsStSd": @"icmsStSd", @"icmsPartOwn": @"icmsPartOwn", @"icmsPartDest": @"icmsPartDest", @"icmsDifaFCP": @"icmsDifaFCP", @"icmsDifaDest": @"icmsDifaDest", @"icmsDifaRemet": @"icmsDifaRemet", @"icmsRf": @"icmsRf", @"icmsDeson": @"icmsDeson", @"icmsCredsn": @"icmsCredsn", @"pis": @"pis", @"pisSt": @"pisSt", @"cofins": @"cofins", @"cofinsSt": @"cofinsSt", @"ipi": @"ipi", @"ipiReturned": @"ipiReturned", @"ii": @"ii", @"iof": @"iof", @"aproxtribState": @"aproxtribState", @"aproxtribFed": @"aproxtribFed" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"icms", @"icmsSt", @"icmsStSd", @"icmsPartOwn", @"icmsPartDest", @"icmsDifaFCP", @"icmsDifaDest", @"icmsDifaRemet", @"icmsRf", @"icmsDeson", @"icmsCredsn", @"pis", @"pisSt", @"cofins", @"cofinsSt", @"ipi", @"ipiReturned", @"ii", @"iof", @"aproxtribState", @"aproxtribFed"];
  return [optionalProperties containsObject:propertyName];
}

@end
