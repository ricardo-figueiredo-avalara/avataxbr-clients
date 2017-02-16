# SWGCustomIcmsConfByState

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **NSString*** | Identify the IcmsConfState in namespace | 
**state** | [**SWGStateEnum***](SWGStateEnum.md) |  | 
**name** | **NSString*** | name for this configuration | [optional] 
**startDate** | **NSDate*** | date when this configuration values starts | [optional] 
**expirationDate** | **NSDate*** | date when this configuration values expire | [optional] 
**inactive** | **NSNumber*** | set this configuration to Inactive | [optional] 
**subjectToST** | **NSNumber*** | inform that the item linked to this configuration is subject to ICMS ST on this state | [optional] 
**icmsCST** | **NSString*** | On sales process inform the CST hat the item linked to this configuration is subject to for the own ICMS - &#39;00&#39; # TAXABLE - &#39;20&#39; # TAXABLE WITH BASE DISCOUNT - &#39;40&#39; # EXEMPT - &#39;41&#39; # NOT TAXABLE - &#39;50&#39; # SUSPENDED  | [optional] 
**calcMode** | **NSString*** | how this ICMS will be calculed for itens linked to this configuration | [optional] 
**discountRateForMonoPhase** | **NSNumber*** | discount if the item is subject to monophase PIS/COFINS for transactions inside state | [optional] 
**rate** | **NSNumber*** | ICMS rate | [optional] 
**icmsBaseDiscount** | **NSNumber*** | ICMS rate | [optional] 
**msrp** | **NSNumber*** | SRP or MMSRP amount base for this icms configuration | [optional] 
**mvaRate** | **NSNumber*** | ICMS mva rate to define calc base | [optional] 
**msrpUnit** | **NSString*** | unit used to SRP amount value | [optional] 
**icmsLegalReason** | **NSString*** | Code for the ICM legal reason, this message will be placed on invoice. | [optional] 
**fcpRate** | **NSNumber*** | Fundo de Combate à pobreza / Fund Against Poverty | [optional] 
**icmsSTConf** | [**SWGIcmsConfByStateIcmsSTConf***](SWGIcmsConfByStateIcmsSTConf.md) |  | [optional] 
**icmsInterStateConf** | [**NSArray&lt;SWGIcmsConfInterState&gt;***](SWGIcmsConfInterState.md) | the map key is state code | [optional] 
**companyId** | **NSString*** | Company ID | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


