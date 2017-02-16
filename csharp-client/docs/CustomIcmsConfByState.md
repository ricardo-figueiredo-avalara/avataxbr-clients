# IO.Swagger.Model.CustomIcmsConfByState
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **string** | Identify the IcmsConfState in namespace | 
**State** | [**StateEnum**](StateEnum.md) |  | 
**Name** | **string** | name for this configuration | [optional] 
**StartDate** | **DateTime?** | date when this configuration values starts | [optional] 
**ExpirationDate** | **DateTime?** | date when this configuration values expire | [optional] 
**Inactive** | **bool?** | set this configuration to Inactive | [optional] 
**SubjectToST** | **bool?** | inform that the item linked to this configuration is subject to ICMS ST on this state | [optional] 
**IcmsCST** | **string** | On sales process inform the CST hat the item linked to this configuration is subject to for the own ICMS - &#39;00&#39; # TAXABLE - &#39;20&#39; # TAXABLE WITH BASE DISCOUNT - &#39;40&#39; # EXEMPT - &#39;41&#39; # NOT TAXABLE - &#39;50&#39; # SUSPENDED  | [optional] 
**CalcMode** | **string** | how this ICMS will be calculed for itens linked to this configuration | [optional] 
**DiscountRateForMonoPhase** | **double?** | discount if the item is subject to monophase PIS/COFINS for transactions inside state | [optional] 
**Rate** | **double?** | ICMS rate | [optional] 
**IcmsBaseDiscount** | **double?** | ICMS rate | [optional] 
**Msrp** | **double?** | SRP or MMSRP amount base for this icms configuration | [optional] 
**MvaRate** | **double?** | ICMS mva rate to define calc base | [optional] 
**MsrpUnit** | **string** | unit used to SRP amount value | [optional] 
**IcmsLegalReason** | **string** | Code for the ICM legal reason, this message will be placed on invoice. | [optional] 
**FcpRate** | **double?** | Fundo de Combate à pobreza / Fund Against Poverty | [optional] 
**IcmsSTConf** | [**IcmsConfByStateIcmsSTConf**](IcmsConfByStateIcmsSTConf.md) |  | [optional] 
**IcmsInterStateConf** | [**List&lt;IcmsConfInterState&gt;**](IcmsConfInterState.md) | the map key is state code | [optional] 
**CompanyId** | **Guid?** | Company ID | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

