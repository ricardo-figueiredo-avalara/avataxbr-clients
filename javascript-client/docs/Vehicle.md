# Br16Api.Vehicle

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tpOp** | **Number** | - 1 # Sales by car dealership - 2 # Direct billing - 3 # Direct sales - 0 # Other  | 
**chassisNumber** | **String** |  | 
**colorCode** | **String** | color code used by factory | 
**colorName** | **String** | color name | 
**cvPower** | **String** | Power using CV unid | 
**cylinderVolumCC** | **String** | engine size in cubic centimeters | 
**netWeight** | **String** | net weight | 
**grossWeight** | **String** | gross weight | 
**serialNumber** | **String** | serie | 
**fuelType** | **String** | - &#39;01&#39; # Alcohol - &#39;02&#39; # Gas - &#39;03&#39; # Diesel - &#39;16&#39; # Alcohol/Gas - &#39;17&#39; # Gas/Alcohol/GNV - &#39;18&#39; # Gas/Electric  | 
**engineNumber** | **String** | engine number | 
**cmt** | **String** | traction capacity, tonne | 
**lengthBetweenAxis** | **String** | length between axis | 
**modelYear** | **String** | model year | 
**manufactoryYear** | **String** | year of factory | 
**paintType** | **String** | paynt type | 
**vehicleRENAVAMType** | **String** |  | 
**specieRENAVAMType** | **String** |  | 
**modelRENAVAMCode** | **String** |  | 
**colorDENATRANCode** | **String** | - &#39;01&#39; # YELLOW - &#39;02&#39; # BLUE - &#39;03&#39; # BEIGE - &#39;04&#39; # WHITE - &#39;05&#39; # GRAY - &#39;06&#39; # GOLDEN - &#39;07&#39; # GRENA - &#39;08&#39; # ORANGE - &#39;09&#39; # BROWN - &#39;10&#39; # SILVER - &#39;11&#39; # BLACK - &#39;12&#39; # PINK - &#39;13&#39; # PURPLE - &#39;14&#39; # GREEN - &#39;15&#39; # RED - &#39;16&#39; # FANTASY  | 
**vin** | **String** | chassis condition original or modified (remarcado) | 
**vehicleManufactoryStatus** | **String** | - &#39;1&#39; # Finished(Done) - &#39;2&#39; # Not finished - &#39;3&#39; # Semi-finished  | 
**maxOccupantsQuantity** | **String** | max number of sit occupants | 
**restrictionType** | **String** | Lien/restriction type - &#39;0&#39; # No one; - &#39;1&#39; # Alienação Fiduciária; - &#39;2&#39; # Arrendamento Mercantil; - &#39;3&#39; # Reserva de Domínio; - &#39;4&#39; # Penhor de Veículos; - &#39;9&#39; # Other.  | 


<a name="FuelTypeEnum"></a>
## Enum: FuelTypeEnum


* `01` (value: `"01"`)

* `02` (value: `"02"`)

* `03` (value: `"03"`)

* `16` (value: `"16"`)

* `17` (value: `"17"`)

* `18` (value: `"18"`)




<a name="ColorDENATRANCodeEnum"></a>
## Enum: ColorDENATRANCodeEnum


* `01` (value: `"01"`)

* `02` (value: `"02"`)

* `03` (value: `"03"`)

* `04` (value: `"04"`)

* `05` (value: `"05"`)

* `06` (value: `"06"`)

* `07` (value: `"07"`)

* `08` (value: `"08"`)

* `09` (value: `"09"`)

* `10` (value: `"10"`)

* `11` (value: `"11"`)

* `12` (value: `"12"`)

* `13` (value: `"13"`)

* `14` (value: `"14"`)

* `15` (value: `"15"`)

* `16` (value: `"16"`)




<a name="VinEnum"></a>
## Enum: VinEnum


* `R` (value: `"R"`)

* `N` (value: `"N"`)




<a name="VehicleManufactoryStatusEnum"></a>
## Enum: VehicleManufactoryStatusEnum


* `1` (value: `"1"`)

* `2` (value: `"2"`)

* `3` (value: `"3"`)




<a name="RestrictionTypeEnum"></a>
## Enum: RestrictionTypeEnum


* `0` (value: `"0"`)

* `1` (value: `"1"`)

* `2` (value: `"2"`)

* `3` (value: `"3"`)

* `4` (value: `"4"`)

* `9` (value: `"9"`)




