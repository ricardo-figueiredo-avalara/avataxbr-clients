# Br16Api.Transport

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**modFreight** | **String** | Freight model  - 0 - CIF,  - 1 - FOB,  - 2 - Thrid party, - 9 - Free shipping when 9 - Free shipping, the fields below will be ignored if present - &#39;transporter&#39; - &#39;withholdICMSTransport&#39; - &#39;volumes&#39; - &#39;vehicle&#39;  | 
**withholdICMSTransport** | **Boolean** | Forces witholding of ICMS on transport amount (freight) | [optional] 
**volumes** | [**[TransportVolumes]**](TransportVolumes.md) | Packages | [optional] 
**vehicle** | [**VehicleTransp**](VehicleTransp.md) |  | [optional] 


<a name="ModFreightEnum"></a>
## Enum: ModFreightEnum


* `CIF` (value: `"CIF"`)

* `FOB` (value: `"FOB"`)

* `Thridparty` (value: `"Thridparty"`)

* `FreeShipping` (value: `"FreeShipping"`)




