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




@protocol SWGPurchaseTaxesConfig
@end

@interface SWGPurchaseTaxesConfig : SWGObject

/* ATTENTION SELLER POINT OF VIEW. There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings. T TAXABLE, N NOT TAXABLE, Z TAXABLE WITH RATE=0.00, E EXEMPT, H SUSPENDED, S SPECIFIC RATE - 'T' # TAXABLE - 'N' # NOT TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'S' # SPECIFIC RATE  [optional]
 */
@property(nonatomic) NSString* entityAccruableCOFINSTaxation;
/* ATTENTION SELLER POINT OF VIEW. There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be CSLL exempt.   This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings.  - T TAXABLE - E EXEMPT  [optional]
 */
@property(nonatomic) NSString* entityAccruableCSLLTaxation;
/* ATTENTION SELLER POINT OF VIEW. There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings. T TAXABLE, N NOT TAXABLE, Z TAXABLE WITH RATE=0.00, E EXEMPT, H SUSPENDED, S SPECIFIC RATE - 'T' # TAXABLE - 'N' # NOT TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'S' # SPECIFIC RATE  [optional]
 */
@property(nonatomic) NSString* entityAccruablePISTaxation;
/* This is a code available by Receita Federal for reason of the exemption, When Code is 999 the User system need send the custom reason to Exemption. When not Taxable of Seller point of view this field has the reason code. [optional]
 */
@property(nonatomic) NSString* accruableCOFINSExempCodeTaxation;
/* This is a code available by Receita Federal for reason of the exemption, When Code is 999 the User system need send the custom reason to Exemption. When not Taxable of Seller point of view this field has the reason code. [optional]
 */
@property(nonatomic) NSString* accruablePISExempCodeTaxation;
/* When Code is 999 the user system need send the custom reason to Exemption [optional]
 */
@property(nonatomic) NSString* accruablePISExemptReasonTaxation;
/* When Code is 999 the user system need send the custom reason to Exemption [optional]
 */
@property(nonatomic) NSString* accruableCOFINSExemptReasonTaxation;
/* CSLL no withholding Custom Reason [optional]
 */
@property(nonatomic) NSString* accruableCSLLExemptReasonTaxation;
/* Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings. [optional]
 */
@property(nonatomic) NSNumber* withholdingPIS;
/* Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings. [optional]
 */
@property(nonatomic) NSNumber* withholdingCOFINS;
/* Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings. [optional]
 */
@property(nonatomic) NSNumber* withholdingCSLL;
/* Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings. [optional]
 */
@property(nonatomic) NSNumber* withholdingIRRF;
/* COFINS no withholding Custom Reason [optional]
 */
@property(nonatomic) NSString* withholdCOFINSExemptReasonTaxation;
/* CSLL no withholding Custom Reason [optional]
 */
@property(nonatomic) NSString* withholdCSLLExemptReasonTaxation;
/* PIS no withholding Custom Reason [optional]
 */
@property(nonatomic) NSString* withholdPISExemptReasonTaxation;

@end
