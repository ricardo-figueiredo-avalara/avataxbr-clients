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




@protocol SWGSalesTaxByTypeDetail
@end

@interface SWGSalesTaxByTypeDetail : SWGObject

/* This string captures the applicable location type. Location used for calc. Buyer or Seller [optional]
 */
@property(nonatomic) NSString* locationType;
/* Jurisdiction used for calctax amount [optional]
 */
@property(nonatomic) NSString* jurisdictionName;
/* Type of jurisdiction - 'city' - 'state' - 'country'  [optional]
 */
@property(nonatomic) NSString* jurisdictionType;
/* Tax identificator - 'aproxtribCity' - 'aproxtribFed' - 'pis' - 'pisRf' - 'cofins' - 'cofinsRf' - 'csll' - 'csllRf' - 'irrf' - 'inss' - 'inssRf' - 'iss' - 'issRf' - 'irpj'  [optional]
 */
@property(nonatomic) NSString* taxType;
/* Name of configuration rate [optional]
 */
@property(nonatomic) NSString* rateType;
/* This string captures the transaction scenario used to calculate the tax for this tax type. Scenarios are specific to the tax type. This field provides information about how the tax engine interpreted the transaction information that was passed in. [optional]
 */
@property(nonatomic) NSString* scenario;
/* This decimal captures how much of the lineAmount was taxable by this tax, calc base [optional]
 */
@property(nonatomic) NSNumber* subtotalTaxable;
/* This decimal captures how much of the lineAmount was non-taxed. This is simply the line amount minus the taxable. [optional]
 */
@property(nonatomic) NSNumber* subtotalExempt;
/* This decimal captures the tax rate for this tax.3.00 (3%) [optional]
 */
@property(nonatomic) NSNumber* rate;
/* This decimal captures how much of the lineAmount was taxable by this tax [optional]
 */
@property(nonatomic) NSNumber* tax;
/* This string is required if is exempt [optional]
 */
@property(nonatomic) NSString* exemptionCode;
/* This element captures the list of locations that contributed to the tax determination. for BR16 Service is Buyer and Seller Address [optional]
 */
@property(nonatomic) NSArray<NSString*>* significantLocations;
/* This string with type of rule - 'SELLER' - 'BUYER' - 'TRANSACTION' - 'ITEM' - 'TAX'  [optional]
 */
@property(nonatomic) NSString* taxRuleType;

@end