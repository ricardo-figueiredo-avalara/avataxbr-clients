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


#import "SWGAgastWithholdingCOFINS.h"
#import "SWGAgastWithholdingCSLL.h"
#import "SWGAgastWithholdingPIS.h"


@protocol SWGAgastWithholding
@end

@interface SWGAgastWithholding : SWGObject


@property(nonatomic) NSNumber* iRRF;
/* reference id to TaxLegalReason [optional]
 */
@property(nonatomic) NSString* iRRFLegalReason;
/* Item subjecto to payroll discharge Item sujeto à desoneraçãode folha de pagamento  [optional]
 */
@property(nonatomic) NSNumber* iNSSSubjectToDischarge;

@property(nonatomic) NSNumber* iNSS;
/* reference id to TaxLegalReason [optional]
 */
@property(nonatomic) NSString* iNSSLegalReason;

@property(nonatomic) NSNumber* iNSsForSimples;
/* reference id to TaxLegalReason [optional]
 */
@property(nonatomic) NSString* iNSSForSimplesLegalReason;

@property(nonatomic) SWGAgastWithholdingPIS* pIS;

@property(nonatomic) SWGAgastWithholdingCOFINS* cOFINS;

@property(nonatomic) SWGAgastWithholdingCSLL* cSLL;

@end