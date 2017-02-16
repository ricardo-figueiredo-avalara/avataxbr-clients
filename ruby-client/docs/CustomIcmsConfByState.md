# SwaggerClient::CustomIcmsConfByState

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | Identify the IcmsConfState in namespace | 
**state** | [**StateEnum**](StateEnum.md) |  | 
**name** | **String** | name for this configuration | [optional] 
**start_date** | **DateTime** | date when this configuration values starts | [optional] 
**expiration_date** | **DateTime** | date when this configuration values expire | [optional] 
**inactive** | **BOOLEAN** | set this configuration to Inactive | [optional] 
**subject_to_st** | **BOOLEAN** | inform that the item linked to this configuration is subject to ICMS ST on this state | [optional] 
**icms_cst** | **String** | On sales process inform the CST hat the item linked to this configuration is subject to for the own ICMS - &#39;00&#39; # TAXABLE - &#39;20&#39; # TAXABLE WITH BASE DISCOUNT - &#39;40&#39; # EXEMPT - &#39;41&#39; # NOT TAXABLE - &#39;50&#39; # SUSPENDED  | [optional] 
**calc_mode** | **String** | how this ICMS will be calculed for itens linked to this configuration | [optional] 
**discount_rate_for_mono_phase** | **Float** | discount if the item is subject to monophase PIS/COFINS for transactions inside state | [optional] 
**rate** | **Float** | ICMS rate | [optional] 
**icms_base_discount** | **Float** | ICMS rate | [optional] 
**msrp** | **Float** | SRP or MMSRP amount base for this icms configuration | [optional] 
**mva_rate** | **Float** | ICMS mva rate to define calc base | [optional] 
**msrp_unit** | **String** | unit used to SRP amount value | [optional] 
**icms_legal_reason** | **String** | Code for the ICM legal reason, this message will be placed on invoice. | [optional] 
**fcp_rate** | **Float** | Fundo de Combate à pobreza / Fund Against Poverty | [optional] 
**icms_st_conf** | [**IcmsConfByStateIcmsSTConf**](IcmsConfByStateIcmsSTConf.md) |  | [optional] 
**icms_inter_state_conf** | [**Array&lt;IcmsConfInterState&gt;**](IcmsConfInterState.md) | the map key is state code | [optional] 
**company_id** | **String** | Company ID | 


