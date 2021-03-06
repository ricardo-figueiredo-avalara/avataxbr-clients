
# Vehicle

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tpOp** | **Integer** | - 1 # Sales by car dealership - 2 # Direct billing - 3 # Direct sales - 0 # Other  | 
**chassisNumber** | **String** |  | 
**colorCode** | **String** | color code used by factory | 
**colorName** | **String** | color name | 
**cvPower** | **String** | Power using CV unid | 
**cylinderVolumCC** | **String** | engine size in cubic centimeters | 
**netWeight** | **String** | net weight | 
**grossWeight** | **String** | gross weight | 
**serialNumber** | **String** | serie | 
**fuelType** | [**FuelTypeEnum**](#FuelTypeEnum) | - &#39;01&#39; # Alcohol - &#39;02&#39; # Gas - &#39;03&#39; # Diesel - &#39;16&#39; # Alcohol/Gas - &#39;17&#39; # Gas/Alcohol/GNV - &#39;18&#39; # Gas/Electric  | 
**engineNumber** | **String** | engine number | 
**cmt** | **String** | traction capacity, tonne | 
**lengthBetweenAxis** | **String** | length between axis | 
**modelYear** | **String** | model year | 
**manufactoryYear** | **String** | year of factory | 
**paintType** | **String** | paynt type | 
**vehicleRENAVAMType** | **String** |  | 
**specieRENAVAMType** | **String** |  | 
**modelRENAVAMCode** | **String** |  | 
**colorDENATRANCode** | [**ColorDENATRANCodeEnum**](#ColorDENATRANCodeEnum) | - &#39;01&#39; # YELLOW - &#39;02&#39; # BLUE - &#39;03&#39; # BEIGE - &#39;04&#39; # WHITE - &#39;05&#39; # GRAY - &#39;06&#39; # GOLDEN - &#39;07&#39; # GRENA - &#39;08&#39; # ORANGE - &#39;09&#39; # BROWN - &#39;10&#39; # SILVER - &#39;11&#39; # BLACK - &#39;12&#39; # PINK - &#39;13&#39; # PURPLE - &#39;14&#39; # GREEN - &#39;15&#39; # RED - &#39;16&#39; # FANTASY  | 
**vin** | [**VinEnum**](#VinEnum) | chassis condition original or modified (remarcado) | 
**vehicleManufactoryStatus** | [**VehicleManufactoryStatusEnum**](#VehicleManufactoryStatusEnum) | - &#39;1&#39; # Finished(Done) - &#39;2&#39; # Not finished - &#39;3&#39; # Semi-finished  | 
**maxOccupantsQuantity** | **String** | max number of sit occupants | 
**restrictionType** | [**RestrictionTypeEnum**](#RestrictionTypeEnum) | Lien/restriction type - &#39;0&#39; # No one; - &#39;1&#39; # Alienação Fiduciária; - &#39;2&#39; # Arrendamento Mercantil; - &#39;3&#39; # Reserva de Domínio; - &#39;4&#39; # Penhor de Veículos; - &#39;9&#39; # Other.  | 


<a name="FuelTypeEnum"></a>
## Enum: FuelTypeEnum
Name | Value
---- | -----
_01 | &quot;01&quot;
_02 | &quot;02&quot;
_03 | &quot;03&quot;
_16 | &quot;16&quot;
_17 | &quot;17&quot;
_18 | &quot;18&quot;


<a name="ColorDENATRANCodeEnum"></a>
## Enum: ColorDENATRANCodeEnum
Name | Value
---- | -----
_01 | &quot;01&quot;
_02 | &quot;02&quot;
_03 | &quot;03&quot;
_04 | &quot;04&quot;
_05 | &quot;05&quot;
_06 | &quot;06&quot;
_07 | &quot;07&quot;
_08 | &quot;08&quot;
_09 | &quot;09&quot;
_10 | &quot;10&quot;
_11 | &quot;11&quot;
_12 | &quot;12&quot;
_13 | &quot;13&quot;
_14 | &quot;14&quot;
_15 | &quot;15&quot;
_16 | &quot;16&quot;


<a name="VinEnum"></a>
## Enum: VinEnum
Name | Value
---- | -----
R | &quot;R&quot;
N | &quot;N&quot;


<a name="VehicleManufactoryStatusEnum"></a>
## Enum: VehicleManufactoryStatusEnum
Name | Value
---- | -----
_1 | &quot;1&quot;
_2 | &quot;2&quot;
_3 | &quot;3&quot;


<a name="RestrictionTypeEnum"></a>
## Enum: RestrictionTypeEnum
Name | Value
---- | -----
_0 | &quot;0&quot;
_1 | &quot;1&quot;
_2 | &quot;2&quot;
_3 | &quot;3&quot;
_4 | &quot;4&quot;
_9 | &quot;9&quot;



