# IO.Swagger.Model.IcmsConfInterState
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**State** | [**StateEnum**](StateEnum.md) |  | [optional] 
**CalcMode** | **string** | how this ICMS will be calculed for itens linked to this configuration | [optional] 
**DiscountRateForMonoPhase** | **double?** | discount if the item is subject to monophase PIS/COFINS when operation interstate | [optional] 
**Rate** | **double?** | ICMS rate | [optional] 
**FcpRate** | **double?** | FCP rate (Fundo de Combate à Probreza / Fund Against Poverty | [optional] 
**IcmsBaseDiscount** | **double?** | ICMS rate | [optional] 
**Msrp** | **double?** | SRP or MMSRP amount base for this icms configuration | [optional] 
**MvaRate** | **double?** | ICMS MVA rate to define calc base | [optional] 
**MsrpUnit** | **string** | unit used to SRP amount value | [optional] 
**IcmsLegalReason** | **string** | Code for the ICM legal reason, this message will be placed on invoice. | [optional] 
**IcmsSTConf** | [**IcmsConfInterStateIcmsSTConf**](IcmsConfInterStateIcmsSTConf.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

