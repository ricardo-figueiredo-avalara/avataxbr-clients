# Br16Api.IcmsConfByState

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | Identify the IcmsConfState in namespace | 
**state** | [**StateEnum**](StateEnum.md) |  | 
**name** | **String** | name for this configuration | [optional] 
**startDate** | **Date** | date when this configuration values starts | [optional] 
**expirationDate** | **Date** | date when this configuration values expire | [optional] 
**inactive** | **Boolean** | set this configuration to Inactive | [optional] 
**subjectToST** | **Boolean** | inform that the item linked to this configuration is subject to ICMS ST on this state | [optional] 
**icmsCST** | **String** | On sales process inform the CST hat the item linked to this configuration is subject to for the own ICMS - &#39;00&#39; # TAXABLE - &#39;20&#39; # TAXABLE WITH BASE DISCOUNT - &#39;40&#39; # EXEMPT - &#39;41&#39; # NOT TAXABLE - &#39;50&#39; # SUSPENDED  | [optional] 
**calcMode** | **String** | how this ICMS will be calculed for itens linked to this configuration | [optional] 
**discountRateForMonoPhase** | **Number** | discount if the item is subject to monophase PIS/COFINS for transactions inside state | [optional] 
**rate** | **Number** | ICMS rate | [optional] 
**icmsBaseDiscount** | **Number** | ICMS rate | [optional] 
**msrp** | **Number** | SRP or MMSRP amount base for this icms configuration | [optional] 
**mvaRate** | **Number** | ICMS mva rate to define calc base | [optional] 
**msrpUnit** | **String** | unit used to SRP amount value | [optional] 
**icmsLegalReason** | **String** | Code for the ICM legal reason, this message will be placed on invoice. | [optional] 
**fcpRate** | **Number** | Fundo de Combate à pobreza / Fund Against Poverty | [optional] 
**icmsSTConf** | [**IcmsConfByStateIcmsSTConf**](IcmsConfByStateIcmsSTConf.md) |  | [optional] 
**icmsInterStateConf** | [**[IcmsConfInterState]**](IcmsConfInterState.md) | the map key is state code | [optional] 


<a name="IcmsCSTEnum"></a>
## Enum: IcmsCSTEnum


* `00` (value: `"00"`)

* `20` (value: `"20"`)

* `40` (value: `"40"`)

* `41` (value: `"41"`)

* `50` (value: `"50"`)




<a name="CalcModeEnum"></a>
## Enum: CalcModeEnum


* `BYMVARATE` (value: `"BYMVARATE"`)

* `SRP` (value: `"SRP"`)

* `MMSRP` (value: `"MMSRP"`)

* `OPERATIONAMOUNT` (value: `"OPERATIONAMOUNT"`)




