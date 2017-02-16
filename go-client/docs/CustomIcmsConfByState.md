# CustomIcmsConfByState

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **string** | Identify the IcmsConfState in namespace | [default to null]
**State** | [**StateEnum**](StateEnum.md) |  | [default to null]
**Name** | **string** | name for this configuration | [optional] [default to null]
**StartDate** | [**time.Time**](time.Time.md) | date when this configuration values starts | [optional] [default to null]
**ExpirationDate** | [**time.Time**](time.Time.md) | date when this configuration values expire | [optional] [default to null]
**Inactive** | **bool** | set this configuration to Inactive | [optional] [default to null]
**SubjectToST** | **bool** | inform that the item linked to this configuration is subject to ICMS ST on this state | [optional] [default to null]
**IcmsCST** | **string** | On sales process inform the CST hat the item linked to this configuration is subject to for the own ICMS - &#39;00&#39; # TAXABLE - &#39;20&#39; # TAXABLE WITH BASE DISCOUNT - &#39;40&#39; # EXEMPT - &#39;41&#39; # NOT TAXABLE - &#39;50&#39; # SUSPENDED  | [optional] [default to null]
**CalcMode** | **string** | how this ICMS will be calculed for itens linked to this configuration | [optional] [default to null]
**DiscountRateForMonoPhase** | **float64** | discount if the item is subject to monophase PIS/COFINS for transactions inside state | [optional] [default to null]
**Rate** | **float64** | ICMS rate | [optional] [default to null]
**IcmsBaseDiscount** | **float64** | ICMS rate | [optional] [default to null]
**Msrp** | **float64** | SRP or MMSRP amount base for this icms configuration | [optional] [default to null]
**MvaRate** | **float64** | ICMS mva rate to define calc base | [optional] [default to null]
**MsrpUnit** | **string** | unit used to SRP amount value | [optional] [default to null]
**IcmsLegalReason** | **string** | Code for the ICM legal reason, this message will be placed on invoice. | [optional] [default to null]
**FcpRate** | **float64** | Fundo de Combate à pobreza / Fund Against Poverty | [optional] [default to null]
**IcmsSTConf** | [**IcmsConfByStateIcmsStConf**](IcmsConfByState_icmsSTConf.md) |  | [optional] [default to null]
**IcmsInterStateConf** | [**[]IcmsConfInterState**](IcmsConfInterState.md) | the map key is state code | [optional] [default to null]
**CompanyId** | **string** | Company ID | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


