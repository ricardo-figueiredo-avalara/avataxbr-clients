#import "SWGHeaderForGoods.h"

@implementation SWGHeaderForGoods

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.messageType = @"goods";
    self.eDocCreatorPerspective = @1;
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"messageType": @"messageType", @"accountId": @"accountId", @"companyCode": @"companyCode", @"documentCode": @"documentCode", @"participants": @"participants", @"nfAccessKey": @"nfAccessKey", @"nfceQrCode": @"nfceQrCode", @"transactionType": @"transactionType", @"transactionModel": @"transactionModel", @"transactionClass": @"transactionClass", @"eDocCreatorType": @"eDocCreatorType", @"eDocCreatorPerspective": @"eDocCreatorPerspective", @"entityCode": @"entityCode", @"currency": @"currency", @"companyLocation": @"companyLocation", @"transactionDate": @"transactionDate", @"shippingDate": @"shippingDate", @"additionalInfo": @"additionalInfo", @"tpImp": @"tpImp", @"idDest": @"idDest", @"indPres": @"indPres", @"invoiceNumber": @"invoiceNumber", @"invoiceSerial": @"invoiceSerial", @"defaultLocations": @"defaultLocations", @"transport": @"transport", @"nfRef": @"nfRef", @"payment": @"payment", @"purchaseInfo": @"purchaseInfo", @"export": @"export" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"messageType", @"documentCode", @"participants", @"nfAccessKey", @"nfceQrCode", @"transactionModel", @"transactionClass", @"eDocCreatorPerspective", @"entityCode", @"currency", @"transactionDate", @"shippingDate", @"additionalInfo", @"tpImp", @"idDest", @"indPres", @"invoiceNumber", @"invoiceSerial", @"defaultLocations", @"transport", @"nfRef", @"payment", @"purchaseInfo", @"export"];
  return [optionalProperties containsObject:propertyName];
}

@end
