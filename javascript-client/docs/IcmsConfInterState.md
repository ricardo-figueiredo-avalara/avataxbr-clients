# Br16Api.IcmsConfInterState

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**state** | [**StateEnum**](StateEnum.md) |  | [optional] 
**calcMode** | **String** | how this ICMS will be calculed for itens linked to this configuration | [optional] 
**discountRateForMonoPhase** | **Number** | discount if the item is subject to monophase PIS/COFINS when operation interstate | [optional] 
**rate** | **Number** | ICMS rate | [optional] 
**fcpRate** | **Number** | FCP rate (Fundo de Combate à Probreza / Fund Against Poverty | [optional] 
**icmsBaseDiscount** | **Number** | ICMS rate | [optional] 
**msrp** | **Number** | SRP or MMSRP amount base for this icms configuration | [optional] 
**mvaRate** | **Number** | ICMS MVA rate to define calc base | [optional] 
**msrpUnit** | **String** | unit used to SRP amount value | [optional] 
**icmsLegalReason** | **String** | Code for the ICM legal reason, this message will be placed on invoice. | [optional] 
**icmsSTConf** | [**IcmsConfInterStateIcmsSTConf**](IcmsConfInterStateIcmsSTConf.md) |  | [optional] 


<a name="CalcModeEnum"></a>
## Enum: CalcModeEnum


* `BYMVARATE` (value: `"BYMVARATE"`)

* `SRP` (value: `"SRP"`)

* `MMSRP` (value: `"MMSRP"`)

* `OPERATIONAMOUNT` (value: `"OPERATIONAMOUNT"`)




