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


@protocol SWGPccWithholdingMode
@end

@interface SWGPccWithholdingMode : SWGObject

/* Inform if this group of tax are calculated considering the threashold by PCC or Individualy (each tax separately) [optional]
 */
@property(nonatomic) NSString* type;
/* this attribute occurs only for CSRF type, When CRSF mode, this is sum of pisRf, CofinsRf and CsllRf [optional]
 */
@property(nonatomic) NSNumber* totalTax;

@property(nonatomic) SWGTaxByTypeTax* pisRf;

@property(nonatomic) SWGTaxByTypeTax* cofinsRf;

@property(nonatomic) SWGTaxByTypeTax* csllRf;

@end
