# WWW::SwaggerClient::Object::IcmsConfInterState

## Load the model package
```perl
use WWW::SwaggerClient::Object::IcmsConfInterState;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**state** | [**StateEnum**](StateEnum.md) |  | [optional] 
**calc_mode** | **string** | how this ICMS will be calculed for itens linked to this configuration | [optional] 
**discount_rate_for_mono_phase** | **double** | discount if the item is subject to monophase PIS/COFINS when operation interstate | [optional] 
**rate** | **double** | ICMS rate | [optional] 
**fcp_rate** | **double** | FCP rate (Fundo de Combate à Probreza / Fund Against Poverty | [optional] 
**icms_base_discount** | **double** | ICMS rate | [optional] 
**msrp** | **double** | SRP or MMSRP amount base for this icms configuration | [optional] 
**mva_rate** | **double** | ICMS MVA rate to define calc base | [optional] 
**msrp_unit** | **string** | unit used to SRP amount value | [optional] 
**icms_legal_reason** | **string** | Code for the ICM legal reason, this message will be placed on invoice. | [optional] 
**icms_st_conf** | [**IcmsConfInterStateIcmsSTConf**](IcmsConfInterStateIcmsSTConf.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


