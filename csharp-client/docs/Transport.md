# IO.Swagger.Model.Transport
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ModFreight** | **string** | Freight model  - 0 - CIF,  - 1 - FOB,  - 2 - Thrid party, - 9 - Free shipping when 9 - Free shipping, the fields below will be ignored if present - &#39;transporter&#39; - &#39;withholdICMSTransport&#39; - &#39;volumes&#39; - &#39;vehicle&#39;  | 
**WithholdICMSTransport** | **bool?** | Forces witholding of ICMS on transport amount (freight) | [optional] 
**Volumes** | [**List&lt;TransportVolumes&gt;**](TransportVolumes.md) | Packages | [optional] 
**Vehicle** | [**VehicleTransp**](VehicleTransp.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

