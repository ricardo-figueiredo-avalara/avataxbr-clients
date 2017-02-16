# IO.Swagger.Model.IcmsConfInterState
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**State** | [**StateEnum**](StateEnum.md) |  | [optional] [default to null]
**CalcMode** | **string** | how this ICMS will be calculed for itens linked to this configuration | [optional] [default to null]
**DiscountRateForMonoPhase** | **double?** | discount if the item is subject to monophase PIS/COFINS when operation interstate | [optional] [default to null]
**Rate** | **double?** | ICMS rate | [optional] [default to null]
**FcpRate** | **double?** | FCP rate (Fundo de Combate à Probreza / Fund Against Poverty | [optional] [default to null]
**IcmsBaseDiscount** | **double?** | ICMS rate | [optional] [default to null]
**Msrp** | **double?** | SRP or MMSRP amount base for this icms configuration | [optional] [default to null]
**MvaRate** | **double?** | ICMS MVA rate to define calc base | [optional] [default to null]
**MsrpUnit** | **string** | unit used to SRP amount value | [optional] [default to null]
**IcmsLegalReason** | **string** | Code for the ICM legal reason, this message will be placed on invoice. | [optional] [default to null]
**IcmsSTConf** | [**IcmsConfInterStateIcmsSTConf**](IcmsConfInterStateIcmsSTConf.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

