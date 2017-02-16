# Transport

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mod_freight** | **str** | Freight model  - 0 - CIF,  - 1 - FOB,  - 2 - Thrid party, - 9 - Free shipping when 9 - Free shipping, the fields below will be ignored if present - &#39;transporter&#39; - &#39;withholdICMSTransport&#39; - &#39;volumes&#39; - &#39;vehicle&#39;  | 
**withhold_icms_transport** | **bool** | Forces witholding of ICMS on transport amount (freight) | [optional] 
**volumes** | [**list[TransportVolumes]**](TransportVolumes.md) | Packages | [optional] 
**vehicle** | [**VehicleTransp**](VehicleTransp.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


