#import "SWGCompany.h"

@implementation SWGCompany

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"code": @"code", @"officialName": @"officialName", @"name": @"name", @"entityType": @"entityType", @"subjectToSRF1234": @"subjectToSRF1234", @"federalTaxRegime": @"federalTaxRegime", @"pisSubjectTo": @"pisSubjectTo", @"cofinsSubjectTo": @"cofinsSubjectTo", @"csllSubjectTo": @"csllSubjectTo", @"receiptsAreFullNoCumulativePisCofins": @"receiptsAreFullNoCumulativePisCofins", @"inssWithholdSubjectTo": @"inssWithholdSubjectTo", @"issWithholdSubjectTo": @"issWithholdSubjectTo", @"irrfWithholdSubjectTo": @"irrfWithholdSubjectTo", @"icmsRateForSimplestaxregime": @"icmsRateForSimplestaxregime", @"isExemptByGrossRevenueForSimplestaxregime": @"isExemptByGrossRevenueForSimplestaxregime", @"configuration": @"configuration", @"mailServer": @"mailServer", @"authorizedToDownloadNFe": @"authorizedToDownloadNFe" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"subjectToSRF1234", @"pisSubjectTo", @"cofinsSubjectTo", @"csllSubjectTo", @"receiptsAreFullNoCumulativePisCofins", @"inssWithholdSubjectTo", @"issWithholdSubjectTo", @"irrfWithholdSubjectTo", @"icmsRateForSimplestaxregime", @"isExemptByGrossRevenueForSimplestaxregime", @"configuration", @"mailServer", @"authorizedToDownloadNFe"];
  return [optionalProperties containsObject:propertyName];
}

@end
