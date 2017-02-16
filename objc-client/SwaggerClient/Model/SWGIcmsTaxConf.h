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


#import "SWGIcmsTaxConfBase.h"
#import "SWGStateEnum.h"


@protocol SWGIcmsTaxConf
@end

@interface SWGIcmsTaxConf : SWGObject


@property(nonatomic) SWGStateEnum* state;
/* On sales process inform the CST hat the item linked to this configuration is subject to - '00' # TAXABLE - '20' # TAXABLE WITH BASE DISCOUNT - '40' # EXEMPT - '41' # NOT TAXABLE - '50' # SUSPENDED  [optional]
 */
@property(nonatomic) NSString* icmsCST;
/* Message to add to NF when this configuration is used [optional]
 */
@property(nonatomic) NSString* messageCode;
/* the mapping key is state code / A chave do mapeamento é o código do Estado. [optional]
 */
@property(nonatomic) NSArray<SWGIcmsTaxConfBase>* relationShip;

@end