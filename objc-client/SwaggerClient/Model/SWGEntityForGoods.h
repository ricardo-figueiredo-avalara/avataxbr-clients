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


#import "SWGEntity.h"
#import "SWGEntityType.h"


@protocol SWGEntityForGoods
@end

@interface SWGEntityForGoods : SWGObject

/* Entity name, official name (Razão Social) [optional]
 */
@property(nonatomic) NSString* name;
/* - 'transporter' - 'sender' # REMETENTE - 'dispatcher' # EXPEDITOR - 'receiver' # RECEIVER - 'addressee' # DESTINATÁRIO - 'other' # OUTRO  [optional]
 */
@property(nonatomic) NSString* role;

@property(nonatomic) SWGEntityType* type;
/* CNPJ/CPF of Sales Buyer, if CPF pattern is '[0-9]{11}' if CNPJ pattern is '[0-9]{14}' 
 */
@property(nonatomic) NSString* federalTaxId;
/* City Tax ID [optional]
 */
@property(nonatomic) NSString* cityTaxId;
/* State Tax ID [optional]
 */
@property(nonatomic) NSString* stateTaxId;
/* Suframa ID [optional]
 */
@property(nonatomic) NSString* suframa;
/* Entity Phone [optional]
 */
@property(nonatomic) NSString* phone;

@property(nonatomic) NSString* taxRegime;
/* Entity Email [optional]
 */
@property(nonatomic) NSString* email;
/* Companies subject to follow same rules of Government entities (Instrução Normativa: SRF1234) [optional]
 */
@property(nonatomic) NSNumber* subjectToSRF1234;
/* Inform if the entity is ICMS tax payer. [optional]
 */
@property(nonatomic) NSNumber* icmsTaxPayer;

@end
