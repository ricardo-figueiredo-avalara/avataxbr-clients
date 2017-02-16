
# IcmsConfInterState

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**state** | [**StateEnum**](StateEnum.md) |  |  [optional]
**calcMode** | [**CalcModeEnum**](#CalcModeEnum) | how this ICMS will be calculed for itens linked to this configuration |  [optional]
**discountRateForMonoPhase** | **Double** | discount if the item is subject to monophase PIS/COFINS when operation interstate |  [optional]
**rate** | **Double** | ICMS rate |  [optional]
**fcpRate** | **Double** | FCP rate (Fundo de Combate à Probreza / Fund Against Poverty |  [optional]
**icmsBaseDiscount** | **Double** | ICMS rate |  [optional]
**msrp** | **Double** | SRP or MMSRP amount base for this icms configuration |  [optional]
**mvaRate** | **Double** | ICMS MVA rate to define calc base |  [optional]
**msrpUnit** | **String** | unit used to SRP amount value |  [optional]
**icmsLegalReason** | **String** | Code for the ICM legal reason, this message will be placed on invoice. |  [optional]
**icmsSTConf** | [**IcmsConfInterStateIcmsSTConf**](IcmsConfInterStateIcmsSTConf.md) |  |  [optional]


<a name="CalcModeEnum"></a>
## Enum: CalcModeEnum
Name | Value
---- | -----



