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


#import "SWGCstIcmsEnum.h"
#import "SWGIcmsTaxConf.h"
#import "SWGTaxConf.h"


@protocol SWGCfopConf
@end

@interface SWGCfopConf : SWGObject

/* main unique identificator 
 */
@property(nonatomic) NSString* code;
/* Inform that the process has inventory impact. [optional]
 */
@property(nonatomic) NSNumber* stockImpact;
/* Inform that the process has financial impact. [optional]
 */
@property(nonatomic) NSNumber* financialImpact;
/* Inform if this process is subject to IPI taxation on output process - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'H'  # SUSPENDED - 'N'  # NO TAXABLE     - 'I'  # IMMUNE - 'O'  # OTHER - 'OZ' # OTHER AND ZERO VALUES  [optional]
 */
@property(nonatomic) NSString* cstIPI;
/* Legal tax classificação for IPI (enquadramento) When the processo has CST IPI 52 or 54, is mandatory inform Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo=mCnJajU4BKU=  [optional]
 */
@property(nonatomic) NSString* ipiLegalTaxClass;
/* Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE - 'O' # OTHER - 'OZ'# OTHER AND ZERO VALUES  [optional]
 */
@property(nonatomic) NSString* accruablePISTaxation;
/* When exempt, taxable with zero, suspended, not taxable, this field holds the official code number [optional]
 */
@property(nonatomic) NSString* pisExemptLegalReasonCode;
/* When specifi reason, this field has the description [optional]
 */
@property(nonatomic) NSString* pisExemptLegalReason;
/* Inform if this item by nature is subject to COFINS taxation or exempt - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'H'  # SUSPENDED - 'N'  # NO TAXABLE     - 'O'  # OTHER - 'OZ' # OTHER AND ZERO VALUES  [optional]
 */
@property(nonatomic) NSString* accruableCOFINSTaxation;
/* When exempt, taxable with zero, suspended, not taxable, this field holds the official code number [optional]
 */
@property(nonatomic) NSString* cofinsExemptLegalReasonCode;
/* When specifi reason, this field has the description [optional]
 */
@property(nonatomic) NSString* cofinsExemptLegalReason;
/* Inform that the process allow IPI credit to Input process [optional]
 */
@property(nonatomic) NSNumber* allowIPIcreditWhenInGoing;
/* the map key is state code [optional]
 */
@property(nonatomic) NSArray<SWGIcmsTaxConf>* icmsConf;

@property(nonatomic) NSString* name;

@property(nonatomic) NSString* _description;
/* inform if the transaction is an operation to internalizing item or value [optional]
 */
@property(nonatomic) NSString* wayType;
/* CFOP code (tax code operation) when the transactions are within the same state. [optional]
 */
@property(nonatomic) NSNumber* codInState;
/* CFOP code (tax code operation) when the transactions are to another state. [optional]
 */
@property(nonatomic) NSNumber* codOtherState;
/* CFOP code (tax code operation) when the transactions are to another country. [optional]
 */
@property(nonatomic) NSNumber* codOtherCountry;

@property(nonatomic) SWGCstIcmsEnum* cstICMSSameState;

@property(nonatomic) SWGCstIcmsEnum* cstICMSOtherState;

@property(nonatomic) SWGCstIcmsEnum* cstICMSOtherCountry;
/* this field is used to define right CFOP, one operation type can be specialized to item product, item merchandise or generic [optional]
 */
@property(nonatomic) NSString* productType;
/* field used to indicate an operation to ICMS tax payer [optional]
 */
@property(nonatomic) NSNumber* operationToTaxPayerOtherState;
/* field used to indicate an operation to items sibject to ICMS-ST [optional]
 */
@property(nonatomic) NSNumber* operationWithST;
/* field used to indicate an operation to free zone [optional]
 */
@property(nonatomic) NSNumber* operationToFreeZone;
/* field used to indicate an operation to some product class specifically [optional]
 */
@property(nonatomic) NSString* specificForProductClass;

@end
