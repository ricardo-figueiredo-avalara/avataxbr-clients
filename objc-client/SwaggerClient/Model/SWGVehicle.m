#import "SWGVehicle.h"

@implementation SWGVehicle

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"tpOp": @"tpOp", @"chassisNumber": @"chassisNumber", @"colorCode": @"colorCode", @"colorName": @"colorName", @"cvPower": @"cvPower", @"cylinderVolumCC": @"cylinderVolumCC", @"netWeight": @"netWeight", @"grossWeight": @"grossWeight", @"serialNumber": @"serialNumber", @"fuelType": @"fuelType", @"engineNumber": @"engineNumber", @"cmt": @"cmt", @"lengthBetweenAxis": @"lengthBetweenAxis", @"modelYear": @"modelYear", @"manufactoryYear": @"manufactoryYear", @"paintType": @"paintType", @"vehicleRENAVAMType": @"vehicleRENAVAMType", @"specieRENAVAMType": @"specieRENAVAMType", @"modelRENAVAMCode": @"modelRENAVAMCode", @"colorDENATRANCode": @"colorDENATRANCode", @"vin": @"vin", @"vehicleManufactoryStatus": @"vehicleManufactoryStatus", @"maxOccupantsQuantity": @"maxOccupantsQuantity", @"restrictionType": @"restrictionType" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[];
  return [optionalProperties containsObject:propertyName];
}

@end
