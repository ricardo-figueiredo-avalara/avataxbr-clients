# SwaggerClient::IcmsConfInterState

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**state** | [**StateEnum**](StateEnum.md) |  | [optional] 
**calc_mode** | **String** | how this ICMS will be calculed for itens linked to this configuration | [optional] 
**discount_rate_for_mono_phase** | **Float** | discount if the item is subject to monophase PIS/COFINS when operation interstate | [optional] 
**rate** | **Float** | ICMS rate | [optional] 
**fcp_rate** | **Float** | FCP rate (Fundo de Combate à Probreza / Fund Against Poverty | [optional] 
**icms_base_discount** | **Float** | ICMS rate | [optional] 
**msrp** | **Float** | SRP or MMSRP amount base for this icms configuration | [optional] 
**mva_rate** | **Float** | ICMS MVA rate to define calc base | [optional] 
**msrp_unit** | **String** | unit used to SRP amount value | [optional] 
**icms_legal_reason** | **String** | Code for the ICM legal reason, this message will be placed on invoice. | [optional] 
**icms_st_conf** | [**IcmsConfInterStateIcmsSTConf**](IcmsConfInterStateIcmsSTConf.md) |  | [optional] 


