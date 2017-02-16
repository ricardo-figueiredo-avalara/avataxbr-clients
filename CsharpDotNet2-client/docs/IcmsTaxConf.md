# IO.Swagger.Model.IcmsTaxConf
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**State** | [**StateEnum**](StateEnum.md) |  | [default to null]
**IcmsCST** | **string** | On sales process inform the CST hat the item linked to this configuration is subject to - &#39;00&#39; # TAXABLE - &#39;20&#39; # TAXABLE WITH BASE DISCOUNT - &#39;40&#39; # EXEMPT - &#39;41&#39; # NOT TAXABLE - &#39;50&#39; # SUSPENDED  | [optional] [default to null]
**MessageCode** | **string** | Message to add to NF when this configuration is used | [optional] [default to null]
**RelationShip** | [**List&lt;IcmsTaxConfBase&gt;**](IcmsTaxConfBase.md) | the mapping key is state code / A chave do mapeamento é o código do Estado. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

