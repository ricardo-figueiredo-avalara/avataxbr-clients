# WWW::SwaggerClient::Object::IcmsConfByState

## Load the model package
```perl
use WWW::SwaggerClient::Object::IcmsConfByState;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **string** | Identify the IcmsConfState in namespace | 
**state** | [**StateEnum**](StateEnum.md) |  | 
**name** | **string** | name for this configuration | [optional] 
**start_date** | **DateTime** | date when this configuration values starts | [optional] 
**expiration_date** | **DateTime** | date when this configuration values expire | [optional] 
**inactive** | **boolean** | set this configuration to Inactive | [optional] 
**subject_to_st** | **boolean** | inform that the item linked to this configuration is subject to ICMS ST on this state | [optional] 
**icms_cst** | **string** | On sales process inform the CST hat the item linked to this configuration is subject to for the own ICMS - &#39;00&#39; # TAXABLE - &#39;20&#39; # TAXABLE WITH BASE DISCOUNT - &#39;40&#39; # EXEMPT - &#39;41&#39; # NOT TAXABLE - &#39;50&#39; # SUSPENDED  | [optional] 
**calc_mode** | **string** | how this ICMS will be calculed for itens linked to this configuration | [optional] 
**discount_rate_for_mono_phase** | **double** | discount if the item is subject to monophase PIS/COFINS for transactions inside state | [optional] 
**rate** | **double** | ICMS rate | [optional] 
**icms_base_discount** | **double** | ICMS rate | [optional] 
**msrp** | **double** | SRP or MMSRP amount base for this icms configuration | [optional] 
**mva_rate** | **double** | ICMS mva rate to define calc base | [optional] 
**msrp_unit** | **string** | unit used to SRP amount value | [optional] 
**icms_legal_reason** | **string** | Code for the ICM legal reason, this message will be placed on invoice. | [optional] 
**fcp_rate** | **double** | Fundo de Combate à pobreza / Fund Against Poverty | [optional] 
**icms_st_conf** | [**IcmsConfByStateIcmsSTConf**](IcmsConfByStateIcmsSTConf.md) |  | [optional] 
**icms_inter_state_conf** | [**ARRAY[IcmsConfInterState]**](IcmsConfInterState.md) | the map key is state code | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


