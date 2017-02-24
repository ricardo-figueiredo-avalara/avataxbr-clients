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




@protocol SWGCompanyConfiguration
@end

@interface SWGCompanyConfiguration : SWGObject

/* digital certificate A1 model, p12, encoded by base64 [optional]
 */
@property(nonatomic) NSString* certificate;
/* certificate password [optional]
 */
@property(nonatomic) NSString* certificatepwd;
/* expiration date of this certificate [optional]
 */
@property(nonatomic) NSDate* certificateexpiration;
/* company logo image encoded by base64 [optional]
 */
@property(nonatomic) NSString* logo;
/* how the document will be printed - '0' # without DANFE; - '1' # DANFe Letter; - '2' # DANFe Landscape;  [optional]
 */
@property(nonatomic) NSString* tpImpNFe;
/* how the document will be printed - '0' # without DANFE; - '4' # DANFe NFC-e; - '5' # DANFe NFC-e e-mail  [optional]
 */
@property(nonatomic) NSString* tpImpNFCe;

@end
