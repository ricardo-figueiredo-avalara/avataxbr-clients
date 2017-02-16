# SWGTransport

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**modFreight** | **NSString*** | Freight model  - 0 - CIF,  - 1 - FOB,  - 2 - Thrid party, - 9 - Free shipping when 9 - Free shipping, the fields below will be ignored if present - &#39;transporter&#39; - &#39;withholdICMSTransport&#39; - &#39;volumes&#39; - &#39;vehicle&#39;  | 
**withholdICMSTransport** | **NSNumber*** | Forces witholding of ICMS on transport amount (freight) | [optional] 
**volumes** | [**NSArray&lt;SWGTransportVolumes&gt;***](SWGTransportVolumes.md) | Packages | [optional] 
**vehicle** | [**SWGVehicleTransp***](SWGVehicleTransp.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


