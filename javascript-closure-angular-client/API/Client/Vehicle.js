goog.provide('API.Client.Vehicle');

/**
 * @record
 */
API.Client.Vehicle = function() {}

/**
 * - 1 # Sales by car dealership - 2 # Direct billing - 3 # Direct sales - 0 # Other 
 * @type {!number}
 * @export
 */
API.Client.Vehicle.prototype.tpOp;

/**
 * @type {!string}
 * @export
 */
API.Client.Vehicle.prototype.chassisNumber;

/**
 * color code used by factory
 * @type {!string}
 * @export
 */
API.Client.Vehicle.prototype.colorCode;

/**
 * color name
 * @type {!string}
 * @export
 */
API.Client.Vehicle.prototype.colorName;

/**
 * Power using CV unid
 * @type {!string}
 * @export
 */
API.Client.Vehicle.prototype.cvPower;

/**
 * engine size in cubic centimeters
 * @type {!string}
 * @export
 */
API.Client.Vehicle.prototype.cylinderVolumCC;

/**
 * net weight
 * @type {!string}
 * @export
 */
API.Client.Vehicle.prototype.netWeight;

/**
 * gross weight
 * @type {!string}
 * @export
 */
API.Client.Vehicle.prototype.grossWeight;

/**
 * serie
 * @type {!string}
 * @export
 */
API.Client.Vehicle.prototype.serialNumber;

/**
 * - '01' # Alcohol - '02' # Gas - '03' # Diesel - '16' # Alcohol/Gas - '17' # Gas/Alcohol/GNV - '18' # Gas/Electric 
 * @type {!string}
 * @export
 */
API.Client.Vehicle.prototype.fuelType;

/**
 * engine number
 * @type {!string}
 * @export
 */
API.Client.Vehicle.prototype.engineNumber;

/**
 * traction capacity, tonne
 * @type {!string}
 * @export
 */
API.Client.Vehicle.prototype.cmt;

/**
 * length between axis
 * @type {!string}
 * @export
 */
API.Client.Vehicle.prototype.lengthBetweenAxis;

/**
 * model year
 * @type {!string}
 * @export
 */
API.Client.Vehicle.prototype.modelYear;

/**
 * year of factory
 * @type {!string}
 * @export
 */
API.Client.Vehicle.prototype.manufactoryYear;

/**
 * paynt type
 * @type {!string}
 * @export
 */
API.Client.Vehicle.prototype.paintType;

/**
 * @type {!string}
 * @export
 */
API.Client.Vehicle.prototype.vehicleRENAVAMType;

/**
 * @type {!string}
 * @export
 */
API.Client.Vehicle.prototype.specieRENAVAMType;

/**
 * @type {!string}
 * @export
 */
API.Client.Vehicle.prototype.modelRENAVAMCode;

/**
 * - '01' # YELLOW - '02' # BLUE - '03' # BEIGE - '04' # WHITE - '05' # GRAY - '06' # GOLDEN - '07' # GRENA - '08' # ORANGE - '09' # BROWN - '10' # SILVER - '11' # BLACK - '12' # PINK - '13' # PURPLE - '14' # GREEN - '15' # RED - '16' # FANTASY 
 * @type {!string}
 * @export
 */
API.Client.Vehicle.prototype.colorDENATRANCode;

/**
 * chassis condition original or modified (remarcado)
 * @type {!string}
 * @export
 */
API.Client.Vehicle.prototype.vin;

/**
 * - '1' # Finished(Done) - '2' # Not finished - '3' # Semi-finished 
 * @type {!string}
 * @export
 */
API.Client.Vehicle.prototype.vehicleManufactoryStatus;

/**
 * max number of sit occupants
 * @type {!string}
 * @export
 */
API.Client.Vehicle.prototype.maxOccupantsQuantity;

/**
 * Lien/restriction type - '0' # No one; - '1' # Alienação Fiduciária; - '2' # Arrendamento Mercantil; - '3' # Reserva de Domínio; - '4' # Penhor de Veículos; - '9' # Other. 
 * @type {!string}
 * @export
 */
API.Client.Vehicle.prototype.restrictionType;

/** @enum {string} */
API.Client.Vehicle.FuelTypeEnum = { 
  01: '01',
  02: '02',
  03: '03',
  16: '16',
  17: '17',
  18: '18',
}
/** @enum {string} */
API.Client.Vehicle.ColorDENATRANCodeEnum = { 
  01: '01',
  02: '02',
  03: '03',
  04: '04',
  05: '05',
  06: '06',
  07: '07',
  08: '08',
  09: '09',
  10: '10',
  11: '11',
  12: '12',
  13: '13',
  14: '14',
  15: '15',
  16: '16',
}
/** @enum {string} */
API.Client.Vehicle.VinEnum = { 
  R: 'R',
  N: 'N',
}
/** @enum {string} */
API.Client.Vehicle.VehicleManufactoryStatusEnum = { 
  1: '1',
  2: '2',
  3: '3',
}
/** @enum {string} */
API.Client.Vehicle.RestrictionTypeEnum = { 
  0: '0',
  1: '1',
  2: '2',
  3: '3',
  4: '4',
  9: '9',
}
