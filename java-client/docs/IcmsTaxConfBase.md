
# IcmsTaxConfBase

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**state** | [**StateEnum**](StateEnum.md) |  | 
**icmsCST** | [**IcmsCSTEnum**](#IcmsCSTEnum) | On sales process inform the CST hat the item linked to this configuration is subject to - &#39;00&#39; # TAXABLE - &#39;20&#39; # TAXABLE WITH BASE DISCOUNT - &#39;40&#39; # EXEMPT - &#39;41&#39; # NOT TAXABLE - &#39;50&#39; # SUSPENDED  |  [optional]
**messageCode** | **String** | Message to add to NF when this configuration is used |  [optional]


<a name="IcmsCSTEnum"></a>
## Enum: IcmsCSTEnum
Name | Value
---- | -----
_00 | &quot;00&quot;
_20 | &quot;20&quot;
_40 | &quot;40&quot;
_41 | &quot;41&quot;
_50 | &quot;50&quot;



