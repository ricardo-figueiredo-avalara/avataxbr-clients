
# IcmsConfInterStateIcmsSTConf

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**protocolType** | [**ProtocolTypeEnum**](#ProtocolTypeEnum) |  |  [optional]
**hasReductionOfMVAForSimples** | **Boolean** | inform that substituted is tax regime Simplified the operation MVA will be reduced |  [optional]
**reductionOfMVAForSimples** | **Double** | MVA reduction when substituted is tax regime Simplified. |  [optional]
**calcMode** | [**CalcModeEnum**](#CalcModeEnum) | how this ICMS-ST will be calculed for itens linked to this configuration |  [optional]
**icmsStBaseDiscount** | **Double** | ICMS rate - Redução da BC ICMS ST (%) |  [optional]
**mvaRate** | **Double** | ICMS-ST MVA rate to define calc base |  [optional]
**srp** | **Double** | SRP or MSRP amount base for this ICMS-ST configuration |  [optional]
**srpUnit** | **String** | unit used to SRP amount value |  [optional]


<a name="ProtocolTypeEnum"></a>
## Enum: ProtocolTypeEnum
Name | Value
---- | -----
COVENANT | &quot;COVENANT&quot;
PROTOCOL | &quot;PROTOCOL&quot;
NOTHING | &quot;NOTHING&quot;


<a name="CalcModeEnum"></a>
## Enum: CalcModeEnum
Name | Value
---- | -----
BYMVARATE | &quot;BYMVARATE&quot;
SRP | &quot;SRP&quot;
MSRP | &quot;MSRP&quot;



