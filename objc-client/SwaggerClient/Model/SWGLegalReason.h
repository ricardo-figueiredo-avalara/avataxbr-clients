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


#import "SWGLegalReasonReferencedProcesses.h"
#import "SWGLegalReasonTaxScope.h"


@protocol SWGLegalReason
@end

@interface SWGLegalReason : SWGObject

/* Internal ID [optional]
 */
@property(nonatomic) NSString* _id;
/* Message scope. May be one of these. general - This message is not linked to any entity (agast/process/cfop) and will be applied to any item in a transacition. (Esta mensagem tem escopo geral, nao está relacionadas diretamente qualquer objeto.); linkedTo - This message is linked to an entity, and its processing will only occur when the context involves it. (Esta mensagens estão relacionadas diretamente a algum objeto como um AGAST por exemplo, um Processo ou uma CFOP.);  
 */
@property(nonatomic) NSString* scope;
/* Set this message as no longer valid [optional]
 */
@property(nonatomic) NSNumber* disable;
/* Legal reason textual description; 
 */
@property(nonatomic) NSString* _description;
/* Short name to this message 
 */
@property(nonatomic) NSString* name;
/* this field inform the official code number [optional]
 */
@property(nonatomic) NSString* legalCode;
/* Optional. Show this message when used in Invoice (NFe, NFCe, others...). Where to show this. [optional]
 */
@property(nonatomic) NSString* showInInvoice;
/* Referenced Process [optional]
 */
@property(nonatomic) NSArray<SWGLegalReasonReferencedProcesses>* referencedProcesses;

@property(nonatomic) SWGLegalReasonTaxScope* taxScope;

@end
