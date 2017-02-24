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




@protocol SWGFuelPumpNumber
@end

@interface SWGFuelPumpNumber : SWGObject

/* Identification number of nozzle used in the dispensing process.   Numero de identificação do Bico utilizado no abastecimento  
 */
@property(nonatomic) NSString* nozzleNumberFuelSupply;
/* Identification number of the Pump connect to the used nozzle.   Numero de identificação da bomba ao qual o bico está interligado  
 */
@property(nonatomic) NSString* fuelPumpNumber;
/* Identification number of the Pump connect to the used nozzle.   Numero de identificação da bomba ao qual o bico está interligado  
 */
@property(nonatomic) NSString* fuelTankNumber;
/* Valor do Encerrante no ínicio do abastecimento.  Reading of auto-counter (encerrante) at the start of the refueling/dispensing. This decimal 12 integers and 3 decimals - R$  
 */
@property(nonatomic) NSNumber* startValueOfPumpNumber;
/* Valor do Encerrante no final do abastecimento.  Reading of auto-counter (encerrante) at the end of the refueling/dispensing. This decimal 12 integers and 3 decimals - R$  
 */
@property(nonatomic) NSNumber* endValueOfPumpNumber;

@end
