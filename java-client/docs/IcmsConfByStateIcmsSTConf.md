
# IcmsConfByStateIcmsSTConf

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hasReductionOfMVAForSimples** | **Boolean** | inform that substituted is tax regime Simplified the operation MVA will be reduced |  [optional]
**reductionOfMVAForSimples** | **Double** | mva reduction when substituted is tax regime Simplified. |  [optional]
**calcMode** | [**CalcModeEnum**](#CalcModeEnum) | how this ICMS-ST will be calculed for itens linked to this configuration |  [optional]
**mvaRate** | **Double** | ICMS-ST mva rate to define calc base |  [optional]
**icmsStBaseDiscount** | **Double** | ICMS rate - Redução da BC ICMS ST (%) |  [optional]
**srp** | **Double** | SRP or MSRP amount base for this ICMS-ST configuration |  [optional]
**srpUnit** | **String** | unit used to srv amount value |  [optional]


<a name="CalcModeEnum"></a>
## Enum: CalcModeEnum
Name | Value
---- | -----
BYMVARATE | &quot;BYMVARATE&quot;
SRP | &quot;SRP&quot;
MSRP | &quot;MSRP&quot;



