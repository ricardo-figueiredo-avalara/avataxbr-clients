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


#import "SWGAgastCodeType.h"
#import "SWGAgastIcmsConf.h"
#import "SWGTaxTypeRate.h"


@protocol SWGAgast
@end

@interface SWGAgast : SWGObject

/* Agast Code. AGAST (Avalara Goods and Services Types) are preset products with default tax definitions available to be used as provided or copied to create an specific comapany item. 
 */
@property(nonatomic) NSString* code;
/* Agast Description [optional]
 */
@property(nonatomic) NSString* _description;
/* harmonized code, NCM or LC 116 [optional]
 */
@property(nonatomic) NSString* hsCode;
/* hsCode Exception for IPI tax [optional]
 */
@property(nonatomic) NSNumber* ex;
/* tax substitution code - Codigo especificador da Substuicao Tributaria [optional]
 */
@property(nonatomic) NSString* cest;
/* GTIN NUMBER [optional]
 */
@property(nonatomic) NSString* cean;

@property(nonatomic) SWGAgastCodeType* codeType;
/* Inform if this process is subject to IPI taxation on output process - '50' # Saída Tributada - '51' # Saída Tributável com Alíquota Zero - '52' # Saída Isenta - '53' # Saída Não-Tributada - '54' # Saída Imune  [optional]
 */
@property(nonatomic) NSString* cstIPI;
/* Legal tax classificação for IPI (enquadramento tributário) When the process has CST IPI 52 or 54, it is mandatory to inform a Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo=mCnJajU4BKU=  [optional]
 */
@property(nonatomic) NSString* ipiLegalTaxClass;
/* when the company is Real Profit inform if this item is cumulative or no cumulative by default [optional]
 */
@property(nonatomic) NSString* pisCofinsTaxReporting;
/* Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE  [optional]
 */
@property(nonatomic) NSString* accruablePISTaxation;
/* Inform if this item by nature is subject to COFINS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE  [optional]
 */
@property(nonatomic) NSString* accruableCOFINSTaxation;
/* Inform if this item by nature is subject to CSLL taxation or exempt - 'T' # TAXABLE - 'E' # EXEMPT  [optional]
 */
@property(nonatomic) NSString* accruableCSLLTaxation;
/* for service items with City Jurisdiction, inform where the ISS tax is due [optional]
 */
@property(nonatomic) NSNumber* issDueatDestination;
/* on Real Profit Purchase transaction, inform if this item allows tax credits when it is non-cumulative [optional]
 */
@property(nonatomic) NSNumber* pisCofinsCreditNotAllowed;
/* - 'T' # TAXABLE - TRIBUTÁVEL INCLUSIVE PARA EXPORTAÇÃO' - 'E' # TAXABLE WITH EXEMPTION FOR EXPORTS - ISENTO PARA SERVIÇOS PRESTADOS AO EXTERIOR (DEFAULT) - 'F' # EXEMPT - 'A' # SUSPENDED FOR ADMINISTRATIVE REASON - 'L' # SUSPENDED FOR LEGAL DECISION - 'I' # IMMUNE  [optional]
 */
@property(nonatomic) NSString* issTaxation;
/* This is an array of tax object related to an agast. [optional]
 */
@property(nonatomic) NSArray<SWGTaxTypeRate>* federalTaxRate;

@property(nonatomic) NSString* specialProductClass;
/* One per State [optional]
 */
@property(nonatomic) NSArray<SWGAgastIcmsConf>* icmsConf;

@end
