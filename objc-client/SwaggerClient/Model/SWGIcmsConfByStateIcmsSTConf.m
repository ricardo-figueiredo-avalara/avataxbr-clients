#import "SWGIcmsConfByStateIcmsSTConf.h"

@implementation SWGIcmsConfByStateIcmsSTConf

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"hasReductionOfMVAForSimples": @"hasReductionOfMVAForSimples", @"reductionOfMVAForSimples": @"reductionOfMVAForSimples", @"calcMode": @"calcMode", @"mvaRate": @"mvaRate", @"icmsStBaseDiscount": @"icmsStBaseDiscount", @"srp": @"srp", @"srpUnit": @"srpUnit" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"hasReductionOfMVAForSimples", @"reductionOfMVAForSimples", @"calcMode", @"mvaRate", @"icmsStBaseDiscount", @"srp", @"srpUnit"];
  return [optionalProperties containsObject:propertyName];
}

@end
