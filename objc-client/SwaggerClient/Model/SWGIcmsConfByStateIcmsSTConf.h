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




@protocol SWGIcmsConfByStateIcmsSTConf
@end

@interface SWGIcmsConfByStateIcmsSTConf : SWGObject

/* inform that substituted is tax regime Simplified the operation MVA will be reduced [optional]
 */
@property(nonatomic) NSNumber* hasReductionOfMVAForSimples;
/* mva reduction when substituted is tax regime Simplified. [optional]
 */
@property(nonatomic) NSNumber* reductionOfMVAForSimples;
/* how this ICMS-ST will be calculed for itens linked to this configuration [optional]
 */
@property(nonatomic) NSString* calcMode;
/* ICMS-ST mva rate to define calc base [optional]
 */
@property(nonatomic) NSNumber* mvaRate;
/* ICMS rate - Redução da BC ICMS ST (%) [optional]
 */
@property(nonatomic) NSNumber* icmsStBaseDiscount;
/* SRP or MSRP amount base for this ICMS-ST configuration [optional]
 */
@property(nonatomic) NSNumber* srp;
/* unit used to srv amount value [optional]
 */
@property(nonatomic) NSString* srpUnit;

@end
