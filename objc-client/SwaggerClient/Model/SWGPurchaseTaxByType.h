#import <Foundation/Foundation.h>
#import "SWGObject.h"

/**
* AvaTax Brazil
* The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.
*
* OpenAPI spec version: 1.0
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/


#import "SWGTaxByTypeTax.h"


@protocol SWGPurchaseTaxByType
@end

@interface SWGPurchaseTaxByType : SWGObject


@property(nonatomic) SWGTaxByTypeTax* issRf;

@property(nonatomic) SWGTaxByTypeTax* pisRf;

@property(nonatomic) SWGTaxByTypeTax* cofinsRf;

@property(nonatomic) SWGTaxByTypeTax* csllRf;

@property(nonatomic) SWGTaxByTypeTax* irrf;

@property(nonatomic) SWGTaxByTypeTax* inssRf;

@property(nonatomic) SWGTaxByTypeTax* inssAr;

@property(nonatomic) SWGTaxByTypeTax* pis;

@property(nonatomic) SWGTaxByTypeTax* cofins;

@end
