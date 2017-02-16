#import <Foundation/Foundation.h>
#import "SWGObject.h"

/**
* BR16 - API
* This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts
*
* OpenAPI spec version: 1.0
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/


#import "SWGCfopConf.h"
#import "SWGIcmsTaxConf.h"
#import "SWGProcessScenario.h"


@protocol SWGCustomProcessScenario
@end

@interface SWGCustomProcessScenario : SWGObject

/* Process code to Identify this configuration, its is unique by Accounty Id or when standard, its has priority when the code match with the standard code. 
 */
@property(nonatomic) NSString* code;
/* Inform that the process has inventory impact. [optional]
 */
@property(nonatomic) NSNumber* stockImpact;
/* Inform that the process has financial impact. [optional]
 */
@property(nonatomic) NSNumber* financialImpact;
/* Inform if this process is subject to IPI taxation on output process - '50' # Saída Tributada - '51' # Saída Tributável com Alíquota Zero - '52' # Saída Isenta - '53' # Saída Não-Tributada - '54' # Saída Imune  [optional]
 */
@property(nonatomic) NSString* cstIPI;
/* Legal tax classificação for IPI (enquadramento) When the processo has CST IPI 52 or 54, is mandatory inform Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo=mCnJajU4BKU=  [optional]
 */
@property(nonatomic) NSString* ipiLegalTaxClass;
/* Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE  [optional]
 */
@property(nonatomic) NSString* accruablePISTaxation;
/* When exempt, taxable with zero, suspended, not taxable, this field holds the official code number [optional]
 */
@property(nonatomic) NSString* pisExemptLegalReasonCode;
/* When specifi reason, this field has the description [optional]
 */
@property(nonatomic) NSString* pisExemptLegalReason;
/* Inform if this item by nature is subject to COFINS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE  [optional]
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
/* Process name to Identify this configuration 
 */
@property(nonatomic) NSString* name;

@property(nonatomic) NSString* type;
/* inform if the transaction is an operation to internalizing (receive) item or value [optional]
 */
@property(nonatomic) NSString* wayType;

@property(nonatomic) NSString* goal;
/* inform that the configuration process overwrites the cfop configuration. [optional]
 */
@property(nonatomic) NSNumber* overWriteCFOP;

@property(nonatomic) NSArray<SWGCfopConf>* cfops;
/* Company ID 
 */
@property(nonatomic) NSString* companyId;

@end
