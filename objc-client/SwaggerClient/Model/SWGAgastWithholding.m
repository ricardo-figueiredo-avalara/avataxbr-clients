#import "SWGAgastWithholding.h"

@implementation SWGAgastWithholding

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"iRRF": @"IRRF", @"iRRFLegalReason": @"IRRFLegalReason", @"iNSSSubjectToDischarge": @"INSSSubjectToDischarge", @"iNSS": @"INSS", @"iNSSLegalReason": @"INSSLegalReason", @"iNSsForSimples": @"INSsForSimples", @"iNSSForSimplesLegalReason": @"INSSForSimplesLegalReason", @"pIS": @"PIS", @"cOFINS": @"COFINS", @"cSLL": @"CSLL" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"iRRF", @"iRRFLegalReason", @"iNSSSubjectToDischarge", @"iNSS", @"iNSSLegalReason", @"iNSsForSimples", @"iNSSForSimplesLegalReason", @"pIS", @"cOFINS", @"cSLL"];
  return [optionalProperties containsObject:propertyName];
}

@end
