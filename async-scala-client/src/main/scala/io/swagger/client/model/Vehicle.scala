package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Vehicle (
  tpOp: Integer,  // - 1 # Sales by car dealership - 2 # Direct billing - 3 # Direct sales - 0 # Other 
chassisNumber: String,
colorCode: String,  // color code used by factory
colorName: String,  // color name
cvPower: String,  // Power using CV unid
cylinderVolumCC: String,  // engine size in cubic centimeters
netWeight: String,  // net weight
grossWeight: String,  // gross weight
serialNumber: String,  // serie
fuelType: String,  // - &#39;01&#39; # Alcohol - &#39;02&#39; # Gas - &#39;03&#39; # Diesel - &#39;16&#39; # Alcohol/Gas - &#39;17&#39; # Gas/Alcohol/GNV - &#39;18&#39; # Gas/Electric 
engineNumber: String,  // engine number
cmt: String,  // traction capacity, tonne
lengthBetweenAxis: String,  // length between axis
modelYear: String,  // model year
manufactoryYear: String,  // year of factory
paintType: String,  // paynt type
vehicleRENAVAMType: String,
specieRENAVAMType: String,
modelRENAVAMCode: String,
colorDENATRANCode: String,  // - &#39;01&#39; # YELLOW - &#39;02&#39; # BLUE - &#39;03&#39; # BEIGE - &#39;04&#39; # WHITE - &#39;05&#39; # GRAY - &#39;06&#39; # GOLDEN - &#39;07&#39; # GRENA - &#39;08&#39; # ORANGE - &#39;09&#39; # BROWN - &#39;10&#39; # SILVER - &#39;11&#39; # BLACK - &#39;12&#39; # PINK - &#39;13&#39; # PURPLE - &#39;14&#39; # GREEN - &#39;15&#39; # RED - &#39;16&#39; # FANTASY 
vin: String,  // chassis condition original or modified (remarcado)
vehicleManufactoryStatus: String,  // - &#39;1&#39; # Finished(Done) - &#39;2&#39; # Not finished - &#39;3&#39; # Semi-finished 
maxOccupantsQuantity: String,  // max number of sit occupants
restrictionType: String  // Lien/restriction type - &#39;0&#39; # No one; - &#39;1&#39; # Alienação Fiduciária; - &#39;2&#39; # Arrendamento Mercantil; - &#39;3&#39; # Reserva de Domínio; - &#39;4&#39; # Penhor de Veículos; - &#39;9&#39; # Other. 
)
