package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class Vehicle {

  /* - 1 # Sales by car dealership - 2 # Direct billing - 3 # Direct sales - 0 # Other  */
  Integer tpOp = null

    String chassisNumber = null

  /* color code used by factory */
  String colorCode = null

  /* color name */
  String colorName = null

  /* Power using CV unid */
  String cvPower = null

  /* engine size in cubic centimeters */
  String cylinderVolumCC = null

  /* net weight */
  String netWeight = null

  /* gross weight */
  String grossWeight = null

  /* serie */
  String serialNumber = null

  /* - '01' # Alcohol - '02' # Gas - '03' # Diesel - '16' # Alcohol/Gas - '17' # Gas/Alcohol/GNV - '18' # Gas/Electric  */
  String fuelType = null

  /* engine number */
  String engineNumber = null

  /* traction capacity, tonne */
  String cmt = null

  /* length between axis */
  String lengthBetweenAxis = null

  /* model year */
  String modelYear = null

  /* year of factory */
  String manufactoryYear = null

  /* paynt type */
  String paintType = null

    String vehicleRENAVAMType = null

    String specieRENAVAMType = null

    String modelRENAVAMCode = null

  /* - '01' # YELLOW - '02' # BLUE - '03' # BEIGE - '04' # WHITE - '05' # GRAY - '06' # GOLDEN - '07' # GRENA - '08' # ORANGE - '09' # BROWN - '10' # SILVER - '11' # BLACK - '12' # PINK - '13' # PURPLE - '14' # GREEN - '15' # RED - '16' # FANTASY  */
  String colorDENATRANCode = null

  /* chassis condition original or modified (remarcado) */
  String vin = null

  /* - '1' # Finished(Done) - '2' # Not finished - '3' # Semi-finished  */
  String vehicleManufactoryStatus = null

  /* max number of sit occupants */
  String maxOccupantsQuantity = null

  /* Lien/restriction type - '0' # No one; - '1' # Alienação Fiduciária; - '2' # Arrendamento Mercantil; - '3' # Reserva de Domínio; - '4' # Penhor de Veículos; - '9' # Other.  */
  String restrictionType = null
  

}

