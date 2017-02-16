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




@protocol SWGVehicle
@end

@interface SWGVehicle : SWGObject

/* - 1 # Sales by car dealership - 2 # Direct billing - 3 # Direct sales - 0 # Other  
 */
@property(nonatomic) NSNumber* tpOp;

@property(nonatomic) NSString* chassisNumber;
/* color code used by factory 
 */
@property(nonatomic) NSString* colorCode;
/* color name 
 */
@property(nonatomic) NSString* colorName;
/* Power using CV unid 
 */
@property(nonatomic) NSString* cvPower;
/* engine size in cubic centimeters 
 */
@property(nonatomic) NSString* cylinderVolumCC;
/* net weight 
 */
@property(nonatomic) NSString* netWeight;
/* gross weight 
 */
@property(nonatomic) NSString* grossWeight;
/* serie 
 */
@property(nonatomic) NSString* serialNumber;
/* - '01' # Alcohol - '02' # Gas - '03' # Diesel - '16' # Alcohol/Gas - '17' # Gas/Alcohol/GNV - '18' # Gas/Electric  
 */
@property(nonatomic) NSString* fuelType;
/* engine number 
 */
@property(nonatomic) NSString* engineNumber;
/* traction capacity, tonne 
 */
@property(nonatomic) NSString* cmt;
/* length between axis 
 */
@property(nonatomic) NSString* lengthBetweenAxis;
/* model year 
 */
@property(nonatomic) NSString* modelYear;
/* year of factory 
 */
@property(nonatomic) NSString* manufactoryYear;
/* paynt type 
 */
@property(nonatomic) NSString* paintType;

@property(nonatomic) NSString* vehicleRENAVAMType;

@property(nonatomic) NSString* specieRENAVAMType;

@property(nonatomic) NSString* modelRENAVAMCode;
/* - '01' # YELLOW - '02' # BLUE - '03' # BEIGE - '04' # WHITE - '05' # GRAY - '06' # GOLDEN - '07' # GRENA - '08' # ORANGE - '09' # BROWN - '10' # SILVER - '11' # BLACK - '12' # PINK - '13' # PURPLE - '14' # GREEN - '15' # RED - '16' # FANTASY  
 */
@property(nonatomic) NSString* colorDENATRANCode;
/* chassis condition original or modified (remarcado) 
 */
@property(nonatomic) NSString* vin;
/* - '1' # Finished(Done) - '2' # Not finished - '3' # Semi-finished  
 */
@property(nonatomic) NSString* vehicleManufactoryStatus;
/* max number of sit occupants 
 */
@property(nonatomic) NSString* maxOccupantsQuantity;
/* Lien/restriction type - '0' # No one; - '1' # Alienação Fiduciária; - '2' # Arrendamento Mercantil; - '3' # Reserva de Domínio; - '4' # Penhor de Veículos; - '9' # Other.  
 */
@property(nonatomic) NSString* restrictionType;

@end