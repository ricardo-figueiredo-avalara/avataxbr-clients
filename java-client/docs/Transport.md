
# Transport

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**modFreight** | [**ModFreightEnum**](#ModFreightEnum) | Freight model  - 0 - CIF,  - 1 - FOB,  - 2 - Thrid party, - 9 - Free shipping when 9 - Free shipping, the fields below will be ignored if present - &#39;transporter&#39; - &#39;withholdICMSTransport&#39; - &#39;volumes&#39; - &#39;vehicle&#39;  | 
**withholdICMSTransport** | **Boolean** | Forces witholding of ICMS on transport amount (freight) |  [optional]
**volumes** | [**List&lt;TransportVolumes&gt;**](TransportVolumes.md) | Packages |  [optional]
**vehicle** | [**VehicleTransp**](VehicleTransp.md) |  |  [optional]


<a name="ModFreightEnum"></a>
## Enum: ModFreightEnum
Name | Value
---- | -----
CIF | &quot;CIF&quot;
FOB | &quot;FOB&quot;
THRIDPARTY | &quot;Thridparty&quot;
FREESHIPPING | &quot;FreeShipping&quot;



